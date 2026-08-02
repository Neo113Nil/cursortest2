package xsna;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.vk.push.core.utils.CoroutineExtensionsKt;
import java.io.FileOutputStream;
import java.io.InputStream;
import xsna.atj;
import xsna.ppa0;
import xsna.yye0;

/* compiled from: SecretsDataSource.kt */
/* loaded from: classes5.dex */
public final class n1i0 implements yye0.a {
    public final Object b;
    public final Object c;

    public /* synthetic */ n1i0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    public long a(FileOutputStream fileOutputStream, ppa0.a aVar, atj.a aVar2) {
        InputStream openInputStream = ((Context) this.b).getContentResolver().openInputStream((Uri) this.c);
        try {
            byte[] bArr = new byte[32768];
            long j = 0;
            for (int read = openInputStream.read(bArr, 0, 32768); read >= 0; read = openInputStream.read(bArr, 0, 32768)) {
                if (((Boolean) aVar.get()).booleanValue()) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                j += read;
                aVar2.invoke(Long.valueOf(j));
            }
            openInputStream.close();
            return j;
        } finally {
        }
    }

    @Override // xsna.yye0.a
    public void b() {
        CoroutineExtensionsKt.safeResume((lq9) this.b, ((o1i0) this.c).c.getvkv2("com.vk.push.authsdk"));
    }

    public Long c() {
        Long l;
        try {
            Cursor query = ((Context) this.b).getContentResolver().query((Uri) this.c, null, null, null, null);
            if (query != null) {
                try {
                    boolean moveToFirst = query.moveToFirst();
                    Boolean valueOf = Boolean.valueOf(moveToFirst);
                    if (!moveToFirst) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        Integer valueOf2 = Integer.valueOf(query.getColumnIndex("_size"));
                        if (valueOf2.intValue() < 0) {
                            valueOf2 = null;
                        }
                        if (valueOf2 != null) {
                            l = Long.valueOf(query.getLong(valueOf2.intValue()));
                            query.close();
                            return l;
                        }
                    }
                    l = null;
                    query.close();
                    return l;
                } finally {
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // xsna.yye0.a
    public void d(Throwable th) {
        CoroutineExtensionsKt.safeResumeWithException((lq9) this.b, new IllegalStateException("Library loading was failed", th));
    }
}
