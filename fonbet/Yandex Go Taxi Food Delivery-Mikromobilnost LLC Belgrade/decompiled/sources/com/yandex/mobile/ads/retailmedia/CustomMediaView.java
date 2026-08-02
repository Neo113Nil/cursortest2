package com.yandex.mobile.ads.retailmedia;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.retailmedia.type.RetailMediaAdType;
import defpackage.h8;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/yandex/mobile/ads/retailmedia/CustomMediaView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/monetization/ads/nativeads/CustomizableMediaView;", "getNativeMediaView$mobileads_internalRelease", "()Lcom/monetization/ads/nativeads/CustomizableMediaView;", "getNativeMediaView", "Lcom/yandex/mobile/ads/retailmedia/type/RetailMediaAdType;", "adType", "Lzy11;", "showRequiredByType$mobileads_internalRelease", "(Lcom/yandex/mobile/ads/retailmedia/type/RetailMediaAdType;)V", "showRequiredByType", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CustomMediaView extends FrameLayout {
    private MediaView a;

    public CustomMediaView(Context context) {
        super(context);
    }

    public final CustomizableMediaView getNativeMediaView$mobileads_internalRelease() {
        return this.a;
    }

    public final void showRequiredByType$mobileads_internalRelease(RetailMediaAdType adType) {
        h8 h8Var = new h8(3, this);
        while (h8Var.hasNext()) {
            View view = (View) h8Var.next();
            RetailMediaAdType retailMediaAdType = RetailMediaAdType.PRODUCT_PROMO;
            view.setVisibility(adType == retailMediaAdType ? 0 : 8);
            if (view instanceof MediaView) {
                MediaView mediaView = (MediaView) view;
                mediaView.setVisibility(0);
                if (adType == retailMediaAdType) {
                    mediaView = null;
                }
                this.a = mediaView;
            }
        }
    }

    public CustomMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
