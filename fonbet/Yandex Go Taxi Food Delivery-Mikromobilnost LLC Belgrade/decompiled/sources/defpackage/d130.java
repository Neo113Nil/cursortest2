package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.taxi.multiexit.MultiexitModalView;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.modalview.b;

/* loaded from: classes10.dex */
public final class d130 implements w030 {
    public final ffe b;
    public final a850 c;
    public final ContentContainer$ZOrder d;
    public final jt4 e;
    public final FrameLayout f;
    public final a130 g;
    public final yvi0 h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;
    public final vd2 k;
    public final c130 l;

    public d130(ffe ffeVar, a850 a850Var, ContentContainer$ZOrder contentContainer$ZOrder, jt4 jt4Var) {
        this.b = ffeVar;
        this.c = a850Var;
        this.d = contentContainer$ZOrder;
        this.e = jt4Var;
        FrameLayout frameLayout = new FrameLayout(ffeVar.a.getContext());
        this.f = frameLayout;
        this.h = new yvi0(this);
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.k = new vd2(1, this);
        this.l = new c130();
        ViewGroup viewGroup = ffeVar.a;
        viewGroup.addView(frameLayout);
        ffeVar.a(frameLayout, contentContainer$ZOrder);
        this.g = new a130(new xg(), (ViewGroup) viewGroup.getParent(), Collections.singleton(Integer.valueOf(teh0.state_bar_host)));
    }

    @Override // defpackage.w030
    public final boolean a() {
        c130 c130Var = this.l;
        if (c130Var.a.isEmpty()) {
            return false;
        }
        Iterator it = c130Var.a.iterator();
        while (it.hasNext()) {
            b130 b130Var = (b130) it.next();
            b130Var.d = true;
            b130Var.a.dismiss();
        }
        return true;
    }

    @Override // defpackage.w030
    public final void b() {
        ffe ffeVar = this.b;
        ViewGroup viewGroup = ffeVar.a;
        FrameLayout frameLayout = this.f;
        if (viewGroup.indexOfChild(frameLayout) < 0) {
            ffeVar.a.addView(frameLayout);
            ffeVar.a(frameLayout, this.d);
        }
        jt4 jt4Var = this.e;
        vd2 vd2Var = this.k;
        if (jt4Var.a(vd2Var)) {
            return;
        }
        jt4Var.c(vd2Var);
    }

    @Override // defpackage.w030
    public final void c(final Class cls, boolean z, Runnable runnable) {
        Predicate predicate;
        if (z) {
            final int i = 0;
            predicate = new Predicate() { // from class: z030
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i2 = i;
                    Class cls2 = cls;
                    b130 b130Var = (b130) obj;
                    switch (i2) {
                        case 0:
                            return cls2.isAssignableFrom(b130Var.a.getClass());
                        default:
                            return cls2.equals(b130Var.a.getClass());
                    }
                }
            };
        } else {
            final int i2 = 1;
            predicate = new Predicate() { // from class: z030
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i22 = i2;
                    Class cls2 = cls;
                    b130 b130Var = (b130) obj;
                    switch (i22) {
                        case 0:
                            return cls2.isAssignableFrom(b130Var.a.getClass());
                        default:
                            return cls2.equals(b130Var.a.getClass());
                    }
                }
            };
        }
        v(predicate, runnable);
    }

    @Override // defpackage.w030
    public final void d(ModalView modalView) {
        Object u = u();
        k(modalView, u instanceof View ? ((View) u).getZ() : 0.0f, true);
    }

    @Override // defpackage.w030
    public final u45 e() {
        b130 t = t();
        if (t == null || t.d) {
            return null;
        }
        return t.a;
    }

    @Override // defpackage.w030
    public final void f(u45 u45Var, Runnable runnable) {
        u45Var.getClass();
        v(new md3(8, u45Var), runnable);
    }

    @Override // defpackage.w030
    public final g18 g(v030 v030Var) {
        this.i.add(v030Var);
        return new k20(4, this, v030Var);
    }

    @Override // defpackage.w030
    public final void h() {
        u45 u = u();
        if (u != null) {
            u.requestFocus();
            u.performAccessibilityFocusAction();
        }
    }

    @Override // defpackage.w030
    public final u45 i(Class cls) {
        return r(false, cls);
    }

    @Override // defpackage.w030
    public final boolean isEmpty() {
        b130 t = t();
        return (t == null || t.d) && this.l.b.isEmpty();
    }

    @Override // defpackage.w030
    public final u45 j() {
        Iterator it = this.l.a.iterator();
        while (it.hasNext()) {
            b130 b130Var = (b130) it.next();
            u45 u45Var = b130Var.a;
            if (!b130Var.d && "RouteStopsV2Router".equals(u45Var.getModalScreenName())) {
                return u45Var;
            }
        }
        return null;
    }

    @Override // defpackage.w030
    public final void k(u45 u45Var, float f, boolean z) {
        u45Var.getClass();
        u45Var.hashCode();
        c130 c130Var = this.l;
        c130Var.b.clear();
        c130Var.b.offer(new b130(u45Var, f, z));
        w();
    }

    @Override // defpackage.w030
    public final void l(u45 u45Var) {
        f(u45Var, null);
    }

    @Override // defpackage.w030
    public final void m(Class cls) {
        c(cls, false, null);
    }

    @Override // defpackage.w030
    public final g18 n(kft0 kft0Var) {
        this.j.add(kft0Var);
        return new l30(9, this, kft0Var);
    }

    @Override // defpackage.w030
    public final void o(qq40 qq40Var) {
        c(MultiexitModalView.class, false, qq40Var);
    }

    @Override // defpackage.w030
    public final boolean p() {
        b130 t = t();
        if (t == null || t.d) {
            return false;
        }
        f(t.a, null);
        return t.d;
    }

    @Override // defpackage.w030
    public final void q() {
        b130 t = t();
        for (int size = this.l.a.size(); t != null && size > 0; size--) {
            t.d = true;
            t.a.dismissWithoutAnimation();
            t = t();
        }
        FrameLayout frameLayout = this.f;
        frameLayout.removeAllViews();
        this.e.b(this.k);
        this.b.a.removeView(frameLayout);
    }

    @Override // defpackage.w030
    public final u45 r(boolean z, Class cls) {
        Iterator it = this.l.a.iterator();
        while (it.hasNext()) {
            b130 b130Var = (b130) it.next();
            u45 u45Var = b130Var.a;
            if (!b130Var.d) {
                if (z ? cls.isAssignableFrom(u45Var.getClass()) : cls.equals(u45Var.getClass())) {
                    if (u45Var != null) {
                        return u45Var;
                    }
                    return null;
                }
            }
        }
        return null;
    }

    @Override // defpackage.w030
    public final void s(u45 u45Var, boolean z) {
        Object u = u();
        k(u45Var, u instanceof View ? ((View) u).getZ() : 0.0f, z);
    }

    public final b130 t() {
        return (b130) this.l.a.peek();
    }

    public final u45 u() {
        b130 t = t();
        if (t != null) {
            return t.a;
        }
        return null;
    }

    public final void v(Predicate predicate, Runnable runnable) {
        c130 c130Var = this.l;
        c130Var.b.removeIf(predicate);
        ConcurrentLinkedDeque concurrentLinkedDeque = c130Var.a;
        Iterator<E> it = new x43(concurrentLinkedDeque).iterator();
        while (it.hasNext()) {
            b130 b130Var = (b130) it.next();
            boolean z = b130Var.d;
            u45 u45Var = b130Var.a;
            if (!z && predicate.test(b130Var)) {
                if (runnable != null) {
                    b130Var.d = true;
                    u45Var.dismissWithAction(runnable);
                } else {
                    b130Var.d = true;
                    u45Var.dismiss();
                }
                concurrentLinkedDeque.remove(b130Var);
            }
        }
    }

    public final void w() {
        b130 b130Var = (b130) this.l.b.poll();
        if (b130Var != null) {
            u45 u45Var = b130Var.a;
            s45 onAppearingListener = u45Var.getOnAppearingListener();
            int i = a330.d;
            s45 bVar = new b(u45Var, onAppearingListener, b130Var, this, this.l);
            if (u45Var.canHandleScreenTracking()) {
                bVar = new a330(this.c, u45Var, bVar);
            }
            u45Var.setOnAppearingListener(bVar);
            if (!b130Var.c && (u45Var instanceof g030)) {
                ((g030) u45Var).setAccessibilityListener(this.h);
            }
            u45Var.show(this.f, b130Var.b);
        }
    }
}
