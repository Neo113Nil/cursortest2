package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: StatsDataSource.java */
/* loaded from: classes12.dex */
public final class vyk0 implements androidx.media3.datasource.a {
    public final androidx.media3.datasource.a a;
    public long b;
    public Uri c;
    public Map<String, List<String>> d;

    public vyk0(androidx.media3.datasource.a aVar) {
        aVar.getClass();
        this.a = aVar;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.datasource.a
    public final void addTransferListener(mjp0 mjp0Var) {
        mjp0Var.getClass();
        this.a.addTransferListener(mjp0Var);
    }

    @Override // androidx.media3.datasource.a
    public final void close() throws IOException {
        this.a.close();
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
        androidx.media3.datasource.a aVar = this.a;
        this.c = evkVar.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return aVar.open(evkVar);
        } finally {
            Uri uri = aVar.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.d = aVar.getResponseHeaders();
        }
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
