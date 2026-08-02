package xsna;

import xsna.ugf;

/* compiled from: ClipsUploadPatch.kt */
/* loaded from: classes17.dex */
public final class vgf implements ugf.i {
    public final boolean a;

    public vgf(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vgf) && this.a == ((vgf) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("AllowMarketAttachOnboardingChanged(newValue="), this.a, ')');
    }
}
