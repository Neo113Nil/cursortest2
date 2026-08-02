package defpackage;

import java.io.Closeable;
import okhttp3.Protocol;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* loaded from: classes9.dex */
public final class kvj0 implements Closeable {
    public final k5t0 A;
    public final kvj0 B;
    public final kvj0 C;
    public final kvj0 D;
    public final long E;
    public final long F;
    public final q66 G;
    public final pa01 H;
    public za7 I;
    public final boolean J;
    public final boolean K;
    public final d5j0 a;
    public final Protocol b;
    public final String c;
    public final int w;
    public final o6u x;
    public final meu y;
    public final rvj0 z;

    public kvj0(d5j0 d5j0Var, Protocol protocol, String str, int i, o6u o6uVar, meu meuVar, rvj0 rvj0Var, k5t0 k5t0Var, kvj0 kvj0Var, kvj0 kvj0Var2, kvj0 kvj0Var3, long j, long j2, q66 q66Var, pa01 pa01Var) {
        this.a = d5j0Var;
        this.b = protocol;
        this.c = str;
        this.w = i;
        this.x = o6uVar;
        this.y = meuVar;
        this.z = rvj0Var;
        this.A = k5t0Var;
        this.B = kvj0Var;
        this.C = kvj0Var2;
        this.D = kvj0Var3;
        this.E = j;
        this.F = j2;
        this.G = q66Var;
        this.H = pa01Var;
        boolean z = true;
        this.J = 200 <= i && i < 300;
        if (i != 307 && i != 308) {
            switch (i) {
                case 300:
                case IDialogId.DIALOG_PIN_WND_IDD_PASSWORD /* 301 */:
                case 302:
                case 303:
                    break;
                default:
                    z = false;
                    break;
            }
        }
        this.K = z;
    }

    public final za7 a() {
        za7 za7Var = this.I;
        if (za7Var != null) {
            return za7Var;
        }
        za7 za7Var2 = za7.n;
        za7 R = d6z.R(this.y);
        this.I = R;
        return R;
    }

    public final cvj0 c() {
        cvj0 cvj0Var = new cvj0();
        cvj0Var.c = -1;
        cvj0Var.g = rvj0.EMPTY;
        cvj0Var.o = pa01.i4;
        cvj0Var.a = this.a;
        cvj0Var.b = this.b;
        cvj0Var.c = this.w;
        cvj0Var.d = this.c;
        cvj0Var.e = this.x;
        cvj0Var.f = this.y.d();
        cvj0Var.g = this.z;
        cvj0Var.h = this.A;
        cvj0Var.i = this.B;
        cvj0Var.j = this.C;
        cvj0Var.k = this.D;
        cvj0Var.l = this.E;
        cvj0Var.m = this.F;
        cvj0Var.n = this.G;
        cvj0Var.o = this.H;
        return cvj0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.z.close();
    }

    public final pvj0 d(long j) {
        rvj0 rvj0Var = this.z;
        jci0 peek = rvj0Var.source().peek();
        yp6 yp6Var = new yp6();
        peek.S(j);
        long min = Math.min(j, peek.b.b);
        while (min > 0) {
            long read = peek.read(yp6Var, min);
            if (read == -1) {
                ny61.b();
                return null;
            }
            min -= read;
        }
        qvj0 qvj0Var = rvj0.Companion;
        wg10 contentType = rvj0Var.contentType();
        long j2 = yp6Var.b;
        qvj0Var.getClass();
        return new pvj0(contentType, j2, yp6Var);
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.w + ", message=" + this.c + ", url=" + this.a.a + '}';
    }
}
