package yads;

import android.content.Context;
import android.view.View;

/* loaded from: classes10.dex */
public final class yc1 implements xc1 {
    public final km a;

    public yc1(km kmVar) {
        this.a = kmVar;
    }

    @Override // yads.xc1
    public final void onAttachedToWindow() {
        int i = tb.b;
        if (tb.a((mu) this.a)) {
            return;
        }
        this.a.m();
    }

    @Override // yads.xc1
    public final void onDetachedFromWindow() {
        int i = tb.b;
        if (tb.a((mu) this.a)) {
            return;
        }
        this.a.n();
    }

    @Override // yads.xc1
    public final void a(Context context, View view) {
    }
}
