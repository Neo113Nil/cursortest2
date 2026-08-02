package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;

/* loaded from: classes15.dex */
public final class bss extends GridLayoutManager.b {
    public int d;
    public int e;
    public d6w f;

    @Override // androidx.recyclerview.widget.GridLayoutManager.b
    public final int c(int i) {
        d6w d6wVar = this.f;
        return (i > d6wVar.b || d6wVar.a > i) ? this.d : this.e;
    }
}
