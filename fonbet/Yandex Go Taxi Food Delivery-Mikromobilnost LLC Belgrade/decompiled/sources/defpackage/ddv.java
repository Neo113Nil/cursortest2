package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lddv;", "Ln96;", "Companion", "cdv", "bdv", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ddv extends n96 {
    public static final cdv Companion = new cdv();
    public static final ddv e = new ddv(0);
    public final boolean b;
    public final int c;
    public final int d;

    public /* synthetic */ ddv(int i, int i2, int i3, boolean z) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 4) == 0) {
            this.d = 0;
        } else {
            this.d = i3;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public ddv(int i) {
        this.b = false;
        this.c = 0;
        this.d = 0;
    }

    public ddv() {
        this(0);
    }
}
