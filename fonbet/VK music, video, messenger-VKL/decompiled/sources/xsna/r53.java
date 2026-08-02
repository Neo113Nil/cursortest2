package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AppItemViewHolder.kt */
/* loaded from: classes6.dex */
public abstract class r53<T> extends RecyclerView.e0 {
    public T l;

    public r53(int i, ViewGroup viewGroup) {
        super(tf3.b(viewGroup, i, viewGroup, false));
    }

    public final void V5(T t) {
        this.l = t;
        W5(t);
    }

    public abstract void W5(T t);
}
