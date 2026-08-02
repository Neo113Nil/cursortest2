package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lc4t0;", "Lx4t0;", "Lu3r;", "Companion", "a4t0", "b4t0", "flex-snippet-behaviour_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c4t0 extends x4t0 implements u3r {
    public static final b4t0 Companion = new b4t0();
    public final int a;

    public c4t0(int i, int i2) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return c4t0.class.equals(obj != null ? obj.getClass() : null) && this.a == ((c4t0) obj).a;
    }

    @Override // defpackage.u3r
    /* renamed from: getOffset, reason: from getter */
    public final int getA() {
        return this.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return oyr.j(this.a, "FillEndSpace(offset=", Extension.C_BRAKE);
    }

    public c4t0(int i) {
        this.a = 0;
    }

    public c4t0() {
        this(0);
    }
}
