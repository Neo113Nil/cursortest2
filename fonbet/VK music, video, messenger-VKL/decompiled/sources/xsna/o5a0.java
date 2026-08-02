package xsna;

/* compiled from: PhotoAttachmentSizes.kt */
/* loaded from: classes4.dex */
public final class o5a0 {
    public final int a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final String f;

    public o5a0(int i, int i2, Integer num, Integer num2) {
        String str;
        this.a = i;
        this.b = i2;
        this.c = num;
        this.d = num2;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(',');
        sb.append(i2);
        this.e = sb.toString();
        if (num == null || num2 == null) {
            str = null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(num);
            sb2.append(',');
            sb2.append(num2);
            str = sb2.toString();
        }
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5a0)) {
            return false;
        }
        o5a0 o5a0Var = (o5a0) obj;
        return this.a == o5a0Var.a && this.b == o5a0Var.b && epx.f(this.c, o5a0Var.c) && epx.f(this.d, o5a0Var.d);
    }

    public final int hashCode() {
        int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        Integer num = this.c;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoAttachmentSizes(beforeCropWidth=");
        sb.append(this.a);
        sb.append(", beforeCropHeight=");
        sb.append(this.b);
        sb.append(", afterCropWidth=");
        sb.append(this.c);
        sb.append(", afterCropHeight=");
        return uqi.b(sb, this.d, ')');
    }
}
