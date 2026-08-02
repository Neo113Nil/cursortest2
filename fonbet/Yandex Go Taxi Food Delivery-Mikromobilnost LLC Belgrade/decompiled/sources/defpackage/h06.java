package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class h06 extends gas {
    public final /* synthetic */ int b = 2;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h06(wv60 wv60Var, qq6 qq6Var) {
        super(qq6Var);
        this.c = wv60Var;
    }

    @Override // defpackage.gas, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.b) {
            case 1:
                ((la7) this.c).a.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // defpackage.gas, defpackage.y9t0
    public long read(yp6 yp6Var, long j) {
        switch (this.b) {
            case 0:
                try {
                    return super.read(yp6Var, j);
                } catch (Exception e) {
                    this.c = e;
                    throw e;
                }
            case 1:
            default:
                return super.read(yp6Var, j);
            case 2:
                try {
                    return this.a.read(yp6Var, j);
                } catch (IOException e2) {
                    ((wv60) this.c).c = e2;
                    throw e2;
                }
        }
    }

    public /* synthetic */ h06(y9t0 y9t0Var) {
        super(y9t0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h06(y9t0 y9t0Var, la7 la7Var) {
        super(y9t0Var);
        this.c = la7Var;
    }
}
