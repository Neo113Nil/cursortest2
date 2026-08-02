package defpackage;

import com.yandex.go.places.organization.card.api.domain.entities.OrganizationGalleryItemState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class li80 extends mi80 {
    public final CharSequence a;
    public final kdc b;
    public final k7v c;
    public final fr d;
    public final OrganizationGalleryItemState e;

    public li80(CharSequence charSequence, kdc kdcVar, k7v k7vVar, fr frVar) {
        OrganizationGalleryItemState organizationGalleryItemState = OrganizationGalleryItemState.CONTENT;
        this.a = charSequence;
        this.b = kdcVar;
        this.c = k7vVar;
        this.d = frVar;
        this.e = organizationGalleryItemState;
    }

    @Override // defpackage.mi80
    public final fr a() {
        return this.d;
    }

    @Override // defpackage.mi80
    public final OrganizationGalleryItemState b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li80)) {
            return false;
        }
        li80 li80Var = (li80) obj;
        return jl40.l(this.a, li80Var.a) && jl40.l(this.b, li80Var.b) && jl40.l(this.c, li80Var.c) && jl40.l(this.d, li80Var.d) && this.e == li80Var.e;
    }

    public final int hashCode() {
        int d = smw0.d(this.b, this.a.hashCode() * 31, 31);
        k7v k7vVar = this.c;
        int hashCode = (d + (k7vVar == null ? 0 : k7vVar.hashCode())) * 31;
        fr frVar = this.d;
        return this.e.hashCode() + ((hashCode + (frVar != null ? frVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OrganizationPlaceholder(title=" + ((Object) this.a) + ", backgroundColor=" + this.b + ", image=" + this.c + ", action=" + this.d + ", state=" + this.e + Extension.C_BRAKE;
    }
}
