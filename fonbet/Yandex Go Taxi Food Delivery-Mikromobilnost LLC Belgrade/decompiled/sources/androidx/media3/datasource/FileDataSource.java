package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import defpackage.b64;
import defpackage.cj01;
import defpackage.ipg;
import defpackage.kpg;
import defpackage.npg;
import defpackage.nz4;
import defpackage.tw21;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes10.dex */
public final class FileDataSource extends nz4 {
    public RandomAccessFile a;
    public Uri b;
    public long c;
    public boolean w;

    public static class FileDataSourceException extends DataSourceException {
    }

    /* loaded from: classes.dex */
    public static final class a implements ipg {
        public cj01 a;

        @Override // defpackage.ipg
        public final kpg createDataSource() {
            FileDataSource fileDataSource = new FileDataSource();
            cj01 cj01Var = this.a;
            if (cj01Var != null) {
                fileDataSource.addTransferListener(cj01Var);
            }
            return fileDataSource;
        }
    }

    public FileDataSource() {
        super(false);
    }

    @Override // defpackage.kpg
    public final void close() {
        this.b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FileDataSourceException(2000, e);
            }
        } finally {
            this.a = null;
            if (this.w) {
                this.w = false;
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
        Uri uri = npgVar.a;
        long j = npgVar.f;
        this.b = uri;
        transferInitializing(npgVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.a = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = npgVar.g;
                if (j2 == -1) {
                    j2 = this.a.length() - j;
                }
                this.c = j2;
                if (j2 < 0) {
                    throw new FileDataSourceException(2008, null, null);
                }
                this.w = true;
                transferStarted(npgVar);
                return this.c;
            } catch (IOException e) {
                throw new FileDataSourceException(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder v = b64.v("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            v.append(fragment);
            throw new FileDataSourceException(1004, e2, v.toString());
        } catch (SecurityException e3) {
            throw new FileDataSourceException(2006, e3);
        } catch (RuntimeException e4) {
            throw new FileDataSourceException(2000, e4);
        }
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.c;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.a;
            int i3 = tw21.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.c -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e) {
            throw new FileDataSourceException(2000, e);
        }
    }
}
