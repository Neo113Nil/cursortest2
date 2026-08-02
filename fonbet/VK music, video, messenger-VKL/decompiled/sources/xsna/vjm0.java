package xsna;

import androidx.recyclerview.widget.GridLayoutManager;

/* compiled from: StoryTemplatesView.kt */
/* loaded from: classes6.dex */
public final class vjm0 extends GridLayoutManager.c {
    public final /* synthetic */ wjm0 d;

    public vjm0(wjm0 wjm0Var) {
        this.d = wjm0Var;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        wjm0 wjm0Var = this.d;
        if (wjm0Var.h.getItemViewType(i) == wim0.h) {
            return ((Number) wjm0Var.i.getValue()).intValue();
        }
        return 1;
    }
}
