package yads;

import android.util.Base64;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class ho3 {
    public static eo3 a(kc2 kc2Var, boolean z, boolean z2) {
        if (z) {
            a(3, kc2Var, false);
        }
        kc2Var.a((int) kc2Var.g(), bu.c);
        long g = kc2Var.g();
        String[] strArr = new String[(int) g];
        for (int i = 0; i < g; i++) {
            strArr[i] = kc2Var.a((int) kc2Var.g(), bu.c);
        }
        if (z2 && (kc2Var.m() & 1) == 0) {
            throw new pc2("framing bit expected to be set", null, true, 1);
        }
        return new eo3(strArr);
    }

    public static go3 a(kc2 kc2Var) {
        a(1, kc2Var, false);
        int d = kc2Var.d();
        if (d >= 0) {
            int m = kc2Var.m();
            int d2 = kc2Var.d();
            if (d2 >= 0) {
                int d3 = kc2Var.d();
                int i = d3 <= 0 ? -1 : d3;
                int d4 = kc2Var.d();
                int i2 = d4 <= 0 ? -1 : d4;
                kc2Var.d();
                int m2 = kc2Var.m();
                int pow = (int) Math.pow(2.0d, m2 & 15);
                int pow2 = (int) Math.pow(2.0d, (m2 & PsExtractor.VIDEO_STREAM_MASK) >> 4);
                kc2Var.m();
                return new go3(m, d2, i, i2, pow, pow2, Arrays.copyOf(kc2Var.a, kc2Var.c));
            }
            throw new IllegalStateException(nh2.a("Top bit not zero: ", d2));
        }
        throw new IllegalStateException(nh2.a("Top bit not zero: ", d));
    }

    public static boolean a(int i, kc2 kc2Var, boolean z) {
        if (kc2Var.c - kc2Var.b < 7) {
            if (z) {
                return false;
            }
            throw new pc2("too short header: " + (kc2Var.c - kc2Var.b), null, true, 1);
        }
        if (kc2Var.m() != i) {
            if (z) {
                return false;
            }
            throw new pc2(xsna.et.a(i, new StringBuilder("expected header type ")), null, true, 1);
        }
        if (kc2Var.m() == 118 && kc2Var.m() == 111 && kc2Var.m() == 114 && kc2Var.m() == 98 && kc2Var.m() == 105 && kc2Var.m() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new pc2("expected characters 'vorbis'", null, true, 1);
    }

    public static ut1 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = mc3.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                ji1.d("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    kc2 kc2Var = new kc2(Base64.decode(split[1], 0));
                    int b = kc2Var.b();
                    String a = kc2Var.a(kc2Var.b(), bu.a);
                    String a2 = kc2Var.a(kc2Var.b(), bu.c);
                    int b2 = kc2Var.b();
                    int b3 = kc2Var.b();
                    int b4 = kc2Var.b();
                    int b5 = kc2Var.b();
                    int b6 = kc2Var.b();
                    byte[] bArr = new byte[b6];
                    kc2Var.a(bArr, 0, b6);
                    arrayList.add(new be2(b, a, a2, b2, b3, b4, b5, bArr));
                } catch (RuntimeException e) {
                    ji1.d("VorbisUtil", ji1.a("Failed to parse vorbis picture", e));
                }
            } else {
                arrayList.add(new ao3(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ut1(arrayList);
    }
}
