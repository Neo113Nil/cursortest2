package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.R$styleable;
import com.vk.imageloader.fresco.CallerContext;
import com.vk.imageloader.view.DefaultVkImageView;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.toggle.features.VideoFeatures;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e3m;
import xsna.f5h0;
import xsna.msv0;
import xsna.o360;
import xsna.qhv0;

/* compiled from: FrescoImageViewBackend.kt */
/* loaded from: classes.dex */
public final class fhs implements p0v0 {
    public ImageView.ScaleType A;
    public ImageView.ScaleType B;
    public Drawable C;
    public dhs D;
    public cir G;
    public msv0 H;
    public String I;
    public final zjt a;
    public float d;
    public boolean e;
    public FunctionReferenceImpl f;
    public ktc0 g;
    public ktc0 h;
    public String i;
    public int o;
    public tjo q;
    public boolean r;
    public Size s;
    public ImageScreenSize t;
    public int u;
    public Path v;
    public int w;
    public int x;
    public boolean y;
    public b780 z;
    public float b = 0.3f;
    public float c = 3.33f;
    public final bpn0 j = new bpn0(new ab3(4));
    public final ArrayList k = new ArrayList();
    public final gkw l = new gkw();
    public final Object m = msy.a(LazyThreadSafetyMode.NONE, new ehs(this, 0));
    public final Handler n = new Handler(Looper.getMainLooper());
    public io.reactivex.rxjava3.disposables.c p = EmptyDisposable.INSTANCE;
    public long E = 1000;
    public int F = 1;

    /* compiled from: FrescoImageViewBackend.kt */
    public static final class a {
        public static final void a(ImageRequestBuilder imageRequestBuilder, Size size) {
            if (size != null) {
                imageRequestBuilder.m(new x9g0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, size.getWidth(), size.getHeight(), 12));
            }
        }

        public static final void b(ImageRequestBuilder imageRequestBuilder, ImageScreenSize imageScreenSize) {
            if (imageScreenSize != null) {
                imageRequestBuilder.m(new x9g0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, imageScreenSize.h(), imageScreenSize.h(), 12));
            }
        }

        public static void c(ImageRequest imageRequest, gkw gkwVar) {
            bpn0 bpn0Var = o360.e;
            o360 a = o360.a.a();
            if (imageRequest == null) {
                return;
            }
            String uri = imageRequest.l().toString();
            if (gkwVar != null && gkwVar.e) {
                com.vk.imageloader.stat.a aVar = new com.vk.imageloader.stat.a();
                gkwVar.b = aVar;
                gkwVar.a = uri;
                a.a(uri, aVar);
            }
            a.h(uri);
        }
    }

    /* compiled from: FrescoImageViewBackend.kt */
    public static final class b implements com.vk.imageloader.view.a {
        @Override // com.vk.imageloader.view.a
        public final p0v0 a(DefaultVkImageView defaultVkImageView) {
            return new fhs(defaultVkImageView);
        }
    }

    /* compiled from: FrescoImageViewBackend.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        public static final Method a;

        static {
            try {
                Method declaredMethod = ce.class.getDeclaredMethod("C", null);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                throw new IllegalStateException("Can't find submitRequest method in AbstractDraweeController");
            }
        }

        public static void a(dlo dloVar) {
            try {
                a.invoke(dloVar, null);
            } catch (Exception unused) {
                throw new IllegalStateException("Can't invoke submitRequest method in AbstractDraweeController");
            }
        }
    }

    public fhs(zjt zjtVar) {
        this.a = zjtVar;
    }

    @Override // xsna.p0v0
    public final void A(Drawable drawable) {
        njt U = U();
        if (U != null) {
            U.r(drawable, 0);
        }
    }

    @Override // xsna.p0v0
    public final void B(Drawable drawable) {
        if (drawable != null) {
            njt U = U();
            if (U != null) {
                U.s(drawable, f5h0.m.a);
                return;
            }
            return;
        }
        njt U2 = U();
        if (U2 != null) {
            U2.p(null, 1);
        }
    }

    @Override // xsna.p0v0
    public final void C(String str) {
        V(str, true, true);
    }

    @Override // xsna.p0v0
    public final void D(int i) {
        njt U = U();
        if (U != null) {
            U.s(U.b.getDrawable(i), f5h0.m.a);
        }
    }

    @Override // xsna.p0v0
    public final void E(String str) {
        this.I = str;
    }

    @Override // xsna.p0v0
    public final void F() {
        T().h(null);
    }

    @Override // xsna.p0v0
    public final void G(Uri uri, Size size, Uri uri2, Size size2) {
        if (uri == null || uri2 == null) {
            N();
            return;
        }
        S();
        ImageRequestBuilder h = ImageRequestBuilder.h(uri);
        a.a(h, size);
        ImageRequestBuilder h2 = ImageRequestBuilder.h(uri2);
        a.a(h2, size2);
        W(h2, h);
    }

    @Override // xsna.p0v0
    public final int H() {
        if (T().e != null) {
            return this.w;
        }
        zjt zjtVar = this.a;
        if (zjtVar.getDrawable() != null) {
            return zjtVar.getDrawable().getIntrinsicWidth();
        }
        return 0;
    }

    @Override // xsna.p0v0
    public final float I() {
        return this.c;
    }

    @Override // xsna.p0v0
    public final void J(String str) {
        V(str, false, false);
    }

    @Override // xsna.p0v0
    public final void K(Uri uri, Size size) {
        if (uri == null) {
            N();
            return;
        }
        S();
        ImageRequestBuilder h = ImageRequestBuilder.h(uri);
        a.a(h, size);
        W(h, null);
        this.i = null;
        this.u = 0;
        this.t = null;
    }

    @Override // xsna.p0v0
    public final void L(int i, ImageView.ScaleType scaleType) {
        Context context = this.a.getContext();
        e3m.a aVar = e3m.a;
        this.C = m33.a(i, context);
        this.B = scaleType;
    }

    @Override // xsna.p0v0
    public final void M(qhv0 qhv0Var) {
        msv0 aVar;
        if (qhv0Var instanceof qhv0.m) {
            aVar = new msv0.b(qhv0Var);
        } else {
            if (!(qhv0Var instanceof qhv0.l)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new msv0.a((qhv0.l) qhv0Var);
        }
        this.H = aVar;
        f5h0.d a2 = aVar.a();
        njt U = U();
        if (U != null) {
            U.o(a2);
        }
    }

    @Override // xsna.p0v0
    public final void N() {
        clear();
        Drawable drawable = this.C;
        if (drawable != null) {
            this.a.setImageDrawable(drawable);
            ImageView.ScaleType scaleType = this.B;
            if (scaleType != null) {
                this.A = scaleType;
            }
        }
    }

    @Override // xsna.p0v0
    public final void O(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable != null) {
            njt U = U();
            if (U != null) {
                U.s(drawable, f5h0.a(scaleType));
                return;
            }
            return;
        }
        njt U2 = U();
        if (U2 != null) {
            U2.p(null, 1);
        }
    }

    @Override // xsna.p0v0
    public final void P(int i) {
        if (this.r && i != 0 && i == this.u && epx.f(this.s, null)) {
            return;
        }
        W(ImageRequestBuilder.g(i), null);
        this.i = null;
        this.u = i;
        this.t = null;
        this.s = null;
    }

    @Override // xsna.p0v0
    public final void Q(float f) {
        this.c = f;
    }

    public final void R(ImageRequestBuilder imageRequestBuilder, ImageRequestBuilder imageRequestBuilder2) {
        try {
            Trace.beginSection("VKImageView.actuallyProcessImageRequest");
            if (mcr0.u(imageRequestBuilder.e())) {
                imageRequestBuilder.i(ImageRequest.CacheChoice.SMALL);
            }
            int i = VKImageView.l;
            eng0 eng0Var = eng0.c;
            imageRequestBuilder.n(eng0Var);
            if (imageRequestBuilder2 != null) {
                imageRequestBuilder2.n(eng0Var);
            }
            imageRequestBuilder.k(this.h);
            if (imageRequestBuilder2 != null) {
                imageRequestBuilder2.k(this.g);
            }
            imageRequestBuilder.l(new ihs());
            c0(imageRequestBuilder.a(), imageRequestBuilder2 != null ? imageRequestBuilder2.a() : null, null);
            Z(imageRequestBuilder.e().toString());
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void S() {
        ImageView.ScaleType scaleType = this.A;
        if (scaleType != null) {
            zjt zjtVar = this.a;
            if (scaleType != zjtVar.getScaleType()) {
                zjtVar.setScaleType(scaleType);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final flo<njt> T() {
        return (flo) this.m.getValue();
    }

    public final njt U() {
        if (T().d != null) {
            return X();
        }
        return null;
    }

    public final void V(String str, boolean z, boolean z2) {
        if (z && this.r && str != null && str.equals(this.i) && this.t == null) {
            return;
        }
        if (str == null || str.length() == 0) {
            N();
            return;
        }
        S();
        ImageRequestBuilder h = ImageRequestBuilder.h(Uri.parse(str));
        if (!z) {
            h.b();
            h.c();
        } else if (z2) {
            h.b();
        } else {
            h.i(ImageRequest.CacheChoice.SMALL);
        }
        W(h, null);
        this.i = str;
        this.u = 0;
        this.t = null;
    }

    public final void W(ImageRequestBuilder imageRequestBuilder, ImageRequestBuilder imageRequestBuilder2) {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SCROLL_OPTIMIZATIONS_V2;
        videoFeatures.getClass();
        if (!com.vk.toggle.b.A.a(videoFeatures)) {
            R(imageRequestBuilder, imageRequestBuilder2);
            return;
        }
        dhs dhsVar = this.D;
        Handler handler = this.n;
        if (dhsVar != null) {
            handler.removeCallbacks(dhsVar);
        }
        dhs dhsVar2 = new dhs(this, imageRequestBuilder, imageRequestBuilder2, 0);
        this.D = dhsVar2;
        handler.post(dhsVar2);
    }

    public final njt X() {
        njt njtVar = T().d;
        njtVar.getClass();
        return njtVar;
    }

    public final void Y() {
        int i = this.o;
        dlo dloVar = T().e;
        if (dloVar != null && !s()) {
            njt U = U();
            if (U != null) {
                U.reset();
            }
            c.a(dloVar);
        }
        this.o = i;
    }

    public final void Z(String str) {
        if (str != null) {
            i0q0.j(new qye(4, this, str));
        }
    }

    @Override // xsna.p0v0
    public final void a(float f, int i) {
        njt U = U();
        if (U != null) {
            RoundingParams roundingParams = U.c;
            if (roundingParams == null) {
                roundingParams = new RoundingParams();
            }
            roundingParams.c(f, i);
            U.u(roundingParams);
        }
    }

    public final void a0(dlo dloVar) {
        T().h(dloVar);
        cir cirVar = this.G;
        if (cirVar != null) {
            cirVar.invoke(T().d());
        }
    }

    @Override // xsna.p0v0
    public final void b() {
        T().f();
        gkw gkwVar = this.l;
        if (gkwVar.e) {
            gkwVar.c = null;
            gkwVar.d = null;
            gkwVar.a = null;
        }
    }

    public final void b0(ktc0 ktc0Var, ktc0 ktc0Var2) {
        if (!epx.f(this.g, ktc0Var) || !epx.f(this.h, ktc0Var2)) {
            this.i = null;
            this.u = 0;
            this.t = null;
        }
        this.g = ktc0Var;
        this.h = ktc0Var2;
    }

    @Override // xsna.p0v0
    public final void c() {
        T().g();
        io.reactivex.rxjava3.disposables.c cVar = this.p;
        if (cVar != null) {
            cVar.dispose();
        }
        this.o = 0;
        gkw gkwVar = this.l;
        if (gkwVar.e) {
            com.vk.imageloader.stat.a aVar = gkwVar.b;
            gkwVar.d = aVar != null ? aVar.f() : null;
            bpn0 bpn0Var = o360.e;
            o360 a2 = o360.a.a();
            String str = gkwVar.a;
            com.vk.imageloader.stat.a aVar2 = gkwVar.b;
            if (str != null && aVar2 != null) {
                a2.j(str, aVar2);
            }
            gkwVar.b = null;
        }
    }

    public final void c0(ImageRequest imageRequest, ImageRequest imageRequest2, ImageRequest imageRequest3) {
        if (imageRequest == null && imageRequest2 == null && imageRequest3 == null) {
            L.G("VKImageView: cancel empty request");
            return;
        }
        lpa0 lpa0Var = (lpa0) this.j.getValue();
        lpa0Var.g();
        yiz.b(lpa0Var, this.a.getContext(), this.q);
        if (imageRequest3 != null && imageRequest != null) {
            lpa0Var.k(new ImageRequest[]{imageRequest, imageRequest3});
        } else if (imageRequest3 != null) {
            lpa0Var.l(imageRequest3);
        } else if (imageRequest != null) {
            if (epx.f(imageRequest.l(), imageRequest2 != null ? imageRequest2.l() : null)) {
                lpa0Var.l(imageRequest);
            } else {
                lpa0Var.l(imageRequest);
                lpa0Var.m(imageRequest2);
                lpa0Var.p();
            }
        }
        lpa0Var.h(this.e);
        lpa0Var.o(T().e);
        lpa0Var.i(CallerContext.Frontend);
        io.reactivex.rxjava3.disposables.c cVar = this.p;
        if (cVar != null) {
            cVar.dispose();
        }
        this.o = 0;
        this.p = null;
        lpa0Var.j(new ghs(this));
        a.c(imageRequest, this.l);
        a.c(imageRequest3, null);
        a.c(imageRequest2, null);
        a0(lpa0Var.b());
    }

    @Override // xsna.p0v0
    public final void cancel() {
        io.reactivex.rxjava3.disposables.c cVar = this.p;
        if (cVar != null) {
            cVar.dispose();
        }
        this.o = 0;
        if (s()) {
            return;
        }
        a0(null);
    }

    @Override // xsna.p0v0
    public final void clear() {
        io.reactivex.rxjava3.disposables.c cVar = this.p;
        if (cVar != null) {
            cVar.dispose();
        }
        this.o = 0;
        a0(null);
    }

    @Override // xsna.p0v0
    public final boolean d(MotionEvent motionEvent) {
        flo<njt> T = T();
        if (T.e()) {
            return T.e.d(motionEvent);
        }
        return false;
    }

    @Override // xsna.p0v0
    public final void e(boolean z) {
        njt U = U();
        if (U != null) {
            RoundingParams roundingParams = U.c;
            if (roundingParams == null) {
                roundingParams = new RoundingParams();
            }
            roundingParams.i = z;
            U.u(roundingParams);
        }
    }

    @Override // xsna.p0v0
    public final void f(float f) {
        this.b = f;
    }

    @Override // xsna.p0v0
    public final void g(Path path) {
        this.v = path;
    }

    @Override // xsna.p0v0
    public final float h() {
        return this.b;
    }

    @Override // xsna.p0v0
    public final void i(String str) {
        V(str, true, false);
    }

    @Override // xsna.p0v0
    public final void j(boolean z) {
        this.r = z;
    }

    @Override // xsna.p0v0
    public final void k(Drawable drawable, ImageView.ScaleType scaleType) {
        this.C = drawable;
        if (drawable != null) {
            this.B = scaleType;
        }
    }

    @Override // xsna.p0v0
    public final void l(Canvas canvas, dxh dxhVar) {
        msv0 msv0Var = this.H;
        if (msv0Var != null) {
            msv0Var.c();
        }
        Path path = this.v;
        if (path != null) {
            canvas.clipPath(path);
        }
        dxhVar.invoke(canvas);
        bpn0 bpn0Var = o360.e;
        o360 a2 = o360.a.a();
        ArrayList arrayList = this.k;
        a2.i(arrayList);
        gkw gkwVar = this.l;
        if (gkwVar.e) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (gkwVar.c == null && epx.f(arrayList.get(i), gkwVar.a)) {
                    com.vk.imageloader.stat.a aVar = gkwVar.b;
                    gkwVar.c = aVar != null ? aVar.f() : null;
                }
            }
        }
        arrayList.clear();
    }

    @Override // xsna.p0v0
    public final int m() {
        if (T().e != null) {
            return this.x;
        }
        zjt zjtVar = this.a;
        if (zjtVar.getDrawable() != null) {
            return zjtVar.getDrawable().getIntrinsicHeight();
        }
        return 0;
    }

    @Override // xsna.p0v0
    public final boolean n() {
        return this.y;
    }

    @Override // xsna.p0v0
    public final void o(cir cirVar) {
        this.G = cirVar;
    }

    @Override // xsna.p0v0
    public final void p(Uri uri, Uri uri2, Size size) {
        if (uri == null || uri2 == null) {
            N();
            return;
        }
        S();
        ImageRequestBuilder h = ImageRequestBuilder.h(uri);
        ImageRequestBuilder h2 = ImageRequestBuilder.h(uri2);
        a.a(h, size);
        a.a(h2, size);
        W(h2, h);
    }

    @Override // xsna.p0v0
    public final float q() {
        return this.d;
    }

    @Override // xsna.p0v0
    public final void r(jtc0 jtc0Var) {
        mk6 K = jtc0Var != null ? dz5.K(jtc0Var) : null;
        b0(K, K);
    }

    @Override // xsna.p0v0
    public final boolean s() {
        return H() > 0 && m() > 0;
    }

    @Override // xsna.p0v0
    public final void setAspectRatio(float f) {
        if (this.d == f) {
            return;
        }
        this.d = f;
        zjt zjtVar = this.a;
        zjtVar.requestLayout();
        zjtVar.invalidate();
    }

    @Override // xsna.p0v0
    public final void setBackgroundImage(Drawable drawable) {
        njt U = U();
        if (U != null) {
            U.p(drawable, 0);
        }
    }

    @Override // xsna.p0v0
    public final void setColorFilter(ColorFilter colorFilter) {
        njt U = U();
        if (U != null) {
            U.n(colorFilter);
        }
    }

    @Override // xsna.p0v0
    public final void setOnLoadCallback(b780 b780Var) {
        this.z = b780Var;
    }

    @Override // xsna.p0v0
    public final void setPlaceholderColor(int i) {
        njt U = U();
        if (U != null) {
            U.s(new ColorDrawable(i), f5h0.m.a);
        }
    }

    @Override // xsna.p0v0
    public final void setScaleType(ImageView.ScaleType scaleType) {
        this.A = scaleType;
    }

    @Override // xsna.p0v0
    public final void t() {
        njt U = U();
        if (U != null) {
            U.n(null);
        }
    }

    @Override // xsna.p0v0
    public final float u() {
        float f = this.d;
        float f2 = this.c;
        if (f > f2) {
            f = f2;
        }
        float f3 = this.b;
        return f < f3 ? f3 : f;
    }

    @Override // xsna.p0v0
    public final void v(boolean z) {
        njt U = U();
        if (U != null) {
            RoundingParams roundingParams = U.c;
            if (roundingParams == null) {
                roundingParams = new RoundingParams();
            }
            roundingParams.b = z;
            U.u(roundingParams);
        }
    }

    @Override // xsna.p0v0
    public final qhv0 w() {
        msv0 msv0Var = this.H;
        if (msv0Var != null) {
            return msv0Var.b();
        }
        return null;
    }

    @Override // xsna.p0v0
    public final void x(float f, float f2, float f3, float f4) {
        njt U = U();
        if (U != null) {
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.e(f, f2, f3, f4);
            U.u(roundingParams);
        }
    }

    @Override // xsna.p0v0
    public final void y(String str, Size size) {
        if (this.r && str != null && str.equals(this.i) && epx.f(this.s, size)) {
            return;
        }
        if (str == null || str.length() == 0) {
            N();
            return;
        }
        S();
        ImageRequestBuilder h = ImageRequestBuilder.h(Uri.parse(str));
        h.j(new q0v0(liw.a(), size, null));
        W(h, null);
        this.i = str;
        this.u = 0;
        this.t = null;
        this.s = size;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.p0v0
    public final void z(AttributeSet attributeSet) {
        msv0 aVar;
        zjt zjtVar = this.a;
        ojt d = pjt.d(new glo(zjtVar.getContext()), attributeSet);
        d.b = 75;
        ?? r2 = this.f;
        if (r2 != 0) {
            r2.invoke(d);
        }
        setAspectRatio(d.c);
        T().i(d.a());
        cir cirVar = this.G;
        if (cirVar != null) {
            cirVar.invoke(T().d());
        }
        TypedArray obtainStyledAttributes = zjtVar.getContext().obtainStyledAttributes(attributeSet, R$styleable.c);
        if (obtainStyledAttributes.hasValue(0)) {
            this.C = obtainStyledAttributes.getDrawable(0);
        }
        obtainStyledAttributes.recycle();
        dmw dmwVar = mcr0.j;
        msv0 msv0Var = null;
        if ((dmwVar != null ? dmwVar.b : null) != null) {
            this.F = 2;
            this.E = 20000L;
        }
        f5h0.d dVar = d.l;
        if (dVar != null) {
            qhv0 c2 = rhv0.c(dVar);
            if (c2 instanceof qhv0.m) {
                aVar = new msv0.b(c2);
            } else {
                if (!(c2 instanceof qhv0.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new msv0.a((qhv0.l) c2);
            }
            msv0Var = aVar;
        }
        this.H = msv0Var;
    }
}
