package xsna;

import com.vk.metrics.performance.appstart.content_provider.Method;

/* compiled from: ContentProviderMeasure.kt */
/* loaded from: classes3.dex */
public final class qkj {
    public final String a;
    public final Method b;
    public final long c;

    public qkj(String str, Method method, long j) {
        this.a = str;
        this.b = method;
        this.c = j;
    }

    public static qkj a(qkj qkjVar, long j) {
        return new qkj(qkjVar.a, qkjVar.b, j);
    }

    public final String b() {
        return this.a;
    }

    public final long c() {
        return this.c;
    }

    public final Method d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkj)) {
            return false;
        }
        qkj qkjVar = (qkj) obj;
        return epx.f(this.a, qkjVar.a) && this.b == qkjVar.b && this.c == qkjVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentProviderMeasureInfo(name=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", time=");
        return vu5.a(')', this.c, sb);
    }
}
