package coil.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Size;
import coil.drawable.ScaleDrawable;
import coil.view.Scale;
import defpackage.d;
import defpackage.dd90;
import defpackage.g6u;
import defpackage.g93;
import defpackage.hyg;
import defpackage.jci0;
import defpackage.jl40;
import defpackage.kgt;
import defpackage.l76;
import defpackage.m810;
import defpackage.muj0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.oq90;
import defpackage.qes;
import defpackage.qg70;
import defpackage.qq6;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.uyj;
import defpackage.wev;
import defpackage.wis0;
import defpackage.xxg;
import defpackage.zev;
import defpackage.zge;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.a;

/* loaded from: classes10.dex */
public final class b implements hyg {
    public final zev a;
    public final qg70 b;
    public final boolean c;

    public b(zev zevVar, qg70 qg70Var, boolean z) {
        this.a = zevVar;
        this.b = qg70Var;
        this.c = z;
    }

    public static final ImageDecoder.Source b(b bVar, zev zevVar) {
        ImageDecoder.Source createSource;
        qg70 qg70Var = bVar.b;
        oq90 K0 = zevVar.K0();
        if (K0 != null) {
            return ImageDecoder.createSource(K0.toFile());
        }
        wev c = zevVar.c();
        if (c instanceof g93) {
            return ImageDecoder.createSource(qg70Var.a.getAssets(), ((g93) c).a);
        }
        if (c instanceof zge) {
            return ImageDecoder.createSource(qg70Var.a.getContentResolver(), ((zge) c).a);
        }
        if (c instanceof muj0) {
            muj0 muj0Var = (muj0) c;
            if (jl40.l(muj0Var.a, qg70Var.a.getPackageName())) {
                return ImageDecoder.createSource(qg70Var.a.getResources(), muj0Var.b);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            return i == 30 ? ImageDecoder.createSource(ByteBuffer.wrap(zevVar.source().p0())) : ImageDecoder.createSource(zevVar.a().toFile());
        }
        createSource = ImageDecoder.createSource(zevVar.source().p0());
        return createSource;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r2 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.hyg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        ImageDecoderDecoder$decode$1 imageDecoderDecoder$decode$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        final Ref$BooleanRef ref$BooleanRef;
        Object r;
        Object c;
        Ref$BooleanRef ref$BooleanRef2;
        if (continuation instanceof ImageDecoderDecoder$decode$1) {
            imageDecoderDecoder$decode$1 = (ImageDecoderDecoder$decode$1) continuation;
            int i2 = imageDecoderDecoder$decode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imageDecoderDecoder$decode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = imageDecoderDecoder$decode$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = imageDecoderDecoder$decode$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ref$BooleanRef = new Ref$BooleanRef();
                    sls slsVar = new sls() { // from class: coil.decode.ImageDecoderDecoder$decode$drawable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.sls
                        public final Object invoke() {
                            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            b bVar = b.this;
                            zev zevVar = bVar.a;
                            if (bVar.c) {
                                qq6 source = zevVar.source();
                                if (source.Q(0L, kgt.b) || source.Q(0L, kgt.a)) {
                                    zevVar = c.a(new jci0(new qes(zevVar.source())), bVar.b.a);
                                }
                            }
                            try {
                                ImageDecoder.Source b = b.b(b.this, zevVar);
                                final b bVar2 = b.this;
                                final Ref$BooleanRef ref$BooleanRef3 = ref$BooleanRef;
                                return ImageDecoder.decodeDrawable(b, new ImageDecoder.OnHeaderDecodedListener() { // from class: coil.decode.ImageDecoderDecoder$decode$drawable$1$invoke$$inlined$decodeDrawable$1
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                                    public final void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                                        Ref$ObjectRef.this.element = imageDecoder;
                                        Size size = imageInfo.getSize();
                                        int width = size.getWidth();
                                        int height = size.getHeight();
                                        qg70 qg70Var = bVar2.b;
                                        wis0 wis0Var = qg70Var.d;
                                        Scale scale = qg70Var.e;
                                        wis0 wis0Var2 = wis0.c;
                                        int a = jl40.l(wis0Var, wis0Var2) ? width : d.a(wis0Var.a, scale);
                                        qg70 qg70Var2 = bVar2.b;
                                        wis0 wis0Var3 = qg70Var2.d;
                                        int a2 = jl40.l(wis0Var3, wis0Var2) ? height : d.a(wis0Var3.b, qg70Var2.e);
                                        if (width > 0 && height > 0 && (width != a || height != a2)) {
                                            double i3 = l76.i(width, height, a, a2, bVar2.b.e);
                                            Ref$BooleanRef ref$BooleanRef4 = ref$BooleanRef3;
                                            boolean z = i3 < 1.0d;
                                            ref$BooleanRef4.element = z;
                                            if (z || !bVar2.b.f) {
                                                imageDecoder.setTargetSize(m810.a(width * i3), m810.a(i3 * height));
                                            }
                                        }
                                        qg70 qg70Var3 = bVar2.b;
                                        imageDecoder.setAllocator(qg70Var3.b == Bitmap.Config.HARDWARE ? 3 : 1);
                                        imageDecoder.setMemorySizePolicy(!qg70Var3.g ? 1 : 0);
                                        ColorSpace colorSpace = qg70Var3.c;
                                        if (colorSpace != null) {
                                            imageDecoder.setTargetColorSpace(colorSpace);
                                        }
                                        imageDecoder.setUnpremultipliedRequired(!qg70Var3.h);
                                        if (qg70Var3.l.b("coil#animated_transformation") == null) {
                                            imageDecoder.setPostProcessor(null);
                                        } else {
                                            ny61.u();
                                        }
                                    }
                                });
                            } finally {
                                ImageDecoder imageDecoder = (ImageDecoder) ref$ObjectRef.element;
                                if (imageDecoder != null) {
                                    imageDecoder.close();
                                }
                                zevVar.close();
                            }
                        }
                    };
                    imageDecoderDecoder$decode$1.L$0 = this;
                    imageDecoderDecoder$decode$1.L$1 = ref$BooleanRef;
                    imageDecoderDecoder$decode$1.label = 1;
                    r = a.r(slsVar, imageDecoderDecoder$decode$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ref$BooleanRef2 = (Ref$BooleanRef) imageDecoderDecoder$decode$1.L$0;
                        kotlin.b.b(obj);
                        return new xxg((Drawable) obj, ref$BooleanRef2.element);
                    }
                    Ref$BooleanRef ref$BooleanRef3 = (Ref$BooleanRef) imageDecoderDecoder$decode$1.L$1;
                    b bVar = (b) imageDecoderDecoder$decode$1.L$0;
                    kotlin.b.b(obj);
                    ref$BooleanRef = ref$BooleanRef3;
                    this = bVar;
                    r = obj;
                }
                imageDecoderDecoder$decode$1.L$0 = ref$BooleanRef;
                imageDecoderDecoder$decode$1.L$1 = null;
                imageDecoderDecoder$decode$1.label = 2;
                c = this.c((Drawable) r, imageDecoderDecoder$decode$1);
                if (c != coroutineSingletons) {
                    Ref$BooleanRef ref$BooleanRef4 = ref$BooleanRef;
                    obj = c;
                    ref$BooleanRef2 = ref$BooleanRef4;
                    return new xxg((Drawable) obj, ref$BooleanRef2.element);
                }
                return coroutineSingletons;
            }
        }
        imageDecoderDecoder$decode$1 = new ImageDecoderDecoder$decode$1(this, (ContinuationImpl) continuation);
        Object obj2 = imageDecoderDecoder$decode$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = imageDecoderDecoder$decode$1.label;
        if (i != 0) {
        }
        imageDecoderDecoder$decode$1.L$0 = ref$BooleanRef;
        imageDecoderDecoder$decode$1.L$1 = null;
        imageDecoderDecoder$decode$1.label = 2;
        c = this.c((Drawable) r, imageDecoderDecoder$decode$1);
        if (c != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Drawable drawable, ContinuationImpl continuationImpl) {
        ImageDecoderDecoder$wrapDrawable$1 imageDecoderDecoder$wrapDrawable$1;
        int i;
        if (continuationImpl instanceof ImageDecoderDecoder$wrapDrawable$1) {
            imageDecoderDecoder$wrapDrawable$1 = (ImageDecoderDecoder$wrapDrawable$1) continuationImpl;
            int i2 = imageDecoderDecoder$wrapDrawable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imageDecoderDecoder$wrapDrawable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = imageDecoderDecoder$wrapDrawable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = imageDecoderDecoder$wrapDrawable$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(drawable instanceof AnimatedImageDrawable)) {
                        return drawable;
                    }
                    AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) drawable;
                    qg70 qg70Var = this.b;
                    dd90 dd90Var = qg70Var.l;
                    dd90 dd90Var2 = qg70Var.l;
                    Integer num = (Integer) dd90Var.b("coil#repeat_count");
                    animatedImageDrawable.setRepeatCount(num != null ? num.intValue() : -1);
                    sls slsVar = (sls) dd90Var2.b("coil#animation_start_callback");
                    sls slsVar2 = (sls) dd90Var2.b("coil#animation_end_callback");
                    if (slsVar != null || slsVar2 != null) {
                        sjh sjhVar = uyj.a;
                        g6u g6uVar = o400.a.x;
                        ImageDecoderDecoder$wrapDrawable$2 imageDecoderDecoder$wrapDrawable$2 = new ImageDecoderDecoder$wrapDrawable$2(drawable, slsVar, slsVar2, null);
                        imageDecoderDecoder$wrapDrawable$1.L$0 = this;
                        imageDecoderDecoder$wrapDrawable$1.L$1 = drawable;
                        imageDecoderDecoder$wrapDrawable$1.label = 1;
                        if (tje.k0(g6uVar, imageDecoderDecoder$wrapDrawable$2, imageDecoderDecoder$wrapDrawable$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    drawable = (Drawable) imageDecoderDecoder$wrapDrawable$1.L$1;
                    this = (b) imageDecoderDecoder$wrapDrawable$1.L$0;
                    kotlin.b.b(obj);
                }
                return new ScaleDrawable(drawable, this.b.e);
            }
        }
        imageDecoderDecoder$wrapDrawable$1 = new ImageDecoderDecoder$wrapDrawable$1(this, continuationImpl);
        Object obj2 = imageDecoderDecoder$wrapDrawable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = imageDecoderDecoder$wrapDrawable$1.label;
        if (i != 0) {
        }
        return new ScaleDrawable(drawable, this.b.e);
    }
}
