package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.ofs0;

/* compiled from: VideoDiscoveryCatalogPaddingDecorator.kt */
/* loaded from: classes7.dex */
public final class nfs0 extends RecyclerView.n {
    public final RecyclerView b;
    public boolean c;
    public int d;

    public nfs0(RecyclerView recyclerView) {
        this.b = recyclerView;
        recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.mfs0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                nfs0 nfs0Var = nfs0.this;
                if (nfs0Var.c) {
                    return;
                }
                int i9 = i4 - i2;
                if (i9 > nfs0Var.d) {
                    nfs0Var.b.invalidateItemDecorations();
                }
                nfs0Var.d = i9;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        View view2;
        if (!this.c && (recyclerView.getChildViewHolder(view) instanceof ofs0.a)) {
            Integer num = null;
            Pair<Boolean, Integer> b = xfs0.b(recyclerView, null);
            if (b == null) {
                return;
            }
            boolean booleanValue = b.d().booleanValue();
            int intValue = b.g().intValue();
            if (booleanValue) {
                return;
            }
            RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(recyclerView.getChildAdapterPosition(view) - 1);
            if (findViewHolderForAdapterPosition != null && (view2 = findViewHolderForAdapterPosition.itemView) != null) {
                num = Integer.valueOf(view2.getBottom());
            }
            this.d = Math.max(this.d, recyclerView.getHeight());
            rect.bottom = ((intValue - recyclerView.getResources().getDimensionPixelSize(R.dimen.video_discovery_catalog_tabs_height)) + this.d) - (num != null ? num.intValue() : view.getTop());
        }
    }
}
