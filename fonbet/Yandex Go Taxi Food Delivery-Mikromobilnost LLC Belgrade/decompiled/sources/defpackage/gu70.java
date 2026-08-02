package defpackage;

import com.yandex.go.taxi.auction.data.request.FullAuctionParam;
import com.yandex.go.taxi.order.models.api.affiliate.AffiliateInfo;
import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.net.taxi.dto.request.OrderDraftParam$CallTypePreferences;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

@gsq0
/* loaded from: classes6.dex */
public final class gu70 {
    public static final tt70 Companion = new tt70();
    public static final i3y[] O;
    public final String A;
    public final boolean B;
    public final String C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final List G;
    public final fu70 H;
    public final String I;
    public final String J;
    public final cu70 K;
    public final FullAuctionParam L;
    public final zzs M;
    public final wb80 N;
    public final String a;
    public final String b;
    public final Set c;
    public final Calendar d;
    public final String e;
    public final String f;
    public final zt70 g;
    public final Integer h;
    public final List i;
    public final String j;
    public final String k;
    public final List l;
    public final List m;
    public final boolean n;
    public final OrderDraftParam$CallTypePreferences o;
    public final boolean p;
    public final String q;
    public final boolean r;
    public final String s;
    public final List t;
    public final wt70 u;
    public final AffiliateInfo v;
    public final Tips w;
    public final rfa0 x;
    public final RequirementsParam y;
    public final Map z;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        O = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new fs70(2)), null, null, null, null, null, a.b(lazyThreadSafetyMode, new fs70(3)), null, null, a.b(lazyThreadSafetyMode, new fs70(4)), a.b(lazyThreadSafetyMode, new fs70(5)), null, a.b(lazyThreadSafetyMode, new fs70(6)), null, null, null, null, a.b(lazyThreadSafetyMode, new fs70(7)), null, null, null, null, a.b(lazyThreadSafetyMode, new fs70(8)), a.b(lazyThreadSafetyMode, new fs70(9)), null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new fs70(10)), null, null, null, null, null, null, null};
    }

    public /* synthetic */ gu70(int i, int i2, String str, String str2, Set set, Calendar calendar, String str3, String str4, zt70 zt70Var, Integer num, List list, String str5, String str6, List list2, List list3, boolean z, OrderDraftParam$CallTypePreferences orderDraftParam$CallTypePreferences, boolean z2, String str7, boolean z3, String str8, List list4, wt70 wt70Var, AffiliateInfo affiliateInfo, Tips tips, rfa0 rfa0Var, RequirementsParam requirementsParam, Map map, String str9, boolean z4, String str10, boolean z5, boolean z6, boolean z7, List list5, fu70 fu70Var, String str11, String str12, cu70 cu70Var, FullAuctionParam fullAuctionParam, zzs zzsVar, wb80 wb80Var) {
        if ((536870911 != (i & 536870911)) || (255 != (i2 & 255))) {
            qje.Y(new int[]{i, i2}, new int[]{536870911, 255}, rt70.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = set;
        this.d = calendar;
        this.e = str3;
        this.f = str4;
        this.g = zt70Var;
        this.h = num;
        this.i = list;
        this.j = str5;
        this.k = str6;
        this.l = list2;
        this.m = list3;
        this.n = z;
        this.o = orderDraftParam$CallTypePreferences;
        this.p = z2;
        this.q = str7;
        this.r = z3;
        this.s = str8;
        this.t = list4;
        this.u = wt70Var;
        this.v = affiliateInfo;
        this.w = tips;
        this.x = rfa0Var;
        this.y = requirementsParam;
        this.z = map;
        this.A = str9;
        this.B = z4;
        this.C = str10;
        if ((536870912 & i) == 0) {
            this.D = true;
        } else {
            this.D = z5;
        }
        if ((1073741824 & i) == 0) {
            this.E = true;
        } else {
            this.E = z6;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = true;
        } else {
            this.F = z7;
        }
        this.G = list5;
        this.H = fu70Var;
        this.I = str11;
        this.J = str12;
        this.K = cu70Var;
        this.L = fullAuctionParam;
        this.M = zzsVar;
        this.N = wb80Var;
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderDraftParam(launchId=", this.a, ", zoneName='", this.b, "', requiredTariffClassNames=");
        v.append(this.c);
        v.append(", due=");
        v.append(this.d);
        v.append(", scheduledOrderRequestId=");
        g8e.D(v, this.e, ", transferId=", this.f, ", manualLookup=");
        v.append(this.g);
        v.append(", lookupTtl=");
        v.append(this.h);
        v.append(", route=");
        oyr.D(", lastSeenOffer=", this.j, ", offer=", v, this.i);
        tse0.x(this.k, ", accepted=", ", blackListParks=", v, this.l);
        nzs.p(v, this.m, ", dontCall=", this.n, ", callTypePreferences=");
        v.append(this.o);
        v.append(", dontSms=");
        v.append(this.p);
        v.append(", clid='");
        tse0.y(this.q, "', isEmulator=", ", comment=", v, this.r);
        tse0.x(this.s, ", costCenters=", ", forcedSurge=", v, this.t);
        v.append(this.u);
        v.append(", affiliateInfo=");
        v.append(this.v);
        v.append(", tips=");
        v.append(this.w);
        v.append(", payment=");
        v.append(this.x);
        v.append(", requirements=");
        v.append(this.y);
        v.append(", requirementsAdditionalInfo=");
        v.append(this.z);
        v.append(", extraContactPhone=");
        tse0.y(this.A, ", locationSharingActivated=", ", otherOrderPassengerName=", v, this.B);
        tse0.y(this.C, ", chatSupported=", ", chatTranslationSupported=", v, this.D);
        nnm.v(", personalWalletEnabled=", ", supportedFeatures=", v, this.E, this.F);
        v.append(this.G);
        v.append(", tollRoads=");
        v.append(this.H);
        v.append(", verticalId=");
        g8e.D(v, this.I, ", alternativeType=", this.J, ", originPointB=");
        v.append(this.K);
        v.append(", auction=");
        v.append(this.L);
        v.append(", location=");
        v.append(this.M);
        v.append(", intercityExtra=");
        v.append(this.N);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public gu70(String str, String str2, Set set, Calendar calendar, String str3, String str4, zt70 zt70Var, Integer num, List list, String str5, String str6, List list2, boolean z, OrderDraftParam$CallTypePreferences orderDraftParam$CallTypePreferences, boolean z2, String str7, boolean z3, String str8, ArrayList arrayList, wt70 wt70Var, AffiliateInfo affiliateInfo, Tips tips, rfa0 rfa0Var, RequirementsParam requirementsParam, LinkedHashMap linkedHashMap, String str9, boolean z4, String str10, ListBuilder listBuilder, fu70 fu70Var, String str11, String str12, cu70 cu70Var, FullAuctionParam fullAuctionParam, zzs zzsVar, wb80 wb80Var) {
        this.a = str;
        this.b = str2;
        this.c = set;
        this.d = calendar;
        this.e = str3;
        this.f = str4;
        this.g = zt70Var;
        this.h = num;
        this.i = list;
        this.j = str5;
        this.k = str6;
        this.l = list2;
        this.m = EmptyList.a;
        this.n = z;
        this.o = orderDraftParam$CallTypePreferences;
        this.p = z2;
        this.q = str7;
        this.r = z3;
        this.s = str8;
        this.t = arrayList;
        this.u = wt70Var;
        this.v = affiliateInfo;
        this.w = tips;
        this.x = rfa0Var;
        this.y = requirementsParam;
        this.z = linkedHashMap;
        this.A = str9;
        this.B = z4;
        this.C = str10;
        this.D = true;
        this.E = true;
        this.F = true;
        this.G = listBuilder;
        this.H = fu70Var;
        this.I = str11;
        this.J = str12;
        this.K = cu70Var;
        this.L = fullAuctionParam;
        this.M = zzsVar;
        this.N = wb80Var;
    }
}
