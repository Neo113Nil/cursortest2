package yads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes10.dex */
public final class po3 implements nq0 {
    public qq0 a;
    public q83 b;
    public no3 e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.a = qq0Var;
        this.b = qq0Var.a(0, 1);
        qq0Var.a();
    }

    @Override // yads.nq0
    public final void seek(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        no3 no3Var = this.e;
        if (no3Var != null) {
            no3Var.a(j2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x017c, code lost:
    
        if (r12 != 65534) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0181, code lost:
    
        if (r16 == 32) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a6  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(oq0 oq0Var, hh2 hh2Var) {
        byte[] bArr;
        int i;
        if (this.b != null) {
            int i2 = mc3.a;
            int i3 = this.c;
            int i4 = 4;
            if (i3 == 0) {
                ld0 ld0Var = (ld0) oq0Var;
                if (ld0Var.d == 0) {
                    int i5 = this.f;
                    if (i5 != -1) {
                        ld0Var.a(i5);
                        this.c = 4;
                    } else if (so3.a(ld0Var)) {
                        long j = ld0Var.d;
                        ld0Var.a((int) ((ld0Var.f + j) - j));
                        this.c = 1;
                    } else {
                        throw new pc2("Unsupported or unrecognized wav file type.", null, true, 1);
                    }
                    return 0;
                }
                throw new IllegalStateException();
            }
            long j2 = -1;
            if (i3 == 1) {
                kc2 kc2Var = new kc2(8);
                ld0 ld0Var2 = (ld0) oq0Var;
                ro3 a = ro3.a(ld0Var2, kc2Var);
                if (a.a != 1685272116) {
                    ld0Var2.f = 0;
                } else {
                    ld0Var2.a(false, 8);
                    kc2Var.e(0);
                    ld0Var2.b(kc2Var.a, 0, 8, false);
                    j2 = kc2Var.e();
                    ld0Var2.a(((int) a.b) + 8);
                }
                this.d = j2;
                this.c = 2;
                return 0;
            }
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        long j3 = this.g;
                        if (j3 != -1) {
                            ld0 ld0Var3 = (ld0) oq0Var;
                            long j4 = j3 - ld0Var3.d;
                            no3 no3Var = this.e;
                            no3Var.getClass();
                            return no3Var.a(ld0Var3, j4) ? -1 : 0;
                        }
                        throw new IllegalStateException();
                    }
                    throw new IllegalStateException();
                }
                ld0 ld0Var4 = (ld0) oq0Var;
                ld0Var4.f = 0;
                ro3 a2 = so3.a(1684108385, ld0Var4, new kc2(8));
                ld0Var4.a(8);
                Pair create = Pair.create(Long.valueOf(ld0Var4.d), Long.valueOf(a2.b));
                this.f = ((Long) create.first).intValue();
                long longValue = ((Long) create.second).longValue();
                long j5 = this.d;
                if (j5 != -1 && longValue == 4294967295L) {
                    longValue = j5;
                }
                long j6 = this.f + longValue;
                this.g = j6;
                long j7 = ld0Var4.c;
                if (j7 != -1 && j6 > j7) {
                    ji1.d("WavExtractor", "Data exceeds input length: " + this.g + ", " + j7);
                    this.g = j7;
                }
                no3 no3Var2 = this.e;
                no3Var2.getClass();
                no3Var2.a(this.f, this.g);
                this.c = 4;
                return 0;
            }
            kc2 kc2Var2 = new kc2(16);
            ld0 ld0Var5 = (ld0) oq0Var;
            ro3 a3 = so3.a(1718449184, ld0Var5, kc2Var2);
            if (a3.b >= 16) {
                ld0Var5.b(kc2Var2.a, 0, 16, false);
                kc2Var2.e(0);
                int h = kc2Var2.h();
                int h2 = kc2Var2.h();
                int d = kc2Var2.d();
                if (d >= 0) {
                    int d2 = kc2Var2.d();
                    if (d2 >= 0) {
                        int h3 = kc2Var2.h();
                        int h4 = kc2Var2.h();
                        int i6 = ((int) a3.b) - 16;
                        if (i6 > 0) {
                            bArr = new byte[i6];
                            ld0Var5.b(bArr, 0, i6, false);
                        } else {
                            bArr = mc3.f;
                        }
                        byte[] bArr2 = bArr;
                        long j8 = ld0Var5.d;
                        ld0Var5.a((int) ((ld0Var5.f + j8) - j8));
                        qo3 qo3Var = new qo3(h, h2, d, h3, h4, bArr2);
                        if (h == 17) {
                            this.e = new mo3(this.a, this.b, qo3Var);
                        } else if (h == 6) {
                            this.e = new oo3(this.a, this.b, qo3Var, MimeTypes.AUDIO_ALAW, -1);
                        } else if (h == 7) {
                            this.e = new oo3(this.a, this.b, qo3Var, MimeTypes.AUDIO_MLAW, -1);
                        } else {
                            if (h != 1) {
                                if (h != 3) {
                                }
                                i = 0;
                                if (i == 0) {
                                    this.e = new oo3(this.a, this.b, qo3Var, MimeTypes.AUDIO_RAW, i);
                                } else {
                                    throw pc2.b("Unsupported WAV format type: " + h);
                                }
                            }
                            i4 = mc3.b(h4);
                            i = i4;
                            if (i == 0) {
                            }
                        }
                        this.c = 3;
                        return 0;
                    }
                    throw new IllegalStateException(nh2.a("Top bit not zero: ", d2));
                }
                throw new IllegalStateException(nh2.a("Top bit not zero: ", d));
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        return so3.a((ld0) oq0Var);
    }

    public static /* synthetic */ nq0[] a() {
        return new nq0[]{new po3()};
    }
}
