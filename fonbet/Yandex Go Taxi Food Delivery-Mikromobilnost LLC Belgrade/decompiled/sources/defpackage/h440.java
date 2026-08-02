package defpackage;

import android.content.Context;
import com.yandex.go.design.compose.button.ButtonStyle;
import java.util.Map;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.taxi.masstransit.model.RouteType;
import ru.yandex.taxi.masstransit.model.VariantStyle;

/* loaded from: classes6.dex */
public final class h440 {
    public final Context a;
    public final zuj0 b;
    public final cjw0 c;
    public final pdc d;

    public h440(Context context, zuj0 zuj0Var, cjw0 cjw0Var, pdc pdcVar) {
        this.a = context;
        this.b = zuj0Var;
        this.c = cjw0Var;
        this.d = pdcVar;
    }

    public final tdu a(String str, i440 i440Var) {
        zuj0 zuj0Var = this.b;
        if (i440Var == null) {
            return new tdu(str, ((avj0) zuj0Var).h(kyh0.mt_stop_default_name), null, null, 12);
        }
        return new tdu(str, ((avj0) zuj0Var).h(kyh0.mt_stop_default_name), i440Var.b, null, 8);
    }

    public final gd30 b(z340 z340Var) {
        String h;
        boolean z = z340Var instanceof w340;
        zuj0 zuj0Var = this.b;
        if (z) {
            h = ((avj0) zuj0Var).h(kyh0.mt_refreshing);
        } else {
            h = ((avj0) zuj0Var).h(kyh0.mt_try_refresh);
        }
        return new gd30(h, c140.a, !z, z, null, ButtonStyle.Main, 80);
    }

    public final kdc c(MtTransportType mtTransportType, k110 k110Var) {
        Map b;
        VariantStyle variantStyle;
        kdc b2 = ((ufu) this.d).b((k110Var == null || (b = k110Var.b()) == null || (variantStyle = (VariantStyle) b.get(mtTransportType.getMapkitType())) == null) ? null : variantStyle.a);
        if (b2 != null) {
            return b2;
        }
        uel0 uel0Var = RouteType.Companion;
        String mapkitType = mtTransportType.getMapkitType();
        uel0Var.getClass();
        return new gdc(cua1.c(uel0.a(mapkitType)));
    }
}
