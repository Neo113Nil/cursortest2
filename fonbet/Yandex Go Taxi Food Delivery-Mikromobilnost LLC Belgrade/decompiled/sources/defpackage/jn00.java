package defpackage;

import android.graphics.Bitmap;
import com.yandex.mapkit.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jn00 implements kn00 {
    public final String a;
    public final Point b;
    public final double c;
    public final fr d;
    public final fr e;
    public final Bitmap f;

    public jn00(String str, Point point, double d, fr frVar, fr frVar2, Bitmap bitmap) {
        this.a = str;
        this.b = point;
        this.c = d;
        this.d = frVar;
        this.e = frVar2;
        this.f = bitmap;
    }

    @Override // defpackage.kn00
    public final double a() {
        return this.c;
    }

    @Override // defpackage.kn00
    public final fr c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn00)) {
            return false;
        }
        jn00 jn00Var = (jn00) obj;
        return jl40.l(this.a, jn00Var.a) && jl40.l(this.b, jn00Var.b) && Double.compare(this.c, jn00Var.c) == 0 && jl40.l(this.d, jn00Var.d) && jl40.l(this.e, jn00Var.e) && jl40.l(this.f, jn00Var.f);
    }

    @Override // defpackage.kn00
    public final fr getAction() {
        return this.d;
    }

    @Override // defpackage.kn00
    public final Point getGeometry() {
        return this.b;
    }

    @Override // defpackage.kn00
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int a = unr0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        fr frVar = this.d;
        int hashCode = (a + (frVar == null ? 0 : frVar.hashCode())) * 31;
        fr frVar2 = this.e;
        int hashCode2 = (hashCode + (frVar2 == null ? 0 : frVar2.hashCode())) * 31;
        Bitmap bitmap = this.f;
        return hashCode2 + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        return "SocialPin(id=" + this.a + ", geometry=" + this.b + ", priority=" + this.c + ", action=" + this.d + ", showAction=" + this.e + ", pinAssetBitmap=" + this.f + Extension.C_BRAKE;
    }
}
