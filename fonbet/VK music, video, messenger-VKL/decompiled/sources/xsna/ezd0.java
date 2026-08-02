package xsna;

/* compiled from: ProfilePhotoUpdateBannerData.kt */
/* loaded from: classes5.dex */
public final class ezd0 {
    public final boolean a;
    public final String b;
    public final String c;

    public ezd0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezd0)) {
            return false;
        }
        ezd0 ezd0Var = (ezd0) obj;
        return this.a == ezd0Var.a && epx.f(this.b, ezd0Var.b) && epx.f(this.c, ezd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfilePhotoUpdateBannerData(isAllowed=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", buttonText=");
        return ho8.a(sb, this.c, ')');
    }

    public /* synthetic */ ezd0(int i) {
        this(false, "", "");
    }

    public ezd0(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }
}
