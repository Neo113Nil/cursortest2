package defpackage;

import kotlinx.datetime.format.f;

/* loaded from: classes9.dex */
public final class e421 extends k7 {
    public final ntf0 a;
    public final int b;
    public final int c;
    public final String d;
    public final Integer e;
    public final f f;
    public final int g;

    public e421(ntf0 ntf0Var, int i, int i2, f fVar, int i3) {
        int i4;
        String str = ntf0Var.b;
        Integer num = (i3 & 16) != 0 ? null : 0;
        fVar = (i3 & 32) != 0 ? null : fVar;
        this.a = ntf0Var;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = num;
        this.f = fVar;
        if (i2 < 10) {
            i4 = 1;
        } else if (i2 < 100) {
            i4 = 2;
        } else {
            if (i2 >= 1000) {
                ny61.g(oyr.j(i2, "Max value ", " is too large"));
                throw null;
            }
            i4 = 3;
        }
        this.g = i4;
    }

    @Override // defpackage.k7
    public final ntf0 a() {
        return this.a;
    }

    @Override // defpackage.k7
    public final Object b() {
        return this.e;
    }

    @Override // defpackage.k7
    public final String c() {
        return this.d;
    }

    @Override // defpackage.k7
    public final f d() {
        return this.f;
    }
}
