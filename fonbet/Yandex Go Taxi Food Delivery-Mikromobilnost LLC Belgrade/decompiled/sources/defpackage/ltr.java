package defpackage;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ltr implements b5p {
    public d5p f;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public oh3 o;
    public fo31 p;
    public final ef90 a = new ef90(4);
    public final ef90 b = new ef90(9);
    public final ef90 c = new ef90(11);
    public final ef90 d = new ef90();
    public final zgp0 e = new zgp0();
    public int g = 1;

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    public final ef90 b(c5p c5pVar) {
        int i = this.l;
        ef90 ef90Var = this.d;
        byte[] bArr = ef90Var.a;
        if (i > bArr.length) {
            ef90Var.I(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            ef90Var.K(0);
        }
        ef90Var.J(this.l);
        c5pVar.readFully(ef90Var.a, 0, this.l);
        return ef90Var;
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        this.f = d5pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0009 A[SYNTHETIC] */
    @Override // defpackage.b5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(c5p c5pVar, xde0 xde0Var) {
        long j;
        long j2;
        int i;
        boolean z;
        boolean z2;
        int i2;
        d6z.z(this.f);
        while (true) {
            int i3 = this.g;
            boolean z3 = true;
            if (i3 == 1) {
                ef90 ef90Var = this.b;
                if (!c5pVar.y(ef90Var.a, 0, 9, true)) {
                    return -1;
                }
                ef90Var.K(0);
                ef90Var.L(4);
                int y = ef90Var.y();
                boolean z4 = (y & 4) != 0;
                boolean z5 = (y & 1) != 0;
                if (z4 && this.o == null) {
                    this.o = new oh3(16, this.f.B(8, 1));
                }
                if (z5 && this.p == null) {
                    i2 = 2;
                    this.p = new fo31(this.f.B(9, 2));
                } else {
                    i2 = 2;
                }
                this.f.A();
                this.j = ef90Var.k() - 5;
                this.g = i2;
            } else if (i3 == 2) {
                c5pVar.O(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i3 == 3) {
                ef90 ef90Var2 = this.c;
                if (!c5pVar.y(ef90Var2.a, 0, 11, true)) {
                    return -1;
                }
                ef90Var2.K(0);
                this.k = ef90Var2.y();
                this.l = ef90Var2.B();
                this.m = ef90Var2.B();
                this.m = ((ef90Var2.y() << 24) | this.m) * 1000;
                ef90Var2.L(3);
                this.g = 4;
            } else {
                if (i3 != 4) {
                    ny61.k();
                    return 0;
                }
                boolean z6 = this.h;
                zgp0 zgp0Var = this.e;
                if (z6) {
                    j = this.i + this.m;
                } else if (zgp0Var.c == -9223372036854775807L) {
                    j2 = 0;
                    i = this.k;
                    if (i == 8 || this.o == null) {
                        int i4 = 4;
                        if (i != 9 && this.p != null) {
                            if (!this.n) {
                                this.f.w(new qb4(-9223372036854775807L));
                                this.n = true;
                            }
                            fo31 fo31Var = this.p;
                            ef90 b = b(c5pVar);
                            fo31Var.getClass();
                            int y2 = b.y();
                            int i5 = (y2 >> 4) & 15;
                            int i6 = y2 & 15;
                            if (i6 != 7) {
                                final String i7 = oyr.i(i6, "Video format not supported: ");
                                throw new ParserException(i7) { // from class: androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            fo31Var.A = i5;
                            if (i5 != 5) {
                                ef90 ef90Var3 = fo31Var.c;
                                g001 g001Var = (g001) fo31Var.b;
                                ef90 ef90Var4 = fo31Var.w;
                                int y3 = b.y();
                                byte[] bArr = b.a;
                                int i8 = b.b;
                                int i9 = i8 + 1;
                                b.b = i9;
                                int i10 = ((bArr[i8] & 255) << 24) >> 8;
                                b.b = i8 + 2;
                                int i11 = ((bArr[i9] & 255) << 8) | i10;
                                b.b = i8 + 3;
                                long j3 = ((i11 | (bArr[r8] & 255)) * 1000) + j2;
                                if (y3 == 0 && !fo31Var.y) {
                                    byte[] bArr2 = new byte[b.a()];
                                    ef90 ef90Var5 = new ef90(bArr2);
                                    b.i(0, b.a(), bArr2);
                                    nb4 a = nb4.a(ef90Var5);
                                    fo31Var.x = a.b;
                                    f7s f7sVar = new f7s();
                                    f7sVar.l = eh20.q("video/x-flv");
                                    f7sVar.m = eh20.q("video/avc");
                                    f7sVar.j = a.l;
                                    f7sVar.t = a.c;
                                    f7sVar.u = a.d;
                                    f7sVar.x = a.k;
                                    f7sVar.p = a.a;
                                    smw0.u(f7sVar, g001Var);
                                    fo31Var.y = true;
                                } else if (y3 == 1 && fo31Var.y) {
                                    int i12 = fo31Var.A == 1 ? 1 : 0;
                                    if (fo31Var.z || i12 != 0) {
                                        byte[] bArr3 = ef90Var4.a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i13 = 4 - fo31Var.x;
                                        int i14 = 0;
                                        while (b.a() > 0) {
                                            b.i(i13, fo31Var.x, ef90Var4.a);
                                            ef90Var4.K(0);
                                            int C = ef90Var4.C();
                                            ef90Var3.K(0);
                                            g001Var.a(ef90Var3, i4, 0);
                                            g001Var.a(b, C, 0);
                                            i14 = i14 + 4 + C;
                                            i4 = 4;
                                        }
                                        ((g001) fo31Var.b).c(j3, i12, i14, 0, null);
                                        fo31Var.z = true;
                                        z2 = true;
                                        if (z2) {
                                            z = true;
                                            z3 = true;
                                        }
                                    }
                                }
                                z2 = false;
                                if (z2) {
                                }
                            }
                        } else if (i == 18 || this.n) {
                            c5pVar.O(this.l);
                            z = false;
                            z3 = false;
                        } else {
                            ef90 b2 = b(c5pVar);
                            zgp0Var.getClass();
                            if (b2.y() == 2 && "onMetaData".equals(zgp0.Wg(b2)) && b2.a() != 0 && b2.y() == 8) {
                                HashMap Vg = zgp0.Vg(b2);
                                Object obj = Vg.get("duration");
                                if (obj instanceof Double) {
                                    double doubleValue = ((Double) obj).doubleValue();
                                    if (doubleValue > 0.0d) {
                                        zgp0Var.c = (long) (doubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = Vg.get("keyframes");
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    Object obj3 = map.get("filepositions");
                                    Object obj4 = map.get("times");
                                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                        List list = (List) obj3;
                                        List list2 = (List) obj4;
                                        int size = list2.size();
                                        zgp0Var.w = new long[size];
                                        zgp0Var.x = new long[size];
                                        for (int i15 = 0; i15 < size; i15++) {
                                            Object obj5 = list.get(i15);
                                            Object obj6 = list2.get(i15);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                zgp0Var.w = new long[0];
                                                zgp0Var.x = new long[0];
                                                break;
                                            }
                                            zgp0Var.w[i15] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                            zgp0Var.x[i15] = ((Double) obj5).longValue();
                                        }
                                    }
                                }
                            }
                            long j4 = zgp0Var.c;
                            if (j4 != -9223372036854775807L) {
                                this.f.w(new frv(j4, zgp0Var.x, zgp0Var.w));
                                this.n = true;
                            }
                        }
                        z = false;
                        z3 = true;
                    } else {
                        if (!this.n) {
                            this.f.w(new qb4(-9223372036854775807L));
                            this.n = true;
                        }
                        oh3 oh3Var = this.o;
                        ef90 b3 = b(c5pVar);
                        g001 g001Var2 = (g001) oh3Var.b;
                        if (oh3Var.c) {
                            b3.L(1);
                        } else {
                            int y4 = b3.y();
                            int i16 = (y4 >> 4) & 15;
                            oh3Var.x = i16;
                            if (i16 == 2) {
                                int i17 = oh3.y[(y4 >> 2) & 3];
                                f7s f7sVar2 = new f7s();
                                f7sVar2.l = eh20.q("video/x-flv");
                                f7sVar2.m = eh20.q("audio/mpeg");
                                f7sVar2.C = 1;
                                f7sVar2.D = i17;
                                smw0.u(f7sVar2, g001Var2);
                                oh3Var.w = true;
                            } else if (i16 == 7 || i16 == 8) {
                                String str = i16 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                f7s f7sVar3 = new f7s();
                                f7sVar3.l = eh20.q("video/x-flv");
                                f7sVar3.m = eh20.q(str);
                                f7sVar3.C = 1;
                                f7sVar3.D = 8000;
                                smw0.u(f7sVar3, g001Var2);
                                oh3Var.w = true;
                            } else if (i16 != 10) {
                                final String str2 = "Audio format not supported: " + oh3Var.x;
                                throw new ParserException(str2) { // from class: androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            oh3Var.c = true;
                        }
                        g001 g001Var3 = (g001) oh3Var.b;
                        if (oh3Var.x == 2) {
                            int a2 = b3.a();
                            g001Var3.a(b3, a2, 0);
                            ((g001) oh3Var.b).c(j2, 1, a2, 0, null);
                        } else {
                            int y5 = b3.y();
                            if (y5 == 0 && !oh3Var.w) {
                                int a3 = b3.a();
                                byte[] bArr4 = new byte[a3];
                                b3.i(0, a3, bArr4);
                                a4 o = pw21.o(new df90(bArr4, a3), false);
                                f7s f7sVar4 = new f7s();
                                f7sVar4.l = eh20.q("video/x-flv");
                                f7sVar4.m = eh20.q("audio/mp4a-latm");
                                f7sVar4.j = o.a;
                                f7sVar4.C = o.c;
                                f7sVar4.D = o.b;
                                f7sVar4.p = Collections.singletonList(bArr4);
                                smw0.u(f7sVar4, g001Var3);
                                oh3Var.w = true;
                            } else if (oh3Var.x != 10 || y5 == 1) {
                                int a4 = b3.a();
                                g001Var3.a(b3, a4, 0);
                                ((g001) oh3Var.b).c(j2, 1, a4, 0, null);
                            }
                            z = false;
                        }
                        z = true;
                    }
                    if (!this.h && z) {
                        this.h = true;
                        this.i = zgp0Var.c != -9223372036854775807L ? -this.m : 0L;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (!z3) {
                        return 0;
                    }
                } else {
                    j = this.m;
                }
                j2 = j;
                i = this.k;
                if (i == 8) {
                }
                int i42 = 4;
                if (i != 9) {
                }
                if (i == 18) {
                }
                c5pVar.O(this.l);
                z = false;
                z3 = false;
                if (!this.h) {
                    this.h = true;
                    this.i = zgp0Var.c != -9223372036854775807L ? -this.m : 0L;
                }
                this.j = 4;
                this.g = 2;
                if (!z3) {
                }
            }
        }
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        ef90 ef90Var = this.a;
        kbh kbhVar = (kbh) c5pVar;
        kbhVar.H(ef90Var.a, 0, 3, false);
        ef90Var.K(0);
        if (ef90Var.B() == 4607062) {
            kbhVar.H(ef90Var.a, 0, 2, false);
            ef90Var.K(0);
            if ((ef90Var.E() & 250) == 0) {
                kbhVar.H(ef90Var.a, 0, 4, false);
                ef90Var.K(0);
                int k = ef90Var.k();
                kbhVar.y = 0;
                kbhVar.a(k, false);
                kbhVar.H(ef90Var.a, 0, 4, false);
                ef90Var.K(0);
                if (ef90Var.k() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.b5p
    public final void release() {
    }
}
