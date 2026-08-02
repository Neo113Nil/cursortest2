package com.yandex.go.taxi.order.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import defpackage.cma1;
import defpackage.dwh0;
import defpackage.dzg0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.kgx;
import defpackage.kyh0;
import defpackage.qje;
import defpackage.r6y0;
import defpackage.s6y0;
import defpackage.xbi0;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR+\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/yandex/go/taxi/order/ui/TaxiOrderTrackingBackButton;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "updateVisibility", "()V", "", "text", "setBadgeText", "(Ljava/lang/String;)V", "", "<set-?>", "slideOffsetVisibilityEdge$delegate", "Lxbi0;", "getSlideOffsetVisibilityEdge", "()F", "setSlideOffsetVisibilityEdge", "(F)V", "slideOffsetVisibilityEdge", "slideOffset$delegate", "getSlideOffset", "setSlideOffset", "slideOffset", "", "isVisible", "Z", "baseContentDescription", "Ljava/lang/String;", "Companion", "r6y0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderTrackingBackButton extends FloatButtonIconComponent {
    private static final float BUTTON_ELEVATION = 0.3f;
    private final String baseContentDescription;
    private boolean isVisible;

    /* renamed from: slideOffset$delegate, reason: from kotlin metadata */
    private final xbi0 slideOffset;

    /* renamed from: slideOffsetVisibilityEdge$delegate, reason: from kotlin metadata */
    private final xbi0 slideOffsetVisibilityEdge;
    static final /* synthetic */ kgx[] $$delegatedProperties = {new MutablePropertyReference1Impl("slideOffsetVisibilityEdge", 0, "getSlideOffsetVisibilityEdge()F", TaxiOrderTrackingBackButton.class), new MutablePropertyReference1Impl("slideOffset", 0, "getSlideOffset()F", TaxiOrderTrackingBackButton.class)};
    private static final r6y0 Companion = new r6y0();
    public static final int $stable = 8;

    public TaxiOrderTrackingBackButton(Context context) {
        super(context, null, 0, 0, 14, null);
        this.slideOffsetVisibilityEdge = new s6y0(this);
        this.slideOffset = new s6y0(Float.valueOf(getSlideOffsetVisibilityEdge()), this);
        this.isVisible = true;
        String string = context.getString(kyh0.common_back);
        this.baseContentDescription = string;
        setVisibility(0);
        setElevation(0.3f);
        setContentDescription(string);
        setIcon(dzg0.ic_arrow_back_24dp);
        getIcon().setImageTintList(ColorStateList.valueOf(c.c(xng0.textMain, getIcon())));
        setBadgeBackgroundColor(qje.t(xng0.controlMain, getContext()));
        setBadgeTextColorAttr(xng0.textOnControl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateVisibility() {
        boolean z = getSlideOffset() - getSlideOffsetVisibilityEdge() < 0.01f;
        if (z && !this.isVisible) {
            this.isVisible = true;
            cma1.J(this);
        } else {
            if (z || !this.isVisible) {
                return;
            }
            this.isVisible = false;
            cma1.L(this);
        }
    }

    public final float getSlideOffset() {
        return ((Number) this.slideOffset.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    public final float getSlideOffsetVisibilityEdge() {
        return ((Number) this.slideOffsetVisibilityEdge.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    @Override // ru.yandex.taxi.design.CircleButtonComponent
    public void setBadgeText(String text) {
        String str;
        super.setBadgeText(text);
        if (text == null || evu0.J(text) || !TextUtils.isDigitsOnly(text)) {
            str = this.baseContentDescription;
        } else {
            int parseInt = Integer.parseInt(text);
            str = g8e.p(this.baseContentDescription, Extension.FIX_SPACE, c.v(this, dwh0.active_orders_counter_content_description, kyh0.active_orders_counter_one_content_description, parseInt, Integer.valueOf(parseInt)));
        }
        setContentDescription(str);
    }

    public final void setSlideOffset(float f) {
        this.slideOffset.setValue(this, $$delegatedProperties[1], Float.valueOf(f));
    }

    public final void setSlideOffsetVisibilityEdge(float f) {
        this.slideOffsetVisibilityEdge.setValue(this, $$delegatedProperties[0], Float.valueOf(f));
    }
}
