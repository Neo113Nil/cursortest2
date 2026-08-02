package com.yandex.go.taxi.order.details.v1.elements.upsell;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.b8j;
import defpackage.jl40;
import defpackage.mrg0;
import defpackage.n4h0;
import defpackage.s9k0;
import defpackage.t601;
import defpackage.tje;
import defpackage.tls;
import defpackage.wug0;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/go/taxi/order/details/v1/elements/upsell/UpsellView;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lb8j;", ClidProvider.STATE, "Lzy11;", "render", "(Lb8j;)V", "Lkotlin/Function1;", "Libk0;", "handler", "setActionHandler", "(Ltls;)V", "actionHandler", "Ltls;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UpsellView extends ListItemComponent {
    public static final int $stable = 8;
    private tls actionHandler;

    public UpsellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundResource(n4h0.bg_rounded_ripple);
        setSubTitleEllipsizeMode(1);
        setSubtitleMaxLines(2);
        setTitleEllipsizeMode(1);
        setTitleMaxLines(1);
        setTrailImagePadding(tje.r(wug0.order_screens_upsell_trail_image_padding, getContext()));
        setVerticalPadding(tje.r(wug0.order_screens_upsell_vertical_padding, getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0$0(UpsellView upsellView, b8j b8jVar) {
        tls tlsVar = upsellView.actionHandler;
        if (tlsVar != null) {
            tlsVar.invoke(b8jVar.e);
        }
    }

    public final void render(b8j state) {
        setTitle(state.b);
        setSubtitle(state.c);
        Drawable drawable = state.d;
        if (drawable != null) {
            setTrailImage(drawable);
            setTrailImageSize(tje.r(wug0.details_upsell_trail_image_size, getContext()));
            setTrailImagePadding(tje.r(wug0.order_screens_upsell_trail_image_padding, getContext()));
            xw31.A(tje.r(mrg0.go_design_m_space, getContext()), getTrailImageView());
        } else {
            clearTrailView();
        }
        if (jl40.l(state.e, s9k0.a)) {
            setDebounceClickListener(null);
        } else {
            setDebounceClickListener(new t601(16, this, state));
        }
    }

    public final void setActionHandler(tls handler) {
        this.actionHandler = handler;
    }

    public UpsellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public UpsellView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ UpsellView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
