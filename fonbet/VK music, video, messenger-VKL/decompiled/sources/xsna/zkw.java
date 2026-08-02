package xsna;

/* compiled from: ImagePriorityFetcherConfig.kt */
/* loaded from: classes11.dex */
public final class zkw {
    public static final a c = new a();
    public static final zkw d = new zkw(0);
    public final boolean a;
    public final boolean b;

    /* compiled from: ImagePriorityFetcherConfig.kt */
    public static final class a {
    }

    public zkw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkw)) {
            return false;
        }
        zkw zkwVar = (zkw) obj;
        return this.a == zkwVar.a && this.b == zkwVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImagePriorityFetcherConfig(isCanceledImagesRequeueAllowed=");
        sb.append(this.a);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public /* synthetic */ zkw(int i) {
        this(true, false);
    }

    public zkw(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
