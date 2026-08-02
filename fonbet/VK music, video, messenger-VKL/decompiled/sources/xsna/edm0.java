package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stickers.api.models.market.StoryServiceItemInfo;
import com.vk.stickers.api.styles.ServiceStickerStyle;
import com.vk.stories.design.view.stickers.market.ServiceStickerStyleSwitchingView;
import com.vk.superapp.api.dto.story.WebStickerType;
import xsna.nov;

/* compiled from: StoryServiceItemSticker.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class edm0 extends nxt0 implements jdm0 {
    public static final int i = iah0.a(32);
    public final ServiceStickerStyleSwitchingView f;
    public StoryServiceItemInfo g;
    public ServiceStickerStyle h;

    public edm0(Context context, StoryServiceItemInfo storyServiceItemInfo, ServiceStickerStyle serviceStickerStyle) {
        super(context);
        ServiceStickerStyleSwitchingView serviceStickerStyleSwitchingView = new ServiceStickerStyleSwitchingView(context, null, 30);
        this.f = serviceStickerStyleSwitchingView;
        this.g = storyServiceItemInfo;
        this.h = serviceStickerStyleSwitchingView.getCurrentStyle();
        setInfo(storyServiceItemInfo);
        setStyle(serviceStickerStyle);
        addView(serviceStickerStyleSwitchingView);
        o();
    }

    private final int getMaxHeight() {
        return iah0.f().heightPixels;
    }

    private final int getMaxWidth() {
        return iah0.z(getContext()) - (i * 2);
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov C0() {
        l0u0 l0u0Var = new l0u0(kd7.i(this, null), getMeasuredWidth() * 2, WebStickerType.SERVICE_YC_ITEM, "");
        l0u0Var.q = edm0.class;
        l0u0Var.t = getInfo();
        l0u0Var.r = this;
        l0u0Var.s = new j4(25, this, l0u0Var);
        nov.a.b(this, l0u0Var);
        return l0u0Var;
    }

    @Override // xsna.nxt0, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new edm0(getContext(), getInfo(), getStyle()));
    }

    @Override // xsna.jdm0
    public StoryServiceItemInfo getInfo() {
        return this.g;
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalHeight() {
        return this.f.getMeasuredHeight();
    }

    @Override // xsna.nxt0, xsna.nov
    public float getOriginalWidth() {
        return this.f.getMeasuredWidth();
    }

    public final ServiceStickerStyle getStyle() {
        return this.f.getCurrentStyle();
    }

    @Override // xsna.v4l0
    public final Object m() {
        return getInfo();
    }

    public final void o() {
        this.f.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMaxWidth()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMaxHeight()), Integer.MIN_VALUE));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.f.layout(i2, i3, i4, i5);
    }

    @Override // xsna.nxt0, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        o();
        ServiceStickerStyleSwitchingView serviceStickerStyleSwitchingView = this.f;
        setMeasuredDimension(serviceStickerStyleSwitchingView.getMeasuredWidth(), serviceStickerStyleSwitchingView.getMeasuredHeight());
    }

    @Override // xsna.jdm0
    public void setInfo(StoryServiceItemInfo storyServiceItemInfo) {
        this.g = storyServiceItemInfo;
        this.f.setCurrentInfo(getInfo());
    }

    public final void setStyle(ServiceStickerStyle serviceStickerStyle) {
        ServiceStickerStyle serviceStickerStyle2 = this.h;
        this.h = serviceStickerStyle;
        ServiceStickerStyleSwitchingView serviceStickerStyleSwitchingView = this.f;
        serviceStickerStyleSwitchingView.setCurrentStyle(serviceStickerStyle);
        bwt0.p0(serviceStickerStyleSwitchingView, serviceStickerStyle.i());
        setStickerVisible(serviceStickerStyle.i());
        if (serviceStickerStyle2 != serviceStickerStyle) {
            float originalWidth = getOriginalWidth();
            float originalHeight = getOriginalHeight();
            if (originalWidth != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && originalHeight != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                o();
                nov.a.i(this, (originalWidth - getOriginalWidth()) / 2.0f, (originalHeight - getOriginalHeight()) / 2.0f);
            }
        }
        setContentDescription(pdq.c(getContext(), getInfo(), serviceStickerStyleSwitchingView.getCurrentStyle()));
    }
}
