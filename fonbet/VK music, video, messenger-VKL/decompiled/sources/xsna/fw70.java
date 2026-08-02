package xsna;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: OggPageHeader.java */
/* loaded from: classes12.dex */
public final class fw70 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final xi90 g = new xi90(255);

    public final boolean a(qgq qgqVar, boolean z) throws IOException {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        xi90 xi90Var = this.g;
        xi90Var.M(27);
        try {
            z2 = qgqVar.peekFully(xi90Var.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            z2 = false;
        }
        if (z2 && xi90Var.E() == 1332176723) {
            if (xi90Var.C() == 0) {
                this.a = xi90Var.C();
                this.b = xi90Var.s();
                xi90Var.t();
                xi90Var.t();
                xi90Var.t();
                int C = xi90Var.C();
                this.c = C;
                this.d = C + 27;
                xi90Var.M(C);
                try {
                    z3 = qgqVar.peekFully(xi90Var.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    z3 = false;
                }
                if (z3) {
                    for (int i = 0; i < this.c; i++) {
                        int C2 = xi90Var.C();
                        this.f[i] = C2;
                        this.e += C2;
                    }
                    return true;
                }
            } else if (!z) {
                throw ParserException.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(qgq qgqVar, long j) throws IOException {
        boolean z;
        fxc0.p(qgqVar.getPosition() == qgqVar.getPeekPosition());
        xi90 xi90Var = this.g;
        xi90Var.M(4);
        while (true) {
            if (j != -1 && qgqVar.getPosition() + 4 >= j) {
                break;
            }
            try {
                z = qgqVar.peekFully(xi90Var.a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            xi90Var.P(0);
            if (xi90Var.E() == 1332176723) {
                qgqVar.resetPeekPosition();
                return true;
            }
            qgqVar.skipFully(1);
        }
        do {
            if (j != -1 && qgqVar.getPosition() >= j) {
                break;
            }
        } while (qgqVar.skip(1) != -1);
        return false;
    }
}
