package com.yandex.go.places.searchbar.impl.ui.scroll_up;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.dzg0;
import defpackage.gug0;
import defpackage.h3h0;
import defpackage.kyh0;
import defpackage.qje;
import defpackage.tje;
import defpackage.vng;
import defpackage.xng0;
import defpackage.zog0;
import kotlin.Metadata;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/go/places/searchbar/impl/ui/scroll_up/ScrollUpButtonView;", "Lcom/yandex/go/design/view/GoImageView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "size", "F", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScrollUpButtonView extends GoImageView {
    private final Paint backgroundPaint;
    private final float cornerRadius;
    private final float size;

    public ScrollUpButtonView(Context context) {
        super(context, null, 0, 6, null);
        this.size = tje.r(gug0.places_searchbar_size_collapsed, getContext());
        this.cornerRadius = tje.r(gug0.places_searchbar_corner_radius, getContext());
        Paint paint = new Paint(1);
        paint.setColor(qje.t(xng0.bgFloating, getContext()));
        paint.setShadowLayer(tje.r(gug0.places_searchbar_shadow_radius_collapsed, getContext()), 0.0f, tje.r(gug0.places_searchbar_shadow_y_collapsed, getContext()), getContext().getColor(zog0.places_searchbar_shadow_color_collapsed));
        this.backgroundPaint = paint;
        setForeground(vng.t(h3h0.ripple_places_searchbar, getContext()));
        setOutlineProvider(null);
        setScaleType(ImageView.ScaleType.CENTER);
        setContentDescription(context.getString(kyh0.order_details_with_feed_collapse_button_content_description_title));
        setImageResource(dzg0.ic_scroll_up);
    }

    @Override // com.yandex.go.design.view.GoImageView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.backgroundPaint.setColor(qje.t(xng0.bgFloating, getContext()));
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        float f = this.size;
        float f2 = this.cornerRadius;
        canvas.drawRoundRect(0.0f, 0.0f, f, f, f2, f2, this.backgroundPaint);
        super.onDraw(canvas);
    }
}
