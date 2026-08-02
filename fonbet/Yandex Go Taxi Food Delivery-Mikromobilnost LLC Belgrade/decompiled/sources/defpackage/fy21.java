package defpackage;

import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class fy21 implements KSerializer {
    public static final fy21 a = new fy21();
    public static final o2f0 b = new o2f0("kotlin.uuid.Uuid", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        String p = decoder.p();
        int length = p.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char charAt = p.charAt(i);
                if ((charAt >>> '\b') == 0) {
                    long j3 = bgu.b[charAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                dy21.c(i, p, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char charAt2 = p.charAt(i2);
                if ((charAt2 >>> '\b') == 0) {
                    long j6 = bgu.b[charAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                dy21.c(i2, p, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new Uuid(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(p.length() <= 64 ? p : p.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(p.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (i < 8) {
                long j8 = j7 << 4;
                char charAt3 = p.charAt(i);
                if ((charAt3 >>> '\b') == 0) {
                    long j9 = bgu.b[charAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i++;
                    }
                }
                dy21.c(i, p, "a hexadecimal digit");
                throw null;
            }
            if (p.charAt(8) != '-') {
                dy21.c(8, p, "'-' (hyphen)");
                throw null;
            }
            long j10 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j11 = j10 << 4;
                char charAt4 = p.charAt(i3);
                if ((charAt4 >>> '\b') == 0) {
                    long j12 = bgu.b[charAt4];
                    if (j12 >= 0) {
                        j10 = j11 | j12;
                    }
                }
                dy21.c(i3, p, "a hexadecimal digit");
                throw null;
            }
            if (p.charAt(13) != '-') {
                dy21.c(13, p, "'-' (hyphen)");
                throw null;
            }
            long j13 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j14 = j13 << 4;
                char charAt5 = p.charAt(i4);
                if ((charAt5 >>> '\b') == 0) {
                    long j15 = bgu.b[charAt5];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                dy21.c(i4, p, "a hexadecimal digit");
                throw null;
            }
            if (p.charAt(18) != '-') {
                dy21.c(18, p, "'-' (hyphen)");
                throw null;
            }
            long j16 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j17 = j16 << 4;
                char charAt6 = p.charAt(i5);
                if ((charAt6 >>> '\b') == 0) {
                    long j18 = bgu.b[charAt6];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                dy21.c(i5, p, "a hexadecimal digit");
                throw null;
            }
            if (p.charAt(23) != '-') {
                dy21.c(23, p, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j20 = j19 << 4;
                char charAt7 = p.charAt(i6);
                if ((charAt7 >>> '\b') == 0) {
                    long j21 = bgu.b[charAt7];
                    if (j21 >= 0) {
                        j19 = j20 | j21;
                    }
                }
                dy21.c(i6, p, "a hexadecimal digit");
                throw null;
            }
            long j22 = (j7 << 32) | (j10 << 16) | j13;
            long j23 = (j16 << 48) | j19;
            if (j22 != 0 || j23 != 0) {
                return new Uuid(j22, j23);
            }
        }
        return Uuid.a;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.t(((Uuid) obj).a());
    }
}
