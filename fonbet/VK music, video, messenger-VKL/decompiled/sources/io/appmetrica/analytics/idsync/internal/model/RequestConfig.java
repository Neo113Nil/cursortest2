package io.appmetrica.analytics.idsync.internal.model;

import java.util.List;
import java.util.Map;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;
import xsna.v11;

/* loaded from: classes8.dex */
public final class RequestConfig {
    private final String a;
    private final String b;
    private final Preconditions c;
    private final Map d;
    private final long e;
    private final long f;
    private final List g;
    private final boolean h;
    private final String i;

    public RequestConfig(String str, String str2, Preconditions preconditions, Map<String, ? extends List<String>> map, long j, long j2, List<Integer> list, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = preconditions;
        this.d = map;
        this.e = j;
        this.f = j2;
        this.g = list;
        this.h = z;
        this.i = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RequestConfig.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.RequestConfig");
        }
        RequestConfig requestConfig = (RequestConfig) obj;
        return this.e == requestConfig.e && this.f == requestConfig.f && epx.f(this.a, requestConfig.a) && epx.f(this.b, requestConfig.b) && epx.f(this.c, requestConfig.c) && epx.f(this.d, requestConfig.d) && epx.f(this.g, requestConfig.g) && this.h == requestConfig.h && epx.f(this.i, requestConfig.i);
    }

    public final Map<String, List<String>> getHeaders() {
        return this.d;
    }

    public final Preconditions getPreconditions() {
        return this.c;
    }

    public final boolean getReportEventEnabled() {
        return this.h;
    }

    public final String getReportUrl() {
        return this.i;
    }

    public final long getResendIntervalForInvalidResponse() {
        return this.f;
    }

    public final long getResendIntervalForValidResponse() {
        return this.e;
    }

    public final String getType() {
        return this.a;
    }

    public final String getUrl() {
        return this.b;
    }

    public final List<Integer> getValidResponseCodes() {
        return this.g;
    }

    public int hashCode() {
        int b = qoy.b(fw3.a(v11.a((this.c.hashCode() + urd0.a(urd0.a(bh10.a(Long.hashCode(this.e) * 31, 31, this.f), 31, this.a), 31, this.b)) * 31, 31, this.d), 31, this.g), 31, this.h);
        String str = this.i;
        return b + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RequestConfig(type='");
        sb.append(this.a);
        sb.append("', url='");
        sb.append(this.b);
        sb.append("', preconditions=");
        sb.append(this.c);
        sb.append(", headers=");
        sb.append(this.d);
        sb.append(", resendIntervalForValidResponse=");
        sb.append(this.e);
        sb.append(", resendIntervalForInvalidResponse=");
        sb.append(this.f);
        sb.append(", validResponseCodes=");
        sb.append(this.g);
        sb.append(", reportEventEnabled=");
        sb.append(this.h);
        sb.append(", reportUrl=");
        return ho8.a(sb, this.i, ')');
    }
}
