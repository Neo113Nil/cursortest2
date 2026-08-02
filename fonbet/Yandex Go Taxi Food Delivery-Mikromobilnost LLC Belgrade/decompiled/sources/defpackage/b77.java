package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class b77 implements rtj0 {
    public static final q501 f = new q501(9);
    public static final a77 g = new a77(0);
    public final Context a;
    public final ArrayList b;
    public final u1n e;
    public final q501 d = f;
    public final a77 c = g;

    public b77(Context context, ArrayList arrayList, b16 b16Var, g63 g63Var) {
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.e = new u1n(25, b16Var, g63Var);
    }

    @Override // defpackage.rtj0
    public final otj0 a(Object obj, int i, int i2, mg70 mg70Var) {
        ygt ygtVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        a77 a77Var = this.c;
        synchronized (a77Var) {
            try {
                ygt ygtVar2 = (ygt) a77Var.a.poll();
                if (ygtVar2 == null) {
                    ygtVar2 = new ygt();
                }
                ygtVar = ygtVar2;
                ygtVar.b = null;
                Arrays.fill(ygtVar.a, (byte) 0);
                ygtVar.c = new wgt();
                ygtVar.d = 0;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                ygtVar.b = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                ygtVar.b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c(byteBuffer, i, i2, ygtVar, mg70Var);
        } finally {
            this.c.a(ygtVar);
        }
    }

    @Override // defpackage.rtj0
    public final boolean b(Object obj, mg70 mg70Var) {
        return !((Boolean) mg70Var.c(zgt.b)).booleanValue() && k4b1.p(this.b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089 A[Catch: all -> 0x0029, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:3:0x000a, B:5:0x0013, B:8:0x0019, B:10:0x0025, B:12:0x002f, B:15:0x0044, B:17:0x005e, B:20:0x0063, B:21:0x006f, B:29:0x0089, B:35:0x006d, B:36:0x0040, B:37:0x002c), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pgt c(ByteBuffer byteBuffer, int i, int i2, ygt ygtVar, mg70 mg70Var) {
        Bitmap b;
        Bitmap.Config config;
        int i3 = vfz.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            wgt b2 = ygtVar.b();
            if (b2.c > 0 && b2.b == 0) {
                Bitmap.Config config2 = mg70Var.c(zgt.a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int min = Math.min(b2.g / i2, b2.f / i);
                int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
                Log.isLoggable("BufferGifDecoder", 2);
                q501 q501Var = this.d;
                u1n u1nVar = this.e;
                q501Var.getClass();
                tzt0 tzt0Var = new tzt0(u1nVar, b2, byteBuffer, max);
                Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
                if (config2 != config3 && config2 != (config = Bitmap.Config.RGB_565)) {
                    s2u0.j("Unsupported format: ", config2, ", must be one of ", config3, " or ", config);
                    tzt0Var.k = (tzt0Var.k + 1) % tzt0Var.l.c;
                    b = tzt0Var.b();
                    if (b != null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            SystemClock.elapsedRealtimeNanos();
                            return null;
                        }
                        return null;
                    }
                    pgt pgtVar = new pgt(new GifDrawable(this.a, tzt0Var, fz11.b, i, i2, b), 0);
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        SystemClock.elapsedRealtimeNanos();
                    }
                    return pgtVar;
                }
                tzt0Var.t = config2;
                tzt0Var.k = (tzt0Var.k + 1) % tzt0Var.l.c;
                b = tzt0Var.b();
                if (b != null) {
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
