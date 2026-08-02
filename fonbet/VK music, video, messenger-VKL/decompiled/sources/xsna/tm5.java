package xsna;

import io.opentelemetry.api.trace.StatusCode;

/* compiled from: AutoValue_ImmutableStatusData.java */
/* loaded from: classes8.dex */
public final class tm5 extends lpw {
    public final StatusCode d;
    public final String e;

    public tm5(StatusCode statusCode, String str) {
        if (statusCode == null) {
            throw new NullPointerException("Null statusCode");
        }
        this.d = statusCode;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lpw) {
            lpw lpwVar = (lpw) obj;
            if (this.d.equals(((tm5) lpwVar).d)) {
                if (this.e.equals(((tm5) lpwVar).e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableStatusData{statusCode=");
        sb.append(this.d);
        sb.append(", description=");
        return i5s.a(sb, this.e, "}");
    }
}
