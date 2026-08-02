package defpackage;

import android.net.Uri;
import androidx.compose.ui.platform.m;
import com.ybsdk.core.common.utils.theme.LateInitColorCallbackImpl;
import com.ybsdk.core.common.utils.theme.ThemedBooleanParams;
import com.ybsdk.core.common.utils.theme.ThemedStringParams;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.b;
import com.ybsdk.screens.initial.deeplink.SdkUri$InternalQueryParam;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;
import defpackage.g131;
import defpackage.v2w;
import defpackage.wp2;
import defpackage.zy11;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class bzk0 {
    public static au2 a;

    public static final Uri.Builder a(Uri.Builder builder, SdkUri$QueryParam sdkUri$QueryParam, String str) {
        return builder.appendQueryParameter(sdkUri$QueryParam.getParamValue(), str);
    }

    public static final Date b(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static final f530 c(f530 f530Var, final wp2 wp2Var, final ehr0 ehr0Var) {
        return f530Var.k(new ch4(wp2Var, ehr0Var, m.b ? new tls() { // from class: com.yandex.go.design.compose.colors.BackgroundKt$background$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                wp2 wp2Var2 = wp2.this;
                g131 g131Var = v2wVar.a;
                g131Var.b("color", wp2Var2);
                g131Var.b("shape", ehr0Var);
                return zy11.a;
            }
        } : m.a()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.ybsdk.core.utils.ColorModel$Hex] */
    public static final ColorModel d(Uri uri, SdkUri$QueryParam sdkUri$QueryParam, ColorModel.Attr attr) {
        String paramValue = sdkUri$QueryParam.getParamValue();
        String l = sd90.l(uri, paramValue);
        String l2 = sd90.l(uri, paramValue.concat("_dark"));
        ColorModel.Hex.Companion.getClass();
        ColorModel a2 = b.a(l);
        if (a2 == null) {
            a2 = attr;
        }
        ?? a3 = b.a(l2);
        if (a3 != 0) {
            attr = a3;
        }
        return (l == null || l2 == null) ? a2 : new ColorModel.LateInitColor(new LateInitColorCallbackImpl(a2, attr));
    }

    public static final ThemedBooleanParams e(Uri uri, SdkUri$QueryParam sdkUri$QueryParam, wls wlsVar) {
        String paramValue = sdkUri$QueryParam.getParamValue();
        return new ThemedBooleanParams((Boolean) wlsVar.invoke(sd90.l(uri, paramValue), Boolean.FALSE), (Boolean) wlsVar.invoke(sd90.l(uri, paramValue.concat("_dark")), Boolean.TRUE));
    }

    public static final ThemedStringParams f(Uri uri, SdkUri$QueryParam sdkUri$QueryParam, gse gseVar) {
        String paramValue = sdkUri$QueryParam.getParamValue();
        return new ThemedStringParams((String) gseVar.invoke(sd90.l(uri, paramValue), Boolean.FALSE), (String) gseVar.invoke(sd90.l(uri, paramValue.concat("_dark")), Boolean.TRUE));
    }

    public static final Uri g(Uri uri, SdkUri$QueryParam sdkUri$QueryParam) {
        return sd90.g(uri, sdkUri$QueryParam.getParamValue());
    }

    public static final Uri h(Uri uri, SdkUri$InternalQueryParam sdkUri$InternalQueryParam, Object obj) {
        return sd90.k(uri, sdkUri$InternalQueryParam.getParamValue(), obj);
    }

    public static final boolean i(Uri uri, SdkUri$QueryParam sdkUri$QueryParam, boolean z) {
        String paramValue = sdkUri$QueryParam.getParamValue();
        try {
            return uri.getBooleanQueryParameter(paramValue, z);
        } catch (Exception e) {
            x4c.g("Error to parse uri", e, "uri: " + uri + ", parameter: " + paramValue, null, 8);
            return z;
        }
    }

    public static final Integer k(Uri uri, SdkUri$QueryParam sdkUri$QueryParam) {
        String paramValue = sdkUri$QueryParam.getParamValue();
        try {
            String l = sd90.l(uri, paramValue);
            if (l != null) {
                return Integer.valueOf(Integer.parseInt(l));
            }
            return null;
        } catch (Exception e) {
            x4c.g("Error to parse uri", e, "uri: " + uri + ", parameter: " + paramValue, null, 8);
            return null;
        }
    }

    public static final Long l(Uri uri, SdkUri$QueryParam sdkUri$QueryParam) {
        String paramValue = sdkUri$QueryParam.getParamValue();
        try {
            String l = sd90.l(uri, paramValue);
            if (l != null) {
                return Long.valueOf(Long.parseLong(l));
            }
            return null;
        } catch (Exception e) {
            x4c.g("Error to parse uri", e, "uri: " + uri + ", parameter: " + paramValue, null, 8);
            return null;
        }
    }

    public static final List m(Uri uri, SdkUri$QueryParam sdkUri$QueryParam) {
        String paramValue = sdkUri$QueryParam.getParamValue();
        EmptyList emptyList = EmptyList.a;
        try {
            List<String> queryParameters = uri.getQueryParameters(paramValue);
            return queryParameters == null ? emptyList : queryParameters;
        } catch (Exception e) {
            i5z0.a.e(e);
            return emptyList;
        }
    }

    public static final String n(Uri uri, SdkUri$InternalQueryParam sdkUri$InternalQueryParam) {
        return sd90.l(uri, sdkUri$InternalQueryParam.getParamValue());
    }

    public static final String o(Uri uri, SdkUri$QueryParam sdkUri$QueryParam) {
        return sd90.l(uri, sdkUri$QueryParam.getParamValue());
    }
}
