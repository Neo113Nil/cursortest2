package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: BytesBackedNativeSessionFile.java */
/* loaded from: classes13.dex */
public final class ou8 implements ew50 {

    @Nullable
    public final byte[] a;

    @NonNull
    public final String b;

    @NonNull
    public final String c;

    public ou8(@NonNull String str, @Nullable byte[] bArr, @NonNull String str2) {
        this.b = str;
        this.c = str2;
        this.a = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // xsna.ew50
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final al5 a() {
        byte[] bArr;
        byte[] bArr2 = this.a;
        if (bArr2 != null && bArr2.length != 0) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bArr2);
                        gZIPOutputStream.finish();
                        bArr = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                    } finally {
                    }
                } finally {
                }
            } catch (IOException unused) {
            }
            if (bArr != null) {
                return null;
            }
            return new al5(this.b, bArr);
        }
        bArr = null;
        if (bArr != null) {
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
        byte[] bArr = this.a;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return new ByteArrayInputStream(bArr);
    }
}
