package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Size;
import com.vkontakte.android.R;
import kotlin.Lazy;
import xsna.e3m;
import xsna.mny;

/* compiled from: CameraDelegateHelper.kt */
/* loaded from: classes16.dex */
public final class lh9 {
    public final v76 a;
    public final u440 b;
    public final vf6 c;
    public final Object d;

    public lh9(v76 v76Var, u440 u440Var, vf6 vf6Var, Lazy lazy) {
        this.a = v76Var;
        this.b = u440Var;
        this.c = vf6Var;
        this.d = lazy;
    }

    public static void d(lh9 lh9Var, Bitmap bitmap) {
        vf6 vf6Var = lh9Var.c;
        u440 u440Var = lh9Var.b;
        tam0 tam0Var = u440Var.B0;
        mny.a aVar = mny.a;
        Bitmap e = vf6Var.e(tam0Var, bitmap, null);
        if (e != null) {
            gyl0 gyl0Var = u440Var.p;
            if (gyl0Var != null) {
                gyl0Var.K3(e, true);
            }
            gyl0 gyl0Var2 = u440Var.p;
            if (gyl0Var2 != null) {
                gyl0Var2.L5(e);
            }
            u440Var.N7(e);
            tam0 tam0Var2 = u440Var.B0;
            if (tam0Var2 != null) {
                tam0Var2.t = e;
            }
        }
    }

    public final Size a() {
        v76 v76Var = this.a;
        return new Size(v76Var.getLayoutWidth(), v76Var.getLayoutHeight());
    }

    public final void b(String str, izs<? super Bitmap, s3q0> izsVar) {
        if (!mcr0.p(str)) {
            c(str, izsVar);
            return;
        }
        Bitmap k = mcr0.k(str);
        if (k == null) {
            c(str, izsVar);
        } else {
            izsVar.invoke(k);
        }
    }

    public final void c(String str, izs<? super Bitmap, s3q0> izsVar) {
        v76 v76Var = this.a;
        Context requireContext = v76Var.getRequireContext();
        e3m.a aVar = e3m.a;
        v76Var.setBackgroundImageColor(requireContext.getColor(R.color.vk_gray_700));
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = mcr0.h(Uri.parse(str)).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        el6 el6Var = new el6(new jh9(izsVar, 0), 5);
        int i = kwg0.a;
        this.b.a(a0.subscribe(el6Var, new iwg0()));
    }
}
