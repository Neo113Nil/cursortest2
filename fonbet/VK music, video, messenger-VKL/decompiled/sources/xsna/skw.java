package xsna;

import android.net.Uri;
import android.os.StrictMode;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import xsna.bid0;

/* compiled from: ImagePipeline.kt */
/* loaded from: classes.dex */
public final class skw {
    public static final CancellationException l = new CancellationException("Prefetching is not enabled");
    public final aid0 a;
    public final yhn0<Boolean> b;
    public final yhn0<fbn> c;
    public final z9s d;
    public final y9s e;
    public final n220<ww8, svf> f;
    public final n220<ww8, PooledByteBuffer> g;
    public final ecl h;
    public final yhn0<Boolean> i;
    public final AtomicLong j = new AtomicLong();
    public final ukw k;

    /* compiled from: ImagePipeline.kt */
    /* loaded from: classes12.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageRequest.CacheChoice.values().length];
            try {
                iArr[ImageRequest.CacheChoice.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageRequest.CacheChoice.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageRequest.CacheChoice.DYNAMIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        new CancellationException("ImageRequest is null");
        new CancellationException("Modified URL is null");
    }

    public skw(aid0 aid0Var, Set set, Set set2, yhn0 yhn0Var, r8x r8xVar, r8x r8xVar2, yhn0 yhn0Var2, ecl eclVar, yhn0 yhn0Var3, ukw ukwVar) {
        this.a = aid0Var;
        this.b = yhn0Var;
        this.c = yhn0Var2;
        this.d = new z9s((Set<v7g0>) set);
        this.e = new y9s(set2);
        this.f = r8xVar;
        this.g = r8xVar2;
        this.h = eclVar;
        this.i = yhn0Var3;
        this.k = ukwVar;
    }

    /* JADX WARN: Finally extract failed */
    public final ae a(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, v7g0 v7g0Var, String str) {
        thd0<uvf<svf>> a2;
        if (imageRequest == null) {
            return ad0.r(new NullPointerException());
        }
        try {
            aid0 aid0Var = this.a;
            aid0Var.getClass();
            if (lhs.d()) {
                lhs.a("ProducerSequenceFactory#getDecodedImageProducerSequence");
                try {
                    a2 = aid0Var.a(imageRequest);
                    if (imageRequest.f() != null) {
                        a2 = aid0Var.e(a2);
                    }
                    lhs.b();
                } catch (Throwable th) {
                    lhs.b();
                    throw th;
                }
            } else {
                a2 = aid0Var.a(imageRequest);
                if (imageRequest.f() != null) {
                    a2 = aid0Var.e(a2);
                }
            }
            thd0<uvf<svf>> thd0Var = a2;
            if (requestLevel == null) {
                requestLevel = ImageRequest.RequestLevel.FULL_FETCH;
            }
            return i(thd0Var, imageRequest, requestLevel, obj, v7g0Var, str);
        } catch (Exception e) {
            return ad0.r(e);
        }
    }

    public final z9s b(ImageRequest imageRequest, v7g0 v7g0Var) {
        if (imageRequest == null) {
            throw new IllegalStateException("Required value was null.");
        }
        z9s z9sVar = this.d;
        return v7g0Var == null ? imageRequest.h() == null ? z9sVar : new z9s(z9sVar, imageRequest.h()) : imageRequest.h() == null ? new z9s(z9sVar, v7g0Var) : new z9s(z9sVar, v7g0Var, imageRequest.h());
    }

    public final boolean c(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f.b(new yzt(uri, 3));
    }

    public final boolean d(Uri uri) {
        return e(uri, ImageRequest.CacheChoice.SMALL) || e(uri, ImageRequest.CacheChoice.DEFAULT) || e(uri, ImageRequest.CacheChoice.DYNAMIC);
    }

    public final boolean e(Uri uri, ImageRequest.CacheChoice cacheChoice) {
        ImageRequestBuilder h = ImageRequestBuilder.h(uri);
        h.i(cacheChoice);
        ImageRequest a2 = h.a();
        fbn fbnVar = this.c.get();
        ecl eclVar = this.h;
        ww8 d = eclVar.d(a2, null);
        ImageRequest.CacheChoice b = a2.b();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            int i = a.$EnumSwitchMapping$0[b.ordinal()];
            boolean z = true;
            if (i == 1) {
                z = fbnVar.b().b(d);
            } else if (i == 2) {
                z = fbnVar.d().b(d);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                fbn fbnVar2 = this.c.get();
                ww8 d2 = eclVar.d(a2, null);
                Iterator<Map.Entry<String, ym8>> it = fbnVar2.e().entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (it.next().getValue().b(d2)) {
                    }
                }
            }
            return z;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public final boolean f(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.g.b(new yzt(uri, 3));
    }

    public final ae g(ImageRequest imageRequest) {
        ae r;
        boolean d = lhs.d();
        yhn0<Boolean> yhn0Var = this.i;
        ukw ukwVar = this.k;
        CancellationException cancellationException = l;
        yhn0<Boolean> yhn0Var2 = this.b;
        aid0 aid0Var = this.a;
        if (!d) {
            if (!yhn0Var2.get().booleanValue()) {
                return ad0.r(cancellationException);
            }
            try {
                ukwVar.getExperiments().getClass();
                return j(yhn0Var.get().booleanValue() ? aid0Var.c(imageRequest) : aid0Var.b(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, Priority.MEDIUM);
            } catch (Exception e) {
                return ad0.r(e);
            }
        }
        lhs.a("ImagePipeline#prefetchToBitmapCache");
        try {
            if (!yhn0Var2.get().booleanValue()) {
                return ad0.r(cancellationException);
            }
            try {
                ukwVar.getExperiments().getClass();
                r = j(yhn0Var.get().booleanValue() ? aid0Var.c(imageRequest) : aid0Var.b(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, Priority.MEDIUM);
            } catch (Exception e2) {
                r = ad0.r(e2);
            }
            return r;
        } finally {
            lhs.b();
        }
    }

    public final ae h(ImageRequest imageRequest) {
        Priority priority = Priority.MEDIUM;
        if (!this.b.get().booleanValue()) {
            return ad0.r(l);
        }
        if (imageRequest == null) {
            return ad0.r(new NullPointerException("imageRequest is null"));
        }
        try {
            return j(this.a.c(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, priority);
        } catch (Exception e) {
            return ad0.r(e);
        }
    }

    public final ae i(thd0 thd0Var, ImageRequest imageRequest, ImageRequest.RequestLevel requestLevel, Object obj, v7g0 v7g0Var, String str) {
        ae r;
        boolean d = lhs.d();
        AtomicLong atomicLong = this.j;
        y9s y9sVar = this.e;
        if (!d) {
            clx clxVar = new clx(b(imageRequest, v7g0Var), y9sVar);
            try {
                return tvf.m(thd0Var, new ozi0(imageRequest, String.valueOf(atomicLong.getAndIncrement()), str, clxVar, obj, ImageRequest.RequestLevel.a(imageRequest.e(), requestLevel), !meq0.e(imageRequest.l()), imageRequest.g(), this.k), clxVar);
            } catch (Exception e) {
                return ad0.r(e);
            }
        }
        lhs.a("ImagePipeline#submitFetchRequest");
        try {
            clx clxVar2 = new clx(b(imageRequest, v7g0Var), y9sVar);
            try {
                r = tvf.m(thd0Var, new ozi0(imageRequest, String.valueOf(atomicLong.getAndIncrement()), str, clxVar2, obj, ImageRequest.RequestLevel.a(imageRequest.e(), requestLevel), !meq0.e(imageRequest.l()), imageRequest.g(), this.k), clxVar2);
            } catch (Exception e2) {
                r = ad0.r(e2);
            }
            return r;
        } finally {
            lhs.b();
        }
    }

    public final ae j(thd0 thd0Var, ImageRequest imageRequest, ImageRequest.RequestLevel requestLevel, Priority priority) {
        clx clxVar = new clx(b(imageRequest, null), this.e);
        Uri l2 = imageRequest.l();
        if (!l2.equals(l2)) {
            ImageRequestBuilder d = ImageRequestBuilder.d(imageRequest);
            d.o(l2);
            imageRequest = d.a();
        }
        ImageRequest imageRequest2 = imageRequest;
        try {
            ImageRequest.RequestLevel a2 = ImageRequest.RequestLevel.a(imageRequest2.e(), requestLevel);
            String valueOf = String.valueOf(this.j.getAndIncrement());
            this.k.getClass();
            return bid0.a.a(thd0Var, new ozi0(imageRequest2, valueOf, clxVar, a2, priority, this.k), clxVar);
        } catch (Exception e) {
            return ad0.r(e);
        }
    }
}
