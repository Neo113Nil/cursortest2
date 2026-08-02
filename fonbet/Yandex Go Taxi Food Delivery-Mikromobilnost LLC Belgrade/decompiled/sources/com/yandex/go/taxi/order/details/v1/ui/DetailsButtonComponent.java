package com.yandex.go.taxi.order.details.v1.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.l4j;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.qg;
import defpackage.s741;
import defpackage.t4j;
import defpackage.tje;
import defpackage.uxh;
import defpackage.ve60;
import defpackage.vzx;
import defpackage.w511;
import defpackage.zkh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.superapp.orders.models.ActionAccessibilityType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\n2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\n2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/go/taxi/order/details/v1/ui/DetailsButtonComponent;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "text", "Lzy11;", "setButtonText", "(Ljava/lang/String;)V", "Landroid/graphics/drawable/Drawable;", "icon", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "", "color", "setButtonTextColor", "(I)V", "setButtonBackground", "setBadgeText", "Lt4j;", ClidProvider.STATE, "render", "(Lt4j;)V", "getAnalyticsName", "()Ljava/lang/String;", "Lvzx;", "binding", "Lvzx;", "analyticsName", "Ljava/lang/String;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DetailsButtonComponent extends FrameLayout {
    public static final int $stable = 8;
    private volatile String analyticsName;
    private final vzx binding;

    public DetailsButtonComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(zkh0.layout_details_button, this);
        int i = p8h0.badge_text;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
        if (robotoTextView != null) {
            i = p8h0.button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, this);
            if (buttonComponent != null) {
                this.binding = new vzx(this, robotoTextView, buttonComponent);
                this.analyticsName = "";
                setClipChildren(false);
                setClipToPadding(false);
                buttonComponent.setTextTypeface(3);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0$0(t4j t4jVar) {
        t4jVar.i.invoke();
    }

    private final void setBadgeText(String text) {
        this.binding.b.setVisibility(evu0.J(text) ? 4 : 0);
        this.binding.b.setText(text);
    }

    private final void setButtonBackground(int color) {
        this.binding.c.setButtonBackground(color);
    }

    private final void setButtonText(String text) {
        this.binding.c.setText(text);
        boolean J = evu0.J(text);
        vzx vzxVar = this.binding;
        if (J) {
            vzxVar.c.setTextIconPadding(0);
            this.binding.c.setPadding(tje.u(12, getContext()), 0, tje.u(12, getContext()), 0);
        } else {
            vzxVar.c.setTextIconPadding((int) tje.x(getContext(), 4.0f));
            this.binding.c.setPadding(tje.u(12, getContext()), 0, tje.u(16, getContext()), 0);
        }
    }

    private final void setButtonTextColor(int color) {
        this.binding.c.setButtonTitleColor(color);
    }

    private final void setIcon(Drawable icon) {
        this.binding.c.setTextIcon(icon);
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final void render(t4j state) {
        this.analyticsName = state.g;
        setButtonText(state.b);
        setButtonTextColor(state.c);
        setButtonBackground(state.d);
        setBadgeText(state.e);
        setIcon(state.a);
        ButtonComponent buttonComponent = this.binding.c;
        buttonComponent.setOnClickListener(new uxh(15, state));
        buttonComponent.setContentDescription(state.f);
        ActionAccessibilityType actionAccessibilityType = state.h;
        if (actionAccessibilityType != null) {
            int i = l4j.a[actionAccessibilityType.ordinal()];
            if (i == 1) {
                qg qgVar = new qg();
                qgVar.b = true;
                androidx.core.view.b.p(this.binding.c, qgVar);
            } else if (i == 2) {
                androidx.core.view.b.p(this.binding.c, new s741());
            } else if (i == 3) {
                androidx.core.view.b.p(this.binding.c, new ve60());
            } else {
                w511.b();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DetailsButtonComponent(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DetailsButtonComponent(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
