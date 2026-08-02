package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Le420;", "Lvn11;", "Companion", "d420", "c420", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class e420 implements vn11 {
    public static final d420 Companion = new d420();
    public static final e420 g = new e420(0);
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public /* synthetic */ e420(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = true;
        } else {
            this.c = z2;
        }
        if ((i & 4) == 0) {
            this.d = true;
        } else {
            this.d = z3;
        }
        if ((i & 8) == 0) {
            this.e = false;
        } else {
            this.e = z4;
        }
        if ((i & 16) == 0) {
            this.f = false;
        } else {
            this.f = z5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e420)) {
            return false;
        }
        e420 e420Var = (e420) obj;
        return this.b == e420Var.b && this.c == e420Var.c && this.d == e420Var.d && this.e == e420Var.e && this.f == e420Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder u = qv10.u("MessengerSdkConfigExperiment(enabled=", ", disableStickers=", ", disableDisplayRestriction=", this.b, this.c);
        nnm.v(", enableVoice=", ", enableTranslation=", u, this.d, this.e);
        return x4e.i(u, this.f, Extension.C_BRAKE);
    }

    public e420(int i) {
        this.b = false;
        this.c = true;
        this.d = true;
        this.e = false;
        this.f = false;
    }

    public e420() {
        this(0);
    }
}
