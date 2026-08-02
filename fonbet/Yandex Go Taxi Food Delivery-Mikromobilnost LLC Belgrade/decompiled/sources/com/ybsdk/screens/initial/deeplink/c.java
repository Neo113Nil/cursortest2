package com.ybsdk.screens.initial.deeplink;

import android.net.Uri;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.common.screen.api.DivkitCommonStatusBar;
import com.ybsdk.feature.divkit.common.screen.api.DivkitHeader;
import com.ybsdk.feature.divkit.common.screen.api.DivkitScreenConfig;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import defpackage.b64;
import defpackage.bzk0;
import defpackage.mks0;
import defpackage.ri91;
import defpackage.txk;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.x4c;
import defpackage.y1x0;
import defpackage.z1x0;

/* loaded from: classes9.dex */
public final class c {
    public static void e(String str, String str2) {
        x4c.g("Error while parsing", null, b64.l("Path /divkit, Parameter ", str, ": Unknown value ", str2), null, 10);
    }

    public final DeeplinkAction.Divkit a(Uri uri) {
        SdkUri$QueryParam sdkUri$QueryParam = SdkUri$QueryParam.PATH;
        String o = bzk0.o(uri, sdkUri$QueryParam);
        String o2 = bzk0.o(uri, SdkUri$QueryParam.SKELETON);
        String o3 = bzk0.o(uri, SdkUri$QueryParam.SCREEN);
        String o4 = bzk0.o(uri, SdkUri$QueryParam.TOOLBAR_SUBTITLE);
        String o5 = bzk0.o(uri, SdkUri$QueryParam.TOOLBAR_TITLE);
        String o6 = bzk0.o(uri, SdkUri$QueryParam.PAYLOAD);
        String o7 = bzk0.o(uri, SdkUri$QueryParam.SCREEN_KEY);
        if (o7 == null) {
            o7 = "";
        }
        boolean i = (o5 == null && o4 == null) ? bzk0.i(uri, SdkUri$QueryParam.SHOW_NAVBAR, true) : true;
        boolean i2 = bzk0.i(uri, SdkUri$QueryParam.FIT_WINDOW_TOP, i);
        boolean i3 = bzk0.i(uri, SdkUri$QueryParam.ONLY_INITIAL_DATA_LOAD, true);
        String o8 = bzk0.o(uri, SdkUri$QueryParam.BOTTOM_BAR_ITEM_ID);
        if (o != null) {
            if (ri91.a(o)) {
                return new DeeplinkAction.Divkit(o, o2, o3, new DivkitScreenConfig(i, new DivkitHeader(o5, o4), d(uri, i2), c(uri, i2), i2, i3, o8), o7, o6);
            }
            x4c.g("Invalid path param", null, unr0.n(uri, "uri="), null, 10);
            return null;
        }
        x4c.g("Some required fields is absent", null, "action=/divkit; params=" + sdkUri$QueryParam + "}", null, 10);
        return null;
    }

    public final DeeplinkAction.A3RequisitesDivkit b(Uri uri) {
        String o = bzk0.o(uri, SdkUri$QueryParam.INVOICE_ID);
        if (o == null) {
            return null;
        }
        boolean i = bzk0.i(uri, SdkUri$QueryParam.FIT_WINDOW_TOP, true);
        return new DeeplinkAction.A3RequisitesDivkit("/v1/transfers/a3/screen/invoice_requisites", mks0.b.l(), "a3_requisites", new DivkitScreenConfig(false, new DivkitHeader(null, null), d(uri, i), c(uri, i), i, bzk0.i(uri, SdkUri$QueryParam.ONLY_INITIAL_DATA_LOAD, true), null, 64, null), o);
    }

    public final DivkitCommonStatusBar c(Uri uri, boolean z) {
        ColorModel.Attr c;
        SdkUri$QueryParam sdkUri$QueryParam = SdkUri$QueryParam.BOTTOM_BAR_COLOR;
        if (z) {
            c = new ColorModel.Attr(ung0.ybColor_background_primary);
        } else {
            ColorModel.Attr attr = z1x0.c;
            c = y1x0.c();
        }
        return new DivkitCommonStatusBar(bzk0.d(uri, sdkUri$QueryParam, c), bzk0.e(uri, SdkUri$QueryParam.BOTTOM_BAR_STYLE, new txk(1, this)));
    }

    public final DivkitCommonStatusBar d(Uri uri, boolean z) {
        ColorModel.Attr c;
        SdkUri$QueryParam sdkUri$QueryParam = SdkUri$QueryParam.HEADER_COLOR;
        if (z) {
            c = new ColorModel.Attr(ung0.ybColor_background_primary);
        } else {
            ColorModel.Attr attr = z1x0.c;
            c = y1x0.c();
        }
        return new DivkitCommonStatusBar(bzk0.d(uri, sdkUri$QueryParam, c), bzk0.e(uri, SdkUri$QueryParam.STATUSBAR_STYLE, new txk(0, this)));
    }
}
