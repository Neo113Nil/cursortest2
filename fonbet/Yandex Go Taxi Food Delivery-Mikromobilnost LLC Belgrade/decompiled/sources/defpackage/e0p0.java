package defpackage;

import java.util.HashMap;

/* loaded from: classes12.dex */
public final class e0p0 implements b5v0 {
    public final qxm0 a;

    public e0p0(qxm0 qxm0Var) {
        this.a = qxm0Var;
    }

    @Override // defpackage.b5v0
    public final void A(String str, String str2, String str3, String str4, long j) {
        qxm0 qxm0Var = this.a;
        HashMap p = tse0.p(qxm0Var);
        if (str2 != null) {
            p.put("address_search", str2);
        }
        if (str3 != null) {
            p.put("suggest_serpid", str3);
        }
        p.put("event_milli_timestamp", Long.valueOf(j));
        p.put("client_reqid", str);
        if (str4 != null) {
            p.put("MainScreenVersion", str4);
        }
        qxm0Var.a.a("Scooters.AddressSearch.SuggestFormClose", p, 1, new HashMap());
    }

    @Override // defpackage.b5v0
    public final void k(String str, String str2, String str3, String str4, long j) {
        qxm0 qxm0Var = this.a;
        HashMap p = tse0.p(qxm0Var);
        if (str2 != null) {
            p.put("address_search", str2);
        }
        if (str3 != null) {
            p.put("suggest_serpid", str3);
        }
        p.put("event_milli_timestamp", Long.valueOf(j));
        p.put("client_reqid", str);
        if (str4 != null) {
            p.put("MainScreenVersion", str4);
        }
        qxm0Var.a.a("Scooters.AddressSearch.SuggestFormHideKeyboard", p, 1, new HashMap());
    }

    @Override // defpackage.b5v0
    public final void n(String str, String str2, String str3, String str4, long j) {
        qxm0 qxm0Var = this.a;
        HashMap p = tse0.p(qxm0Var);
        if (str2 != null) {
            p.put("address_search", str2);
        }
        if (str3 != null) {
            p.put("suggest_serpid", str3);
        }
        p.put("event_milli_timestamp", Long.valueOf(j));
        p.put("client_reqid", str);
        if (str4 != null) {
            p.put("MainScreenVersion", str4);
        }
        qxm0Var.a.a("Scooters.AddressSearch.SuggestDotsTap", p, 1, new HashMap());
    }

    @Override // defpackage.b5v0
    public final void p(String str, String str2, String str3, String str4, long j) {
        qxm0 qxm0Var = this.a;
        HashMap p = tse0.p(qxm0Var);
        if (str2 != null) {
            p.put("address_search", str2);
        }
        if (str3 != null) {
            p.put("suggest_serpid", str3);
        }
        p.put("event_milli_timestamp", Long.valueOf(j));
        p.put("client_reqid", str);
        if (str4 != null) {
            p.put("MainScreenVersion", str4);
        }
        qxm0Var.a.a("Scooters.AddressSearch.FullscreenSuggestOpenPickup", p, 1, new HashMap());
    }
}
