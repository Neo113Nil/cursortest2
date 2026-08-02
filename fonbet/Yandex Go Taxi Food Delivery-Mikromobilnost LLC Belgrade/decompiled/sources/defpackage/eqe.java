package defpackage;

import android.location.Location;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.analytics.DeeplinkFinalizedOrderAddressAnalyticsData;
import com.yandex.go.analytics.ListBasedOrderAddressAnalyticsData;
import com.yandex.go.analytics.PinDropOrderAddressAnalyticsData;
import com.yandex.go.analytics.PositionChoicesOrderAddressAnalyticsData;
import com.yandex.go.analytics.ShortcutOrderAddressAnalyticsData;
import com.yandex.go.analytics.SimpleOrderAddressAnalyticsData;
import com.yandex.go.analytics.TransportAddressAnalyticsData;
import com.yandex.go.analytics.e;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.userposition.repository.a;

/* loaded from: classes9.dex */
public final class eqe {
    public final xzq0 a;
    public final a b;
    public final gp50 c;

    public eqe(xzq0 xzq0Var, a aVar, gp50 gp50Var) {
        this.a = xzq0Var;
        this.b = aVar;
        this.c = gp50Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        if (r3.equals("redirect") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
    
        if (r3.equals("pickup_by_photo") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0112, code lost:
    
        if (r3.equals("suggest") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011c, code lost:
    
        if (r3.equals("userplaces") != false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e a(Address address, i4v0 i4v0Var, p820 p820Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        zzs zzsVar;
        String str10;
        String str11;
        zzs B = address.B();
        String str12 = i4v0Var.a;
        String str13 = p820Var.c;
        String str14 = p820Var.g;
        o820 o820Var = p820Var.h;
        String G = this.c.G(str13);
        z7l0 z7l0Var = p820Var.d;
        if (z7l0Var == RoutePointType.TRANSPORT_A || z7l0Var == RoutePointType.TRANSPORT_B) {
            if (o820Var != null) {
                String str15 = o820Var.b;
                String str16 = o820Var.a;
                str3 = o820Var.c;
                str2 = str16;
                str = str15;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            zzs zzsVar2 = i4v0Var.b;
            if (str14 == null) {
                str14 = address.q2();
            }
            return new TransportAddressAnalyticsData(str12, B, zzsVar2, str14, str13, G, p820Var.a, i4v0Var.c, i4v0Var.f, i4v0Var.e, str, str2, str3);
        }
        if (i4v0Var.i) {
            return new DeeplinkFinalizedOrderAddressAnalyticsData(str12, B, i4v0Var.b, address.q2(), str13, G, p820Var.a);
        }
        String str17 = "";
        switch (str12.hashCode()) {
            case -1880494121:
                str4 = G;
                break;
            case -1863356540:
                str4 = G;
                break;
            case -1204243446:
                if (str12.equals("positionchoice")) {
                    zzs zzsVar3 = i4v0Var.b;
                    String q2 = address.q2();
                    String str18 = i4v0Var.e;
                    if (str18 == null) {
                        str18 = "";
                    }
                    String str19 = i4v0Var.f;
                    if (str19 == null) {
                        str5 = str18;
                        str6 = str13;
                        str7 = G;
                        str8 = "";
                    } else {
                        str5 = str18;
                        str6 = str13;
                        str7 = G;
                        str8 = str19;
                    }
                    return new PositionChoicesOrderAddressAnalyticsData(B, zzsVar3, q2, str6, str7, str5, str8);
                }
                jst.e.j(new IllegalStateException("Unexpected endpoint passed: ".concat(str12)));
                return null;
            case -949288275:
                str4 = G;
                break;
            case -776144932:
                str9 = G;
                zzsVar = B;
                break;
            case -435098791:
                if (str12.equals("pin_drop")) {
                    return new PinDropOrderAddressAnalyticsData(B, i4v0Var.b, address.q2(), str13, G, p820Var.b, i4v0Var.h, i4v0Var.c, i4v0Var.g);
                }
                jst.e.j(new IllegalStateException("Unexpected endpoint passed: ".concat(str12)));
                return null;
            case -342500282:
                if (str12.equals("shortcut")) {
                    if (o820Var != null) {
                        str17 = o820Var.b;
                        str10 = o820Var.a;
                        str11 = o820Var.c;
                    } else {
                        str10 = "";
                        str11 = str10;
                    }
                    return new ShortcutOrderAddressAnalyticsData(B, p820Var.a, i4v0Var.b, address.q2(), str13, G, str10, str17, str11);
                }
                jst.e.j(new IllegalStateException("Unexpected endpoint passed: ".concat(str12)));
                return null;
            case -134077476:
                if (str12.equals("zerosuggest")) {
                    str4 = G;
                    Integer num = i4v0Var.d;
                    zzs zzsVar4 = i4v0Var.b;
                    if (str14 == null) {
                        str14 = address.q2();
                    }
                    return new ListBasedOrderAddressAnalyticsData(str12, B, zzsVar4, str14, str13, str4, p820Var.a, num == null ? -1 : num.intValue(), i4v0Var.h, i4v0Var.c);
                }
                jst.e.j(new IllegalStateException("Unexpected endpoint passed: ".concat(str12)));
                return null;
            case 433141802:
                if (str12.equals("UNKNOWN")) {
                    return null;
                }
                jst.e.j(new IllegalStateException("Unexpected endpoint passed: ".concat(str12)));
                return null;
            case 1387965947:
                if (str12.equals("geomagnet")) {
                    str9 = G;
                    zzsVar = B;
                    return new SimpleOrderAddressAnalyticsData(zzsVar, i4v0Var.b, str12, address.q2(), str13, str9);
                }
                jst.e.j(new IllegalStateException("Unexpected endpoint passed: ".concat(str12)));
                return null;
            default:
                jst.e.j(new IllegalStateException("Unexpected endpoint passed: ".concat(str12)));
                return null;
        }
    }

    public final SimpleOrderAddressAnalyticsData b(PlainAddress plainAddress) {
        zzs zzsVar;
        Location i = this.b.i();
        String m = this.a.m();
        String G = this.c.G(m);
        zzs B = plainAddress.B();
        if (i != null) {
            zzs.Companion.getClass();
            zzsVar = uzs.b(i);
        } else {
            zzsVar = null;
        }
        return new SimpleOrderAddressAnalyticsData(B, zzsVar, "userplaces", plainAddress.q2(), m, G);
    }
}
