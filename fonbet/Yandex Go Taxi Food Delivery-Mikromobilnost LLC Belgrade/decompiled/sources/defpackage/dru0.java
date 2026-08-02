package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class dru0 implements rtj0 {
    public final ArrayList a;
    public final b77 b;
    public final g63 c;

    public dru0(ArrayList arrayList, b77 b77Var, g63 g63Var) {
        this.a = arrayList;
        this.b = b77Var;
        this.c = g63Var;
    }

    @Override // defpackage.rtj0
    public final otj0 a(Object obj, int i, int i2, mg70 mg70Var) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Log.isLoggable("StreamGifDecoder", 5);
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(bArr), i, i2, mg70Var);
    }

    @Override // defpackage.rtj0
    public final boolean b(Object obj, mg70 mg70Var) {
        return !((Boolean) mg70Var.c(zgt.b)).booleanValue() && k4b1.o(this.a, (InputStream) obj, this.c) == ImageHeaderParser$ImageType.GIF;
    }
}
