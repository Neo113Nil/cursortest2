package xsna;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VorbisUtil.java */
/* loaded from: classes12.dex */
public final class j7x0 {

    /* compiled from: VorbisUtil.java */
    public static final class a {
        public final String[] a;

        public a(String[] strArr) {
            this.a = strArr;
        }
    }

    /* compiled from: VorbisUtil.java */
    public static final class b {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: VorbisUtil.java */
    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final byte[] g;

        public c(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = bArr;
        }
    }

    @Nullable
    public static fi20 a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String str2 = y2r0.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                ahn.F("Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(rja0.d(new xi90(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    ahn.G("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new g7x0(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new fi20(arrayList);
    }

    public static a b(xi90 xi90Var, boolean z, boolean z2) throws ParserException {
        if (z) {
            c(3, xi90Var, false);
        }
        xi90Var.A((int) xi90Var.t(), StandardCharsets.UTF_8);
        long t = xi90Var.t();
        String[] strArr = new String[(int) t];
        for (int i = 0; i < t; i++) {
            strArr[i] = xi90Var.A((int) xi90Var.t(), StandardCharsets.UTF_8);
        }
        if (z2 && (xi90Var.C() & 1) == 0) {
            throw ParserException.a(null, "framing bit expected to be set");
        }
        return new a(strArr);
    }

    public static boolean c(int i, xi90 xi90Var, boolean z) throws ParserException {
        if (xi90Var.a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "too short header: " + xi90Var.a());
        }
        if (xi90Var.C() != i) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "expected header type " + Integer.toHexString(i));
        }
        if (xi90Var.C() == 118 && xi90Var.C() == 111 && xi90Var.C() == 114 && xi90Var.C() == 98 && xi90Var.C() == 105 && xi90Var.C() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.a(null, "expected characters 'vorbis'");
    }
}
