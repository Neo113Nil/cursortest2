package xsna;

import android.view.ViewGroup;
import xsna.hfz;

/* compiled from: AbsPayButtonViewHolder.kt */
/* loaded from: classes6.dex */
public abstract class zb<T extends hfz> extends vfz<T> {
    public final a l;

    /* compiled from: AbsPayButtonViewHolder.kt */
    public interface a {
        void d();
    }

    public zb(int i, ViewGroup viewGroup, a aVar) {
        super(i, viewGroup);
        this.l = aVar;
        this.itemView.setOnClickListener(new yb(this, 0));
    }
}
