package xsna;

import java.io.IOException;
import kotlin.jvm.internal.Lambda;

/* compiled from: FaultHidingSink.kt */
/* loaded from: classes8.dex */
public final class fmq extends bas {
    public final Lambda c;
    public boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public fmq(qwj0 qwj0Var, izs<? super IOException, s3q0> izsVar) {
        super(qwj0Var);
        this.c = (Lambda) izsVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.Lambda, xsna.izs] */
    @Override // xsna.bas, xsna.qwj0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.d = true;
            this.c.invoke(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.Lambda, xsna.izs] */
    @Override // xsna.bas, xsna.qwj0, java.io.Flushable
    public final void flush() {
        if (this.d) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.d = true;
            this.c.invoke(e);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.internal.Lambda, xsna.izs] */
    @Override // xsna.bas, xsna.qwj0
    public final void n1(vl8 vl8Var, long j) {
        if (this.d) {
            vl8Var.skip(j);
            return;
        }
        try {
            super.n1(vl8Var, j);
        } catch (IOException e) {
            this.d = true;
            this.c.invoke(e);
        }
    }
}
