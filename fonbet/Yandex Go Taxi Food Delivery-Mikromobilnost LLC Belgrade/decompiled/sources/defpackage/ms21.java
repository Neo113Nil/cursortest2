package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lms21;", "Lw96;", "Companion", "ls21", "ks21", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ms21 extends w96 {
    public static final ls21 Companion = new ls21();
    public static final ms21 d = new ms21(0);
    public final boolean b;
    public final boolean c;

    public /* synthetic */ ms21(int i, boolean z, boolean z2) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = true;
        } else {
            this.c = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms21)) {
            return false;
        }
        ms21 ms21Var = (ms21) obj;
        return this.b == ms21Var.b && this.c == ms21Var.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return ly3.o("UserProfileToggledContentExperiment(enabled=", ", isAddingEmailEnabled=", Extension.C_BRAKE, this.b, this.c);
    }

    public ms21(int i) {
        this.b = false;
        this.c = true;
    }

    public ms21() {
        this(0);
    }
}
