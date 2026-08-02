package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import xsna.gyt;

/* compiled from: ByteBufferGifDecoder.java */
/* loaded from: classes12.dex */
public final class bu8 implements mag0<ByteBuffer, gyt> {
    public static final a f = new a();
    public static final b g = new b();
    public final Context a;
    public final ArrayList b;
    public final dyt e;
    public final a d = f;
    public final b c = g;

    /* compiled from: ByteBufferGifDecoder.java */
    public static class a {
    }

    /* compiled from: ByteBufferGifDecoder.java */
    public static class b {
        public final ArrayDeque a;

        public b() {
            char[] cArr = s2r0.a;
            this.a = new ArrayDeque(0);
        }

        public final synchronized void a(nyt nytVar) {
            nytVar.b = null;
            nytVar.c = null;
            this.a.offer(nytVar);
        }
    }

    public bu8(Context context, ArrayList arrayList, tc7 tc7Var, cl3 cl3Var) {
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.e = new dyt(tc7Var, cl3Var);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // xsna.mag0
    public final xsna.hag0<xsna.gyt> a(@androidx.annotation.NonNull java.nio.ByteBuffer r8, int r9, int r10, @androidx.annotation.NonNull xsna.au80 r11) throws java.io.IOException {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            xsna.bu8$b r8 = r7.c
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            xsna.nyt r0 = (xsna.nyt) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            xsna.nyt r0 = new xsna.nyt     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L57
        L1b:
            r0 = 0
            r5.b = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.a     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            xsna.myt r0 = new xsna.myt     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.c = r0     // Catch: java.lang.Throwable -> L54
            r5.d = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.b = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.b     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            xsna.hyt r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            xsna.bu8$b r9 = r1.c
            r9.a(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            xsna.bu8$b r9 = r1.c
            r9.a(r5)
            throw r8
        L54:
            r0 = move-exception
            r1 = r7
        L56:
            r9 = r0
        L57:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L59
            throw r9
        L59:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.bu8.a(java.lang.Object, int, int, xsna.au80):xsna.hag0");
    }

    @Override // xsna.mag0
    public final boolean b(@NonNull ByteBuffer byteBuffer, @NonNull au80 au80Var) throws IOException {
        return !((Boolean) au80Var.c(uyt.b)).booleanValue() && com.bumptech.glide.load.a.c(this.b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    @Nullable
    public final hyt c(ByteBuffer byteBuffer, int i, int i2, nyt nytVar, au80 au80Var) {
        int i3 = w000.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            myt b2 = nytVar.b();
            if (b2.c > 0 && b2.b == 0) {
                Bitmap.Config config = au80Var.c(uyt.a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int min = Math.min(b2.g / i2, b2.f / i);
                int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
                a aVar = this.d;
                dyt dytVar = this.e;
                aVar.getClass();
                gpk0 gpk0Var = new gpk0(dytVar, b2, byteBuffer, max);
                gpk0Var.c(config);
                gpk0Var.a();
                Bitmap nextFrame = gpk0Var.getNextFrame();
                if (nextFrame == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        SystemClock.elapsedRealtimeNanos();
                        return null;
                    }
                    return null;
                }
                hyt hytVar = new hyt(new gyt(new gyt.a(new kyt(com.bumptech.glide.a.a(this.a), gpk0Var, i, i2, y3q0.b, nextFrame))));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
                return hytVar;
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
