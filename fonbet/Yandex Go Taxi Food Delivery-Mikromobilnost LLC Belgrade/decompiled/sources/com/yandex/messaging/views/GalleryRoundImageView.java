package com.yandex.messaging.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ase;
import defpackage.gvg0;
import defpackage.urs;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0018\u0010#\u001a\u00060\u0011j\u0002`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001c¨\u0006&"}, d2 = {"Lcom/yandex/messaging/views/GalleryRoundImageView;", "Lcom/yandex/messaging/views/RoundImageView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "Lase;", "radii", "setCornerRadiiDp", "(Lase;)V", "Lurs;", "newData", "bindData", "(Lurs;)V", Constants.KEY_DATA, "Lurs;", "maxAvailableWidth", CA20Status.STATUS_USER_I, "", "value", "isSmall", "Z", "()Z", "Lcom/yandex/messaging/internal/view/timeline/galleryview/CornersRadii;", "fixedSmallCorners", "Lase;", "smallSideOffset", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GalleryRoundImageView extends RoundImageView {
    public static final int $stable = 8;
    private urs data;
    private final ase fixedSmallCorners;
    private boolean isSmall;
    private int maxAvailableWidth;
    private final int smallSideOffset;

    public GalleryRoundImageView(Context context) {
        super(context, null, 0, 6, null);
        this.fixedSmallCorners = new ase(4, 4, 4, 4);
        this.smallSideOffset = getResources().getDimensionPixelSize(gvg0.timeline_message_corner_radius_attachment);
    }

    public final void bindData(urs newData) {
        if (newData.equals(this.data)) {
            return;
        }
        this.maxAvailableWidth = 0;
        this.isSmall = false;
        this.data = newData;
        requestLayout();
    }

    /* renamed from: isSmall, reason: from getter */
    public final boolean getIsSmall() {
        return this.isSmall;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int min;
        urs ursVar = this.data;
        if (ursVar == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int max = Math.max(View.MeasureSpec.getSize(widthMeasureSpec), this.maxAvailableWidth);
        this.maxAvailableWidth = max;
        if (!ursVar.c) {
            this.isSmall = false;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
            super.onMeasure(makeMeasureSpec, makeMeasureSpec);
            return;
        }
        int i = ursVar.a;
        int i2 = ursVar.b;
        if (i < max - (this.smallSideOffset * 2)) {
            this.isSmall = true;
            min = Math.min(i2, max);
            max = i;
        } else {
            this.isSmall = false;
            float f = i / i2;
            min = f > 1.0f ? (int) (max / f) : Math.min(i2, max);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
    }

    @Override // com.yandex.messaging.views.RoundImageView
    public void setCornerRadiiDp(ase radii) {
        if (this.isSmall) {
            super.setCornerRadiiDp(this.fixedSmallCorners);
        } else {
            super.setCornerRadiiDp(radii);
        }
    }

    public GalleryRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        this.fixedSmallCorners = new ase(4, 4, 4, 4);
        this.smallSideOffset = getResources().getDimensionPixelSize(gvg0.timeline_message_corner_radius_attachment);
    }

    public GalleryRoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fixedSmallCorners = new ase(4, 4, 4, 4);
        this.smallSideOffset = getResources().getDimensionPixelSize(gvg0.timeline_message_corner_radius_attachment);
    }
}
