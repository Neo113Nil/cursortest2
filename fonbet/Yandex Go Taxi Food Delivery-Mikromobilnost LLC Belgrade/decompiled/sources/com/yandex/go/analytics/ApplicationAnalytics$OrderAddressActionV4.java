package com.yandex.go.analytics;

import com.adjust.sdk.Constants;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"com/yandex/go/analytics/ApplicationAnalytics$OrderAddressActionV4", "", "Lcom/yandex/go/analytics/ApplicationAnalytics$OrderAddressActionV4;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Auto", "Geo", "Manual", "ManualPickupPointAuto", "ManualPickupPointDrag", "ManualPickupPointTap", "ManualPanoramaPickupPoint", "ManualAlternativePickupPointATap", "WhereYouAre", "ClarifyPickupPointDrag", "ClarifyPickupPointTap", "ClarifyGeo", "ClarifyManual", "Deeplink", "AddressCorrection", "Shortcut", "Uri", "go-client-android.features.analytics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ApplicationAnalytics$OrderAddressActionV4 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ApplicationAnalytics$OrderAddressActionV4[] $VALUES;
    public static final ApplicationAnalytics$OrderAddressActionV4 AddressCorrection;
    public static final ApplicationAnalytics$OrderAddressActionV4 Auto;
    public static final ApplicationAnalytics$OrderAddressActionV4 ClarifyGeo;
    public static final ApplicationAnalytics$OrderAddressActionV4 ClarifyManual;
    public static final ApplicationAnalytics$OrderAddressActionV4 ClarifyPickupPointDrag;
    public static final ApplicationAnalytics$OrderAddressActionV4 ClarifyPickupPointTap;
    public static final ApplicationAnalytics$OrderAddressActionV4 Deeplink;
    public static final ApplicationAnalytics$OrderAddressActionV4 Geo;
    public static final ApplicationAnalytics$OrderAddressActionV4 Manual;
    public static final ApplicationAnalytics$OrderAddressActionV4 ManualAlternativePickupPointATap;
    public static final ApplicationAnalytics$OrderAddressActionV4 ManualPanoramaPickupPoint;
    public static final ApplicationAnalytics$OrderAddressActionV4 ManualPickupPointAuto;
    public static final ApplicationAnalytics$OrderAddressActionV4 ManualPickupPointDrag;
    public static final ApplicationAnalytics$OrderAddressActionV4 ManualPickupPointTap;
    public static final ApplicationAnalytics$OrderAddressActionV4 Shortcut;
    public static final ApplicationAnalytics$OrderAddressActionV4 Uri;
    public static final ApplicationAnalytics$OrderAddressActionV4 WhereYouAre;
    private final String eventValue;

    static {
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV4 = new ApplicationAnalytics$OrderAddressActionV4("Auto", 0, "auto");
        Auto = applicationAnalytics$OrderAddressActionV4;
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV42 = new ApplicationAnalytics$OrderAddressActionV4("Geo", 1, "geo");
        Geo = applicationAnalytics$OrderAddressActionV42;
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV43 = new ApplicationAnalytics$OrderAddressActionV4("Manual", 2, "manual");
        Manual = applicationAnalytics$OrderAddressActionV43;
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV44 = new ApplicationAnalytics$OrderAddressActionV4("ManualPickupPointAuto", 3, "manual.pickup_point_auto");
        ManualPickupPointAuto = applicationAnalytics$OrderAddressActionV44;
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV45 = new ApplicationAnalytics$OrderAddressActionV4("ManualPickupPointDrag", 4, "manual.pickup_point_drag");
        ManualPickupPointDrag = applicationAnalytics$OrderAddressActionV45;
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV46 = new ApplicationAnalytics$OrderAddressActionV4("ManualPickupPointTap", 5, "manual.pickup_point_tap");
        ManualPickupPointTap = applicationAnalytics$OrderAddressActionV46;
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV47 = new ApplicationAnalytics$OrderAddressActionV4("ManualPanoramaPickupPoint", 6, "manual.panorama_pickup_point");
        ManualPanoramaPickupPoint = applicationAnalytics$OrderAddressActionV47;
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV48 = new ApplicationAnalytics$OrderAddressActionV4("ManualAlternativePickupPointATap", 7, "manual.alternative_pickup_point_a_tap");
        ManualAlternativePickupPointATap = applicationAnalytics$OrderAddressActionV48;
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV49 = new ApplicationAnalytics$OrderAddressActionV4("WhereYouAre", 8, "where_you_are");
        WhereYouAre = applicationAnalytics$OrderAddressActionV49;
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV410 = new ApplicationAnalytics$OrderAddressActionV4("ClarifyPickupPointDrag", 9, "clarify.pickup_point_drag");
        ClarifyPickupPointDrag = applicationAnalytics$OrderAddressActionV410;
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV411 = new ApplicationAnalytics$OrderAddressActionV4("ClarifyPickupPointTap", 10, "clarify.pickup_point_tap");
        ClarifyPickupPointTap = applicationAnalytics$OrderAddressActionV411;
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV412 = new ApplicationAnalytics$OrderAddressActionV4("ClarifyGeo", 11, "clarify.geo");
        ClarifyGeo = applicationAnalytics$OrderAddressActionV412;
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV413 = new ApplicationAnalytics$OrderAddressActionV4("ClarifyManual", 12, "clarify.manual");
        ClarifyManual = applicationAnalytics$OrderAddressActionV413;
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV414 = new ApplicationAnalytics$OrderAddressActionV4("Deeplink", 13, Constants.DEEPLINK);
        Deeplink = applicationAnalytics$OrderAddressActionV414;
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV415 = new ApplicationAnalytics$OrderAddressActionV4("AddressCorrection", 14, "addressCorrection");
        AddressCorrection = applicationAnalytics$OrderAddressActionV415;
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV416 = new ApplicationAnalytics$OrderAddressActionV4("Shortcut", 15, "shortcut");
        Shortcut = applicationAnalytics$OrderAddressActionV416;
        ApplicationAnalytics$OrderAddressActionV4 applicationAnalytics$OrderAddressActionV417 = new ApplicationAnalytics$OrderAddressActionV4("Uri", 16, LaunchBrowserActivity.KEY_URI);
        Uri = applicationAnalytics$OrderAddressActionV417;
        ApplicationAnalytics$OrderAddressActionV4[] applicationAnalytics$OrderAddressActionV4Arr = {applicationAnalytics$OrderAddressActionV4, applicationAnalytics$OrderAddressActionV42, applicationAnalytics$OrderAddressActionV43, applicationAnalytics$OrderAddressActionV44, applicationAnalytics$OrderAddressActionV45, applicationAnalytics$OrderAddressActionV46, applicationAnalytics$OrderAddressActionV47, applicationAnalytics$OrderAddressActionV48, applicationAnalytics$OrderAddressActionV49, applicationAnalytics$OrderAddressActionV410, applicationAnalytics$OrderAddressActionV411, applicationAnalytics$OrderAddressActionV412, applicationAnalytics$OrderAddressActionV413, applicationAnalytics$OrderAddressActionV414, applicationAnalytics$OrderAddressActionV415, applicationAnalytics$OrderAddressActionV416, applicationAnalytics$OrderAddressActionV417};
        $VALUES = applicationAnalytics$OrderAddressActionV4Arr;
        $ENTRIES = kotlin.enums.a.a(applicationAnalytics$OrderAddressActionV4Arr);
    }

    public ApplicationAnalytics$OrderAddressActionV4(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ApplicationAnalytics$OrderAddressActionV4 valueOf(String str) {
        return (ApplicationAnalytics$OrderAddressActionV4) Enum.valueOf(ApplicationAnalytics$OrderAddressActionV4.class, str);
    }

    public static ApplicationAnalytics$OrderAddressActionV4[] values() {
        return (ApplicationAnalytics$OrderAddressActionV4[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
