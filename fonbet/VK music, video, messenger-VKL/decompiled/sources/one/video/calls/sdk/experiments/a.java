package one.video.calls.sdk.experiments;

import android.content.Context;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import one.video.calls.sdk.experiments.c;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.webrtc.utils.MiscHelper;
import xsna.brm0;
import xsna.j5g;
import xsna.n6j;
import xsna.qcy;

/* compiled from: ExperimentsManager.kt */
/* loaded from: classes8.dex */
public final class a {
    public final c a;
    public final Context b;

    public a(c cVar, Context context) {
        this.a = cVar;
        this.b = context;
    }

    public final void a(String str, boolean z) {
        Collection collection;
        int parseInt;
        boolean z2;
        boolean z3;
        c cVar = this.a;
        if (z) {
            c.a aVar = cVar.h;
            qcy<Object> qcyVar = c.j0[6];
            aVar.b(Boolean.TRUE);
            GlobalRTCLogger.log("ExperimentsManager", "Vmoji backend render enabled for all");
            return;
        }
        if (str == null) {
            return;
        }
        int[] samsungOneUIVersion = MiscHelper.getSamsungOneUIVersion(this.b);
        if (samsungOneUIVersion == null || samsungOneUIVersion.length != 2) {
            GlobalRTCLogger.log("ExperimentsManager", "Not a OneUi, will not enable backend rendering");
            return;
        }
        boolean z4 = false;
        List a = n6j.a(0, "\\.", str);
        if (!a.isEmpty()) {
            ListIterator listIterator = a.listIterator(a.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collection = j5g.H0(a, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = EmptyList.b;
        String[] strArr = (String[]) collection.toArray(new String[0]);
        if (strArr.length != 2) {
            GlobalRTCLogger.log("ExperimentsManager", "Unexpected OneUI version format ".concat(str));
            return;
        }
        try {
            int parseInt2 = Integer.parseInt(strArr[0]);
            if (brm0.v(strArr[1], "+", false)) {
                String str2 = strArr[1];
                parseInt = Integer.parseInt(str2.substring(0, str2.length() - 1));
                z2 = false;
            } else {
                parseInt = Integer.parseInt(strArr[1]);
                z2 = true;
            }
            if (z2) {
                if (samsungOneUIVersion[0] == parseInt2 && samsungOneUIVersion[1] == parseInt) {
                    z4 = true;
                }
                c.a aVar2 = cVar.h;
                qcy<Object> qcyVar2 = c.j0[6];
                aVar2.b(Boolean.valueOf(z4));
                GlobalRTCLogger.log("ExperimentsManager", "Vmoji backend render enabled for OneUi exactly of version " + parseInt2 + "." + parseInt);
                return;
            }
            int i = samsungOneUIVersion[0];
            if (i <= parseInt2 && (i != parseInt2 || samsungOneUIVersion[1] < parseInt)) {
                z3 = false;
                c.a aVar3 = cVar.h;
                qcy<Object> qcyVar3 = c.j0[6];
                aVar3.b(Boolean.valueOf(z3));
                GlobalRTCLogger.log("ExperimentsManager", "Vmoji backend render enabled for OneUi of version at least " + parseInt2 + "." + parseInt + ", actual version is " + samsungOneUIVersion[0] + "." + samsungOneUIVersion[1]);
            }
            z3 = true;
            c.a aVar32 = cVar.h;
            qcy<Object> qcyVar32 = c.j0[6];
            aVar32.b(Boolean.valueOf(z3));
            GlobalRTCLogger.log("ExperimentsManager", "Vmoji backend render enabled for OneUi of version at least " + parseInt2 + "." + parseInt + ", actual version is " + samsungOneUIVersion[0] + "." + samsungOneUIVersion[1]);
        } catch (NumberFormatException unused) {
            GlobalRTCLogger.log("ExperimentsManager", "Unexpected OneUI version format: ".concat(str));
        }
    }
}
