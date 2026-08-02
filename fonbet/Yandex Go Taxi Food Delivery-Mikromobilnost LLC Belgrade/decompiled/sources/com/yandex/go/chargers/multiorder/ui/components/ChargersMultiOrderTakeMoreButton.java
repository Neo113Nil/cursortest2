package com.yandex.go.chargers.multiorder.ui.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.czo0;
import defpackage.hbp0;
import defpackage.l8x;
import defpackage.pav;
import defpackage.qoi0;
import defpackage.tje;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ButtonComponent;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0012\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/yandex/go/chargers/multiorder/ui/components/ChargersMultiOrderTakeMoreButton;", "Lru/yandex/taxi/design/ButtonComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "url", "Lpav;", "imageLoader", "loadIcon", "(Ljava/lang/String;Lpav;)V", "Landroid/graphics/drawable/Drawable;", "icon", "setTextIcon", "(Landroid/graphics/drawable/Drawable;)V", "defaultHorizontalPadding", CA20Status.STATUS_USER_I, "Lhbp0;", "scopeDelegate", "Lhbp0;", "Ll8x;", "loadIconJob", "Ll8x;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersMultiOrderTakeMoreButton extends ButtonComponent {
    private final int defaultHorizontalPadding;
    private l8x loadIconJob;
    private final hbp0 scopeDelegate;

    public ChargersMultiOrderTakeMoreButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int u = tje.u(14, getContext());
        this.defaultHorizontalPadding = u;
        String d = qoi0.a(ChargersMultiOrderTakeMoreButton.class).d();
        this.scopeDelegate = new hbp0(new czo0(14), d == null ? "" : d, null);
        setPadding(u, getPaddingTop(), u, getPaddingBottom());
    }

    public final void loadIcon(String url, pav imageLoader) {
        l8x l8xVar = this.loadIconJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        if (url != null) {
            this.loadIconJob = hbp0.e(this.scopeDelegate, null, null, new ChargersMultiOrderTakeMoreButton$loadIcon$1(imageLoader, url, this, null), 3);
        } else {
            setTextIcon((Drawable) null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.scopeDelegate.a();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        l8x l8xVar = this.loadIconJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.loadIconJob = null;
        this.scopeDelegate.b();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.design.ButtonComponent
    public void setTextIcon(Drawable icon) {
        super.setTextIcon(icon);
        setPadding(icon != null ? tje.u(6, getContext()) : this.defaultHorizontalPadding, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextIconPadding(tje.u(icon != null ? 2 : 0, getContext()));
    }

    public ChargersMultiOrderTakeMoreButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ChargersMultiOrderTakeMoreButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ChargersMultiOrderTakeMoreButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
