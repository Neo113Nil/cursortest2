package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import xsna.e43;
import xsna.emb;
import xsna.izs;

/* loaded from: classes8.dex */
public final class E {
    public final AdRevenue a;
    public final boolean b;
    public final InterfaceC5180t c;
    public final C4894hn d;
    public final C4816en e;

    public E(AdRevenue adRevenue, boolean z, C5101pn c5101pn, PublicLogger publicLogger) {
        this.a = adRevenue;
        this.b = z;
        this.c = c5101pn;
        this.d = new C4894hn(100, "ad revenue strings", publicLogger);
        this.e = new C4816en(30720, "ad revenue payload", publicLogger);
    }

    public final Pair a() {
        C5154s c5154s = new C5154s();
        int i = 0;
        for (Pair pair : e43.l(new Pair(this.a.adNetwork, new C5281x(c5154s)), new Pair(this.a.adPlacementId, new C5306y(c5154s)), new Pair(this.a.adPlacementName, new C5331z(c5154s)), new Pair(this.a.adUnitId, new A(c5154s)), new Pair(this.a.adUnitName, new B(c5154s)), new Pair(this.a.precision, new C(c5154s)), new Pair(this.a.currency.getCurrencyCode(), new D(c5154s)))) {
            String str = (String) pair.i();
            izs izsVar = (izs) pair.j();
            C4894hn c4894hn = this.d;
            c4894hn.getClass();
            String a = c4894hn.a(str);
            byte[] stringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] stringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(a);
            izsVar.invoke(stringToBytesForProtobuf2);
            i += stringToBytesForProtobuf.length - stringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) F.a.get(this.a.adType);
        c5154s.d = num != null ? num.intValue() : 0;
        r rVar = new r();
        BigDecimal bigDecimal = this.a.adRevenue;
        BigInteger bigInteger = J7.a;
        int i2 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(J7.a) <= 0 && unscaledValue.compareTo(J7.b) >= 0) {
                break;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i2++;
        }
        Pair pair2 = new Pair(Long.valueOf(unscaledValue.longValue()), Integer.valueOf(i2));
        long longValue = ((Number) pair2.i()).longValue();
        int intValue = ((Number) pair2.j()).intValue();
        rVar.a = longValue;
        rVar.b = intValue;
        c5154s.b = rVar;
        Map<String, String> map = this.a.payload;
        String b = AbstractC5166sb.b(this.c.a(map != null ? new LinkedHashMap(map) : new LinkedHashMap()));
        C4816en c4816en = this.e;
        c4816en.getClass();
        byte[] stringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(c4816en.a(b));
        c5154s.k = stringToBytesForProtobuf3;
        int length = (StringUtils.stringToBytesForProtobuf(b).length - stringToBytesForProtobuf3.length) + i;
        if (this.b) {
            c5154s.a = "autocollected".getBytes(emb.b);
        }
        return new Pair(MessageNano.toByteArray(c5154s), Integer.valueOf(length));
    }
}
