package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: AlbumDetailsRecyclerBackgroundDecoration.kt */
/* loaded from: classes4.dex */
public final class vh1 extends RecyclerView.n {
    public final int b;
    public final Paint c;

    public vh1(int i) {
        this.b = i;
        Paint paint = new Paint();
        this.c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(krv0.l(R.attr.vk_ui_background_content));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        View view;
        int l = krv0.l(R.attr.vk_ui_background_content);
        Paint paint = this.c;
        paint.setColor(l);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                view = null;
                break;
            }
            view = recyclerView.getChildAt(i);
            if (view != null && recyclerView.getChildAdapterPosition(view) == this.b) {
                break;
            } else {
                i++;
            }
        }
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view != null ? view.getBottom() : 0, recyclerView.getRight(), recyclerView.getBottom(), paint);
    }
}
