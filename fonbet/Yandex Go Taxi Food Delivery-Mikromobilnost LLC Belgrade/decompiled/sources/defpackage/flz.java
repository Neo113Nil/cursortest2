package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class flz extends RecyclerView.g {
    public final wvg a;
    public final uvg b;

    public flz(wvg wvgVar, uvg uvgVar) {
        this.a = wvgVar;
        this.b = uvgVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            this.a.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.b.invoke(Integer.valueOf(i2));
    }
}
