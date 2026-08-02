package xsna;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.internal.ImmutableList;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

/* compiled from: PipelineDraweeControllerBuilder.java */
/* loaded from: classes12.dex */
public final class lpa0 extends AbstractDraweeControllerBuilder<lpa0, ImageRequest, uvf<svf>, mjw> {
    public final skw p;
    public final npa0 q;
    public ImmutableList<tjo> r;

    /* compiled from: PipelineDraweeControllerBuilder.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AbstractDraweeControllerBuilder.CacheLevel.values().length];
            a = iArr;
            try {
                iArr[AbstractDraweeControllerBuilder.CacheLevel.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AbstractDraweeControllerBuilder.CacheLevel.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AbstractDraweeControllerBuilder.CacheLevel.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public lpa0(Context context, npa0 npa0Var, skw skwVar) {
        super(context);
        this.p = skwVar;
        this.q = npa0Var;
    }

    public static ImageRequest.RequestLevel q(AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        int i = a.a[cacheLevel.ordinal()];
        if (i == 1) {
            return ImageRequest.RequestLevel.FULL_FETCH;
        }
        if (i == 2) {
            return ImageRequest.RequestLevel.DISK_CACHE;
        }
        if (i == 3) {
            return ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + cacheLevel + "is not supported. ");
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    public final ae c(dlo dloVar, String str, Object obj, Object obj2, AbstractDraweeControllerBuilder.CacheLevel cacheLevel) {
        ImageRequest imageRequest = (ImageRequest) obj;
        skw skwVar = this.p;
        ImageRequest.RequestLevel q = q(cacheLevel);
        if (dloVar instanceof kpa0) {
            synchronized (((kpa0) dloVar)) {
            }
        }
        return skwVar.a(imageRequest, obj2, q, null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    public final kpa0 e() {
        kpa0 kpa0Var;
        if (lhs.d()) {
            lhs.a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            dlo dloVar = this.l;
            String valueOf = String.valueOf(AbstractDraweeControllerBuilder.o.getAndIncrement());
            if (dloVar instanceof kpa0) {
                kpa0Var = (kpa0) dloVar;
            } else {
                npa0 npa0Var = this.q;
                kpa0Var = new kpa0(npa0Var.a, npa0Var.b, npa0Var.c, npa0Var.d, npa0Var.e);
                yhn0<Boolean> yhn0Var = npa0Var.f;
                if (yhn0Var != null) {
                    kpa0Var.A = yhn0Var.get().booleanValue();
                }
            }
            yhn0<zuk<uvf<svf>>> f = f(kpa0Var, valueOf);
            ImageRequest imageRequest = (ImageRequest) this.c;
            ecl eclVar = this.p.h;
            nc7 e = (eclVar == null || imageRequest == null) ? null : imageRequest.o != null ? eclVar.e(imageRequest, this.b) : eclVar.a(imageRequest, this.b);
            Object obj = this.b;
            ImmutableList<tjo> immutableList = this.r;
            kpa0Var.getClass();
            if (lhs.d()) {
                lhs.a("PipelineDraweeController#initialize");
            }
            kpa0Var.o(obj, valueOf);
            kpa0Var.r = false;
            kpa0Var.z = f;
            kpa0Var.E(null);
            kpa0Var.y = e;
            kpa0Var.B = immutableList;
            kpa0Var.E(null);
            if (lhs.d()) {
                lhs.b();
            }
            synchronized (kpa0Var) {
                kpa0Var.C = (ImageRequest) this.c;
                kpa0Var.D = (ImageRequest[]) this.e;
                kpa0Var.E = (ImageRequest) this.d;
            }
            if (lhs.d()) {
                lhs.b();
            }
            return kpa0Var;
        } catch (Throwable th) {
            if (lhs.d()) {
                lhs.b();
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [REQUEST, com.facebook.imagepipeline.request.ImageRequest] */
    public final lpa0 r(Uri uri) {
        if (uri == null) {
            this.c = null;
            return this;
        }
        ImageRequestBuilder h = ImageRequestBuilder.h(uri);
        h.e = eng0.d;
        this.c = h.a();
        return this;
    }
}
