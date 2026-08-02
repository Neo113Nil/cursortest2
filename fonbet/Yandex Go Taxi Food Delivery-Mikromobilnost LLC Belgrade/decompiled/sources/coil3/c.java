package coil3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import coil3.a;
import coil3.request.NullRequestDataException;
import coil3.size.Precision;
import coil3.size.Scale;
import defpackage.adi0;
import defpackage.aev;
import defpackage.ago;
import defpackage.au50;
import defpackage.b95;
import defpackage.bvf0;
import defpackage.cev;
import defpackage.cg21;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.d1k;
import defpackage.dev;
import defpackage.eev;
import defpackage.ej91;
import defpackage.fg21;
import defpackage.fse;
import defpackage.fuj0;
import defpackage.g67;
import defpackage.gev;
import defpackage.ij3;
import defpackage.ike;
import defpackage.j06;
import defpackage.j6u0;
import defpackage.jl40;
import defpackage.k1d;
import defpackage.l0r;
import defpackage.l8x;
import defpackage.lev;
import defpackage.lse;
import defpackage.m9o;
import defpackage.mev;
import defpackage.mm60;
import defpackage.n93;
import defpackage.nc2;
import defpackage.ny61;
import defpackage.o06;
import defpackage.oav;
import defpackage.oie;
import defpackage.oq90;
import defpackage.pdi0;
import defpackage.pnq0;
import defpackage.q7v;
import defpackage.qje;
import defpackage.qjs0;
import defpackage.qnq0;
import defpackage.qoh;
import defpackage.qoi0;
import defpackage.quj0;
import defpackage.qv31;
import defpackage.s8o;
import defpackage.sac;
import defpackage.su31;
import defpackage.t3v0;
import defpackage.t4x;
import defpackage.t5j0;
import defpackage.tfo;
import defpackage.tje;
import defpackage.uci0;
import defpackage.uey;
import defpackage.uh;
import defpackage.ulo;
import defpackage.umf;
import defpackage.ux21;
import defpackage.v2r;
import defpackage.v67;
import defpackage.vav;
import defpackage.vci0;
import defpackage.vtu0;
import defpackage.w2r;
import defpackage.wls;
import defpackage.xis0;
import defpackage.xx21;
import defpackage.yam;
import defpackage.yc2;
import defpackage.yo40;
import defpackage.yq90;
import defpackage.zb2;
import defpackage.zpg;
import defpackage.zx21;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class c implements oav {
    public static final /* synthetic */ int f = 0;
    public final uci0 a;
    public final ike b = bvf0.a(cvw.U(jl40.a(), new ij3(lse.a, 11)));
    public final au50 c;
    public final a d;
    public volatile /* synthetic */ int e;

    static {
        AtomicIntegerFieldUpdater.newUpdater(c.class, "e");
    }

    public c(uci0 uci0Var) {
        this.a = uci0Var;
        nc2 nc2Var = new nc2(this);
        au50 au50Var = new au50(3, this);
        this.c = au50Var;
        a.C0029a c0029a = new a.C0029a(uci0Var.f);
        cev cevVar = uci0Var.b;
        Object obj = cevVar.n.a.get(cvw.d);
        boolean booleanValue = ((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue();
        int i = 0;
        ArrayList arrayList = c0029a.e;
        if (booleanValue) {
            c0029a.d.add(new vci0(i));
            arrayList.add(new vci0(1));
        }
        c0029a.c(new yc2(), qoi0.a(Uri.class));
        c0029a.c(new fuj0(), qoi0.a(Integer.class));
        c0029a.b(new zb2(), qoi0.a(cg21.class));
        c0029a.a(new n93(), qoi0.a(cg21.class));
        c0029a.a(new oie(), qoi0.a(cg21.class));
        c0029a.a(new quj0(), qoi0.a(cg21.class));
        c0029a.a(new yam(), qoi0.a(Drawable.class));
        uh uhVar = vav.a;
        Object obj2 = cevVar.n.a.get(vav.a);
        pnq0 a = qnq0.a(((Number) (obj2 == null ? 4 : obj2)).intValue());
        Object obj3 = cevVar.n.a.get(vav.c);
        boolean booleanValue2 = ((Boolean) (obj3 == null ? Boolean.TRUE : obj3)).booleanValue();
        Object obj4 = ulo.a;
        if (booleanValue2) {
            Object obj5 = cevVar.n.a.get(vav.b);
            if (((ulo) (obj5 == null ? obj4 : obj5)).equals(obj4)) {
                arrayList.add(new k1d(new j6u0(a), i));
            }
        }
        Object obj6 = cevVar.n.a.get(vav.b);
        arrayList.add(new k1d(new j06(a, (ulo) (obj6 != null ? obj6 : obj4)), i));
        c0029a.c(new l0r(), qoi0.a(File.class));
        c0029a.a(new t4x(), qoi0.a(cg21.class));
        c0029a.a(new v67(), qoi0.a(ByteBuffer.class));
        c0029a.c(new vtu0(), qoi0.a(String.class));
        c0029a.c(new yq90(), qoi0.a(oq90.class));
        c0029a.b(new w2r(), qoi0.a(cg21.class));
        c0029a.b(new fg21(), qoi0.a(cg21.class));
        c0029a.a(new v2r(), qoi0.a(cg21.class));
        c0029a.a(new g67(), qoi0.a(byte[].class));
        c0029a.a(new zpg(), qoi0.a(cg21.class));
        c0029a.a(new o06(), qoi0.a(Bitmap.class));
        c0029a.a.add(new coil3.intercept.a(this, nc2Var, au50Var));
        this.d = c0029a.d();
    }

    public final d1k a(gev gevVar) {
        qoh h = tje.h(this.b, (fse) this.a.c.getValue(), null, new RealImageLoader$enqueue$job$1(this, gevVar, null), 2);
        umf umfVar = gevVar.c;
        return umfVar instanceof umf ? qje.v(umfVar.a).getDisposable(h) : new yo40(h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x01a7, code lost:
    
        if (r3.J(r9) == r10) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x022b A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:15:0x0225, B:17:0x022b, B:19:0x0234, B:21:0x023e, B:22:0x0253, B:23:0x024b, B:24:0x0256, B:26:0x025d, B:30:0x0261, B:32:0x0265, B:34:0x026e, B:36:0x0272, B:37:0x0281, B:39:0x0288, B:40:0x028f, B:41:0x0294), top: B:13:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0261 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:15:0x0225, B:17:0x022b, B:19:0x0234, B:21:0x023e, B:22:0x0253, B:23:0x024b, B:24:0x0256, B:26:0x025d, B:30:0x0261, B:32:0x0265, B:34:0x026e, B:36:0x0272, B:37:0x0281, B:39:0x0288, B:40:0x028f, B:41:0x0294), top: B:13:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bd A[Catch: all -> 0x007c, TryCatch #4 {all -> 0x007c, blocks: (B:83:0x0077, B:84:0x01b6, B:86:0x01bd, B:88:0x01c7, B:90:0x01d3, B:91:0x01e2, B:93:0x01e9, B:94:0x01ec), top: B:82:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e9 A[Catch: all -> 0x007c, TryCatch #4 {all -> 0x007c, blocks: (B:83:0x0077, B:84:0x01b6, B:86:0x01bd, B:88:0x01c7, B:90:0x01d3, B:91:0x01e2, B:93:0x01e9, B:94:0x01ec), top: B:82:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(gev gevVar, int i, ContinuationImpl continuationImpl) {
        RealImageLoader$execute$3 realImageLoader$execute$3;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        t5j0 ueyVar;
        qjs0 qjs0Var;
        gev gevVar2;
        ago agoVar;
        gev gevVar3;
        t5j0 t5j0Var;
        Precision precision;
        Scale scale;
        ImageView.ScaleType scaleType;
        umf umfVar;
        eev eevVar;
        t5j0 t5j0Var2;
        q7v q7vVar;
        ago agoVar2;
        gev gevVar4;
        q7v q7vVar2;
        mev mevVar;
        q7v q7vVar3;
        if (continuationImpl instanceof RealImageLoader$execute$3) {
            realImageLoader$execute$3 = (RealImageLoader$execute$3) continuationImpl;
            int i3 = realImageLoader$execute$3.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                realImageLoader$execute$3.label = i3 - Integer.MIN_VALUE;
                RealImageLoader$execute$3 realImageLoader$execute$32 = realImageLoader$execute$3;
                obj = realImageLoader$execute$32.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realImageLoader$execute$32.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    l8x n = kotlinx.coroutines.a.n(realImageLoader$execute$32.get_context());
                    boolean z = i == 0;
                    au50 au50Var = this.c;
                    au50Var.getClass();
                    c cVar = (c) au50Var.b;
                    umf umfVar2 = gevVar.c;
                    if (umfVar2 instanceof umf) {
                        Lifecycle lifecycle = (Lifecycle) s8o.o(gevVar, lev.d);
                        if (lifecycle == null) {
                            lifecycle = au50.d(gevVar);
                        }
                        ueyVar = new qv31(cVar, gevVar, umfVar2, lifecycle, n);
                    } else {
                        Lifecycle lifecycle2 = (Lifecycle) s8o.o(gevVar, lev.d);
                        if (lifecycle2 == null) {
                            lifecycle2 = z ? au50.d(gevVar) : null;
                        }
                        ueyVar = lifecycle2 != null ? new uey(lifecycle2, n) : new b95(n);
                    }
                    ueyVar.I();
                    Context context = gevVar.a;
                    umf umfVar3 = gevVar.c;
                    aev aevVar = new aev(gevVar, context);
                    aevVar.b = cVar.a.b;
                    dev devVar = gevVar.u;
                    qjs0 qjs0Var2 = devVar.g;
                    if (qjs0Var2 == null) {
                        if (umfVar3 instanceof umf) {
                            View view = umfVar3.a;
                            qjs0Var = ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? qjs0.a : ej91.a(view);
                        } else {
                            qjs0Var = qjs0.a;
                        }
                        aevVar.o = qjs0Var;
                    } else {
                        qjs0Var = qjs0Var2;
                    }
                    if (devVar.h == null) {
                        umf umfVar4 = umfVar3 instanceof umf ? umfVar3 : null;
                        View view2 = umfVar4 != null ? umfVar4.a : null;
                        ImageView imageView = view2 instanceof ImageView ? (ImageView) view2 : null;
                        if (imageView != null) {
                            Bitmap.Config[] configArr = zx21.a;
                            ImageView.ScaleType scaleType2 = imageView.getScaleType();
                            int i4 = scaleType2 == null ? -1 : xx21.a[scaleType2.ordinal()];
                            scale = (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) ? Scale.FIT : Scale.FILL;
                        } else {
                            scale = gevVar.r;
                        }
                        aevVar.p = scale;
                    }
                    if (devVar.i == null) {
                        if (qjs0Var2 == null && jl40.l(qjs0Var, qjs0.a)) {
                            precision = Precision.INEXACT;
                        } else {
                            if ((umfVar3 instanceof umf) && (qjs0Var instanceof su31)) {
                                View view3 = umfVar3.a;
                                if ((view3 instanceof ImageView) && view3 == ((pdi0) ((su31) qjs0Var)).b()) {
                                    precision = Precision.INEXACT;
                                }
                            }
                            precision = Precision.EXACT;
                        }
                        aevVar.q = precision;
                    }
                    gev a = aevVar.a();
                    tfo tfoVar = ago.a;
                    try {
                        if (a.b.equals(mm60.a)) {
                            throw new NullRequestDataException();
                        }
                        ueyVar.start();
                        if (i == 0) {
                            realImageLoader$execute$32.L$0 = ueyVar;
                            realImageLoader$execute$32.L$1 = a;
                            realImageLoader$execute$32.L$2 = tfoVar;
                            realImageLoader$execute$32.label = 1;
                        }
                        t5j0 t5j0Var3 = ueyVar;
                        gevVar3 = a;
                        agoVar = tfoVar;
                        t5j0Var = t5j0Var3;
                    } catch (Throwable th) {
                        th = th;
                        gevVar2 = a;
                        agoVar = tfoVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            q7v q7vVar4 = (q7v) realImageLoader$execute$32.L$3;
                            ago agoVar3 = (ago) realImageLoader$execute$32.L$2;
                            gev gevVar5 = (gev) realImageLoader$execute$32.L$1;
                            t5j0 t5j0Var4 = (t5j0) realImageLoader$execute$32.L$0;
                            try {
                                kotlin.b.b(obj);
                                t5j0Var2 = t5j0Var4;
                                q7vVar = q7vVar4;
                                gevVar4 = gevVar5;
                                agoVar2 = agoVar3;
                                try {
                                    agoVar2.getClass();
                                    fse fseVar = gevVar4.h;
                                    RealImageLoader$execute$result$1 realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(gevVar4, this, (xis0) obj, agoVar2, q7vVar, null);
                                    realImageLoader$execute$32.L$0 = t5j0Var2;
                                    realImageLoader$execute$32.L$1 = gevVar4;
                                    realImageLoader$execute$32.L$2 = agoVar2;
                                    realImageLoader$execute$32.L$3 = null;
                                    realImageLoader$execute$32.label = 3;
                                    obj = tje.k0(fseVar, realImageLoader$execute$result$1, realImageLoader$execute$32);
                                    if (obj != coroutineSingletons) {
                                        gevVar2 = gevVar4;
                                        agoVar = agoVar2;
                                        ueyVar = t5j0Var2;
                                        mevVar = (mev) obj;
                                        if (!(mevVar instanceof t3v0)) {
                                        }
                                        return mevVar;
                                    }
                                    return coroutineSingletons;
                                } catch (Throwable th2) {
                                    th = th2;
                                    gevVar2 = gevVar4;
                                    agoVar = agoVar2;
                                    ueyVar = t5j0Var2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                agoVar = agoVar3;
                                gevVar2 = gevVar5;
                                ueyVar = t5j0Var4;
                            }
                        } else {
                            if (i2 != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            agoVar = (ago) realImageLoader$execute$32.L$2;
                            gevVar2 = (gev) realImageLoader$execute$32.L$1;
                            ueyVar = (t5j0) realImageLoader$execute$32.L$0;
                            try {
                                kotlin.b.b(obj);
                                mevVar = (mev) obj;
                                if (!(mevVar instanceof t3v0)) {
                                    t3v0 t3v0Var = (t3v0) mevVar;
                                    umf umfVar5 = gevVar2.c;
                                    gev gevVar6 = t3v0Var.b;
                                    if (umfVar5 != null) {
                                        q7v q7vVar5 = t3v0Var.a;
                                        wls wlsVar = umfVar5.b;
                                        View view4 = umfVar5.a;
                                        wlsVar.invoke(view4, q7vVar5 instanceof sac ? cma1.j(((sac) q7vVar5).a, view4.getResources()) : cma1.j(q7vVar5, view4.getResources()));
                                    }
                                    agoVar.getClass();
                                    eev eevVar2 = gevVar6.d;
                                    if (eevVar2 != null) {
                                        eevVar2.k(t3v0Var);
                                    }
                                } else {
                                    if (!(mevVar instanceof m9o)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    m9o m9oVar = (m9o) mevVar;
                                    umf umfVar6 = gevVar2.c;
                                    gev gevVar7 = m9oVar.b;
                                    if (umfVar6 != null && (q7vVar3 = m9oVar.a) != null) {
                                        wls wlsVar2 = umfVar6.b;
                                        View view5 = umfVar6.a;
                                        wlsVar2.invoke(view5, cma1.j(q7vVar3, view5.getResources()));
                                    }
                                    agoVar.getClass();
                                    eev eevVar3 = gevVar7.d;
                                    if (eevVar3 != null) {
                                        eevVar3.d(m9oVar);
                                    }
                                }
                                return mevVar;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                        try {
                            if (th instanceof CancellationException) {
                                agoVar.getClass();
                                eev eevVar4 = gevVar2.d;
                                if (eevVar4 != null) {
                                    eevVar4.onCancel();
                                }
                                throw th;
                            }
                            m9o a2 = ux21.a(gevVar2, th);
                            umf umfVar7 = gevVar2.c;
                            gev gevVar8 = a2.b;
                            if (umfVar7 != null && (q7vVar2 = a2.a) != null) {
                                wls wlsVar3 = umfVar7.b;
                                View view6 = umfVar7.a;
                                wlsVar3.invoke(view6, cma1.j(q7vVar2, view6.getResources()));
                            }
                            agoVar.getClass();
                            eev eevVar5 = gevVar8.d;
                            if (eevVar5 != null) {
                                eevVar5.d(a2);
                            }
                            ueyVar.e();
                            return a2;
                        } finally {
                            ueyVar.e();
                        }
                    }
                    agoVar = (ago) realImageLoader$execute$32.L$2;
                    gevVar3 = (gev) realImageLoader$execute$32.L$1;
                    t5j0Var = (t5j0) realImageLoader$execute$32.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        gevVar2 = gevVar3;
                        ueyVar = t5j0Var;
                    }
                }
                gevVar3.getClass();
                umfVar = gevVar3.c;
                if (umfVar != null) {
                    q7v q7vVar6 = (q7v) gevVar3.n.invoke(gevVar3);
                    if (q7vVar6 == null) {
                        q7vVar6 = (q7v) gevVar3.v.h.invoke(gevVar3);
                    }
                    if (q7vVar6 != null) {
                        wls wlsVar4 = umfVar.b;
                        View view7 = umfVar.a;
                        wlsVar4.invoke(view7, cma1.j(q7vVar6, view7.getResources()));
                    }
                }
                agoVar.getClass();
                eevVar = gevVar3.d;
                if (eevVar != null) {
                    eevVar.onStart();
                }
                qjs0 qjs0Var3 = gevVar3.q;
                realImageLoader$execute$32.L$0 = t5j0Var;
                realImageLoader$execute$32.L$1 = gevVar3;
                realImageLoader$execute$32.L$2 = agoVar;
                realImageLoader$execute$32.L$3 = null;
                realImageLoader$execute$32.label = 2;
                obj = qjs0Var3.a(realImageLoader$execute$32);
                if (obj != coroutineSingletons) {
                    t5j0Var2 = t5j0Var;
                    q7vVar = null;
                    agoVar2 = agoVar;
                    gevVar4 = gevVar3;
                    agoVar2.getClass();
                    fse fseVar2 = gevVar4.h;
                    RealImageLoader$execute$result$1 realImageLoader$execute$result$12 = new RealImageLoader$execute$result$1(gevVar4, this, (xis0) obj, agoVar2, q7vVar, null);
                    realImageLoader$execute$32.L$0 = t5j0Var2;
                    realImageLoader$execute$32.L$1 = gevVar4;
                    realImageLoader$execute$32.L$2 = agoVar2;
                    realImageLoader$execute$32.L$3 = null;
                    realImageLoader$execute$32.label = 3;
                    obj = tje.k0(fseVar2, realImageLoader$execute$result$12, realImageLoader$execute$32);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        realImageLoader$execute$3 = new RealImageLoader$execute$3(this, continuationImpl);
        RealImageLoader$execute$3 realImageLoader$execute$322 = realImageLoader$execute$3;
        obj = realImageLoader$execute$322.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = realImageLoader$execute$322.label;
        if (i2 != 0) {
        }
        gevVar3.getClass();
        umfVar = gevVar3.c;
        if (umfVar != null) {
        }
        agoVar.getClass();
        eevVar = gevVar3.d;
        if (eevVar != null) {
        }
        qjs0 qjs0Var32 = gevVar3.q;
        realImageLoader$execute$322.L$0 = t5j0Var;
        realImageLoader$execute$322.L$1 = gevVar3;
        realImageLoader$execute$322.L$2 = agoVar;
        realImageLoader$execute$322.L$3 = null;
        realImageLoader$execute$322.label = 2;
        obj = qjs0Var32.a(realImageLoader$execute$322);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final Object c(gev gevVar, ContinuationImpl continuationImpl) {
        return ((gevVar.c instanceof umf) || (gevVar.q instanceof su31) || ((Lifecycle) s8o.o(gevVar, lev.d)) != null) ? bvf0.n(new RealImageLoader$execute$2(this, gevVar, null), continuationImpl) : b(gevVar, 1, continuationImpl);
    }

    public final adi0 d() {
        return (adi0) this.a.d.getValue();
    }
}
