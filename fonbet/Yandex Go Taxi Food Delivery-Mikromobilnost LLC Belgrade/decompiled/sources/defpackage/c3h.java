package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.api.AutoTopupShowOnly;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.card.api.CardManagementSettingStatus;
import com.ybsdk.feature.card.api.entities.CardCarouselProductType;
import com.ybsdk.feature.deeplink.api.DeeplinkSource;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupApiVersion;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupSettingType;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupSetupAction;
import com.ybsdk.feature.testpayment.api.TestPaymentFlow;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;
import java.util.Locale;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public abstract class c3h {
    public static final Text.Constant a(CardManagementSettingStatus cardManagementSettingStatus, Uri uri, SdkUri$QueryParam sdkUri$QueryParam) {
        String l = sd90.l(uri, sdkUri$QueryParam.getParamValue() + cardManagementSettingStatus.getQueryPrefix());
        if (l != null) {
            return g8e.i(Text.Companion, l);
        }
        return null;
    }

    public static final boolean b(Uri uri, DeeplinkSource deeplinkSource) {
        if (deeplinkSource == DeeplinkSource.WEB_VIEW) {
            return jl40.l(uri.getScheme(), "http") || jl40.l(uri.getScheme(), Constants.SCHEME);
        }
        return false;
    }

    public static final AutoTopupApiVersion c(String str) {
        if (jl40.l(str, "v1")) {
            return AutoTopupApiVersion.V1;
        }
        if (jl40.l(str, "v2")) {
            return AutoTopupApiVersion.V2;
        }
        return null;
    }

    public static final AutoTopupType d(String str) {
        if (jl40.l(str, "BALANCE_THRESHOLD")) {
            return AutoTopupType.BALANCE_THRESHOLD;
        }
        if (jl40.l(str, "UP_TO_BALANCE")) {
            return AutoTopupType.UP_TO_BALANCE;
        }
        if (str == null) {
            return null;
        }
        x4c.g("Cannot parse auto topup type", null, str, null, 10);
        return null;
    }

    public static final AutoTopupSettingType e(String str) {
        if (jl40.l(str, "autotopup")) {
            return AutoTopupSettingType.AUTOTOPUP;
        }
        if (jl40.l(str, "autofund")) {
            return AutoTopupSettingType.AUTOFUND;
        }
        return null;
    }

    public static final AutoTopupSetupAction f(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1298848381) {
            if (str.equals("enable")) {
                return AutoTopupSetupAction.ENABLE;
            }
            return null;
        }
        if (hashCode == -793982290) {
            if (str.equals("enable_and_edit")) {
                return AutoTopupSetupAction.ENABLE_AND_EDIT;
            }
            return null;
        }
        if (hashCode == 3108362 && str.equals("edit")) {
            return AutoTopupSetupAction.EDIT;
        }
        return null;
    }

    public static final AutoTopupShowOnly g(String str) {
        if (jl40.l(str, "at")) {
            return AutoTopupShowOnly.AUTO_TOP_UP;
        }
        if (jl40.l(str, "af")) {
            return AutoTopupShowOnly.AUTO_FUND;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static final CardCarouselProductType h(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        switch (lowerCase.hashCode()) {
            case -1272463739:
                if (lowerCase.equals("corp_card")) {
                    return CardCarouselProductType.CORP_CARD;
                }
                break;
            case -819102987:
                if (lowerCase.equals("credit_limit")) {
                    return CardCarouselProductType.CREDIT_LIMIT;
                }
                break;
            case -795192327:
                if (lowerCase.equals("wallet")) {
                    return CardCarouselProductType.WALLET;
                }
                break;
            case 111277:
                if (lowerCase.equals("pro")) {
                    return CardCarouselProductType.PRO;
                }
                break;
        }
        x4c.g("Cannot parse CardProductTypeCarousel type", null, str, null, 10);
        return null;
    }

    public static final TestPaymentFlow i(String str) {
        String upperCase = str != null ? str.toUpperCase(Locale.ROOT) : null;
        if (jl40.l(upperCase, "EXTERNAL")) {
            return TestPaymentFlow.EXTERNAL;
        }
        if (jl40.l(upperCase, "AUTOTOPUP")) {
            return TestPaymentFlow.AUTOTOPUP;
        }
        return null;
    }

    public static final boolean j(Uri uri) {
        return a.G(jsp0.b, uri.getScheme()) || a.G(gay.c, uri.getScheme());
    }

    public static final boolean k(Uri uri) {
        String scheme = uri.getScheme();
        String str = gay.a;
        return ((jl40.l(scheme, gay.a) && a.G(fay.b, uri.getHost())) || (e6b1.d(uri) && (jl40.l(uri.getHost(), "screen.open") || jl40.l(uri.getHost(), Constants.DEEPLINK)))) && uri.getPath() != null;
    }
}
