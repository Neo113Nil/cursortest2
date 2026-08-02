package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: FaveFeedFragment.kt */
/* loaded from: classes4.dex */
public final class soq extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (view.getId() == R.id.fave_likes_entry_point_view) {
            rect.bottom = cn70.b(4);
        }
    }
}
