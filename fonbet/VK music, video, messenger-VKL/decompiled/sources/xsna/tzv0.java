package xsna;

/* compiled from: VkVideoDownloadingRestrictionConfig.kt */
/* loaded from: classes11.dex */
public final class tzv0 {
    public static final a b = new a();
    public static final tzv0 c = new tzv0(null);
    public final aa3 a;

    /* compiled from: VkVideoDownloadingRestrictionConfig.kt */
    public static final class a {
    }

    public tzv0(aa3 aa3Var) {
        this.a = aa3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tzv0) && epx.f(this.a, ((tzv0) obj).a);
    }

    public final int hashCode() {
        aa3 aa3Var = this.a;
        if (aa3Var == null) {
            return 0;
        }
        return aa3Var.hashCode();
    }

    public final String toString() {
        return "VkVideoDownloadingRestrictionConfig(linksConfig=" + this.a + ')';
    }
}
