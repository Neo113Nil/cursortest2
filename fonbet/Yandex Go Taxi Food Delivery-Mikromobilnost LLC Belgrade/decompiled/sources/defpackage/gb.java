package defpackage;

import androidx.media3.common.a;
import java.util.Objects;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

/* loaded from: classes10.dex */
public final class gb implements tqn {
    public final /* synthetic */ int a;
    public final df90 b;
    public final ef90 c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public g001 h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public a m;
    public int n;
    public long o;

    public gb(String str, int i, String str2, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                df90 df90Var = new df90(new byte[16], 16);
                this.b = df90Var;
                this.c = new ef90(df90Var.a);
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
            default:
                df90 df90Var2 = new df90(new byte[128], 128);
                this.b = df90Var2;
                this.c = new ef90(df90Var2.a);
                this.i = 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
        }
    }

    private final void a(boolean z) {
    }

    private final void c(boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tqn
    public final void b(ef90 ef90Var) {
        long j;
        int i = this.a;
        int i2 = this.e;
        String str = this.d;
        String str2 = this.f;
        df90 df90Var = this.b;
        long j2 = -9223372036854775807L;
        int i3 = 1;
        int i4 = 2;
        ef90 ef90Var2 = this.c;
        switch (i) {
            case 0:
                d6z.z(this.h);
                while (ef90Var.a() > 0) {
                    int i5 = this.i;
                    if (i5 == 0) {
                        while (true) {
                            if (ef90Var.a() <= 0) {
                                break;
                            }
                            if (this.k) {
                                int y = ef90Var.y();
                                if (y == 119) {
                                    this.k = false;
                                    this.i = 1;
                                    byte[] bArr = ef90Var2.a;
                                    bArr[0] = PKIBody._KRP;
                                    bArr[1] = 119;
                                    this.j = 2;
                                } else {
                                    this.k = y == 11;
                                }
                            } else {
                                this.k = ef90Var.y() == 11;
                            }
                        }
                    } else if (i5 == 1) {
                        byte[] bArr2 = ef90Var2.a;
                        int min = Math.min(ef90Var.a(), 128 - this.j);
                        ef90Var.i(this.j, min, bArr2);
                        int i6 = this.j + min;
                        this.j = i6;
                        if (i6 == 128) {
                            df90Var.m(0);
                            hb e = m83.e(df90Var);
                            int i7 = e.e;
                            int i8 = e.a;
                            int i9 = e.b;
                            String str3 = (String) e.f;
                            a aVar = this.m;
                            if (aVar == null || i9 != aVar.D || i8 != aVar.E || !Objects.equals(str3, aVar.n)) {
                                f7s f7sVar = new f7s();
                                f7sVar.a = this.g;
                                f7sVar.l = eh20.q(str2);
                                f7sVar.m = eh20.q(str3);
                                f7sVar.C = i9;
                                f7sVar.D = i8;
                                f7sVar.d = str;
                                f7sVar.f = i2;
                                f7sVar.i = i7;
                                if ("audio/ac3".equals(str3)) {
                                    f7sVar.h = i7;
                                }
                                a aVar2 = new a(f7sVar);
                                this.m = aVar2;
                                this.h.d(aVar2);
                            }
                            this.n = e.c;
                            this.l = (e.d * 1000000) / this.m.E;
                            ef90Var2.K(0);
                            this.h.a(ef90Var2, 128, 0);
                            this.i = 2;
                        }
                    } else if (i5 == 2) {
                        int min2 = Math.min(ef90Var.a(), this.n - this.j);
                        this.h.a(ef90Var, min2, 0);
                        int i10 = this.j + min2;
                        this.j = i10;
                        if (i10 == this.n) {
                            d6z.x(this.o != -9223372036854775807L);
                            this.h.c(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = 0;
                        }
                    }
                }
                break;
            default:
                d6z.z(this.h);
                while (ef90Var.a() > 0) {
                    int i11 = this.i;
                    if (i11 != 0) {
                        if (i11 == i3) {
                            j = j2;
                            byte[] bArr3 = ef90Var2.a;
                            int min3 = Math.min(ef90Var.a(), 16 - this.j);
                            ef90Var.i(this.j, min3, bArr3);
                            int i12 = this.j + min3;
                            this.j = i12;
                            if (i12 == 16) {
                                df90Var.m(0);
                                kb l = eg3.l(df90Var);
                                int i13 = l.a;
                                a aVar3 = this.m;
                                if (aVar3 == null || i4 != aVar3.D || i13 != aVar3.E || !"audio/ac4".equals(aVar3.n)) {
                                    f7s f7sVar2 = new f7s();
                                    f7sVar2.a = this.g;
                                    f7sVar2.l = eh20.q(str2);
                                    f7sVar2.m = eh20.q("audio/ac4");
                                    f7sVar2.C = i4;
                                    f7sVar2.D = i13;
                                    f7sVar2.d = str;
                                    f7sVar2.f = i2;
                                    a aVar4 = new a(f7sVar2);
                                    this.m = aVar4;
                                    this.h.d(aVar4);
                                }
                                this.n = l.b;
                                this.l = (l.c * 1000000) / this.m.E;
                                ef90Var2.K(0);
                                this.h.a(ef90Var2, 16, 0);
                                this.i = 2;
                            }
                        } else if (i11 == i4) {
                            int min4 = Math.min(ef90Var.a(), this.n - this.j);
                            this.h.a(ef90Var, min4, 0);
                            int i14 = this.j + min4;
                            this.j = i14;
                            if (i14 == this.n) {
                                d6z.x(this.o != j2 ? i3 : 0);
                                this.h.c(this.o, 1, this.n, 0, null);
                                j = j2;
                                this.o += this.l;
                                this.i = 0;
                            }
                        }
                        j2 = j;
                    } else {
                        j = j2;
                        while (ef90Var.a() > 0) {
                            if (this.k) {
                                int y2 = ef90Var.y();
                                this.k = y2 == 172;
                                if (y2 == 64 || y2 == 65) {
                                    boolean z = y2 == 65;
                                    this.i = 1;
                                    byte[] bArr4 = ef90Var2.a;
                                    bArr4[0] = -84;
                                    bArr4[1] = (byte) (z ? 65 : 64);
                                    this.j = 2;
                                }
                            } else {
                                this.k = ef90Var.y() == 172;
                            }
                        }
                    }
                    j2 = j;
                    i3 = 1;
                    i4 = 2;
                }
                break;
        }
    }

    @Override // defpackage.tqn
    public final void d() {
        switch (this.a) {
            case 0:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
            default:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.tqn
    public final void e(int i, long j) {
        switch (this.a) {
            case 0:
                this.o = j;
                break;
            default:
                this.o = j;
                break;
        }
    }

    @Override // defpackage.tqn
    public final void g(boolean z) {
        int i = this.a;
    }

    @Override // defpackage.tqn
    public final void h(d5p d5pVar, xi11 xi11Var) {
        switch (this.a) {
            case 0:
                xi11Var.c();
                xi11Var.d();
                this.g = xi11Var.e;
                xi11Var.d();
                this.h = d5pVar.B(xi11Var.d, 1);
                break;
            default:
                xi11Var.c();
                xi11Var.d();
                this.g = xi11Var.e;
                xi11Var.d();
                this.h = d5pVar.B(xi11Var.d, 1);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gb(String str) {
        this(null, 0, str, 0);
        this.a = 0;
    }
}
