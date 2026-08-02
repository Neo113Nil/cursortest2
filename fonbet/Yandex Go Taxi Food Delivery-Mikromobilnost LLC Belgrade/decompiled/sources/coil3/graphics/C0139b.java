package coil3.graphics;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Size;
import coil3.size.Precision;
import coil3.size.Scale;
import defpackage.gwk0;
import defpackage.i6u0;
import defpackage.iyg;
import defpackage.kev;
import defpackage.lev;
import defpackage.lg70;
import defpackage.m810;
import defpackage.ny61;
import defpackage.onq0;
import defpackage.s8o;
import defpackage.sb2;
import defpackage.uh;
import defpackage.w06;
import defpackage.wxg;
import defpackage.xis0;
import defpackage.y5e;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* renamed from: coil3.decode.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139b implements iyg {
    public final ImageDecoder.Source a;
    public final AutoCloseable b;
    public final lg70 c;
    public final onq0 d;

    public C0139b(ImageDecoder.Source source, AutoCloseable autoCloseable, lg70 lg70Var, onq0 onq0Var) {
        this.a = source;
        this.b = autoCloseable;
        this.c = lg70Var;
        this.d = onq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.iyg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        StaticImageDecoder$decode$1 staticImageDecoder$decode$1;
        int i;
        Object obj;
        try {
            try {
                if (continuationImpl instanceof StaticImageDecoder$decode$1) {
                    staticImageDecoder$decode$1 = (StaticImageDecoder$decode$1) continuationImpl;
                    int i2 = staticImageDecoder$decode$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        staticImageDecoder$decode$1.label = i2 - Integer.MIN_VALUE;
                        Object obj2 = staticImageDecoder$decode$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = staticImageDecoder$decode$1.label;
                        if (i != 0) {
                            b.b(obj2);
                            Object obj3 = this.d;
                            staticImageDecoder$decode$1.L$0 = obj3;
                            staticImageDecoder$decode$1.label = 1;
                            if (((kotlinx.coroutines.sync.b) obj3).b(staticImageDecoder$decode$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            obj = obj3;
                        } else {
                            if (i != 1) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = (onq0) staticImageDecoder$decode$1.L$0;
                            b.b(obj2);
                        }
                        AutoCloseable autoCloseable = this.b;
                        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        wxg wxgVar = new wxg(new w06(ImageDecoder.decodeBitmap(this.a, new ImageDecoder.OnHeaderDecodedListener() { // from class: coil3.decode.StaticImageDecoder$decode$lambda$0$0$$inlined$decodeBitmap$1
                            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                                Size size = imageInfo.getSize();
                                int width = size.getWidth();
                                int height = size.getHeight();
                                lg70 lg70Var = C0139b.this.c;
                                xis0 xis0Var = lg70Var.b;
                                Scale scale = lg70Var.c;
                                uh uhVar = kev.b;
                                long l = y5e.l(width, height, xis0Var, scale, (xis0) s8o.p(lg70Var, uhVar));
                                int i3 = (int) (l >> 32);
                                int i4 = (int) (l & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                                if (width > 0 && height > 0 && (width != i3 || height != i4)) {
                                    lg70 lg70Var2 = C0139b.this.c;
                                    double m = y5e.m(width, height, i3, i4, lg70Var2.c, (xis0) s8o.p(lg70Var2, uhVar));
                                    Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                                    boolean z = m < 1.0d;
                                    ref$BooleanRef2.element = z;
                                    if (z || C0139b.this.c.d == Precision.EXACT) {
                                        imageDecoder.setTargetSize(m810.a(width * m), m810.a(m * height));
                                    }
                                }
                                C0139b c0139b = C0139b.this;
                                c0139b.getClass();
                                imageDecoder.setOnPartialImageListener(new i6u0());
                                lg70 lg70Var3 = c0139b.c;
                                imageDecoder.setAllocator(sb2.x(lev.a(lg70Var3)) ? 3 : 1);
                                imageDecoder.setMemorySizePolicy(!((Boolean) s8o.p(lg70Var3, lev.f)).booleanValue() ? 1 : 0);
                                uh uhVar2 = lev.b;
                                if (((ColorSpace) s8o.p(lg70Var3, uhVar2)) != null) {
                                    imageDecoder.setTargetColorSpace((ColorSpace) s8o.p(lg70Var3, uhVar2));
                                }
                                imageDecoder.setUnpremultipliedRequired(!((Boolean) s8o.p(lg70Var3, lev.c)).booleanValue());
                            }
                        })), ref$BooleanRef.element);
                        gwk0.m(autoCloseable, null);
                        return wxgVar;
                    }
                }
                final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                wxg wxgVar2 = new wxg(new w06(ImageDecoder.decodeBitmap(this.a, new ImageDecoder.OnHeaderDecodedListener() { // from class: coil3.decode.StaticImageDecoder$decode$lambda$0$0$$inlined$decodeBitmap$1
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        Size size = imageInfo.getSize();
                        int width = size.getWidth();
                        int height = size.getHeight();
                        lg70 lg70Var = C0139b.this.c;
                        xis0 xis0Var = lg70Var.b;
                        Scale scale = lg70Var.c;
                        uh uhVar = kev.b;
                        long l = y5e.l(width, height, xis0Var, scale, (xis0) s8o.p(lg70Var, uhVar));
                        int i3 = (int) (l >> 32);
                        int i4 = (int) (l & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                        if (width > 0 && height > 0 && (width != i3 || height != i4)) {
                            lg70 lg70Var2 = C0139b.this.c;
                            double m = y5e.m(width, height, i3, i4, lg70Var2.c, (xis0) s8o.p(lg70Var2, uhVar));
                            Ref$BooleanRef ref$BooleanRef22 = ref$BooleanRef2;
                            boolean z = m < 1.0d;
                            ref$BooleanRef22.element = z;
                            if (z || C0139b.this.c.d == Precision.EXACT) {
                                imageDecoder.setTargetSize(m810.a(width * m), m810.a(m * height));
                            }
                        }
                        C0139b c0139b = C0139b.this;
                        c0139b.getClass();
                        imageDecoder.setOnPartialImageListener(new i6u0());
                        lg70 lg70Var3 = c0139b.c;
                        imageDecoder.setAllocator(sb2.x(lev.a(lg70Var3)) ? 3 : 1);
                        imageDecoder.setMemorySizePolicy(!((Boolean) s8o.p(lg70Var3, lev.f)).booleanValue() ? 1 : 0);
                        uh uhVar2 = lev.b;
                        if (((ColorSpace) s8o.p(lg70Var3, uhVar2)) != null) {
                            imageDecoder.setTargetColorSpace((ColorSpace) s8o.p(lg70Var3, uhVar2));
                        }
                        imageDecoder.setUnpremultipliedRequired(!((Boolean) s8o.p(lg70Var3, lev.c)).booleanValue());
                    }
                })), ref$BooleanRef2.element);
                gwk0.m(autoCloseable, null);
                return wxgVar2;
            } finally {
            }
            AutoCloseable autoCloseable2 = this.b;
        } finally {
            ((kotlinx.coroutines.sync.b) obj).f();
        }
        staticImageDecoder$decode$1 = new StaticImageDecoder$decode$1(this, continuationImpl);
        Object obj22 = staticImageDecoder$decode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = staticImageDecoder$decode$1.label;
        if (i != 0) {
        }
    }
}
