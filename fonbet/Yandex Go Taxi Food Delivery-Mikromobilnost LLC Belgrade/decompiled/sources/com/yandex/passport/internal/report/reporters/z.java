package com.yandex.passport.internal.report.reporters;

import android.app.ApplicationExitInfo;
import com.yandex.passport.internal.methods.l3;
import defpackage.evu0;
import defpackage.fd20;
import defpackage.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class z extends l3 {
    public final com.yandex.passport.internal.features.a b;

    public z(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar) {
        super(jVar);
        this.b = aVar;
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.D.getValue(aVar, com.yandex.passport.internal.features.a.J[27])).booleanValue();
    }

    public final void j(String str, List list) {
        Object obj;
        Object obj2;
        int reason;
        String str2;
        String description;
        long timestamp;
        String processName;
        String processName2;
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            processName2 = mh.g(obj2).getProcessName();
            if (evu0.y(processName2, str, false)) {
                break;
            }
        }
        ApplicationExitInfo g = mh.g(obj2);
        if (g == null) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                processName = mh.g(next).getProcessName();
                if (!evu0.z(processName, ':')) {
                    obj = next;
                    break;
                }
            }
            g = mh.g(obj);
        }
        if (g != null) {
            g.getTimestamp();
            fd20 fd20Var = com.yandex.passport.internal.report.l0.B;
            ArrayList arrayList = new ArrayList();
            reason = g.getReason();
            switch (reason) {
                case 1:
                    str2 = "EXIT_SELF";
                    break;
                case 2:
                    str2 = "SIGNALED";
                    break;
                case 3:
                    str2 = "LOW_MEMORY";
                    break;
                case 4:
                    str2 = "APP CRASH(EXCEPTION)";
                    break;
                case 5:
                    str2 = "APP CRASH(NATIVE)";
                    break;
                case 6:
                    str2 = "ANR";
                    break;
                case 7:
                    str2 = "INITIALIZATION FAILURE";
                    break;
                case 8:
                    str2 = "PERMISSION CHANGE";
                    break;
                case 9:
                    str2 = "EXCESSIVE RESOURCE USAGE";
                    break;
                case 10:
                    str2 = "USER REQUESTED";
                    break;
                case 11:
                    str2 = "USER STOPPED";
                    break;
                case 12:
                    str2 = "DEPENDENCY DIED";
                    break;
                case 13:
                    str2 = "OTHER KILLS BY SYSTEM";
                    break;
                case 14:
                    str2 = "FREEZER";
                    break;
                case 15:
                    str2 = "STATE CHANGE";
                    break;
                case 16:
                    str2 = "PACKAGE UPDATED";
                    break;
                default:
                    str2 = "UNKNOWN";
                    break;
            }
            arrayList.add(new com.yandex.passport.internal.report.c(str2, 3));
            description = g.getDescription();
            if (description != null) {
                arrayList.add(new com.yandex.passport.internal.report.c(description, 2));
            }
            timestamp = g.getTimestamp();
            arrayList.add(new com.yandex.passport.internal.report.c(timestamp));
            e(fd20Var, arrayList);
        }
    }
}
