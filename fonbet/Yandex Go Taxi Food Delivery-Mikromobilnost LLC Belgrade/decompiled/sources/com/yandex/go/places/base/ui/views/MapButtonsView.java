package com.yandex.go.places.base.ui.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.base.ui.views.MapButtonsView;
import com.yandex.go.places.common.ui.ControlButtonView;
import defpackage.abc0;
import defpackage.c3h0;
import defpackage.cma1;
import defpackage.f1h0;
import defpackage.i3y;
import defpackage.i6h0;
import defpackage.iez;
import defpackage.jr31;
import defpackage.ny61;
import defpackage.puh0;
import defpackage.scc;
import defpackage.sls;
import defpackage.tje;
import defpackage.xw31;
import defpackage.yln;
import defpackage.zf00;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.b;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 /2\u00020\u0001:\u00010BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u0018J\u001d\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010*\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0012R\u001d\u0010-\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010\u0012R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010 ¨\u00061"}, d2 = {"Lcom/yandex/go/places/base/ui/views/MapButtonsView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lzy11;", "onZoomInButtonClicked", "onZoomOutButtonClicked", "onLocationFocusingButtonClicked", "onCompassButtonClicked", "", "isGeoPermissionAllowed", "<init>", "(Landroid/content/Context;Lsls;Lsls;Lsls;Lsls;Z)V", "updateButtonsMargins", "()V", "Landroid/graphics/drawable/Drawable;", "getLocationFocusingIcon", "()Landroid/graphics/drawable/Drawable;", "Landroid/view/View;", "view", "addAdditionalButtonView", "(Landroid/view/View;)V", "updateLocationFocusingButton", "(Z)V", "isVisible", "updateLocationFocusingButtonVisibility", "updateZoomButtonsVisibility", "", "azimuth", "updateCompassButton", "(ZF)V", "Z", "Labc0;", "binding", "Labc0;", "Lcom/yandex/go/design/view/GoLinearLayout;", "buttonsContainer", "Lcom/yandex/go/design/view/GoLinearLayout;", "deniedPermissionLocationIcon$delegate", "Li3y;", "getDeniedPermissionLocationIcon", "deniedPermissionLocationIcon", "allowedPermissionLocationIcon$delegate", "getAllowedPermissionLocationIcon", "allowedPermissionLocationIcon", "isCompassAllowedByCaller", "Companion", "zf00", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapButtonsView extends GoFrameLayout {
    private static final int BUTTON_NO_MARGIN_DP = 0;
    private static final int BUTTON_RIGHT_MARGIN_DP = 8;
    private static final zf00 Companion = new zf00();

    /* renamed from: allowedPermissionLocationIcon$delegate, reason: from kotlin metadata */
    private final i3y allowedPermissionLocationIcon;
    private final abc0 binding;
    private final GoLinearLayout buttonsContainer;

    /* renamed from: deniedPermissionLocationIcon$delegate, reason: from kotlin metadata */
    private final i3y deniedPermissionLocationIcon;
    private boolean isCompassAllowedByCaller;
    private boolean isGeoPermissionAllowed;

    public MapButtonsView(Context context, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4, boolean z) {
        super(context, null, 0, 0, 14, null);
        this.isGeoPermissionAllowed = z;
        final int i = 0;
        View inflate = LayoutInflater.from(context).inflate(puh0.places_map_control_buttons_container, (ViewGroup) this, false);
        addView(inflate);
        int i2 = i6h0.buttons_container;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i2, inflate);
        if (goLinearLayout != null) {
            i2 = i6h0.compass_button;
            ControlButtonView controlButtonView = (ControlButtonView) cma1.O(i2, inflate);
            if (controlButtonView != null) {
                i2 = i6h0.location_focusing_button;
                ControlButtonView controlButtonView2 = (ControlButtonView) cma1.O(i2, inflate);
                if (controlButtonView2 != null) {
                    i2 = i6h0.minus_button;
                    ControlButtonView controlButtonView3 = (ControlButtonView) cma1.O(i2, inflate);
                    if (controlButtonView3 != null) {
                        i2 = i6h0.plus_button;
                        ControlButtonView controlButtonView4 = (ControlButtonView) cma1.O(i2, inflate);
                        if (controlButtonView4 != null) {
                            this.binding = new abc0((GoConstraintLayout) inflate, goLinearLayout, controlButtonView, controlButtonView2, controlButtonView3, controlButtonView4);
                            this.buttonsContainer = goLinearLayout;
                            sls slsVar5 = new sls(this) { // from class: yf00
                                public final /* synthetic */ MapButtonsView b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    Drawable deniedPermissionLocationIcon_delegate$lambda$0;
                                    Drawable allowedPermissionLocationIcon_delegate$lambda$0;
                                    int i3 = i;
                                    MapButtonsView mapButtonsView = this.b;
                                    switch (i3) {
                                        case 0:
                                            deniedPermissionLocationIcon_delegate$lambda$0 = MapButtonsView.deniedPermissionLocationIcon_delegate$lambda$0(mapButtonsView);
                                            return deniedPermissionLocationIcon_delegate$lambda$0;
                                        default:
                                            allowedPermissionLocationIcon_delegate$lambda$0 = MapButtonsView.allowedPermissionLocationIcon_delegate$lambda$0(mapButtonsView);
                                            return allowedPermissionLocationIcon_delegate$lambda$0;
                                    }
                                }
                            };
                            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                            this.deniedPermissionLocationIcon = a.b(lazyThreadSafetyMode, slsVar5);
                            final int i3 = 1;
                            this.allowedPermissionLocationIcon = a.b(lazyThreadSafetyMode, new sls(this) { // from class: yf00
                                public final /* synthetic */ MapButtonsView b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    Drawable deniedPermissionLocationIcon_delegate$lambda$0;
                                    Drawable allowedPermissionLocationIcon_delegate$lambda$0;
                                    int i32 = i3;
                                    MapButtonsView mapButtonsView = this.b;
                                    switch (i32) {
                                        case 0:
                                            deniedPermissionLocationIcon_delegate$lambda$0 = MapButtonsView.deniedPermissionLocationIcon_delegate$lambda$0(mapButtonsView);
                                            return deniedPermissionLocationIcon_delegate$lambda$0;
                                        default:
                                            allowedPermissionLocationIcon_delegate$lambda$0 = MapButtonsView.allowedPermissionLocationIcon_delegate$lambda$0(mapButtonsView);
                                            return allowedPermissionLocationIcon_delegate$lambda$0;
                                    }
                                }
                            });
                            this.isCompassAllowedByCaller = true;
                            setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                            goLinearLayout.addOnLayoutChangeListener(new yln(2, this));
                            controlButtonView4.setOnControlButtonClicked(slsVar);
                            controlButtonView3.setOnControlButtonClicked(slsVar2);
                            controlButtonView.setOnControlButtonClicked(slsVar4);
                            controlButtonView2.setOnControlButtonClicked(slsVar3);
                            controlButtonView2.setImageDrawable(getLocationFocusingIcon());
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable allowedPermissionLocationIcon_delegate$lambda$0(MapButtonsView mapButtonsView) {
        return c.k(f1h0.ic_location_fill_24, mapButtonsView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable deniedPermissionLocationIcon_delegate$lambda$0(MapButtonsView mapButtonsView) {
        return c.k(c3h0.ic_places_compass_crossed, mapButtonsView);
    }

    private final Drawable getAllowedPermissionLocationIcon() {
        return (Drawable) this.allowedPermissionLocationIcon.getValue();
    }

    private final Drawable getDeniedPermissionLocationIcon() {
        return (Drawable) this.deniedPermissionLocationIcon.getValue();
    }

    private final Drawable getLocationFocusingIcon() {
        return this.isGeoPermissionAllowed ? getAllowedPermissionLocationIcon() : getDeniedPermissionLocationIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateButtonsMargins() {
        List s = b.s(b.g(new jr31(this.buttonsContainer, 0), new iez(24)));
        int i = 0;
        for (Object obj : s) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            xw31.E((View) obj, null, null, Integer.valueOf(i < scc.f(s) ? tje.u(8, getContext()) : 0), null);
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updateButtonsMargins$lambda$0(View view) {
        return view.getVisibility() == 0;
    }

    public final void addAdditionalButtonView(View view) {
        GoLinearLayout goLinearLayout = this.buttonsContainer;
        goLinearLayout.removeView(view);
        goLinearLayout.addView(view, new FrameLayout.LayoutParams(-2, -2));
    }

    public final void updateCompassButton(boolean isVisible, float azimuth) {
        ControlButtonView controlButtonView = this.binding.b;
        controlButtonView.setVisibility((isVisible && this.isCompassAllowedByCaller) ? 0 : 8);
        controlButtonView.setRotation(360.0f - azimuth);
    }

    public final void updateLocationFocusingButton(boolean isGeoPermissionAllowed) {
        if (this.isGeoPermissionAllowed != isGeoPermissionAllowed) {
            this.isGeoPermissionAllowed = isGeoPermissionAllowed;
            this.binding.c.setImageDrawable(getLocationFocusingIcon());
        }
    }

    public final void updateLocationFocusingButtonVisibility(boolean isVisible) {
        this.binding.c.setVisibility(isVisible ? 0 : 8);
        this.isCompassAllowedByCaller = isVisible;
        if (isVisible) {
            return;
        }
        this.binding.b.setVisibility(8);
    }

    public final void updateZoomButtonsVisibility(boolean isVisible) {
        abc0 abc0Var = this.binding;
        abc0Var.e.setVisibility(isVisible ? 0 : 8);
        abc0Var.d.setVisibility(isVisible ? 0 : 8);
    }

    public /* synthetic */ MapButtonsView(Context context, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, slsVar, slsVar2, slsVar3, slsVar4, (i & 32) != 0 ? false : z);
    }
}
