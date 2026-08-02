package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class Y3 extends C4722b6 {
    public HashMap q;
    public C4894hn r;
    public C4816en s;
    public C4816en t;
    public C4977l3 u;
    public C4894hn v;

    public Y3(@NonNull PublicLogger publicLogger) {
        this.q = new HashMap();
        a(publicLogger);
    }

    public static C4722b6 b(String str, String str2) {
        C4722b6 c4722b6 = new C4722b6("", 0);
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        c4722b6.d = 5376;
        c4722b6.a(str, str2);
        return c4722b6;
    }

    public static C4722b6 n() {
        C4722b6 c4722b6 = new C4722b6("", 0);
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        c4722b6.d = 5632;
        return c4722b6;
    }

    public static C4722b6 o() {
        C4722b6 c4722b6 = new C4722b6("", 0);
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        c4722b6.d = 40961;
        return c4722b6;
    }

    public final void a(String str, String str2, X3 x3) {
        if (StringUtils.equalsNullSafety(str, str2)) {
            this.q.remove(x3);
        } else {
            this.q.put(x3, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        }
        Iterator it = this.q.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Integer) it.next()).intValue();
        }
        this.g = i;
    }

    @Override // io.appmetrica.analytics.impl.C4722b6
    @NonNull
    public final void c(@Nullable String str) {
        C4894hn c4894hn = this.v;
        c4894hn.getClass();
        this.h = c4894hn.a(str);
    }

    public final String d(String str) {
        C4894hn c4894hn = this.r;
        c4894hn.getClass();
        String a = c4894hn.a(str);
        a(str, a, X3.NAME);
        return a;
    }

    public final String e(String str) {
        C4816en c4816en = this.s;
        c4816en.getClass();
        String a = c4816en.a(str);
        a(str, a, X3.VALUE);
        return a;
    }

    public final Y3 f(@NonNull String str) {
        C4816en c4816en = this.t;
        c4816en.getClass();
        String a = c4816en.a(str);
        a(str, a, X3.VALUE);
        this.b = a;
        return this;
    }

    @NonNull
    public final HashMap<X3, Integer> p() {
        return this.q;
    }

    @Override // io.appmetrica.analytics.impl.C4722b6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(@Nullable String str) {
        this.a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.C4722b6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(@Nullable String str) {
        this.b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.C4722b6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final void setValueBytes(@Nullable byte[] bArr) {
        a(bArr);
    }

    public Y3(String str, int i, @NonNull PublicLogger publicLogger) {
        this("", str, i, publicLogger);
    }

    public Y3(String str, String str2, int i, @NonNull PublicLogger publicLogger) {
        this(str, str2, i, 0, publicLogger);
    }

    public Y3(String str, String str2, int i, int i2, @NonNull PublicLogger publicLogger) {
        this.q = new HashMap();
        a(publicLogger);
        this.b = e(str);
        this.a = d(str2);
        setType(i);
        setCustomType(i2);
    }

    public final Y3 a(@NonNull HashMap<X3, Integer> hashMap) {
        this.q = hashMap;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.r = new C4894hn(1000, "event name", publicLogger);
        this.s = new C4816en(245760, "event value", publicLogger);
        this.t = new C4816en(1024000, "event extended value", publicLogger);
        this.u = new C4977l3(245760, "event value bytes", publicLogger);
        this.v = new C4894hn(200, "user profile id", publicLogger);
    }

    public Y3(byte[] bArr, @Nullable String str, int i, @NonNull PublicLogger publicLogger) {
        this.q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.a = d(str);
        setType(i);
    }

    public final void a(byte[] bArr) {
        C4977l3 c4977l3 = this.u;
        c4977l3.getClass();
        byte[] a = c4977l3.a(bArr);
        X3 x3 = X3.VALUE;
        if (bArr.length != a.length) {
            this.q.put(x3, Integer.valueOf(bArr.length - a.length));
        } else {
            this.q.remove(x3);
        }
        Iterator it = this.q.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Integer) it.next()).intValue();
        }
        this.g = i;
        super.setValueBytes(a);
    }

    public static C4722b6 a(@NonNull C5179so c5179so) {
        C4722b6 o = o();
        o.setValue(new String(Base64.encode(MessageNano.toByteArray(c5179so), 0)));
        return o;
    }

    public static Y3 a(PublicLogger publicLogger, Yi yi) {
        int i;
        Y3 y3 = new Y3(publicLogger);
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        y3.d = 40976;
        Wi wi = new Wi();
        wi.b = yi.a.currency.getCurrencyCode().getBytes();
        wi.f = yi.a.priceMicros;
        wi.c = StringUtils.stringToBytesForProtobuf(new C4894hn(200, "revenue productID", yi.e).a(yi.a.productID));
        wi.a = ((Integer) WrapUtils.getOrDefault(yi.a.quantity, 1)).intValue();
        C4816en c4816en = yi.b;
        String str = yi.a.payload;
        c4816en.getClass();
        wi.d = StringUtils.stringToBytesForProtobuf(c4816en.a(str));
        if (vo.a(yi.a.receipt)) {
            Ri ri = new Ri();
            String str2 = (String) yi.c.a(yi.a.receipt.data);
            i = !StringUtils.equalsNullSafety(yi.a.receipt.data, str2) ? yi.a.receipt.data.length() : 0;
            String str3 = (String) yi.d.a(yi.a.receipt.signature);
            ri.a = StringUtils.stringToBytesForProtobuf(str2);
            ri.b = StringUtils.stringToBytesForProtobuf(str3);
            wi.e = ri;
        } else {
            i = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(wi), Integer.valueOf(i));
        y3.b = y3.e(new String(Base64.encode((byte[]) pair.first, 0)));
        y3.g = ((Integer) pair.second).intValue();
        return y3;
    }

    public static Y3 a(PublicLogger publicLogger, E e) {
        Y3 y3 = new Y3(publicLogger);
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        y3.d = 40977;
        kotlin.Pair a = e.a();
        y3.b = y3.e(new String(Base64.encode((byte[]) a.i(), 0)));
        y3.g = ((Integer) a.j()).intValue();
        return y3;
    }
}
