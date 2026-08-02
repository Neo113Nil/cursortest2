package defpackage;

import androidx.media3.container.a;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class kr60 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public kr60(jr60 jr60Var) {
        int i = jr60Var.a;
        ByteBuffer byteBuffer = jr60Var.b;
        d6z.l(i == 1);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        df90 df90Var = new df90(bArr, remaining);
        df90Var.o(4);
        boolean f = df90Var.f();
        this.a = f;
        a.a(f);
        if (df90Var.f()) {
            df90Var.o(64);
            if (df90Var.f()) {
                int i2 = 0;
                while (!df90Var.f()) {
                    i2++;
                }
                if (i2 < 32) {
                    df90Var.o(i2);
                }
            }
            boolean f2 = df90Var.f();
            this.b = f2;
            if (f2) {
                df90Var.o(47);
            }
        } else {
            this.b = false;
        }
        boolean f3 = df90Var.f();
        int g = df90Var.g(5);
        for (int i3 = 0; i3 <= g; i3++) {
            df90Var.o(12);
            if (df90Var.g(5) > 7) {
                df90Var.n();
            }
            a.a(this.b);
            if (f3 && df90Var.f()) {
                df90Var.o(4);
            }
        }
        int g2 = df90Var.g(4);
        int g3 = df90Var.g(4);
        df90Var.o(g2 + 1);
        df90Var.o(g3 + 1);
        boolean f4 = df90Var.f();
        this.c = f4;
        a.a(f4);
        df90Var.o(3);
        df90Var.o(4);
        boolean f5 = df90Var.f();
        if (f5) {
            df90Var.o(2);
        }
        if (df90Var.f()) {
            this.d = true;
        } else {
            this.d = df90Var.f();
        }
        if (!this.d) {
            this.e = true;
        } else if (df90Var.f()) {
            this.e = true;
        } else {
            this.e = df90Var.f();
        }
        if (f5) {
            this.f = df90Var.g(3) + 1;
        } else {
            this.f = 0;
        }
    }
}
