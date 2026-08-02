package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ScrollingUtils.kt */
/* loaded from: classes17.dex */
public final class cih0 extends RecyclerView.t {
    public final /* synthetic */ Ref$IntRef b;
    public final /* synthetic */ RecyclerView c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public cih0(Ref$IntRef ref$IntRef, RecyclerView recyclerView, int i, boolean z, int i2, int i3) {
        this.b = ref$IntRef;
        this.c = recyclerView;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            Ref$IntRef ref$IntRef = this.b;
            ref$IntRef.element++;
            int i2 = this.d;
            boolean z = this.e;
            RecyclerView recyclerView2 = this.c;
            boolean c = dih0.c(i2, recyclerView2, z);
            boolean z2 = ref$IntRef.element < 10 && recyclerView.canScrollVertically(this.f);
            if (c || !z2) {
                recyclerView2.removeOnScrollListener(this);
                return;
            }
            int i3 = this.g;
            if (recyclerView.canScrollVertically(i3)) {
                recyclerView.smoothScrollBy(0, i3, null, IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
            }
        }
    }
}
