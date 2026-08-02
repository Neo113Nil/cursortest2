package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.vk.media.qrcode.QRCodeGenerate;
import kotlin.Result;

/* compiled from: SvgRenderer.kt */
/* loaded from: classes3.dex */
public abstract class hln0 {
    public static final a g = new a();
    public static final bpn0 h = new bpn0(new f84(22));
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final Paint e = new Paint(2);
    public final bpn0 f;

    /* compiled from: SvgRenderer.kt */
    public static final class a {
        public static int[] a(int i, int i2, String str) {
            Object failure;
            try {
                failure = ((Boolean) hln0.h.getValue()).booleanValue() ? QRCodeGenerate.nativeRenderSvg(str, i, i2) : null;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            return (int[]) (failure instanceof Result.Failure ? null : failure);
        }
    }

    public hln0(String str, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = i;
        this.d = i2;
        this.f = new bpn0(new t9b(16, str, this));
    }

    public abstract boolean a();

    public int b() {
        return this.d;
    }

    public int c() {
        return this.c;
    }

    public abstract void d(Canvas canvas, int i, int i2);

    public abstract void e(int i, int i2, int[] iArr);
}
