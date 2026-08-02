package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.m;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: IcyDataSource.java */
/* loaded from: classes12.dex */
public final class vrv implements androidx.media3.datasource.a {
    public final androidx.media3.datasource.a a;
    public final int b;
    public final m.b c;
    public final byte[] d;
    public int e;

    public vrv(androidx.media3.datasource.a aVar, int i, m.b bVar) {
        fxc0.p(i > 0);
        this.a = aVar;
        this.b = i;
        this.c = bVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // androidx.media3.datasource.a
    public final void addTransferListener(mjp0 mjp0Var) {
        mjp0Var.getClass();
        this.a.addTransferListener(mjp0Var);
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        throw new UnsupportedOperationException();
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
    public final long open(evk evkVar) {
        throw new UnsupportedOperationException();
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long max;
        int i3 = this.e;
        androidx.media3.datasource.a aVar = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (aVar.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int read = aVar.read(bArr3, i4, i6);
                        if (read != -1) {
                            i4 += read;
                            i6 -= read;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        xi90 xi90Var = new xi90(bArr3, i5);
                        m.b bVar = this.c;
                        if (bVar.l) {
                            androidx.media3.exoplayer.source.m mVar = androidx.media3.exoplayer.source.m.this;
                            Map<String, String> map = androidx.media3.exoplayer.source.m.S;
                            max = Math.max(mVar.n(true), bVar.i);
                        } else {
                            max = bVar.i;
                        }
                        long j = max;
                        int a = xi90Var.a();
                        rgp0 rgp0Var = bVar.k;
                        rgp0Var.getClass();
                        rgp0Var.d(a, xi90Var);
                        rgp0Var.a(j, 1, a, 0, null);
                        bVar.l = true;
                    }
                }
                this.e = this.b;
            }
            return -1;
        }
        int read2 = aVar.read(bArr, i, Math.min(this.e, i2));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }
}
