package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ipx extends jpx {
    public final Text.Resource d;
    public final pbv e;
    public final YbButtonViewGroup.b f;
    public final stz0 g;
    public final boolean h;

    public ipx(Text.Resource resource, pbv pbvVar, YbButtonViewGroup.b bVar, stz0 stz0Var, boolean z) {
        super(stz0Var);
        this.d = resource;
        this.e = pbvVar;
        this.f = bVar;
        this.g = stz0Var;
        this.h = z;
    }

    @Override // defpackage.lpx
    public final boolean a() {
        return false;
    }

    @Override // defpackage.lpx
    public final boolean b() {
        return this.h;
    }

    @Override // defpackage.lpx
    public final int c() {
        return 0;
    }

    @Override // defpackage.jpx, defpackage.lpx
    public final stz0 d() {
        return this.g;
    }

    public final YbButtonViewGroup.b e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipx)) {
            return false;
        }
        ipx ipxVar = (ipx) obj;
        return this.d.equals(ipxVar.d) && this.e.equals(ipxVar.e) && this.f.equals(ipxVar.f) && this.g.equals(ipxVar.g) && this.h == ipxVar.h;
    }

    public final rbv f() {
        return this.e;
    }

    public final Text g() {
        return this.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + unr0.e(oyr.b(0, (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Preview(prompt=");
        sb.append(this.d);
        sb.append(", photoPreview=");
        sb.append(this.e);
        sb.append(", buttonGroupState=");
        sb.append(this.f);
        sb.append(", toolbarState=");
        sb.append(this.g);
        sb.append(", rotationAngle=0, landscapeAllowed=false, landscapeAnimationEnabled=");
        return x4e.i(sb, this.h, Extension.C_BRAKE);
    }
}
