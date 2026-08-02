package defpackage;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.delivery.utils.dialogmanager.impl.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.cxq0;
import defpackage.e230;
import defpackage.mqg0;
import defpackage.v130;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import ru.yandex.taxi.design.utils.a;
import ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.e;
import ru.yandex.taxi.logistics.sdk.dashboard.storage.c;
import ru.yandex.taxi.masstransit.detailedroute.overlay.d;
import ru.yandex.taxi.masstransit.detailedroute.router.MtDetailedRouteOverlayRouter$showPlusBadge$modal$1;
import ru.yandex.taxi.masstransit.experiment.d0;
import ru.yandex.taxi.masstransit.overlay.onmap.i;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes5.dex */
public final class lzh extends h55 {
    public final /* synthetic */ int D = 1;
    public final Context E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public Object J;
    public Object K;

    public lzh(yvf0 yvf0Var, o4i o4iVar, a5i a5iVar, a3v a3vVar, w030 w030Var, Context context, a aVar) {
        super(null);
        this.F = yvf0Var;
        this.G = o4iVar;
        this.H = a5iVar;
        this.I = a3vVar;
        this.E = context;
        this.J = aVar;
        this.K = new bmh(9, w030Var, this);
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        switch (this.D) {
            case 1:
                if (((hg30) obj).i) {
                    final Context context = this.E;
                    View inflate = LayoutInflater.from(context).inflate(uqh0.mt_detailed_route_cashback_view, (ViewGroup) null, false);
                    if (inflate == null) {
                        ny61.t("rootView");
                        break;
                    } else {
                        final GoFrameLayout goFrameLayout = (GoFrameLayout) inflate;
                        final cxq0 a = ((t0w0) ((w49) this.G)).a(goFrameLayout);
                        if (goFrameLayout.isAttachedToWindow()) {
                            a.D();
                        } else {
                            goFrameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.masstransit.detailedroute.router.MtDetailedRouteOverlayRouter$showPlusBadge$$inlined$doOnAttach$1
                                @Override // android.view.View.OnAttachStateChangeListener
                                public void onViewAttachedToWindow(View view) {
                                    goFrameLayout.removeOnAttachStateChangeListener(this);
                                    ((cxq0) a).D();
                                }

                                @Override // android.view.View.OnAttachStateChangeListener
                                public void onViewDetachedFromWindow(View view) {
                                }
                            });
                        }
                        if (goFrameLayout.isAttachedToWindow()) {
                            goFrameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.masstransit.detailedroute.router.MtDetailedRouteOverlayRouter$showPlusBadge$$inlined$doOnDetach$1
                                @Override // android.view.View.OnAttachStateChangeListener
                                public void onViewAttachedToWindow(View view) {
                                }

                                @Override // android.view.View.OnAttachStateChangeListener
                                public void onViewDetachedFromWindow(View view) {
                                    goFrameLayout.removeOnAttachStateChangeListener(this);
                                    ((cxq0) a).z();
                                }
                            });
                        } else {
                            a.z();
                        }
                        ModalView modalView = new ModalView(goFrameLayout, context) { // from class: ru.yandex.taxi.masstransit.detailedroute.router.MtDetailedRouteOverlayRouter$showPlusBadge$modal$1
                            {
                                super(context);
                                setAnimateOnAppearing(false);
                                setEnableBackgroundOnAppearing(false);
                                setClipChildren(false);
                                setClipToPadding(false);
                                addView(goFrameLayout, new FrameLayout.LayoutParams(-2, -2, 8388661));
                            }

                            @Override // ru.yandex.taxi.widget.ModalView
                            /* renamed from: backgroundColor */
                            public int getBackgroundColor() {
                                return mqg0.transparent;
                            }

                            @Override // ru.yandex.taxi.widget.ModalView
                            /* renamed from: contentView */
                            public View getContent() {
                                return this;
                            }

                            @Override // ru.yandex.taxi.widget.ModalView
                            public e230 insetsType() {
                                return new v130(3);
                            }

                            @Override // ru.yandex.taxi.widget.ModalView, android.view.View
                            public boolean onTouchEvent(MotionEvent event) {
                                return false;
                            }
                        };
                        this.K = modalView;
                        ((w030) this.F).s(modalView, false);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.h55
    public void H(Object obj) {
        switch (this.D) {
            case 1:
                MtDetailedRouteOverlayRouter$showPlusBadge$modal$1 mtDetailedRouteOverlayRouter$showPlusBadge$modal$1 = (MtDetailedRouteOverlayRouter$showPlusBadge$modal$1) this.K;
                if (mtDetailedRouteOverlayRouter$showPlusBadge$modal$1 != null) {
                    ((w030) this.F).l(mtDetailedRouteOverlayRouter$showPlusBadge$modal$1);
                }
                this.K = null;
                break;
        }
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        switch (this.D) {
            case 1:
                ru.yandex.taxi.masstransit.detailedroute.overlay.a aVar = (ru.yandex.taxi.masstransit.detailedroute.overlay.a) this.J;
                if (aVar != null) {
                    aVar.k = null;
                    aVar.a.Cg();
                    aVar.g.detach();
                    fw30 fw30Var = aVar.i;
                    if (fw30Var != null) {
                        fw30Var.a();
                    }
                    xm00 xm00Var = aVar.j;
                    if (xm00Var != null) {
                        xm00Var.d();
                    }
                    xm00 xm00Var2 = aVar.j;
                    if (xm00Var2 != null) {
                        xm00Var2.m();
                    }
                    aVar.j = null;
                    aVar.f.b();
                    ((z9x0) aVar.e).b();
                }
                this.J = null;
                break;
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        switch (this.D) {
            case 0:
                y8g u = bvf0.u();
                gjz gjzVar = u.a;
                Application application = (Application) gjzVar.b.c;
                q5z.h(application);
                t0k0 t0k0Var = (t0k0) u.m.get();
                b bVar = (b) u.a0.get();
                yuj0 yuj0Var = (yuj0) u.l0.get();
                hjz h = u.h();
                dci b = gjzVar.b();
                q5z.h(b);
                c cVar = (c) u.r0.get();
                jwh a = gjzVar.a();
                q5z.h(a);
                hwy0 c = gjzVar.c();
                new qcp0();
                c5i c5iVar = (c5i) u.d1.get();
                qdc qdcVar = (qdc) u.V0.get();
                st2 st2Var = (st2) u.c.get();
                m mVar = new m();
                mVar.a = t0k0Var;
                mVar.b = bVar;
                mVar.c = yuj0Var;
                mVar.d = h;
                mVar.e = cVar;
                mVar.f = a;
                mVar.g = c;
                mVar.h = c5iVar;
                mVar.i = qdcVar;
                mVar.j = st2Var;
                bmh bmhVar = (bmh) this.K;
                Double d = ((n4i) ((o4i) this.G).a.c()).c;
                prb prbVar = new prb(TimeUnit.SECONDS.toMillis((long) (d != null ? d.doubleValue() : 10.0d)));
                jzh jzhVar = new jzh(this, 0);
                int i = 1;
                jzh jzhVar2 = new jzh(this, 1);
                czh czhVar = (czh) bmhVar.invoke();
                vbb vbbVar = new vbb(new csb(czhVar, jzhVar, jzhVar2), prbVar);
                xxf xxfVar = new xxf(vbbVar, i);
                int i2 = 4;
                wxf wxfVar = new wxf(mVar, i2);
                int i3 = 3;
                xvf0 b2 = i5m.b(new srb(new wxf(mVar, i3), i2));
                wxf wxfVar2 = new wxf(mVar, i);
                xvf0 b3 = i5m.b(zrb.a);
                xvf0 b4 = i5m.b(new qrb(xxfVar, wxfVar, b2, wxfVar2, b3, 0));
                int i4 = 2;
                xvf0 b5 = i5m.b(new f2b(i5m.b(new srb(new wxf(mVar, 7), i)), new srb(new xat(wdc.a, 20), i4), new xxf(vbbVar, 0), i3));
                xvf0 b6 = i5m.b(urb.a);
                xvf0 b7 = i5m.b(wrb.a);
                xvf0 b8 = i5m.b(new wvq(b2, b3, wxfVar2, b5, b6, b7, 0));
                wxf wxfVar3 = new wxf(mVar, 9);
                wxf wxfVar4 = new wxf(mVar, 8);
                peb pebVar = new peb(new wxf(mVar, i4), 6);
                qh4 qh4Var = new qh4(wxfVar4, pebVar);
                tgb0 tgb0Var = new tgb0((xvf0) g17.a, (xvf0) qh4Var, (xvf0) pebVar, 11, (byte) 0);
                yk4 yk4Var = new yk4(pebVar, i);
                c1 c1Var = new c1(b4, 5);
                p6f p6fVar = new p6f(new wxf(mVar, 0), 7);
                wxf wxfVar5 = new wxf(mVar, 6);
                qrb qrbVar = new qrb((xvf0) tgb0Var, (xvf0) new e3u((xvf0) qh4Var, (xvf0) yk4Var, (xvf0) new ncb(c1Var, pebVar, qh4Var, b7, p6fVar, wxfVar5), 1), (xvf0) vxi.a, b7, (xvf0) nkt0.a, 2, (byte) 0);
                int i5 = 5;
                xvf0 b9 = i5m.b(new xea(xxfVar, b4, b8, i5m.b(new ht0(24, new srb(new can(wxfVar5, new wxf(mVar, i5), i5), 0), b6, wxfVar3, b7, qrbVar, b2, b4, false)), 18));
                xvf0 b10 = i5m.b(new qrb((xvf0) oms0.a, (xvf0) new vm80(b9, b4, 22), (xvf0) cyi.a, (xvf0) ieu.a, (xvf0) wkt0.a, 1, false));
                lhg lhgVar = new lhg(a);
                ArrayList arrayList = new ArrayList(1);
                Collection collection = (Collection) b10.get();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    q5z.g(it.next(), "Set contributions cannot be null");
                }
                arrayList.addAll(collection);
                czh.a(czhVar, new izh(new cxm(new aoi(new boj0(application, b, lhgVar, c, new tgg(arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList))), (e) b9.get(), 10), (prb) vbbVar.b, (csb) vbbVar.a)), null, null, null, null, null, 8190));
                break;
            default:
                hg30 hg30Var = (hg30) obj;
                jg30 jg30Var = (jg30) this.H;
                gg30 gg30Var = (gg30) this.I;
                su30 su30Var = hg30Var.a;
                su30 su30Var2 = hg30Var.b;
                fay0 fay0Var = hg30Var.c;
                kf30 kf30Var = hg30Var.d;
                mz30 mz30Var = hg30Var.e;
                boolean z = hg30Var.f;
                tpr tprVar = hg30Var.h;
                boolean z2 = hg30Var.j;
                yuf0 yuf0Var = gg30Var.a;
                d dVar = new d(su30Var, su30Var2, fay0Var, kf30Var, mz30Var, z, tprVar, z2, (ah00) ((xvf0) yuf0Var.a).get(), (tt2) ((xvf0) yuf0Var.b).get(), (a3v) ((xvf0) yuf0Var.c).get(), (i) ((zw30) yuf0Var.d).get(), (ru.yandex.taxi.masstransit.detailedroute.interactor.a) ((lcw) yuf0Var.e).get(), (d0) ((xvf0) yuf0Var.f).get());
                q6s0 q6s0Var = hg30Var.g;
                xi40 xi40Var = hg30Var.k;
                oo2 oo2Var = jg30Var.a;
                ru.yandex.taxi.masstransit.detailedroute.overlay.a aVar = new ru.yandex.taxi.masstransit.detailedroute.overlay.a(dVar, q6s0Var, xi40Var, (ah00) ((xvf0) oo2Var.a).get(), (y9x0) ((xvf0) oo2Var.b).get(), (ru.yandex.taxi.masstransit.overlay.e) ((xvf0) oo2Var.c).get(), (uo21) ((xvf0) oo2Var.w).get(), (gw30) ((i020) oo2Var.x).get());
                this.J = aVar;
                aVar.a();
                break;
        }
    }

    public lzh(Context context, w030 w030Var, w49 w49Var, jg30 jg30Var, gg30 gg30Var) {
        super(null);
        this.E = context;
        this.F = w030Var;
        this.G = w49Var;
        this.H = jg30Var;
        this.I = gg30Var;
    }
}
