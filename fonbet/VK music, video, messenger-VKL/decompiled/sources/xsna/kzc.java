package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SequentialPlayDelegate.kt */
/* loaded from: classes2.dex */
public final class kzc implements bva0 {
    @Override // xsna.bva0
    public final int a(int i, RecyclerView.Adapter<?> adapter) {
        int i2 = i % 2 == 0 ? i + 1 : i - 1;
        return i2 < adapter.getItemCount() ? i2 : (i + 1) % adapter.getItemCount();
    }
}
