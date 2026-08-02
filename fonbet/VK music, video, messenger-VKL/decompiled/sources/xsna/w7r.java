package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: FileBackedNativeSessionFile.java */
/* loaded from: classes13.dex */
public final class w7r implements ew50 {

    @NonNull
    public final File a;

    @NonNull
    public final String b;

    @NonNull
    public final String c;

    public w7r(@NonNull String str, @NonNull String str2, @NonNull File file) {
        this.b = str;
        this.c = str2;
        this.a = file;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // xsna.ew50
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final al5 a() {
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
            if (bArr == null) {
                return new al5(this.b, bArr);
            }
            return null;
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
        if (bArr == null) {
        }
    }

    @Override // xsna.ew50
    @NonNull
    public final String b() {
        return this.c;
    }

    @Override // xsna.ew50
    @Nullable
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
