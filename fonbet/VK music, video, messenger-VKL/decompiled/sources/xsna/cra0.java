package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.posting.geo_picker.presentation.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PlacePickerPager.kt */
/* loaded from: classes4.dex */
public final class cra0<T> implements yjf0<T> {
    public final uqa0 a;
    public final bra0 b;
    public final AtomicInteger c = new AtomicInteger(0);
    public final AtomicInteger d = new AtomicInteger(0);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean(false);

    public cra0(uqa0 uqa0Var, bra0 bra0Var) {
        this.a = uqa0Var;
        this.b = bra0Var;
    }

    @Override // xsna.yjf0
    public final void d(RecyclerView.e0 e0Var, T t) {
        AtomicBoolean atomicBoolean = this.e;
        if (atomicBoolean.get() || this.f.get() || this.c.get() > this.d.get() || this.a.getItemCount() - e0Var.getLayoutPosition() >= 20 || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        this.b.yi(a.InterfaceC1406a.b.b);
    }
}
