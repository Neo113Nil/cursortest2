package xsna;

import android.graphics.Bitmap;
import android.util.Size;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import kotlin.text.Regex;
import xsna.hl10;
import xsna.hln0;

/* compiled from: FrescoSvgDecoder.kt */
/* loaded from: classes.dex */
public final class jhs implements niw {
    public static final bpn0 c = new bpn0(new s63(5));
    public static final bpn0 d = new bpn0(new sw1(7));
    public final sc7 a;
    public final b b = new b(5);

    /* compiled from: FrescoSvgDecoder.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public WeakReference<byte[]> a = new WeakReference<>(null);

        public final byte[] a(int i) {
            byte[] bArr = this.a.get();
            if (bArr != null) {
                if (bArr.length < i) {
                    bArr = null;
                }
                if (bArr != null) {
                    Arrays.fill(bArr, 0, bArr.length, (byte) 0);
                    return bArr;
                }
            }
            byte[] bArr2 = new byte[i];
            this.a = new WeakReference<>(bArr2);
            return bArr2;
        }
    }

    /* compiled from: FrescoSvgDecoder.kt */
    public static final class b extends vvb0<a> {
        @Override // xsna.vvb0, xsna.tvb0, xsna.svb0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a c() {
            a aVar = (a) super.c();
            return aVar == null ? new a() : aVar;
        }
    }

    public jhs(sc7 sc7Var) {
        this.a = sc7Var;
    }

    public static int b(Regex regex, String str) {
        List<String> b2;
        hl10 b3 = regex.b(str);
        String str2 = (b3 == null || (b2 = b3.b()) == null) ? null : (String) ((hl10.a) b2).get(1);
        Integer valueOf = str2 != null ? Integer.valueOf(Integer.parseInt(str2)) : null;
        if (valueOf != null) {
            return valueOf.intValue();
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return 100;
        }
        L.u(l, L.LogType.w, new Object[]{"Can't determine SVG size by regex " + regex});
        return 100;
    }

    @Override // xsna.niw
    public final svf a(rip ripVar, int i, cpe0 cpe0Var, liw liwVar) {
        b bVar = this.b;
        try {
            a c2 = bVar.c();
            byte[] a2 = c2.a(i);
            ripVar.m().r().a(0, 0, i, a2);
            bVar.a(c2);
            String str = new String(a2, emb.b);
            q0v0 q0v0Var = liwVar instanceof q0v0 ? (q0v0) liwVar : null;
            Size b2 = q0v0Var != null ? q0v0Var.b() : null;
            int width = b2 != null ? b2.getWidth() : b((Regex) c.getValue(), str);
            int height = b2 != null ? b2.getHeight() : b((Regex) d.getValue(), str);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmap = this.a.get(width * height * id7.b(config));
            Bitmap bitmap2 = bitmap;
            bitmap2.reconfigure(width, height, config);
            hln0.g.getClass();
            int[] a3 = hln0.a.a(width, height, str);
            if (a3 != null) {
                bitmap2.setPixels(a3, 0, width, 0, 0, width, height);
            }
            return xvf.i2(bitmap, new ft0(this, 25), gpw.d);
        } catch (Throwable th) {
            L.E(th, new Object[0]);
            throw th;
        }
    }
}
