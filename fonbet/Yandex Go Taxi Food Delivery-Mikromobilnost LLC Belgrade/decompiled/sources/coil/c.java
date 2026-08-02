package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import coil.a;
import coil.request.NullRequestDataException;
import coil.util.SystemCallbacks;
import defpackage.bdi0;
import defpackage.bev;
import defpackage.bvf0;
import defpackage.c95;
import defpackage.cgo;
import defpackage.cvw;
import defpackage.d0r;
import defpackage.f270;
import defpackage.fev;
import defpackage.g1k;
import defpackage.gg21;
import defpackage.guj0;
import defpackage.hev;
import defpackage.i3y;
import defpackage.ij3;
import defpackage.ike;
import defpackage.iwu;
import defpackage.jax0;
import defpackage.jl40;
import defpackage.jse;
import defpackage.k06;
import defpackage.kwu;
import defpackage.l67;
import defpackage.l8x;
import defpackage.m;
import defpackage.n9o;
import defpackage.nev;
import defpackage.nv31;
import defpackage.nwu;
import defpackage.ny61;
import defpackage.o400;
import defpackage.o93;
import defpackage.p06;
import defpackage.pie;
import defpackage.qav;
import defpackage.qhw0;
import defpackage.qoh;
import defpackage.qy01;
import defpackage.rjs0;
import defpackage.ruj0;
import defpackage.rv31;
import defpackage.se60;
import defpackage.sjh;
import defpackage.suj0;
import defpackage.tig0;
import defpackage.tih;
import defpackage.tje;
import defpackage.u3v0;
import defpackage.u5j0;
import defpackage.uav;
import defpackage.uyj;
import defpackage.uzq;
import defpackage.w67;
import defpackage.wis0;
import defpackage.wtu0;
import defpackage.wx01;
import defpackage.x2r;
import defpackage.xpb1;
import defpackage.zam;
import defpackage.zfo;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes.dex */
public final class c implements qav {
    public final Context a;
    public final tih b;
    public final i3y c;
    public final zfo d;
    public final uav e;
    public final ike f;
    public final tig0 g;
    public final a h;
    public final ArrayList i;

    public c(Context context, tih tihVar, i3y i3yVar, i3y i3yVar2, i3y i3yVar3, zfo zfoVar, a aVar, uav uavVar) {
        this.a = context;
        this.b = tihVar;
        this.c = i3yVar;
        this.d = zfoVar;
        this.e = uavVar;
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        this.f = bvf0.a(cvw.U(a, o400.a.x).plus(new ij3(this)));
        SystemCallbacks systemCallbacks = new SystemCallbacks(this);
        tig0 tig0Var = new tig0(this, systemCallbacks);
        this.g = tig0Var;
        a.C0028a c0028a = new a.C0028a(aVar);
        c0028a.b(new nwu(), kwu.class);
        c0028a.b(new wtu0(), String.class);
        c0028a.b(new x2r(), Uri.class);
        c0028a.b(new suj0(), Uri.class);
        c0028a.b(new guj0(), Integer.class);
        c0028a.b(new l67(), byte[].class);
        Pair pair = new Pair(new gg21(), Uri.class);
        ArrayList arrayList = c0028a.c;
        arrayList.add(pair);
        arrayList.add(new Pair(new d0r(uavVar.a), File.class));
        c0028a.a(new iwu(i3yVar3, i3yVar2, uavVar.c), Uri.class);
        c0028a.a(new uzq(), File.class);
        c0028a.a(new o93(), Uri.class);
        c0028a.a(new pie(), Uri.class);
        c0028a.a(new ruj0(), Uri.class);
        c0028a.a(new zam(), Drawable.class);
        c0028a.a(new p06(), Bitmap.class);
        c0028a.a(new w67(), ByteBuffer.class);
        c0028a.e.add(new k06(uavVar.d, uavVar.e));
        a c = c0028a.c();
        this.h = c;
        this.i = kotlin.collections.a.o0(c.a, new coil.intercept.a(this, systemCallbacks, tig0Var));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(2:3|(13:5|6|(5:(1:(1:(9:11|12|13|14|15|16|(1:18)(2:22|(1:24))|19|20)(2:51|52))(9:53|54|55|56|57|58|59|(6:62|15|16|(0)(0)|19|20)|61))(4:70|71|72|73)|69|28|29|(3:31|(1:33)|34)(5:35|(2:37|(1:39))(1:43)|40|41|42))(6:93|(1:95)(1:109)|96|97|98|(3:100|(1:102)|104)(2:105|106))|74|75|(1:77)|78|(1:80)|81|(1:83)|84|(5:86|57|58|59|(0))|61))|110|6|(0)(0)|74|75|(0)|78|(0)|81|(0)|84|(0)|61|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00fb, code lost:
    
        if (coil.util.a.a(r0, r2) == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0113, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0114, code lost:
    
        r3 = r4;
        r4 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x017b A[Catch: all -> 0x018c, TryCatch #5 {all -> 0x018c, blocks: (B:16:0x0175, B:18:0x017b, B:22:0x018e, B:24:0x0192), top: B:15:0x0175 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x018e A[Catch: all -> 0x018c, TryCatch #5 {all -> 0x018c, blocks: (B:16:0x0175, B:18:0x017b, B:22:0x018e, B:24:0x0192), top: B:15:0x0175 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010f A[Catch: all -> 0x0113, TryCatch #2 {all -> 0x0113, blocks: (B:75:0x0105, B:77:0x010f, B:78:0x0118, B:80:0x0122, B:81:0x0125, B:83:0x012e, B:84:0x0131), top: B:74:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0122 A[Catch: all -> 0x0113, TryCatch #2 {all -> 0x0113, blocks: (B:75:0x0105, B:77:0x010f, B:78:0x0118, B:80:0x0122, B:81:0x0125, B:83:0x012e, B:84:0x0131), top: B:74:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012e A[Catch: all -> 0x0113, TryCatch #2 {all -> 0x0113, blocks: (B:75:0x0105, B:77:0x010f, B:78:0x0118, B:80:0x0122, B:81:0x0125, B:83:0x012e, B:84:0x0131), top: B:74:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, hev hevVar, int i, ContinuationImpl continuationImpl) {
        RealImageLoader$executeMain$1 realImageLoader$executeMain$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        u5j0 rv31Var;
        cgo create;
        hev hevVar2;
        u5j0 u5j0Var;
        hev hevVar3;
        jax0 B;
        fev q;
        c cVar2;
        hev hevVar4;
        Bitmap bitmap;
        cgo cgoVar;
        cgo cgoVar2;
        Drawable k;
        nev nevVar;
        c cVar3;
        c cVar4 = cVar;
        cVar4.getClass();
        if (continuationImpl instanceof RealImageLoader$executeMain$1) {
            realImageLoader$executeMain$1 = (RealImageLoader$executeMain$1) continuationImpl;
            int i3 = realImageLoader$executeMain$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                realImageLoader$executeMain$1.label = i3 - Integer.MIN_VALUE;
                obj = realImageLoader$executeMain$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realImageLoader$executeMain$1.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        cgo cgoVar3 = (cgo) realImageLoader$executeMain$1.L$3;
                        hevVar3 = (hev) realImageLoader$executeMain$1.L$2;
                        u5j0Var = (u5j0) realImageLoader$executeMain$1.L$1;
                        cVar3 = (c) realImageLoader$executeMain$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            create = cgoVar3;
                            cVar4 = cVar3;
                        } catch (Throwable th) {
                            th = th;
                            create = cgoVar3;
                            hevVar2 = hevVar3;
                        }
                    } else if (i2 == 2) {
                        Bitmap bitmap2 = (Bitmap) realImageLoader$executeMain$1.L$4;
                        cgo cgoVar4 = (cgo) realImageLoader$executeMain$1.L$3;
                        hev hevVar5 = (hev) realImageLoader$executeMain$1.L$2;
                        u5j0Var = (u5j0) realImageLoader$executeMain$1.L$1;
                        cVar3 = (c) realImageLoader$executeMain$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            bitmap = bitmap2;
                            cgoVar = cgoVar4;
                            hevVar4 = hevVar5;
                            cVar2 = cVar3;
                            rv31Var = u5j0Var;
                            try {
                                wis0 wis0Var = (wis0) obj;
                                cgoVar.getClass();
                                jse o = hevVar4.o();
                                RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$1 = new RealImageLoader$executeMain$result$1(hevVar4, cVar2, wis0Var, cgoVar, bitmap, null);
                                realImageLoader$executeMain$1.L$0 = cVar2;
                                realImageLoader$executeMain$1.L$1 = rv31Var;
                                realImageLoader$executeMain$1.L$2 = hevVar4;
                                realImageLoader$executeMain$1.L$3 = cgoVar;
                                realImageLoader$executeMain$1.L$4 = null;
                                realImageLoader$executeMain$1.label = 3;
                                obj = tje.k0(o, realImageLoader$executeMain$result$1, realImageLoader$executeMain$1);
                                if (obj != coroutineSingletons) {
                                    hevVar2 = hevVar4;
                                    cgoVar2 = cgoVar;
                                    nevVar = (nev) obj;
                                    if (!(nevVar instanceof u3v0)) {
                                    }
                                    return nevVar;
                                }
                                return coroutineSingletons;
                            } catch (Throwable th2) {
                                th = th2;
                                hevVar2 = hevVar4;
                                cVar4 = cVar2;
                                create = cgoVar;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            create = cgoVar4;
                            hevVar2 = hevVar5;
                        }
                    } else {
                        if (i2 != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cgoVar2 = (cgo) realImageLoader$executeMain$1.L$3;
                        hevVar2 = (hev) realImageLoader$executeMain$1.L$2;
                        rv31Var = (u5j0) realImageLoader$executeMain$1.L$1;
                        c cVar5 = (c) realImageLoader$executeMain$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            cVar2 = cVar5;
                            try {
                                nevVar = (nev) obj;
                                if (!(nevVar instanceof u3v0)) {
                                    jax0 B2 = hevVar2.B();
                                    cVar2.getClass();
                                    e((u3v0) nevVar, B2, cgoVar2);
                                } else if (nevVar instanceof n9o) {
                                    jax0 B3 = hevVar2.B();
                                    cVar2.getClass();
                                    d((n9o) nevVar, B3, cgoVar2);
                                }
                                return nevVar;
                            } catch (Throwable th4) {
                                th = th4;
                                create = cgoVar2;
                                cVar4 = cVar2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            create = cgoVar2;
                            cVar4 = cVar5;
                        }
                    }
                    rv31Var = u5j0Var;
                    cVar4 = cVar3;
                    try {
                        if (th instanceof CancellationException) {
                            cVar4.getClass();
                            create.getClass();
                            fev q2 = hevVar2.q();
                            if (q2 != null) {
                                q2.onCancel(hevVar2);
                            }
                            throw th;
                        }
                        cVar4.g.getClass();
                        if (th instanceof NullRequestDataException) {
                            k = hevVar2.l();
                            if (k == null) {
                                k = hevVar2.k();
                            }
                        } else {
                            k = hevVar2.k();
                        }
                        n9o n9oVar = new n9o(k, hevVar2, th);
                        d(n9oVar, hevVar2.B(), create);
                        rv31Var.e();
                        return n9oVar;
                    } finally {
                        rv31Var.e();
                    }
                }
                kotlin.b.b(obj);
                tig0 tig0Var = cVar4.g;
                l8x n = kotlinx.coroutines.a.n(realImageLoader$executeMain$1.get_context());
                tig0Var.getClass();
                Lifecycle p = hevVar.p();
                jax0 B4 = hevVar.B();
                rv31Var = B4 instanceof nv31 ? new rv31((c) tig0Var.a, hevVar, (nv31) B4, p, n) : new c95(p, n);
                rv31Var.I();
                bev F = hev.F(hevVar);
                F.g(cVar4.b);
                hev d = F.d();
                create = cVar4.d.create();
                try {
                    if (d.f() == xpb1.L) {
                        throw new NullRequestDataException();
                    }
                    rv31Var.start();
                    if (i == 0) {
                        Lifecycle p2 = d.p();
                        realImageLoader$executeMain$1.L$0 = cVar4;
                        realImageLoader$executeMain$1.L$1 = rv31Var;
                        realImageLoader$executeMain$1.L$2 = d;
                        realImageLoader$executeMain$1.L$3 = create;
                        realImageLoader$executeMain$1.label = 1;
                    }
                    u5j0Var = rv31Var;
                    hevVar3 = d;
                } catch (Throwable th6) {
                    th = th6;
                    hevVar2 = d;
                }
                if (((bdi0) cVar4.c.getValue()) != null) {
                    hevVar3.getClass();
                }
                Drawable v = hevVar3.v();
                B = hevVar3.B();
                if (B != null) {
                    B.f(v);
                }
                create.getClass();
                q = hevVar3.q();
                if (q != null) {
                    q.onStart(hevVar3);
                }
                rjs0 z = hevVar3.z();
                realImageLoader$executeMain$1.L$0 = cVar4;
                realImageLoader$executeMain$1.L$1 = u5j0Var;
                realImageLoader$executeMain$1.L$2 = hevVar3;
                realImageLoader$executeMain$1.L$3 = create;
                realImageLoader$executeMain$1.L$4 = null;
                realImageLoader$executeMain$1.label = 2;
                obj = z.a(realImageLoader$executeMain$1);
                if (obj != coroutineSingletons) {
                    cVar2 = cVar4;
                    hevVar4 = hevVar3;
                    bitmap = null;
                    cgoVar = create;
                    rv31Var = u5j0Var;
                    wis0 wis0Var2 = (wis0) obj;
                    cgoVar.getClass();
                    jse o2 = hevVar4.o();
                    RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$12 = new RealImageLoader$executeMain$result$1(hevVar4, cVar2, wis0Var2, cgoVar, bitmap, null);
                    realImageLoader$executeMain$1.L$0 = cVar2;
                    realImageLoader$executeMain$1.L$1 = rv31Var;
                    realImageLoader$executeMain$1.L$2 = hevVar4;
                    realImageLoader$executeMain$1.L$3 = cgoVar;
                    realImageLoader$executeMain$1.L$4 = null;
                    realImageLoader$executeMain$1.label = 3;
                    obj = tje.k0(o2, realImageLoader$executeMain$result$12, realImageLoader$executeMain$1);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        realImageLoader$executeMain$1 = new RealImageLoader$executeMain$1(cVar4, continuationImpl);
        obj = realImageLoader$executeMain$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = realImageLoader$executeMain$1.label;
        if (i2 == 0) {
        }
        if (((bdi0) cVar4.c.getValue()) != null) {
        }
        Drawable v2 = hevVar3.v();
        B = hevVar3.B();
        if (B != null) {
        }
        create.getClass();
        q = hevVar3.q();
        if (q != null) {
        }
        rjs0 z2 = hevVar3.z();
        realImageLoader$executeMain$1.L$0 = cVar4;
        realImageLoader$executeMain$1.L$1 = u5j0Var;
        realImageLoader$executeMain$1.L$2 = hevVar3;
        realImageLoader$executeMain$1.L$3 = create;
        realImageLoader$executeMain$1.L$4 = null;
        realImageLoader$executeMain$1.label = 2;
        obj = z2.a(realImageLoader$executeMain$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r4 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(n9o n9oVar, jax0 jax0Var, cgo cgoVar) {
        hev b = n9oVar.b();
        if (jax0Var instanceof qy01) {
            wx01 a = n9oVar.b().E().a((qy01) jax0Var, n9oVar);
            if (!(a instanceof se60)) {
                cgoVar.getClass();
                a.a();
            }
            jax0Var.g(n9oVar.a());
        }
        cgoVar.onError(b, n9oVar);
        fev q = b.q();
        if (q != null) {
            q.onError(b, n9oVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r4 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(u3v0 u3v0Var, jax0 jax0Var, cgo cgoVar) {
        hev b = u3v0Var.b();
        if (jax0Var instanceof qy01) {
            wx01 a = u3v0Var.b().E().a((qy01) jax0Var, u3v0Var);
            if (!(a instanceof se60)) {
                cgoVar.getClass();
                a.a();
            }
            jax0Var.b(u3v0Var.a());
        }
        cgoVar.getClass();
        fev q = b.q();
        if (q != null) {
            q.onSuccess(b, u3v0Var);
        }
    }

    public final g1k b(hev hevVar) {
        qoh h = tje.h(this.f, null, null, new RealImageLoader$enqueue$job$1(hevVar, this, null), 3);
        return hevVar.B() instanceof nv31 ? m.c(((nv31) hevVar.B()).getView()).getDisposable(h) : new f270(h);
    }

    public final Object c(hev hevVar, SuspendLambda suspendLambda) {
        return bvf0.n(new RealImageLoader$execute$2(hevVar, this, null), suspendLambda);
    }
}
