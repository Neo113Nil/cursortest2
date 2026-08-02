package xsna;

import android.view.View;

/* compiled from: Effects.kt */
/* loaded from: classes17.dex */
public final class xbh0 implements kgn {
    public final /* synthetic */ f5z a;
    public final /* synthetic */ tbh0 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ubh0 d;

    public xbh0(f5z f5zVar, tbh0 tbh0Var, View view, ubh0 ubh0Var) {
        this.a = f5zVar;
        this.b = tbh0Var;
        this.c = view;
        this.d = ubh0Var;
    }

    @Override // xsna.kgn
    public final void dispose() {
        this.a.getLifecycle().removeObserver(this.b);
        this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this.d);
    }
}
