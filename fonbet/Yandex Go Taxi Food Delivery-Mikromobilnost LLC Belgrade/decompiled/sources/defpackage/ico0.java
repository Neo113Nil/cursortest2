package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lico0;", "Lw96;", "Companion", "hco0", "gco0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ico0 extends w96 {
    public static final hco0 Companion = new hco0();
    public static final ico0 d = new ico0(0);
    public final boolean b;
    public final long c;

    public /* synthetic */ ico0(boolean z, int i, long j) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = 0L;
        } else {
            this.c = j;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public ico0(int i) {
        this.b = false;
        this.c = 0L;
    }

    public ico0() {
        this(0);
    }
}
