package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lp1r0;", "", "Companion", "n1r0", "o1r0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class p1r0 {
    public static final o1r0 Companion = new o1r0();
    public final Integer a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ p1r0(int i, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Integer getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getC() {
        return this.c;
    }

    public p1r0() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
