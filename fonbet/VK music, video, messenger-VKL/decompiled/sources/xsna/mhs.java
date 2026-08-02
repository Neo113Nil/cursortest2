package xsna;

import android.graphics.Bitmap;
import android.util.Base64;
import android.util.LruCache;
import android.util.Size;
import com.vk.log.L;
import java.nio.ByteBuffer;
import xsna.hso0;
import xsna.siw;

/* compiled from: FrescoThumbHashDecoder.kt */
/* loaded from: classes.dex */
public final class mhs implements niw {
    public static final bpn0 b = new bpn0(new er6(1));
    public final sc7 a;

    /* compiled from: FrescoThumbHashDecoder.kt */
    public static final class a implements siw.a {
        @Override // xsna.siw.a
        public final siw a(int i, byte[] bArr) {
            return a75.d(bArr, (byte[]) uiw.a.getValue(), 0) ? lyd.b : siw.c;
        }

        @Override // xsna.siw.a
        public final int b() {
            return ((byte[]) uiw.a.getValue()).length + 25;
        }
    }

    public mhs(sc7 sc7Var) {
        this.a = sc7Var;
    }

    @Override // xsna.niw
    public final svf a(rip ripVar, int i, cpe0 cpe0Var, liw liwVar) {
        Bitmap bitmap;
        Bitmap bitmap2;
        sc7 sc7Var = this.a;
        Bitmap bitmap3 = null;
        try {
            int length = ((byte[]) uiw.a.getValue()).length;
            int i2 = i - length;
            byte[] bArr = new byte[i2];
            ripVar.m().r().a(length, 0, i2, bArr);
            Base64.encodeToString(bArr, 2);
            String encodeToString = Base64.encodeToString(bArr, 2);
            bpn0 bpn0Var = b;
            hso0.b bVar = (hso0.b) ((LruCache) bpn0Var.getValue()).get(encodeToString);
            if (bVar == null) {
                bVar = hso0.a(bArr);
                ((LruCache) bpn0Var.getValue()).put(encodeToString, bVar);
            }
            Size size = new Size(bVar.a, bVar.b);
            int width = size.getWidth();
            int height = size.getHeight();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmap4 = sc7Var.get(width * height * id7.b(config));
            Bitmap bitmap5 = bitmap4;
            bitmap5.reconfigure(width, height, config);
            bitmap5.copyPixelsFromBuffer(ByteBuffer.wrap(bVar.c));
            bitmap = bitmap4;
            try {
                int width2 = size.getWidth() * 3;
                int height2 = size.getHeight() * 3;
                q0v0 q0v0Var = liwVar instanceof q0v0 ? (q0v0) liwVar : null;
                Size b2 = q0v0Var != null ? q0v0Var.b() : null;
                if (b2 != null && (b2.getWidth() > width2 || b2.getHeight() > height2)) {
                    width2 = b2.getWidth();
                    height2 = b2.getHeight();
                }
                Bitmap bitmap6 = sc7Var.get(width2 * height2 * id7.b(config));
                bitmap6.reconfigure(width2, height2, config);
                bitmap2 = bitmap6;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap = null;
        }
        try {
            fkw.a(bitmap, bitmap2);
            lcl E1 = xvf.E1(bitmap2, new op0(this, 16), gpw.a(0, false, false));
            sc7Var.a(bitmap);
            return E1;
        } catch (Throwable th3) {
            th = th3;
            bitmap3 = bitmap2;
            try {
                L.E(th, new Object[0]);
                if (bitmap3 != null) {
                    sc7Var.a(bitmap3);
                }
                throw th;
            } catch (Throwable th4) {
                if (bitmap != null) {
                    sc7Var.a(bitmap);
                }
                throw th4;
            }
        }
    }
}
