package xsna;

import com.vk.im.engine.exceptions.ImEngineIdOutOfBounds;
import kotlin.Pair;

/* compiled from: MsgWeightEncoder.kt */
/* loaded from: classes2.dex */
public final class n140 {
    public static final Pair<Integer, Integer> a = new Pair<>(62, 62);
    public static final Pair<Integer, Integer> b = new Pair<>(24, 55);
    public static final Pair<Integer, Integer> c = new Pair<>(0, 23);

    /* compiled from: MsgWeightEncoder.kt */
    public static final class a {
        public final boolean a;
        public final int b;
        public final int c;

        public a(boolean z, int i, int i2) {
            this.a = z;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Boolean.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Values(isSending=");
            sb.append(this.a);
            sb.append(", sortAnchorCnvId=");
            sb.append(this.b);
            sb.append(", sortLocalId=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public static a a(gkx0 gkx0Var) {
        long j = gkx0Var.b;
        return new a(xo9.j(j, a) != 0, (int) xo9.j(j, b), (int) xo9.j(j, c));
    }

    public static gkx0 b(int i, int i2, boolean z) {
        long j = i;
        int numberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        Pair<Integer, Integer> pair = b;
        int intValue = (pair.j().intValue() - pair.i().intValue()) + 1;
        if (numberOfLeadingZeros > intValue) {
            StringBuilder a2 = odj.a(numberOfLeadingZeros, i, "sortAnchorVkId bits count is ", " (value=", "). Max bits count: ");
            a2.append(intValue);
            throw new ImEngineIdOutOfBounds(a2.toString());
        }
        long j2 = i2;
        int numberOfLeadingZeros2 = 64 - Long.numberOfLeadingZeros(j2);
        Pair<Integer, Integer> pair2 = c;
        int intValue2 = (pair2.j().intValue() - pair2.i().intValue()) + 1;
        if (numberOfLeadingZeros2 <= intValue2) {
            if (i2 <= 524288) {
                return new gkx0(xo9.x(xo9.x(xo9.x(0L, a, z ? 1L : 0L), pair, j), pair2, j2));
            }
            throw new ImEngineIdOutOfBounds(tgw.b(i2, "sortLocalId is greater, than possible max value. sortLocalId: ", ", maxValue: 524288"));
        }
        StringBuilder a3 = odj.a(numberOfLeadingZeros2, i2, "sortLocalId bits count is ", " (value=", "). Max bits count: ");
        a3.append(intValue2);
        throw new ImEngineIdOutOfBounds(a3.toString());
    }
}
