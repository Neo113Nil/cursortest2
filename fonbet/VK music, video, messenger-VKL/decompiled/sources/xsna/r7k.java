package xsna;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: TopBarHintAnchor.kt */
/* loaded from: classes4.dex */
public final class r7k implements n7p0 {
    public final WeakReference<View> a;
    public final izs<View, Rect> b;
    public final WeakReference<q7k> c;
    public final WeakReference<gzs<Boolean>> d;

    /* JADX WARN: Multi-variable type inference failed */
    public r7k(WeakReference<View> weakReference, izs<? super View, Rect> izsVar, WeakReference<q7k> weakReference2, WeakReference<gzs<Boolean>> weakReference3) {
        this.a = weakReference;
        this.b = izsVar;
        this.c = weakReference2;
        this.d = weakReference3;
    }

    @Override // xsna.n7p0
    public final void a() {
        q7k q7kVar = this.c.get();
        if (q7kVar != null) {
            q7kVar.g();
        }
    }

    @Override // xsna.n7p0
    public final View b() {
        return this.a.get();
    }

    @Override // xsna.n7p0
    public final boolean c() {
        gzs<Boolean> gzsVar = this.d.get();
        if (gzsVar != null) {
            return gzsVar.invoke().booleanValue();
        }
        return false;
    }

    @Override // xsna.n7p0
    public final Rect d() {
        View view = this.a.get();
        if (view != null && view.isAttachedToWindow()) {
            return this.b.invoke(view);
        }
        return null;
    }
}
