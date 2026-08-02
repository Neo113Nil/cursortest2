package xsna;

import xsna.b5x;

/* compiled from: TextColorIssue.kt */
/* loaded from: classes18.dex */
public final class jco0 extends p6g {
    public final b5x.b.C2589b d;
    public final String e;

    public jco0() {
        this(null, null, null, 7);
    }

    @Override // xsna.p6g
    public final String b() {
        return this.e;
    }

    @Override // xsna.b5x.a
    public final b5x.b getKey() {
        return this.d;
    }

    public jco0(Integer num, Integer num2, Integer num3, int i) {
        super((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
        this.d = b5x.b.C2589b.a;
        this.e = "Text color";
    }
}
