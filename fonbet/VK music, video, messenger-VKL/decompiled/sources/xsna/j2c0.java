package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Set;
import ru.ok.android.commons.http.Http;

/* compiled from: PostDisplayItemsMediaFrameDecoration.kt */
/* loaded from: classes4.dex */
public final class j2c0 extends RecyclerView.n {
    public final RectF b = new RectF();
    public final Rect c = new Rect();
    public final Paint d;
    public final float e;
    public final Set<Integer> f;

    public j2c0() {
        Paint paint = new Paint();
        paint.setColor(dhr0.t.c(R.attr.vk_ui_image_border_alpha));
        paint.setStrokeWidth(cn70.a() * 0.5f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(false);
        this.d = paint;
        this.e = paint.getStrokeWidth() / 2.0f;
        this.f = rl3.y0(new Integer[]{Integer.valueOf(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), 203, 50, 110, 109, 352, 11, 206, 207, 75, 59, 353, 257, Integer.valueOf(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE), Integer.valueOf(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE), 258, 71, 58, 7, Integer.valueOf(Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE), 231, Integer.valueOf(Http.StatusCode.SEE_OTHER), 299, 337, 22, 23, 24});
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (this.f.contains(Integer.valueOf(recyclerView.getChildViewHolder(childAt).getItemViewType()))) {
                int paddingLeft = childAt.getPaddingLeft() + childAt.getLeft();
                Rect rect = this.c;
                rect.left = paddingLeft;
                rect.top = childAt.getPaddingTop() + childAt.getTop();
                rect.right = childAt.getRight() - childAt.getPaddingRight();
                rect.bottom = childAt.getBottom() - childAt.getPaddingBottom();
                RectF rectF = this.b;
                rectF.set(rect);
                rectF.offset(childAt.getTranslationX(), childAt.getTranslationY());
                float f = rectF.top;
                float f2 = this.e;
                rectF.top = f + f2;
                rectF.bottom -= f2;
                rect.setEmpty();
                float f3 = rectF.left;
                float f4 = rectF.top;
                float f5 = rectF.right;
                Paint paint = this.d;
                canvas.drawLine(f3, f4, f5, f4, paint);
                float f6 = rectF.left;
                float f7 = rectF.bottom;
                canvas.drawLine(f6, f7, rectF.right, f7, paint);
            }
        }
    }
}
