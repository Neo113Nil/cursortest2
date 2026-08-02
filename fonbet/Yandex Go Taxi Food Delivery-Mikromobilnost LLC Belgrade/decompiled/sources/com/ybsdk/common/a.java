package com.ybsdk.common;

import com.ybsdk.common.repositiories.auth.g;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.btc;
import defpackage.eja1;
import defpackage.fcy0;
import defpackage.mu31;
import defpackage.tcc;
import defpackage.tje;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class a {
    public final AppAnalyticsReporter a;
    public final g b;
    public final mu31 c;
    public final ArrayList d = new ArrayList();
    public final Object e = new Object();

    public a(AppAnalyticsReporter appAnalyticsReporter, g gVar, mu31 mu31Var) {
        this.a = appAnalyticsReporter;
        this.b = gVar;
        this.c = mu31Var;
    }

    public final void a() {
        tje.N(eja1.s(this.c.a), null, null, new CommunicationsShownInfoStorageImpl$collectNeedToClearCommunicationsFlow$1(this, null), 3);
    }

    public final List b() {
        List J0;
        synchronized (this.e) {
            try {
                fcy0 fcy0Var = this.a.m0;
                ArrayList arrayList = this.d;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((btc) it.next()).toString());
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put("items", arrayList2);
                fcy0Var.a.a("tech.communications_shown_info.get", linkedHashMap);
                J0 = kotlin.collections.a.J0(this.d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return J0;
    }

    public final void c(btc btcVar) {
        synchronized (this.e) {
            this.d.add(btcVar);
        }
    }
}
