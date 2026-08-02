package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.search.AbsoluteDistance;
import com.yandex.mapkit.search.BusinessObjectMetadata;
import com.yandex.mapkit.search.RelativeDistance;
import com.yandex.mapkit.search.RouteDistancesObjectMetadata;
import com.yandex.mapkit.search.TravelInfo;
import java.util.Locale;

/* loaded from: classes15.dex */
public abstract class jcb1 {
    public static final long a(int i) {
        long j = i << 32;
        int i2 = mhx.O;
        return j;
    }

    public static final BusinessObjectMetadata b(GeoObject geoObject) {
        return (BusinessObjectMetadata) geoObject.getMetadataContainer().getItem(BusinessObjectMetadata.class);
    }

    public static final String c(RouteDistancesObjectMetadata routeDistancesObjectMetadata) {
        RelativeDistance relative;
        TravelInfo driving;
        LocalizedValue duration;
        AbsoluteDistance absolute;
        TravelInfo driving2;
        LocalizedValue duration2;
        String text;
        if (routeDistancesObjectMetadata != null && (absolute = routeDistancesObjectMetadata.getAbsolute()) != null && (driving2 = absolute.getDriving()) != null && (duration2 = driving2.getDuration()) != null && (text = duration2.getText()) != null) {
            return text;
        }
        if (routeDistancesObjectMetadata == null || (relative = routeDistancesObjectMetadata.getRelative()) == null || (driving = relative.getDriving()) == null || (duration = driving.getDuration()) == null) {
            return null;
        }
        return duration.getText();
    }

    public static final String d(vts vtsVar) {
        String str = vtsVar.b;
        if (str.length() <= 0) {
            return str;
        }
        return ((Object) String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT)) + str.substring(1);
    }

    public static final mtr0 e(boolean z, eur0 eur0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        fwi fwiVar = (fwi) btsVar.m(j.h);
        float f = ((Configuration) btsVar.m(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
        boolean z2 = ((((i & 14) ^ 6) > 4 && btsVar.a(z)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && btsVar.k(eur0Var)) || (i & 48) == 32);
        Object Q = btsVar.Q();
        if (z2 || Q == did.a) {
            Q = new mtr0(f, eur0Var, z, fwiVar);
            btsVar.o0(Q);
        }
        return (mtr0) Q;
    }
}
