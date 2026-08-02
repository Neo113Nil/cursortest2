package com.yandex.plus.home.feature.panel.internalapi;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import com.yandex.plus.home.common.utils.flow.ColdFlow;
import com.yandex.plus.home.common.utils.flow.b;
import com.yandex.plus.log.api.LogPriority;
import defpackage.ard0;
import defpackage.bb1;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jse;
import defpackage.l8x;
import defpackage.rkd0;
import defpackage.rol0;
import defpackage.tje;

/* loaded from: classes2.dex */
public final class a implements ard0 {
    public final rkd0 a;
    public final ike b;
    public final SparseArray c = new SparseArray();
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public final SparseArray g = new SparseArray();

    public a(jse jseVar, rkd0 rkd0Var) {
        this.a = rkd0Var;
        this.b = bvf0.a(cvw.U(jl40.a(), jseVar));
    }

    public static final void b(View view, a aVar) {
        aVar.getClass();
        try {
            view.getViewTreeObserver().addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener) aVar.e.get(view.getId()));
            view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) aVar.f.get(view.getId()));
        } catch (Throwable unused) {
        }
    }

    public static final void c(View view, a aVar) {
        SparseArray sparseArray = aVar.c;
        int id = view.getId();
        Object obj = sparseArray.get(id);
        if (obj != null) {
            sparseArray.remove(id);
        } else {
            obj = null;
        }
        l8x l8xVar = (l8x) obj;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        SparseArray sparseArray2 = aVar.d;
        int id2 = view.getId();
        Object obj2 = sparseArray2.get(id2);
        if (obj2 != null) {
            sparseArray2.remove(id2);
        } else {
            obj2 = null;
        }
        l8x l8xVar2 = (l8x) obj2;
        if (l8xVar2 != null) {
            l8xVar2.a(null);
        }
    }

    public static final void d(a aVar, View view, boolean z) {
        SparseArray sparseArray = aVar.c;
        if (sparseArray.get(view.getId()) != null) {
            return;
        }
        sparseArray.put(view.getId(), tje.N(aVar.b, null, null, new PlusViewAwarenessDetectorImpl$detectAwareWithThrottling$1(view, aVar, null, z), 3));
    }

    public static final void e(View view, a aVar) {
        aVar.getClass();
        try {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            SparseArray sparseArray = aVar.e;
            int id = view.getId();
            Object obj = sparseArray.get(id);
            Object obj2 = null;
            if (obj != null) {
                sparseArray.remove(id);
            } else {
                obj = null;
            }
            viewTreeObserver.removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener) obj);
            SparseArray sparseArray2 = aVar.f;
            int id2 = view.getId();
            Object obj3 = sparseArray2.get(id2);
            if (obj3 != null) {
                sparseArray2.remove(id2);
                obj2 = obj3;
            }
            viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) obj2);
        } catch (Throwable unused) {
        }
    }

    public final rol0 f(final View view, final boolean z) {
        LogPriority logPriority = LogPriority.DEBUG;
        rkd0 rkd0Var = this.a;
        if (rkd0Var.e(logPriority)) {
            rkd0Var.b(logPriority, "PlusViewAwarenessDetectorImpl", "startDetecting() view=" + view, null);
        }
        bb1.M(view);
        int id = view.getId();
        SparseArray sparseArray = this.g;
        Object obj = sparseArray.get(id);
        Object obj2 = obj;
        if (obj == null) {
            final ColdFlow coldFlow = new ColdFlow();
            if (view.isAttachedToWindow()) {
                sparseArray.put(view.getId(), coldFlow);
                e(view, this);
                c(view, this);
                this.e.put(view.getId(), new PlusViewAwarenessDetectorImpl$handleAttach$1$1(this, view, z));
                this.f.put(view.getId(), new PlusViewAwarenessDetectorImpl$handleAttach$1$2(this, view, z));
                b(view, this);
            } else {
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.plus.home.feature.panel.internalapi.PlusViewAwarenessDetectorImpl$handleAttach$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view2) {
                        view.removeOnAttachStateChangeListener(this);
                        this.g.put(view2.getId(), coldFlow);
                        a.e(view2, this);
                        a.c(view2, this);
                        this.e.put(view2.getId(), new PlusViewAwarenessDetectorImpl$handleAttach$1$1(this, view2, z));
                        this.f.put(view2.getId(), new PlusViewAwarenessDetectorImpl$handleAttach$1$2(this, view2, z));
                        a.b(view2, this);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view2) {
                    }
                });
            }
            if (view.isAttachedToWindow()) {
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.plus.home.feature.panel.internalapi.PlusViewAwarenessDetectorImpl$handleDetach$$inlined$doOnDetach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view2) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view2) {
                        view.removeOnAttachStateChangeListener(this);
                        a.e(view2, this);
                        a.c(view2, this);
                        this.g.remove(view2.getId());
                    }
                });
                obj2 = coldFlow;
            } else {
                e(view, this);
                c(view, this);
                sparseArray.remove(view.getId());
                obj2 = coldFlow;
            }
        }
        return b.a((ColdFlow) obj2);
    }
}
