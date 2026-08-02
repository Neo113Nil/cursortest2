package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.datasource.AssetDataSource$AssetDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class c93 extends nz4 {
    public final AssetManager a;
    public Uri b;
    public InputStream c;
    public long w;
    public boolean x;

    public c93(Context context) {
        super(false);
        this.a = context.getAssets();
    }

    @Override // defpackage.kpg
    public final void close() {
        this.b = null;
        try {
            try {
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AssetDataSource$AssetDataSourceException(2000, e);
            }
        } finally {
            this.c = null;
            if (this.x) {
                this.x = false;
                transferEnded();
            }
        }
    }

    @Override // defpackage.kpg
    /* renamed from: getUri */
    public final Uri getInflatedUri() {
        return this.b;
    }

    @Override // defpackage.kpg
    public final long open(npg npgVar) {
        try {
            Uri uri = npgVar.a;
            long j = npgVar.f;
            this.b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(npgVar);
            InputStream open = this.a.open(path, 1);
            this.c = open;
            if (open.skip(j) < j) {
                throw new AssetDataSource$AssetDataSourceException(2008, null);
            }
            long j2 = npgVar.g;
            if (j2 != -1) {
                this.w = j2;
            } else {
                long available = this.c.available();
                this.w = available;
                if (available == 2147483647L) {
                    this.w = -1L;
                }
            }
            this.x = true;
            transferStarted(npgVar);
            return this.w;
        } catch (AssetDataSource$AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSource$AssetDataSourceException(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.w;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new AssetDataSource$AssetDataSourceException(2000, e);
                }
            }
            InputStream inputStream = this.c;
            int i3 = tw21.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.w;
                if (j2 != -1) {
                    this.w = j2 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
