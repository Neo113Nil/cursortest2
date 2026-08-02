package defpackage;

import android.net.Uri;
import androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import com.ybsdk.deeplink.generated.SavingsAccountCloseDepositAction;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import io.appmetrica.analytics.BuildConfig;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes3.dex */
public abstract class cya1 {
    public static amt a;

    public static SavingsAccountCloseDepositAction a(Uri uri) {
        String queryParameter = uri.getQueryParameter("agreement_id");
        if (queryParameter == null) {
            return null;
        }
        return new SavingsAccountCloseDepositAction(queryParameter, uri.getQueryParameter("title"), uri.getQueryParameter("subtitle"), uri.getQueryParameter("image"), uri.getQueryParameter("action_button_title"), uri.getQueryParameter("secondary_button_title"), uri.getQueryParameter(MetaDataField.DATE_FIELD), uri.getQueryParameter("full"), uri.getQueryParameter("total"), uri.getQueryParameter("profit"), uri.getQueryParameter("penalty"), uri.getQueryParameter("version"));
    }

    public static void b(InAppWebView inAppWebView, ys41 ys41Var) {
        inAppWebView.setWebViewRenderProcessClient(ys41Var != null ? new WebViewRenderProcessClientFrameworkAdapter(ys41Var) : null);
    }

    public static int c(int i) {
        if (i == 90) {
            return 91;
        }
        if (i == 91) {
            return 92;
        }
        if (i == 93) {
            return 94;
        }
        if (i == 94) {
            return 95;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case SAFETY_TIPS_VALUE:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case SODA_DE_DE_VALUE:
                return 56;
            case 56:
                return 57;
            case SODA_ES_ES_VALUE:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case TRANSLATE_KIT_VALUE:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case HProv.ALG_SID_GR3410_12_256 /* 73 */:
                return 74;
            case 74:
                return 75;
            case HProv.PROV_GOST_2001_DH /* 75 */:
                return 76;
            case CalendarDayView.DISABLED_DAY_ALPHA /* 76 */:
                return 77;
            case HProv.ALG_SID_SHA3_224 /* 77 */:
                return 78;
            case HProv.ALG_SID_SHA3_256 /* 78 */:
                return 79;
            case HProv.ALG_SID_SHA3_384 /* 79 */:
                return 80;
            default:
                switch (i) {
                    case HProv.PP_RESERVED1 /* 96 */:
                        return 97;
                    case HProv.PP_BIO_STATISTICA_LEN /* 97 */:
                        return 98;
                    case HProv.PP_REBOOT /* 98 */:
                        return 99;
                    case 99:
                        return 100;
                    case 100:
                        return 101;
                    case 101:
                        return 102;
                    case 102:
                        return 103;
                    case 103:
                        return 104;
                    case 104:
                        return 105;
                    case 105:
                        return 106;
                    case 106:
                        return HProv.PP_SET_PIN;
                    case HProv.PP_SET_PIN /* 107 */:
                        return 108;
                    case 108:
                        return 109;
                    case 109:
                        return 110;
                    case 110:
                        return 111;
                    case 111:
                        return 112;
                    case 112:
                        return 113;
                    case 113:
                        return 114;
                    case 114:
                        return HProv.PP_CACHE_SIZE;
                    case HProv.PP_CACHE_SIZE /* 115 */:
                        return BuildConfig.API_LEVEL;
                    case BuildConfig.API_LEVEL /* 116 */:
                        return HProv.PP_NK_SYNC;
                    case HProv.PP_NK_SYNC /* 117 */:
                        return HProv.PP_INFO;
                    case HProv.PP_INFO /* 118 */:
                        return 119;
                    case 119:
                        return 120;
                    case 120:
                        return Constants.VPN_TRAFFIC;
                    case Constants.VPN_TRAFFIC /* 121 */:
                        return 122;
                    default:
                        return 0;
                }
        }
    }
}
