package xsna;

/* compiled from: VideoImageScaleConfig.kt */
/* loaded from: classes11.dex */
public final class wps0 {
    public static final a d = new a();
    public static final wps0 e = new wps0(null, null, null);
    public final Float a;
    public final Integer b;
    public final Integer c;

    /* compiled from: VideoImageScaleConfig.kt */
    public static final class a {
    }

    public wps0(Integer num, Integer num2, Float f) {
        this.a = f;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wps0)) {
            return false;
        }
        wps0 wps0Var = (wps0) obj;
        return epx.f(this.a, wps0Var.a) && epx.f(this.b, wps0Var.b) && epx.f(this.c, wps0Var.c);
    }

    public final int hashCode() {
        Float f = this.a;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoImageScaleConfig(scale=");
        sb.append(this.a);
        sb.append(", minWidth=");
        sb.append(this.b);
        sb.append(", maxWidth=");
        return uqi.b(sb, this.c, ')');
    }
}
