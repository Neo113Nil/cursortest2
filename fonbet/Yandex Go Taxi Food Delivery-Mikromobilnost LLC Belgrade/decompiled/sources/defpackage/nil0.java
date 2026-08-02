package defpackage;

import androidx.media3.common.ParserException;
import java.util.Locale;
import java.util.TreeMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes10.dex */
public final class nil0 implements wil0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public int f;
    public long g;
    public int h;
    public int i;
    public long j;

    public nil0(vil0 vil0Var, int i) {
        this.a = i;
        byte[] bArr = l150.a;
        switch (i) {
            case 1:
                this.b = new ef90();
                this.c = new ef90(bArr);
                this.d = vil0Var;
                this.g = -9223372036854775807L;
                this.h = -1;
                break;
            default:
                this.c = new ef90(bArr);
                this.d = vil0Var;
                this.b = new ef90();
                this.g = -9223372036854775807L;
                this.h = -1;
                break;
        }
    }

    private final void e(long j) {
    }

    private final void f(long j) {
    }

    @Override // defpackage.wil0
    public void a(long j, long j2) {
        switch (this.a) {
            case 0:
                this.g = j;
                this.i = 0;
                this.j = j2;
                break;
            default:
                this.g = j;
                this.i = 0;
                this.j = j2;
                break;
        }
    }

    @Override // defpackage.wil0
    public void b(long j) {
        int i = this.a;
    }

    @Override // defpackage.wil0
    public void c(ef90 ef90Var, long j, int i, boolean z) {
        int i2;
        int i3 = this.a;
        Object obj = this.b;
        int i4 = 1;
        switch (i3) {
            case 0:
                try {
                    int i5 = ef90Var.a[0] & 31;
                    d6z.z((g001) this.e);
                    if (i5 > 0 && i5 < 24) {
                        int a = ef90Var.a();
                        this.i = g() + this.i;
                        ((g001) this.e).a(ef90Var, a, 0);
                        this.i += a;
                        this.f = (ef90Var.a[0] & 31) == 5 ? 1 : 0;
                    } else if (i5 == 24) {
                        ef90Var.y();
                        while (ef90Var.a() > 4) {
                            int E = ef90Var.E();
                            this.i = g() + this.i;
                            ((g001) this.e).a(ef90Var, E, 0);
                            this.i += E;
                        }
                        this.f = 0;
                    } else {
                        if (i5 != 28) {
                            throw ParserException.b(null, String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i5)));
                        }
                        ef90 ef90Var2 = (ef90) obj;
                        byte[] bArr = ef90Var.a;
                        byte b = bArr[0];
                        byte b2 = bArr[1];
                        int i6 = (b & 224) | (b2 & 31);
                        boolean z2 = (b2 & DerValue.TAG_CONTEXT) > 0;
                        boolean z3 = (b2 & DerValue.TAG_APPLICATION) > 0;
                        if (z2) {
                            this.i = g() + this.i;
                            byte[] bArr2 = ef90Var.a;
                            i2 = 1;
                            bArr2[1] = (byte) i6;
                            ef90Var2.getClass();
                            ef90Var2.I(bArr2.length, bArr2);
                            ef90Var2.K(1);
                        } else {
                            i2 = 1;
                            int a2 = sil0.a(this.h);
                            if (i != a2) {
                                int i7 = tw21.a;
                                Locale locale = Locale.US;
                                lk91.j("Received RTP packet with unexpected sequence number. Expected: " + a2 + "; received: " + i + ". Dropping packet.");
                            } else {
                                byte[] bArr3 = ef90Var.a;
                                ef90Var2.getClass();
                                ef90Var2.I(bArr3.length, bArr3);
                                ef90Var2.K(2);
                            }
                        }
                        int a3 = ef90Var2.a();
                        ((g001) this.e).a(ef90Var2, a3, 0);
                        this.i += a3;
                        if (z3) {
                            this.f = (i6 & 31) == 5 ? i2 : 0;
                        }
                    }
                    if (z) {
                        if (this.g == -9223372036854775807L) {
                            this.g = j;
                        }
                        ((g001) this.e).c(qva1.d(90000, this.j, j, this.g), this.f, this.i, 0, null);
                        this.i = 0;
                    }
                    this.h = i;
                    return;
                } catch (IndexOutOfBoundsException e) {
                    throw ParserException.b(e, null);
                }
            default:
                ef90 ef90Var3 = (ef90) this.c;
                byte[] bArr4 = ef90Var.a;
                if (bArr4.length == 0) {
                    throw ParserException.b(null, "Empty RTP data packet.");
                }
                int i8 = (bArr4[0] >> 1) & 63;
                d6z.z((g001) this.e);
                if (i8 >= 0 && i8 < 48) {
                    int a4 = ef90Var.a();
                    int i9 = this.i;
                    ef90Var3.K(0);
                    int a5 = ef90Var3.a();
                    g001 g001Var = (g001) this.e;
                    g001Var.getClass();
                    g001Var.a(ef90Var3, a5, 0);
                    this.i = a5 + i9;
                    ((g001) this.e).a(ef90Var, a4, 0);
                    this.i += a4;
                    int i10 = (ef90Var.a[0] >> 1) & 63;
                    if (i10 != 19 && i10 != 20) {
                        i4 = 0;
                    }
                    this.f = i4;
                } else {
                    if (i8 == 48) {
                        w511.x("need to implement processAggregationPacket");
                        return;
                    }
                    if (i8 != 49) {
                        throw ParserException.b(null, String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i8)));
                    }
                    ef90 ef90Var4 = (ef90) obj;
                    byte[] bArr5 = ef90Var.a;
                    if (bArr5.length < 3) {
                        throw ParserException.b(null, "Malformed FU header.");
                    }
                    int i11 = bArr5[1] & 7;
                    byte b3 = bArr5[2];
                    int i12 = b3 & 63;
                    boolean z4 = (b3 & DerValue.TAG_CONTEXT) > 0;
                    boolean z5 = (b3 & DerValue.TAG_APPLICATION) > 0;
                    if (z4) {
                        int i13 = this.i;
                        ef90Var3.K(0);
                        int a6 = ef90Var3.a();
                        g001 g001Var2 = (g001) this.e;
                        g001Var2.getClass();
                        g001Var2.a(ef90Var3, a6, 0);
                        this.i = a6 + i13;
                        byte[] bArr6 = ef90Var.a;
                        bArr6[1] = (byte) ((i12 << 1) & HProv.PP_VERSION_TIMESTAMP);
                        bArr6[2] = (byte) i11;
                        ef90Var4.getClass();
                        ef90Var4.I(bArr6.length, bArr6);
                        ef90Var4.K(1);
                    } else {
                        int i14 = (this.h + 1) % 65535;
                        if (i != i14) {
                            int i15 = tw21.a;
                            Locale locale2 = Locale.US;
                            lk91.j("Received RTP packet with unexpected sequence number. Expected: " + i14 + "; received: " + i + ". Dropping packet.");
                        } else {
                            ef90Var4.getClass();
                            ef90Var4.I(bArr5.length, bArr5);
                            ef90Var4.K(3);
                        }
                    }
                    int a7 = ef90Var4.a();
                    ((g001) this.e).a(ef90Var4, a7, 0);
                    this.i += a7;
                    if (z5) {
                        this.f = (i12 == 19 || i12 == 20) ? 1 : 0;
                    }
                }
                if (z) {
                    if (this.g == -9223372036854775807L) {
                        this.g = j;
                    }
                    ((g001) this.e).c(qva1.d(90000, this.j, j, this.g), this.f, this.i, 0, null);
                    this.i = 0;
                }
                this.h = i;
                return;
        }
    }

    @Override // defpackage.wil0
    public void d(d5p d5pVar, int i) {
        switch (this.a) {
            case 0:
                g001 B = d5pVar.B(i, 2);
                this.e = B;
                int i2 = tw21.a;
                B.d(((vil0) this.d).c);
                break;
            default:
                g001 B2 = d5pVar.B(i, 2);
                this.e = B2;
                B2.d(((vil0) this.d).c);
                break;
        }
    }

    public int g() {
        ef90 ef90Var = (ef90) this.c;
        ef90Var.K(0);
        int a = ef90Var.a();
        g001 g001Var = (g001) this.e;
        g001Var.getClass();
        g001Var.a(ef90Var, a, 0);
        return a;
    }

    public nil0(String str, String str2, long j, int i, int i2, int i3, int[] iArr, TreeMap treeMap) {
        this.a = 2;
        this.b = str;
        this.c = str2;
        this.g = j;
        this.j = 0L;
        this.f = i;
        this.h = i2;
        this.i = i3;
        this.d = iArr;
        this.e = treeMap;
    }
}
