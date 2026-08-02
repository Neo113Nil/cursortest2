package coil.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import defpackage.dvw;
import defpackage.j18;
import defpackage.jh91;
import defpackage.lkj;
import defpackage.nkj;
import defpackage.qdi0;
import defpackage.rjs0;
import defpackage.tls;
import defpackage.wis0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* renamed from: coil.size.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC0134a extends rjs0 {
    static jh91 f(int i, int i2, int i3) {
        if (i == -2) {
            return nkj.a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            return new lkj(i4);
        }
        int i5 = i2 - i3;
        if (i5 > 0) {
            return new lkj(i5);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, coil.size.ViewSizeResolver$size$3$preDrawListener$1] */
    @Override // defpackage.rjs0
    default Object a(Continuation continuation) {
        wis0 size = getSize();
        if (size != null) {
            return size;
        }
        final j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        final ViewTreeObserver viewTreeObserver = ((qdi0) this).a.getViewTreeObserver();
        final ?? r1 = new ViewTreeObserver.OnPreDrawListener() { // from class: coil.size.ViewSizeResolver$size$3$preDrawListener$1
            private boolean isResumed;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                wis0 size2 = InterfaceC0134a.this.getSize();
                if (size2 != null) {
                    InterfaceC0134a interfaceC0134a = InterfaceC0134a.this;
                    ViewTreeObserver viewTreeObserver2 = viewTreeObserver;
                    interfaceC0134a.getClass();
                    if (viewTreeObserver2.isAlive()) {
                        viewTreeObserver2.removeOnPreDrawListener(this);
                    } else {
                        ((qdi0) interfaceC0134a).a.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    if (!this.isResumed) {
                        this.isResumed = true;
                        j18Var.resumeWith(size2);
                    }
                }
                return true;
            }
        };
        viewTreeObserver.addOnPreDrawListener(r1);
        j18Var.w(new tls() { // from class: coil.size.ViewSizeResolver$size$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                InterfaceC0134a interfaceC0134a = InterfaceC0134a.this;
                ViewTreeObserver viewTreeObserver2 = viewTreeObserver;
                ViewSizeResolver$size$3$preDrawListener$1 viewSizeResolver$size$3$preDrawListener$1 = r1;
                interfaceC0134a.getClass();
                if (viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnPreDrawListener(viewSizeResolver$size$3$preDrawListener$1);
                } else {
                    ((qdi0) interfaceC0134a).a.getViewTreeObserver().removeOnPreDrawListener(viewSizeResolver$size$3$preDrawListener$1);
                }
                return zy11.a;
            }
        });
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    default wis0 getSize() {
        View view = ((qdi0) this).a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        jh91 f = f(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (f == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        jh91 f2 = f(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (f2 == null) {
            return null;
        }
        return new wis0(f, f2);
    }
}
