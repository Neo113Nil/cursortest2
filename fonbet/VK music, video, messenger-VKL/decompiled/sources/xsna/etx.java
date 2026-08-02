package xsna;

import com.googlecode.mp4parser.BasicContainer;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* compiled from: IsoFile.java */
/* loaded from: classes12.dex */
public final class etx extends BasicContainer {
    static {
        q100.a(etx.class);
    }

    public static String b(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, 4));
        try {
            return new String(bArr2, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new Error("Required character encoding is missing", e);
        }
    }

    public static byte[] c(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i = 0; i < Math.min(4, str.length()); i++) {
                bArr[i] = (byte) str.charAt(i);
            }
        }
        return bArr;
    }

    @Override // com.googlecode.mp4parser.BasicContainer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.dataSource.close();
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public final String toString() {
        return "model(" + this.dataSource.toString() + ")";
    }
}
