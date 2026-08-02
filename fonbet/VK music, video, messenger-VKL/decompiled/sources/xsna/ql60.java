package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: NewsfeedHolderUiDtoOffsetDecoration.kt */
/* loaded from: classes4.dex */
public final class ql60 extends l2c0 {
    @Override // xsna.l2c0, androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        long c = adapter instanceof ho60 ? ((ho60) adapter).z0().c(childAdapterPosition) : 0L;
        if (c == 0) {
            rect.set(0, 0, 0, 0);
            return;
        }
        rect.top += (short) (c >> 48);
        rect.bottom += (short) (c >> 32);
        rect.left += (short) (c >> 16);
        rect.right += (short) c;
    }
}
