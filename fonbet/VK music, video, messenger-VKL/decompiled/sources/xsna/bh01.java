package xsna;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class bh01 implements dk01 {
    public final /* synthetic */ HashSet b;
    public final /* synthetic */ vp01 c;
    public final /* synthetic */ ZipFile d;

    public bh01(HashSet hashSet, vp01 vp01Var, ZipFile zipFile) {
        this.b = hashSet;
        this.c = vp01Var;
        this.d = zipFile;
    }

    @Override // xsna.dk01
    public final void f(vk01 vk01Var, File file, boolean z) throws IOException {
        this.b.add(file);
        if (z) {
            return;
        }
        vp01 vp01Var = this.c;
        vp01Var.b();
        ZipEntry zipEntry = vk01Var.b;
        vp01Var.a().getAbsolutePath();
        zipEntry.getName();
        file.getAbsolutePath();
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = this.d.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                file.setWritable(false, true);
                file.setWritable(false, false);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
            }
            throw th;
        }
    }
}
