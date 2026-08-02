package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.images.HttpException;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import okhttp3.OkHttpClient;

/* loaded from: classes15.dex */
public class kes0 extends zn50 {
    public final OkHttpClient b;

    public kes0() {
        this.b = new OkHttpClient(new OkHttpClient.a());
    }

    @Override // defpackage.zn50
    public final boolean a(xn50 xn50Var) {
        String scheme = xn50Var.b.getScheme();
        return "http".equalsIgnoreCase(scheme) || Constants.SCHEME.equalsIgnoreCase(scheme);
    }

    @Override // defpackage.zn50
    public final int b() {
        return 3;
    }

    @Override // defpackage.zn50
    public final ht10 c(xn50 xn50Var) {
        byte[] byteArray;
        Uri uri = xn50Var.b;
        t4j0 t4j0Var = new t4j0();
        t4j0Var.h(uri.toString());
        kvj0 execute = ((nci0) this.b.newCall(new d5j0(t4j0Var))).execute();
        int i = execute.w;
        if (i != 200) {
            throw new HttpException(i);
        }
        rvj0 rvj0Var = execute.z;
        if (rvj0Var == null) {
            ny61.v("Not OK, body is null");
            return null;
        }
        InputStream byteStream = rvj0Var.byteStream();
        if (byteStream == null) {
            byteArray = null;
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[2048];
            while (true) {
                int read = byteStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArray = byteArrayOutputStream.toByteArray();
        }
        return new ht10((Bitmap) null, byteArray);
    }

    @Override // defpackage.zn50
    public final boolean e(pv50 pv50Var) {
        return pv50Var == null || pv50Var.a;
    }

    public kes0(OkHttpClient okHttpClient) {
        this.b = okHttpClient;
    }
}
