package xsna;

import android.graphics.ColorSpace;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import xsna.tiw;

/* compiled from: EncodedImage.java */
/* loaded from: classes12.dex */
public final class rip implements Closeable {
    public final uvf<PooledByteBuffer> b;
    public siw c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ColorSpace j;
    public String k;

    public rip() {
        throw null;
    }

    public rip(uvf<PooledByteBuffer> uvfVar) {
        this.c = siw.c;
        this.d = -1;
        this.e = 0;
        this.f = -1;
        this.g = -1;
        this.h = 1;
        this.i = -1;
        if (!uvf.t(uvfVar)) {
            throw new IllegalArgumentException();
        }
        this.b = uvfVar.clone();
    }

    public static rip b(rip ripVar) {
        rip ripVar2 = null;
        if (ripVar == null) {
            return null;
        }
        uvf o = uvf.o(ripVar.b);
        if (o != null) {
            try {
                ripVar2 = new rip(o);
            } catch (Throwable th) {
                o.close();
                throw th;
            }
        }
        uvf.q(o);
        if (ripVar2 != null) {
            ripVar2.h(ripVar);
        }
        return ripVar2;
    }

    public static void c(rip ripVar) {
        if (ripVar != null) {
            ripVar.close();
        }
    }

    public static boolean v(rip ripVar) {
        return ripVar.d >= 0 && ripVar.f >= 0 && ripVar.g >= 0;
    }

    public static boolean x(rip ripVar) {
        return ripVar != null && ripVar.w();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        uvf.q(this.b);
    }

    public final int getHeight() {
        y();
        return this.g;
    }

    public final int getRotationAngle() {
        y();
        return this.d;
    }

    public final int getWidth() {
        y();
        return this.f;
    }

    public final void h(rip ripVar) {
        ripVar.y();
        this.c = ripVar.c;
        ripVar.y();
        this.f = ripVar.f;
        ripVar.y();
        this.g = ripVar.g;
        ripVar.y();
        this.d = ripVar.d;
        ripVar.y();
        this.e = ripVar.e;
        this.h = ripVar.h;
        this.i = ripVar.r();
        ripVar.y();
        this.j = ripVar.j;
    }

    public final uvf<PooledByteBuffer> m() {
        return uvf.o(this.b);
    }

    public final String n() {
        uvf o = uvf.o(this.b);
        if (o == null) {
            return "";
        }
        int min = Math.min(r(), 10);
        byte[] bArr = new byte[min];
        try {
            ((PooledByteBuffer) o.r()).a(0, 0, min, bArr);
            o.close();
            StringBuilder sb = new StringBuilder(min * 2);
            for (int i = 0; i < min; i++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i])));
            }
            return sb.toString();
        } catch (Throwable th) {
            o.close();
            throw th;
        }
    }

    public final siw o() {
        y();
        return this.c;
    }

    public final InputStream p() {
        uvf o = uvf.o(this.b);
        if (o == null) {
            return null;
        }
        try {
            return new kvb0((PooledByteBuffer) o.r());
        } finally {
            o.close();
        }
    }

    public final int q() {
        return this.h;
    }

    public final int r() {
        uvf<PooledByteBuffer> uvfVar = this.b;
        if (uvfVar == null) {
            return this.i;
        }
        uvfVar.r();
        return uvfVar.r().size();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:105|(2:106|107)|(2:109|(1:111)(5:112|(1:114)|115|116|(2:118|(2:120|(5:126|127|128|129|(1:131)))(2:135|(1:137)(1:138)))(2:139|(1:141))))|142|143|(0)) */
    /* JADX WARN: Removed duplicated region for block: B:131:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        int i;
        InputStream p = p();
        Object obj = tiw.d;
        Pair pair = null;
        InputStream inputStream = null;
        pair = null;
        pair = null;
        pair = null;
        pair = null;
        pair = null;
        pair = null;
        pair = null;
        try {
            siw a = tiw.a.a(p);
            this.c = a;
            int i2 = 0;
            if (a == hgl.f || a == hgl.g || a == hgl.h || a == hgl.i || a == hgl.j) {
                InputStream p2 = p();
                if (p2 != null) {
                    byte[] bArr = new byte[4];
                    try {
                        try {
                            ((kvb0) p2).read(bArr, 0, 4);
                        } finally {
                            try {
                                p2.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    if (aqw.d("RIFF", bArr)) {
                        aqw.g(p2);
                        ((kvb0) p2).read(bArr, 0, 4);
                        if (aqw.d("WEBP", bArr)) {
                            ((kvb0) p2).read(bArr, 0, 4);
                            StringBuilder sb = new StringBuilder();
                            for (int i3 = 0; i3 < 4; i3++) {
                                sb.append((char) (bArr[i3] & 65535));
                            }
                            String sb2 = sb.toString();
                            int hashCode = sb2.hashCode();
                            if (hashCode != 2640674) {
                                if (hashCode != 2640718) {
                                    if (hashCode == 2640730 && sb2.equals("VP8X")) {
                                        p2.skip(8L);
                                        Pair pair2 = new Pair(Integer.valueOf(((p2.read() & 255) | ((p2.read() & 255) << 8) | ((p2.read() & 255) << 16)) + 1), Integer.valueOf(((p2.read() & 255) | ((p2.read() & 255) << 8) | ((p2.read() & 255) << 16)) + 1));
                                        try {
                                            p2.close();
                                        } catch (IOException e3) {
                                            e3.printStackTrace();
                                        }
                                        pair = pair2;
                                        if (pair != null) {
                                            this.f = ((Integer) pair.d()).intValue();
                                            this.g = ((Integer) pair.g()).intValue();
                                        }
                                    }
                                } else if (sb2.equals("VP8L")) {
                                    pair = aqw.i(p2);
                                }
                            } else if (sb2.equals("VP8 ")) {
                                pair = aqw.h(p2);
                            }
                        }
                    }
                    if (pair != null) {
                    }
                }
            } else {
                try {
                    inputStream = p();
                    j79 a2 = id7.a(inputStream);
                    this.j = (ColorSpace) a2.b;
                    Pair pair3 = (Pair) a2.c;
                    if (pair3 != null) {
                        this.f = ((Integer) pair3.d()).intValue();
                        this.g = ((Integer) pair3.g()).intValue();
                    }
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    pair = (Pair) a2.c;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            }
            if (a != hgl.a || this.d != -1) {
                if (a != hgl.k || this.d != -1) {
                    if (this.d == -1) {
                        this.d = 0;
                        return;
                    }
                    return;
                }
                InputStream p3 = p();
                if (p3 != null) {
                    try {
                        i2 = new p4q(p3).d(1, "Orientation");
                    } catch (IOException e4) {
                        if (ahq.a.a(3)) {
                            bhq.c(3, "HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e4);
                        }
                    }
                } else if (ahq.a.a(3)) {
                    bhq.b(3, "HeifExifUtil", "Trying to read Heif Exif from null inputStream -> ignoring");
                }
                this.e = i2;
                this.d = wp80.b(i2);
                return;
            }
            if (pair != null) {
                InputStream p4 = p();
                while (true) {
                    try {
                        if (sdi.r(p4, 1, false) != 255) {
                            break;
                        }
                        int i4 = 255;
                        while (i4 == 255) {
                            i4 = sdi.r(p4, 1, false);
                        }
                        if (i4 == 225) {
                            int r = sdi.r(p4, 2, false);
                            if (r - 2 > 6) {
                                int r2 = sdi.r(p4, 4, false);
                                int r3 = sdi.r(p4, 2, false);
                                i = r - 8;
                                if (r2 == 1165519206 && r3 == 0) {
                                }
                            }
                        } else if (i4 != 1 && i4 != 216) {
                            if (i4 == 217 || i4 == 218) {
                                break;
                            } else {
                                p4.skip(sdi.r(p4, 2, false) - 2);
                            }
                        }
                    } catch (IOException unused3) {
                    }
                }
                i = 0;
                if (i != 0) {
                    i2 = ato0.a(p4, i);
                }
                this.e = i2;
                this.d = wp80.b(i2);
            }
        } catch (IOException e5) {
            s200.J(e5);
            throw null;
        }
    }

    public final boolean t(int i) {
        siw siwVar = this.c;
        if (siwVar == hgl.a || siwVar == hgl.l) {
            uvf<PooledByteBuffer> uvfVar = this.b;
            uvfVar.getClass();
            PooledByteBuffer r = uvfVar.r();
            if (i < 2 || r.F(i - 2) != -1 || r.F(i - 1) != -39) {
                return false;
            }
        }
        return true;
    }

    public final synchronized boolean w() {
        return uvf.t(this.b);
    }

    public final int w0() {
        y();
        return this.e;
    }

    public final void y() {
        if (this.f < 0 || this.g < 0) {
            s();
        }
    }

    public final void z(siw siwVar) {
        this.c = siwVar;
    }
}
