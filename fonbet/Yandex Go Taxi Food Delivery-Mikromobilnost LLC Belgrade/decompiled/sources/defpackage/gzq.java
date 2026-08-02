package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes15.dex */
public final class gzq extends m5j0 {
    public final wg10 b;
    public final Uri c;
    public final long d;
    public final long e;
    public final ContentResolver f;

    public gzq(Context context, wg10 wg10Var, Uri uri, long j, long j2) {
        this.b = wg10Var;
        this.c = uri;
        this.d = j;
        this.e = j2;
        z83.i();
        this.f = context.getContentResolver();
    }

    @Override // defpackage.m5j0
    public final long a() {
        return this.d - this.e;
    }

    @Override // defpackage.m5j0
    public final wg10 b() {
        return this.b;
    }

    @Override // defpackage.m5j0
    public final void d(oq6 oq6Var) {
        Uri uri = this.c;
        try {
            InputStream openInputStream = this.f.openInputStream(uri);
            try {
                if (openInputStream == null) {
                    throw new FileNotFoundException("Can't open stream from uri: " + uri);
                }
                openInputStream.skip(this.e);
                oq6Var.N1(vng.H(openInputStream));
                oq6Var.flush();
                openInputStream.close();
            } finally {
            }
        } catch (SecurityException unused) {
            throw new FileNotFoundException(uri.toString());
        }
    }
}
