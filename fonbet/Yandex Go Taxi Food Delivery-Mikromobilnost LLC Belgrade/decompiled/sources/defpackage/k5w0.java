package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lk5w0;", "Lvn11;", "Companion", "j5w0", "i5w0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class k5w0 implements vn11 {
    public static final j5w0 Companion = new j5w0();
    public static final k5w0 e = new k5w0(0);
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ k5w0(int i, boolean z, boolean z2, boolean z3) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z3;
        }
    }

    public k5w0(int i) {
        this.b = false;
        this.c = false;
        this.d = false;
    }

    public k5w0() {
        this(0);
    }
}
