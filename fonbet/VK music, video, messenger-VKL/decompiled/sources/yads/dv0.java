package yads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class dv0 extends eo {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    public dv0() {
        super(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r2 != false) goto L39;
     */
    @Override // yads.p30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(u30 u30Var) {
        boolean a;
        Uri uri = u30Var.a;
        this.f = uri;
        e();
        int i = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(u30Var.f);
                long j = u30Var.g;
                if (j == -1) {
                    j = this.e.length() - u30Var.f;
                }
                this.g = j;
                if (j < 0) {
                    throw new cv0(null, null, 2008);
                }
                this.h = true;
                b(u30Var);
                return this.g;
            } catch (IOException e) {
                throw new cv0(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (mc3.a >= 21) {
                    a = av0.a(e2.getCause());
                }
                i = 2005;
                throw new cv0(e2, i);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder a2 = xe9.a("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            a2.append(fragment);
            throw new cv0(a2.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new cv0(e3, 2006);
        } catch (RuntimeException e4) {
            throw new cv0(e4, 2000);
        }
    }

    @Override // yads.p30
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new cv0(e, 2000);
            }
        } finally {
            this.e = null;
            if (this.h) {
                this.h = false;
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
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            int i3 = mc3.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.g -= read;
                c(read);
            }
            return read;
        } catch (IOException e) {
            throw new cv0(e, 2000);
        }
    }
}
