package xsna;

import androidx.media3.common.a;
import androidx.media3.extractor.flv.TagPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.l0;
import xsna.n3i0;

/* compiled from: FlvExtractor.java */
/* loaded from: classes12.dex */
public final class rur implements pgq {
    public final xi90 a = new xi90(4);
    public final xi90 b = new xi90(9);
    public final xi90 c = new xi90(11);
    public final xi90 d = new xi90();
    public final keh0 e;
    public rgq f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public androidx.media3.extractor.flv.a o;
    public androidx.media3.extractor.flv.b p;

    public rur() {
        keh0 keh0Var = new keh0(new k0n());
        keh0Var.b = C.TIME_UNSET;
        keh0Var.c = new long[0];
        keh0Var.d = new long[0];
        this.e = keh0Var;
        this.g = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0009 A[SYNTHETIC] */
    @Override // xsna.pgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        long j;
        long j2;
        int i;
        int i2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        this.f.getClass();
        while (true) {
            int i3 = this.g;
            if (i3 == 1) {
                xi90 xi90Var = this.b;
                if (!qgqVar.readFully(xi90Var.a, 0, 9, true)) {
                    return -1;
                }
                xi90Var.P(0);
                xi90Var.Q(4);
                int C = xi90Var.C();
                boolean z4 = (C & 4) != 0;
                boolean z5 = (C & 1) != 0;
                if (z4 && this.o == null) {
                    this.o = new androidx.media3.extractor.flv.a(this.f.track(8, 1));
                }
                if (z5 && this.p == null) {
                    this.p = new androidx.media3.extractor.flv.b(this.f.track(9, 2));
                }
                this.f.endTracks();
                this.j = xi90Var.p() - 5;
                this.g = 2;
            } else if (i3 == 2) {
                qgqVar.skipFully(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i3 == 3) {
                xi90 xi90Var2 = this.c;
                if (!qgqVar.readFully(xi90Var2.a, 0, 11, true)) {
                    return -1;
                }
                xi90Var2.P(0);
                this.k = xi90Var2.C();
                this.l = xi90Var2.F();
                this.m = xi90Var2.F();
                this.m = ((xi90Var2.C() << 24) | this.m) * 1000;
                xi90Var2.Q(3);
                this.g = 4;
            } else {
                if (i3 != 4) {
                    throw new IllegalStateException();
                }
                boolean z6 = this.h;
                keh0 keh0Var = this.e;
                if (z6) {
                    j = this.i + this.m;
                } else if (keh0Var.b == C.TIME_UNSET) {
                    j2 = 0;
                    i = this.k;
                    if (i == 8 || this.o == null) {
                        i2 = 0;
                        if (i == 9 || this.p == null) {
                            j3 = -9223372036854775807L;
                            if (i == 18 || this.n) {
                                qgqVar.skipFully(this.l);
                                z = false;
                                z2 = false;
                            } else {
                                xi90 f = f(qgqVar);
                                keh0Var.getClass();
                                keh0Var.getClass();
                                if (f.C() == 2 && "onMetaData".equals(keh0.c(f)) && f.a() != 0 && f.C() == 8) {
                                    HashMap<String, Object> b = keh0.b(f);
                                    Object obj = b.get("duration");
                                    double d = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double doubleValue = ((Double) obj).doubleValue();
                                        if (doubleValue > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                            keh0Var.b = (long) (doubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = b.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            keh0Var.c = new long[size];
                                            keh0Var.d = new long[size];
                                            int i4 = 0;
                                            while (i4 < size) {
                                                Object obj5 = list.get(i4);
                                                Object obj6 = list2.get(i4);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    keh0Var.c = new long[0];
                                                    keh0Var.d = new long[0];
                                                    break;
                                                }
                                                double d2 = d;
                                                keh0Var.c[i4] = (long) (((Double) obj6).doubleValue() * d2);
                                                keh0Var.d[i4] = ((Double) obj5).longValue();
                                                i4++;
                                                d = d2;
                                            }
                                        }
                                    }
                                }
                                long j4 = keh0Var.b;
                                if (j4 != C.TIME_UNSET) {
                                    this.f.f(new utw(keh0Var.d, keh0Var.c, j4));
                                    this.n = true;
                                }
                            }
                        } else {
                            if (!this.n) {
                                this.f.f(new n3i0.b(C.TIME_UNSET));
                                this.n = true;
                            }
                            androidx.media3.extractor.flv.b bVar = this.p;
                            xi90 f2 = f(qgqVar);
                            bVar.getClass();
                            int C2 = f2.C();
                            int i5 = (C2 >> 4) & 15;
                            int i6 = C2 & 15;
                            if (i6 != 7) {
                                throw new TagPayloadReader.UnsupportedFormatException(lhg.a(i6, "Video format not supported: "));
                            }
                            bVar.g = i5;
                            if (i5 != 5) {
                                xi90 xi90Var3 = bVar.b;
                                rgp0 rgp0Var = bVar.a;
                                xi90 xi90Var4 = bVar.c;
                                int C3 = f2.C();
                                f2.i(3);
                                byte[] bArr = f2.a;
                                j3 = -9223372036854775807L;
                                int i7 = f2.b;
                                int i8 = i7 + 1;
                                f2.b = i8;
                                int i9 = ((bArr[i7] & 255) << 24) >> 8;
                                f2.b = i7 + 2;
                                int i10 = ((bArr[i8] & 255) << 8) | i9;
                                f2.b = i7 + 3;
                                long j5 = (((bArr[r5] & 255) | i10) * 1000) + j2;
                                boolean z7 = false;
                                if (C3 == 0 && !bVar.e) {
                                    byte[] bArr2 = new byte[f2.a()];
                                    xi90 xi90Var5 = new xi90(bArr2);
                                    f2.n(bArr2, 0, f2.a());
                                    bt5 a = bt5.a(xi90Var5);
                                    bVar.d = a.b;
                                    a.C0043a c0043a = new a.C0043a();
                                    c0043a.l = io20.q("video/x-flv");
                                    c0043a.m = io20.q("video/avc");
                                    c0043a.j = a.l;
                                    c0043a.t = a.c;
                                    c0043a.u = a.d;
                                    c0043a.z = a.k;
                                    c0043a.p = a.a;
                                    zjh0.d(c0043a, rgp0Var);
                                    bVar.e = true;
                                } else if (C3 == 1 && bVar.e) {
                                    int i11 = bVar.g == 1 ? 1 : 0;
                                    if (bVar.f || i11 != 0) {
                                        byte[] bArr3 = xi90Var4.a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i12 = 4 - bVar.d;
                                        int i13 = 0;
                                        while (f2.a() > 0) {
                                            f2.n(xi90Var4.a, i12, bVar.d);
                                            xi90Var4.P(0);
                                            int G = xi90Var4.G();
                                            xi90Var3.P(0);
                                            rgp0Var.d(4, xi90Var3);
                                            rgp0Var.d(G, f2);
                                            i13 = i13 + 4 + G;
                                        }
                                        bVar.a.a(j5, i11, i13, 0, null);
                                        bVar.f = true;
                                        z7 = true;
                                    }
                                }
                                if (z7) {
                                    z = true;
                                    z2 = true;
                                }
                            } else {
                                j3 = -9223372036854775807L;
                            }
                        }
                        z = false;
                        z2 = true;
                    } else {
                        if (!this.n) {
                            this.f.f(new n3i0.b(C.TIME_UNSET));
                            this.n = true;
                        }
                        androidx.media3.extractor.flv.a aVar = this.o;
                        xi90 f3 = f(qgqVar);
                        rgp0 rgp0Var2 = aVar.a;
                        if (aVar.b) {
                            i2 = 0;
                            f3.Q(1);
                        } else {
                            int C4 = f3.C();
                            int i14 = (C4 >> 4) & 15;
                            aVar.d = i14;
                            i2 = 0;
                            if (i14 == 2) {
                                int i15 = androidx.media3.extractor.flv.a.e[(C4 >> 2) & 3];
                                a.C0043a c0043a2 = new a.C0043a();
                                c0043a2.l = io20.q("video/x-flv");
                                c0043a2.m = io20.q(MimeTypes.AUDIO_MPEG);
                                c0043a2.E = 1;
                                c0043a2.F = i15;
                                zjh0.d(c0043a2, rgp0Var2);
                                aVar.c = true;
                            } else if (i14 == 7 || i14 == 8) {
                                String str = i14 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW;
                                a.C0043a c0043a3 = new a.C0043a();
                                c0043a3.l = io20.q("video/x-flv");
                                c0043a3.m = io20.q(str);
                                c0043a3.E = 1;
                                c0043a3.F = 8000;
                                zjh0.d(c0043a3, rgp0Var2);
                                aVar.c = true;
                            } else if (i14 != 10) {
                                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + aVar.d);
                            }
                            aVar.b = true;
                        }
                        rgp0 rgp0Var3 = aVar.a;
                        if (aVar.d == 2) {
                            int a2 = f3.a();
                            rgp0Var3.d(a2, f3);
                            aVar.a.a(j2, 1, a2, 0, null);
                        } else {
                            int C5 = f3.C();
                            z3 = false;
                            if (C5 == 0 && !aVar.c) {
                                int a3 = f3.a();
                                byte[] bArr4 = new byte[a3];
                                f3.n(bArr4, 0, a3);
                                l0.a b2 = l0.b(new wi90(bArr4, a3), false);
                                a.C0043a c0043a4 = new a.C0043a();
                                c0043a4.l = io20.q("video/x-flv");
                                c0043a4.m = io20.q("audio/mp4a-latm");
                                c0043a4.j = b2.c;
                                c0043a4.E = b2.b;
                                c0043a4.F = b2.a;
                                c0043a4.p = Collections.singletonList(bArr4);
                                zjh0.d(c0043a4, rgp0Var3);
                                aVar.c = true;
                            } else if (aVar.d != 10 || C5 == 1) {
                                int a4 = f3.a();
                                rgp0Var3.d(a4, f3);
                                aVar.a.a(j2, 1, a4, 0, null);
                            }
                            z2 = true;
                            j3 = -9223372036854775807L;
                            z = z3;
                        }
                        z3 = true;
                        z2 = true;
                        j3 = -9223372036854775807L;
                        z = z3;
                    }
                    if (!this.h && z) {
                        this.h = true;
                        this.i = keh0Var.b != j3 ? -this.m : 0L;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (!z2) {
                        return i2;
                    }
                } else {
                    j = this.m;
                }
                j2 = j;
                i = this.k;
                if (i == 8) {
                }
                i2 = 0;
                if (i == 9) {
                }
                j3 = -9223372036854775807L;
                if (i == 18) {
                }
                qgqVar.skipFully(this.l);
                z = false;
                z2 = false;
                if (!this.h) {
                    this.h = true;
                    this.i = keh0Var.b != j3 ? -this.m : 0L;
                }
                this.j = 4;
                this.g = 2;
                if (!z2) {
                }
            }
        }
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        xi90 xi90Var = this.a;
        tel telVar = (tel) qgqVar;
        telVar.peekFully(xi90Var.a, 0, 3, false);
        xi90Var.P(0);
        if (xi90Var.F() == 4607062) {
            telVar.peekFully(xi90Var.a, 0, 2, false);
            xi90Var.P(0);
            if ((xi90Var.J() & 250) == 0) {
                telVar.peekFully(xi90Var.a, 0, 4, false);
                xi90Var.P(0);
                int p = xi90Var.p();
                telVar.f = 0;
                telVar.b(p, false);
                telVar.peekFully(xi90Var.a, 0, 4, false);
                xi90Var.P(0);
                if (xi90Var.p() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        this.f = rgqVar;
    }

    public final xi90 f(qgq qgqVar) throws IOException {
        int i = this.l;
        xi90 xi90Var = this.d;
        byte[] bArr = xi90Var.a;
        if (i > bArr.length) {
            xi90Var.N(new byte[Math.max(bArr.length * 2, i)], 0);
        } else {
            xi90Var.P(0);
        }
        xi90Var.O(this.l);
        qgqVar.readFully(xi90Var.a, 0, this.l);
        return xi90Var;
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // xsna.pgq
    public final void release() {
    }
}
