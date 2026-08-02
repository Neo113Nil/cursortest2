package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ld1u;", "", "Companion", "b1u", "c1u", "flex-section-extension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d1u {
    public static final c1u Companion = new c1u();
    public final float a;
    public final float b;
    public final h1q0 c;
    public final int d;

    public /* synthetic */ d1u(int i, float f, float f2, h1q0 h1q0Var, int i2) {
        if ((i & 1) == 0) {
            this.a = 0.0f;
        } else {
            this.a = f;
        }
        if ((i & 2) == 0) {
            this.b = 0.0f;
        } else {
            this.b = f2;
        }
        if ((i & 4) == 0) {
            this.c = new h1q0(0);
        } else {
            this.c = h1q0Var;
        }
        if ((i & 8) == 0) {
            this.d = 1;
        } else {
            this.d = i2;
        }
        if (this.d >= 1) {
            return;
        }
        ny61.g("columnCount must be at least 1");
        throw null;
    }

    public d1u() {
        h1q0 h1q0Var = new h1q0(0);
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = h1q0Var;
        this.d = 1;
    }
}
