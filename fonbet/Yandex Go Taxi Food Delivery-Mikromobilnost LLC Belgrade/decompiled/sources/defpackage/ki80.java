package defpackage;

import com.yandex.go.places.organization.card.api.domain.entities.OrganizationGalleryItemState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ki80 extends mi80 {
    public final k7v a;
    public final fr b;
    public final OrganizationGalleryItemState c;

    public ki80(OrganizationGalleryItemState organizationGalleryItemState) {
        this(new k7v("", 2), null, organizationGalleryItemState);
    }

    @Override // defpackage.mi80
    public final fr a() {
        return this.b;
    }

    @Override // defpackage.mi80
    public final OrganizationGalleryItemState b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki80)) {
            return false;
        }
        ki80 ki80Var = (ki80) obj;
        return jl40.l(this.a, ki80Var.a) && jl40.l(this.b, ki80Var.b) && this.c == ki80Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        fr frVar = this.b;
        return this.c.hashCode() + ((hashCode + (frVar == null ? 0 : frVar.hashCode())) * 31);
    }

    public final String toString() {
        return "OrganizationImage(image=" + this.a + ", action=" + this.b + ", state=" + this.c + Extension.C_BRAKE;
    }

    public ki80(k7v k7vVar, fr frVar, OrganizationGalleryItemState organizationGalleryItemState) {
        this.a = k7vVar;
        this.b = frVar;
        this.c = organizationGalleryItemState;
    }
}
