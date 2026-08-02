package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class a301 {
    public final c151 a;
    public final s55 b;
    public final n17 c;
    public final sw00 d;

    public a301(c151 c151Var, s55 s55Var, n17 n17Var, sw00 sw00Var) {
        this.a = c151Var;
        this.b = s55Var;
        this.c = n17Var;
        this.d = sw00Var;
    }

    public final void a(w201 w201Var, String str, m601 m601Var, String str2) {
        hlx0 a = this.b.a(w201Var, str, m601Var, str2);
        boolean l = jl40.l(m601Var, l601.a);
        c151 c151Var = this.a;
        if (l) {
            s351 s351Var = c151Var.f;
            q351 v = a.v();
            s351Var.getClass();
            Map a2 = s351.a(v);
            yxe0 yxe0Var = c151Var.c;
            String w = a.w();
            String alias = c151Var.e.a.getAlias();
            String typeIdentifier = a.y().getTypeIdentifier();
            yxe0.b(yxe0Var, null, a.t(), alias, null, null, w, null, a2, a.x(), typeIdentifier, 181);
        } else {
            if (!(m601Var instanceof k601)) {
                w511.b();
                return;
            }
            c151Var.getClass();
            d380 d380Var = (d380) a.R(a.v().b());
            if (d380Var != null) {
                xxe0 xxe0Var = c151Var.d;
                String w2 = a.w();
                String t = a.t();
                String b = d380Var.b();
                String c = d380Var.c();
                String d = d380Var.d();
                List a3 = d380Var.a();
                if (a3.isEmpty()) {
                    a3 = null;
                }
                List list = a3;
                xxe0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("open_from_screen_type", w2);
                if (t != null) {
                    hashMap.put("button_name", t);
                }
                if (b != null) {
                    hashMap.put("order_id", b);
                }
                if (c != null) {
                    hashMap.put(Constants.KEY_SERVICE, c);
                }
                if (d != null) {
                    hashMap.put("order_status", d);
                }
                if (list != null) {
                    hashMap.put("button_list", list);
                }
                xxe0Var.a.a("PreviewOrderDetails.Tapped", hashMap, 1, new HashMap());
            } else {
                jst.e.c("list of OrderParams is empty");
            }
        }
        boolean z = w201Var instanceof pu6;
        sw00 sw00Var = this.d;
        if (z) {
            String w3 = a.w();
            String x = a.x();
            String t2 = a.t();
            ru.yandex.taxi.order.analytics.marknotify.a aVar = (ru.yandex.taxi.order.analytics.marknotify.a) sw00Var;
            aVar.getClass();
            aVar.a(w3, new oo70(ru.cprocsp.NGate.tools.Constants.VPN_TRAFFIC, null, x, t2, null, null, UUID.randomUUID().toString()));
            return;
        }
        d380 d380Var2 = (d380) a.R(a.v().b());
        if (d380Var2 == null) {
            jst.e.c("list of OrderParams is empty");
            return;
        }
        String w4 = a.w();
        String x2 = a.x();
        String t3 = a.t();
        String b2 = d380Var2.b();
        String c2 = d380Var2.c();
        String d2 = d380Var2.d();
        ru.yandex.taxi.order.analytics.marknotify.a aVar2 = (ru.yandex.taxi.order.analytics.marknotify.a) sw00Var;
        aVar2.getClass();
        aVar2.a(w4, new oo70(72, c2, x2, t3, b2, d2, UUID.randomUUID().toString()));
    }
}
