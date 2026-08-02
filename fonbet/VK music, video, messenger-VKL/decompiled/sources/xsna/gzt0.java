package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class gzt0 implements gzs<s3q0> {
    public final /* synthetic */ ViewPager2 b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ ViewPager2 e;

    public gzt0(ViewPager2 viewPager2, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, ViewPager2 viewPager22) {
        this.b = viewPager2;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = viewPager22;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        androidx.viewpager2.widget.e eVar;
        ViewPager2 viewPager2 = this.b;
        int measuredWidth = viewPager2.getMeasuredWidth();
        int measuredHeight = viewPager2.getMeasuredHeight();
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.element;
        Ref$IntRef ref$IntRef2 = this.d;
        if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
            ref$IntRef.element = measuredWidth;
            ref$IntRef2.element = measuredHeight;
            ViewPager2 viewPager22 = this.e;
            RecyclerView recyclerView = viewPager22.k;
            if (recyclerView != null && (eVar = viewPager22.m) != null) {
                RecyclerView.Adapter adapter = viewPager22.getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                int currentItem = viewPager22.getCurrentItem();
                if (currentItem >= 0 && currentItem < itemCount) {
                    eVar.m(currentItem, false);
                    recyclerView.scrollToPosition(currentItem);
                }
            }
        }
        return s3q0.a;
    }
}
