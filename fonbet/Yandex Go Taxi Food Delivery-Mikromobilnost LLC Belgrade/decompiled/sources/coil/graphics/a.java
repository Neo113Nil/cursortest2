package coil.graphics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import androidx.exifinterface.media.a;
import coil.view.Scale;
import defpackage.amo;
import defpackage.bmo;
import defpackage.cmo;
import defpackage.f77;
import defpackage.hyg;
import defpackage.i06;
import defpackage.jci0;
import defpackage.jl40;
import defpackage.jlo;
import defpackage.m;
import defpackage.m810;
import defpackage.mga1;
import defpackage.muj0;
import defpackage.ny61;
import defpackage.onq0;
import defpackage.pnq0;
import defpackage.qg70;
import defpackage.sls;
import defpackage.w511;
import defpackage.wev;
import defpackage.wis0;
import defpackage.wp6;
import defpackage.xxg;
import defpackage.zev;
import defpackage.zxg;
import java.util.Set;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class a implements hyg {
    public final zev a;
    public final qg70 b;
    public final onq0 c;
    public final ExifOrientationPolicy d;

    public a(zev zevVar, qg70 qg70Var, pnq0 pnq0Var, ExifOrientationPolicy exifOrientationPolicy) {
        this.a = zevVar;
        this.b = qg70Var;
        this.c = pnq0Var;
        this.d = exifOrientationPolicy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        if (((kotlinx.coroutines.sync.b) r8).b(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.hyg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        BitmapFactoryDecoder$decode$1 bitmapFactoryDecoder$decode$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object obj;
        Throwable th;
        Object obj2;
        Object r;
        try {
            if (continuation instanceof BitmapFactoryDecoder$decode$1) {
                bitmapFactoryDecoder$decode$1 = (BitmapFactoryDecoder$decode$1) continuation;
                int i2 = bitmapFactoryDecoder$decode$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bitmapFactoryDecoder$decode$1.label = i2 - Integer.MIN_VALUE;
                    Object obj3 = bitmapFactoryDecoder$decode$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bitmapFactoryDecoder$decode$1.label;
                    if (i != 0) {
                        b.b(obj3);
                        bitmapFactoryDecoder$decode$1.L$0 = this;
                        obj = this.c;
                        bitmapFactoryDecoder$decode$1.L$1 = obj;
                        bitmapFactoryDecoder$decode$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj2 = (onq0) bitmapFactoryDecoder$decode$1.L$0;
                            try {
                                b.b(obj3);
                                xxg xxgVar = (xxg) obj3;
                                ((kotlinx.coroutines.sync.b) obj2).f();
                                return xxgVar;
                            } catch (Throwable th2) {
                                th = th2;
                                ((kotlinx.coroutines.sync.b) obj2).f();
                                throw th;
                            }
                        }
                        onq0 onq0Var = (onq0) bitmapFactoryDecoder$decode$1.L$1;
                        a aVar = (a) bitmapFactoryDecoder$decode$1.L$0;
                        b.b(obj3);
                        obj = onq0Var;
                        this = aVar;
                    }
                    sls slsVar = new sls() { // from class: coil.decode.BitmapFactoryDecoder$decode$2$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:160:0x0059, code lost:
                        
                            if (defpackage.cmo.a.contains(r9) != false) goto L15;
                         */
                        @Override // defpackage.sls
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke() {
                            jlo jloVar;
                            jci0 jci0Var;
                            Rect rect;
                            boolean z;
                            int i3;
                            boolean z2;
                            int i4;
                            int min;
                            double max;
                            Bitmap createBitmap;
                            a aVar2 = a.this;
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            qg70 qg70Var = aVar2.b;
                            zev zevVar = aVar2.a;
                            i06 i06Var = new i06(zevVar.source());
                            jci0 jci0Var2 = new jci0(i06Var);
                            int i5 = 1;
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeStream(new wp6(jci0Var2.peek(), i5), null, options);
                            Exception exc = (Exception) i06Var.c;
                            if (exc != null) {
                                throw exc;
                            }
                            options.inJustDecodeBounds = false;
                            Paint paint = amo.a;
                            String str = options.outMimeType;
                            ExifOrientationPolicy exifOrientationPolicy = aVar2.d;
                            Set set = cmo.a;
                            int i6 = bmo.a[exifOrientationPolicy.ordinal()];
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    if (i6 != 3) {
                                        w511.b();
                                        return null;
                                    }
                                    a aVar3 = new a(new f77(new wp6(jci0Var2.peek(), i5)));
                                    int d = aVar3.d(1, "Orientation");
                                    jloVar = new jlo(d == 2 || d == 7 || d == 4 || d == 5, aVar3.n());
                                }
                                jloVar = jlo.c;
                            } else {
                                if (str != null) {
                                }
                                jloVar = jlo.c;
                            }
                            int i7 = jloVar.b;
                            boolean z3 = jloVar.a;
                            Exception exc2 = (Exception) i06Var.c;
                            if (exc2 != null) {
                                throw exc2;
                            }
                            options.inMutable = false;
                            ColorSpace colorSpace = qg70Var.c;
                            Context context = qg70Var.a;
                            wis0 wis0Var = qg70Var.d;
                            if (colorSpace != null) {
                                options.inPreferredColorSpace = colorSpace;
                            }
                            options.inPremultiplied = qg70Var.h;
                            Bitmap.Config config = qg70Var.b;
                            if ((z3 || i7 > 0) && (config == null || mga1.e(config))) {
                                config = Bitmap.Config.ARGB_8888;
                            }
                            if (qg70Var.g && config == Bitmap.Config.ARGB_8888 && jl40.l(options.outMimeType, "image/jpeg")) {
                                config = Bitmap.Config.RGB_565;
                            }
                            Bitmap.Config config2 = options.outConfig;
                            Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                            if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                                config = config3;
                            }
                            options.inPreferredConfig = config;
                            wev c = zevVar.c();
                            if ((c instanceof muj0) && jl40.l(wis0Var, wis0.c)) {
                                options.inSampleSize = 1;
                                options.inScaled = true;
                                options.inDensity = ((muj0) c).c;
                                options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                                jci0Var = jci0Var2;
                                i3 = 1;
                                rect = null;
                                z2 = false;
                                z = z3;
                            } else {
                                int i8 = options.outWidth;
                                if (i8 > 0) {
                                    int i9 = options.outHeight;
                                    if (i9 <= 0) {
                                        jci0Var = jci0Var2;
                                        i3 = 1;
                                        rect = null;
                                        z = z3;
                                    } else {
                                        if (i7 == 90 || i7 == 270) {
                                            rect = null;
                                            i4 = i9;
                                        } else {
                                            rect = null;
                                            i4 = i8;
                                        }
                                        if (i7 != 90 && i7 != 270) {
                                            i8 = i9;
                                        }
                                        Scale scale = qg70Var.e;
                                        wis0 wis0Var2 = wis0.c;
                                        int e = jl40.l(wis0Var, wis0Var2) ? i4 : m.e(wis0Var.a, scale);
                                        int e2 = jl40.l(wis0Var, wis0Var2) ? i8 : m.e(wis0Var.b, scale);
                                        int highestOneBit = Integer.highestOneBit(i4 / e);
                                        int highestOneBit2 = Integer.highestOneBit(i8 / e2);
                                        int[] iArr = zxg.a;
                                        z = z3;
                                        int i10 = iArr[scale.ordinal()];
                                        if (i10 == 1) {
                                            min = Math.min(highestOneBit, highestOneBit2);
                                        } else {
                                            if (i10 != 2) {
                                                w511.b();
                                                return rect;
                                            }
                                            min = Math.max(highestOneBit, highestOneBit2);
                                        }
                                        if (min < 1) {
                                            min = 1;
                                        }
                                        options.inSampleSize = min;
                                        double d2 = i4;
                                        double d3 = min;
                                        double d4 = i8 / d3;
                                        double d5 = e2;
                                        jci0Var = jci0Var2;
                                        double d6 = e / (d2 / d3);
                                        double d7 = d5 / d4;
                                        int i11 = iArr[scale.ordinal()];
                                        if (i11 == 1) {
                                            max = Math.max(d6, d7);
                                        } else {
                                            if (i11 != 2) {
                                                w511.b();
                                                return rect;
                                            }
                                            max = Math.min(d6, d7);
                                        }
                                        if (qg70Var.f && max > 1.0d) {
                                            max = 1.0d;
                                        }
                                        boolean z4 = max == 1.0d;
                                        options.inScaled = !z4;
                                        if (!z4) {
                                            if (max > 1.0d) {
                                                options.inDensity = m810.a(2.147483647E9d / max);
                                                options.inTargetDensity = Integer.MAX_VALUE;
                                            } else {
                                                options.inDensity = Integer.MAX_VALUE;
                                                options.inTargetDensity = m810.a(2.147483647E9d * max);
                                            }
                                        }
                                        z2 = false;
                                        i3 = 1;
                                    }
                                } else {
                                    jci0Var = jci0Var2;
                                    rect = null;
                                    z = z3;
                                    i3 = 1;
                                }
                                options.inSampleSize = i3;
                                z2 = false;
                                options.inScaled = false;
                            }
                            try {
                                Bitmap decodeStream = BitmapFactory.decodeStream(new wp6(jci0Var, i3), rect, options);
                                jci0Var.close();
                                Exception exc3 = (Exception) i06Var.c;
                                if (exc3 != null) {
                                    throw exc3;
                                }
                                if (decodeStream == null) {
                                    ny61.r("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                                    return null;
                                }
                                decodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                                if (z || i7 > 0) {
                                    Matrix matrix = new Matrix();
                                    float width = decodeStream.getWidth() / 2.0f;
                                    float height = decodeStream.getHeight() / 2.0f;
                                    if (z) {
                                        matrix.postScale(-1.0f, 1.0f, width, height);
                                    }
                                    if (i7 > 0) {
                                        matrix.postRotate(i7, width, height);
                                    }
                                    RectF rectF = new RectF(0.0f, 0.0f, decodeStream.getWidth(), decodeStream.getHeight());
                                    matrix.mapRect(rectF);
                                    float f = rectF.left;
                                    if (f != 0.0f || rectF.top != 0.0f) {
                                        matrix.postTranslate(-f, -rectF.top);
                                    }
                                    if (i7 == 90 || i7 == 270) {
                                        int height2 = decodeStream.getHeight();
                                        int width2 = decodeStream.getWidth();
                                        Bitmap.Config config4 = decodeStream.getConfig();
                                        if (config4 == null) {
                                            config4 = Bitmap.Config.ARGB_8888;
                                        }
                                        createBitmap = Bitmap.createBitmap(height2, width2, config4);
                                    } else {
                                        int width3 = decodeStream.getWidth();
                                        int height3 = decodeStream.getHeight();
                                        Bitmap.Config config5 = decodeStream.getConfig();
                                        if (config5 == null) {
                                            config5 = Bitmap.Config.ARGB_8888;
                                        }
                                        createBitmap = Bitmap.createBitmap(width3, height3, config5);
                                    }
                                    new Canvas(createBitmap).drawBitmap(decodeStream, matrix, amo.a);
                                    decodeStream.recycle();
                                    decodeStream = createBitmap;
                                }
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), decodeStream);
                                if (options.inSampleSize > 1 || options.inScaled) {
                                    z2 = true;
                                }
                                return new xxg(bitmapDrawable, z2);
                            } finally {
                            }
                        }
                    };
                    bitmapFactoryDecoder$decode$1.L$0 = obj;
                    bitmapFactoryDecoder$decode$1.L$1 = null;
                    bitmapFactoryDecoder$decode$1.label = 2;
                    r = kotlinx.coroutines.a.r(slsVar, bitmapFactoryDecoder$decode$1);
                    if (r != coroutineSingletons) {
                        Object obj4 = obj;
                        obj3 = r;
                        obj2 = obj4;
                        xxg xxgVar2 = (xxg) obj3;
                        ((kotlinx.coroutines.sync.b) obj2).f();
                        return xxgVar2;
                    }
                    return coroutineSingletons;
                }
            }
            sls slsVar2 = new sls() { // from class: coil.decode.BitmapFactoryDecoder$decode$2$1
                {
                    super(0);
                }

                /* JADX WARN: Code restructure failed: missing block: B:160:0x0059, code lost:
                
                    if (defpackage.cmo.a.contains(r9) != false) goto L15;
                 */
                @Override // defpackage.sls
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    jlo jloVar;
                    jci0 jci0Var;
                    Rect rect;
                    boolean z;
                    int i3;
                    boolean z2;
                    int i4;
                    int min;
                    double max;
                    Bitmap createBitmap;
                    a aVar2 = a.this;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    qg70 qg70Var = aVar2.b;
                    zev zevVar = aVar2.a;
                    i06 i06Var = new i06(zevVar.source());
                    jci0 jci0Var2 = new jci0(i06Var);
                    int i5 = 1;
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(new wp6(jci0Var2.peek(), i5), null, options);
                    Exception exc = (Exception) i06Var.c;
                    if (exc != null) {
                        throw exc;
                    }
                    options.inJustDecodeBounds = false;
                    Paint paint = amo.a;
                    String str = options.outMimeType;
                    ExifOrientationPolicy exifOrientationPolicy = aVar2.d;
                    Set set = cmo.a;
                    int i6 = bmo.a[exifOrientationPolicy.ordinal()];
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                w511.b();
                                return null;
                            }
                            a aVar3 = new a(new f77(new wp6(jci0Var2.peek(), i5)));
                            int d = aVar3.d(1, "Orientation");
                            jloVar = new jlo(d == 2 || d == 7 || d == 4 || d == 5, aVar3.n());
                        }
                        jloVar = jlo.c;
                    } else {
                        if (str != null) {
                        }
                        jloVar = jlo.c;
                    }
                    int i7 = jloVar.b;
                    boolean z3 = jloVar.a;
                    Exception exc2 = (Exception) i06Var.c;
                    if (exc2 != null) {
                        throw exc2;
                    }
                    options.inMutable = false;
                    ColorSpace colorSpace = qg70Var.c;
                    Context context = qg70Var.a;
                    wis0 wis0Var = qg70Var.d;
                    if (colorSpace != null) {
                        options.inPreferredColorSpace = colorSpace;
                    }
                    options.inPremultiplied = qg70Var.h;
                    Bitmap.Config config = qg70Var.b;
                    if ((z3 || i7 > 0) && (config == null || mga1.e(config))) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    if (qg70Var.g && config == Bitmap.Config.ARGB_8888 && jl40.l(options.outMimeType, "image/jpeg")) {
                        config = Bitmap.Config.RGB_565;
                    }
                    Bitmap.Config config2 = options.outConfig;
                    Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                    if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                        config = config3;
                    }
                    options.inPreferredConfig = config;
                    wev c = zevVar.c();
                    if ((c instanceof muj0) && jl40.l(wis0Var, wis0.c)) {
                        options.inSampleSize = 1;
                        options.inScaled = true;
                        options.inDensity = ((muj0) c).c;
                        options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                        jci0Var = jci0Var2;
                        i3 = 1;
                        rect = null;
                        z2 = false;
                        z = z3;
                    } else {
                        int i8 = options.outWidth;
                        if (i8 > 0) {
                            int i9 = options.outHeight;
                            if (i9 <= 0) {
                                jci0Var = jci0Var2;
                                i3 = 1;
                                rect = null;
                                z = z3;
                            } else {
                                if (i7 == 90 || i7 == 270) {
                                    rect = null;
                                    i4 = i9;
                                } else {
                                    rect = null;
                                    i4 = i8;
                                }
                                if (i7 != 90 && i7 != 270) {
                                    i8 = i9;
                                }
                                Scale scale = qg70Var.e;
                                wis0 wis0Var2 = wis0.c;
                                int e = jl40.l(wis0Var, wis0Var2) ? i4 : m.e(wis0Var.a, scale);
                                int e2 = jl40.l(wis0Var, wis0Var2) ? i8 : m.e(wis0Var.b, scale);
                                int highestOneBit = Integer.highestOneBit(i4 / e);
                                int highestOneBit2 = Integer.highestOneBit(i8 / e2);
                                int[] iArr = zxg.a;
                                z = z3;
                                int i10 = iArr[scale.ordinal()];
                                if (i10 == 1) {
                                    min = Math.min(highestOneBit, highestOneBit2);
                                } else {
                                    if (i10 != 2) {
                                        w511.b();
                                        return rect;
                                    }
                                    min = Math.max(highestOneBit, highestOneBit2);
                                }
                                if (min < 1) {
                                    min = 1;
                                }
                                options.inSampleSize = min;
                                double d2 = i4;
                                double d3 = min;
                                double d4 = i8 / d3;
                                double d5 = e2;
                                jci0Var = jci0Var2;
                                double d6 = e / (d2 / d3);
                                double d7 = d5 / d4;
                                int i11 = iArr[scale.ordinal()];
                                if (i11 == 1) {
                                    max = Math.max(d6, d7);
                                } else {
                                    if (i11 != 2) {
                                        w511.b();
                                        return rect;
                                    }
                                    max = Math.min(d6, d7);
                                }
                                if (qg70Var.f && max > 1.0d) {
                                    max = 1.0d;
                                }
                                boolean z4 = max == 1.0d;
                                options.inScaled = !z4;
                                if (!z4) {
                                    if (max > 1.0d) {
                                        options.inDensity = m810.a(2.147483647E9d / max);
                                        options.inTargetDensity = Integer.MAX_VALUE;
                                    } else {
                                        options.inDensity = Integer.MAX_VALUE;
                                        options.inTargetDensity = m810.a(2.147483647E9d * max);
                                    }
                                }
                                z2 = false;
                                i3 = 1;
                            }
                        } else {
                            jci0Var = jci0Var2;
                            rect = null;
                            z = z3;
                            i3 = 1;
                        }
                        options.inSampleSize = i3;
                        z2 = false;
                        options.inScaled = false;
                    }
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(new wp6(jci0Var, i3), rect, options);
                        jci0Var.close();
                        Exception exc3 = (Exception) i06Var.c;
                        if (exc3 != null) {
                            throw exc3;
                        }
                        if (decodeStream == null) {
                            ny61.r("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                            return null;
                        }
                        decodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                        if (z || i7 > 0) {
                            Matrix matrix = new Matrix();
                            float width = decodeStream.getWidth() / 2.0f;
                            float height = decodeStream.getHeight() / 2.0f;
                            if (z) {
                                matrix.postScale(-1.0f, 1.0f, width, height);
                            }
                            if (i7 > 0) {
                                matrix.postRotate(i7, width, height);
                            }
                            RectF rectF = new RectF(0.0f, 0.0f, decodeStream.getWidth(), decodeStream.getHeight());
                            matrix.mapRect(rectF);
                            float f = rectF.left;
                            if (f != 0.0f || rectF.top != 0.0f) {
                                matrix.postTranslate(-f, -rectF.top);
                            }
                            if (i7 == 90 || i7 == 270) {
                                int height2 = decodeStream.getHeight();
                                int width2 = decodeStream.getWidth();
                                Bitmap.Config config4 = decodeStream.getConfig();
                                if (config4 == null) {
                                    config4 = Bitmap.Config.ARGB_8888;
                                }
                                createBitmap = Bitmap.createBitmap(height2, width2, config4);
                            } else {
                                int width3 = decodeStream.getWidth();
                                int height3 = decodeStream.getHeight();
                                Bitmap.Config config5 = decodeStream.getConfig();
                                if (config5 == null) {
                                    config5 = Bitmap.Config.ARGB_8888;
                                }
                                createBitmap = Bitmap.createBitmap(width3, height3, config5);
                            }
                            new Canvas(createBitmap).drawBitmap(decodeStream, matrix, amo.a);
                            decodeStream.recycle();
                            decodeStream = createBitmap;
                        }
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), decodeStream);
                        if (options.inSampleSize > 1 || options.inScaled) {
                            z2 = true;
                        }
                        return new xxg(bitmapDrawable, z2);
                    } finally {
                    }
                }
            };
            bitmapFactoryDecoder$decode$1.L$0 = obj;
            bitmapFactoryDecoder$decode$1.L$1 = null;
            bitmapFactoryDecoder$decode$1.label = 2;
            r = kotlinx.coroutines.a.r(slsVar2, bitmapFactoryDecoder$decode$1);
            if (r != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            Object obj5 = obj;
            th = th3;
            obj2 = obj5;
            ((kotlinx.coroutines.sync.b) obj2).f();
            throw th;
        }
        bitmapFactoryDecoder$decode$1 = new BitmapFactoryDecoder$decode$1(this, (ContinuationImpl) continuation);
        Object obj32 = bitmapFactoryDecoder$decode$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bitmapFactoryDecoder$decode$1.label;
        if (i != 0) {
        }
    }
}
