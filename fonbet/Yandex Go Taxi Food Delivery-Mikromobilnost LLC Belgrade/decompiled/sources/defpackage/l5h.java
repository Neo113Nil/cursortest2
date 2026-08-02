package defpackage;

import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes5.dex */
public class l5h extends sp2 {
    public final LinkedHashMap a = b.l(new Pair(xw91.e("econom"), Integer.valueOf(k1h0.econom_green)), new Pair(xw91.e("child_tariff"), Integer.valueOf(k1h0.econom_green)), new Pair(xw91.e("business"), Integer.valueOf(k1h0.comfort_green)), new Pair(xw91.e("comfortplus"), Integer.valueOf(k1h0.comfortplus_green)), new Pair(xw91.e("minivan"), Integer.valueOf(k1h0.minivan_green)), new Pair(xw91.e("universal"), Integer.valueOf(k1h0.universal_green)), new Pair(xw91.e("vip"), Integer.valueOf(k1h0.vip_green)), new Pair(xw91.e("ultimate"), Integer.valueOf(k1h0.vip_green)), new Pair(xw91.e("premium_van"), Integer.valueOf(k1h0.premium_van)), new Pair(xw91.e("courier"), Integer.valueOf(k1h0.ic_foot_courier)));

    @Override // defpackage.sp2
    public final Integer a(String str) {
        return (Integer) this.a.get(str);
    }

    @Override // defpackage.sp2
    public final int b() {
        return k1h0.econom_green;
    }
}
