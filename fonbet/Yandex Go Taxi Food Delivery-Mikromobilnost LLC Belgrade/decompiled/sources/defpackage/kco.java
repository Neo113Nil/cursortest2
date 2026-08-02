package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kco implements nco {
    public final CharSequence a;
    public final boolean b;
    public final kdc c;
    public final kdc d;
    public final int e;
    public final int f;

    public kco(CharSequence charSequence, boolean z, kdc kdcVar, kdc kdcVar2) {
        this.a = charSequence;
        this.b = z;
        this.c = kdcVar;
        this.d = kdcVar2;
        this.e = 3;
        this.f = z ? 4 : 0;
    }

    @Override // defpackage.nco
    public final kdc a() {
        return this.d;
    }

    @Override // defpackage.nco
    public final int b() {
        return this.e;
    }

    @Override // defpackage.nco
    public final int c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kco)) {
            return false;
        }
        kco kcoVar = (kco) obj;
        return jl40.l(this.a, kcoVar.a) && this.b == kcoVar.b && jl40.l(this.c, kcoVar.c) && jl40.l(this.d, kcoVar.d);
    }

    @Override // defpackage.nco
    public final kdc getBackgroundColor() {
        return this.c;
    }

    @Override // defpackage.nco
    public final CharSequence getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + smw0.d(this.c, unr0.e(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "Highlighted(text=" + ((Object) this.a) + ", isCompound=" + this.b + ", backgroundColor=" + this.c + ", textColor=" + this.d + Extension.C_BRAKE;
    }

    public /* synthetic */ kco(CharSequence charSequence, boolean z) {
        this(charSequence, z, new gdc(mqg0.component_green_normal), new gdc(mqg0.component_white));
    }
}
