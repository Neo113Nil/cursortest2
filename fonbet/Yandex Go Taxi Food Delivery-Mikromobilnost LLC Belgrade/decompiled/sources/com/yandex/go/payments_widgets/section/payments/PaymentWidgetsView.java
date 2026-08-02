package com.yandex.go.payments_widgets.section.payments;

import android.content.Context;
import android.graphics.Rect;
import android.widget.FrameLayout;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import defpackage.gla0;
import defpackage.nwy0;
import defpackage.tje;
import defpackage.vtg0;
import defpackage.xvl;
import defpackage.zla0;
import defpackage.zmk;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001&B\u0019\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0010J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000b2\b\b\u0001\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\rR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010$¨\u0006'"}, d2 = {"Lcom/yandex/go/payments_widgets/section/payments/PaymentWidgetsView;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Lcom/yandex/div/core/Div2Context;", "div2Context", "<init>", "(Landroid/content/Context;Lcom/yandex/div/core/Div2Context;)V", "", "scale", "Lzy11;", "setScale", "(F)V", "", "applyThemeForChildrenByDefault", "()Z", "Landroid/graphics/Rect;", "bounds", "()Landroid/graphics/Rect;", "", "fixedHeight", "()I", "isInitiallyCollapsed", "Lgla0;", "item", "setData", "(Lgla0;)V", "unbind", "()V", "factor", "changeScrollFactor", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "Lcom/yandex/div/core/view2/Div2View;", CA20Status.STATUS_USER_I, "Lgla0;", "Companion", "zla0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentWidgetsView extends FrameLayout implements nwy0 {

    @Deprecated
    public static final float ALPHA_MAX = 1.0f;

    @Deprecated
    public static final float ALPHA_MIN = 0.1f;
    private static final zla0 Companion = new zla0();

    @Deprecated
    public static final float SCALE_MAX = 1.0f;

    @Deprecated
    public static final float SCALE_MIN = 0.8f;
    private final Div2View div2View;
    private final int fixedHeight;
    private gla0 item;

    public PaymentWidgetsView(Context context, Div2Context div2Context) {
        super(context);
        Div2View div2View = new Div2View(div2Context, null, 0, 6, null);
        this.div2View = div2View;
        int r = tje.r(vtg0.payment_widgets_section_height, context);
        this.fixedHeight = r;
        setMinimumHeight(r);
        setClipChildren(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, r);
        layoutParams.gravity = 80;
        int i = -((int) ((context.getResources().getDisplayMetrics().widthPixels * 0.19999999f) / 1.6f));
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(i);
        div2View.setClipChildren(false);
        addView(div2View, layoutParams);
    }

    private final void setScale(float scale) {
        this.div2View.setScaleX(scale);
        this.div2View.setScaleY(scale);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    public Rect bounds() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    public final void changeScrollFactor(float factor) {
        this.div2View.setAlpha((0.9f * factor) + 0.1f);
        setScale((factor * 0.19999999f) + 0.8f);
    }

    /* renamed from: fixedHeight, reason: from getter */
    public int getFixedHeight() {
        return this.fixedHeight;
    }

    public boolean isInitiallyCollapsed() {
        gla0 gla0Var = this.item;
        return gla0Var != null && gla0Var.b;
    }

    public final void setData(gla0 item) {
        this.item = item;
        xvl xvlVar = item.a.a;
        this.div2View.setData(xvlVar.b.a, new zmk(xvlVar.a));
        this.div2View.setActionHandler(item.a.b);
    }

    public final void unbind() {
        this.div2View.setActionHandler(null);
    }
}
