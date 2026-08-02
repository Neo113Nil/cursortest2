package defpackage;

import java.io.IOException;

/* loaded from: classes9.dex */
public final class ncp extends fas {
    public final tls b;
    public boolean c;

    public ncp(uis0 uis0Var, tls tlsVar) {
        super(uis0Var);
        this.b = tlsVar;
    }

    @Override // defpackage.fas, defpackage.uis0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // defpackage.fas, defpackage.uis0, java.io.Flushable
    public final void flush() {
        if (this.c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // defpackage.fas, defpackage.uis0
    public final void write(yp6 yp6Var, long j) {
        if (this.c) {
            yp6Var.skip(j);
            return;
        }
        try {
            super.write(yp6Var, j);
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }
}
