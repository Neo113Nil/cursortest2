package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.data.BorderType;
import com.vkontakte.android.R;

/* compiled from: FeedDigestItemDecoration.kt */
/* loaded from: classes4.dex */
public final class dyq implements lyq {
    public final Paint b;
    public final Paint c;
    public final RectF d;
    public boolean e;
    public NewsEntry f;
    public NewsEntry g;
    public final RectF h;
    public final float i;

    public dyq() {
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        this.d = new RectF();
        this.e = true;
        this.h = new RectF();
        this.i = cn70.a() * 10.0f;
        abg0 abg0Var = dhr0.t;
        paint2.setColor(abg0Var.c(R.attr.vk_ui_separator_secondary));
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(cn70.a() * 0.33f);
        paint2.setStyle(Paint.Style.STROKE);
        paint.setColor(abg0Var.c(R.attr.vk_ui_background_tertiary));
        paint.setAntiAlias(true);
    }

    @Override // xsna.lyq
    public final void Eb(Canvas canvas, View view, RecyclerView.e0 e0Var) {
        if (e0Var instanceof qi6) {
            u1c0 J0 = ((qi6) e0Var).J0();
            f28 f28Var = J0 instanceof f28 ? (f28) J0 : null;
            if (f28Var == null) {
                return;
            }
            NewsEntry newsEntry = f28Var.b;
            NewsEntry newsEntry2 = f28Var.a;
            p18 p18Var = f28Var.q;
            if (p18Var == null || p18Var.b <= BorderType.NONE.h()) {
                NewsEntry newsEntry3 = this.f;
                NewsEntry newsEntry4 = this.g;
                if (newsEntry3 == null || newsEntry4 == null) {
                    return;
                }
                a(canvas);
                return;
            }
            float left = view.getLeft();
            float top = view.getTop();
            float right = view.getRight();
            float bottom = view.getBottom();
            RectF rectF = this.h;
            rectF.set(left, top, right, bottom);
            rectF.offset(view.getTranslationX(), view.getTranslationY());
            NewsEntry newsEntry5 = this.f;
            NewsEntry newsEntry6 = this.g;
            if (newsEntry5 != null && newsEntry6 != null && !newsEntry5.equals(newsEntry2) && !newsEntry6.equals(newsEntry)) {
                a(canvas);
            }
            this.f = newsEntry2;
            this.g = newsEntry;
            int h = BorderType.TOP.h() & p18Var.b;
            float f = this.i;
            if (h == 0) {
                rectF.top -= f;
            }
            if ((BorderType.BOTTOM.h() & p18Var.b) == 0) {
                rectF.bottom += f;
            }
            boolean z = this.e;
            RectF rectF2 = this.d;
            if (!z) {
                rectF2.union(rectF);
            } else {
                this.e = false;
                rectF2.set(rectF);
            }
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        abg0 abg0Var = dhr0.t;
        this.b.setColor(abg0Var.c(R.attr.vk_ui_background_tertiary));
        this.c.setColor(abg0Var.c(R.attr.vk_ui_separator_secondary));
    }

    @Override // xsna.lyq
    public final void Xd(Canvas canvas) {
        NewsEntry newsEntry = this.f;
        NewsEntry newsEntry2 = this.g;
        if (newsEntry == null || newsEntry2 == null) {
            return;
        }
        a(canvas);
    }

    public final void a(Canvas canvas) {
        if (!this.e) {
            RectF rectF = this.d;
            if (!rectF.isEmpty()) {
                Paint paint = this.b;
                float f = this.i;
                canvas.drawRoundRect(rectF, f, f, paint);
                canvas.drawRoundRect(rectF, f, f, this.c);
            }
        }
        this.e = true;
        this.f = null;
        this.g = null;
    }
}
