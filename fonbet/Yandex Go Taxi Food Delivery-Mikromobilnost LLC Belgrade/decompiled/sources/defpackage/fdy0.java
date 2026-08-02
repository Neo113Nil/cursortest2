package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lfdy0;", "", "Companion", "ddy0", "edy0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class fdy0 {
    public static final edy0 Companion = new edy0();
    public final int a;
    public final float b;
    public final long c;

    public /* synthetic */ fdy0(int i, int i2, float f, long j) {
        this.a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.b = 0.0f;
        } else {
            this.b = f;
        }
        if ((i & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = j;
        }
    }

    /* renamed from: a, reason: from getter */
    public final float getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final int getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final long getC() {
        return this.c;
    }

    public fdy0() {
        this.a = 0;
        this.b = 0.0f;
        this.c = 0L;
    }
}
