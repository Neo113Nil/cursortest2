package defpackage;

import android.os.SystemClock;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class lil0 implements b5p {
    public final wil0 a;
    public final ef90 b;
    public final ef90 c;
    public final int d;
    public final Object e;
    public final uil0 f;
    public d5p g;
    public boolean h;
    public volatile long i;
    public volatile int j;
    public boolean k;
    public long l;
    public long m;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public lil0(vil0 vil0Var, int i) {
        char c;
        wil0 mil0Var;
        wil0 wil0Var;
        this.d = i;
        new ijh();
        String str = vil0Var.c.n;
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = HexString.LF;
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
                mil0Var = new mil0(vil0Var, 0);
                wil0Var = mil0Var;
                break;
            case 1:
                mil0Var = new nil0(vil0Var, 1);
                wil0Var = mil0Var;
                break;
            case 2:
            case '\b':
                mil0Var = new hil0(vil0Var);
                wil0Var = mil0Var;
                break;
            case 3:
                mil0Var = vil0Var.e.equals("MP4A-LATM") ? new oil0(vil0Var) : new fil0(vil0Var);
                wil0Var = mil0Var;
                break;
            case 4:
                mil0Var = new gil0(vil0Var);
                wil0Var = mil0Var;
                break;
            case 5:
            case '\f':
            case '\r':
                mil0Var = new xil0(vil0Var);
                wil0Var = mil0Var;
                break;
            case 6:
                mil0Var = new pil0(vil0Var);
                wil0Var = mil0Var;
                break;
            case 7:
                mil0Var = new nil0(vil0Var, 0);
                wil0Var = mil0Var;
                break;
            case '\t':
                mil0Var = new qil0(vil0Var);
                wil0Var = mil0Var;
                break;
            case '\n':
                mil0Var = new yil0(vil0Var);
                wil0Var = mil0Var;
                break;
            case 11:
                mil0Var = new mil0(vil0Var, 1);
                wil0Var = mil0Var;
                break;
            default:
                wil0Var = null;
                break;
        }
        wil0Var.getClass();
        this.a = wil0Var;
        this.b = new ef90(65507);
        this.c = new ef90();
        this.e = new Object();
        this.f = new uil0();
        this.i = -9223372036854775807L;
        this.j = -1;
        this.l = -9223372036854775807L;
        this.m = -9223372036854775807L;
    }

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        synchronized (this.e) {
            try {
                if (!this.k) {
                    this.k = true;
                }
                this.l = j;
                this.m = j2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        this.a.d(d5pVar, this.d);
        d5pVar.A();
        d5pVar.w(new qb4(-9223372036854775807L));
        this.g = d5pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c4  */
    @Override // defpackage.b5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(c5p c5pVar, xde0 xde0Var) {
        boolean z;
        this.g.getClass();
        int read = c5pVar.read(this.b.a, 0, 65507);
        if (read == -1) {
            return -1;
        }
        if (read != 0) {
            this.b.K(0);
            this.b.J(read);
            ef90 ef90Var = this.b;
            boolean z2 = true;
            sil0 sil0Var = null;
            if (ef90Var.a() >= 12) {
                int y = ef90Var.y();
                byte b = (byte) (y >> 6);
                byte b2 = (byte) (y & 15);
                boolean z3 = ((y >> 4) & 1) == 1;
                if (b == 2) {
                    int y2 = ef90Var.y();
                    boolean z4 = ((y2 >> 7) & 1) == 1;
                    byte b3 = (byte) (y2 & HProv.PP_VERSION_TIMESTAMP);
                    int E = ef90Var.E();
                    long A = ef90Var.A();
                    int k = ef90Var.k();
                    if (b2 > 0) {
                        byte[] bArr = new byte[b2 * 4];
                        int i = 0;
                        while (i < b2) {
                            ef90Var.i(i * 4, 4, bArr);
                            i++;
                            z2 = z2;
                        }
                    }
                    z = z2;
                    if (z3) {
                        ef90Var.L(2);
                        short v = ef90Var.v();
                        if (v != 0) {
                            ef90Var.L(v * 4);
                        }
                    }
                    byte[] bArr2 = new byte[ef90Var.a()];
                    ef90Var.i(0, ef90Var.a(), bArr2);
                    ril0 ril0Var = new ril0();
                    ril0Var.a = z4;
                    ril0Var.b = b3;
                    d6z.l((E < 0 || E > 65535) ? false : z);
                    ril0Var.c = 65535 & E;
                    ril0Var.d = A;
                    ril0Var.e = k;
                    ril0Var.f = bArr2;
                    sil0Var = new sil0(ril0Var);
                    if (sil0Var != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j = elapsedRealtime - 30;
                        uil0 uil0Var = this.f;
                        synchronized (uil0Var) {
                            if (uil0Var.a.size() >= 5000) {
                                throw new IllegalStateException("Queue size limit of 5000 reached.");
                            }
                            int i2 = sil0Var.c;
                            if (!uil0Var.d) {
                                uil0Var.d();
                                uil0Var.c = Math.floorMod(i2 - 1, 65536);
                                uil0Var.d = z;
                                uil0Var.a(new til0(sil0Var, elapsedRealtime));
                            } else if (Math.abs(uil0.b(i2, sil0.a(uil0Var.b))) >= 1000) {
                                uil0Var.c = Math.floorMod(i2 - 1, 65536);
                                uil0Var.a.clear();
                                uil0Var.a(new til0(sil0Var, elapsedRealtime));
                            } else if (uil0.b(i2, uil0Var.c) > 0) {
                                uil0Var.a(new til0(sil0Var, elapsedRealtime));
                            }
                        }
                        sil0 c = this.f.c(j);
                        if (c != null) {
                            if (!this.h) {
                                if (this.i == -9223372036854775807L) {
                                    this.i = c.d;
                                }
                                if (this.j == -1) {
                                    this.j = c.c;
                                }
                                this.a.b(this.i);
                                this.h = true;
                            }
                            synchronized (this.e) {
                                try {
                                    if (!this.k) {
                                        do {
                                            ef90 ef90Var2 = this.c;
                                            byte[] bArr3 = c.f;
                                            ef90Var2.getClass();
                                            ef90Var2.I(bArr3.length, bArr3);
                                            this.a.c(this.c, c.d, c.c, c.a);
                                            c = this.f.c(j);
                                        } while (c != null);
                                    } else if (this.l != -9223372036854775807L && this.m != -9223372036854775807L) {
                                        this.f.d();
                                        this.a.a(this.l, this.m);
                                        this.k = false;
                                        this.l = -9223372036854775807L;
                                        this.m = -9223372036854775807L;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return 0;
                        }
                    }
                }
            }
            z = true;
            if (sil0Var != null) {
            }
        }
        return 0;
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    @Override // defpackage.b5p
    public final void release() {
    }
}
