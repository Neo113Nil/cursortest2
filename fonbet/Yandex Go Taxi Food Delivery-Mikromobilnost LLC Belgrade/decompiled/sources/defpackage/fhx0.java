package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.core.graphql.type.OFFER_VENDOR_TYPE;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public abstract class fhx0 implements b70 {
    public static final List a = scc.g("name", "title", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "text", "additionText", "commonPrice", "commonPeriod", "plans", "offerVendorType", "payload");

    public static tgx0 c(xdx xdxVar, c cVar) {
        Object b;
        OFFER_VENDOR_TYPE offer_vendor_type;
        tgx0 tgx0Var = null;
        String str = null;
        String str2 = null;
        rgx0 rgx0Var = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        pgx0 pgx0Var = null;
        Object obj = null;
        ArrayList arrayList = null;
        OFFER_VENDOR_TYPE offer_vendor_type2 = null;
        Map map = null;
        while (true) {
            switch (xdxVar.h2(a)) {
                case 0:
                    str = (String) cVar.d(rs60.a).b(xdxVar, cVar);
                    break;
                case 1:
                    foe foeVar = l80.a;
                    str2 = xdxVar.nextString();
                    break;
                case 2:
                    rgx0Var = (rgx0) l80.a(ehx0.a).b(xdxVar, cVar);
                    break;
                case 3:
                    str3 = (String) l80.i.b(xdxVar, cVar);
                    break;
                case 4:
                    str4 = (String) l80.i.b(xdxVar, cVar);
                    break;
                case 5:
                    str5 = (String) l80.i.b(xdxVar, cVar);
                    break;
                case 6:
                    chx0 chx0Var = chx0.a;
                    foe foeVar2 = l80.a;
                    pgx0Var = (pgx0) new ep60(chx0Var, true).b(xdxVar, cVar);
                    break;
                case 7:
                    foe foeVar3 = l80.a;
                    obj = ooc.y(xdxVar);
                    break;
                case 8:
                    dhx0 dhx0Var = dhx0.a;
                    foe foeVar4 = l80.a;
                    ep60 ep60Var = new ep60(dhx0Var, true);
                    xdxVar.l();
                    arrayList = new ArrayList();
                    while (xdxVar.hasNext()) {
                        arrayList.add(ep60Var.b(xdxVar, cVar));
                    }
                    xdxVar.j();
                    break;
                case 9:
                    String nextString = xdxVar.nextString();
                    OFFER_VENDOR_TYPE.Companion.getClass();
                    OFFER_VENDOR_TYPE[] values = OFFER_VENDOR_TYPE.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            offer_vendor_type = values[i];
                            int i2 = i;
                            if (!jl40.l(offer_vendor_type.getRawValue(), nextString)) {
                                i = i2 + 1;
                            }
                        } else {
                            offer_vendor_type = null;
                        }
                    }
                    if (offer_vendor_type != null) {
                        offer_vendor_type2 = offer_vendor_type;
                        break;
                    } else {
                        offer_vendor_type2 = OFFER_VENDOR_TYPE.UNKNOWN__;
                        break;
                    }
                case 10:
                    b70 d = cVar.d(ju00.a);
                    foe foeVar5 = l80.a;
                    if (d instanceof om60) {
                        ny61.r("The adapter is already nullable");
                        return tgx0Var;
                    }
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        b = tgx0Var;
                    } else {
                        b = d.b(xdxVar, cVar);
                    }
                    map = (Map) b;
                    continue;
                default:
                    return new tgx0(str, str2, rgx0Var, str3, str4, str5, pgx0Var, obj, arrayList, offer_vendor_type2, map);
            }
            tgx0Var = null;
        }
    }
}
