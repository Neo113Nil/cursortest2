package xsna;

/* compiled from: VkVideoBackgroundViewConfig.kt */
/* loaded from: classes11.dex */
public final class fzv0 {
    public static final a b = new a();
    public static final fzv0 c = new fzv0(null);
    public final aa3 a;

    /* compiled from: VkVideoBackgroundViewConfig.kt */
    public static final class a {
    }

    public fzv0(aa3 aa3Var) {
        this.a = aa3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fzv0) && epx.f(this.a, ((fzv0) obj).a);
    }

    public final int hashCode() {
        aa3 aa3Var = this.a;
        if (aa3Var == null) {
            return 0;
        }
        return aa3Var.hashCode();
    }

    public final String toString() {
        return "VkVideoBackgroundViewConfig(linksConfig=" + this.a + ')';
    }
}
