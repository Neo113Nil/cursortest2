package xsna;

import java.util.Arrays;
import xsna.cu5;

/* compiled from: RelativeLayoutBounds.kt */
/* loaded from: classes11.dex */
public final class zsf0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final cu5.a g;

    public zsf0(long j, long j2, long j3, long j4, long j5, float[] fArr, cu5.a aVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj != null && zsf0.class == obj.getClass()) {
                zsf0 zsf0Var = (zsf0) obj;
                if (this.a == zsf0Var.a && this.b == zsf0Var.b && this.e == zsf0Var.e && h9x.b(this.c, zsf0Var.c) && h9x.b(this.d, zsf0Var.d)) {
                    float[] fArr = zsf0Var.f;
                    float[] fArr2 = this.f;
                    if (fArr2 == null) {
                        if (fArr == null) {
                            equals = true;
                            if (equals && this.g.equals(zsf0Var.g)) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (fArr != null) {
                            equals = fArr2.equals(fArr);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int a = bh10.a(bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.e), 31, this.c), 31, this.d);
        float[] fArr = this.f;
        return this.g.hashCode() + ((a + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
