package xsna;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: StreamGifDecoder.java */
/* loaded from: classes12.dex */
public final class uom0 implements mag0<InputStream, gyt> {
    public final ArrayList a;
    public final bu8 b;
    public final cl3 c;

    public uom0(ArrayList arrayList, bu8 bu8Var, cl3 cl3Var) {
        this.a = arrayList;
        this.b = bu8Var;
        this.c = cl3Var;
    }

    @Override // xsna.mag0
    public final hag0<gyt> a(@NonNull InputStream inputStream, int i, int i2, @NonNull au80 au80Var) throws IOException {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(bArr), i, i2, au80Var);
    }

    @Override // xsna.mag0
    public final boolean b(@NonNull InputStream inputStream, @NonNull au80 au80Var) throws IOException {
        return !((Boolean) au80Var.c(uyt.b)).booleanValue() && com.bumptech.glide.load.a.b(this.a, inputStream, this.c) == ImageHeaderParser.ImageType.GIF;
    }
}
