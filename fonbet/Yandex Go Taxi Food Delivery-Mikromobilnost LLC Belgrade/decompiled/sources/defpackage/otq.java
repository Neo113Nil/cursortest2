package defpackage;

import android.graphics.drawable.BitmapDrawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class otq {
    public final String a;
    public final String b;
    public final BitmapDrawable c;
    public final boolean d;
    public final boolean e;

    public otq(String str, String str2, BitmapDrawable bitmapDrawable, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = bitmapDrawable;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otq)) {
            return false;
        }
        otq otqVar = (otq) obj;
        return jl40.l(this.a, otqVar.a) && jl40.l(this.b, otqVar.b) && jl40.l(this.c, otqVar.c) && this.d == otqVar.d && this.e == otqVar.e;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        BitmapDrawable bitmapDrawable = this.c;
        return Boolean.hashCode(this.e) + unr0.e((b + (bitmapDrawable == null ? 0 : bitmapDrawable.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("FeedbackOptionUi(id=", this.a, ", text=", this.b, ", icon=");
        v.append(this.c);
        v.append(", isSelected=");
        v.append(this.d);
        v.append(", isEnabled=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
