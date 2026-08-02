package coil.disk;

import defpackage.fas;
import defpackage.tls;
import defpackage.uis0;
import defpackage.yp6;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class b extends fas {
    public final tls b;
    public boolean c;

    public b(uis0 uis0Var, tls tlsVar) {
        super(uis0Var);
        this.b = tlsVar;
    }

    @Override // defpackage.fas, defpackage.uis0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.c = true;
            ((DiskLruCache$newJournalWriter$faultHidingSink$1) this.b).invoke(e);
        }
    }

    @Override // defpackage.fas, defpackage.uis0, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.c = true;
            ((DiskLruCache$newJournalWriter$faultHidingSink$1) this.b).invoke(e);
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
            ((DiskLruCache$newJournalWriter$faultHidingSink$1) this.b).invoke(e);
        }
    }
}
