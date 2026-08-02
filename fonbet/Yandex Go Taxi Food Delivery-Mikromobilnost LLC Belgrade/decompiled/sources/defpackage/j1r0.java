package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lj1r0;", "", "Companion", "h1r0", "i1r0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class j1r0 {
    public static final i1r0 Companion = new i1r0();
    public final Long a;
    public final Long b;
    public final Long c;

    public /* synthetic */ j1r0(int i, Long l, Long l2, Long l3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l3;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Long getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final Long getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final Long getB() {
        return this.b;
    }

    public j1r0() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
