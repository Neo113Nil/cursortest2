package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes5.dex */
public final class ai50 {
    public final wiq0 a;
    public final lx4 b;

    public ai50(wiq0 wiq0Var, lx4 lx4Var) {
        this.a = wiq0Var;
        this.b = lx4Var;
    }

    public static String a(boolean z) {
        return z ? "drop_off_point" : "pick_up_point";
    }

    public static void b(w3j0 w3j0Var, d43 d43Var) {
        w3j0Var.e("top_left", scc.g(Double.valueOf(d43Var.b.a), Double.valueOf(d43Var.b.b)));
        zzs zzsVar = d43Var.c;
        w3j0Var.e("bottom_right", scc.g(Double.valueOf(zzsVar.a), Double.valueOf(zzsVar.b)));
        zzs zzsVar2 = d43Var.a;
        w3j0Var.a.put("center_coordinate", scc.g(Double.valueOf(zzsVar2.a), Double.valueOf(zzsVar2.b)));
    }

    public static String d(ji50 ji50Var) {
        if (ji50Var instanceof gi50) {
            return Constants.DEEPLINK;
        }
        if (ji50Var instanceof ii50) {
            return "summary";
        }
        if (ji50Var instanceof hi50) {
            return "ndd_form";
        }
        w511.b();
        return null;
    }

    public final void c(tls tlsVar, String str) {
        w3j0 w3j0Var = (w3j0) tlsVar.invoke(((j) this.b).d(str));
        pex0 m = ((k) this.a).m();
        w3j0Var.a.put(ClidProvider.STATE, m != null ? m.b : null);
        w3j0Var.m();
    }
}
