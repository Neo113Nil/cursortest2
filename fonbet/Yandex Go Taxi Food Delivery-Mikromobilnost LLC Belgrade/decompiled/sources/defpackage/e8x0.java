package defpackage;

import android.location.Geocoder;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import ru.yandex.tankerapp.geocoding.domain.a;
import ru.yandex.tankerapp.geocoding.domain.errors.GeocodingError;

/* loaded from: classes5.dex */
public final class e8x0 implements tsr, ca20 {
    public ea20 a;
    public a b;

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        this.b = new a(ssrVar.a);
        ea20 ea20Var = new ea20(ssrVar.c, "tanker_geocoding");
        this.a = ea20Var;
        ea20Var.b(this);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ea20 ea20Var = this.a;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
        a aVar = this.b;
        if (aVar == null) {
            aVar = null;
        }
        bvf0.j(aVar.c, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        Locale locale;
        String str = x920Var.a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1276560131:
                    if (str.equals("placemarkFromCoordinates")) {
                        Map map = (Map) x920Var.b;
                        Object obj = map.get("latitude");
                        Double d = obj instanceof Double ? (Double) obj : null;
                        Object obj2 = map.get("longitude");
                        Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
                        if (d != null && d2 != null) {
                            a aVar = this.b;
                            (aVar == null ? null : aVar).e(d.doubleValue(), d2.doubleValue(), (ba20) da20Var);
                            break;
                        } else {
                            GeocodingError.InvalidArguments invalidArguments = GeocodingError.InvalidArguments.a;
                            ((ba20) da20Var).error(invalidArguments.getErrorCode(), invalidArguments.getErrorMessage(), null);
                            break;
                        }
                    }
                    break;
                case -898056143:
                    if (str.equals("isPresent")) {
                        a aVar2 = this.b;
                        (aVar2 != null ? aVar2 : null).getClass();
                        ((ba20) da20Var).success(Boolean.valueOf(Geocoder.isPresent()));
                        break;
                    }
                    break;
                case -533029387:
                    if (str.equals("locationFromAddress")) {
                        Object obj3 = ((Map) x920Var.b).get("address");
                        String str2 = obj3 instanceof String ? (String) obj3 : null;
                        if (str2 == null) {
                            GeocodingError.InvalidArguments invalidArguments2 = GeocodingError.InvalidArguments.a;
                            ((ba20) da20Var).error(invalidArguments2.getErrorCode(), invalidArguments2.getErrorMessage(), null);
                            break;
                        } else {
                            a aVar3 = this.b;
                            (aVar3 != null ? aVar3 : null).d(str2, (ba20) da20Var);
                            break;
                        }
                    }
                    break;
                case 930278181:
                    if (str.equals("setLocaleIdentifier")) {
                        Map map2 = (Map) x920Var.b;
                        a aVar4 = this.b;
                        if (aVar4 == null) {
                            aVar4 = null;
                        }
                        Object obj4 = map2.get("localeIdentifier");
                        String str3 = obj4 instanceof String ? (String) obj4 : null;
                        if (str3 != null) {
                            aVar4.getClass();
                            if ((!evu0.J(str3) ? str3 : null) != null) {
                                StringTokenizer stringTokenizer = new StringTokenizer(str3, "_", false);
                                String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
                                String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
                                String nextToken3 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
                                if (nextToken != null) {
                                    locale = nextToken2 != null ? nextToken3 != null ? new Locale(nextToken, nextToken2, nextToken3) : new Locale(nextToken, nextToken2) : new Locale(nextToken);
                                    aVar4.e = null;
                                    aVar4.f = locale;
                                    ((ba20) da20Var).success(null);
                                    break;
                                }
                            }
                        }
                        locale = null;
                        aVar4.e = null;
                        aVar4.f = locale;
                        ((ba20) da20Var).success(null);
                    }
                    break;
            }
        }
    }
}
