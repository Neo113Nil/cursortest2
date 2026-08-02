package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import defpackage.aav;
import defpackage.b16;
import defpackage.b64;
import defpackage.ce70;
import defpackage.f7u;
import defpackage.g63;
import defpackage.g77;
import defpackage.h16;
import defpackage.h2t;
import defpackage.izz;
import defpackage.k4b1;
import defpackage.ly3;
import defpackage.mg70;
import defpackage.ny61;
import defpackage.r1s;
import defpackage.sw01;
import defpackage.vfc;
import defpackage.vfz;
import defpackage.w7m;
import defpackage.wly0;
import defpackage.z2a1;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes10.dex */
public final class g {
    public static final ce70 f = ce70.a(DecodeFormat.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final ce70 g = new ce70("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, ce70.e);
    public static final ce70 h;
    public static final ce70 i;
    public static final wly0 j;
    public static final ArrayDeque k;
    public final b16 a;
    public final DisplayMetrics b;
    public final g63 c;
    public final ArrayList d;
    public final f7u e = f7u.a();

    static {
        e eVar = DownsampleStrategy.a;
        Boolean bool = Boolean.FALSE;
        h = ce70.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = ce70.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        j = new wly0();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        k = new ArrayDeque(0);
    }

    public g(ArrayList arrayList, DisplayMetrics displayMetrics, b16 b16Var, g63 g63Var) {
        this.d = arrayList;
        z2a1.e(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        z2a1.e(b16Var, "Argument must not be null");
        this.a = b16Var;
        z2a1.e(g63Var, "Argument must not be null");
        this.c = g63Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(r1s r1sVar, BitmapFactory.Options options, w7m w7mVar, b16 b16Var) {
        if (!options.inJustDecodeBounds) {
            w7mVar.a();
            switch (r1sVar.a) {
                case 13:
                    h hVar = (h) ((h2t) r1sVar.b).a;
                    synchronized (hVar) {
                        hVar.c = hVar.a.length;
                        break;
                    }
            }
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = sw01.b;
        lock.lock();
        try {
            try {
                Bitmap c = r1sVar.c(options);
                lock.unlock();
                return c;
            } catch (IllegalArgumentException e) {
                StringBuilder s = b64.s(i2, i3, "Exception decoding bitmap, outWidth: ", ", outHeight: ", ", outMimeType: ");
                s.append(str);
                s.append(", inBitmap: ");
                s.append(d(options.inBitmap));
                IOException iOException = new IOException(s.toString(), e);
                Log.isLoggable("Downsampler", 3);
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOException;
                }
                try {
                    b16Var.c(bitmap);
                    options.inBitmap = null;
                    Bitmap c2 = c(r1sVar, options, w7mVar, b16Var);
                    sw01.b.unlock();
                    return c2;
                } catch (IOException unused) {
                    throw iOException;
                }
            }
        } catch (Throwable th) {
            sw01.b.unlock();
            throw th;
        }
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + RemoteBioParameters.X + bitmap.getHeight() + "] " + bitmap.getConfig() + (Extension.O_BRAKE_SPACE + bitmap.getAllocationByteCount() + Extension.C_BRAKE);
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final h16 a(r1s r1sVar, int i2, int i3, mg70 mg70Var, w7m w7mVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) ((izz) this.c).c(65536, byte[].class);
        synchronized (g.class) {
            arrayDeque = k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) mg70Var.c(f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) mg70Var.c(g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) mg70Var.c(DownsampleStrategy.f);
        boolean booleanValue = ((Boolean) mg70Var.c(h)).booleanValue();
        ce70 ce70Var = i;
        try {
            h16 c = h16.c(this.a, b(r1sVar, options, downsampleStrategy, decodeFormat, preferredColorSpace, mg70Var.c(ce70Var) != null && ((Boolean) mg70Var.c(ce70Var)).booleanValue(), i2, i3, booleanValue, w7mVar));
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            ((izz) this.c).g(bArr);
            return c;
        } catch (Throwable th) {
            e(options);
            ArrayDeque arrayDeque2 = k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                ((izz) this.c).g(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final Bitmap b(r1s r1sVar, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z, int i2, int i3, boolean z2, w7m w7mVar) {
        Bitmap bitmap;
        int i4;
        char c;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        boolean z5;
        g gVar;
        boolean z6;
        int i7;
        Bitmap bitmap2;
        ColorSpace colorSpace;
        Bitmap.Config config;
        boolean z7;
        int i8;
        int i9;
        int floor;
        int floor2;
        h hVar;
        int i10 = vfz.a;
        SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        b16 b16Var = this.a;
        c(r1sVar, options, w7mVar, b16Var);
        int i11 = 0;
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i12 = iArr[0];
        int i13 = iArr[1];
        boolean z8 = (i12 == -1 || i13 == -1) ? false : z;
        switch (r1sVar.a) {
            case 12:
                bitmap = null;
                List list = (List) r1sVar.c;
                ByteBuffer c2 = g77.c((ByteBuffer) r1sVar.b);
                g63 g63Var = (g63) r1sVar.w;
                if (c2 != null) {
                    int size = list.size();
                    int i14 = 0;
                    while (i14 < size) {
                        try {
                            int d = ((aav) list.get(i14)).d(c2, g63Var);
                            List list2 = list;
                            if (d != -1) {
                                i4 = d;
                                break;
                            } else {
                                i14++;
                                list = list2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                i4 = -1;
                break;
            case 13:
                bitmap = null;
                List list3 = (List) r1sVar.w;
                h hVar2 = (h) ((h2t) r1sVar.b).a;
                hVar2.reset();
                i4 = k4b1.n(list3, hVar2, (g63) r1sVar.c);
                break;
            default:
                List list4 = (List) r1sVar.c;
                com.bumptech.glide.load.data.a aVar = (com.bumptech.glide.load.data.a) r1sVar.w;
                bitmap = null;
                g63 g63Var2 = (g63) r1sVar.b;
                int size2 = list4.size();
                while (true) {
                    if (i11 >= size2) {
                        i4 = -1;
                        break;
                    } else {
                        aav aavVar = (aav) list4.get(i11);
                        int i15 = size2;
                        try {
                            int i16 = i11;
                            List list5 = list4;
                            h hVar3 = new h(new FileInputStream(aVar.a().getFileDescriptor()), g63Var2);
                            try {
                                int a = aavVar.a(hVar3, g63Var2);
                                hVar3.c();
                                aVar.a();
                                if (a != -1) {
                                    i4 = a;
                                    break;
                                } else {
                                    i11 = i16 + 1;
                                    size2 = i15;
                                    list4 = list5;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                hVar = hVar3;
                                if (hVar != null) {
                                    hVar.c();
                                }
                                aVar.a();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            hVar = null;
                        }
                    }
                }
        }
        switch (i4) {
            case 3:
            case 4:
                c = 180;
                break;
            case 5:
            case 6:
                c = 'Z';
                break;
            case 7:
            case 8:
                c = 270;
                break;
            default:
                c = 0;
                break;
        }
        switch (i4) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        int i17 = i2;
        if (i17 == Integer.MIN_VALUE) {
            i17 = (c == 'Z' || c == 270) ? i13 : i12;
        }
        int i18 = i4;
        int i19 = i3;
        if (i19 == Integer.MIN_VALUE) {
            i19 = (c == 'Z' || c == 270) ? i12 : i13;
        }
        ImageHeaderParser$ImageType d2 = r1sVar.d();
        if (i12 <= 0 || i13 <= 0) {
            i5 = i13;
            i6 = i12;
            z4 = z8;
            z5 = z3;
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(d2);
            }
            gVar = this;
        } else {
            if (c == 'Z' || c == 270) {
                i8 = i13;
                i9 = i12;
            } else {
                i9 = i13;
                i8 = i12;
            }
            z4 = z8;
            float b = downsampleStrategy.b(i8, i9, i17, i19);
            if (b <= 0.0f) {
                StringBuilder sb = new StringBuilder("Cannot scale with factor: ");
                sb.append(b);
                sb.append(" from: ");
                sb.append(downsampleStrategy);
                sb.append(", source: [");
                vfc.u(i12, i13, RemoteBioParameters.X, "], target: [", sb);
                ny61.g(ly3.k(i17, i19, RemoteBioParameters.X, "]", sb));
                return bitmap;
            }
            z5 = z3;
            DownsampleStrategy.SampleSizeRounding a2 = downsampleStrategy.a(i8, i9, i17, i19);
            if (a2 == null) {
                ny61.g("Cannot round with null rounding");
                return bitmap;
            }
            float f2 = i8;
            float f3 = i9;
            int i20 = i8 / ((int) ((b * f2) + 0.5d));
            int i21 = i9 / ((int) ((b * f3) + 0.5d));
            DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
            int max = Math.max(1, Integer.highestOneBit(a2 == sampleSizeRounding ? Math.max(i20, i21) : Math.min(i20, i21)));
            if (a2 == sampleSizeRounding && max < 1.0f / b) {
                max <<= 1;
            }
            options.inSampleSize = max;
            if (d2 == ImageHeaderParser$ImageType.JPEG) {
                float min = Math.min(max, 8);
                floor = (int) Math.ceil(f2 / min);
                floor2 = (int) Math.ceil(f3 / min);
                int i22 = max / 8;
                if (i22 > 0) {
                    floor /= i22;
                    floor2 /= i22;
                }
            } else if (d2 == ImageHeaderParser$ImageType.PNG || d2 == ImageHeaderParser$ImageType.PNG_A) {
                float f4 = max;
                floor = (int) Math.floor(f2 / f4);
                floor2 = (int) Math.floor(f3 / f4);
            } else if (d2.isWebp()) {
                float f5 = max;
                floor = Math.round(f2 / f5);
                floor2 = Math.round(f3 / f5);
            } else if (i8 % max == 0 && i9 % max == 0) {
                floor = i8 / max;
                floor2 = i9 / max;
            } else {
                options.inJustDecodeBounds = true;
                c(r1sVar, options, w7mVar, b16Var);
                options.inJustDecodeBounds = false;
                int[] iArr2 = {options.outWidth, options.outHeight};
                floor = iArr2[0];
                floor2 = iArr2[1];
            }
            double b2 = downsampleStrategy.b(floor, floor2, i17, i19);
            options.inTargetDensity = (int) (((b2 / (r9 / r12)) * ((int) ((((int) Math.round((b2 <= 1.0d ? b2 : 1.0d / b2) * 2.147483647E9d)) * b2) + 0.5d))) + 0.5d);
            if (b2 > 1.0d) {
                b2 = 1.0d / b2;
            }
            int round = (int) Math.round(b2 * 2.147483647E9d);
            options.inDensity = round;
            int i23 = options.inTargetDensity;
            if (i23 <= 0 || round <= 0 || i23 == round) {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            } else {
                options.inScaled = true;
            }
            Log.isLoggable("Downsampler", 2);
            gVar = this;
            i6 = i12;
            i5 = i13;
        }
        boolean b3 = gVar.e.b(i17, i19, z4, z5);
        if (b3) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            z6 = false;
            options.inMutable = false;
        } else {
            z6 = false;
        }
        if (!b3) {
            if (decodeFormat != DecodeFormat.PREFER_ARGB_8888) {
                try {
                    z7 = r1sVar.d().hasAlpha();
                } catch (IOException unused) {
                    if (Log.isLoggable("Downsampler", 3)) {
                        Objects.toString(decodeFormat);
                    }
                    z7 = z6;
                }
                Bitmap.Config config2 = z7 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = config2;
                if (config2 == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                }
            } else {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
        }
        if (i6 < 0 || i5 < 0 || !z2) {
            int i24 = options.inTargetDensity;
            float f6 = (i24 <= 0 || (i7 = options.inDensity) <= 0 || i24 == i7) ? 1.0f : i24 / i7;
            float f7 = options.inSampleSize;
            int ceil = (int) Math.ceil(i6 / f7);
            int ceil2 = (int) Math.ceil(i5 / f7);
            int round2 = Math.round(ceil * f6);
            i19 = Math.round(ceil2 * f6);
            Log.isLoggable("Downsampler", 2);
            i17 = round2;
        }
        if (i17 > 0 && i19 > 0 && (config = options.inPreferredConfig) != Bitmap.Config.HARDWARE) {
            Bitmap.Config config3 = options.outConfig;
            if (config3 != null) {
                config = config3;
            }
            options.inBitmap = b16Var.d(i17, i19, config);
        }
        if (preferredColorSpace != null) {
            options.inPreferredColorSpace = ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        }
        Bitmap c3 = c(r1sVar, options, w7mVar, b16Var);
        w7mVar.l(b16Var, c3);
        if (Log.isLoggable("Downsampler", 2)) {
            d(c3);
            d(options.inBitmap);
            Thread.currentThread().getName();
            SystemClock.elapsedRealtimeNanos();
        }
        if (c3 == null) {
            return bitmap;
        }
        c3.setDensity(gVar.b.densityDpi);
        switch (i18) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                Matrix matrix = new Matrix();
                switch (i18) {
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        break;
                    case 3:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 6:
                        matrix.setRotate(90.0f);
                        break;
                    case 7:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 8:
                        matrix.setRotate(-90.0f);
                        break;
                }
                RectF rectF = new RectF(0.0f, 0.0f, c3.getWidth(), c3.getHeight());
                matrix.mapRect(rectF);
                Bitmap f8 = b16Var.f(Math.round(rectF.width()), Math.round(rectF.height()), c3.getConfig() != null ? c3.getConfig() : Bitmap.Config.ARGB_8888);
                matrix.postTranslate(-rectF.left, -rectF.top);
                f8.setHasAlpha(c3.hasAlpha());
                sw01.a(c3, f8, matrix);
                bitmap2 = f8;
                break;
            default:
                bitmap2 = c3;
                break;
        }
        if (c3.equals(bitmap2)) {
            return bitmap2;
        }
        b16Var.c(c3);
        return bitmap2;
    }
}
