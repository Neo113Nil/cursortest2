package xsna;

import android.view.View;
import kotlin.LazyThreadSafetyMode;
import xsna.qor;

/* compiled from: FlexLayoutDragListenerProvider.kt */
/* loaded from: classes18.dex */
public final class gpr implements View.OnLongClickListener {
    public final qor b;
    public final qor.f c;
    public final myh d;
    public final Object e;
    public final Object f;

    public gpr(qor qorVar, qor.f fVar, myh myhVar) {
        this.b = qorVar;
        this.c = fVar;
        this.d = myhVar;
        yce yceVar = new yce(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, yceVar);
        this.f = msy.a(lazyThreadSafetyMode, new jpf(this, 20));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final dpr a() {
        qor qorVar = this.b;
        return (!qorVar.g || qorVar.getChildCount() <= 1) ? (xor) this.f.getValue() : (jpr) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return ((jpr) this.e.getValue()).onLongClick(view) || ((xor) this.f.getValue()).c(view);
    }
}
