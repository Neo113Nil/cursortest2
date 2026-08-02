package com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp;

import android.animation.AnimatorSet;
import android.graphics.PointF;
import android.graphics.Rect;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.search.ui.search.SearchViews;
import com.yandex.go.taxi.order.search.ui.search_views.d;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.BoundingBoxHelper;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.Map;
import defpackage.a3y0;
import defpackage.ah00;
import defpackage.avj0;
import defpackage.bgc;
import defpackage.d82;
import defpackage.ed80;
import defpackage.el00;
import defpackage.es00;
import defpackage.et00;
import defpackage.gh00;
import defpackage.h080;
import defpackage.hf2;
import defpackage.hst;
import defpackage.i2f;
import defpackage.jst;
import defpackage.l390;
import defpackage.m58;
import defpackage.mqg0;
import defpackage.n58;
import defpackage.ndl0;
import defpackage.nnz;
import defpackage.ny61;
import defpackage.ptw;
import defpackage.pzt0;
import defpackage.r8;
import defpackage.scc;
import defpackage.sls;
import defpackage.smz;
import defpackage.st0;
import defpackage.svp0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uz8;
import defpackage.v1e0;
import defpackage.vmz;
import defpackage.wmz;
import defpackage.xm00;
import defpackage.y3u0;
import defpackage.ys0;
import defpackage.yx01;
import defpackage.z1e0;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.k;
import ru.yandex.taxi.order.search.ui.bubbles.PollingBubblesViewImpl;

/* loaded from: classes14.dex */
public final class a extends r8 implements svp0, nnz {
    public final ndl0 A;
    public final uz8 B;
    public final ed80 C;
    public final y3u0 D;
    public final zuj0 E;
    public final smz F;
    public final c G;
    public final el00 H;
    public final a3y0 I;
    public final xm00 J;
    public final int K;
    public float L;
    public float M;
    public ScreenRect N;
    public boolean O;
    public BoundingBox P;
    public Point Q;
    public st0 R;
    public pzt0 S;
    public final l390 c;
    public final tse w;
    public final d x;
    public final hf2 y;
    public final et00 z;

    public a(ah00 ah00Var, h080 h080Var, xm00 xm00Var, l390 l390Var, tse tseVar, d dVar, hf2 hf2Var, et00 et00Var, ndl0 ndl0Var, uz8 uz8Var, ed80 ed80Var, y3u0 y3u0Var, zuj0 zuj0Var, smz smzVar, c cVar, el00 el00Var) {
        super(5, ah00Var);
        this.c = l390Var;
        this.w = tseVar;
        this.x = dVar;
        this.y = hf2Var;
        this.z = et00Var;
        this.A = ndl0Var;
        this.B = uz8Var;
        this.C = ed80Var;
        this.D = y3u0Var;
        this.E = zuj0Var;
        this.F = smzVar;
        this.G = cVar;
        this.H = el00Var;
        this.I = new a3y0(TaxiOrderLogGroup.LONG_SEARCH_V2.getTag(), "LongSearchV2CarOverlay");
        this.J = xm00Var.p();
        this.K = h080Var.a;
        this.P = new BoundingBox();
    }

    @Override // defpackage.nnz
    public final void D0(z1e0 z1e0Var) {
        SearchViews I = this.x.I();
        PollingBubblesViewImpl pollingBubblesView = I != null ? I.getPollingBubblesView() : null;
        if (pollingBubblesView == null) {
            a3y0.a(this.I, new String[]{"startCarPolling: skipped, pollingBubblesView is null"}, null, 6);
            return;
        }
        this.O = true;
        ah00 ah00Var = (ah00) this.b;
        int a = ((avj0) this.E).a(mqg0.white);
        ys0 ys0Var = new ys0(this.K, this.D, 10);
        uz8 uz8Var = this.B;
        xm00 xm00Var = this.J;
        st0 st0Var = new st0(z1e0Var, xm00Var, ah00Var, pollingBubblesView, ys0Var, new v1e0(ah00Var, pollingBubblesView, uz8Var, xm00Var, ys0Var, a, this.E));
        st0Var.o();
        this.R = st0Var;
    }

    @Override // defpackage.nnz
    public final void E0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m58 m58Var = (m58) it.next();
            this.I.getClass();
            a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
            hst hstVar = jst.e;
            n58 n58Var = m58Var.d;
            if (n58Var == null) {
                Point point = m58Var.c;
                xm00 xm00Var = this.J;
                n58Var = new n58(xm00Var.r(point), this.B, m58Var.b, xm00Var);
            }
            n58Var.c(((gh00) ((ah00) this.b)).j());
            m58Var.d = n58Var;
            n58Var.a(n58Var.d);
        }
    }

    @Override // defpackage.nnz
    public final void Ef() {
        ((gh00) ((ah00) this.b)).F(this.P);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Hg(zzs zzsVar, List list, ContinuationImpl continuationImpl) {
        LongSearchV2CarOverlay$buildBoundingBox$1 longSearchV2CarOverlay$buildBoundingBox$1;
        int i;
        int i2;
        int i3;
        float f;
        Point point;
        List list2;
        BoundingBox a;
        if (continuationImpl instanceof LongSearchV2CarOverlay$buildBoundingBox$1) {
            longSearchV2CarOverlay$buildBoundingBox$1 = (LongSearchV2CarOverlay$buildBoundingBox$1) continuationImpl;
            int i4 = longSearchV2CarOverlay$buildBoundingBox$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                longSearchV2CarOverlay$buildBoundingBox$1.label = i4 - Integer.MIN_VALUE;
                Object obj = longSearchV2CarOverlay$buildBoundingBox$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = longSearchV2CarOverlay$buildBoundingBox$1.label;
                int i5 = 0;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ah00 ah00Var = (ah00) this.b;
                    Iterator it = list.iterator();
                    float f2 = 2.1474836E9f;
                    float f3 = -2.1474836E9f;
                    float f4 = -2.1474836E9f;
                    float f5 = 2.1474836E9f;
                    while (it.hasNext()) {
                        ScreenPoint e = ((gh00) ah00Var).e.e((Point) it.next());
                        if (e != null) {
                            float x = e.getX();
                            if (x < f2) {
                                f2 = x;
                            } else if (x > f3) {
                                f3 = x;
                            }
                            float y = e.getY();
                            if (y < f5) {
                                f5 = y;
                            } else if (y > f4) {
                                f4 = y;
                            }
                        }
                    }
                    gh00 gh00Var = (gh00) ah00Var;
                    TaxiMapView h = gh00Var.h();
                    if (h != null) {
                        i3 = h.getWidth();
                        i2 = h.getHeight();
                    } else {
                        i2 = 0;
                        i3 = 0;
                    }
                    float j = (int) gh00Var.j();
                    if (f2 - j > 0.0f) {
                        f = 0.05f;
                        if (f3 + j < i3) {
                            this.L = 0.0f;
                            if (f5 - j > 0.0f || j + f4 >= i2) {
                                this.M = Math.max(f5, f4) - (i2 * f);
                            } else {
                                this.M = 0.0f;
                            }
                            Point F = ru.yandex.taxi.map.utils.a.F(zzsVar);
                            longSearchV2CarOverlay$buildBoundingBox$1.L$0 = list;
                            longSearchV2CarOverlay$buildBoundingBox$1.L$1 = null;
                            longSearchV2CarOverlay$buildBoundingBox$1.L$2 = F;
                            longSearchV2CarOverlay$buildBoundingBox$1.label = 1;
                            if (this.H.a(longSearchV2CarOverlay$buildBoundingBox$1) != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            point = F;
                            list2 = list;
                        }
                    } else {
                        f = 0.05f;
                    }
                    this.L = Math.max(f2, f3) - (i3 * f);
                    if (f5 - j > 0.0f) {
                    }
                    this.M = Math.max(f5, f4) - (i2 * f);
                    Point F2 = ru.yandex.taxi.map.utils.a.F(zzsVar);
                    longSearchV2CarOverlay$buildBoundingBox$1.L$0 = list;
                    longSearchV2CarOverlay$buildBoundingBox$1.L$1 = null;
                    longSearchV2CarOverlay$buildBoundingBox$1.L$2 = F2;
                    longSearchV2CarOverlay$buildBoundingBox$1.label = 1;
                    if (this.H.a(longSearchV2CarOverlay$buildBoundingBox$1) != coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    point = (Point) longSearchV2CarOverlay$buildBoundingBox$1.L$2;
                    list2 = (List) longSearchV2CarOverlay$buildBoundingBox$1.L$0;
                    kotlin.b.b(obj);
                }
                a = k.a(new vmz(i5, this, list2));
                if (a != null) {
                    return BoundingBoxHelper.getBounds(point);
                }
                Point southWest = a.getSouthWest();
                Point northEast = a.getNorthEast();
                return ru.yandex.taxi.map.utils.a.e(0, scc.g(southWest, new Point(point.getLatitude() - (southWest.getLatitude() - point.getLatitude()), point.getLongitude() - (southWest.getLongitude() - point.getLongitude())), northEast, new Point(point.getLatitude() - (northEast.getLatitude() - point.getLatitude()), point.getLongitude() - (northEast.getLongitude() - point.getLongitude()))));
            }
        }
        longSearchV2CarOverlay$buildBoundingBox$1 = new LongSearchV2CarOverlay$buildBoundingBox$1(this, continuationImpl);
        Object obj2 = longSearchV2CarOverlay$buildBoundingBox$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = longSearchV2CarOverlay$buildBoundingBox$1.label;
        int i52 = 0;
        if (i != 0) {
        }
        a = k.a(new vmz(i52, this, list2));
        if (a != null) {
        }
    }

    public final PointF Ig() {
        zzs Lg = this.G.Lg();
        es00 es00Var = ((gh00) ((ah00) this.b)).e;
        es00Var.getClass();
        ScreenPoint e = es00Var.e(ru.yandex.taxi.map.utils.a.F(Lg));
        if (e == null) {
            e = new ScreenPoint(r3.g().centerX(), r3.g().centerY());
        }
        return new PointF(e.getX() - r3.g().centerX(), e.getY() - r3.g().centerY());
    }

    public final void Jg() {
        d dVar = this.x;
        dVar.B0(1.0f);
        Rect g = ((gh00) ((ah00) this.b)).g();
        PointF Ig = Ig();
        PointF pointF = new PointF(g.centerX() + Ig.x, g.centerY() + Ig.y);
        SearchViews I = dVar.I();
        if (I != null) {
            I.setPulsingCirclesViewAnchor(pointF);
        }
    }

    @Override // defpackage.nnz
    public final void Of() {
        this.F.getClass();
    }

    @Override // defpackage.nnz
    public final void P4(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j0((m58) it.next());
        }
    }

    @Override // defpackage.svp0
    public final void attach() {
        this.G.Bg(this);
        Ig();
        this.F.getClass();
        this.x.M1(true);
    }

    @Override // defpackage.svp0
    public final void b9(ScreenRect screenRect) {
        ah00 ah00Var = (ah00) this.b;
        if (screenRect == null) {
            return;
        }
        gh00 gh00Var = (gh00) ah00Var;
        if (ru.yandex.taxi.map.utils.a.C(gh00Var.a.c(), screenRect)) {
            return;
        }
        this.N = screenRect;
        gh00Var.y(this.c, screenRect);
        Ig();
        this.F.getClass();
        Jg();
        st0 st0Var = this.R;
        if (st0Var != null) {
            st0Var.n();
        }
    }

    @Override // defpackage.svp0
    public final void detach() {
        a3y0.a(this.I, new String[]{"detach"}, null, 6);
        st0 st0Var = this.R;
        if (st0Var != null) {
            st0Var.p(new bgc(12));
        }
        xm00 xm00Var = this.J;
        xm00Var.m();
        xm00Var.d();
        ((i2f) this.A.b).setVisible(false);
        d dVar = this.x;
        SearchViews I = dVar.I();
        if (I != null) {
            I.hidePollingBubblesView();
        }
        dVar.a.Cg();
        SearchViews I2 = dVar.I();
        if (I2 != null) {
            I2.setOnMyLocationClickListener(new d82(1));
        }
        dVar.M1(false);
        this.G.Cg();
    }

    @Override // defpackage.nnz
    public final void e4() {
        Ig();
        this.F.getClass();
    }

    @Override // defpackage.nnz
    public final void j0(m58 m58Var) {
        n58 n58Var = m58Var.d;
        if (n58Var != null) {
            n58Var.b();
            m58Var.d = null;
        }
    }

    @Override // defpackage.nnz
    public final void p(sls slsVar) {
        this.I.getClass();
        a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
        hst hstVar = jst.e;
        st0 st0Var = this.R;
        if (st0Var != null) {
            st0Var.p(slsVar);
        }
        this.R = null;
        this.O = false;
    }

    @Override // defpackage.svp0
    public final yx01 p6() {
        return new wmz(this, 1);
    }

    @Override // defpackage.svp0
    public final void pause() {
        this.G.pause();
        this.F.getClass();
        st0 st0Var = this.R;
        if (st0Var != null) {
            AnimatorSet animatorSet = (AnimatorSet) st0Var.C;
            if (animatorSet != null && animatorSet.isRunning()) {
                animatorSet.pause();
            }
            AnimatorSet animatorSet2 = (AnimatorSet) st0Var.D;
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                animatorSet2.pause();
            }
        }
        pzt0 pzt0Var = this.S;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // defpackage.svp0
    public final void resume() {
        gh00 gh00Var = (gh00) ((ah00) this.b);
        gh00Var.J(17.0f);
        this.y.f(true);
        d dVar = this.x;
        dVar.B0(0.0f);
        SearchViews I = dVar.I();
        if (I != null) {
            I.addPollingBubblesView();
        }
        i2f i2fVar = (i2f) this.A.b;
        i2fVar.setVisible(true);
        i2fVar.c.k(1.0f);
        i2fVar.Hg(254.0f);
        this.z.c();
        this.J.k(1.0f);
        this.G.resume();
        st0 st0Var = this.R;
        if (st0Var != null) {
            AnimatorSet animatorSet = (AnimatorSet) st0Var.C;
            if (animatorSet != null && animatorSet.isPaused()) {
                animatorSet.resume();
            }
            AnimatorSet animatorSet2 = (AnimatorSet) st0Var.D;
            if (animatorSet2 != null && animatorSet2.isPaused()) {
                animatorSet2.resume();
            }
        }
        BoundingBox a = k.a(new ptw(24, gh00Var.e.a()));
        if (a != null) {
            this.P = a;
        }
        pzt0 pzt0Var = this.S;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.S = tje.N(this.w, null, null, new LongSearchV2CarOverlay$subscribeForBottomSheetHeightChange$$inlined$safeCollectIn$1(this.C.b, null, this), 3);
        Ig();
        this.F.getClass();
        Jg();
    }

    @Override // defpackage.svp0
    public final yx01 s5() {
        return new wmz(this, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
    
        if (r12 == r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.nnz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u9(ArrayList arrayList, zzs zzsVar, Map.CameraCallback cameraCallback, ContinuationImpl continuationImpl) {
        LongSearchV2CarOverlay$fitZoomToPoints$1 longSearchV2CarOverlay$fitZoomToPoints$1;
        int i;
        BoundingBox boundingBox;
        Map.CameraCallback cameraCallback2;
        Iterator it;
        ah00 ah00Var = (ah00) this.b;
        if (continuationImpl instanceof LongSearchV2CarOverlay$fitZoomToPoints$1) {
            longSearchV2CarOverlay$fitZoomToPoints$1 = (LongSearchV2CarOverlay$fitZoomToPoints$1) continuationImpl;
            int i2 = longSearchV2CarOverlay$fitZoomToPoints$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                longSearchV2CarOverlay$fitZoomToPoints$1.label = i2 - Integer.MIN_VALUE;
                Object obj = longSearchV2CarOverlay$fitZoomToPoints$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = longSearchV2CarOverlay$fitZoomToPoints$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.O) {
                        cameraCallback.onMoveFinished(true);
                        return zy11Var;
                    }
                    longSearchV2CarOverlay$fitZoomToPoints$1.L$0 = null;
                    longSearchV2CarOverlay$fitZoomToPoints$1.L$1 = null;
                    longSearchV2CarOverlay$fitZoomToPoints$1.L$2 = cameraCallback;
                    longSearchV2CarOverlay$fitZoomToPoints$1.label = 1;
                    obj = Hg(zzsVar, arrayList, longSearchV2CarOverlay$fitZoomToPoints$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boundingBox = (BoundingBox) longSearchV2CarOverlay$fitZoomToPoints$1.L$3;
                        cameraCallback2 = (Map.CameraCallback) longSearchV2CarOverlay$fitZoomToPoints$1.L$2;
                        kotlin.b.b(obj);
                        BoundingBox bounds = BoundingBoxHelper.getBounds(boundingBox, this.P);
                        this.P = bounds;
                        ((gh00) ah00Var).A(bounds, cameraCallback2);
                        it = this.G.P.iterator();
                        while (it.hasNext()) {
                            n58 n58Var = ((m58) it.next()).d;
                            if (n58Var != null) {
                                n58Var.c(((gh00) ah00Var).j());
                            }
                        }
                        return zy11Var;
                    }
                    cameraCallback = (Map.CameraCallback) longSearchV2CarOverlay$fitZoomToPoints$1.L$2;
                    kotlin.b.b(obj);
                }
                boundingBox = (BoundingBox) obj;
                if (!ru.yandex.taxi.map.utils.a.p(boundingBox, this.P)) {
                    cameraCallback.onMoveFinished(true);
                    it = this.G.P.iterator();
                    while (it.hasNext()) {
                    }
                    return zy11Var;
                }
                longSearchV2CarOverlay$fitZoomToPoints$1.L$0 = null;
                longSearchV2CarOverlay$fitZoomToPoints$1.L$1 = null;
                longSearchV2CarOverlay$fitZoomToPoints$1.L$2 = cameraCallback;
                longSearchV2CarOverlay$fitZoomToPoints$1.L$3 = boundingBox;
                longSearchV2CarOverlay$fitZoomToPoints$1.label = 2;
                if (this.H.a(longSearchV2CarOverlay$fitZoomToPoints$1) != obj2) {
                    cameraCallback2 = cameraCallback;
                    BoundingBox bounds2 = BoundingBoxHelper.getBounds(boundingBox, this.P);
                    this.P = bounds2;
                    ((gh00) ah00Var).A(bounds2, cameraCallback2);
                    it = this.G.P.iterator();
                    while (it.hasNext()) {
                    }
                    return zy11Var;
                }
                return obj2;
            }
        }
        longSearchV2CarOverlay$fitZoomToPoints$1 = new LongSearchV2CarOverlay$fitZoomToPoints$1(this, continuationImpl);
        Object obj3 = longSearchV2CarOverlay$fitZoomToPoints$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = longSearchV2CarOverlay$fitZoomToPoints$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        boundingBox = (BoundingBox) obj3;
        if (!ru.yandex.taxi.map.utils.a.p(boundingBox, this.P)) {
        }
    }
}
