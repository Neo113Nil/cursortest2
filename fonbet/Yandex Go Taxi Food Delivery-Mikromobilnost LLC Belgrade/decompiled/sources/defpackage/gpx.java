package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gpx extends jpx {
    public final Text d;
    public final rbv e;
    public final tr7 f;
    public final stz0 g;
    public final int h;
    public final boolean i;
    public final boolean j;

    public gpx(Text.Resource resource, rbv rbvVar, tr7 tr7Var, stz0 stz0Var, int i, boolean z, boolean z2) {
        super(stz0Var);
        this.d = resource;
        this.e = rbvVar;
        this.f = tr7Var;
        this.g = stz0Var;
        this.h = i;
        this.i = z;
        this.j = z2;
    }

    @Override // defpackage.lpx
    public final boolean a() {
        return this.i;
    }

    @Override // defpackage.lpx
    public final boolean b() {
        return this.j;
    }

    @Override // defpackage.lpx
    public final int c() {
        return this.h;
    }

    @Override // defpackage.jpx, defpackage.lpx
    public final stz0 d() {
        return this.g;
    }

    public final tr7 e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpx)) {
            return false;
        }
        gpx gpxVar = (gpx) obj;
        return jl40.l(this.d, gpxVar.d) && jl40.l(this.e, gpxVar.e) && jl40.l(this.f, gpxVar.f) && this.g.equals(gpxVar.g) && this.h == gpxVar.h && this.i == gpxVar.i && this.j == gpxVar.j;
    }

    public final rbv f() {
        return this.e;
    }

    public final Text g() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        rbv rbvVar = this.e;
        return Boolean.hashCode(this.j) + unr0.e(oyr.b(this.h, (this.g.hashCode() + ((this.f.a.hashCode() + ((hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31)) * 31)) * 31, 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Caption(prompt=");
        sb.append(this.d);
        sb.append(", photoFrame=");
        sb.append(this.e);
        sb.append(", cameraParams=");
        sb.append(this.f);
        sb.append(", toolbarState=");
        sb.append(this.g);
        sb.append(", rotationAngle=");
        tse0.z(sb, this.h, ", landscapeAllowed=", this.i, ", landscapeAnimationEnabled=");
        return x4e.i(sb, this.j, Extension.C_BRAKE);
    }
}
