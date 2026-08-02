package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import org.json.JSONObject;
import xsna.emb;

/* loaded from: classes8.dex */
public final class T9 extends AbstractC4733bh {
    public final U9 b;

    public T9(C4927j5 c4927j5, TimeProvider timeProvider) {
        super(c4927j5);
        this.b = new U9(c4927j5, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    public final boolean a(C4722b6 c4722b6) {
        long optLong;
        U9 u9 = this.b;
        N9 n9 = u9.a.t().B;
        Long valueOf = n9 != null ? Long.valueOf(n9.a) : null;
        if (valueOf != null) {
            Ho ho = u9.a.t;
            synchronized (ho) {
                optLong = ho.a.a().optLong("external_attribution_window_start", -1L);
            }
            if (optLong < 0) {
                optLong = u9.b.currentTimeMillis();
                u9.a.t.a(optLong);
            }
            if (u9.b.currentTimeMillis() - optLong <= valueOf.longValue()) {
                M9 m9 = (M9) MessageNano.mergeFrom(new M9(), c4722b6.getValueBytes());
                int i = m9.a;
                String str = new String(m9.b, emb.b);
                String str2 = this.b.a.c.k().get(Integer.valueOf(i));
                if (str2 != null) {
                    try {
                        if (JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(str2))) {
                            this.a.m.info("Ignoring attribution of type `" + W9.a(i) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                U9 u92 = this.b;
                Map<Integer, String> k = u92.a.c.k();
                k.put(Integer.valueOf(i), str);
                u92.a.c.b(k);
                this.a.m.info("Handling attribution of type `" + W9.a(i) + '`', new Object[0]);
                return false;
            }
        }
        this.a.m.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }
}
