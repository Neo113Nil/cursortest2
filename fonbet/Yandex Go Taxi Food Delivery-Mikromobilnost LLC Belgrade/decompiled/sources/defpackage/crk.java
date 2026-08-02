package defpackage;

import android.view.View;
import com.yandex.div.core.c;
import com.yandex.div2.DivBorder;

/* loaded from: classes.dex */
public final class crk {
    public final c a;

    public crk(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(aw5 aw5Var, DivBorder divBorder, View view) {
        if (view instanceof ugk) {
            ((ugk) view).setBorder(aw5Var, divBorder, view);
            return;
        }
        float f = 0.0f;
        if (divBorder != null && !b(divBorder) && ((Boolean) divBorder.c.a(aw5Var.b)).booleanValue() && divBorder.d == null) {
            f = view.getResources().getDimension(vsg0.div_shadow_elevation);
        }
        view.setElevation(f);
    }

    public static boolean b(DivBorder divBorder) {
        if (divBorder == null) {
            return true;
        }
        return divBorder.a == null && divBorder.b == null && jl40.l(divBorder.c, new kvo(Boolean.FALSE)) && divBorder.d == null && divBorder.e == null;
    }
}
