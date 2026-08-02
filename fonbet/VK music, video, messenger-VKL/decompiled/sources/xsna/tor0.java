package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: VerticalOffsetItemDecoration.kt */
/* loaded from: classes3.dex */
public final class tor0 extends RecyclerView.n {
    public static final int b;

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        b = e3m.a(R.dimen.music_playlist_logo_height, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        T t;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        pd90 pd90Var = adapter instanceof pd90 ? (pd90) adapter : null;
        if (pd90Var == null || (t = pd90Var.c) == 0) {
            throw new RuntimeException();
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = iah0.s(view.getContext()) ? b : 0;
        if (childAdapterPosition != t.getItemCount() - 1 || !epx.f(view.getTag(), "centerInRecycler")) {
            rect.setEmpty();
            return;
        }
        if (view.getMeasuredHeight() == 0) {
            view.measure(0, 0);
        }
        int bottom = recyclerView.getBottom() - recyclerView.getTop();
        if (bottom <= view.getMeasuredHeight()) {
            rect.setEmpty();
        } else {
            int measuredHeight = ((bottom - view.getMeasuredHeight()) - i) / 2;
            rect.set(0, measuredHeight, 0, measuredHeight);
        }
    }
}
