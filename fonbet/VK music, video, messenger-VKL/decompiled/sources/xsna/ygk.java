package xsna;

import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.impl.domain.model.CropFitContainerMode;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CropEditorScreen.kt */
/* loaded from: classes4.dex */
public final class ygk {
    public final CropFitContainerMode a;
    public final PostingPreviewRatio b;
    public final ImageCropArea c;
    public final ImageLink d;
    public final izs<ofk, s3q0> e;
    public final boolean f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;
    public final wh50 s;
    public final wh50 t;
    public final wh50 u;
    public final wh50 v;
    public final wh50 w;
    public final long x;
    public long y;
    public vtu z;

    /* JADX WARN: Multi-variable type inference failed */
    public ygk(CropFitContainerMode cropFitContainerMode, PostingPreviewRatio postingPreviewRatio, ImageCropArea imageCropArea, ImageLink imageLink, izs<? super ofk, s3q0> izsVar, boolean z) {
        this.a = cropFitContainerMode;
        this.b = postingPreviewRatio;
        this.c = imageCropArea;
        this.d = imageLink;
        this.e = izsVar;
        this.f = z;
        Boolean bool = Boolean.TRUE;
        this.g = androidx.compose.runtime.k.b(bool);
        this.h = androidx.compose.runtime.k.b(bool);
        Boolean bool2 = Boolean.FALSE;
        this.i = androidx.compose.runtime.k.b(bool2);
        this.j = androidx.compose.runtime.k.b(bool2);
        this.k = androidx.compose.runtime.k.b(-1L);
        this.l = androidx.compose.runtime.k.b(qf2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.m = androidx.compose.runtime.k.b(null);
        this.n = androidx.compose.runtime.k.b(null);
        this.o = androidx.compose.runtime.k.b(null);
        this.p = androidx.compose.runtime.k.b(null);
        this.q = androidx.compose.runtime.k.b(new zhf0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.r = androidx.compose.runtime.k.b(new qv70(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        Float valueOf = Float.valueOf(1.0f);
        this.s = androidx.compose.runtime.k.b(valueOf);
        this.t = androidx.compose.runtime.k.b(valueOf);
        this.u = androidx.compose.runtime.k.b(valueOf);
        this.v = androidx.compose.runtime.k.b(new ov70(0L));
        this.w = androidx.compose.runtime.k.b(cropFitContainerMode);
        this.x = 200L;
        this.y = 0L;
    }

    public final void a(PostingPreviewRatio postingPreviewRatio, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-959716267);
        if ((i & 6) == 0) {
            i2 = (M.J(postingPreviewRatio) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-959716267, i2, -1, "com.vk.newsfeed.posting.crop_editor.presentation.base.view.CropEditorScreenState.Init (CropEditorScreen.kt:562)");
            }
            float I0 = ((azl) M.r(uvi.h)).I0(16);
            this.y = (Float.floatToRawIntBits(jcr.i(I0, w65.d(postingPreviewRatio))) & 4294967295L) | (Float.floatToRawIntBits(I0) << 32);
            this.z = (vtu) M.r(uvi.l);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ks3(this, postingPreviewRatio, i, 3);
        }
    }

    public final void b() {
        zhf0 zhf0Var = (zhf0) ((zak0) this.p).getValue();
        if (zhf0Var == null) {
            return;
        }
        zhf0 zhf0Var2 = (zhf0) ((zak0) this.q).getValue();
        float d = d();
        long j = this.y;
        long d2 = zhf0Var.d();
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i) + ((Float.intBitsToFloat((int) (d2 >> 32)) - Float.intBitsToFloat(i)) * d);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i2) + ((Float.intBitsToFloat((int) (d2 & 4294967295L)) - Float.intBitsToFloat(i2)) * d);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        int i3 = (int) (floatToRawIntBits >> 32);
        float intBitsToFloat3 = ((Float.intBitsToFloat(i3) / 2.0f) + zhf0Var2.a) - Float.intBitsToFloat((int) (zhf0Var2.c() >> 32));
        float intBitsToFloat4 = (zhf0Var2.c - (Float.intBitsToFloat(i3) / 2.0f)) - Float.intBitsToFloat((int) (zhf0Var2.c() >> 32));
        int i4 = (int) (floatToRawIntBits & 4294967295L);
        float intBitsToFloat5 = ((Float.intBitsToFloat(i4) / 2.0f) + zhf0Var2.b) - Float.intBitsToFloat((int) (zhf0Var2.c() & 4294967295L));
        float intBitsToFloat6 = (zhf0Var2.d - (Float.intBitsToFloat(i4) / 2.0f)) - Float.intBitsToFloat((int) (zhf0Var2.c() & 4294967295L));
        float abs = Math.abs(intBitsToFloat4 - intBitsToFloat3);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (abs < 2.0f) {
            intBitsToFloat4 = 0.0f;
            intBitsToFloat3 = 0.0f;
        }
        if (Math.abs(intBitsToFloat6 - intBitsToFloat5) < 2.0f) {
            intBitsToFloat6 = 0.0f;
            intBitsToFloat5 = 0.0f;
        }
        if (intBitsToFloat4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            intBitsToFloat4 = 0.0f;
        }
        if (intBitsToFloat3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            intBitsToFloat3 = 0.0f;
        }
        if (intBitsToFloat6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            intBitsToFloat6 = 0.0f;
        }
        if (intBitsToFloat5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = intBitsToFloat5;
        }
        ((zak0) this.r).setValue(new qv70(intBitsToFloat4, intBitsToFloat3, intBitsToFloat6, f));
    }

    public final float c() {
        return ((Number) ((zak0) this.t).getValue()).floatValue();
    }

    public final float d() {
        return ((Number) ((zak0) this.s).getValue()).floatValue();
    }

    public final boolean e() {
        return ((Boolean) ((zak0) this.h).getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        vgk vgkVar;
        int i;
        ImageCropArea imageCropArea;
        zhf0 zhf0Var;
        zhf0 zhf0Var2;
        zhf0 zhf0Var3;
        zhf0 zhf0Var4;
        long floatToRawIntBits;
        if (continuationImpl instanceof vgk) {
            vgkVar = (vgk) continuationImpl;
            int i2 = vgkVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vgkVar.label = i2 - Integer.MIN_VALUE;
                Object obj = vgkVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vgkVar.label;
                imageCropArea = this.c;
                ImageLink imageLink = this.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    wh50 wh50Var = this.p;
                    zhf0Var = (zhf0) ((zak0) wh50Var).getValue();
                    if (zhf0Var == null) {
                        return s3q0.a;
                    }
                    float g = jcr.g(imageLink, imageCropArea);
                    if (imageCropArea != null && (zhf0Var2 = (zhf0) ((zak0) wh50Var).getValue()) != null && (zhf0Var3 = (zhf0) ((zak0) this.m).getValue()) != null) {
                        boolean z = zhf0Var3.d - zhf0Var3.b >= zhf0Var2.d - zhf0Var2.b && zhf0Var3.c - zhf0Var3.a >= (zhf0Var2.c - zhf0Var2.a) - (Float.intBitsToFloat((int) (this.y >> 32)) / 2.0f);
                        float f = (imageCropArea.f / 2.0f) + imageCropArea.d;
                        if (Math.abs(((imageCropArea.g / 2.0f) + imageCropArea.e) - (imageLink.getHeight() / 2.0f)) <= 1.0f && Math.abs(f - (imageLink.getWidth() / 2.0f)) <= 1.0f && Math.abs(g - 1.0f) < 0.001f && !z && e()) {
                            h(c());
                            if2 if2Var = (if2) ((zak0) this.l).getValue();
                            Float f2 = new Float(c());
                            vgkVar.L$0 = zhf0Var;
                            vgkVar.F$0 = g;
                            vgkVar.label = 1;
                            if (if2Var.e(f2, vgkVar) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            zhf0Var4 = zhf0Var;
                        }
                    }
                    h(g);
                    ((zak0) this.h).setValue(Boolean.FALSE);
                    float d = d();
                    long j = this.y;
                    if (imageCropArea == null) {
                        floatToRawIntBits = 0;
                    } else {
                        zhf0 e = jcr.e(zhf0Var, j, d);
                        float i3 = jcr.i(imageLink.getWidth(), e.c - e.a);
                        long e2 = ov70.e(p490.e((Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(imageLink.getWidth()) << 32) | (Float.floatToRawIntBits(imageLink.getHeight()) & 4294967295L)).c(), p490.e((Float.floatToRawIntBits(imageCropArea.e) & 4294967295L) | (Float.floatToRawIntBits(imageCropArea.d) << 32), (Float.floatToRawIntBits(imageCropArea.g) & 4294967295L) | (Float.floatToRawIntBits(imageCropArea.f) << 32)).c());
                        floatToRawIntBits = (Float.floatToRawIntBits(jcr.i(Float.intBitsToFloat((int) (e2 >> 32)), i3)) << 32) | (Float.floatToRawIntBits(jcr.i(Float.intBitsToFloat((int) (e2 & 4294967295L)), i3)) & 4294967295L);
                    }
                    g(floatToRawIntBits);
                    j(1.0f, 0L);
                    return s3q0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zhf0Var4 = (zhf0) vgkVar.L$0;
                kotlin.a.a(obj);
                zhf0Var = zhf0Var4;
                float d2 = d();
                long j2 = this.y;
                if (imageCropArea == null) {
                }
                g(floatToRawIntBits);
                j(1.0f, 0L);
                return s3q0.a;
            }
        }
        vgkVar = new vgk(this, continuationImpl);
        Object obj2 = vgkVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vgkVar.label;
        imageCropArea = this.c;
        ImageLink imageLink2 = this.d;
        if (i != 0) {
        }
        zhf0Var = zhf0Var4;
        float d22 = d();
        long j22 = this.y;
        if (imageCropArea == null) {
        }
        g(floatToRawIntBits);
        j(1.0f, 0L);
        return s3q0.a;
    }

    public final void g(long j) {
        ((zak0) this.v).setValue(new ov70(j));
    }

    public final void h(float f) {
        ((zak0) this.s).setValue(Float.valueOf(f));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        wgk wgkVar;
        int i;
        if (continuationImpl instanceof wgk) {
            wgkVar = (wgk) continuationImpl;
            int i2 = wgkVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wgkVar.label = i2 - Integer.MIN_VALUE;
                wgk wgkVar2 = wgkVar;
                Object obj = wgkVar2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wgkVar2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (!e()) {
                        return s3q0.a;
                    }
                    h(1.0f);
                    if2 if2Var = (if2) ((zak0) this.l).getValue();
                    Float f = new Float(1.0f);
                    dtp0 dtp0Var = new dtp0(300, 100, luo.c);
                    wgkVar2.label = 1;
                    if (if2.c(if2Var, f, dtp0Var, null, wgkVar2, 12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                ((zak0) this.h).setValue(Boolean.FALSE);
                return s3q0.a;
            }
        }
        wgkVar = new wgk(this, continuationImpl);
        wgk wgkVar22 = wgkVar;
        Object obj2 = wgkVar22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wgkVar22.label;
        if (i != 0) {
        }
        ((zak0) this.h).setValue(Boolean.FALSE);
        return s3q0.a;
    }

    public final void j(float f, long j) {
        if (e()) {
            return;
        }
        b();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat((int) (((ov70) ((zak0) this.v).getValue()).a >> 32));
        wh50 wh50Var = this.r;
        long floatToRawIntBits = (Float.floatToRawIntBits(swe0.f(Float.intBitsToFloat((int) (j & 4294967295L)) + Float.intBitsToFloat((int) (((ov70) ((zak0) r0).getValue()).a & 4294967295L)), ((qv70) ((zak0) wh50Var).getValue()).c, ((qv70) ((zak0) wh50Var).getValue()).d)) & 4294967295L) | (Float.floatToRawIntBits(swe0.f(intBitsToFloat, ((qv70) ((zak0) wh50Var).getValue()).a, ((qv70) ((zak0) wh50Var).getValue()).b)) << 32);
        float d = d();
        float c = ((CropFitContainerMode) ((zak0) this.w).getValue()) == CropFitContainerMode.CROP_ONLY ? 1.0f : c();
        float pow = (float) Math.pow(f, (jcr.i(1.0f, c) * 0.3f) + 1.0f);
        float f2 = swe0.f(jcr.i(d - c, 1.7f - c), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 0.6f;
        if (d <= 1.0f) {
            f = f < d ? 1.0f - ((1.0f - pow) * f2) : u11.b(1, f2, pow - 1.0f, 1.0f);
        }
        float f3 = swe0.f(d * f, c, 1.7f);
        if (this.f) {
            h(f3);
        }
        g(floatToRawIntBits);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ContinuationImpl continuationImpl) {
        xgk xgkVar;
        int i;
        wh50 wh50Var;
        long j;
        if (continuationImpl instanceof xgk) {
            xgkVar = (xgk) continuationImpl;
            int i2 = xgkVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xgkVar.label = i2 - Integer.MIN_VALUE;
                Object obj = xgkVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = xgkVar.label;
                wh50 wh50Var2 = this.g;
                wh50Var = this.k;
                j = this.x;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (((Number) ((zak0) wh50Var).getValue()).longValue() == -1) {
                        return s3q0.a;
                    }
                    ((zak0) wh50Var2).setValue(Boolean.FALSE);
                    xgkVar.label = 1;
                    if (qsl.b(j, xgkVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                if (SystemClock.elapsedRealtime() - ((Number) ((zak0) wh50Var).getValue()).longValue() >= j) {
                    ((zak0) wh50Var2).setValue(Boolean.TRUE);
                }
                return s3q0.a;
            }
        }
        xgkVar = new xgk(this, continuationImpl);
        Object obj2 = xgkVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xgkVar.label;
        wh50 wh50Var22 = this.g;
        wh50Var = this.k;
        j = this.x;
        if (i != 0) {
        }
        if (SystemClock.elapsedRealtime() - ((Number) ((zak0) wh50Var).getValue()).longValue() >= j) {
        }
        return s3q0.a;
    }
}
