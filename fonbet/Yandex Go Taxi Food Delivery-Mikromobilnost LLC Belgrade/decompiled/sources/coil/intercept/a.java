package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.c;
import coil.graphics.DataSource;
import coil.memory.MemoryCache$Key;
import coil.request.CachePolicy;
import coil.request.NullRequestDataException;
import coil.util.SystemCallbacks;
import coil.view.Scale;
import defpackage.au50;
import defpackage.c0r;
import defpackage.cgo;
import defpackage.gyg;
import defpackage.hev;
import defpackage.hyg;
import defpackage.iwq;
import defpackage.jse;
import defpackage.ki10;
import defpackage.m;
import defpackage.mbm;
import defpackage.mga1;
import defpackage.n8w;
import defpackage.n9o;
import defpackage.ny61;
import defpackage.owq;
import defpackage.pjt0;
import defpackage.q8w;
import defpackage.qg70;
import defpackage.qv10;
import defpackage.rv00;
import defpackage.rwq;
import defpackage.tig0;
import defpackage.tje;
import defpackage.u1o;
import defpackage.wis0;
import defpackage.xfo;
import defpackage.xxg;
import defpackage.zev;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class a implements q8w {
    public final c a;
    public final SystemCallbacks b;
    public final tig0 c;
    public final au50 d;

    public a(c cVar, SystemCallbacks systemCallbacks, tig0 tig0Var) {
        this.a = cVar;
        this.b = systemCallbacks;
        this.c = tig0Var;
        this.d = new au50(22, cVar, tig0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b3 -> B:10:0x00b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, pjt0 pjt0Var, coil.a aVar2, hev hevVar, Object obj, qg70 qg70Var, cgo cgoVar, ContinuationImpl continuationImpl) {
        EngineInterceptor$decode$1 engineInterceptor$decode$1;
        int i;
        int i2;
        int size;
        Pair pair;
        aVar.getClass();
        if (continuationImpl instanceof EngineInterceptor$decode$1) {
            engineInterceptor$decode$1 = (EngineInterceptor$decode$1) continuationImpl;
            int i3 = engineInterceptor$decode$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                engineInterceptor$decode$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = engineInterceptor$decode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = engineInterceptor$decode$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    i2 = 0;
                    c cVar = aVar.a;
                    List list = aVar2.e;
                    size = list.size();
                    while (true) {
                        if (i2 >= size) {
                        }
                        i2++;
                    }
                    if (pair != null) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = engineInterceptor$decode$1.I$0;
                    cgo cgoVar2 = (cgo) engineInterceptor$decode$1.L$6;
                    qg70 qg70Var2 = (qg70) engineInterceptor$decode$1.L$5;
                    Object obj3 = engineInterceptor$decode$1.L$4;
                    hev hevVar2 = (hev) engineInterceptor$decode$1.L$3;
                    coil.a aVar3 = (coil.a) engineInterceptor$decode$1.L$2;
                    pjt0 pjt0Var2 = (pjt0) engineInterceptor$decode$1.L$1;
                    a aVar4 = (a) engineInterceptor$decode$1.L$0;
                    kotlin.b.b(obj2);
                    int intValue = i4;
                    aVar = aVar4;
                    cgoVar = cgoVar2;
                    pjt0Var = pjt0Var2;
                    qg70Var = qg70Var2;
                    aVar2 = aVar3;
                    obj = obj3;
                    hevVar = hevVar2;
                    xxg xxgVar = (xxg) obj2;
                    cgoVar.getClass();
                    if (xxgVar == null) {
                        Drawable a = xxgVar.a();
                        boolean b = xxgVar.b();
                        DataSource a2 = pjt0Var.a();
                        zev c = pjt0Var.c();
                        c0r c0rVar = c instanceof c0r ? (c0r) c : null;
                        return new u1o(a, b, a2, c0rVar != null ? c0rVar.d() : null);
                    }
                    i2 = intValue;
                    c cVar2 = aVar.a;
                    List list2 = aVar2.e;
                    size = list2.size();
                    while (true) {
                        if (i2 >= size) {
                            pair = null;
                            break;
                        }
                        hyg a3 = ((gyg) list2.get(i2)).a(pjt0Var, qg70Var);
                        if (a3 != null) {
                            pair = new Pair(a3, Integer.valueOf(i2));
                            break;
                        }
                        i2++;
                    }
                    if (pair != null) {
                        xfo.g(qv10.o("Unable to create a decoder that supports: ", obj));
                        return null;
                    }
                    hyg hygVar = (hyg) pair.c();
                    intValue = ((Number) pair.f()).intValue() + 1;
                    cgoVar.getClass();
                    engineInterceptor$decode$1.L$0 = aVar;
                    engineInterceptor$decode$1.L$1 = pjt0Var;
                    engineInterceptor$decode$1.L$2 = aVar2;
                    engineInterceptor$decode$1.L$3 = hevVar;
                    engineInterceptor$decode$1.L$4 = obj;
                    engineInterceptor$decode$1.L$5 = qg70Var;
                    engineInterceptor$decode$1.L$6 = cgoVar;
                    engineInterceptor$decode$1.L$7 = hygVar;
                    engineInterceptor$decode$1.I$0 = intValue;
                    engineInterceptor$decode$1.label = 1;
                    obj2 = hygVar.a(engineInterceptor$decode$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    xxg xxgVar2 = (xxg) obj2;
                    cgoVar.getClass();
                    if (xxgVar2 == null) {
                    }
                }
            }
        }
        engineInterceptor$decode$1 = new EngineInterceptor$decode$1(aVar, continuationImpl);
        Object obj22 = engineInterceptor$decode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = engineInterceptor$decode$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01e2, code lost:
    
        if (r1 != r7) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #1 {all -> 0x0058, blocks: (B:26:0x0053, B:27:0x014d, B:46:0x0079, B:48:0x0113, B:50:0x011e, B:55:0x0131, B:68:0x015e, B:70:0x0168, B:72:0x01fe, B:73:0x0203), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015e A[Catch: all -> 0x0058, TryCatch #1 {all -> 0x0058, blocks: (B:26:0x0053, B:27:0x014d, B:46:0x0079, B:48:0x0113, B:50:0x011e, B:55:0x0131, B:68:0x015e, B:70:0x0168, B:72:0x01fe, B:73:0x0203), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0089  */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, coil.a] */
    /* JADX WARN: Type inference failed for: r2v13, types: [qg70] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [qg70] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, hev hevVar, Object obj, qg70 qg70Var, cgo cgoVar, ContinuationImpl continuationImpl) {
        EngineInterceptor$execute$1 engineInterceptor$execute$1;
        Ref$ObjectRef ref$ObjectRef;
        pjt0 pjt0Var;
        boolean z;
        a aVar2;
        hev hevVar2;
        Object obj2;
        cgo cgoVar2;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$ObjectRef ref$ObjectRef5;
        T t;
        iwq iwqVar;
        hev hevVar3;
        Ref$ObjectRef ref$ObjectRef6;
        cgo cgoVar3;
        u1o u1oVar;
        a aVar3;
        Ref$ObjectRef ref$ObjectRef7;
        a aVar4;
        pjt0 pjt0Var2;
        Object obj3;
        Bitmap bitmap;
        aVar.getClass();
        try {
            if (continuationImpl instanceof EngineInterceptor$execute$1) {
                engineInterceptor$execute$1 = (EngineInterceptor$execute$1) continuationImpl;
                int i = engineInterceptor$execute$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    engineInterceptor$execute$1.label = i - Integer.MIN_VALUE;
                    EngineInterceptor$execute$1 engineInterceptor$execute$12 = engineInterceptor$execute$1;
                    Object obj4 = engineInterceptor$execute$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ref$ObjectRef = engineInterceptor$execute$12.label;
                    if (ref$ObjectRef != 0) {
                        Ref$ObjectRef z2 = qv10.z(obj4);
                        z2.element = qg70Var;
                        Ref$ObjectRef ref$ObjectRef8 = new Ref$ObjectRef();
                        ref$ObjectRef8.element = aVar.a.h;
                        Ref$ObjectRef ref$ObjectRef9 = new Ref$ObjectRef();
                        try {
                            tig0 tig0Var = aVar.c;
                            T t2 = (qg70) z2.element;
                            Bitmap.Config b = t2.b();
                            CachePolicy d = t2.d();
                            mga1.e(t2.b());
                            if (!t2.d().getReadEnabled() || ((SystemCallbacks) tig0Var.b).isOnline()) {
                                z = false;
                            } else {
                                d = CachePolicy.DISABLED;
                                z = true;
                            }
                            if (z) {
                                t2 = qg70.a(t2, b, d);
                            }
                            z2.element = t2;
                            hevVar.getClass();
                            coil.a aVar5 = (coil.a) ref$ObjectRef8.element;
                            qg70 qg70Var2 = (qg70) z2.element;
                            engineInterceptor$execute$12.L$0 = aVar;
                            engineInterceptor$execute$12.L$1 = hevVar;
                            engineInterceptor$execute$12.L$2 = obj;
                            engineInterceptor$execute$12.L$3 = cgoVar;
                            engineInterceptor$execute$12.L$4 = z2;
                            engineInterceptor$execute$12.L$5 = ref$ObjectRef8;
                            engineInterceptor$execute$12.L$6 = ref$ObjectRef9;
                            engineInterceptor$execute$12.L$7 = ref$ObjectRef9;
                            engineInterceptor$execute$12.label = 1;
                            Object c = aVar.c(aVar5, hevVar, obj, qg70Var2, cgoVar, engineInterceptor$execute$12);
                            if (c != coroutineSingletons) {
                                aVar2 = aVar;
                                hevVar2 = hevVar;
                                obj2 = obj;
                                cgoVar2 = cgoVar;
                                ref$ObjectRef2 = z2;
                                ref$ObjectRef3 = ref$ObjectRef8;
                                ref$ObjectRef4 = ref$ObjectRef9;
                                ref$ObjectRef5 = ref$ObjectRef4;
                                t = c;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th) {
                            th = th;
                            ref$ObjectRef = ref$ObjectRef9;
                            T t3 = ref$ObjectRef.element;
                            pjt0Var = t3 instanceof pjt0 ? (pjt0) t3 : null;
                            if (pjt0Var != null) {
                                m.a(pjt0Var.c());
                            }
                            throw th;
                        }
                    }
                    if (ref$ObjectRef == 1) {
                        ref$ObjectRef4 = (Ref$ObjectRef) engineInterceptor$execute$12.L$7;
                        ref$ObjectRef5 = (Ref$ObjectRef) engineInterceptor$execute$12.L$6;
                        Ref$ObjectRef ref$ObjectRef10 = (Ref$ObjectRef) engineInterceptor$execute$12.L$5;
                        Ref$ObjectRef ref$ObjectRef11 = (Ref$ObjectRef) engineInterceptor$execute$12.L$4;
                        cgo cgoVar4 = (cgo) engineInterceptor$execute$12.L$3;
                        Object obj5 = engineInterceptor$execute$12.L$2;
                        hev hevVar4 = (hev) engineInterceptor$execute$12.L$1;
                        a aVar6 = (a) engineInterceptor$execute$12.L$0;
                        kotlin.b.b(obj4);
                        ref$ObjectRef3 = ref$ObjectRef10;
                        ref$ObjectRef2 = ref$ObjectRef11;
                        cgoVar2 = cgoVar4;
                        obj2 = obj5;
                        hevVar2 = hevVar4;
                        aVar2 = aVar6;
                        t = obj4;
                    } else {
                        if (ref$ObjectRef != 2) {
                            if (ref$ObjectRef != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj4);
                            u1o u1oVar2 = (u1o) obj4;
                            Drawable a = u1oVar2.a();
                            BitmapDrawable bitmapDrawable = a instanceof BitmapDrawable ? (BitmapDrawable) a : null;
                            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                                bitmap.prepareToDraw();
                            }
                            return u1oVar2;
                        }
                        ref$ObjectRef5 = (Ref$ObjectRef) engineInterceptor$execute$12.L$4;
                        ref$ObjectRef7 = (Ref$ObjectRef) engineInterceptor$execute$12.L$3;
                        cgoVar3 = (cgo) engineInterceptor$execute$12.L$2;
                        hevVar3 = (hev) engineInterceptor$execute$12.L$1;
                        aVar4 = (a) engineInterceptor$execute$12.L$0;
                        kotlin.b.b(obj4);
                        obj3 = obj4;
                        u1oVar = (u1o) obj3;
                        ref$ObjectRef6 = ref$ObjectRef7;
                        aVar3 = aVar4;
                        u1o u1oVar3 = u1oVar;
                        cgo cgoVar5 = cgoVar3;
                        hev hevVar5 = hevVar3;
                        T t4 = ref$ObjectRef5.element;
                        pjt0Var2 = t4 instanceof pjt0 ? (pjt0) t4 : null;
                        if (pjt0Var2 != null) {
                            m.a(pjt0Var2.c());
                        }
                        qg70 qg70Var3 = (qg70) ref$ObjectRef6.element;
                        engineInterceptor$execute$12.L$0 = null;
                        engineInterceptor$execute$12.L$1 = null;
                        engineInterceptor$execute$12.L$2 = null;
                        engineInterceptor$execute$12.L$3 = null;
                        engineInterceptor$execute$12.L$4 = null;
                        engineInterceptor$execute$12.L$5 = null;
                        engineInterceptor$execute$12.L$6 = null;
                        engineInterceptor$execute$12.L$7 = null;
                        engineInterceptor$execute$12.label = 3;
                        aVar3.getClass();
                        List D = hevVar5.D();
                        obj4 = (!D.isEmpty() && ((u1oVar3.a() instanceof BitmapDrawable) || hevVar5.a())) ? tje.k0(hevVar5.C(), new EngineInterceptor$transform$3(aVar3, u1oVar3, qg70Var3, D, cgoVar5, hevVar5, null), engineInterceptor$execute$12) : u1oVar3;
                    }
                    ref$ObjectRef4.element = t;
                    T t5 = ref$ObjectRef5.element;
                    iwqVar = (iwq) t5;
                    if (iwqVar instanceof pjt0) {
                        hevVar3 = hevVar2;
                        ref$ObjectRef6 = ref$ObjectRef2;
                        cgoVar3 = cgoVar2;
                        if (!(iwqVar instanceof mbm)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        u1oVar = new u1o(((mbm) t5).b(), ((mbm) ref$ObjectRef5.element).c(), ((mbm) ref$ObjectRef5.element).a(), null);
                        aVar3 = aVar2;
                        u1o u1oVar32 = u1oVar;
                        cgo cgoVar52 = cgoVar3;
                        hev hevVar52 = hevVar3;
                        T t42 = ref$ObjectRef5.element;
                        if (t42 instanceof pjt0) {
                        }
                        if (pjt0Var2 != null) {
                        }
                        qg70 qg70Var32 = (qg70) ref$ObjectRef6.element;
                        engineInterceptor$execute$12.L$0 = null;
                        engineInterceptor$execute$12.L$1 = null;
                        engineInterceptor$execute$12.L$2 = null;
                        engineInterceptor$execute$12.L$3 = null;
                        engineInterceptor$execute$12.L$4 = null;
                        engineInterceptor$execute$12.L$5 = null;
                        engineInterceptor$execute$12.L$6 = null;
                        engineInterceptor$execute$12.L$7 = null;
                        engineInterceptor$execute$12.label = 3;
                        aVar3.getClass();
                        List D2 = hevVar52.D();
                        if (D2.isEmpty()) {
                        }
                    } else {
                        jse g = hevVar2.g();
                        Ref$ObjectRef ref$ObjectRef12 = ref$ObjectRef5;
                        try {
                            EngineInterceptor$execute$executeResult$1 engineInterceptor$execute$executeResult$1 = new EngineInterceptor$execute$executeResult$1(aVar2, ref$ObjectRef12, ref$ObjectRef3, hevVar2, obj2, ref$ObjectRef2, cgoVar2, null);
                            hevVar3 = hevVar2;
                            Ref$ObjectRef ref$ObjectRef13 = ref$ObjectRef2;
                            cgoVar3 = cgoVar2;
                            engineInterceptor$execute$12.L$0 = aVar2;
                            engineInterceptor$execute$12.L$1 = hevVar3;
                            engineInterceptor$execute$12.L$2 = cgoVar3;
                            engineInterceptor$execute$12.L$3 = ref$ObjectRef13;
                            engineInterceptor$execute$12.L$4 = ref$ObjectRef5;
                            engineInterceptor$execute$12.L$5 = null;
                            engineInterceptor$execute$12.L$6 = null;
                            engineInterceptor$execute$12.L$7 = null;
                            engineInterceptor$execute$12.label = 2;
                            Object k0 = tje.k0(g, engineInterceptor$execute$executeResult$1, engineInterceptor$execute$12);
                            if (k0 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            ref$ObjectRef7 = ref$ObjectRef13;
                            aVar4 = aVar2;
                            obj3 = k0;
                            u1oVar = (u1o) obj3;
                            ref$ObjectRef6 = ref$ObjectRef7;
                            aVar3 = aVar4;
                            u1o u1oVar322 = u1oVar;
                            cgo cgoVar522 = cgoVar3;
                            hev hevVar522 = hevVar3;
                            T t422 = ref$ObjectRef5.element;
                            if (t422 instanceof pjt0) {
                            }
                            if (pjt0Var2 != null) {
                            }
                            qg70 qg70Var322 = (qg70) ref$ObjectRef6.element;
                            engineInterceptor$execute$12.L$0 = null;
                            engineInterceptor$execute$12.L$1 = null;
                            engineInterceptor$execute$12.L$2 = null;
                            engineInterceptor$execute$12.L$3 = null;
                            engineInterceptor$execute$12.L$4 = null;
                            engineInterceptor$execute$12.L$5 = null;
                            engineInterceptor$execute$12.L$6 = null;
                            engineInterceptor$execute$12.L$7 = null;
                            engineInterceptor$execute$12.label = 3;
                            aVar3.getClass();
                            List D22 = hevVar522.D();
                            if (D22.isEmpty()) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            ref$ObjectRef = ref$ObjectRef12;
                            T t32 = ref$ObjectRef.element;
                            if (t32 instanceof pjt0) {
                            }
                            if (pjt0Var != null) {
                            }
                            throw th;
                        }
                    }
                }
            }
            if (ref$ObjectRef != 0) {
            }
            ref$ObjectRef4.element = t;
            T t52 = ref$ObjectRef5.element;
            iwqVar = (iwq) t52;
            if (iwqVar instanceof pjt0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        engineInterceptor$execute$1 = new EngineInterceptor$execute$1(aVar, continuationImpl);
        EngineInterceptor$execute$1 engineInterceptor$execute$122 = engineInterceptor$execute$1;
        Object obj42 = engineInterceptor$execute$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ref$ObjectRef = engineInterceptor$execute$122.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d6 -> B:10:0x00dd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(coil.a aVar, hev hevVar, Object obj, qg70 qg70Var, cgo cgoVar, ContinuationImpl continuationImpl) {
        EngineInterceptor$fetch$1 engineInterceptor$fetch$1;
        a aVar2;
        int i;
        Object obj2;
        qg70 qg70Var2;
        cgo cgoVar2;
        int i2;
        EngineInterceptor$fetch$1 engineInterceptor$fetch$12;
        coil.a aVar3;
        hev hevVar2;
        int size;
        Pair pair;
        rwq a;
        if (continuationImpl instanceof EngineInterceptor$fetch$1) {
            engineInterceptor$fetch$1 = (EngineInterceptor$fetch$1) continuationImpl;
            int i3 = engineInterceptor$fetch$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                engineInterceptor$fetch$1.label = i3 - Integer.MIN_VALUE;
                aVar2 = this;
                Object obj3 = engineInterceptor$fetch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = engineInterceptor$fetch$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    obj2 = obj;
                    qg70Var2 = qg70Var;
                    cgoVar2 = cgoVar;
                    i2 = 0;
                    engineInterceptor$fetch$12 = engineInterceptor$fetch$1;
                    aVar3 = aVar;
                    hevVar2 = hevVar;
                    c cVar = aVar2.a;
                    List list = aVar3.d;
                    size = list.size();
                    while (true) {
                        if (i2 < size) {
                        }
                        i2++;
                    }
                    if (pair != null) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = engineInterceptor$fetch$1.I$0;
                    cgo cgoVar3 = (cgo) engineInterceptor$fetch$1.L$5;
                    qg70Var2 = (qg70) engineInterceptor$fetch$1.L$4;
                    Object obj4 = engineInterceptor$fetch$1.L$3;
                    hev hevVar3 = (hev) engineInterceptor$fetch$1.L$2;
                    coil.a aVar4 = (coil.a) engineInterceptor$fetch$1.L$1;
                    a aVar5 = (a) engineInterceptor$fetch$1.L$0;
                    kotlin.b.b(obj3);
                    EngineInterceptor$fetch$1 engineInterceptor$fetch$13 = engineInterceptor$fetch$1;
                    hevVar2 = hevVar3;
                    i2 = i4;
                    aVar2 = aVar5;
                    cgoVar2 = cgoVar3;
                    obj2 = obj4;
                    iwq iwqVar = (iwq) obj3;
                    try {
                        cgoVar2.getClass();
                        if (iwqVar == null) {
                            return iwqVar;
                        }
                        aVar3 = aVar4;
                        engineInterceptor$fetch$12 = engineInterceptor$fetch$13;
                        c cVar2 = aVar2.a;
                        List list2 = aVar3.d;
                        size = list2.size();
                        while (true) {
                            if (i2 < size) {
                                pair = null;
                                break;
                            }
                            Pair pair2 = (Pair) list2.get(i2);
                            owq owqVar = (owq) pair2.getFirst();
                            if (((Class) pair2.getSecond()).isAssignableFrom(obj2.getClass()) && (a = owqVar.a(obj2, qg70Var2)) != null) {
                                pair = new Pair(a, Integer.valueOf(i2));
                                break;
                            }
                            i2++;
                        }
                        if (pair != null) {
                            xfo.g(qv10.o("Unable to create a fetcher that supports: ", obj2));
                            return null;
                        }
                        rwq rwqVar = (rwq) pair.c();
                        int intValue = ((Number) pair.f()).intValue() + 1;
                        cgoVar2.getClass();
                        engineInterceptor$fetch$12.L$0 = aVar2;
                        engineInterceptor$fetch$12.L$1 = aVar3;
                        engineInterceptor$fetch$12.L$2 = hevVar2;
                        engineInterceptor$fetch$12.L$3 = obj2;
                        engineInterceptor$fetch$12.L$4 = qg70Var2;
                        engineInterceptor$fetch$12.L$5 = cgoVar2;
                        engineInterceptor$fetch$12.L$6 = rwqVar;
                        engineInterceptor$fetch$12.I$0 = intValue;
                        engineInterceptor$fetch$12.label = 1;
                        Object a2 = rwqVar.a(engineInterceptor$fetch$12);
                        if (a2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        EngineInterceptor$fetch$1 engineInterceptor$fetch$14 = engineInterceptor$fetch$12;
                        aVar4 = aVar3;
                        obj3 = a2;
                        i2 = intValue;
                        engineInterceptor$fetch$13 = engineInterceptor$fetch$14;
                        iwq iwqVar2 = (iwq) obj3;
                        cgoVar2.getClass();
                        if (iwqVar2 == null) {
                        }
                    } catch (Throwable th) {
                        pjt0 pjt0Var = iwqVar2 instanceof pjt0 ? (pjt0) iwqVar2 : null;
                        if (pjt0Var != null) {
                            m.a(pjt0Var.c());
                        }
                        throw th;
                    }
                }
            }
        }
        aVar2 = this;
        engineInterceptor$fetch$1 = new EngineInterceptor$fetch$1(aVar2, continuationImpl);
        Object obj32 = engineInterceptor$fetch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = engineInterceptor$fetch$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r1v13, types: [n8w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(b bVar, ContinuationImpl continuationImpl) {
        EngineInterceptor$intercept$1 engineInterceptor$intercept$1;
        int i;
        Object a;
        Drawable k;
        a aVar = this;
        b bVar2 = bVar;
        au50 au50Var = aVar.d;
        if (continuationImpl instanceof EngineInterceptor$intercept$1) {
            engineInterceptor$intercept$1 = (EngineInterceptor$intercept$1) continuationImpl;
            int i2 = engineInterceptor$intercept$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                engineInterceptor$intercept$1.label = i2 - Integer.MIN_VALUE;
                EngineInterceptor$intercept$1 engineInterceptor$intercept$12 = engineInterceptor$intercept$1;
                Object obj = engineInterceptor$intercept$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = engineInterceptor$intercept$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    try {
                        hev c = bVar2.c();
                        Object f = c.f();
                        wis0 d = bVar2.d();
                        Bitmap.Config[] configArr = m.a;
                        cgo b = bVar2.b();
                        qg70 k2 = aVar.c.k(c, d);
                        Scale e = k2.e();
                        b.getClass();
                        List list = aVar.a.h.b;
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            try {
                                Pair pair = (Pair) list.get(i3);
                                rv00 rv00Var = (rv00) pair.getFirst();
                                if (((Class) pair.getSecond()).isAssignableFrom(f.getClass()) && (a = rv00Var.a(f, k2)) != null) {
                                    f = a;
                                }
                            } catch (Throwable th) {
                                th = th;
                                aVar = this;
                            }
                        }
                        MemoryCache$Key h = au50Var.h(c, f, k2, b);
                        ki10 f2 = h != null ? au50Var.f(c, h, d, e) : null;
                        if (f2 != null) {
                            return au50.i(bVar2, c, h, f2);
                        }
                        jse m = c.m();
                        aVar = this;
                        EngineInterceptor$intercept$2 engineInterceptor$intercept$2 = new EngineInterceptor$intercept$2(aVar, c, f, k2, b, h, bVar2, null);
                        engineInterceptor$intercept$12.L$0 = aVar;
                        engineInterceptor$intercept$12.L$1 = bVar2;
                        engineInterceptor$intercept$12.label = 1;
                        Object k0 = tje.k0(m, engineInterceptor$intercept$2, engineInterceptor$intercept$12);
                        return k0 == coroutineSingletons ? coroutineSingletons : k0;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r1 = (n8w) engineInterceptor$intercept$12.L$1;
                    a aVar2 = (a) engineInterceptor$intercept$12.L$0;
                    try {
                        kotlin.b.b(obj);
                        return obj;
                    } catch (Throwable th3) {
                        th = th3;
                        bVar2 = r1;
                        aVar = aVar2;
                    }
                }
                if (!(th instanceof CancellationException)) {
                    throw th;
                }
                tig0 tig0Var = aVar.c;
                hev c2 = bVar2.c();
                if (th instanceof NullRequestDataException) {
                    k = c2.l();
                    if (k == null) {
                        k = c2.k();
                    }
                } else {
                    k = c2.k();
                }
                return new n9o(k, c2, th);
            }
        }
        engineInterceptor$intercept$1 = new EngineInterceptor$intercept$1(aVar, continuationImpl);
        EngineInterceptor$intercept$1 engineInterceptor$intercept$122 = engineInterceptor$intercept$1;
        Object obj2 = engineInterceptor$intercept$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = engineInterceptor$intercept$122.label;
        if (i != 0) {
        }
        if (!(th instanceof CancellationException)) {
        }
    }
}
