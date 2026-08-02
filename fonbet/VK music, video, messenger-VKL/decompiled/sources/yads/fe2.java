package yads;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class fe2 implements p30 {
    public static final fe2 a = new fe2();

    @Override // yads.p30
    public final void a(v93 v93Var) {
    }

    @Override // yads.p30
    public final Uri getUri() {
        return null;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // yads.p30
    public final void close() {
    }
}
