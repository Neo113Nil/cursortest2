package com.yandex.go.navigator.alt_select.traffic;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import defpackage.crb1;
import defpackage.fuh0;
import defpackage.trb1;
import defpackage.v2h0;
import defpackage.vng;
import defpackage.vog0;
import defpackage.xw31;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.FloatButtonIconComponent;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/yandex/go/navigator/alt_select/traffic/TrafficJamView;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrsAttributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "Landroid/graphics/drawable/Drawable;", "drawables", "Landroid/graphics/drawable/LayerDrawable;", AdRevenueConstants.LAYER_KEY, "([Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/LayerDrawable;", "Lzy11;", "showInactive", "()V", "showLoading", "showUnavailable", "Lcom/yandex/go/navigator/alt_select/traffic/TrafficLevel;", "level", "levelValue", "showActive", "(Lcom/yandex/go/navigator/alt_select/traffic/TrafficLevel;I)V", "getLayoutResource", "()I", "head", "Landroid/graphics/drawable/Drawable;", "colorBase", CA20Status.STATUS_USER_I, ClidProvider.APP_INACTIVE, "Lcom/yandex/go/navigator/alt_select/traffic/CyclicTransitionDrawable;", "loadingCyclicDrawable", "Lcom/yandex/go/navigator/alt_select/traffic/CyclicTransitionDrawable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TrafficJamView extends FloatButtonIconComponent {
    public static final int $stable = 8;
    private final int colorBase;
    private final Drawable head;
    private final int inactive;
    private final CyclicTransitionDrawable loadingCyclicDrawable;

    public TrafficJamView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Drawable t = vng.t(v2h0.traffic_head_48, context);
        t.setLayoutDirection(xw31.n(context) ? 1 : 0);
        this.head = t;
        int i3 = v2h0.traffic_light_48;
        this.colorBase = i3;
        this.inactive = v2h0.traffic_off_48;
        this.loadingCyclicDrawable = new CyclicTransitionDrawable(crb1.d(context, i3, Integer.valueOf(vog0.traffic_na)), crb1.d(context, i3, Integer.valueOf(vog0.traffic_light)));
    }

    private final LayerDrawable layer(Drawable... drawables) {
        return new LayerDrawable(drawables);
    }

    @Override // ru.yandex.taxi.design.FloatButtonIconComponent, ru.yandex.taxi.widget.buttons.LittleIconCircleButton, ru.yandex.taxi.widget.buttons.IconCircleButton, ru.yandex.taxi.design.CircleButtonComponent
    public int getLayoutResource() {
        return fuh0.traffic_jams_icon_component;
    }

    public final void showActive(TrafficLevel level, int levelValue) {
        setIcon(layer(crb1.d(getContext(), this.colorBase, Integer.valueOf(trb1.b(level))), this.head, crb1.d(getContext(), trb1.a(levelValue), Integer.valueOf(trb1.c(level)))));
        setVisibility(0);
    }

    public final void showInactive() {
        Context context = getContext();
        Drawable t = vng.t(this.inactive, context);
        t.setLayoutDirection(xw31.n(context) ? 1 : 0);
        setIcon(t);
        setVisibility(0);
    }

    public final void showLoading() {
        setIcon(layer(this.loadingCyclicDrawable, this.head));
        this.loadingCyclicDrawable.startTransition(700);
        setVisibility(0);
    }

    public final void showUnavailable() {
        setIcon(layer(crb1.d(getContext(), this.colorBase, Integer.valueOf(vog0.traffic_na)), this.head));
        setVisibility(0);
    }

    public TrafficJamView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public TrafficJamView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public TrafficJamView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ TrafficJamView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
