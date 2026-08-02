package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.g18;
import defpackage.lls;
import defpackage.xw31;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes6.dex */
public final class lls {
    public final NestedScrollViewAdvanced a;
    public final View b;
    public final Runnable c;
    public final x95 d = new x95(4, this);
    public g18 e = g18.u1;

    public lls(NestedScrollViewAdvanced nestedScrollViewAdvanced, View view, Runnable runnable) {
        this.a = nestedScrollViewAdvanced;
        this.b = view;
        this.c = runnable;
    }

    public final void a() {
        NestedScrollViewAdvanced nestedScrollViewAdvanced = this.a;
        x95 x95Var = this.d;
        if (nestedScrollViewAdvanced.hasScrollChangeListener(x95Var) && xw31.i(this.b)) {
            this.c.run();
            nestedScrollViewAdvanced.removeScrollChangeListener(x95Var);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, dai] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, xq31] */
    public final void b() {
        View view = this.b;
        if (view.getWidth() > 0) {
            if (xw31.i(view)) {
                this.c.run();
                return;
            } else {
                this.a.addScrollChangeListener(this.d);
                return;
            }
        }
        this.e.cancel();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = g18.u1;
        final boolean z = true;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: ru.yandex.taxi.widget.scroll.FullyVisibleViewChecker$subscribe$$inlined$doOnPreDrawCancelable$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (this.b.getWidth() > 0) {
                    lls llsVar = this;
                    if (xw31.i(llsVar.b)) {
                        llsVar.c.run();
                    } else {
                        llsVar.a.addScrollChangeListener(llsVar.d);
                    }
                }
                ((g18) Ref$ObjectRef.this.element).cancel();
                return z;
            }
        };
        ref$ObjectRef.element = new xq31(viewTreeObserver, onPreDrawListener, view);
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        this.e = (g18) ref$ObjectRef.element;
    }

    public final void c() {
        this.a.removeScrollChangeListener(this.d);
        this.e.cancel();
    }
}
