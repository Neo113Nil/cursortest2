package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;
import yads.aa2;
import yads.jk0;
import yads.kk0;
import yads.t31;

/* loaded from: classes7.dex */
public final class if81 implements n771 {
    public static final byte[] c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, Alerts.alert_certificate_revoked, 48, 48, 48, BlobHeaderStructure.BLOB_VERSION, Alerts.alert_certificate_expired, Alerts.alert_certificate_expired, 62, BlobHeaderStructure.BLOB_VERSION, 48, 48, 58, 48, 48, 58, 48, 48, Alerts.alert_certificate_revoked, 48, 48, 48, 10};
    public static final byte[] d0;
    public static final byte[] e0;
    public static final byte[] f0;
    public static final UUID g0;
    public static final Map h0;
    public long A;
    public long B;
    public ed71 C;
    public ed71 D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;
    public final q371 a;
    public boolean a0;
    public final el81 b;
    public yg71 b0;
    public final SparseArray c;
    public final boolean d;
    public final dl81 e;
    public final dl81 f;
    public final dl81 g;
    public final dl81 h;
    public final dl81 i;
    public final dl81 j;
    public final dl81 k;
    public final dl81 l;
    public final dl81 m;
    public final dl81 n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public ec81 u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;

    static {
        int i = rf71.a;
        d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(md81.c);
        e0 = new byte[]{68, 105, 97, 108, Alerts.alert_certificate_unobtainable, 103, 117, 101, 58, BlobHeaderStructure.BLOB_VERSION, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, Alerts.alert_certificate_revoked, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, Alerts.alert_certificate_revoked};
        f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, Alerts.alert_certificate_unknown, 48, 48, 48, BlobHeaderStructure.BLOB_VERSION, Alerts.alert_certificate_expired, Alerts.alert_certificate_expired, 62, BlobHeaderStructure.BLOB_VERSION, 48, 48, 58, 48, 48, 58, 48, 48, Alerts.alert_certificate_unknown, 48, 48, 48, 10};
        g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        gia1.b(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        gia1.b(SubsamplingScaleImageView.ORIENTATION_180, hashMap, "htc_video_rotA-180", SubsamplingScaleImageView.ORIENTATION_270, "htc_video_rotA-270");
        h0 = Collections.unmodifiableMap(hashMap);
    }

    public if81(int i) {
        q371 q371Var = new q371();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = q371Var;
        q371Var.d = new lm71(7, this);
        this.d = (i & 1) == 0;
        this.b = new el81();
        this.c = new SparseArray();
        this.g = new dl81(4);
        this.h = new dl81(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new dl81(4);
        this.e = new dl81(sba1.a);
        this.f = new dl81(4);
        this.j = new dl81();
        this.k = new dl81();
        this.l = new dl81(8);
        this.m = new dl81();
        this.n = new dl81();
        this.L = new int[1];
    }

    public static byte[] k(long j, long j2, String str) {
        if (j == -9223372036854775807L) {
            w511.q();
            return null;
        }
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = rf71.a;
        return format.getBytes(md81.c);
    }

    public final int a(w971 w971Var, ec81 ec81Var, int i, boolean z) {
        char c;
        int c2;
        int c3;
        int i2;
        if ("S_TEXT/UTF8".equals(ec81Var.b)) {
            i(w971Var, c0, i);
            int i3 = this.T;
            l();
            return i3;
        }
        if ("S_TEXT/ASS".equals(ec81Var.b)) {
            i(w971Var, e0, i);
            int i4 = this.T;
            l();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(ec81Var.b)) {
            i(w971Var, f0, i);
            int i5 = this.T;
            l();
            return i5;
        }
        fb81 fb81Var = ec81Var.X;
        boolean z2 = this.V;
        char c4 = 2;
        dl81 dl81Var = this.j;
        if (z2) {
            c = 2;
        } else {
            boolean z3 = ec81Var.h;
            dl81 dl81Var2 = this.g;
            if (z3) {
                this.O &= -1073741825;
                if (!this.W) {
                    w971Var.E(dl81Var2.a, 0, 1, false);
                    this.S++;
                    byte b = dl81Var2.a[0];
                    if ((b & DerValue.TAG_CONTEXT) == 128) {
                        dy31.g(null, "Extension bit is set in signal byte");
                        return 0;
                    }
                    this.Z = b;
                    this.W = true;
                }
                byte b2 = this.Z;
                if ((b2 & 1) == 1) {
                    boolean z4 = (b2 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.a0) {
                        dl81 dl81Var3 = this.l;
                        w971Var.E(dl81Var3.a, 0, 8, false);
                        this.S += 8;
                        this.a0 = true;
                        dl81Var2.a[0] = (byte) ((z4 ? 128 : 0) | 8);
                        dl81Var2.m(0);
                        fb81Var.a(1, dl81Var2);
                        this.T++;
                        dl81Var3.m(0);
                        fb81Var.a(8, dl81Var3);
                        this.T += 8;
                    }
                    if (z4) {
                        if (!this.X) {
                            w971Var.E(dl81Var2.a, 0, 1, false);
                            this.S++;
                            dl81Var2.m(0);
                            this.Y = dl81Var2.s();
                            this.X = true;
                        }
                        int i6 = this.Y * 4;
                        dl81Var2.i(i6);
                        w971Var.E(dl81Var2.a, 0, i6, false);
                        this.S += i6;
                        short s = (short) ((this.Y / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.o = ByteBuffer.allocate(i7);
                        }
                        this.o.position(0);
                        this.o.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.Y;
                            if (i8 >= i2) {
                                break;
                            }
                            int v = dl81Var2.v();
                            int i10 = i8 % 2;
                            char c5 = c4;
                            ByteBuffer byteBuffer2 = this.o;
                            if (i10 == 0) {
                                byteBuffer2.putShort((short) (v - i9));
                            } else {
                                byteBuffer2.putInt(v - i9);
                            }
                            i8++;
                            i9 = v;
                            c4 = c5;
                        }
                        c = c4;
                        int i11 = (i - this.S) - i9;
                        int i12 = i2 % 2;
                        ByteBuffer byteBuffer3 = this.o;
                        if (i12 == 1) {
                            byteBuffer3.putInt(i11);
                        } else {
                            byteBuffer3.putShort((short) i11);
                            this.o.putInt(0);
                        }
                        byte[] array = this.o.array();
                        dl81 dl81Var4 = this.m;
                        dl81Var4.a = array;
                        dl81Var4.c = i7;
                        dl81Var4.b = 0;
                        fb81Var.a(i7, dl81Var4);
                        this.T += i7;
                    }
                }
                c = 2;
            } else {
                c = 2;
                byte[] bArr = ec81Var.i;
                if (bArr != null) {
                    int length = bArr.length;
                    dl81Var.a = bArr;
                    dl81Var.c = length;
                    dl81Var.b = 0;
                }
            }
            if ("A_OPUS".equals(ec81Var.b) ? z : ec81Var.f > 0) {
                this.O |= SelfTester_JCP.IMITA;
                this.n.i(0);
                int i13 = (dl81Var.c + i) - this.S;
                dl81Var2.i(4);
                byte[] bArr2 = dl81Var2.a;
                bArr2[0] = (byte) ((i13 >> 24) & 255);
                bArr2[1] = (byte) ((i13 >> 16) & 255);
                bArr2[c] = (byte) ((i13 >> 8) & 255);
                bArr2[3] = (byte) (i13 & 255);
                fb81Var.a(4, dl81Var2);
                this.T += 4;
            }
            this.V = true;
        }
        int i14 = i + dl81Var.c;
        if (!"V_MPEG4/ISO/AVC".equals(ec81Var.b) && !"V_MPEGH/ISO/HEVC".equals(ec81Var.b)) {
            c371 c371Var = ec81Var.T;
            if (c371Var != null) {
                if (dl81Var.c != 0) {
                    ny61.k();
                    return 0;
                }
                c371Var.a(w971Var);
            }
            while (true) {
                int i15 = this.S;
                if (i15 >= i14) {
                    break;
                }
                int i16 = i14 - i15;
                int i17 = dl81Var.c - dl81Var.b;
                if (i17 > 0) {
                    c3 = Math.min(i16, i17);
                    fb81Var.a(c3, dl81Var);
                } else {
                    c3 = fb81Var.c(w971Var, i16, false);
                }
                this.S += c3;
                this.T += c3;
            }
        } else {
            dl81 dl81Var5 = this.f;
            byte[] bArr3 = dl81Var5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[c] = 0;
            int i18 = ec81Var.Y;
            int i19 = 4 - i18;
            while (this.S < i14) {
                int i20 = this.U;
                int i21 = dl81Var.c;
                if (i20 == 0) {
                    int min = Math.min(i18, i21 - dl81Var.b);
                    w971Var.E(bArr3, i19 + min, i18 - min, false);
                    if (min > 0) {
                        dl81Var.d(i19, min, bArr3);
                    }
                    this.S += i18;
                    dl81Var5.m(0);
                    this.U = dl81Var5.v();
                    dl81 dl81Var6 = this.e;
                    dl81Var6.m(0);
                    fb81Var.a(4, dl81Var6);
                    this.T += 4;
                } else {
                    int i22 = i21 - dl81Var.b;
                    if (i22 > 0) {
                        c2 = Math.min(i20, i22);
                        fb81Var.a(c2, dl81Var);
                    } else {
                        c2 = fb81Var.c(w971Var, i20, false);
                    }
                    this.S += c2;
                    this.T += c2;
                    this.U -= c2;
                }
            }
        }
        if ("A_VORBIS".equals(ec81Var.b)) {
            dl81 dl81Var7 = this.h;
            dl81Var7.m(0);
            fb81Var.a(4, dl81Var7);
            this.T += 4;
        }
        int i23 = this.T;
        l();
        return i23;
    }

    @Override // defpackage.n771
    public final void b(yg71 yg71Var) {
        this.b0 = yg71Var;
    }

    @Override // defpackage.n771
    public final void c(long j, long j2) {
        this.B = -9223372036854775807L;
        this.G = 0;
        q371 q371Var = this.a;
        q371Var.e = 0;
        q371Var.b.clear();
        el81 el81Var = q371Var.c;
        el81Var.b = 0;
        el81Var.c = 0;
        el81 el81Var2 = this.b;
        el81Var2.b = 0;
        el81Var2.c = 0;
        l();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            c371 c371Var = ((ec81) sparseArray.valueAt(i)).T;
            if (c371Var != null) {
                c371Var.b = false;
                c371Var.c = 0;
            }
            i++;
        }
    }

    public final long d(long j) {
        long j2 = this.r;
        if (j2 != -9223372036854775807L) {
            return rf71.h(j, j2, 1000L);
        }
        dy31.g(null, "Can't scale timecode prior to timecodeScale being set.");
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x0456, code lost:
    
        defpackage.dy31.g(null, "EBML lacing sample size out of range.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x045e, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0911, code lost:
    
        if (r3 == false) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0913, code lost:
    
        r4 = r4.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0917, code lost:
    
        if (r36.y == false) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0750, code lost:
    
        defpackage.dy31.g(null, defpackage.qv10.k(r11, "DocTypeReadVersion ", " not supported"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x075c, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0924, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0928, code lost:
    
        if (r36.v == false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0794, code lost:
    
        defpackage.dy31.g(null, defpackage.oyr.j(r10, "Element ", " must be in a Cues"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x079e, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x092a, code lost:
    
        r4 = r36.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x07d1, code lost:
    
        defpackage.dy31.g(null, defpackage.oyr.j(r10, "Element ", " must be in a Cues"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0930, code lost:
    
        if (r4 == (-1)) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x07db, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0932, code lost:
    
        r38.a = r4;
        r36.A = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0936, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0939, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0957, code lost:
    
        if (r4 != false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0959, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x095a, code lost:
    
        r1 = r36.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0960, code lost:
    
        if (r7 >= r1.size()) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0962, code lost:
    
        r1 = (defpackage.ec81) r1.valueAt(r7);
        r1.X.getClass();
        r2 = r1.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x096f, code lost:
    
        if (r2 == null) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0919, code lost:
    
        r36.A = r4;
        r38.a = r36.z;
        r36.y = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0971, code lost:
    
        r8 = r1.X;
        r14 = r1.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0977, code lost:
    
        if (r2.c <= 0) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0979, code lost:
    
        r8.b(r2.d, r2.e, r2.f, r2.g, r14);
        r2.c = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0989, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x098c, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x098f, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0923, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0937, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:358:0x062b  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v12, types: [w971] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r7v3, types: [el81] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [int] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [int] */
    /* JADX WARN: Type inference failed for: r9v32 */
    @Override // defpackage.n771
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(bb71 bb71Var, jp61 jp61Var) {
        long j;
        w971 w971Var;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        ?? r9;
        ed71 ed71Var;
        int i2;
        String str;
        boolean z5;
        boolean z6;
        char c;
        int i3;
        long j2;
        int i4;
        int i5;
        boolean z7;
        long j3;
        w971 w971Var2;
        int i6;
        w971 w971Var3;
        int a;
        ?? r2 = 0;
        this.F = false;
        boolean z8 = true;
        boolean z9 = true;
        while (true) {
            int i7 = -1;
            if (z9 && !this.F) {
                q371 q371Var = this.a;
                ?? r7 = q371Var.c;
                ArrayDeque arrayDeque = q371Var.b;
                byte[] bArr = q371Var.a;
                w971 w971Var4 = (w971) bb71Var;
                if (q371Var.d == null) {
                    ny61.k();
                    return r2;
                }
                while (true) {
                    g071 g071Var = (g071) arrayDeque.peek();
                    if (g071Var != null) {
                        j = -1;
                        if (w971Var4.w >= g071Var.b) {
                            ((if81) q371Var.d.b).m(((g071) arrayDeque.pop()).a);
                            z = r2;
                            w971Var = w971Var4;
                        }
                    } else {
                        j = -1;
                    }
                    int i8 = 475249515;
                    int i9 = 524531317;
                    long j4 = j;
                    w971 w971Var5 = w971Var4;
                    if (q371Var.e == 0) {
                        long b = r7.b(w971Var4, z8, r2, 4);
                        if (b == -2) {
                            w971Var4.y = r2;
                            ?? r4 = w971Var4;
                            while (true) {
                                r4.I(bArr, r2, 4, r2);
                                byte b2 = bArr[r2];
                                i6 = r2;
                                w971 w971Var6 = r4;
                                while (true) {
                                    if (i6 < 8) {
                                        w971Var3 = w971Var6;
                                        long j5 = el81.d[i6] & b2;
                                        i6++;
                                        if (j5 == 0) {
                                            w971Var6 = w971Var3;
                                        }
                                    } else {
                                        w971Var3 = w971Var6;
                                        i6 = i7;
                                    }
                                }
                                if (i6 != i7 && i6 <= 4) {
                                    a = (int) el81.a(i6, bArr, r2);
                                    Object obj = q371Var.d.b;
                                    if (a == 357149030 || a == i9 || a == i8 || a == 374648427) {
                                    }
                                }
                                w971 w971Var7 = w971Var3;
                                w971Var7.b(1);
                                i8 = 475249515;
                                i9 = 524531317;
                                r4 = w971Var7;
                            }
                            w971 w971Var8 = w971Var3;
                            w971Var8.b(i6);
                            j3 = a;
                            z8 = true;
                            w971Var2 = w971Var8;
                        } else {
                            j3 = b;
                            w971Var2 = w971Var4;
                        }
                        if (j3 == j4) {
                            z8 = r2;
                            z = r2;
                            w971Var = w971Var2;
                        } else {
                            q371Var.f = (int) j3;
                            q371Var.e = z8 ? 1 : 0;
                            w971Var5 = w971Var2;
                        }
                    }
                    if (q371Var.e == z8) {
                        q371Var.g = r7.b(w971Var5, r2, z8, 8);
                        q371Var.e = 2;
                    }
                    lm71 lm71Var = q371Var.d;
                    int i10 = q371Var.f;
                    if81 if81Var = (if81) lm71Var.b;
                    switch (i10) {
                        case HProv.PP_FAST_CODE /* 131 */:
                        case HProv.PP_LCD_QUERY /* 136 */:
                        case ModuleDescriptor.MODULE_VERSION /* 155 */:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 241:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            i = 2;
                            break;
                        case HProv.PP_CONTAINER_EXTENSION_DEL /* 134 */:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i = 3;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i = 1;
                            break;
                        case 161:
                        case HProv.PP_HANDLE_COUNT /* 163 */:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i = 4;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            i = 5;
                            break;
                        default:
                            i = r2;
                            break;
                    }
                    if (i != 0) {
                        Exception exc = null;
                        if (i != 1) {
                            if (i == 2) {
                                long j6 = q371Var.g;
                                if (j6 > 8) {
                                    throw new aa2("Invalid integer size: " + q371Var.g, null, true, 1);
                                }
                                int i11 = (int) j6;
                                w971Var5.E(bArr, 0, i11, false);
                                long j7 = 0;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    j7 = (j7 << 8) | (bArr[i12] & 255);
                                }
                                if81 if81Var2 = (if81) lm71Var.b;
                                if (i10 != 20529) {
                                    if (i10 != 20530) {
                                        switch (i10) {
                                            case HProv.PP_FAST_CODE /* 131 */:
                                                if81Var2.g(i10);
                                                if81Var2.u.d = (int) j7;
                                                break;
                                            case HProv.PP_LCD_QUERY /* 136 */:
                                                if81Var2.g(i10);
                                                if81Var2.u.V = j7 == 1;
                                                break;
                                            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                                                if81Var2.I = if81Var2.d(j7);
                                                break;
                                            case 159:
                                                if81Var2.g(i10);
                                                if81Var2.u.O = (int) j7;
                                                break;
                                            case 176:
                                                if81Var2.g(i10);
                                                if81Var2.u.m = (int) j7;
                                                break;
                                            case 179:
                                                ed71 ed71Var2 = if81Var2.C;
                                                if (ed71Var2 != null && if81Var2.D != null) {
                                                    ed71Var2.b(if81Var2.d(j7));
                                                    break;
                                                }
                                                break;
                                            case 186:
                                                if81Var2.g(i10);
                                                if81Var2.u.n = (int) j7;
                                                break;
                                            case 215:
                                                if81Var2.g(i10);
                                                if81Var2.u.c = (int) j7;
                                                break;
                                            case 231:
                                                if81Var2.B = if81Var2.d(j7);
                                                break;
                                            case 238:
                                                if81Var2.P = (int) j7;
                                                break;
                                            case 241:
                                                if (!if81Var2.E) {
                                                    if (if81Var2.C != null && (ed71Var = if81Var2.D) != null) {
                                                        ed71Var.b(j7);
                                                        if81Var2.E = true;
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 251:
                                                if81Var2.Q = true;
                                                break;
                                            case 16871:
                                                if81Var2.g(i10);
                                                if81Var2.u.g = (int) j7;
                                                break;
                                            case 16980:
                                                i2 = 0;
                                                if (j7 != 3) {
                                                    dy31.g(null, qv10.k(j7, "ContentCompAlgo ", " not supported"));
                                                    return 0;
                                                }
                                                r9 = i2;
                                                break;
                                            case 17029:
                                                if (j7 < 1 || j7 > 2) {
                                                }
                                                break;
                                            case 17143:
                                                i2 = 0;
                                                if (j7 != 1) {
                                                    dy31.g(null, qv10.k(j7, "EBMLReadVersion ", " not supported"));
                                                    return 0;
                                                }
                                                r9 = i2;
                                                break;
                                            case 18401:
                                                i2 = 0;
                                                if (j7 != 5) {
                                                    dy31.g(null, qv10.k(j7, "ContentEncAlgo ", " not supported"));
                                                    return 0;
                                                }
                                                r9 = i2;
                                                break;
                                            case 18408:
                                                if (j7 != 1) {
                                                    dy31.g(null, qv10.k(j7, "AESSettingsCipherMode ", " not supported"));
                                                    return 0;
                                                }
                                                break;
                                            case 21420:
                                                if81Var2.x = j7 + if81Var2.q;
                                                break;
                                            case 21432:
                                                int i13 = (int) j7;
                                                if81Var2.g(i10);
                                                if (i13 != 0) {
                                                    if (i13 != 1) {
                                                        if (i13 != 3) {
                                                            if (i13 == 15) {
                                                                if81Var2.u.w = 3;
                                                                break;
                                                            }
                                                        } else {
                                                            if81Var2.u.w = 1;
                                                            break;
                                                        }
                                                    } else {
                                                        if81Var2.u.w = 2;
                                                        break;
                                                    }
                                                } else {
                                                    r9 = 0;
                                                    if81Var2.u.w = 0;
                                                    break;
                                                }
                                                break;
                                            case 21680:
                                                if81Var2.g(i10);
                                                if81Var2.u.o = (int) j7;
                                                break;
                                            case 21682:
                                                if81Var2.g(i10);
                                                if81Var2.u.q = (int) j7;
                                                break;
                                            case 21690:
                                                if81Var2.g(i10);
                                                if81Var2.u.p = (int) j7;
                                                break;
                                            case 21930:
                                                if81Var2.g(i10);
                                                if81Var2.u.U = j7 == 1;
                                                break;
                                            case 21998:
                                                if81Var2.g(i10);
                                                if81Var2.u.f = (int) j7;
                                                break;
                                            case 22186:
                                                if81Var2.g(i10);
                                                if81Var2.u.R = j7;
                                                break;
                                            case 22203:
                                                if81Var2.g(i10);
                                                if81Var2.u.S = j7;
                                                break;
                                            case 25188:
                                                if81Var2.g(i10);
                                                if81Var2.u.P = (int) j7;
                                                break;
                                            case 30114:
                                                if81Var2.R = j7;
                                                break;
                                            case 30321:
                                                if81Var2.g(i10);
                                                int i14 = (int) j7;
                                                if (i14 != 0) {
                                                    if (i14 != 1) {
                                                        if (i14 != 2) {
                                                            if (i14 == 3) {
                                                                if81Var2.u.r = 3;
                                                                break;
                                                            }
                                                        } else {
                                                            if81Var2.u.r = 2;
                                                            break;
                                                        }
                                                    } else {
                                                        if81Var2.u.r = 1;
                                                        break;
                                                    }
                                                } else {
                                                    r9 = 0;
                                                    if81Var2.u.r = 0;
                                                    break;
                                                }
                                                break;
                                            case 2352003:
                                                if81Var2.g(i10);
                                                if81Var2.u.e = (int) j7;
                                                break;
                                            case 2807729:
                                                if81Var2.r = j7;
                                                break;
                                            default:
                                                int i15 = 7;
                                                switch (i10) {
                                                    case 21945:
                                                        if81Var2.g(i10);
                                                        int i16 = (int) j7;
                                                        if (i16 != 1) {
                                                            if (i16 == 2) {
                                                                if81Var2.u.A = 1;
                                                                break;
                                                            }
                                                        } else {
                                                            if81Var2.u.A = 2;
                                                            break;
                                                        }
                                                        break;
                                                    case 21946:
                                                        if81Var2.g(i10);
                                                        int i17 = (int) j7;
                                                        if (i17 != 1) {
                                                            if (i17 == 16) {
                                                                i15 = 6;
                                                            } else if (i17 != 18) {
                                                                if (i17 != 6 && i17 != 7) {
                                                                    i15 = -1;
                                                                }
                                                            }
                                                            if (i15 != -1) {
                                                                if81Var2.u.z = i15;
                                                                break;
                                                            }
                                                        }
                                                        i15 = 3;
                                                        if (i15 != -1) {
                                                        }
                                                        break;
                                                    case 21947:
                                                        if81Var2.g(i10);
                                                        ec81 ec81Var = if81Var2.u;
                                                        ec81Var.x = true;
                                                        int i18 = (int) j7;
                                                        int i19 = i18 != 1 ? i18 != 9 ? (i18 == 4 || i18 == 5 || i18 == 6 || i18 == 7) ? 2 : -1 : 6 : 1;
                                                        if (i19 != -1) {
                                                            ec81Var.y = i19;
                                                            break;
                                                        }
                                                        break;
                                                    case 21948:
                                                        if81Var2.g(i10);
                                                        if81Var2.u.B = (int) j7;
                                                        break;
                                                    case 21949:
                                                        if81Var2.g(i10);
                                                        if81Var2.u.C = (int) j7;
                                                        break;
                                                }
                                        }
                                    } else if (j7 != 1) {
                                        dy31.g(null, qv10.k(j7, "ContentEncodingScope ", " not supported"));
                                        return 0;
                                    }
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                    if (j7 != 0) {
                                        dy31.g(null, qv10.k(j7, "ContentEncodingOrder ", " not supported"));
                                        return 0;
                                    }
                                }
                                q371Var.e = r9;
                            } else if (i == 3) {
                                long j8 = q371Var.g;
                                if (j8 > 2147483647L) {
                                    throw new aa2("String element size: " + q371Var.g, null, true, 1);
                                }
                                int i20 = (int) j8;
                                if (i20 == 0) {
                                    str = "";
                                } else {
                                    byte[] bArr2 = new byte[i20];
                                    w971Var5.E(bArr2, 0, i20, false);
                                    while (i20 > 0 && bArr2[i20 - 1] == 0) {
                                        i20--;
                                    }
                                    str = new String(bArr2, 0, i20);
                                }
                                if81 if81Var3 = (if81) lm71Var.b;
                                if (i10 != 134) {
                                    if (i10 != 17026) {
                                        if (i10 == 21358) {
                                            if81Var3.g(i10);
                                            if81Var3.u.a = str;
                                        } else if (i10 == 2274716) {
                                            if81Var3.g(i10);
                                            if81Var3.u.W = str;
                                        }
                                    } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                        dy31.g(null, oyr.p("DocType ", str, " not supported"));
                                        return 0;
                                    }
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                    if81Var3.g(i10);
                                    if81Var3.u.b = str;
                                }
                                q371Var.e = r9;
                            } else if (i == 4) {
                                int i21 = (int) q371Var.g;
                                el81 el81Var = if81Var.b;
                                dl81 dl81Var = if81Var.n;
                                SparseArray sparseArray = if81Var.c;
                                dl81 dl81Var2 = if81Var.i;
                                dl81 dl81Var3 = if81Var.g;
                                if (i10 == 161 || i10 == 163) {
                                    z5 = false;
                                    if (if81Var.G == 0) {
                                        if81Var.M = (int) el81Var.b(w971Var5, false, true, 8);
                                        if81Var.N = el81Var.c;
                                        if81Var.I = -9223372036854775807L;
                                        if81Var.G = 1;
                                        dl81Var3.i(0);
                                    }
                                    ec81 ec81Var2 = (ec81) sparseArray.get(if81Var.M);
                                    if (ec81Var2 == null) {
                                        w971Var5.b(i21 - if81Var.N);
                                        if81Var.G = 0;
                                        z7 = z5;
                                        q371Var.e = z7 ? 1 : 0;
                                        z4 = z7;
                                    } else {
                                        ec81Var2.X.getClass();
                                        if (if81Var.G == 1) {
                                            if81Var.h(w971Var5, 3);
                                            int i22 = (dl81Var3.a[2] & 6) >> 1;
                                            if (i22 == 0) {
                                                if81Var.K = 1;
                                                int[] iArr = if81Var.L;
                                                if (iArr == null) {
                                                    iArr = new int[1];
                                                } else if (iArr.length < 1) {
                                                    iArr = new int[Math.max(iArr.length * 2, 1)];
                                                }
                                                if81Var.L = iArr;
                                                iArr[0] = (i21 - if81Var.N) - 3;
                                            } else {
                                                if81Var.h(w971Var5, 4);
                                                int i23 = (dl81Var3.a[3] & 255) + 1;
                                                if81Var.K = i23;
                                                int[] iArr2 = if81Var.L;
                                                if (iArr2 == null) {
                                                    iArr2 = new int[i23];
                                                } else if (iArr2.length < i23) {
                                                    iArr2 = new int[Math.max(iArr2.length * 2, i23)];
                                                }
                                                if81Var.L = iArr2;
                                                if (i22 == 2) {
                                                    int i24 = (i21 - if81Var.N) - 4;
                                                    int i25 = if81Var.K;
                                                    Arrays.fill(iArr2, 0, i25, i24 / i25);
                                                    c = 0;
                                                } else {
                                                    int i26 = 0;
                                                    int i27 = 1;
                                                    if (i22 == 1) {
                                                        int i28 = 0;
                                                        int i29 = 0;
                                                        int i30 = 4;
                                                        while (true) {
                                                            int i31 = if81Var.K - i27;
                                                            int[] iArr3 = if81Var.L;
                                                            if (i28 < i31) {
                                                                iArr3[i28] = i26;
                                                                while (true) {
                                                                    i4 = i30 + 1;
                                                                    if81Var.h(w971Var5, i4);
                                                                    int i32 = dl81Var3.a[i30] & 255;
                                                                    int[] iArr4 = if81Var.L;
                                                                    i5 = iArr4[i28] + i32;
                                                                    iArr4[i28] = i5;
                                                                    if (i32 != 255) {
                                                                        break;
                                                                    }
                                                                    i30 = i4;
                                                                }
                                                                i29 += i5;
                                                                i28++;
                                                                i30 = i4;
                                                                i26 = 0;
                                                                i27 = 1;
                                                            } else {
                                                                iArr3[i31] = ((i21 - if81Var.N) - i30) - i29;
                                                            }
                                                        }
                                                    } else {
                                                        if (i22 != 3) {
                                                            dy31.g(null, q8a1.c(i22, "Unexpected lacing value: "));
                                                            return 0;
                                                        }
                                                        int i33 = 0;
                                                        int i34 = 0;
                                                        int i35 = 4;
                                                        while (true) {
                                                            int i36 = if81Var.K - 1;
                                                            int[] iArr5 = if81Var.L;
                                                            if (i33 < i36) {
                                                                iArr5[i33] = 0;
                                                                int i37 = i35 + 1;
                                                                if81Var.h(w971Var5, i37);
                                                                if (dl81Var3.a[i35] == 0) {
                                                                    dy31.g(exc, "No valid varint length mask found");
                                                                    return 0;
                                                                }
                                                                int i38 = 0;
                                                                while (true) {
                                                                    if (i38 < 8) {
                                                                        int i39 = 1 << (7 - i38);
                                                                        if ((dl81Var3.a[i35] & i39) != 0) {
                                                                            int i40 = i37 + i38;
                                                                            if81Var.h(w971Var5, i40);
                                                                            i3 = i21;
                                                                            int i41 = dl81Var3.a[i35] & 255 & (~i39);
                                                                            int i42 = i38;
                                                                            long j9 = i41;
                                                                            while (i37 < i40) {
                                                                                j9 = (j9 << 8) | (dl81Var3.a[i37] & 255);
                                                                                i37++;
                                                                            }
                                                                            j2 = i33 > 0 ? j9 - ((1 << ((i42 * 7) + 6)) - 1) : j9;
                                                                            i35 = i40;
                                                                        } else {
                                                                            i38++;
                                                                        }
                                                                    } else {
                                                                        i3 = i21;
                                                                        i35 = i37;
                                                                        j2 = 0;
                                                                    }
                                                                }
                                                                if (j2 >= -2147483648L && j2 <= 2147483647L) {
                                                                    int i43 = (int) j2;
                                                                    int[] iArr6 = if81Var.L;
                                                                    if (i33 != 0) {
                                                                        i43 += iArr6[i33 - 1];
                                                                    }
                                                                    iArr6[i33] = i43;
                                                                    i34 += i43;
                                                                    i33++;
                                                                    i21 = i3;
                                                                    exc = null;
                                                                }
                                                            } else {
                                                                c = 0;
                                                                iArr5[i36] = ((i21 - if81Var.N) - i35) - i34;
                                                            }
                                                        }
                                                    }
                                                }
                                                byte[] bArr3 = dl81Var3.a;
                                                if81Var.H = if81Var.d((bArr3[1] & 255) | (bArr3[c] << 8)) + if81Var.B;
                                                if81Var.O = (ec81Var2.d != 2 || (i10 == 163 && (dl81Var3.a[2] & DerValue.TAG_CONTEXT) == 128)) ? 1 : 0;
                                                if81Var.G = 2;
                                                z6 = false;
                                                if81Var.J = 0;
                                            }
                                            c = 0;
                                            byte[] bArr32 = dl81Var3.a;
                                            if81Var.H = if81Var.d((bArr32[1] & 255) | (bArr32[c] << 8)) + if81Var.B;
                                            if81Var.O = (ec81Var2.d != 2 || (i10 == 163 && (dl81Var3.a[2] & DerValue.TAG_CONTEXT) == 128)) ? 1 : 0;
                                            if81Var.G = 2;
                                            z6 = false;
                                            if81Var.J = 0;
                                        } else {
                                            z6 = false;
                                        }
                                        boolean z10 = z6;
                                        if (i10 == 163) {
                                            while (true) {
                                                int i44 = if81Var.J;
                                                if (i44 < if81Var.K) {
                                                    if81Var.j(ec81Var2, if81Var.H + ((if81Var.J * ec81Var2.e) / 1000), if81Var.O, if81Var.a(w971Var5, ec81Var2, if81Var.L[i44], z10), 0);
                                                    if81Var.J++;
                                                    z10 = false;
                                                } else {
                                                    if81Var.G = z10 ? 1 : 0;
                                                    z7 = z10;
                                                    q371Var.e = z7 ? 1 : 0;
                                                    z4 = z7;
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                int i45 = if81Var.J;
                                                if (i45 < if81Var.K) {
                                                    int[] iArr7 = if81Var.L;
                                                    iArr7[i45] = if81Var.a(w971Var5, ec81Var2, iArr7[i45], true);
                                                    if81Var.J++;
                                                } else {
                                                    z7 = false;
                                                    q371Var.e = z7 ? 1 : 0;
                                                    z4 = z7;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (i10 != 165) {
                                        if (i10 == 16877) {
                                            if81Var.g(i10);
                                            ec81 ec81Var3 = if81Var.u;
                                            int i46 = ec81Var3.g;
                                            if (i46 == 1685485123 || i46 == 1685480259) {
                                                byte[] bArr4 = new byte[i21];
                                                ec81Var3.N = bArr4;
                                                z7 = false;
                                                w971Var5.E(bArr4, 0, i21, false);
                                            } else {
                                                w971Var5.b(i21);
                                            }
                                        } else if (i10 == 16981) {
                                            z7 = false;
                                            if81Var.g(i10);
                                            byte[] bArr5 = new byte[i21];
                                            if81Var.u.i = bArr5;
                                            w971Var5.E(bArr5, 0, i21, false);
                                        } else if (i10 == 18402) {
                                            z7 = false;
                                            byte[] bArr6 = new byte[i21];
                                            w971Var5.E(bArr6, 0, i21, false);
                                            if81Var.g(i10);
                                            if81Var.u.j = new v781(1, 0, 0, bArr6);
                                        } else if (i10 == 21419) {
                                            z7 = false;
                                            Arrays.fill(dl81Var2.a, (byte) 0);
                                            w971Var5.E(dl81Var2.a, 4 - i21, i21, false);
                                            dl81Var2.m(0);
                                            if81Var.w = (int) dl81Var2.t();
                                        } else if (i10 == 25506) {
                                            z7 = false;
                                            if81Var.g(i10);
                                            byte[] bArr7 = new byte[i21];
                                            if81Var.u.k = bArr7;
                                            w971Var5.E(bArr7, 0, i21, false);
                                        } else {
                                            if (i10 != 30322) {
                                                dy31.g(null, q8a1.c(i10, "Unexpected id: "));
                                                return 0;
                                            }
                                            if81Var.g(i10);
                                            byte[] bArr8 = new byte[i21];
                                            if81Var.u.v = bArr8;
                                            z7 = false;
                                            w971Var5.E(bArr8, 0, i21, false);
                                        }
                                        q371Var.e = z7 ? 1 : 0;
                                        z4 = z7;
                                    } else if (if81Var.G == 2) {
                                        ec81 ec81Var4 = (ec81) sparseArray.get(if81Var.M);
                                        if (if81Var.P == 4 && "V_VP9".equals(ec81Var4.b)) {
                                            dl81Var.i(i21);
                                            z5 = false;
                                            w971Var5.E(dl81Var.a, 0, i21, false);
                                        } else {
                                            z5 = false;
                                            w971Var5.b(i21);
                                        }
                                        z7 = z5;
                                        q371Var.e = z7 ? 1 : 0;
                                        z4 = z7;
                                    }
                                    z7 = false;
                                    q371Var.e = z7 ? 1 : 0;
                                    z4 = z7;
                                }
                            } else {
                                if (i != 5) {
                                    dy31.g(null, q8a1.c(i, "Invalid element type "));
                                    return 0;
                                }
                                long j10 = q371Var.g;
                                if (j10 != 4 && j10 != 8) {
                                    throw new aa2("Invalid float size: " + q371Var.g, null, true, 1);
                                }
                                int i47 = (int) j10;
                                w971Var5.E(bArr, 0, i47, false);
                                long j11 = 0;
                                for (int i48 = 0; i48 < i47; i48++) {
                                    j11 = (j11 << 8) | (bArr[i48] & 255);
                                }
                                double intBitsToFloat = i47 == 4 ? Float.intBitsToFloat((int) j11) : Double.longBitsToDouble(j11);
                                if81 if81Var4 = (if81) lm71Var.b;
                                if (i10 == 181) {
                                    if81Var4.g(i10);
                                    if81Var4.u.Q = (int) intBitsToFloat;
                                } else if (i10 != 17545) {
                                    switch (i10) {
                                        case 21969:
                                            if81Var4.g(i10);
                                            if81Var4.u.D = (float) intBitsToFloat;
                                            break;
                                        case 21970:
                                            if81Var4.g(i10);
                                            if81Var4.u.E = (float) intBitsToFloat;
                                            break;
                                        case 21971:
                                            if81Var4.g(i10);
                                            if81Var4.u.F = (float) intBitsToFloat;
                                            break;
                                        case 21972:
                                            if81Var4.g(i10);
                                            if81Var4.u.G = (float) intBitsToFloat;
                                            break;
                                        case 21973:
                                            if81Var4.g(i10);
                                            if81Var4.u.H = (float) intBitsToFloat;
                                            break;
                                        case 21974:
                                            if81Var4.g(i10);
                                            if81Var4.u.I = (float) intBitsToFloat;
                                            break;
                                        case 21975:
                                            if81Var4.g(i10);
                                            if81Var4.u.J = (float) intBitsToFloat;
                                            break;
                                        case 21976:
                                            if81Var4.g(i10);
                                            if81Var4.u.K = (float) intBitsToFloat;
                                            break;
                                        case 21977:
                                            if81Var4.g(i10);
                                            if81Var4.u.L = (float) intBitsToFloat;
                                            break;
                                        case 21978:
                                            if81Var4.g(i10);
                                            if81Var4.u.M = (float) intBitsToFloat;
                                            break;
                                        default:
                                            switch (i10) {
                                                case 30323:
                                                    if81Var4.g(i10);
                                                    if81Var4.u.s = (float) intBitsToFloat;
                                                    break;
                                                case 30324:
                                                    if81Var4.g(i10);
                                                    if81Var4.u.t = (float) intBitsToFloat;
                                                    break;
                                                case 30325:
                                                    if81Var4.g(i10);
                                                    if81Var4.u.u = (float) intBitsToFloat;
                                                    break;
                                            }
                                    }
                                } else {
                                    if81Var4.s = (long) intBitsToFloat;
                                }
                                z4 = false;
                                q371Var.e = 0;
                            }
                            z4 = r9;
                        } else {
                            long j12 = w971Var5.w;
                            arrayDeque.push(new g071(i10, q371Var.g + j12));
                            lm71 lm71Var2 = q371Var.d;
                            int i49 = q371Var.f;
                            long j13 = q371Var.g;
                            if81 if81Var5 = (if81) lm71Var2.b;
                            yg71 yg71Var = if81Var5.b0;
                            if (yg71Var == null) {
                                ny61.k();
                                return 0;
                            }
                            if (i49 == 160) {
                                z3 = false;
                                if81Var5.Q = false;
                                if81Var5.R = 0L;
                            } else if (i49 == 174) {
                                z3 = false;
                                if81Var5.u = new ec81();
                            } else if (i49 != 187) {
                                if (i49 == 19899) {
                                    if81Var5.w = -1;
                                    if81Var5.x = j4;
                                } else if (i49 == 20533) {
                                    if81Var5.g(i49);
                                    if81Var5.u.h = true;
                                } else if (i49 == 21968) {
                                    if81Var5.g(i49);
                                    if81Var5.u.x = true;
                                } else if (i49 == 408125543) {
                                    long j14 = if81Var5.q;
                                    if (j14 != j4 && j14 != j12) {
                                        dy31.g(null, "Multiple Segment elements not supported");
                                        return 0;
                                    }
                                    if81Var5.q = j12;
                                    if81Var5.p = j13;
                                } else if (i49 == 475249515) {
                                    if81Var5.C = new ed71();
                                    if81Var5.D = new ed71();
                                } else if (i49 == 524531317 && !if81Var5.v) {
                                    if (!if81Var5.d || if81Var5.z == j4) {
                                        yg71Var.r(new w471(if81Var5.t, 0L));
                                        if81Var5.v = true;
                                    } else {
                                        if81Var5.y = true;
                                    }
                                }
                                z3 = false;
                            } else {
                                z3 = false;
                                if81Var5.E = false;
                            }
                            q371Var.e = z3 ? 1 : 0;
                            z4 = z3;
                        }
                        z8 = true;
                        z = z4;
                        w971Var = w971Var5;
                    } else {
                        w971Var5.b((int) q371Var.g);
                        q371Var.e = r2;
                        z8 = true;
                        i7 = -1;
                        w971Var4 = w971Var5;
                    }
                }
            }
            z9 = z8;
            z8 = z2;
            r2 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0096, code lost:
    
        return false;
     */
    @Override // defpackage.n771
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(bb71 bb71Var) {
        vt81 vt81Var = new vt81();
        w971 w971Var = (w971) bb71Var;
        long j = w971Var.c;
        long j2 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (j != -1 && j <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j2 = j;
        }
        int i = (int) j2;
        dl81 dl81Var = vt81Var.a;
        w971Var.I(dl81Var.a, 0, 4, false);
        long t = dl81Var.t();
        vt81Var.b = 4;
        while (true) {
            if (t != 440786851) {
                int i2 = vt81Var.b + 1;
                vt81Var.b = i2;
                if (i2 == i) {
                    break;
                }
                w971Var.I(dl81Var.a, 0, 1, false);
                t = ((t << 8) & (-256)) | (dl81Var.a[0] & 255);
            } else {
                long a = vt81Var.a(w971Var);
                long j3 = vt81Var.b;
                if (a != Long.MIN_VALUE && (j == -1 || j3 + a < j)) {
                    while (true) {
                        long j4 = vt81Var.b;
                        long j5 = j3 + a;
                        if (j4 < j5) {
                            if (vt81Var.a(w971Var) != Long.MIN_VALUE) {
                                long a2 = vt81Var.a(w971Var);
                                if (a2 < 0 || a2 > 2147483647L) {
                                    break;
                                }
                                if (a2 != 0) {
                                    int i3 = (int) a2;
                                    w971Var.c(i3, false);
                                    vt81Var.b += i3;
                                }
                            } else {
                                break;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
    }

    public final void g(int i) {
        if (this.u != null) {
            return;
        }
        dy31.g(null, oyr.j(i, "Element ", " must be in a TrackEntry"));
    }

    public final void h(w971 w971Var, int i) {
        dl81 dl81Var = this.g;
        if (dl81Var.c >= i) {
            return;
        }
        byte[] bArr = dl81Var.a;
        if (bArr.length < i) {
            dl81Var.c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = dl81Var.a;
        int i2 = dl81Var.c;
        w971Var.E(bArr2, i2, i - i2, false);
        dl81Var.k(i);
    }

    public final void i(w971 w971Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        dl81 dl81Var = this.k;
        byte[] bArr2 = dl81Var.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            int length2 = copyOf.length;
            dl81Var.a = copyOf;
            dl81Var.c = length2;
            dl81Var.b = 0;
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        w971Var.E(dl81Var.a, bArr.length, i, false);
        dl81Var.m(0);
        dl81Var.k(length);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(ec81 ec81Var, long j, int i, int i2, int i3) {
        byte[] k;
        int i4;
        int i5;
        c371 c371Var = ec81Var.T;
        if (c371Var != null) {
            c371Var.b(ec81Var.X, j, i, i2, i3, ec81Var.j);
        } else {
            if ("S_TEXT/UTF8".equals(ec81Var.b) || "S_TEXT/ASS".equals(ec81Var.b) || "S_TEXT/WEBVTT".equals(ec81Var.b)) {
                if (this.K > 1) {
                    nba1.e();
                } else {
                    long j2 = this.I;
                    if (j2 == -9223372036854775807L) {
                        nba1.e();
                    } else {
                        String str = ec81Var.b;
                        dl81 dl81Var = this.k;
                        byte[] bArr = dl81Var.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                k = k(j2, 10000L, "%01d:%02d:%02d:%02d");
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                k = k(j2, 1000L, "%02d:%02d:%02d.%03d");
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                k = k(j2, 1000L, "%02d:%02d:%02d,%03d");
                                i4 = 19;
                                break;
                            default:
                                w511.q();
                                return;
                        }
                        System.arraycopy(k, 0, bArr, i4, k.length);
                        int i6 = dl81Var.b;
                        while (true) {
                            if (i6 < dl81Var.c) {
                                if (dl81Var.a[i6] == 0) {
                                    dl81Var.k(i6);
                                } else {
                                    i6++;
                                }
                            }
                        }
                        ec81Var.X.a(dl81Var.c, dl81Var);
                        i5 = i2 + dl81Var.c;
                        if ((i & SelfTester_JCP.IMITA) != 0) {
                            int i7 = this.K;
                            dl81 dl81Var2 = this.n;
                            if (i7 > 1) {
                                dl81Var2.i(0);
                            } else {
                                int i8 = dl81Var2.c;
                                ec81Var.X.a(i8, dl81Var2);
                                i5 += i8;
                            }
                        }
                        ec81Var.X.b(j, i, i5, i3, ec81Var.j);
                    }
                }
            }
            i5 = i2;
            if ((i & SelfTester_JCP.IMITA) != 0) {
            }
            ec81Var.X.b(j, i, i5, i3, ec81Var.j);
        }
        this.F = true;
    }

    public final void l() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.a0 = false;
        this.j.i(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0837, code lost:
    
        if (r2.o() == r10.getLeastSignificantBits()) goto L489;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0888  */
    /* JADX WARN: Type inference failed for: r1v5, types: [ec81, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Exception] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i) {
        char c;
        char c2;
        int i2;
        String str;
        List list;
        int i3;
        String str2;
        int s;
        List list2;
        List list3;
        Pair pair;
        String str3;
        List list4;
        List list5;
        List list6;
        List list7;
        byte[] bArr;
        da81 da81Var;
        boolean equals;
        int i4;
        int i5;
        hw81 hw81Var;
        int i6;
        byte[] bArr2;
        int i7;
        String str4;
        ag1 a;
        List list8;
        List list9;
        boolean z;
        a871 w471Var;
        int i8;
        int i9;
        if81 if81Var = this;
        yg71 yg71Var = if81Var.b0;
        if (yg71Var == null) {
            ny61.k();
            return;
        }
        SparseArray sparseArray = if81Var.c;
        if (i == 160) {
            if (if81Var.G != 2) {
                return;
            }
            ec81 ec81Var = (ec81) sparseArray.get(if81Var.M);
            ec81Var.X.getClass();
            if (if81Var.R > 0 && "A_OPUS".equals(ec81Var.b)) {
                if81Var.n.e(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(if81Var.R).array());
            }
            int i10 = 0;
            for (int i11 = 0; i11 < if81Var.K; i11++) {
                i10 += if81Var.L[i11];
            }
            int i12 = 0;
            while (i12 < if81Var.K) {
                long j = if81Var.H + ((ec81Var.e * i12) / 1000);
                int i13 = if81Var.O;
                if (i12 == 0 && !if81Var.Q) {
                    i13 |= 1;
                }
                int i14 = if81Var.L[i12];
                int i15 = i10 - i14;
                if81Var.j(ec81Var, j, i13, i14, i15);
                i12++;
                i10 = i15;
            }
            if81Var.G = 0;
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i16 = if81Var.w;
                if (i16 != -1) {
                    long j2 = if81Var.x;
                    if (j2 != -1) {
                        if (i16 == 475249515) {
                            if81Var.z = j2;
                            return;
                        }
                        return;
                    }
                }
                dy31.g(null, "Mandatory element SeekID or SeekPosition not found");
                return;
            }
            if (i == 25152) {
                g(i);
                ec81 ec81Var2 = if81Var.u;
                if (ec81Var2.h) {
                    v781 v781Var = ec81Var2.j;
                    if (v781Var != null) {
                        ec81Var2.l = new kk0(null, true, new jk0(sm81.a, null, "video/webm", v781Var.b));
                        return;
                    } else {
                        dy31.g(null, "Encrypted Track found but ContentEncKeyID was not found");
                        return;
                    }
                }
                return;
            }
            if (i == 28032) {
                g(i);
                ec81 ec81Var3 = if81Var.u;
                if (!ec81Var3.h || ec81Var3.i == null) {
                    return;
                }
                dy31.g(null, "Combining encryption and compression is not supported");
                return;
            }
            if (i == 357149030) {
                if (if81Var.r == -9223372036854775807L) {
                    if81Var.r = 1000000L;
                }
                long j3 = if81Var.s;
                if (j3 != -9223372036854775807L) {
                    if81Var.t = if81Var.d(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (sparseArray.size() != 0) {
                    if81Var.b0.mo495a();
                    return;
                } else {
                    dy31.g(null, "No valid tracks were found");
                    return;
                }
            }
            if (i != 475249515) {
                return;
            }
            if (!if81Var.v) {
                ed71 ed71Var = if81Var.C;
                ed71 ed71Var2 = if81Var.D;
                if (if81Var.q == -1 || if81Var.t == -9223372036854775807L || ed71Var == null || (i8 = ed71Var.a) == 0 || ed71Var2 == null || ed71Var2.a != i8) {
                    z = true;
                    w471Var = new w471(if81Var.t, 0L);
                } else {
                    int[] iArr = new int[i8];
                    long[] jArr = new long[i8];
                    long[] jArr2 = new long[i8];
                    long[] jArr3 = new long[i8];
                    for (int i17 = 0; i17 < i8; i17++) {
                        jArr3[i17] = ed71Var.a(i17);
                        jArr[i17] = ed71Var2.a(i17) + if81Var.q;
                    }
                    z = true;
                    int i18 = 0;
                    while (true) {
                        i9 = i8 - 1;
                        if (i18 >= i9) {
                            break;
                        }
                        int i19 = i18 + 1;
                        iArr[i18] = (int) (jArr[i19] - jArr[i18]);
                        jArr2[i18] = jArr3[i19] - jArr3[i18];
                        i18 = i19;
                    }
                    iArr[i9] = (int) ((if81Var.q + if81Var.p) - jArr[i9]);
                    long j4 = if81Var.t - jArr3[i9];
                    jArr2[i9] = j4;
                    if (j4 <= 0) {
                        nba1.e();
                        iArr = Arrays.copyOf(iArr, i9);
                        jArr = Arrays.copyOf(jArr, i9);
                        jArr2 = Arrays.copyOf(jArr2, i9);
                        jArr3 = Arrays.copyOf(jArr3, i9);
                    }
                    w471Var = new jt81(iArr, jArr, jArr2, jArr3);
                }
                yg71Var.r(w471Var);
                if81Var.v = z;
            }
            if81Var.C = null;
            if81Var.D = null;
            return;
        }
        ?? r1 = if81Var.u;
        if (r1 == 0) {
            ny61.k();
            return;
        }
        String str5 = r1.b;
        if (str5 == null) {
            dy31.g(null, "CodecId is missing in TrackEntry element");
            return;
        }
        switch (str5.hashCode()) {
            case -2095576542:
                if (str5.equals("V_MPEG4/ISO/AP")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str5.equals("V_MPEG4/ISO/SP")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str5.equals("A_MS/ACM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str5.equals("A_TRUEHD")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str5.equals("A_VORBIS")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str5.equals("A_MPEG/L2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str5.equals("A_MPEG/L3")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str5.equals("V_MS/VFW/FOURCC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str5.equals("S_DVBSUB")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str5.equals("V_MPEG4/ISO/ASP")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str5.equals("V_MPEG4/ISO/AVC")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str5.equals("S_VOBSUB")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str5.equals("A_DTS/LOSSLESS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str5.equals("A_AAC")) {
                    c = HexString.LF;
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str5.equals("A_AC3")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str5.equals("A_DTS")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str5.equals("V_AV1")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str5.equals("V_VP8")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str5.equals("V_VP9")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str5.equals("S_HDMV/PGS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str5.equals("V_THEORA")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str5.equals("A_DTS/EXPRESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str5.equals("A_PCM/FLOAT/IEEE")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str5.equals("A_PCM/INT/BIG")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str5.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str5.equals("S_TEXT/ASS")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str5.equals("V_MPEGH/ISO/HEVC")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1045209816:
                if (str5.equals("S_TEXT/WEBVTT")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str5.equals("S_TEXT/UTF8")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str5.equals("V_MPEG2")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str5.equals("A_EAC3")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str5.equals("A_FLAC")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str5.equals("A_OPUS")) {
                    c = HexString.CHAR_SPACE;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
                int i20 = r1.c;
                switch (str5.hashCode()) {
                    case -2095576542:
                        if (str5.equals("V_MPEG4/ISO/AP")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -2095575984:
                        if (str5.equals("V_MPEG4/ISO/SP")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1985379776:
                        if (str5.equals("A_MS/ACM")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1784763192:
                        if (str5.equals("A_TRUEHD")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1730367663:
                        if (str5.equals("A_VORBIS")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1482641358:
                        if (str5.equals("A_MPEG/L2")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1482641357:
                        if (str5.equals("A_MPEG/L3")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1373388978:
                        if (str5.equals("V_MS/VFW/FOURCC")) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -933872740:
                        if (str5.equals("S_DVBSUB")) {
                            c2 = '\b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -538363189:
                        if (str5.equals("V_MPEG4/ISO/ASP")) {
                            c2 = '\t';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -538363109:
                        if (str5.equals("V_MPEG4/ISO/AVC")) {
                            c2 = '\n';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -425012669:
                        if (str5.equals("S_VOBSUB")) {
                            c2 = 11;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -356037306:
                        if (str5.equals("A_DTS/LOSSLESS")) {
                            c2 = '\f';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 62923557:
                        if (str5.equals("A_AAC")) {
                            c2 = HexString.LF;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 62923603:
                        if (str5.equals("A_AC3")) {
                            c2 = 14;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 62927045:
                        if (str5.equals("A_DTS")) {
                            c2 = 15;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 82318131:
                        if (str5.equals("V_AV1")) {
                            c2 = 16;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 82338133:
                        if (str5.equals("V_VP8")) {
                            c2 = 17;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 82338134:
                        if (str5.equals("V_VP9")) {
                            c2 = 18;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 99146302:
                        if (str5.equals("S_HDMV/PGS")) {
                            c2 = 19;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 444813526:
                        if (str5.equals("V_THEORA")) {
                            c2 = 20;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 542569478:
                        if (str5.equals("A_DTS/EXPRESS")) {
                            c2 = 21;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 635596514:
                        if (str5.equals("A_PCM/FLOAT/IEEE")) {
                            c2 = 22;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 725948237:
                        if (str5.equals("A_PCM/INT/BIG")) {
                            c2 = 23;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 725957860:
                        if (str5.equals("A_PCM/INT/LIT")) {
                            c2 = 24;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 738597099:
                        if (str5.equals("S_TEXT/ASS")) {
                            c2 = 25;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 855502857:
                        if (str5.equals("V_MPEGH/ISO/HEVC")) {
                            c2 = 26;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1045209816:
                        if (str5.equals("S_TEXT/WEBVTT")) {
                            c2 = 27;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1422270023:
                        if (str5.equals("S_TEXT/UTF8")) {
                            c2 = 28;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1809237540:
                        if (str5.equals("V_MPEG2")) {
                            c2 = 29;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1950749482:
                        if (str5.equals("A_EAC3")) {
                            c2 = 30;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1950789798:
                        if (str5.equals("A_FLAC")) {
                            c2 = 31;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1951062397:
                        if (str5.equals("A_OPUS")) {
                            c2 = HexString.CHAR_SPACE;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                String str6 = "video/x-unknown";
                switch (c2) {
                    case 0:
                    case 1:
                    case '\t':
                        i2 = i20;
                        str = "text/vtt";
                        byte[] bArr3 = r1.k;
                        str6 = "video/mp4v-es";
                        if (bArr3 != null) {
                            list = Collections.singletonList(bArr3);
                            i3 = -1;
                            str2 = null;
                            list8 = list;
                            s = -1;
                            list2 = list8;
                            bArr = r1.N;
                            if (bArr != null && (a = ag1.a(new dl81(bArr))) != null) {
                                str2 = a.b;
                                str6 = "video/dolby-vision";
                            }
                            int i21 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                            da81Var = new da81();
                            equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                            Map map = h0;
                            if (equals) {
                                da81Var.x = r1.O;
                                da81Var.y = r1.Q;
                                da81Var.z = s;
                                i4 = 1;
                            } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(g681.d(str6))) {
                                if (r1.q == 0) {
                                    int i22 = r1.o;
                                    i5 = -1;
                                    if (i22 == -1) {
                                        i22 = r1.m;
                                    }
                                    r1.o = i22;
                                    int i23 = r1.p;
                                    if (i23 == -1) {
                                        i23 = r1.n;
                                    }
                                    r1.p = i23;
                                } else {
                                    i5 = -1;
                                }
                                float f = (r1.o == i5 || (i7 = r1.p) == i5) ? -1.0f : (r1.n * r0) / (r1.m * i7);
                                if (r1.x) {
                                    if (r1.D == -1.0f || r1.E == -1.0f || r1.F == -1.0f || r1.G == -1.0f || r1.H == -1.0f || r1.I == -1.0f || r1.J == -1.0f || r1.K == -1.0f || r1.L == -1.0f || r1.M == -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = new byte[25];
                                        ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                        order.put((byte) 0);
                                        order.putShort((short) ((r1.D * 50000.0f) + 0.5f));
                                        order.putShort((short) ((r1.E * 50000.0f) + 0.5f));
                                        order.putShort((short) ((r1.F * 50000.0f) + 0.5f));
                                        order.putShort((short) ((r1.G * 50000.0f) + 0.5f));
                                        order.putShort((short) ((r1.H * 50000.0f) + 0.5f));
                                        order.putShort((short) ((r1.I * 50000.0f) + 0.5f));
                                        order.putShort((short) ((r1.J * 50000.0f) + 0.5f));
                                        order.putShort((short) ((r1.K * 50000.0f) + 0.5f));
                                        order.putShort((short) (r1.L + 0.5f));
                                        order.putShort((short) (r1.M + 0.5f));
                                        order.putShort((short) r1.B);
                                        order.putShort((short) r1.C);
                                    }
                                    hw81Var = new hw81(r1.y, r1.A, r1.z, bArr2);
                                } else {
                                    hw81Var = null;
                                }
                                String str7 = r1.a;
                                int intValue = (str7 == null || !map.containsKey(str7)) ? i5 : ((Integer) map.get(r1.a)).intValue();
                                if (r1.r == 0 && Float.compare(r1.s, 0.0f) == 0 && Float.compare(r1.t, 0.0f) == 0) {
                                    if (Float.compare(r1.u, 0.0f) == 0) {
                                        i6 = 0;
                                    } else if (Float.compare(r1.t, 90.0f) == 0) {
                                        i6 = 90;
                                    } else if (Float.compare(r1.t, -180.0f) == 0 || Float.compare(r1.t, 180.0f) == 0) {
                                        i6 = SubsamplingScaleImageView.ORIENTATION_180;
                                    } else if (Float.compare(r1.t, -90.0f) == 0) {
                                        i6 = SubsamplingScaleImageView.ORIENTATION_270;
                                    }
                                    da81Var.p = r1.m;
                                    da81Var.q = r1.n;
                                    da81Var.t = f;
                                    da81Var.s = i6;
                                    da81Var.u = r1.v;
                                    da81Var.v = r1.w;
                                    da81Var.w = hw81Var;
                                    i4 = 2;
                                }
                                i6 = intValue;
                                da81Var.p = r1.m;
                                da81Var.q = r1.n;
                                da81Var.t = f;
                                da81Var.s = i6;
                                da81Var.u = r1.v;
                                da81Var.v = r1.w;
                                da81Var.w = hw81Var;
                                i4 = 2;
                            } else {
                                if (!"application/x-subrip".equals(str6) && !"text/x-ssa".equals(str6) && !str.equals(str6) && !"application/vobsub".equals(str6) && !"application/pgs".equals(str6) && !"application/dvbsubs".equals(str6)) {
                                    dy31.g(null, "Unexpected MIME type.");
                                    return;
                                }
                                i4 = 3;
                            }
                            str4 = r1.a;
                            if (str4 != null && !map.containsKey(str4)) {
                                da81Var.b = r1.a;
                            }
                            da81Var.a = Integer.toString(i2);
                            da81Var.k = str6;
                            da81Var.l = i3;
                            da81Var.c = r1.W;
                            da81Var.d = i21;
                            da81Var.m = list2;
                            da81Var.h = str2;
                            da81Var.n = r1.l;
                            qd81 qd81Var = new qd81(da81Var);
                            fb81 l = yg71Var.l(r1.c, i4);
                            r1.X = l;
                            l.k(qd81Var);
                            sparseArray.put(r1.c, r1);
                            if81Var = this;
                            break;
                        }
                        list = null;
                        i3 = -1;
                        str2 = null;
                        list8 = list;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                            str2 = a.b;
                            str6 = "video/dolby-vision";
                        }
                        int i212 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map2 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                            da81Var.b = r1.a;
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i212;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var2 = new qd81(da81Var);
                        fb81 l2 = yg71Var.l(r1.c, i4);
                        r1.X = l2;
                        l2.k(qd81Var2);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 2:
                        i2 = i20;
                        str = "text/vtt";
                        dl81 dl81Var = new dl81(r1.a(str5));
                        try {
                            int n = dl81Var.n();
                            if (n != 1) {
                                if (n == 65534) {
                                    dl81Var.m(24);
                                    long o = dl81Var.o();
                                    UUID uuid = g0;
                                    if (o == uuid.getMostSignificantBits()) {
                                        break;
                                    }
                                }
                                nba1.e();
                                str6 = "audio/x-unknown";
                                list = null;
                                i3 = -1;
                                str2 = null;
                                list8 = list;
                                s = -1;
                                list2 = list8;
                                bArr = r1.N;
                                if (bArr != null) {
                                }
                                int i2122 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                                da81Var = new da81();
                                equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                                Map map22 = h0;
                                if (equals) {
                                }
                                str4 = r1.a;
                                if (str4 != null) {
                                }
                                da81Var.a = Integer.toString(i2);
                                da81Var.k = str6;
                                da81Var.l = i3;
                                da81Var.c = r1.W;
                                da81Var.d = i2122;
                                da81Var.m = list2;
                                da81Var.h = str2;
                                da81Var.n = r1.l;
                                qd81 qd81Var22 = new qd81(da81Var);
                                fb81 l22 = yg71Var.l(r1.c, i4);
                                r1.X = l22;
                                l22.k(qd81Var22);
                                sparseArray.put(r1.c, r1);
                                if81Var = this;
                                break;
                            }
                            s = rf71.s(r1.P);
                            if (s == 0) {
                                nba1.e();
                                str6 = "audio/x-unknown";
                                list = null;
                                i3 = -1;
                                str2 = null;
                                list8 = list;
                                s = -1;
                                list2 = list8;
                                bArr = r1.N;
                                if (bArr != null) {
                                }
                                int i21222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                                da81Var = new da81();
                                equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                                Map map222 = h0;
                                if (equals) {
                                }
                                str4 = r1.a;
                                if (str4 != null) {
                                }
                                da81Var.a = Integer.toString(i2);
                                da81Var.k = str6;
                                da81Var.l = i3;
                                da81Var.c = r1.W;
                                da81Var.d = i21222;
                                da81Var.m = list2;
                                da81Var.h = str2;
                                da81Var.n = r1.l;
                                qd81 qd81Var222 = new qd81(da81Var);
                                fb81 l222 = yg71Var.l(r1.c, i4);
                                r1.X = l222;
                                l222.k(qd81Var222);
                                sparseArray.put(r1.c, r1);
                                if81Var = this;
                            } else {
                                str6 = "audio/raw";
                                list2 = null;
                                i3 = -1;
                                str2 = null;
                                bArr = r1.N;
                                if (bArr != null) {
                                }
                                int i212222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                                da81Var = new da81();
                                equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                                Map map2222 = h0;
                                if (equals) {
                                }
                                str4 = r1.a;
                                if (str4 != null) {
                                }
                                da81Var.a = Integer.toString(i2);
                                da81Var.k = str6;
                                da81Var.l = i3;
                                da81Var.c = r1.W;
                                da81Var.d = i212222;
                                da81Var.m = list2;
                                da81Var.h = str2;
                                da81Var.n = r1.l;
                                qd81 qd81Var2222 = new qd81(da81Var);
                                fb81 l2222 = yg71Var.l(r1.c, i4);
                                r1.X = l2222;
                                l2222.k(qd81Var2222);
                                sparseArray.put(r1.c, r1);
                                if81Var = this;
                            }
                        } catch (ArrayIndexOutOfBoundsException unused) {
                            dy31.g(null, "Error parsing MS/ACM codec private");
                            return;
                        }
                        break;
                    case 3:
                        i2 = i20;
                        str = "text/vtt";
                        r1.T = new c371();
                        str6 = "audio/true-hd";
                        list6 = null;
                        i3 = -1;
                        list3 = list6;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i2122222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map22222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i2122222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var22222 = new qd81(da81Var);
                        fb81 l22222 = yg71Var.l(r1.c, i4);
                        r1.X = l22222;
                        l22222.k(qd81Var22222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 4:
                        str = "text/vtt";
                        byte[] a2 = r1.a(str5);
                        try {
                        } catch (ArrayIndexOutOfBoundsException unused2) {
                            r1 = 0;
                        }
                        try {
                            if (a2[0] != 2) {
                                throw new aa2("Error parsing vorbis codec private", null, true, 1);
                            }
                            int i24 = 1;
                            int i25 = 0;
                            while (true) {
                                int i26 = a2[i24] & 255;
                                if (i26 != 255) {
                                    int i27 = i25 + i26;
                                    int i28 = i24 + 1;
                                    int i29 = 0;
                                    while (true) {
                                        int i30 = a2[i28] & 255;
                                        if (i30 != 255) {
                                            int i31 = i28 + 1;
                                            int i32 = i29 + i30;
                                            i2 = i20;
                                            if (a2[i31] != 1) {
                                                throw new aa2("Error parsing vorbis codec private", null, true, 1);
                                            }
                                            byte[] bArr4 = new byte[i27];
                                            System.arraycopy(a2, i31, bArr4, 0, i27);
                                            int i33 = i31 + i27;
                                            if (a2[i33] != 3) {
                                                throw new aa2("Error parsing vorbis codec private", null, true, 1);
                                            }
                                            int i34 = i33 + i32;
                                            if (a2[i34] != 5) {
                                                throw new aa2("Error parsing vorbis codec private", null, true, 1);
                                            }
                                            byte[] bArr5 = new byte[a2.length - i34];
                                            System.arraycopy(a2, i34, bArr5, 0, a2.length - i34);
                                            ArrayList arrayList = new ArrayList(2);
                                            arrayList.add(bArr4);
                                            arrayList.add(bArr5);
                                            str6 = "audio/vorbis";
                                            i3 = 8192;
                                            list3 = arrayList;
                                            str2 = null;
                                            list9 = list3;
                                            list8 = list9;
                                            s = -1;
                                            list2 = list8;
                                            bArr = r1.N;
                                            if (bArr != null) {
                                            }
                                            int i21222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                                            da81Var = new da81();
                                            equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                                            Map map222222 = h0;
                                            if (equals) {
                                            }
                                            str4 = r1.a;
                                            if (str4 != null) {
                                            }
                                            da81Var.a = Integer.toString(i2);
                                            da81Var.k = str6;
                                            da81Var.l = i3;
                                            da81Var.c = r1.W;
                                            da81Var.d = i21222222;
                                            da81Var.m = list2;
                                            da81Var.h = str2;
                                            da81Var.n = r1.l;
                                            qd81 qd81Var222222 = new qd81(da81Var);
                                            fb81 l222222 = yg71Var.l(r1.c, i4);
                                            r1.X = l222222;
                                            l222222.k(qd81Var222222);
                                            sparseArray.put(r1.c, r1);
                                            if81Var = this;
                                            break;
                                        } else {
                                            i29 += 255;
                                            i28++;
                                        }
                                    }
                                } else {
                                    i25 += 255;
                                    i24++;
                                }
                            }
                        } catch (ArrayIndexOutOfBoundsException unused3) {
                            dy31.g(r1, "Error parsing vorbis codec private");
                            return;
                        }
                        break;
                    case 5:
                        str = "text/vtt";
                        str6 = "audio/mpeg-L2";
                        i2 = i20;
                        list3 = null;
                        i3 = 4096;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i212222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map2222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i212222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var2222222 = new qd81(da81Var);
                        fb81 l2222222 = yg71Var.l(r1.c, i4);
                        r1.X = l2222222;
                        l2222222.k(qd81Var2222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 6:
                        str = "text/vtt";
                        str6 = "audio/mpeg";
                        i2 = i20;
                        list3 = null;
                        i3 = 4096;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i2122222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map22222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i2122222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var22222222 = new qd81(da81Var);
                        fb81 l22222222 = yg71Var.l(r1.c, i4);
                        r1.X = l22222222;
                        l22222222.k(qd81Var22222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 7:
                        str = "text/vtt";
                        byte[] a3 = r1.a(str5);
                        try {
                            if (16 > a3.length) {
                                throw new IllegalArgumentException();
                            }
                            long j5 = (a3[16] & 255) | ((a3[17] & 255) << 8) | ((a3[18] & 255) << 16) | ((a3[19] & 255) << 24);
                            if (j5 == 1482049860) {
                                pair = new Pair("video/divx", null);
                            } else if (j5 == 859189832) {
                                pair = new Pair("video/3gpp", null);
                            } else {
                                if (j5 == 826496599) {
                                    for (int i35 = 40; i35 < a3.length - 4; i35++) {
                                        if (a3[i35] == 0 && a3[i35 + 1] == 0 && a3[i35 + 2] == 1) {
                                            if (a3[i35 + 3] == 15) {
                                                pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(a3, i35, a3.length)));
                                            }
                                        }
                                    }
                                    throw new aa2("Failed to find FourCC VC1 initialization data", null, true, 1);
                                }
                                nba1.e();
                                pair = new Pair("video/x-unknown", null);
                            }
                            str6 = (String) pair.first;
                            list7 = (List) pair.second;
                            i2 = i20;
                            list6 = list7;
                            i3 = -1;
                            list3 = list6;
                            str2 = null;
                            list9 = list3;
                            list8 = list9;
                            s = -1;
                            list2 = list8;
                            bArr = r1.N;
                            if (bArr != null) {
                            }
                            int i21222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                            da81Var = new da81();
                            equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                            Map map222222222 = h0;
                            if (equals) {
                            }
                            str4 = r1.a;
                            if (str4 != null) {
                            }
                            da81Var.a = Integer.toString(i2);
                            da81Var.k = str6;
                            da81Var.l = i3;
                            da81Var.c = r1.W;
                            da81Var.d = i21222222222;
                            da81Var.m = list2;
                            da81Var.h = str2;
                            da81Var.n = r1.l;
                            qd81 qd81Var222222222 = new qd81(da81Var);
                            fb81 l222222222 = yg71Var.l(r1.c, i4);
                            r1.X = l222222222;
                            l222222222.k(qd81Var222222222);
                            sparseArray.put(r1.c, r1);
                            if81Var = this;
                            break;
                        } catch (ArrayIndexOutOfBoundsException unused4) {
                            dy31.g(null, "Error parsing FourCC private data");
                            return;
                        }
                        break;
                    case '\b':
                        str = "text/vtt";
                        byte[] bArr6 = new byte[4];
                        System.arraycopy(r1.a(str5), 0, bArr6, 0, 4);
                        i2 = i20;
                        str6 = "application/dvbsubs";
                        list6 = t31.n(bArr6);
                        i3 = -1;
                        list3 = list6;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i212222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map2222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i212222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var2222222222 = new qd81(da81Var);
                        fb81 l2222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l2222222222;
                        l2222222222.k(qd81Var2222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case '\n':
                        str = "text/vtt";
                        fz71 a4 = fz71.a(new dl81(r1.a(str5)));
                        ArrayList arrayList2 = a4.a;
                        r1.Y = a4.b;
                        str3 = a4.f;
                        str6 = "video/avc";
                        list5 = arrayList2;
                        str2 = str3;
                        list4 = list5;
                        i2 = i20;
                        i3 = -1;
                        list9 = list4;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i2122222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map22222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i2122222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var22222222222 = new qd81(da81Var);
                        fb81 l22222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l22222222222;
                        l22222222222.k(qd81Var22222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 11:
                        str = "text/vtt";
                        i2 = i20;
                        str6 = "application/vobsub";
                        list6 = t31.n(r1.a(str5));
                        i3 = -1;
                        list3 = list6;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i21222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i21222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var222222222222 = new qd81(da81Var);
                        fb81 l222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l222222222222;
                        l222222222222.k(qd81Var222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case '\f':
                        str = "text/vtt";
                        str6 = "audio/vnd.dts.hd";
                        i2 = i20;
                        list6 = null;
                        i3 = -1;
                        list3 = list6;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i212222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map2222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i212222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var2222222222222 = new qd81(da81Var);
                        fb81 l2222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l2222222222222;
                        l2222222222222.k(qd81Var2222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case '\r':
                        str = "text/vtt";
                        List singletonList = Collections.singletonList(r1.a(str5));
                        a4 a5 = vaa1.a(new uh81(r1.k), false);
                        r1.Q = a5.b;
                        r1.O = a5.c;
                        str6 = "audio/mp4a-latm";
                        str2 = a5.a;
                        list4 = singletonList;
                        i2 = i20;
                        i3 = -1;
                        list9 = list4;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i2122222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map22222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i2122222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var22222222222222 = new qd81(da81Var);
                        fb81 l22222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l22222222222222;
                        l22222222222222.k(qd81Var22222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 14:
                        str = "text/vtt";
                        str6 = "audio/ac3";
                        i2 = i20;
                        list6 = null;
                        i3 = -1;
                        list3 = list6;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i21222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map222222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i21222222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var222222222222222 = new qd81(da81Var);
                        fb81 l222222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l222222222222222;
                        l222222222222222.k(qd81Var222222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 15:
                    case 21:
                        str = "text/vtt";
                        str6 = "audio/vnd.dts";
                        i2 = i20;
                        list6 = null;
                        i3 = -1;
                        list3 = list6;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i212222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map2222222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i212222222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var2222222222222222 = new qd81(da81Var);
                        fb81 l2222222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l2222222222222222;
                        l2222222222222222.k(qd81Var2222222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 16:
                        str = "text/vtt";
                        str6 = "video/av01";
                        i2 = i20;
                        list6 = null;
                        i3 = -1;
                        list3 = list6;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i2122222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map22222222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i2122222222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var22222222222222222 = new qd81(da81Var);
                        fb81 l22222222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l22222222222222222;
                        l22222222222222222.k(qd81Var22222222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 17:
                        str = "text/vtt";
                        str6 = "video/x-vnd.on2.vp8";
                        i2 = i20;
                        list6 = null;
                        i3 = -1;
                        list3 = list6;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i21222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map222222222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i21222222222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var222222222222222222 = new qd81(da81Var);
                        fb81 l222222222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l222222222222222222;
                        l222222222222222222.k(qd81Var222222222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 18:
                        str = "text/vtt";
                        str6 = "video/x-vnd.on2.vp9";
                        i2 = i20;
                        list6 = null;
                        i3 = -1;
                        list3 = list6;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i212222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map2222222222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i212222222222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var2222222222222222222 = new qd81(da81Var);
                        fb81 l2222222222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l2222222222222222222;
                        l2222222222222222222.k(qd81Var2222222222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 19:
                        str = "text/vtt";
                        i2 = i20;
                        str6 = "application/pgs";
                        list6 = null;
                        i3 = -1;
                        list3 = list6;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i2122222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map22222222222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i2122222222222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var22222222222222222222 = new qd81(da81Var);
                        fb81 l22222222222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l22222222222222222222;
                        l22222222222222222222.k(qd81Var22222222222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 20:
                        str = "text/vtt";
                        i2 = i20;
                        list6 = null;
                        i3 = -1;
                        list3 = list6;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i21222222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map222222222222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i21222222222222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var222222222222222222222 = new qd81(da81Var);
                        fb81 l222222222222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l222222222222222222222;
                        l222222222222222222222.k(qd81Var222222222222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 22:
                        str = "text/vtt";
                        if (r1.P == 32) {
                            i2 = i20;
                            str6 = "audio/raw";
                            list2 = null;
                            i3 = -1;
                            str2 = null;
                            s = 4;
                            bArr = r1.N;
                            if (bArr != null) {
                            }
                            int i212222222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                            da81Var = new da81();
                            equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                            Map map2222222222222222222222 = h0;
                            if (equals) {
                            }
                            str4 = r1.a;
                            if (str4 != null) {
                            }
                            da81Var.a = Integer.toString(i2);
                            da81Var.k = str6;
                            da81Var.l = i3;
                            da81Var.c = r1.W;
                            da81Var.d = i212222222222222222222222;
                            da81Var.m = list2;
                            da81Var.h = str2;
                            da81Var.n = r1.l;
                            qd81 qd81Var2222222222222222222222 = new qd81(da81Var);
                            fb81 l2222222222222222222222 = yg71Var.l(r1.c, i4);
                            r1.X = l2222222222222222222222;
                            l2222222222222222222222.k(qd81Var2222222222222222222222);
                            sparseArray.put(r1.c, r1);
                            if81Var = this;
                            break;
                        } else {
                            nba1.e();
                            i2 = i20;
                            str6 = "audio/x-unknown";
                            list6 = null;
                            i3 = -1;
                            list3 = list6;
                            str2 = null;
                            list9 = list3;
                            list8 = list9;
                            s = -1;
                            list2 = list8;
                            bArr = r1.N;
                            if (bArr != null) {
                            }
                            int i2122222222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                            da81Var = new da81();
                            equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                            Map map22222222222222222222222 = h0;
                            if (equals) {
                            }
                            str4 = r1.a;
                            if (str4 != null) {
                            }
                            da81Var.a = Integer.toString(i2);
                            da81Var.k = str6;
                            da81Var.l = i3;
                            da81Var.c = r1.W;
                            da81Var.d = i2122222222222222222222222;
                            da81Var.m = list2;
                            da81Var.h = str2;
                            da81Var.n = r1.l;
                            qd81 qd81Var22222222222222222222222 = new qd81(da81Var);
                            fb81 l22222222222222222222222 = yg71Var.l(r1.c, i4);
                            r1.X = l22222222222222222222222;
                            l22222222222222222222222.k(qd81Var22222222222222222222222);
                            sparseArray.put(r1.c, r1);
                            if81Var = this;
                        }
                        break;
                    case 23:
                        str = "text/vtt";
                        int i36 = r1.P;
                        if (i36 == 8) {
                            i2 = i20;
                            str6 = "audio/raw";
                            list2 = null;
                            i3 = -1;
                            str2 = null;
                            s = 3;
                            bArr = r1.N;
                            if (bArr != null) {
                            }
                            int i21222222222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                            da81Var = new da81();
                            equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                            Map map222222222222222222222222 = h0;
                            if (equals) {
                            }
                            str4 = r1.a;
                            if (str4 != null) {
                            }
                            da81Var.a = Integer.toString(i2);
                            da81Var.k = str6;
                            da81Var.l = i3;
                            da81Var.c = r1.W;
                            da81Var.d = i21222222222222222222222222;
                            da81Var.m = list2;
                            da81Var.h = str2;
                            da81Var.n = r1.l;
                            qd81 qd81Var222222222222222222222222 = new qd81(da81Var);
                            fb81 l222222222222222222222222 = yg71Var.l(r1.c, i4);
                            r1.X = l222222222222222222222222;
                            l222222222222222222222222.k(qd81Var222222222222222222222222);
                            sparseArray.put(r1.c, r1);
                            if81Var = this;
                            break;
                        } else if (i36 == 16) {
                            s = SelfTester_JCP.IMITA;
                            i2 = i20;
                            str6 = "audio/raw";
                            list2 = null;
                            i3 = -1;
                            str2 = null;
                            bArr = r1.N;
                            if (bArr != null) {
                            }
                            int i212222222222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                            da81Var = new da81();
                            equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                            Map map2222222222222222222222222 = h0;
                            if (equals) {
                            }
                            str4 = r1.a;
                            if (str4 != null) {
                            }
                            da81Var.a = Integer.toString(i2);
                            da81Var.k = str6;
                            da81Var.l = i3;
                            da81Var.c = r1.W;
                            da81Var.d = i212222222222222222222222222;
                            da81Var.m = list2;
                            da81Var.h = str2;
                            da81Var.n = r1.l;
                            qd81 qd81Var2222222222222222222222222 = new qd81(da81Var);
                            fb81 l2222222222222222222222222 = yg71Var.l(r1.c, i4);
                            r1.X = l2222222222222222222222222;
                            l2222222222222222222222222.k(qd81Var2222222222222222222222222);
                            sparseArray.put(r1.c, r1);
                            if81Var = this;
                        } else {
                            nba1.e();
                            i2 = i20;
                            str6 = "audio/x-unknown";
                            list6 = null;
                            i3 = -1;
                            list3 = list6;
                            str2 = null;
                            list9 = list3;
                            list8 = list9;
                            s = -1;
                            list2 = list8;
                            bArr = r1.N;
                            if (bArr != null) {
                            }
                            int i2122222222222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                            da81Var = new da81();
                            equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                            Map map22222222222222222222222222 = h0;
                            if (equals) {
                            }
                            str4 = r1.a;
                            if (str4 != null) {
                            }
                            da81Var.a = Integer.toString(i2);
                            da81Var.k = str6;
                            da81Var.l = i3;
                            da81Var.c = r1.W;
                            da81Var.d = i2122222222222222222222222222;
                            da81Var.m = list2;
                            da81Var.h = str2;
                            da81Var.n = r1.l;
                            qd81 qd81Var22222222222222222222222222 = new qd81(da81Var);
                            fb81 l22222222222222222222222222 = yg71Var.l(r1.c, i4);
                            r1.X = l22222222222222222222222222;
                            l22222222222222222222222222.k(qd81Var22222222222222222222222222);
                            sparseArray.put(r1.c, r1);
                            if81Var = this;
                        }
                        break;
                    case 24:
                        str = "text/vtt";
                        s = rf71.s(r1.P);
                        if (s == 0) {
                            nba1.e();
                            i2 = i20;
                            str6 = "audio/x-unknown";
                            list6 = null;
                            i3 = -1;
                            list3 = list6;
                            str2 = null;
                            list9 = list3;
                            list8 = list9;
                            s = -1;
                            list2 = list8;
                            bArr = r1.N;
                            if (bArr != null) {
                            }
                            int i21222222222222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                            da81Var = new da81();
                            equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                            Map map222222222222222222222222222 = h0;
                            if (equals) {
                            }
                            str4 = r1.a;
                            if (str4 != null) {
                            }
                            da81Var.a = Integer.toString(i2);
                            da81Var.k = str6;
                            da81Var.l = i3;
                            da81Var.c = r1.W;
                            da81Var.d = i21222222222222222222222222222;
                            da81Var.m = list2;
                            da81Var.h = str2;
                            da81Var.n = r1.l;
                            qd81 qd81Var222222222222222222222222222 = new qd81(da81Var);
                            fb81 l222222222222222222222222222 = yg71Var.l(r1.c, i4);
                            r1.X = l222222222222222222222222222;
                            l222222222222222222222222222.k(qd81Var222222222222222222222222222);
                            sparseArray.put(r1.c, r1);
                            if81Var = this;
                            break;
                        }
                        i2 = i20;
                        str6 = "audio/raw";
                        list2 = null;
                        i3 = -1;
                        str2 = null;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i212222222222222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map2222222222222222222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i212222222222222222222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var2222222222222222222222222222 = new qd81(da81Var);
                        fb81 l2222222222222222222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l2222222222222222222222222222;
                        l2222222222222222222222222222.k(qd81Var2222222222222222222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 25:
                        str = "text/vtt";
                        i2 = i20;
                        str6 = "text/x-ssa";
                        list6 = t31.n(d0, r1.a(str5));
                        i3 = -1;
                        list3 = list6;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i2122222222222222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map22222222222222222222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i2122222222222222222222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var22222222222222222222222222222 = new qd81(da81Var);
                        fb81 l22222222222222222222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l22222222222222222222222222222;
                        l22222222222222222222222222222.k(qd81Var22222222222222222222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 26:
                        str = "text/vtt";
                        b6t0 c3 = b6t0.c(new dl81(r1.a(str5)));
                        List list10 = (List) c3.c;
                        r1.Y = c3.a;
                        str3 = (String) c3.d;
                        str6 = "video/hevc";
                        list5 = list10;
                        str2 = str3;
                        list4 = list5;
                        i2 = i20;
                        i3 = -1;
                        list9 = list4;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i21222222222222222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map222222222222222222222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i21222222222222222222222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var222222222222222222222222222222 = new qd81(da81Var);
                        fb81 l222222222222222222222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l222222222222222222222222222222;
                        l222222222222222222222222222222.k(qd81Var222222222222222222222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 27:
                        str = "text/vtt";
                        i2 = i20;
                        str6 = str;
                        list6 = null;
                        i3 = -1;
                        list3 = list6;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i212222222222222222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map2222222222222222222222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i212222222222222222222222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var2222222222222222222222222222222 = new qd81(da81Var);
                        fb81 l2222222222222222222222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l2222222222222222222222222222222;
                        l2222222222222222222222222222222.k(qd81Var2222222222222222222222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 28:
                        str = "text/vtt";
                        i2 = i20;
                        str6 = "application/x-subrip";
                        list6 = null;
                        i3 = -1;
                        list3 = list6;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i2122222222222222222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map22222222222222222222222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i2122222222222222222222222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var22222222222222222222222222222222 = new qd81(da81Var);
                        fb81 l22222222222222222222222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l22222222222222222222222222222222;
                        l22222222222222222222222222222222.k(qd81Var22222222222222222222222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 29:
                        str = "text/vtt";
                        str6 = "video/mpeg2";
                        i2 = i20;
                        list6 = null;
                        i3 = -1;
                        list3 = list6;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i21222222222222222222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map222222222222222222222222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i21222222222222222222222222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var222222222222222222222222222222222 = new qd81(da81Var);
                        fb81 l222222222222222222222222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l222222222222222222222222222222222;
                        l222222222222222222222222222222222.k(qd81Var222222222222222222222222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 30:
                        str = "text/vtt";
                        str6 = "audio/eac3";
                        i2 = i20;
                        list6 = null;
                        i3 = -1;
                        list3 = list6;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i212222222222222222222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map2222222222222222222222222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i212222222222222222222222222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var2222222222222222222222222222222222 = new qd81(da81Var);
                        fb81 l2222222222222222222222222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l2222222222222222222222222222222222;
                        l2222222222222222222222222222222222.k(qd81Var2222222222222222222222222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case 31:
                        str = "text/vtt";
                        str6 = "audio/flac";
                        list7 = Collections.singletonList(r1.a(str5));
                        i2 = i20;
                        list6 = list7;
                        i3 = -1;
                        list3 = list6;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i2122222222222222222222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map22222222222222222222222222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i2122222222222222222222222222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var22222222222222222222222222222222222 = new qd81(da81Var);
                        fb81 l22222222222222222222222222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l22222222222222222222222222222222222;
                        l22222222222222222222222222222222222.k(qd81Var22222222222222222222222222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    case ' ':
                        ArrayList arrayList3 = new ArrayList(3);
                        arrayList3.add(r1.a(r1.b));
                        ByteBuffer allocate = ByteBuffer.allocate(8);
                        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                        str = "text/vtt";
                        arrayList3.add(allocate.order(byteOrder).putLong(r1.R).array());
                        arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r1.S).array());
                        str6 = "audio/opus";
                        i3 = 5760;
                        i2 = i20;
                        list3 = arrayList3;
                        str2 = null;
                        list9 = list3;
                        list8 = list9;
                        s = -1;
                        list2 = list8;
                        bArr = r1.N;
                        if (bArr != null) {
                        }
                        int i21222222222222222222222222222222222222 = (r1.V ? 1 : 0) | (r1.U ? 2 : 0);
                        da81Var = new da81();
                        equals = MediaStreamTrack.AUDIO_TRACK_KIND.equals(g681.d(str6));
                        Map map222222222222222222222222222222222222 = h0;
                        if (equals) {
                        }
                        str4 = r1.a;
                        if (str4 != null) {
                        }
                        da81Var.a = Integer.toString(i2);
                        da81Var.k = str6;
                        da81Var.l = i3;
                        da81Var.c = r1.W;
                        da81Var.d = i21222222222222222222222222222222222222;
                        da81Var.m = list2;
                        da81Var.h = str2;
                        da81Var.n = r1.l;
                        qd81 qd81Var222222222222222222222222222222222222 = new qd81(da81Var);
                        fb81 l222222222222222222222222222222222222 = yg71Var.l(r1.c, i4);
                        r1.X = l222222222222222222222222222222222222;
                        l222222222222222222222222222222222222.k(qd81Var222222222222222222222222222222222222);
                        sparseArray.put(r1.c, r1);
                        if81Var = this;
                        break;
                    default:
                        dy31.g(null, "Unrecognized codec identifier.");
                        return;
                }
        }
        if81Var.u = null;
    }
}
