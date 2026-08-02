package com.yandex.go.mainscreen.superapp.orders.presentation.ui;

import android.graphics.Canvas;
import androidx.recyclerview.widget.ItemTouchHelper$Callback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import defpackage.chw0;
import defpackage.f501;
import defpackage.g501;
import defpackage.h501;
import defpackage.i501;
import defpackage.j501;
import defpackage.jl40;
import defpackage.qyw0;
import defpackage.rr00;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.w201;
import defpackage.wls;
import defpackage.xw31;
import defpackage.y6i0;
import defpackage.y9b1;
import defpackage.zy11;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class g extends ItemTouchHelper$Callback {
    public final tls d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedHashSet f = new LinkedHashSet();
    public final LinkedHashSet g = new LinkedHashSet();
    public final LinkedHashSet h = new LinkedHashSet();
    public Float i;

    public g(tls tlsVar) {
        this.d = tlsVar;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final void b(RecyclerView recyclerView, x0 x0Var) {
        this.i = null;
        if (x0Var instanceof qyw0) {
            qyw0 qyw0Var = (qyw0) x0Var;
            rr00 t = t(qyw0Var);
            String id = t != null ? t.getId() : null;
            if (jl40.l(qyw0Var.k0(), h501.a)) {
                if (id != null) {
                    this.h.remove(id);
                    this.g.remove(id);
                }
                qyw0Var.i0();
                qyw0Var.o0(0.0f);
                y9b1.a(x0Var.a);
                return;
            }
            r(qyw0Var);
        }
        super.b(recyclerView, x0Var);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final int e(x0 x0Var) {
        int i;
        if (x0Var instanceof qyw0) {
            qyw0 qyw0Var = (qyw0) x0Var;
            if (!jl40.l(qyw0Var.k0(), f501.a)) {
                rr00 t = t(qyw0Var);
                String id = t != null ? t.getId() : null;
                i = 16;
                if (id != null) {
                    if (!this.f.contains(id) && !this.g.contains(id) && !this.h.contains(id)) {
                        if ((qyw0Var.k0() instanceof g501) && this.e.contains(id)) {
                            i = 48;
                        }
                    }
                }
                return ItemTouchHelper$Callback.k(0, i);
            }
        }
        i = 0;
        return ItemTouchHelper$Callback.k(0, i);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final float f(float f) {
        return Float.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final float g(float f) {
        return Float.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.yandex.go.mainscreen.superapp.orders.presentation.ui.f] */
    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final void l(Canvas canvas, RecyclerView recyclerView, x0 x0Var, float f, float f2, int i, boolean z) {
        float f3;
        if (!(x0Var instanceof qyw0)) {
            super.l(canvas, recyclerView, x0Var, f, f2, i, z);
            return;
        }
        final qyw0 qyw0Var = (qyw0) x0Var;
        qyw0Var.n0(new sls() { // from class: com.yandex.go.mainscreen.superapp.orders.presentation.ui.f
            @Override // defpackage.sls
            public final Object invoke() {
                qyw0 qyw0Var2 = qyw0Var;
                g.this.q(qyw0Var2, new TrackingCardSwipeCallback$ensureDeferButtonClickListenerSettled$1$1(2, qyw0Var2, qyw0.class, "animateFadeOut", "animateFadeOut(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", 0));
                return zy11.a;
            }
        });
        h501 h501Var = h501.a;
        if (!z) {
            if (jl40.l(qyw0Var.k0(), h501Var)) {
                return;
            }
            r(qyw0Var);
            return;
        }
        float width = recyclerView.getWidth();
        rr00 t = t(qyw0Var);
        String id = t != null ? t.getId() : null;
        if (id == null || jl40.l(qyw0Var.k0(), f501.a)) {
            return;
        }
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet.contains(id)) {
            return;
        }
        boolean l = jl40.l(qyw0Var.k0(), h501Var);
        LinkedHashSet linkedHashSet2 = this.g;
        if (!l) {
            Float f4 = this.i;
            if (f4 != null) {
                f3 = f4.floatValue();
            } else {
                linkedHashSet2.remove(id);
                qyw0Var.i0();
                float l0 = qyw0Var.l0();
                this.i = Float.valueOf(l0);
                f3 = l0;
            }
            float f5 = f3 + f;
            qyw0Var.o0(xw31.n(qyw0Var.a.getContext()) ? y6i0.c(f5, 0.0f, width) : y6i0.c(f5, -width, 0.0f));
            return;
        }
        rr00 t2 = t(qyw0Var);
        String id2 = t2 != null ? t2.getId() : null;
        if (id2 == null || linkedHashSet.contains(id2) || linkedHashSet2.contains(id2)) {
            return;
        }
        LinkedHashSet linkedHashSet3 = this.h;
        if (linkedHashSet3.contains(id2)) {
            return;
        }
        this.e.remove(id2);
        linkedHashSet2.add(id2);
        linkedHashSet3.add(id2);
        this.i = null;
        qyw0Var.e0(new j501(this, id2, 1));
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final boolean m(RecyclerView recyclerView, x0 x0Var, x0 x0Var2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper$Callback
    public final void p(x0 x0Var, int i) {
        if (x0Var instanceof qyw0) {
            this.i = null;
            qyw0 qyw0Var = (qyw0) x0Var;
            if (jl40.l(qyw0Var.k0(), f501.a) || jl40.l(qyw0Var.k0(), h501.a)) {
                return;
            }
            if (i == 32) {
                s(qyw0Var);
            } else if (Math.abs(qyw0Var.l0()) >= x0Var.a.getWidth() * 0.5f) {
                q(qyw0Var, new TrackingCardSwipeCallback$onSwiped$1$1(x0Var));
            } else {
                r(qyw0Var);
            }
        }
    }

    public final void q(final qyw0 qyw0Var, wls wlsVar) {
        if (!(qyw0Var.k0() instanceof g501)) {
            s(qyw0Var);
            return;
        }
        rr00 t = t(qyw0Var);
        if (t == null) {
            return;
        }
        final String id = t.getId();
        if (this.f.add(id)) {
            this.e.remove(id);
            this.g.remove(id);
            this.i = null;
            wlsVar.invoke(new sls() { // from class: com.yandex.go.mainscreen.superapp.orders.presentation.ui.e
                @Override // defpackage.sls
                public final Object invoke() {
                    qyw0 qyw0Var2 = qyw0.this;
                    String str = qyw0Var2.U;
                    if (str != null) {
                        i501 i501Var = qyw0Var2.b0;
                        if (i501Var instanceof g501) {
                            qyw0Var2.U = null;
                            chw0 chw0Var = qyw0Var2.V;
                            String str2 = ((g501) i501Var).b;
                            w201 w201Var = (w201) chw0Var.d.invoke(str);
                            if (w201Var == null) {
                                chw0.d(str);
                            } else {
                                chw0Var.j.a(w201Var, "swipe", chw0Var.c, (String) chw0Var.b.invoke());
                                tje.N((tse) chw0Var.a.get(), null, null, new SuperappTrackingCardItemUiActionInteractor$handleTrackingDeferred$1(chw0Var, w201Var, str2, null), 3);
                            }
                        }
                    }
                    this.f.remove(id);
                    return zy11.a;
                }
            }, new j501(this, id, 0));
        }
    }

    public final void r(qyw0 qyw0Var) {
        rr00 t = t(qyw0Var);
        String id = t != null ? t.getId() : null;
        if (id == null) {
            return;
        }
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet.contains(id)) {
            return;
        }
        LinkedHashSet linkedHashSet2 = this.g;
        if (linkedHashSet2.contains(id)) {
            return;
        }
        this.i = null;
        float l0 = qyw0Var.l0();
        i501 k0 = qyw0Var.k0();
        if (jl40.l(k0, h501.a)) {
            return;
        }
        boolean z = k0 instanceof g501;
        if (z && Math.abs(l0) >= qyw0Var.a.getWidth() * 0.5f) {
            q(qyw0Var, new TrackingCardSwipeCallback$settleAfterRelease$1(qyw0Var));
            return;
        }
        if (!z || !qyw0Var.m0(l0)) {
            s(qyw0Var);
            return;
        }
        if (!(qyw0Var.k0() instanceof g501)) {
            s(qyw0Var);
            return;
        }
        rr00 t2 = t(qyw0Var);
        String id2 = t2 != null ? t2.getId() : null;
        if (id2 == null || linkedHashSet.contains(id2) || linkedHashSet2.contains(id2)) {
            return;
        }
        this.e.add(id2);
        linkedHashSet2.add(id2);
        qyw0Var.f0(qyw0Var.j0(), true, new j501(this, id2, 2));
    }

    public final void s(qyw0 qyw0Var) {
        rr00 t = t(qyw0Var);
        String id = t != null ? t.getId() : null;
        if (id == null || this.f.contains(id)) {
            return;
        }
        LinkedHashSet linkedHashSet = this.g;
        if (linkedHashSet.contains(id)) {
            return;
        }
        this.e.remove(id);
        linkedHashSet.add(id);
        qyw0Var.f0(0.0f, false, new j501(this, id, 2));
    }

    public final rr00 t(qyw0 qyw0Var) {
        int intValue;
        Integer valueOf = Integer.valueOf(qyw0Var.F());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            intValue = valueOf.intValue();
        } else {
            Integer valueOf2 = Integer.valueOf(qyw0Var.E());
            if (valueOf2.intValue() == -1) {
                valueOf2 = null;
            }
            if (valueOf2 == null) {
                return null;
            }
            intValue = valueOf2.intValue();
        }
        return (rr00) this.d.invoke(Integer.valueOf(intValue));
    }
}
