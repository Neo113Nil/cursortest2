package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.appcompat.view.ContextThemeWrapper;
import com.adjust.sdk.Constants;
import com.yandex.go.taxi.order.analytics.TaxiOrderAnalytics$RideCardPresentation;
import com.yandex.go.taxi.order.analytics.TaxiOrderAnalytics$TaxiOrderStatus;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.payment.sdk.transportcards.ui.FlexDefaultTheme;
import com.yandex.payment.sdk.ui.DefaultTheme;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes2.dex */
public abstract class kpa1 {
    public static final DefaultTheme a(Context context) {
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i != 16 && i == 32) {
            return DefaultTheme.DARK;
        }
        return DefaultTheme.LIGHT;
    }

    public static final boolean b(Uri uri) {
        return jl40.l(uri.getScheme(), Constants.SCHEME) && a.G(fsp0.a, uri.getHost()) && uri.getPathSegments() != null && uri.getPathSegments().size() > 1;
    }

    public static final boolean c(Uri uri) {
        List<String> pathSegments;
        Set<String> queryParameterNames;
        if (jl40.l(uri.getScheme(), Constants.SCHEME) && a.G(fsp0.a, uri.getHost()) && (pathSegments = uri.getPathSegments()) != null && pathSegments.size() == 1 && (queryParameterNames = uri.getQueryParameterNames()) != null && queryParameterNames.size() == 1) {
            Set<String> queryParameterNames2 = uri.getQueryParameterNames();
            if (queryParameterNames2 != null ? queryParameterNames2.contains(SdkUri$QueryParam.CALL_SOURCE.getParamValue()) : false) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(Context context) {
        cvy0 cvy0Var = ckt.a;
        if (cvy0Var == DefaultTheme.LIGHT) {
            return true;
        }
        if (cvy0Var == DefaultTheme.DARK) {
            return false;
        }
        if (cvy0Var == DefaultTheme.SYSTEM_DEFAULT) {
            int i = imr.b[e(a(context)).ordinal()];
            return i == 1 || i != 2;
        }
        Resources.Theme theme = new ContextThemeWrapper(context, ckt.a.a(context).l()).getTheme();
        if (iob1.c(theme, ong0.paymentsdk_is_light_theme) != null) {
            return iob1.d(theme, ong0.paymentsdk_is_light_theme, true);
        }
        int i2 = imr.b[e(a(context)).ordinal()];
        return i2 == 1 || i2 != 2;
    }

    public static final FlexDefaultTheme e(DefaultTheme defaultTheme) {
        int i = imr.a[defaultTheme.ordinal()];
        if (i == 1) {
            return FlexDefaultTheme.LIGHT;
        }
        if (i == 2) {
            return FlexDefaultTheme.DARK;
        }
        if (i == 3) {
            return FlexDefaultTheme.SYSTEM_DEFAULT;
        }
        w511.b();
        return null;
    }

    public static final TaxiOrderAnalytics$RideCardPresentation f(RideCardPresentationType rideCardPresentationType) {
        int i = vbk0.a[rideCardPresentationType.ordinal()];
        if (i == 1) {
            return TaxiOrderAnalytics$RideCardPresentation.Compact;
        }
        if (i == 2) {
            return TaxiOrderAnalytics$RideCardPresentation.Details;
        }
        if (i == 3) {
            return TaxiOrderAnalytics$RideCardPresentation.Sharing;
        }
        if (i == 4) {
            return null;
        }
        w511.b();
        return null;
    }

    public static final TaxiOrderAnalytics$TaxiOrderStatus g(DriveState driveState) {
        switch (vbk0.c[driveState.ordinal()]) {
            case 1:
                return TaxiOrderAnalytics$TaxiOrderStatus.Preorder;
            case 2:
                return TaxiOrderAnalytics$TaxiOrderStatus.Search;
            case 3:
                return TaxiOrderAnalytics$TaxiOrderStatus.Scheduling;
            case 4:
                return TaxiOrderAnalytics$TaxiOrderStatus.Scheduled;
            case 5:
                return TaxiOrderAnalytics$TaxiOrderStatus.CheckIn;
            case 6:
                return TaxiOrderAnalytics$TaxiOrderStatus.Driving;
            case 7:
                return TaxiOrderAnalytics$TaxiOrderStatus.Waiting;
            case 8:
                return TaxiOrderAnalytics$TaxiOrderStatus.Transporting;
            case 9:
                return TaxiOrderAnalytics$TaxiOrderStatus.Complete;
            case 10:
                return TaxiOrderAnalytics$TaxiOrderStatus.Cancelled;
            case 11:
                return TaxiOrderAnalytics$TaxiOrderStatus.Failed;
            case 12:
                return TaxiOrderAnalytics$TaxiOrderStatus.Expired;
            default:
                w511.b();
                return null;
        }
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
