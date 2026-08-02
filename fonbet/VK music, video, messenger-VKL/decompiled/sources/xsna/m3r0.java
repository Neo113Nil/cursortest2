package xsna;

import android.content.Context;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vkontakte.android.R;
import java.util.List;
import xsna.it80;

/* compiled from: Utils.kt */
/* loaded from: classes6.dex */
public final class m3r0 {
    public static final float[] a = new float[3];

    public static Shimmer a(int i, Context context) {
        int a2 = iah0.a(200);
        int a3 = iah0.a(20);
        int f = e3m.f(R.attr.vk_ui_skeleton_to, context);
        Shimmer.c cVar = (Shimmer.c) new Shimmer.c().c(false).j();
        cVar.k(i);
        cVar.a.d = f;
        return cVar.d(1.0f).g(a2).f(a3).a();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static int b(int i, List list) {
        if (list.isEmpty()) {
            return i;
        }
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        gfx0Var.getClass();
        ?? M = dhr0.M();
        return ((Number) ((M < 0 || M >= list.size()) ? Integer.valueOf(i) : list.get(M == true ? 1 : 0))).intValue();
    }

    public static io.reactivex.rxjava3.core.q c(Context context) {
        if (context != null) {
            sex0 sex0Var = e370.l;
            if (sex0Var == null) {
                sex0Var = null;
            }
            sex0Var.getClass();
            if (oxz.f(context)) {
                sex0 sex0Var2 = e370.l;
                return new io.reactivex.rxjava3.internal.operators.observable.p1((sex0Var2 != null ? sex0Var2 : null).h(context).U(new hi70(new wql0(7), 10)).U(new oe40(new j6e0(16), 15)), new i4f0(new lcq0(2), 7));
            }
        }
        it80.b.getClass();
        return io.reactivex.rxjava3.core.q.T(it80.a.a());
    }
}
