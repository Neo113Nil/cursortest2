package xsna;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.txo;

/* compiled from: EcosystemMultiAccountRenderer.kt */
/* loaded from: classes6.dex */
public final class qxo implements gm50 {
    public final txo b;
    public final View c;
    public final txo.c d;
    public final jzq0 e;
    public final o340 f;
    public final r340 g = new r340(r340.c);
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public qxo(txo txoVar, View view, txo.c cVar, jzq0 jzq0Var) {
        this.b = txoVar;
        this.c = view;
        this.d = cVar;
        this.e = jzq0Var;
        this.f = new o340(new pxo(this), jzq0Var);
        y3i y3iVar = new y3i(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = msy.a(lazyThreadSafetyMode, y3iVar);
        this.i = msy.a(lazyThreadSafetyMode, new x5i(this, 12));
        this.j = msy.a(lazyThreadSafetyMode, new xqf(this, 17));
        Lazy a = msy.a(lazyThreadSafetyMode, new sje(this, 23));
        this.k = a;
        this.l = msy.a(lazyThreadSafetyMode, new cwg(this, 14));
        this.m = msy.a(lazyThreadSafetyMode, new z3i(this, 11));
        ShimmerFrameLayout b = b();
        Context context = view.getContext();
        Shimmer.c c = new Shimmer.c().c(false);
        c.k(e3m.f(R.attr.vk_ui_transparent_active, context));
        Shimmer.c d = c.d(0.08f);
        d.a.d = e3m.f(R.attr.vk_ui_transparent_hover, context);
        b.b(d.h(0.2f).a());
        ((Button) a.getValue()).setOnClickListener(new wcd(this, 3));
    }

    public final void a(boolean z) {
        boolean z2 = !z;
        txo txoVar = this.b;
        txoVar.An(z2);
        Dialog dialog = txoVar.s;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(z2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ShimmerFrameLayout b() {
        return (ShimmerFrameLayout) this.m.getValue();
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
