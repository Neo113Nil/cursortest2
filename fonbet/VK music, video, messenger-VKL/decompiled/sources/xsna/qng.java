package xsna;

import com.ironsource.V2;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: CommonWebsocketConfig.kt */
/* loaded from: classes11.dex */
public final class qng {
    public static final a g = new a();
    public static final qng h = new qng(0);
    public final int a;
    public final String b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;

    /* compiled from: CommonWebsocketConfig.kt */
    public static final class a {
    }

    public qng() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qng)) {
            return false;
        }
        qng qngVar = (qng) obj;
        return this.a == qngVar.a && epx.f(this.b, qngVar.b) && this.c == qngVar.c && this.d == qngVar.d && this.e == qngVar.e && this.f == qngVar.f;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return Long.hashCode(this.f) + bh10.a(qoy.b(bh10.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonWebsocketConfig(version=");
        sb.append(this.a);
        sb.append(", host=");
        sb.append(this.b);
        sb.append(", pingIntervalMs=");
        sb.append(this.c);
        sb.append(", inconsistencyDetectionEnabled=");
        sb.append(this.d);
        sb.append(", apiRequestTimeoutMs=");
        sb.append(this.e);
        sb.append(", apiReconnectTimeoutMs=");
        return vu5.a(')', this.f, sb);
    }

    public /* synthetic */ qng(int i) {
        this(3, null, 20000L, false, V2.h, ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS);
    }

    public qng(int i, String str, long j, boolean z, long j2, long j3) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = j2;
        this.f = j3;
    }
}
