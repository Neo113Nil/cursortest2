package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PlacePickerRecyclerViewObserver.kt */
/* loaded from: classes4.dex */
public final class hra0<T> implements yjf0<T> {
    public final Executor a;
    public final ArrayList b = new ArrayList();

    public hra0(Executor executor) {
        this.a = executor;
    }

    @Override // xsna.yjf0
    public final void d(RecyclerView.e0 e0Var, T t) {
        this.a.execute(new as2(this, e0Var, t, 1));
    }
}
