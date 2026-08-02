package com.yandex.go.chargers.design.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.view.ContextThemeWrapper;
import defpackage.a2i0;
import defpackage.f1h0;
import defpackage.k4o;
import defpackage.kyh0;
import defpackage.o1h0;
import defpackage.ojh0;
import defpackage.oyr;
import defpackage.vng;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.FloatButtonIconComponent;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/yandex/go/chargers/design/components/ChargersGeoButtonIconComponent;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "updateWithState", "()V", "switchToFocusOnUser", "switchToFocusOnRoute", "Lcom/yandex/go/chargers/design/components/ChargersGeoButtonIconComponent$GeoButtonState;", "buttonState", "Lcom/yandex/go/chargers/design/components/ChargersGeoButtonIconComponent$GeoButtonState;", "GeoButtonState", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChargersGeoButtonIconComponent extends FloatButtonIconComponent {
    public static final int $stable = 8;
    private GeoButtonState buttonState;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/chargers/design/components/ChargersGeoButtonIconComponent$GeoButtonState;", "", "", "descriptionRes", CA20Status.STATUS_USER_I, "a", "()I", "iconRes", "b", "ACTION_FOCUS_ON_ROUTE", "ACTION_FOCUS_ON_USER", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class GeoButtonState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ GeoButtonState[] $VALUES;
        public static final GeoButtonState ACTION_FOCUS_ON_ROUTE;
        public static final GeoButtonState ACTION_FOCUS_ON_USER;
        private final int descriptionRes;
        private final int iconRes;

        static {
            GeoButtonState geoButtonState = new GeoButtonState("ACTION_FOCUS_ON_ROUTE", 0, kyh0.scooters_focus_on_route_button_description, o1h0.ic_chargers_route);
            ACTION_FOCUS_ON_ROUTE = geoButtonState;
            GeoButtonState geoButtonState2 = new GeoButtonState("ACTION_FOCUS_ON_USER", 1, kyh0.detect_my_location_description, f1h0.ic_location_fill_24);
            ACTION_FOCUS_ON_USER = geoButtonState2;
            GeoButtonState[] geoButtonStateArr = {geoButtonState, geoButtonState2};
            $VALUES = geoButtonStateArr;
            $ENTRIES = a.a(geoButtonStateArr);
        }

        public GeoButtonState(String str, int i, int i2, int i3) {
            this.descriptionRes = i2;
            this.iconRes = i3;
        }

        public static GeoButtonState valueOf(String str) {
            return (GeoButtonState) Enum.valueOf(GeoButtonState.class, str);
        }

        public static GeoButtonState[] values() {
            return (GeoButtonState[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final int getDescriptionRes() {
            return this.descriptionRes;
        }

        /* renamed from: b, reason: from getter */
        public final int getIconRes() {
            return this.iconRes;
        }
    }

    public ChargersGeoButtonIconComponent(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.buttonState = GeoButtonState.ACTION_FOCUS_ON_USER;
        setRotationY(getResources().getInteger(ojh0.rtl_support_angle_for_image_mirrored));
        updateWithState();
    }

    private final void updateWithState() {
        int iconRes = this.buttonState.getIconRes();
        Drawable t = vng.t(iconRes, new ContextThemeWrapper(getContext(), a2i0.IconDefaultStyle));
        if (t == null) {
            w511.f(oyr.j(iconRes, "Drawable resource ", " not found"));
        } else {
            setIcon(t);
            setContentDescription(getResources().getString(this.buttonState.getDescriptionRes()));
        }
    }

    public final void switchToFocusOnRoute() {
        this.buttonState = GeoButtonState.ACTION_FOCUS_ON_ROUTE;
        updateWithState();
    }

    public final void switchToFocusOnUser() {
        this.buttonState = GeoButtonState.ACTION_FOCUS_ON_USER;
        updateWithState();
    }

    public ChargersGeoButtonIconComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ChargersGeoButtonIconComponent(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public ChargersGeoButtonIconComponent(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ ChargersGeoButtonIconComponent(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
