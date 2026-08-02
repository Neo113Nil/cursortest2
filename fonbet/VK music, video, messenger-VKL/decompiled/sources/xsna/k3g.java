package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.collage.gl.GLCollageView;
import com.vk.photo.editor.features.collage.view.CollageBorderView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.b4p;

/* compiled from: CollageView.kt */
/* loaded from: classes4.dex */
public final class k3g extends FrameLayout implements x1g {
    public dne A;
    public final y0g B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public gzs<? extends p3p> b;
    public gzs<? extends yvj> c;
    public izs<? super n2k0, s3q0> d;
    public wzs<? super Map<n2k0, d2g>, ? super Boolean, s3q0> e;
    public izs<? super n2k0, s3q0> f;
    public izs<? super Map<n2k0, Boolean>, s3q0> g;
    public gzs<s3q0> h;
    public c i;
    public a j;
    public b k;
    public gzs<p0u> l;
    public gzs<? extends n4p> m;
    public final RelativeLayout n;
    public final FrameLayout o;
    public final GLCollageView p;
    public final CollageBorderView q;
    public final View r;
    public w0g s;
    public Map<n2k0, c2g> t;
    public l1g u;
    public f0g v;
    public float w;
    public l1t x;
    public final bpn0 y;
    public boolean z;

    /* compiled from: CollageView.kt */
    public interface a {
        ag5 a();
    }

    /* compiled from: CollageView.kt */
    public interface b {
    }

    /* compiled from: CollageView.kt */
    public interface c {
        edr a();
    }

    /* compiled from: CollageView.kt */
    public static final class d implements gzs {
        public static final d b = new d();

        @Override // xsna.gzs
        public final Object invoke() {
            throw new IllegalStateException("GlShadersCodeRepository not provided");
        }
    }

    public k3g(Context context) {
        super(context, null);
        this.l = d.b;
        this.v = f0g.f;
        this.y = new bpn0(new c6(6));
        View inflate = LayoutInflater.from(context).inflate(R.layout.collage_view, (ViewGroup) null);
        inflate.setClipToOutline(true);
        addView(inflate);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.collageMainWrapper);
        this.n = relativeLayout;
        this.p = (GLCollageView) findViewById(R.id.glCollageView);
        this.o = (FrameLayout) findViewById(R.id.gridWrapper);
        this.q = (CollageBorderView) findViewById(R.id.borderView);
        this.r = findViewById(R.id.selection);
        relativeLayout.setClipToOutline(true);
        this.B = new y0g(context);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.C = msy.a(lazyThreadSafetyMode, new ms5(context, 1));
        this.D = msy.a(lazyThreadSafetyMode, new g3g(context, 0));
        this.E = msy.a(lazyThreadSafetyMode, new h3g(context, 0));
        this.F = msy.a(lazyThreadSafetyMode, new oo(context, 25));
        this.G = msy.a(lazyThreadSafetyMode, new i3g(context, 0));
        this.H = msy.a(lazyThreadSafetyMode, new j3g(context, 0));
        this.I = msy.a(lazyThreadSafetyMode, new d3g(context));
        this.J = msy.a(lazyThreadSafetyMode, new byd(context, 1));
        this.K = msy.a(lazyThreadSafetyMode, new e3g(context, 0));
        this.L = msy.a(lazyThreadSafetyMode, new ca(context, 24));
        this.M = msy.a(lazyThreadSafetyMode, new f3g(context, 0));
        this.N = msy.a(lazyThreadSafetyMode, new uo6(context, 1));
    }

    public static s3q0 b(k3g k3gVar) {
        k3gVar.getMainHandler().post(new oo6(k3gVar, 2));
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final z0g getCollageGridView2Horizontal() {
        return (z0g) this.D.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final a1g getCollageGridView2Vertical() {
        return (a1g) this.C.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final b1g getCollageGridView3Bottom() {
        return (b1g) this.J.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final c1g getCollageGridView3Horizontal() {
        return (c1g) this.F.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final d1g getCollageGridView3Left() {
        return (d1g) this.G.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final e1g getCollageGridView3Right() {
        return (e1g) this.H.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final f1g getCollageGridView3Top() {
        return (f1g) this.I.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final g1g getCollageGridView3Vertical() {
        return (g1g) this.E.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final h1g getCollageGridView4() {
        return (h1g) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final i1g getCollageGridView4Shift1() {
        return (i1g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final j1g getCollageGridView4Shift2() {
        return (j1g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final k1g getCollageGridView5() {
        return (k1g) this.N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler getMainHandler() {
        return (Handler) this.y.getValue();
    }

    @Override // xsna.x1g
    public final void a(z1g z1gVar) {
        l1t l1tVar = this.x;
        if (l1tVar == null) {
            l1tVar = null;
        }
        l1tVar.getClass();
        HashSet hashSet = new HashSet();
        Collection<m1t> values = l1tVar.g.values();
        ArrayList arrayList = new ArrayList(c5g.u(values, 10));
        for (m1t m1tVar : values) {
            hashSet.add(m1tVar.i);
            arrayList.add(m1t.a(m1tVar, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED));
        }
        l1tVar.o = new h1t(z1gVar, arrayList, l1tVar);
        n4p n4pVar = (n4p) l1tVar.f.invoke();
        if (n4pVar != null) {
            n4pVar.d("VkPhotoEditorGLCollageController: export: imagesToLoad=" + hashSet);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            e4p e4pVar = (e4p) it.next();
            l1tVar.p.c(new j1t(e4pVar, l1tVar.k ? f4p.a(e4pVar, false) : b4p.a.C2587a.e, l1tVar, false));
            boolean z = l1tVar.k;
            if (z) {
                l1tVar.p.c(new j1t(e4pVar, z ? f4p.a(e4pVar, true) : b4p.a.b.e, l1tVar, true));
            }
        }
    }

    public final void d(w1g w1gVar) {
        l1g l1gVar;
        edr a2;
        ag5 a3;
        edr a4;
        g2g g2gVar = w1gVar.g;
        f0g f0gVar = w1gVar.f;
        float f = w1gVar.d;
        this.t = g2gVar.a;
        w0g w0gVar = this.s;
        w0g w0gVar2 = w1gVar.b;
        boolean f2 = epx.f(w0gVar, w0gVar2);
        f0g f0gVar2 = f0g.f;
        if (f2) {
            c cVar = this.i;
            if (cVar != null && (a4 = cVar.a()) != null) {
                l1t l1tVar = this.x;
                if (l1tVar == null) {
                    l1tVar = null;
                }
                l1tVar.u.setValue(a4);
                l1tVar.a.b();
            }
            a aVar = this.j;
            if (aVar != null && (a3 = aVar.a()) != null) {
                l1t l1tVar2 = this.x;
                if (l1tVar2 == null) {
                    l1tVar2 = null;
                }
                l1tVar2.b(a3);
            }
            l1g l1gVar2 = this.u;
            if (l1gVar2 != null) {
                l1gVar2.a(w1gVar);
            }
            l1t l1tVar3 = this.x;
            if (l1tVar3 == null) {
                l1tVar3 = null;
            }
            l1tVar3.d(w0gVar2, g2gVar);
            if (!epx.f(f0gVar, this.v)) {
                if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f0gVar2 = f0gVar;
                }
                l1t l1tVar4 = this.x;
                if (l1tVar4 == null) {
                    l1tVar4 = null;
                }
                l1tVar4.c(f0gVar2.b);
                this.v = f0gVar;
            }
            if (f != this.w) {
                l1t l1tVar5 = this.x;
                (l1tVar5 != null ? l1tVar5 : null).c(this.v.b);
                g(w1gVar);
            }
        } else {
            if (epx.f(w0gVar2, neu.a)) {
                l1gVar = this.B;
                e(l1gVar);
            } else if (epx.f(w0gVar2, peu.a)) {
                l1gVar = getCollageGridView2Vertical();
                e(l1gVar);
            } else if (epx.f(w0gVar2, oeu.a)) {
                l1gVar = getCollageGridView2Horizontal();
                e(l1gVar);
            } else if (epx.f(w0gVar2, veu.a)) {
                l1gVar = getCollageGridView3Vertical();
                e(l1gVar);
            } else if (epx.f(w0gVar2, reu.a)) {
                l1gVar = getCollageGridView3Horizontal();
                e(l1gVar);
            } else if (epx.f(w0gVar2, seu.a)) {
                l1gVar = getCollageGridView3Left();
                e(l1gVar);
            } else if (epx.f(w0gVar2, teu.a)) {
                l1gVar = getCollageGridView3Right();
                e(l1gVar);
            } else if (epx.f(w0gVar2, ueu.a)) {
                l1gVar = getCollageGridView3Top();
                e(l1gVar);
            } else if (epx.f(w0gVar2, qeu.a)) {
                l1gVar = getCollageGridView3Bottom();
                e(l1gVar);
            } else if (epx.f(w0gVar2, weu.a)) {
                l1gVar = getCollageGridView4();
                e(l1gVar);
            } else if (epx.f(w0gVar2, xeu.a)) {
                l1gVar = getCollageGridView4Shift1();
                e(l1gVar);
            } else if (epx.f(w0gVar2, yeu.a)) {
                l1gVar = getCollageGridView4Shift2();
                e(l1gVar);
            } else if (epx.f(w0gVar2, zeu.a)) {
                l1gVar = getCollageGridView5();
                e(l1gVar);
            } else {
                l1gVar = null;
            }
            l1g l1gVar3 = this.u;
            if (l1gVar3 != null) {
                l1gVar3.setOnSlotClick(null);
                l1gVar3.setOnSlotTransform(null);
                l1gVar3.setOnSlotTransformEnd(null);
            }
            RelativeLayout relativeLayout = this.n;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(relativeLayout.getLayoutParams());
            boolean z = w0gVar2 instanceof neu;
            int floor = (int) Math.floor((z ? 0 : 2) * Resources.getSystem().getDisplayMetrics().density);
            layoutParams.setMargins(floor, floor, floor, floor);
            relativeLayout.setLayoutParams(layoutParams);
            GLCollageView gLCollageView = this.p;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(gLCollageView.getLayoutParams());
            int floor2 = (int) Math.floor((z ? 0.0f : 0.25f) * Resources.getSystem().getDisplayMetrics().density);
            layoutParams2.setMargins(floor2, floor2, floor2, floor2);
            gLCollageView.setLayoutParams(layoutParams2);
            this.u = l1gVar;
            w0g w0gVar3 = this.s;
            this.s = w0gVar2;
            c cVar2 = this.i;
            if (cVar2 != null && (a2 = cVar2.a()) != null) {
                l1t l1tVar6 = this.x;
                if (l1tVar6 == null) {
                    l1tVar6 = null;
                }
                l1tVar6.u.setValue(a2);
                l1tVar6.a.b();
            }
            l1g l1gVar4 = this.u;
            if (l1gVar4 != null) {
                l1gVar4.a(w1gVar);
            }
            FrameLayout frameLayout = this.o;
            frameLayout.removeAllViews();
            frameLayout.addView(l1gVar);
            boolean z2 = w1gVar instanceof gfp;
            if (z2 || w0gVar3 == null) {
                l1t l1tVar7 = this.x;
                if (l1tVar7 == null) {
                    l1tVar7 = null;
                }
                l1tVar7.d(w0gVar2, g2gVar);
            }
            if (!epx.f(f0gVar, this.v)) {
                if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f0gVar2 = f0gVar;
                }
                l1t l1tVar8 = this.x;
                (l1tVar8 != null ? l1tVar8 : null).c(f0gVar2.b);
                this.v = f0gVar;
            }
            g(w1gVar);
            com.vk.movika.sdk.base.ui.k kVar = new com.vk.movika.sdk.base.ui.k(5, this, w1gVar);
            if (!z2 && l1gVar != null) {
                fyt0.b(l1gVar, new h57(5, this, kVar));
            }
        }
        CollageBorderView collageBorderView = this.q;
        collageBorderView.setGrid(w0gVar2);
        collageBorderView.setColor(f0gVar);
        collageBorderView.setBorderWidth(f);
        collageBorderView.setCornerRadius(w1gVar.e);
        collageBorderView.invalidate();
    }

    public final void e(l1g l1gVar) {
        l1gVar.setOnSlotClick(new cqf(this, 2));
        l1gVar.setOnSlotTransform(new w1(this, 1));
        l1gVar.setOnSlotTransformEnd(new r6(this, 26));
    }

    public final void f(n2k0 n2k0Var) {
        c2g c2gVar;
        l1g l1gVar = this.u;
        if (l1gVar != null) {
            l1gVar.setSlotSelected(n2k0Var);
        }
        View view = this.r;
        if (n2k0Var == null) {
            view.setVisibility(8);
            return;
        }
        Map<n2k0, c2g> map = this.t;
        if (map == null || (c2gVar = map.get(n2k0Var)) == null) {
            return;
        }
        RelativeLayout relativeLayout = this.n;
        int width = relativeLayout.getWidth();
        int height = relativeLayout.getHeight();
        float f = width;
        float f2 = c2gVar.a * f;
        float f3 = height;
        float f4 = c2gVar.b * f3;
        float f5 = c2gVar.c * f;
        float f6 = c2gVar.d * f3;
        int floor = (int) Math.floor(4.0f * Resources.getSystem().getDisplayMetrics().density);
        view.setVisibility(0);
        view.setTranslationX(f2);
        view.setTranslationY(f4);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        float f7 = floor;
        layoutParams.width = an10.b(f5 + f7);
        layoutParams.height = an10.b(f6 + f7);
        view.setLayoutParams(layoutParams);
        view.invalidate();
    }

    public final void g(w1g w1gVar) {
        float f = w1gVar.d;
        int b2 = an10.b(((f / 100) * (Math.max(((View) getParent()).getWidth(), ((View) getParent()).getHeight()) * 0.08f)) / 2.0f);
        l1g l1gVar = this.u;
        ViewGroup.LayoutParams layoutParams = l1gVar != null ? l1gVar.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMargins(b2, b2, b2, b2);
            l1g l1gVar2 = this.u;
            if (l1gVar2 != null) {
                l1gVar2.setLayoutParams(layoutParams2);
            }
        }
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            l1t l1tVar = this.x;
            (l1tVar != null ? l1tVar : null).c(-16777216);
        }
        this.w = f;
    }

    public final a getAutoEnhanceParamsProvider() {
        return this.j;
    }

    public final b getColorGradingParamsProvider() {
        return this.k;
    }

    public final gzs<yvj> getCoroutineScopeProvider() {
        gzs gzsVar = this.c;
        if (gzsVar != null) {
            return gzsVar;
        }
        return null;
    }

    public final c getFilterParamsProvider() {
        return this.i;
    }

    public final gzs<p3p> getImageFactoryProvider() {
        gzs gzsVar = this.b;
        if (gzsVar != null) {
            return gzsVar;
        }
        return null;
    }

    public final gzs<n4p> getLoggerProvider() {
        return this.m;
    }

    public final gzs<s3q0> getOnLowMemoryError() {
        return this.h;
    }

    public final izs<n2k0, s3q0> getOnSlotClick() {
        return this.d;
    }

    public final izs<n2k0, s3q0> getOnSlotTransformEnd() {
        return this.f;
    }

    public final izs<Map<n2k0, Boolean>, s3q0> getOnSlotsLoadingStatusChange() {
        return this.g;
    }

    public final wzs<Map<n2k0, d2g>, Boolean, s3q0> getOnSlotsTransform() {
        return this.e;
    }

    public final gzs<p0u> getShadersCodeRepositoryProvider() {
        return this.l;
    }

    public final void setAutoEnhanceParamsProvider(a aVar) {
        this.j = aVar;
    }

    public final void setColorGradingParamsProvider(b bVar) {
        this.k = bVar;
    }

    public final void setCoroutineScopeProvider(gzs<? extends yvj> gzsVar) {
        this.c = gzsVar;
    }

    public final void setFilterParamsProvider(c cVar) {
        this.i = cVar;
    }

    public final void setImageFactoryProvider(gzs<? extends p3p> gzsVar) {
        this.b = gzsVar;
    }

    public final void setLoggerProvider(gzs<? extends n4p> gzsVar) {
        this.m = gzsVar;
    }

    public final void setOnLowMemoryError(gzs<s3q0> gzsVar) {
        this.h = gzsVar;
    }

    public final void setOnSlotClick(izs<? super n2k0, s3q0> izsVar) {
        this.d = izsVar;
    }

    public final void setOnSlotTransformEnd(izs<? super n2k0, s3q0> izsVar) {
        this.f = izsVar;
    }

    public final void setOnSlotsLoadingStatusChange(izs<? super Map<n2k0, Boolean>, s3q0> izsVar) {
        this.g = izsVar;
    }

    public final void setOnSlotsTransform(wzs<? super Map<n2k0, d2g>, ? super Boolean, s3q0> wzsVar) {
        this.e = wzsVar;
    }

    public final void setShadersCodeRepositoryProvider(gzs<p0u> gzsVar) {
        this.l = gzsVar;
    }
}
