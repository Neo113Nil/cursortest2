package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: TeeDataSource.java */
/* loaded from: classes12.dex */
public final class x7o0 implements androidx.media3.datasource.a {
    public final androidx.media3.datasource.a a;
    public final wuk b;
    public boolean c;
    public long d;

    public x7o0(androidx.media3.datasource.a aVar, wuk wukVar) {
        this.a = aVar;
        wukVar.getClass();
        this.b = wukVar;
    }

    @Override // androidx.media3.datasource.a
    public final void addTransferListener(mjp0 mjp0Var) {
        mjp0Var.getClass();
        this.a.addTransferListener(mjp0Var);
    }

    @Override // androidx.media3.datasource.a
    public final void close() throws IOException {
        wuk wukVar = this.b;
        try {
            this.a.close();
        } finally {
            if (this.c) {
                this.c = false;
                wukVar.close();
            }
        }
    }

    @Override // androidx.media3.datasource.a
    public final Map<String, List<String>> getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.a
    @Nullable
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // androidx.media3.datasource.a
    public final long open(evk evkVar) throws IOException {
        long open = this.a.open(evkVar);
        this.d = open;
        if (open == 0) {
            return 0L;
        }
        if (evkVar.h == -1 && open != -1) {
            evkVar = evkVar.e(0L, open);
        }
        this.c = true;
        this.b.open(evkVar);
        return this.d;
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.d == 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, i2);
        if (read > 0) {
            this.b.write(bArr, i, read);
            long j = this.d;
            if (j != -1) {
                this.d = j - read;
            }
        }
        return read;
    }
}
