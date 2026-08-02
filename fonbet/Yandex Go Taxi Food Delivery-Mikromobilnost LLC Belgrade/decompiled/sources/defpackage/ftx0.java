package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ftx0 extends xsx0 {
    public final Runnable c;

    public ftx0(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(wwg.s(runnable));
        sb.append(Extension.FIX_SPACE);
        sb.append(this.a);
        sb.append(Extension.FIX_SPACE);
        return b64.p(sb, this.b ? "Blocking" : "Non-blocking", ']');
    }
}
