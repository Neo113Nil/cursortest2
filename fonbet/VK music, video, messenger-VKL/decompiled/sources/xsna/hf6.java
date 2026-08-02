package xsna;

import androidx.recyclerview.widget.RecyclerView;
import xsna.zif0;

/* compiled from: BaseItemHolder.kt */
/* loaded from: classes17.dex */
public abstract class hf6<Item extends zif0> extends RecyclerView.e0 {
    public Item l;

    public void V5(Item item) {
        this.l = item;
        W5(item);
    }

    public abstract void W5(Item item);

    /* compiled from: BaseItemHolder.kt */
    public static class a extends hf6<zif0> {
        @Override // xsna.hf6
        public final void W5(zif0 zif0Var) {
        }
    }
}
