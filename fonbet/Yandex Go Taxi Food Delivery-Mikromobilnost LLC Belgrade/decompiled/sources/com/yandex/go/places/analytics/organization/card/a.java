package com.yandex.go.places.analytics.organization.card;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.dwj;
import defpackage.ewj;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.lg80;
import defpackage.lx4;
import defpackage.oy;
import defpackage.qi80;
import defpackage.ri80;
import defpackage.si80;
import defpackage.ti80;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wbc0;
import defpackage.xz4;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Pair;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes13.dex */
public final class a extends xz4 {
    public final hit c;
    public final tt2 w;
    public final oy x;
    public final LinkedHashSet y;

    public a(lx4 lx4Var, wbc0 wbc0Var, hit hitVar, tt2 tt2Var, oy oyVar) {
        super(lx4Var, wbc0Var);
        this.c = hitVar;
        this.w = tt2Var;
        this.x = oyVar;
        this.y = new LinkedHashSet();
    }

    public final void m(ti80 ti80Var, lg80 lg80Var) {
        Pair pair;
        if (ti80Var instanceof qi80) {
            pair = new Pair(null, ((qi80) ti80Var).a);
        } else if (ti80Var instanceof ri80) {
            pair = new Pair(((ri80) ti80Var).a, null);
        } else if (!(ti80Var instanceof si80)) {
            w511.b();
            return;
        } else {
            si80 si80Var = (si80) ti80Var;
            pair = new Pair(si80Var.a, si80Var.b);
        }
        k(new dwj((String) pair.getFirst(), (String) pair.getSecond(), lg80Var, 0), "Discovery.OrganisationCard.Tapped");
    }

    public final void n(ti80 ti80Var, lg80 lg80Var) {
        Pair pair;
        if (ti80Var instanceof qi80) {
            pair = new Pair(null, ((qi80) ti80Var).a);
        } else if (ti80Var instanceof ri80) {
            pair = new Pair(((ri80) ti80Var).a, null);
        } else if (!(ti80Var instanceof si80)) {
            w511.b();
            return;
        } else {
            si80 si80Var = (si80) ti80Var;
            pair = new Pair(si80Var.a, si80Var.b);
        }
        String str = (String) pair.getFirst();
        String str2 = (String) pair.getSecond();
        i d = ((j) ((lx4) this.a)).d("Discovery.OrganisationCard.LoadingFailed");
        LinkedHashMap linkedHashMap = d.a;
        if (str != null) {
            linkedHashMap.put(LaunchBrowserActivity.KEY_URI, str);
        }
        if (str2 != null) {
            linkedHashMap.put("oid", str2);
        }
        d.d("mode", lg80Var.b());
        d.d("source", ((wbc0) this.b).a().a());
        d.m();
    }

    public final void o(ti80 ti80Var, lg80 lg80Var) {
        Pair pair;
        if (ti80Var instanceof qi80) {
            pair = new Pair(null, ((qi80) ti80Var).a);
        } else if (ti80Var instanceof ri80) {
            pair = new Pair(((ri80) ti80Var).a, null);
        } else if (!(ti80Var instanceof si80)) {
            w511.b();
            return;
        } else {
            si80 si80Var = (si80) ti80Var;
            pair = new Pair(si80Var.a, si80Var.b);
        }
        String str = (String) pair.getFirst();
        String str2 = (String) pair.getSecond();
        i d = ((j) ((lx4) this.a)).d("Discovery.OrganisationCard.RetryTapped");
        LinkedHashMap linkedHashMap = d.a;
        if (str != null) {
            linkedHashMap.put(LaunchBrowserActivity.KEY_URI, str);
        }
        if (str2 != null) {
            linkedHashMap.put("oid", str2);
        }
        d.d("mode", lg80Var.b());
        d.d("source", ((wbc0) this.b).a().a());
        d.m();
    }

    public final void p(ti80 ti80Var, lg80 lg80Var, String str) {
        Pair pair;
        if (ti80Var == null) {
            return;
        }
        if (ti80Var instanceof qi80) {
            pair = new Pair(null, ((qi80) ti80Var).a);
        } else if (ti80Var instanceof ri80) {
            pair = new Pair(((ri80) ti80Var).a, null);
        } else if (!(ti80Var instanceof si80)) {
            w511.b();
            return;
        } else {
            si80 si80Var = (si80) ti80Var;
            pair = new Pair(si80Var.a, si80Var.b);
        }
        String str2 = (String) pair.getFirst();
        String str3 = (String) pair.getSecond();
        if (this.y.add(new ewj(str3, str3 == null ? str2 : null, lg80Var != null ? lg80Var.b() : null, str))) {
            hbp0 hbp0Var = this.c.a;
            this.w.getClass();
            tje.N(hbp0Var, uyj.a, null, new DiscoveryOrganizationsCardAnalytics$reportStateEventOnce$1(this, str, str2, str3, lg80Var, null), 2);
        }
    }
}
