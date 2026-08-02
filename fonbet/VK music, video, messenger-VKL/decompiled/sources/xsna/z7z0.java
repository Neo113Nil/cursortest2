package xsna;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.b5z0;
import xsna.exy0;
import xsna.ov50;
import xsna.w5z0.a;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class z7z0 implements exy0.a {
    public final x1z0 b;
    public final izy0 c;
    public final suy0 d;
    public final oaz0 e;
    public final kly0 f;
    public final b5z0.a g;
    public final x7z0 h;
    public final w5z0 i;
    public final dd6 j = new dd6(this, 13);
    public final p01 k = new p01(this, 20);
    public ubz0 l;
    public boolean m;

    public z7z0(x1z0 x1z0Var, b5z0.a aVar) {
        this.g = aVar;
        this.b = x1z0Var;
        wty0 wty0Var = x1z0Var.L;
        w5z0 w5z0Var = new w5z0(wty0Var, null, aVar);
        if (wty0Var != null) {
            w5z0Var.h = w5z0Var.new a();
        }
        this.i = w5z0Var;
        this.c = new izy0(x1z0Var.b, x1z0Var.a, true, false, null, x1z0Var.b0);
        e5z0 e5z0Var = x1z0Var.a;
        this.d = suy0.a(e5z0Var, null);
        this.e = new oaz0(e5z0Var);
        this.h = new x7z0(this);
        this.f = kly0.g(e5z0Var.c(1), e5z0Var.c(2), x1z0Var.b0, null);
    }

    public static void a(View.OnClickListener onClickListener, View view) {
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    @Override // xsna.exy0.a
    public final void b() {
        b5z0.a aVar = this.g;
        b5z0 b5z0Var = aVar.b;
        ov50 ov50Var = aVar.c;
        ov50.a aVar2 = ov50Var.j;
        if (aVar2 == null) {
            b5z0Var.f();
            gu8.c(null, "NativeBannerAdEngine: there is no NativeBannerAdChoicesOptionListener, default behaviour for closing the ad.");
        } else if (!aVar2.e()) {
            gu8.c(null, "NativeBannerAdEngine: Ad shouldn't close automatically.");
            aVar2.q(ov50Var);
        } else {
            b5z0Var.f();
            aVar2.n(ov50Var);
            gu8.c(null, "NativeBannerAdEngine: Ad should close automatically.");
        }
    }

    public static void b(ubz0 ubz0Var, dd6 dd6Var, p01 p01Var) {
        ArrayList b = ubz0Var.b();
        if (b != null && !b.isEmpty()) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                a(dd6Var, (View) it.next());
            }
            a(p01Var, ubz0Var.c());
            return;
        }
        Iterator it2 = ubz0Var.f().iterator();
        while (it2.hasNext()) {
            a(dd6Var, (View) it2.next());
        }
        WeakReference weakReference = ubz0Var.j;
        a(dd6Var, weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = ubz0Var.i;
        a(dd6Var, weakReference2 != null ? (View) weakReference2.get() : null);
        a(dd6Var, ubz0Var.d());
        WeakReference weakReference3 = ubz0Var.n;
        a(dd6Var, weakReference3 != null ? (View) weakReference3.get() : null);
        WeakReference weakReference4 = ubz0Var.m;
        a(dd6Var, weakReference4 != null ? (View) weakReference4.get() : null);
        WeakReference weakReference5 = ubz0Var.o;
        a(dd6Var, weakReference5 != null ? (View) weakReference5.get() : null);
        WeakReference weakReference6 = ubz0Var.p;
        a(dd6Var, weakReference6 != null ? (View) weakReference6.get() : null);
        WeakReference weakReference7 = ubz0Var.l;
        a(dd6Var, weakReference7 != null ? (View) weakReference7.get() : null);
        a(p01Var, ubz0Var.c());
    }
}
