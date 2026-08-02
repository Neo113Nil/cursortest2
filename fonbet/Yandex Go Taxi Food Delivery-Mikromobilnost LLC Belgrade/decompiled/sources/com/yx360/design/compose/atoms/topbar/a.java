package com.yx360.design.compose.atoms.topbar;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class a {
    public final int a;
    public final DsTopBarCenteredHorizontalPaddingType b;

    public a(int i, DsTopBarCenteredHorizontalPaddingType dsTopBarCenteredHorizontalPaddingType) {
        this.a = i;
        this.b = dsTopBarCenteredHorizontalPaddingType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DsTopBarCenteredHorizontalPadding(padding=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
