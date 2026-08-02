package xsna;

import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.Size;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.performance.network.NetworkPerformanceMeasurer;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.common.im.Image;
import com.vk.imageloader.fresco.Quality;
import com.vk.toggle.data.ImageQualitySuppressionLevel;
import com.vk.toggle.features.CoreFeatures;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.b0g;
import xsna.bp10;
import xsna.f5h0;

/* compiled from: FrescoEnhancedImageBackend.kt */
/* loaded from: classes17.dex */
public final class ahs implements zlp {
    public final VkEnhancedImageView a;
    public final fhs b;
    public boolean d;
    public List<? extends fxj0> e;
    public List<? extends fxj0> f;
    public fxj0 g;
    public fxj0 h;
    public Drawable k;
    public Drawable l;
    public ScaleType n;
    public gzs<Boolean> p;
    public final jwx q;
    public final bpn0 c = new bpn0(new d1(15));
    public boolean i = true;
    public boolean j = true;
    public final bp10.b m = new bp10.b();
    public final Object o = msy.a(LazyThreadSafetyMode.NONE, new i5f(this, 24));

    /* compiled from: FrescoEnhancedImageBackend.kt */
    public static final class a implements fxj0 {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        @Override // xsna.fxj0
        public final boolean c7() {
            return false;
        }

        @Override // xsna.fxj0
        public final int e6() {
            return 0;
        }

        @Override // xsna.fxj0
        public final int getHeight() {
            return 0;
        }

        @Override // xsna.fxj0
        public final String getUrl() {
            return this.b;
        }

        @Override // xsna.fxj0
        public final int getWidth() {
            return 0;
        }

        @Override // xsna.fxj0
        public final fxj0 kb(int i, int i2, String str) {
            return new a(str);
        }
    }

    /* compiled from: FrescoEnhancedImageBackend.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScaleType.values().length];
            try {
                iArr[ScaleType.CENTER_CROP_UPSCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ScaleType.FIT_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ScaleType.TOP_CROP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ScaleType.BOTTOM_CROP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: FrescoEnhancedImageBackend.kt */
    public static final class c implements NetworkPerformanceMeasurer.a {
        public c() {
        }

        @Override // com.vk.core.performance.network.NetworkPerformanceMeasurer.a
        public final void a(NetworkPerformanceMeasurer.NetworkClass networkClass, boolean z) {
            if (z) {
                return;
            }
            ahs.this.h();
        }
    }

    public ahs(VkEnhancedImageView vkEnhancedImageView, fhs fhsVar) {
        this.a = vkEnhancedImageView;
        this.b = fhsVar;
        new jwx(2, 1);
        this.q = new jwx(2, 15);
    }

    public static void y(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((fxj0) it.next()).getUrl().length() == 0) {
                tv4.b("Url should not be empty", com.vk.metrics.eventtracking.b.a);
            }
        }
    }

    public final fxj0 a(int i, int i2, List list) {
        ImageQualitySuppressionLevel imageQualitySuppressionLevel;
        if (list == null) {
            return null;
        }
        sr10 sr10Var = dy2.a;
        if (!(sr10Var != null ? sr10Var.c() : true)) {
            gzs<Boolean> gzsVar = this.p;
            if (!(gzsVar != null ? gzsVar.invoke().booleanValue() : false)) {
                sr10 sr10Var2 = dy2.a;
                if (sr10Var2 == null || (imageQualitySuppressionLevel = sr10Var2.d()) == null) {
                    imageQualitySuppressionLevel = ImageQualitySuppressionLevel.NONE;
                }
                double h = imageQualitySuppressionLevel.h();
                fxj0 k = kq01.k(list, i, h, false);
                if (k != null) {
                    NetworkPerformanceMeasurer networkPerformanceMeasurer = NetworkPerformanceMeasurer.a;
                    String url = k.getUrl();
                    networkPerformanceMeasurer.getClass();
                    NetworkPerformanceMeasurer.n.put(url, Double.valueOf(h));
                }
                return k;
            }
        }
        if (!this.j) {
            return ixj0.b(list);
        }
        List list2 = list;
        fxj0 c2 = ixj0.c(list2, i, i2);
        return c2 == null ? ixj0.b(list2) : c2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, int i2) {
        ImageRequest imageRequest;
        ImageRequest imageRequest2;
        String str;
        a aVar;
        List<? extends fxj0> list = this.e;
        boolean z = true;
        Object[] objArr = list == null || list.isEmpty();
        List<? extends fxj0> list2 = this.f;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        }
        if (objArr == true && z) {
            return;
        }
        fxj0 a2 = a(i, i2, this.e);
        this.g = a2;
        ImageRequest imageRequest3 = null;
        imageRequest3 = null;
        imageRequest3 = null;
        fhs fhsVar = this.b;
        if (a2 != null) {
            NetworkPerformanceMeasurer networkPerformanceMeasurer = NetworkPerformanceMeasurer.a;
            String url = a2.getUrl();
            networkPerformanceMeasurer.getClass();
            NetworkPerformanceMeasurer.c(url);
            fhsVar.Z(a2.getUrl());
            ImageRequestBuilder r = kq01.r(a2, i, i2, this.j, this.n);
            r.k = fhsVar.h;
            r.l = new hhs(Quality.SUITABLE, new pff(this, 23));
            imageRequest = r.a();
        } else {
            imageRequest = null;
        }
        fxj0 a3 = a(i, i2, this.f);
        this.h = a3;
        sa30.L(this.a, a3 != null ? a3.getUrl() : null);
        if (a3 != null) {
            NetworkPerformanceMeasurer networkPerformanceMeasurer2 = NetworkPerformanceMeasurer.a;
            String url2 = a3.getUrl();
            networkPerformanceMeasurer2.getClass();
            NetworkPerformanceMeasurer.c(url2);
            fhsVar.Z(a3.getUrl());
            ImageRequestBuilder r2 = kq01.r(a3, i, i2, this.j, this.n);
            r2.k = fhsVar.h;
            r2.j = Priority.MEDIUM;
            r2.l = new hhs(Quality.SUITABLE, new m2g(this, 20));
            imageRequest2 = r2.a();
        } else {
            imageRequest2 = null;
        }
        boolean booleanValue = ((Boolean) this.c.getValue()).booleanValue();
        ktc0 ktc0Var = this.q;
        if (!booleanValue || (str = fhsVar.I) == null || drm0.N(str)) {
            Pair m = kq01.m(this.f);
            if (m != null) {
                fxj0 fxj0Var = (fxj0) m.d();
                Quality quality = (Quality) m.g();
                if (!uiw.a(fxj0Var.getUrl())) {
                    ktc0Var = fhsVar.g;
                }
                ImageRequestBuilder r3 = kq01.r(fxj0Var, i, i2, this.j, this.n);
                r3.k = ktc0Var;
                r3.j = Priority.HIGH;
                if (quality == null) {
                    quality = Quality.LOWEST;
                }
                r3.l = new hhs(quality, new p5h(this, 17));
                ImageRequest a4 = r3.a();
                fxj0 fxj0Var2 = brm0.B(fxj0Var.getUrl(), "http", false) ? fxj0Var : null;
                if (fxj0Var2 != null) {
                    fhsVar.Z(fxj0Var2.getUrl());
                }
                imageRequest3 = a4;
            }
        } else {
            String str2 = fhsVar.I;
            fxj0 fxj0Var3 = this.h;
            String url3 = fxj0Var3 != null ? fxj0Var3.getUrl() : null;
            if (url3 == null || !mcr0.p(url3)) {
                if (str2 != null) {
                    bpn0 bpn0Var = uiw.a;
                    aVar = new a(i5s.a(new StringBuilder(), uiw.b, str2));
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    ImageRequestBuilder r4 = kq01.r(aVar, i, i2, this.j, this.n);
                    r4.k = ktc0Var;
                    r4.j = Priority.LOW;
                    r4.l = new hhs(Quality.LOWEST, new dnh(this, 21));
                    imageRequest3 = r4.a();
                }
            }
        }
        fhsVar.c0(imageRequest2, imageRequest3, imageRequest);
    }

    @Override // xsna.zlp
    public final ColorFilter c() {
        return this.b.X().d.getColorFilter();
    }

    @Override // xsna.zlp
    public final void clear() {
        x(null, null);
    }

    @Override // xsna.zlp
    public final boolean d() {
        return this.m.a();
    }

    @Override // xsna.zlp
    public final void e() {
        this.i = true;
    }

    @Override // xsna.zlp
    public final boolean f(Drawable drawable) {
        return drawable == this.b.X().d;
    }

    @Override // xsna.zlp
    public final void g(List<? extends fxj0> list) {
        x(this.e, list);
    }

    @Override // xsna.zlp
    public final void h() {
        VkEnhancedImageView vkEnhancedImageView = this.a;
        if (vkEnhancedImageView.isAttachedToWindow() && vkEnhancedImageView.isImageLoaded()) {
            if (this.g == null && this.h == null) {
                return;
            }
            List<? extends fxj0> list = this.e;
            fxj0 a2 = list != null ? a(vkEnhancedImageView.getWidth(), vkEnhancedImageView.getHeight(), list) : null;
            List<? extends fxj0> list2 = this.f;
            fxj0 a3 = list2 != null ? a(vkEnhancedImageView.getWidth(), vkEnhancedImageView.getHeight(), list2) : null;
            fxj0 fxj0Var = this.g;
            if (fxj0Var != null && a2 != null && fxj0Var.getWidth() < a2.getWidth()) {
                this.i = true;
                b(vkEnhancedImageView.getWidth(), vkEnhancedImageView.getHeight());
                return;
            }
            fxj0 fxj0Var2 = this.h;
            if (fxj0Var2 == null || a3 == null || fxj0Var2.getWidth() >= a3.getWidth()) {
                return;
            }
            this.i = true;
            b(vkEnhancedImageView.getWidth(), vkEnhancedImageView.getHeight());
        }
    }

    @Override // xsna.zlp
    public final gzs<Boolean> i() {
        return this.p;
    }

    @Override // xsna.zlp
    public final void j(fxj0 fxj0Var) {
        x(this.e, fxj0Var != null ? Collections.singletonList(fxj0Var) : null);
    }

    @Override // xsna.zlp
    public final void k(int i, int i2, int i3, int i4) {
        Drawable d = this.b.T().d();
        if (d != null) {
            d.setBounds(i, i2, i3, i4);
        }
    }

    @Override // xsna.zlp
    public final void l(fxj0 fxj0Var) {
        if (fxj0Var == null) {
            x(null, this.f);
        } else {
            x(Collections.singletonList(fxj0Var), this.f);
        }
    }

    @Override // xsna.zlp
    public final void m() {
        bp10.b bVar = this.m;
        int i = bVar.c;
        boolean z = i > 0 && bVar.d > 0;
        VkEnhancedImageView vkEnhancedImageView = this.a;
        boolean z2 = i == 0 && bVar.d == 0 && vkEnhancedImageView.isImageLoaded();
        boolean z3 = bVar.a > 0 && bVar.b > 0 && vkEnhancedImageView.getVisibility() == 0;
        if (this.i && z3) {
            if (z || z2) {
                b(bVar.a, bVar.b);
                this.i = false;
            }
        }
    }

    @Override // xsna.zlp
    public final void n(final int i) {
        if (!this.d) {
            this.b.X().q(i);
            return;
        }
        final WeakReference weakReference = new WeakReference(this);
        b0g b0gVar = b0g.a;
        b0g.a(new b0g.a() { // from class: xsna.zgs
            @Override // xsna.b0g.a
            public final void a() {
                fhs fhsVar;
                njt U;
                ahs ahsVar = (ahs) weakReference.get();
                if (ahsVar == null || (fhsVar = ahsVar.b) == null || (U = fhsVar.U()) == null) {
                    return;
                }
                U.q(i);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.zlp
    public final void o() {
        CoreFeatures coreFeatures = CoreFeatures.ADAPTIVE_FEED_MEDIA;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures)) {
            NetworkPerformanceMeasurer networkPerformanceMeasurer = NetworkPerformanceMeasurer.a;
            c cVar = (c) this.o.getValue();
            networkPerformanceMeasurer.getClass();
            NetworkPerformanceMeasurer.a(cVar);
        }
    }

    @Override // xsna.zlp
    public final void p(List<? extends fxj0> list) {
        x(list, this.f);
    }

    @Override // xsna.zlp
    public final void q(Drawable drawable) {
        this.l = drawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    @Override // xsna.zlp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Size r(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, ScaleType scaleType, float f) {
        fxj0 b2;
        int width;
        ImageQualitySuppressionLevel imageQualitySuppressionLevel;
        ImageQualitySuppressionLevel imageQualitySuppressionLevel2;
        sr10 sr10Var = dy2.a;
        if (!(sr10Var != null ? sr10Var.c() : true)) {
            gzs<Boolean> gzsVar = this.p;
            if (!(gzsVar != null ? gzsVar.invoke().booleanValue() : false)) {
                List<? extends fxj0> list = this.e;
                int v = iah0.v();
                sr10 sr10Var2 = dy2.a;
                if (sr10Var2 == null || (imageQualitySuppressionLevel = sr10Var2.d()) == null) {
                    imageQualitySuppressionLevel = ImageQualitySuppressionLevel.NONE;
                }
                b2 = kq01.k(list, v, imageQualitySuppressionLevel.h(), false);
                if (b2 == null) {
                    List<? extends fxj0> list2 = this.f;
                    int v2 = iah0.v();
                    sr10 sr10Var3 = dy2.a;
                    if (sr10Var3 == null || (imageQualitySuppressionLevel2 = sr10Var3.d()) == null) {
                        imageQualitySuppressionLevel2 = ImageQualitySuppressionLevel.NONE;
                    }
                    b2 = kq01.k(list2, v2, imageQualitySuppressionLevel2.h(), false);
                }
                bp10.a aVar = new bp10.a();
                width = b2 == null ? b2.getWidth() : 0;
                if (width < 200) {
                    width = 200;
                }
                aVar.a = width;
                int height = b2 != null ? b2.getHeight() : 0;
                aVar.b = height >= 200 ? height : 200;
                aVar.c = i;
                aVar.d = i2;
                aVar.e = i3;
                aVar.f = i4;
                aVar.g = i5;
                aVar.h = i6;
                aVar.i = i7;
                aVar.j = i8;
                aVar.k = scaleType;
                aVar.l = f;
                bp10.b bVar = this.m;
                bp10.d(aVar, bVar);
                return new Size(bVar.a, bVar.b);
            }
        }
        b2 = ixj0.b(this.e);
        if (b2 == null) {
            b2 = ixj0.b(this.f);
        }
        bp10.a aVar2 = new bp10.a();
        if (b2 == null) {
        }
        if (width < 200) {
        }
        aVar2.a = width;
        if (b2 != null) {
        }
        aVar2.b = height >= 200 ? height : 200;
        aVar2.c = i;
        aVar2.d = i2;
        aVar2.e = i3;
        aVar2.f = i4;
        aVar2.g = i5;
        aVar2.h = i6;
        aVar2.i = i7;
        aVar2.j = i8;
        aVar2.k = scaleType;
        aVar2.l = f;
        bp10.b bVar2 = this.m;
        bp10.d(aVar2, bVar2);
        return new Size(bVar2.a, bVar2.b);
    }

    @Override // xsna.zlp
    public final void s(boolean z) {
        this.j = z;
    }

    @Override // xsna.zlp
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.X().d.setColorFilter(colorFilter);
    }

    @Override // xsna.zlp
    public final void setPlaceholder(Drawable drawable) {
        this.k = drawable;
        this.b.X().p(this.k, 1);
    }

    @Override // xsna.zlp
    public final void t(ScaleType scaleType) {
        this.n = scaleType;
        njt X = this.b.X();
        ScaleType scaleType2 = this.n;
        int i = scaleType2 == null ? -1 : b.$EnumSwitchMapping$0[scaleType2.ordinal()];
        f5h0.f fVar = f5h0.f.a;
        f5h0.o oVar = f5h0.o.a;
        switch (i) {
            case 1:
                X.o(fVar);
                break;
            case 2:
                X.o(fVar);
                break;
            case 3:
                X.o(f5h0.g.a);
                break;
            case 4:
                X.o(f5h0.k.a);
                break;
            case 5:
                X.o(f5h0.i.a);
                break;
            case 6:
                X.o(f5h0.j.a);
                break;
            case 7:
                X.o(f5h0.m.a);
                break;
            case 8:
                X.l(2).s(new PointF(0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                X.o(oVar);
                break;
            case 9:
                X.l(2).s(new PointF(0.5f, 1.0f));
                X.o(oVar);
                break;
        }
    }

    @Override // xsna.zlp
    public final void u(gzs<Boolean> gzsVar) {
        this.p = gzsVar;
    }

    @Override // xsna.zlp
    public final void v(boolean z) {
        this.d = z;
        if (z) {
            n(0);
        }
    }

    @Override // xsna.zlp
    public final boolean w() {
        return this.j;
    }

    public final void x(List<? extends fxj0> list, List<? extends fxj0> list2) {
        List<? extends fxj0> list3;
        if (list != null) {
            y(list);
        }
        if (list2 != null) {
            y(list2);
        }
        this.e = list;
        fxj0 fxj0Var = null;
        this.g = null;
        this.f = list2;
        this.h = null;
        boolean z = false;
        if (mcr0.i) {
            if (list2 != null) {
                for (fxj0 fxj0Var2 : list2) {
                    if (uiw.a(fxj0Var2.getUrl())) {
                        fxj0Var = fxj0Var2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (fxj0Var != null) {
                fxj0 b2 = ixj0.b(this.f);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Image(b2 != null ? b2.getWidth() : 100, b2 != null ? b2.getHeight() : 100, fxj0Var.getUrl(), false));
                this.f = arrayList;
            }
        }
        List<? extends fxj0> list4 = list;
        if ((list4 == null || list4.isEmpty()) && ((list3 = list2) == null || list3.isEmpty())) {
            z = true;
        }
        this.b.X().p(z ? this.l : this.k, 1);
        this.i = true;
    }
}
