package defpackage;

import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableMap;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class oil0 implements wil0 {
    public final vil0 a;
    public final int b;
    public g001 c;
    public long d;
    public int e;
    public int f;
    public long g;
    public long h;

    public oil0(vil0 vil0Var) {
        this.a = vil0Var;
        try {
            this.b = e(vil0Var.d);
            this.d = -9223372036854775807L;
            this.e = -1;
            this.f = 0;
            this.g = 0L;
            this.h = -9223372036854775807L;
        } catch (ParserException e) {
            yci0.r(e);
            throw null;
        }
    }

    public static int e(ImmutableMap immutableMap) {
        String str = (String) immutableMap.get(ConfigConstants.CONFIG);
        int i = 0;
        i = 0;
        if (str != null && str.length() % 2 == 0) {
            byte[] u = tw21.u(str);
            df90 df90Var = new df90(u, u.length);
            int g = df90Var.g(1);
            if (g != 0) {
                throw new ParserException(0, oyr.i(g, "unsupported audio mux version: "), null, true);
            }
            d6z.k("Only supports allStreamsSameTimeFraming.", df90Var.g(1) == 1);
            int g2 = df90Var.g(6);
            d6z.k("Only suppors one program.", df90Var.g(4) == 0);
            d6z.k("Only suppors one layer.", df90Var.g(3) == 0);
            i = g2;
        }
        return i + 1;
    }

    @Override // defpackage.wil0
    public final void a(long j, long j2) {
        this.d = j;
        this.f = 0;
        this.g = j2;
    }

    @Override // defpackage.wil0
    public final void b(long j) {
        d6z.x(this.d == -9223372036854775807L);
        this.d = j;
    }

    @Override // defpackage.wil0
    public final void c(ef90 ef90Var, long j, int i, boolean z) {
        d6z.z(this.c);
        int a = sil0.a(this.e);
        if (this.f > 0 && a < i) {
            g001 g001Var = this.c;
            g001Var.getClass();
            g001Var.c(this.h, 1, this.f, 0, null);
            this.f = 0;
            this.h = -9223372036854775807L;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            int i3 = 0;
            while (ef90Var.b < ef90Var.c) {
                int y = ef90Var.y();
                i3 += y;
                if (y != 255) {
                    break;
                }
            }
            this.c.a(ef90Var, i3, 0);
            this.f += i3;
        }
        this.h = qva1.d(this.a.b, this.g, j, this.d);
        if (z) {
            g001 g001Var2 = this.c;
            g001Var2.getClass();
            g001Var2.c(this.h, 1, this.f, 0, null);
            this.f = 0;
            this.h = -9223372036854775807L;
        }
        this.e = i;
    }

    @Override // defpackage.wil0
    public final void d(d5p d5pVar, int i) {
        g001 B = d5pVar.B(i, 2);
        this.c = B;
        int i2 = tw21.a;
        B.d(this.a.c);
    }
}
