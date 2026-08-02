package defpackage;

import android.graphics.drawable.BitmapDrawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hap0 {
    public final BitmapDrawable a;
    public final String b;
    public final Integer c;
    public final Float d;
    public final String e;
    public final Integer f;

    public hap0(BitmapDrawable bitmapDrawable, String str, Integer num, Float f, String str2, Integer num2) {
        this.a = bitmapDrawable;
        this.b = str;
        this.c = num;
        this.d = f;
        this.e = str2;
        this.f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hap0)) {
            return false;
        }
        hap0 hap0Var = (hap0) obj;
        return jl40.l(this.a, hap0Var.a) && jl40.l(this.b, hap0Var.b) && jl40.l(this.c, hap0Var.c) && jl40.l(this.d, hap0Var.d) && jl40.l(this.e, hap0Var.e) && jl40.l(this.f, hap0Var.f);
    }

    public final int hashCode() {
        BitmapDrawable bitmapDrawable = this.a;
        int hashCode = (bitmapDrawable == null ? 0 : bitmapDrawable.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.d;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "Style(image=" + this.a + ", strokeColor=" + this.b + ", strokeOpacity=" + this.c + ", strokeWidth=" + this.d + ", backgroundColor=" + this.e + ", backgroundOpacity=" + this.f + Extension.C_BRAKE;
    }
}
