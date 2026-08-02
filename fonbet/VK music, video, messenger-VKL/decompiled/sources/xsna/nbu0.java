package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import xsna.l23;

/* compiled from: VkAsyncLayoutInflater.kt */
/* loaded from: classes17.dex */
public final class nbu0 {
    public final Context a;
    public final io.reactivex.rxjava3.core.w b;

    public nbu0(Context context, io.reactivex.rxjava3.core.w wVar) {
        this.a = context;
        this.b = wVar;
    }

    public final io.reactivex.rxjava3.disposables.c a(int i, ViewGroup viewGroup, izs<? super View, s3q0> izsVar) {
        Activity h = e3m.h(this.a);
        if (h == null) {
            throw new IllegalArgumentException("Don't use it with non activity context!");
        }
        l23.c cVar = l23.b;
        o23 o23Var = new o23(h, null, null, h);
        dhr0.a.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.e0(new io.reactivex.rxjava3.internal.operators.single.v(new d3d(new jbu0(new MutableContextWrapper(dhr0.E()), i, viewGroup, o23Var), 1)).q(this.b).m(asu0.a.d()).l(new aad0(new xim0(this, 12), 15)), new t9c0(11, new kbu0(this, i, viewGroup))).subscribe(new whm0(izsVar, 9));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nbu0(Context context) {
        this(context, asu0.i());
        asu0.a.getClass();
    }
}
