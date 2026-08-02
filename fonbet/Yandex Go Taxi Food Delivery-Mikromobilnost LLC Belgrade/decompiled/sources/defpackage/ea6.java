package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lea6;", "Lq5r0;", "Companion", "ca6", "da6", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ea6 extends q5r0 {
    public static final da6 Companion = new da6();
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ea6(int i, String str, String str2, boolean z, boolean z2, boolean z3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = true;
        } else {
            this.d = z2;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z3;
        }
    }

    @Override // defpackage.q5r0
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.q5r0
    /* renamed from: b, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    public ea6() {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = true;
        this.e = false;
    }
}
