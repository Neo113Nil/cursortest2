package xsna;

/* compiled from: FullVideoState.kt */
/* loaded from: classes17.dex */
public final class wws {
    public final sws a;
    public final boolean b;

    public wws(sws swsVar, boolean z) {
        this.a = swsVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wws)) {
            return false;
        }
        wws wwsVar = (wws) obj;
        return epx.f(this.a, wwsVar.a) && this.b == wwsVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FullVideoState(videoFileState=");
        sb.append(this.a);
        sb.append(", showLoading=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
