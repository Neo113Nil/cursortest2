package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Li800;", "Lw96;", "Companion", "h800", "g800", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class i800 extends w96 {
    public static final h800 Companion = new h800();
    public static final i800 d = new i800(0);
    public final boolean b;
    public final int c;

    public /* synthetic */ i800(int i, boolean z, int i2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i800)) {
            return false;
        }
        i800 i800Var = (i800) obj;
        return this.b == i800Var.b && this.c == i800Var.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "MainScreenAddressTtlExperiment(enabled=" + this.b + ", mainScreenTimeTtlMin=" + this.c + Extension.C_BRAKE;
    }

    public i800(int i) {
        this.b = false;
        this.c = 0;
    }

    public i800() {
        this(0);
    }
}
