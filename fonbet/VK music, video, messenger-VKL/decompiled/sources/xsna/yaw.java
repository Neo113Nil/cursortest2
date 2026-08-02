package xsna;

/* compiled from: ImReactionAsset.kt */
/* loaded from: classes2.dex */
public final class yaw {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final Integer e;
    public final Integer f;
    public final String g;
    public final String h;
    public final String i;

    public /* synthetic */ yaw(int i, int i2, int i3, int i4, Integer num, Integer num2, int i5) {
        this(i, i2, i3, i4, (i5 & 16) != 0 ? null : num, (i5 & 32) != 0 ? null : num2, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yaw)) {
            return false;
        }
        yaw yawVar = (yaw) obj;
        return this.a == yawVar.a && this.b == yawVar.b && this.c == yawVar.c && this.d == yawVar.d && epx.f(this.e, yawVar.e) && epx.f(this.f, yawVar.f) && epx.f(this.g, yawVar.g) && epx.f(this.h, yawVar.h) && epx.f(this.i, yawVar.i);
    }

    public final int hashCode() {
        int a = shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        Integer num = this.e;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImReactionAsset(id=");
        sb.append(this.a);
        sb.append(", resId=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        sb.append(this.c);
        sb.append(", accentColorId=");
        sb.append(this.d);
        sb.append(", animation=");
        sb.append(this.e);
        sb.append(", bigAnimation=");
        sb.append(this.f);
        sb.append(", staticUrl=");
        sb.append(this.g);
        sb.append(", animationUrl=");
        sb.append(this.h);
        sb.append(", bigAnimationUrl=");
        return ho8.a(sb, this.i, ')');
    }

    public yaw(int i, int i2, int i3, int i4, Integer num, Integer num2, String str, String str2, String str3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = num;
        this.f = num2;
        this.g = str;
        this.h = str2;
        this.i = str3;
    }
}
