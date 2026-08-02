package xsna;

import android.view.View;
import kotlin.LazyThreadSafetyMode;
import xsna.ror;

/* compiled from: FlexLayoutDragListenerProvider.kt */
/* loaded from: classes4.dex */
public final class fpr implements View.OnLongClickListener {
    public final ror b;
    public final ror.a c;
    public final k5h d;
    public final boolean e;
    public final boolean f;
    public final Object g;
    public final Object h;

    public fpr(ror rorVar, ror.a aVar, k5h k5hVar, boolean z, ndc0 ndc0Var) {
        this.b = rorVar;
        this.c = aVar;
        this.d = k5hVar;
        this.e = z;
        this.f = ndc0Var.a;
        t2l t2lVar = new t2l(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, t2lVar);
        this.h = msy.a(lazyThreadSafetyMode, new pw(10, this, ndc0Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0 > 1) goto L11;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final epr a() {
        boolean z;
        boolean z2 = this.f;
        ror rorVar = this.b;
        if (z2) {
            if (rorVar.h) {
                int childCount = rorVar.getChildCount();
                z = true;
            }
            z = false;
        } else {
            z = rorVar.h;
        }
        return z ? (ipr) this.g.getValue() : (apr) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return ((ipr) this.g.getValue()).onLongClick(view) || ((apr) this.h.getValue()).d(view);
    }
}
