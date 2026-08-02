package com.yandex.go.places.base.ui.base_old.map;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.places.base.ui.base_old.map.MapControlButtonsContainerView;
import com.yandex.go.places.common.ui.ControlButtonView;
import defpackage.c3h0;
import defpackage.cma1;
import defpackage.f1h0;
import defpackage.i3y;
import defpackage.i6h0;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.puh0;
import defpackage.sls;
import defpackage.sw60;
import defpackage.wg00;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.design.utils.c;

@jxi
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010!\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0012R\u001d\u0010$\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010\u0012¨\u0006'"}, d2 = {"Lcom/yandex/go/places/base/ui/base_old/map/MapControlButtonsContainerView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lzy11;", "onZoomInButtonClicked", "onZoomOutButtonClicked", "onLocationFocusingButtonClicked", "onCompassButtonClicked", "", "isGeoPermissionAllowed", "showGeoButton", "showZoomButtons", "<init>", "(Landroid/content/Context;Lsls;Lsls;Lsls;Lsls;ZZZ)V", "Landroid/graphics/drawable/Drawable;", "getLocationFocusingIcon", "()Landroid/graphics/drawable/Drawable;", "updateLocationFocusingButton", "(Z)V", "isVisible", "", "azimuth", "updateCompassButton", "(ZF)V", "Z", "Lsw60;", "binding", "Lsw60;", "deniedPermissionLocationIcon$delegate", "Li3y;", "getDeniedPermissionLocationIcon", "deniedPermissionLocationIcon", "allowedPermissionLocationIcon$delegate", "getAllowedPermissionLocationIcon", "allowedPermissionLocationIcon", "Companion", "wg00", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapControlButtonsContainerView extends GoFrameLayout {
    public static final wg00 Companion = new wg00();
    public static final int FULL_ROTATION_DEGREES = 360;

    /* renamed from: allowedPermissionLocationIcon$delegate, reason: from kotlin metadata */
    private final i3y allowedPermissionLocationIcon;
    private final sw60 binding;

    /* renamed from: deniedPermissionLocationIcon$delegate, reason: from kotlin metadata */
    private final i3y deniedPermissionLocationIcon;
    private boolean isGeoPermissionAllowed;
    private final boolean showGeoButton;

    public MapControlButtonsContainerView(Context context, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4, boolean z, boolean z2, boolean z3) {
        super(context, null, 0, 0, 14, null);
        this.isGeoPermissionAllowed = z;
        this.showGeoButton = z2;
        View inflate = LayoutInflater.from(context).inflate(puh0.old_places_map_control_buttons_container, (ViewGroup) this, false);
        addView(inflate);
        int i = i6h0.compass_button;
        ControlButtonView controlButtonView = (ControlButtonView) cma1.O(i, inflate);
        if (controlButtonView != null) {
            i = i6h0.location_focusing_button;
            ControlButtonView controlButtonView2 = (ControlButtonView) cma1.O(i, inflate);
            if (controlButtonView2 != null) {
                i = i6h0.minus_button;
                ControlButtonView controlButtonView3 = (ControlButtonView) cma1.O(i, inflate);
                if (controlButtonView3 != null) {
                    i = i6h0.plus_button;
                    ControlButtonView controlButtonView4 = (ControlButtonView) cma1.O(i, inflate);
                    if (controlButtonView4 != null) {
                        this.binding = new sw60((GoConstraintLayout) inflate, controlButtonView, controlButtonView2, controlButtonView3, controlButtonView4);
                        sls slsVar5 = new sls(this) { // from class: vg00
                            public final /* synthetic */ MapControlButtonsContainerView b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                Drawable deniedPermissionLocationIcon_delegate$lambda$0;
                                Drawable allowedPermissionLocationIcon_delegate$lambda$0;
                                int i2 = r2;
                                MapControlButtonsContainerView mapControlButtonsContainerView = this.b;
                                switch (i2) {
                                    case 0:
                                        deniedPermissionLocationIcon_delegate$lambda$0 = MapControlButtonsContainerView.deniedPermissionLocationIcon_delegate$lambda$0(mapControlButtonsContainerView);
                                        return deniedPermissionLocationIcon_delegate$lambda$0;
                                    default:
                                        allowedPermissionLocationIcon_delegate$lambda$0 = MapControlButtonsContainerView.allowedPermissionLocationIcon_delegate$lambda$0(mapControlButtonsContainerView);
                                        return allowedPermissionLocationIcon_delegate$lambda$0;
                                }
                            }
                        };
                        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                        this.deniedPermissionLocationIcon = a.b(lazyThreadSafetyMode, slsVar5);
                        final int i2 = 1;
                        this.allowedPermissionLocationIcon = a.b(lazyThreadSafetyMode, new sls(this) { // from class: vg00
                            public final /* synthetic */ MapControlButtonsContainerView b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                Drawable deniedPermissionLocationIcon_delegate$lambda$0;
                                Drawable allowedPermissionLocationIcon_delegate$lambda$0;
                                int i22 = i2;
                                MapControlButtonsContainerView mapControlButtonsContainerView = this.b;
                                switch (i22) {
                                    case 0:
                                        deniedPermissionLocationIcon_delegate$lambda$0 = MapControlButtonsContainerView.deniedPermissionLocationIcon_delegate$lambda$0(mapControlButtonsContainerView);
                                        return deniedPermissionLocationIcon_delegate$lambda$0;
                                    default:
                                        allowedPermissionLocationIcon_delegate$lambda$0 = MapControlButtonsContainerView.allowedPermissionLocationIcon_delegate$lambda$0(mapControlButtonsContainerView);
                                        return allowedPermissionLocationIcon_delegate$lambda$0;
                                }
                            }
                        });
                        setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                        controlButtonView4.setOnControlButtonClicked(slsVar);
                        controlButtonView3.setOnControlButtonClicked(slsVar2);
                        controlButtonView.setOnControlButtonClicked(slsVar4);
                        controlButtonView2.setOnControlButtonClicked(slsVar3);
                        controlButtonView2.setImageDrawable(getLocationFocusingIcon());
                        controlButtonView4.setVisibility(z3 ? 0 : 8);
                        controlButtonView3.setVisibility(z3 ? 0 : 8);
                        controlButtonView2.setVisibility(z2 ? 0 : 8);
                        if (z2) {
                            return;
                        }
                        controlButtonView.setVisibility(8);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable allowedPermissionLocationIcon_delegate$lambda$0(MapControlButtonsContainerView mapControlButtonsContainerView) {
        return c.k(f1h0.ic_location_fill_24, mapControlButtonsContainerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable deniedPermissionLocationIcon_delegate$lambda$0(MapControlButtonsContainerView mapControlButtonsContainerView) {
        return c.k(c3h0.ic_places_compass_crossed, mapControlButtonsContainerView);
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

    public final void updateCompassButton(boolean isVisible, float azimuth) {
        ControlButtonView controlButtonView = this.binding.b;
        controlButtonView.setVisibility((isVisible && this.showGeoButton) ? 0 : 8);
        controlButtonView.setRotation(360.0f - azimuth);
    }

    public final void updateLocationFocusingButton(boolean isGeoPermissionAllowed) {
        if (this.isGeoPermissionAllowed != isGeoPermissionAllowed) {
            this.isGeoPermissionAllowed = isGeoPermissionAllowed;
            this.binding.c.setImageDrawable(getLocationFocusingIcon());
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MapControlButtonsContainerView(android.content.Context r12, defpackage.sls r13, defpackage.sls r14, defpackage.sls r15, defpackage.sls r16, boolean r17, boolean r18, boolean r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 32
            if (r1 == 0) goto L9
            r1 = 0
            r8 = r1
            goto Lb
        L9:
            r8 = r17
        Lb:
            r1 = r0 & 64
            r2 = 1
            if (r1 == 0) goto L12
            r9 = r2
            goto L14
        L12:
            r9 = r18
        L14:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L21
            r10 = r2
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r2 = r11
            goto L2a
        L21:
            r10 = r19
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
        L2a:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.go.places.base.ui.base_old.map.MapControlButtonsContainerView.<init>(android.content.Context, sls, sls, sls, sls, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
