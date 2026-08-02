package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import xsna.hfz;

/* compiled from: ListItemViewHolder.kt */
/* loaded from: classes17.dex */
public abstract class vfz<T extends hfz> extends RecyclerView.e0 {
    public vfz(int i, ViewGroup viewGroup) {
        super(tf3.b(viewGroup, i, viewGroup, false));
    }

    public abstract void W5(T t);

    public final Resources b6() {
        return this.itemView.getContext().getResources();
    }

    public final Context getContext() {
        return this.itemView.getContext();
    }

    public void V5() {
    }

    public void a6() {
    }

    public void g6() {
    }
}
