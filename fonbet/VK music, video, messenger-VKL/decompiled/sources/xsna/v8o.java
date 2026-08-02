package xsna;

/* compiled from: DownloadInfo.kt */
/* loaded from: classes6.dex */
public final class v8o {
    public static final v8o c = new v8o(0, -1);
    public final long a;
    public final long b;

    public v8o(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8o)) {
            return false;
        }
        v8o v8oVar = (v8o) obj;
        return this.a == v8oVar.a && this.b == v8oVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadInfo(bytesDownloaded=");
        sb.append(this.a);
        sb.append(", bytesToDownload=");
        return vu5.a(')', this.b, sb);
    }
}
