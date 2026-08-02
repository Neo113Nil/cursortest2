package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;

/* compiled from: AbstractClipsGridListAdapter.kt */
/* loaded from: classes17.dex */
public abstract class gd extends zoj0<nmv, RecyclerView.e0> implements mmv {
    public int e;

    public gd(m.e<nmv> eVar) {
        super(new com.vk.lists.a(eVar));
        this.e = 3;
    }

    @Override // xsna.zoj0, xsna.uuk
    public final nmv c(int i) {
        return (nmv) this.c.c(i);
    }

    @Override // xsna.mmv
    public final int getSpanCount() {
        return this.e;
    }

    @Override // xsna.mmv
    public final void i0(int i) {
        this.e = i;
    }
}
