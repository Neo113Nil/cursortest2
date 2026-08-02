package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ln4i;", "Lw96;", "Companion", "m4i", "l4i", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class n4i extends w96 {
    public static final m4i Companion = new m4i();
    public static final n4i d = new n4i(0);
    public final boolean b;
    public final Double c;

    public /* synthetic */ n4i(int i, boolean z, Double d2) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public n4i(int i) {
        this.b = false;
        this.c = null;
    }

    public n4i() {
        this(0);
    }
}
