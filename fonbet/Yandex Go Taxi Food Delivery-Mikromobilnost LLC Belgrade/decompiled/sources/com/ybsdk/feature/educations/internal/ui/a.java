package com.ybsdk.feature.educations.internal.ui;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class a {
    public final ColorModel a;
    public final int b;

    public a(int i, ColorModel colorModel) {
        this.a = colorModel;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GlowState(color=" + this.a + ", radiusPx=" + this.b + Extension.C_BRAKE;
    }
}
