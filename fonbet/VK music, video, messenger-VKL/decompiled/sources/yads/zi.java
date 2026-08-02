package yads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class zi extends eo {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public zi(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        try {
            Uri uri = u30Var.a;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(DomExceptionUtils.SEPARATOR)) {
                path = path.substring(1);
            }
            e();
            InputStream open = this.e.open(path, 1);
            this.g = open;
            if (open.skip(u30Var.f) < u30Var.f) {
                throw new yi(null, 2008);
            }
            long j = u30Var.g;
            if (j != -1) {
                this.h = j;
            } else {
                long available = this.g.available();
                this.h = available;
                if (available == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.i = true;
            b(u30Var);
            return this.h;
        } catch (yi e) {
            throw e;
        } catch (IOException e2) {
            throw new yi(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // yads.p30
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new yi(e, 2000);
            }
        } finally {
            this.g = null;
            if (this.i) {
                this.i = false;
                d();
            }
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new yi(e, 2000);
            }
        }
        InputStream inputStream = this.g;
        int i3 = mc3.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.h;
        if (j2 != -1) {
            this.h = j2 - read;
        }
        c(read);
        return read;
    }
}
