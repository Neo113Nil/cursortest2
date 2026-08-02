package defpackage;

import defpackage.c3f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes11.dex */
public final class kyq implements i450 {
    public final File a;
    public final String b;
    public final String c;

    public kyq(File file, String str, String str2) {
        this.b = str;
        this.c = str2;
        this.a = file;
    }

    @Override // defpackage.i450
    public final String a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.i450
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c3f.d.b b() {
        byte[] bArr;
        InputStream stream;
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr2 = new byte[8192];
        try {
            stream = getStream();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
        }
        if (stream == null) {
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            if (stream != null) {
                stream.close();
            }
            bArr = null;
            if (bArr != null) {
                return null;
            }
            j44 j44Var = new j44();
            j44Var.b = bArr;
            j44Var.a = this.b;
            return j44Var.a();
        }
        while (true) {
            try {
                int read = stream.read(bArr2);
                if (read <= 0) {
                    break;
                }
                gZIPOutputStream.write(bArr2, 0, read);
            } finally {
            }
        }
        gZIPOutputStream.finish();
        bArr = byteArrayOutputStream.toByteArray();
        gZIPOutputStream.close();
        byteArrayOutputStream.close();
        stream.close();
        if (bArr != null) {
        }
    }

    @Override // defpackage.i450
    public final InputStream getStream() {
        File file = this.a;
        if (file.exists() && file.isFile()) {
            try {
                return new FileInputStream(file);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
