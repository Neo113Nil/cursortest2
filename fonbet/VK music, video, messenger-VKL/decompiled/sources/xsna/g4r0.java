package xsna;

import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.gbd0;

/* compiled from: BuiltInSerializers.kt */
/* loaded from: classes8.dex */
public final class g4r0 implements KSerializer<Uuid> {
    public static final g4r0 a = new g4r0();
    public static final mbd0 b = new mbd0("kotlin.uuid.Uuid", gbd0.i.a);

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        String x = decoder.x();
        int length = x.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char charAt = x.charAt(i);
                if ((charAt >>> '\b') == 0) {
                    long j3 = h2v.b[charAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                kotlin.uuid.b.c(i, x, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char charAt2 = x.charAt(i2);
                if ((charAt2 >>> '\b') == 0) {
                    long j6 = h2v.b[charAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                kotlin.uuid.b.c(i2, x, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new Uuid(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(x.length() <= 64 ? x : x.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(x.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (i < 8) {
                long j8 = j7 << 4;
                char charAt3 = x.charAt(i);
                if ((charAt3 >>> '\b') == 0) {
                    long j9 = h2v.b[charAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i++;
                    }
                }
                kotlin.uuid.b.c(i, x, "a hexadecimal digit");
                throw null;
            }
            if (x.charAt(8) != '-') {
                kotlin.uuid.b.c(8, x, "'-' (hyphen)");
                throw null;
            }
            long j10 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j11 = j10 << 4;
                char charAt4 = x.charAt(i3);
                if ((charAt4 >>> '\b') == 0) {
                    long j12 = h2v.b[charAt4];
                    if (j12 >= 0) {
                        j10 = j11 | j12;
                    }
                }
                kotlin.uuid.b.c(i3, x, "a hexadecimal digit");
                throw null;
            }
            if (x.charAt(13) != '-') {
                kotlin.uuid.b.c(13, x, "'-' (hyphen)");
                throw null;
            }
            long j13 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j14 = j13 << 4;
                char charAt5 = x.charAt(i4);
                if ((charAt5 >>> '\b') == 0) {
                    long j15 = h2v.b[charAt5];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                kotlin.uuid.b.c(i4, x, "a hexadecimal digit");
                throw null;
            }
            if (x.charAt(18) != '-') {
                kotlin.uuid.b.c(18, x, "'-' (hyphen)");
                throw null;
            }
            long j16 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j17 = j16 << 4;
                char charAt6 = x.charAt(i5);
                if ((charAt6 >>> '\b') == 0) {
                    long j18 = h2v.b[charAt6];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                kotlin.uuid.b.c(i5, x, "a hexadecimal digit");
                throw null;
            }
            if (x.charAt(23) != '-') {
                kotlin.uuid.b.c(23, x, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j20 = j19 << 4;
                char charAt7 = x.charAt(i6);
                if ((charAt7 >>> '\b') == 0) {
                    long j21 = h2v.b[charAt7];
                    if (j21 >= 0) {
                        j19 = j20 | j21;
                    }
                }
                kotlin.uuid.b.c(i6, x, "a hexadecimal digit");
                throw null;
            }
            long j22 = (j7 << 32) | (j10 << 16) | j13;
            long j23 = (j16 << 48) | j19;
            if (j22 != 0 || j23 != 0) {
                return new Uuid(j22, j23);
            }
        }
        return Uuid.b;
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        encoder.r(((Uuid) obj).h());
    }
}
