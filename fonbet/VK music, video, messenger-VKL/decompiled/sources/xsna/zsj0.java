package xsna;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: SimpleViewPool.kt */
/* loaded from: classes17.dex */
public final class zsj0 {
    public final SparseArray<svb0<RecyclerView.e0>> a = new SparseArray<>();

    public final RecyclerView.e0 a(int i) {
        svb0<RecyclerView.e0> svb0Var = this.a.get(i);
        if (svb0Var != null) {
            return svb0Var.c();
        }
        return null;
    }

    public final void b(RecyclerView.e0 e0Var) {
        Object tag = e0Var.itemView.getTag(R.id.view_type);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        int intValue = num != null ? num.intValue() : -1;
        SparseArray<svb0<RecyclerView.e0>> sparseArray = this.a;
        svb0<RecyclerView.e0> svb0Var = sparseArray.get(intValue);
        if (svb0Var == null) {
            svb0Var = new tvb0<>(30);
        }
        sparseArray.append(intValue, svb0Var);
        svb0Var.a(e0Var);
    }
}
