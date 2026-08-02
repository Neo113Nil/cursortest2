package coil3.intercept;

import android.graphics.Bitmap;
import coil3.a;
import coil3.graphics.EnumC0136DataSource;
import coil3.size.Scale;
import defpackage.ago;
import defpackage.au50;
import defpackage.b0r;
import defpackage.fse;
import defpackage.fyg;
import defpackage.g0c;
import defpackage.gev;
import defpackage.gp50;
import defpackage.hwq;
import defpackage.ii10;
import defpackage.iyg;
import defpackage.j5p;
import defpackage.ji10;
import defpackage.k1d;
import defpackage.l8w;
import defpackage.lev;
import defpackage.lfx;
import defpackage.lg70;
import defpackage.nc2;
import defpackage.nwq;
import defpackage.ny61;
import defpackage.o8w;
import defpackage.oo31;
import defpackage.ov00;
import defpackage.pwq;
import defpackage.q7v;
import defpackage.qv10;
import defpackage.s8o;
import defpackage.sb2;
import defpackage.t1o;
import defpackage.t3v0;
import defpackage.t9v;
import defpackage.tje;
import defpackage.ux21;
import defpackage.w06;
import defpackage.wxg;
import defpackage.xev;
import defpackage.xfo;
import defpackage.xis0;
import defpackage.zct0;
import defpackage.zx21;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class a implements o8w {
    public final coil3.c a;
    public final nc2 b;
    public final au50 c;
    public final gp50 d;

    public a(coil3.c cVar, nc2 nc2Var, au50 au50Var) {
        this.a = cVar;
        this.b = nc2Var;
        this.c = au50Var;
        this.d = new gp50(27, cVar, au50Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b8 -> B:10:0x00bb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, zct0 zct0Var, coil3.a aVar2, gev gevVar, Object obj, lg70 lg70Var, ago agoVar, ContinuationImpl continuationImpl) {
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
                    coil3.c cVar = aVar.a;
                    size = ((List) aVar2.g.getValue()).size();
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
                    ago agoVar2 = (ago) engineInterceptor$decode$1.L$5;
                    lg70 lg70Var2 = (lg70) engineInterceptor$decode$1.L$4;
                    obj = engineInterceptor$decode$1.L$3;
                    gev gevVar2 = (gev) engineInterceptor$decode$1.L$2;
                    coil3.a aVar3 = (coil3.a) engineInterceptor$decode$1.L$1;
                    zct0 zct0Var2 = (zct0) engineInterceptor$decode$1.L$0;
                    kotlin.b.b(obj2);
                    int intValue = i4;
                    zct0Var = zct0Var2;
                    agoVar = agoVar2;
                    aVar2 = aVar3;
                    lg70Var = lg70Var2;
                    gevVar = gevVar2;
                    wxg wxgVar = (wxg) obj2;
                    agoVar.getClass();
                    if (wxgVar == null) {
                        q7v q7vVar = wxgVar.a;
                        boolean z = wxgVar.b;
                        EnumC0136DataSource enumC0136DataSource = zct0Var.c;
                        xev xevVar = zct0Var.a;
                        b0r b0rVar = xevVar instanceof b0r ? (b0r) xevVar : null;
                        return new t1o(q7vVar, z, enumC0136DataSource, b0rVar != null ? b0rVar.c : null);
                    }
                    i2 = intValue;
                    coil3.c cVar2 = aVar.a;
                    size = ((List) aVar2.g.getValue()).size();
                    while (true) {
                        if (i2 >= size) {
                            pair = null;
                            break;
                        }
                        iyg a = ((fyg) ((List) aVar2.g.getValue()).get(i2)).a(zct0Var, lg70Var, cVar2);
                        if (a != null) {
                            pair = new Pair(a, Integer.valueOf(i2));
                            break;
                        }
                        i2++;
                    }
                    if (pair != null) {
                        xfo.g(qv10.o("Unable to create a decoder that supports: ", obj));
                        return null;
                    }
                    iyg iygVar = (iyg) pair.c();
                    intValue = ((Number) pair.f()).intValue() + 1;
                    agoVar.getClass();
                    engineInterceptor$decode$1.L$0 = zct0Var;
                    engineInterceptor$decode$1.L$1 = aVar2;
                    engineInterceptor$decode$1.L$2 = gevVar;
                    engineInterceptor$decode$1.L$3 = obj;
                    engineInterceptor$decode$1.L$4 = lg70Var;
                    engineInterceptor$decode$1.L$5 = agoVar;
                    engineInterceptor$decode$1.L$6 = iygVar;
                    engineInterceptor$decode$1.I$0 = intValue;
                    engineInterceptor$decode$1.label = 1;
                    obj2 = iygVar.a(engineInterceptor$decode$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    wxg wxgVar2 = (wxg) obj2;
                    agoVar.getClass();
                    if (wxgVar2 == null) {
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

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0186, code lost:
    
        if (r1 == r9) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #5 {all -> 0x007c, blocks: (B:44:0x0072, B:46:0x010a, B:48:0x0115), top: B:43:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013f A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:22:0x004f, B:24:0x0139, B:50:0x011d, B:55:0x013f, B:57:0x0144, B:58:0x019b, B:59:0x01a0), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0080  */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, coil3.a] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, coil3.a] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, lg70] */
    /* JADX WARN: Type inference failed for: r2v0, types: [gev, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a aVar, gev gevVar, Object obj, lg70 lg70Var, ago agoVar, ContinuationImpl continuationImpl) {
        EngineInterceptor$execute$1 engineInterceptor$execute$1;
        int i;
        zct0 zct0Var;
        xev xevVar;
        Ref$ObjectRef ref$ObjectRef;
        EngineInterceptor$execute$1 engineInterceptor$execute$12;
        gev gevVar2;
        Object obj2;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        ago agoVar2;
        T t;
        hwq hwqVar;
        Ref$ObjectRef ref$ObjectRef5;
        t1o t1oVar;
        Ref$ObjectRef ref$ObjectRef6;
        ago agoVar3;
        zct0 zct0Var2;
        xev xevVar2;
        Object obj3;
        Object obj4;
        Ref$ObjectRef ref$ObjectRef7 = gevVar;
        aVar.getClass();
        try {
            if (continuationImpl instanceof EngineInterceptor$execute$1) {
                engineInterceptor$execute$1 = (EngineInterceptor$execute$1) continuationImpl;
                int i2 = engineInterceptor$execute$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    engineInterceptor$execute$1.label = i2 - Integer.MIN_VALUE;
                    EngineInterceptor$execute$1 engineInterceptor$execute$13 = engineInterceptor$execute$1;
                    Object obj5 = engineInterceptor$execute$13.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = engineInterceptor$execute$13.label;
                    if (i != 0) {
                        Ref$ObjectRef z = qv10.z(obj5);
                        z.element = lg70Var;
                        ref$ObjectRef = new Ref$ObjectRef();
                        ref$ObjectRef.element = aVar.a.d;
                        Ref$ObjectRef ref$ObjectRef8 = new Ref$ObjectRef();
                        try {
                            ?? r1 = (lg70) z.element;
                            j5p j5pVar = r1.i;
                            sb2.x((Bitmap.Config) s8o.p(r1, lev.a));
                            z.element = r1;
                            ref$ObjectRef7.getClass();
                            fyg fygVar = ref$ObjectRef7.g;
                            if (fygVar != null) {
                                coil3.a aVar2 = (coil3.a) ref$ObjectRef.element;
                                aVar2.getClass();
                                a.C0029a c0029a = new a.C0029a(aVar2);
                                if (fygVar != null) {
                                    c0029a.e.add(0, new k1d(fygVar, 2));
                                }
                                ref$ObjectRef.element = c0029a.d();
                            }
                            coil3.a aVar3 = (coil3.a) ref$ObjectRef.element;
                            lg70 lg70Var2 = (lg70) z.element;
                            engineInterceptor$execute$13.L$0 = ref$ObjectRef7;
                            engineInterceptor$execute$13.L$1 = obj;
                            engineInterceptor$execute$13.L$2 = agoVar;
                            engineInterceptor$execute$13.L$3 = z;
                            engineInterceptor$execute$13.L$4 = ref$ObjectRef;
                            engineInterceptor$execute$13.L$5 = ref$ObjectRef8;
                            engineInterceptor$execute$13.L$6 = ref$ObjectRef8;
                            engineInterceptor$execute$13.label = 1;
                            Object d = aVar.d(aVar3, ref$ObjectRef7, obj, lg70Var2, agoVar, engineInterceptor$execute$13);
                            engineInterceptor$execute$12 = engineInterceptor$execute$13;
                            if (d != coroutineSingletons) {
                                gevVar2 = gevVar;
                                obj2 = obj;
                                ref$ObjectRef2 = z;
                                ref$ObjectRef3 = ref$ObjectRef8;
                                ref$ObjectRef4 = ref$ObjectRef3;
                                agoVar2 = agoVar;
                                t = d;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th) {
                            th = th;
                            ref$ObjectRef7 = ref$ObjectRef8;
                            T t2 = ref$ObjectRef7.element;
                            zct0Var = t2 instanceof zct0 ? (zct0) t2 : null;
                            if (zct0Var != null && (xevVar = zct0Var.a) != null) {
                                oo31.o(xevVar);
                            }
                            throw th;
                        }
                    }
                    if (i == 1) {
                        ref$ObjectRef3 = (Ref$ObjectRef) engineInterceptor$execute$13.L$6;
                        ref$ObjectRef4 = (Ref$ObjectRef) engineInterceptor$execute$13.L$5;
                        Ref$ObjectRef ref$ObjectRef9 = (Ref$ObjectRef) engineInterceptor$execute$13.L$4;
                        Ref$ObjectRef ref$ObjectRef10 = (Ref$ObjectRef) engineInterceptor$execute$13.L$3;
                        agoVar2 = (ago) engineInterceptor$execute$13.L$2;
                        Object obj6 = engineInterceptor$execute$13.L$1;
                        gev gevVar3 = (gev) engineInterceptor$execute$13.L$0;
                        try {
                            kotlin.b.b(obj5);
                            engineInterceptor$execute$12 = engineInterceptor$execute$13;
                            ref$ObjectRef2 = ref$ObjectRef10;
                            obj2 = obj6;
                            ref$ObjectRef = ref$ObjectRef9;
                            gevVar2 = gevVar3;
                            t = obj5;
                        } catch (Throwable th2) {
                            th = th2;
                            ref$ObjectRef7 = ref$ObjectRef4;
                            T t22 = ref$ObjectRef7.element;
                            if (t22 instanceof zct0) {
                            }
                            if (zct0Var != null) {
                                try {
                                    oo31.o(xevVar);
                                } catch (RuntimeException e) {
                                    throw e;
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj5);
                            obj4 = obj5;
                            t1o t1oVar2 = (t1o) obj4;
                            q7v q7vVar = t1oVar2.a;
                            Bitmap.Config[] configArr = zx21.a;
                            if (q7vVar instanceof w06) {
                                ((w06) q7vVar).a.prepareToDraw();
                            }
                            return t1oVar2;
                        }
                        ref$ObjectRef5 = (Ref$ObjectRef) engineInterceptor$execute$13.L$3;
                        ref$ObjectRef6 = (Ref$ObjectRef) engineInterceptor$execute$13.L$2;
                        agoVar3 = (ago) engineInterceptor$execute$13.L$1;
                        gevVar2 = (gev) engineInterceptor$execute$13.L$0;
                        kotlin.b.b(obj5);
                        engineInterceptor$execute$12 = engineInterceptor$execute$13;
                        obj3 = obj5;
                        t1oVar = (t1o) obj3;
                        ref$ObjectRef2 = ref$ObjectRef6;
                        agoVar2 = agoVar3;
                        T t3 = ref$ObjectRef5.element;
                        zct0Var2 = t3 instanceof zct0 ? (zct0) t3 : null;
                        if (zct0Var2 != null && (xevVar2 = zct0Var2.a) != null) {
                            try {
                                oo31.o(xevVar2);
                            } catch (RuntimeException e2) {
                                throw e2;
                            } catch (Exception unused2) {
                            }
                        }
                        lg70 lg70Var3 = (lg70) ref$ObjectRef2.element;
                        engineInterceptor$execute$12.L$0 = null;
                        engineInterceptor$execute$12.L$1 = null;
                        engineInterceptor$execute$12.L$2 = null;
                        engineInterceptor$execute$12.L$3 = null;
                        engineInterceptor$execute$12.L$4 = null;
                        engineInterceptor$execute$12.L$5 = null;
                        engineInterceptor$execute$12.L$6 = null;
                        engineInterceptor$execute$12.label = 3;
                        Object a = b.a(t1oVar, gevVar2, lg70Var3, agoVar2, engineInterceptor$execute$12);
                        obj4 = a;
                    }
                    ref$ObjectRef3.element = t;
                    T t4 = ref$ObjectRef4.element;
                    hwqVar = (hwq) t4;
                    if (hwqVar instanceof zct0) {
                        ref$ObjectRef5 = ref$ObjectRef4;
                        if (!(hwqVar instanceof t9v)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        t1oVar = new t1o(((t9v) t4).a, ((t9v) t4).b, ((t9v) t4).c, null);
                        T t32 = ref$ObjectRef5.element;
                        if (t32 instanceof zct0) {
                        }
                        if (zct0Var2 != null) {
                        }
                        lg70 lg70Var32 = (lg70) ref$ObjectRef2.element;
                        engineInterceptor$execute$12.L$0 = null;
                        engineInterceptor$execute$12.L$1 = null;
                        engineInterceptor$execute$12.L$2 = null;
                        engineInterceptor$execute$12.L$3 = null;
                        engineInterceptor$execute$12.L$4 = null;
                        engineInterceptor$execute$12.L$5 = null;
                        engineInterceptor$execute$12.L$6 = null;
                        engineInterceptor$execute$12.label = 3;
                        Object a2 = b.a(t1oVar, gevVar2, lg70Var32, agoVar2, engineInterceptor$execute$12);
                        obj4 = a2;
                    } else {
                        fse fseVar = gevVar2.j;
                        ref$ObjectRef5 = ref$ObjectRef4;
                        EngineInterceptor$execute$executeResult$1 engineInterceptor$execute$executeResult$1 = new EngineInterceptor$execute$executeResult$1(aVar, ref$ObjectRef5, ref$ObjectRef, gevVar2, obj2, ref$ObjectRef2, agoVar2, null);
                        engineInterceptor$execute$12.L$0 = gevVar2;
                        engineInterceptor$execute$12.L$1 = agoVar2;
                        engineInterceptor$execute$12.L$2 = ref$ObjectRef2;
                        engineInterceptor$execute$12.L$3 = ref$ObjectRef5;
                        engineInterceptor$execute$12.L$4 = null;
                        engineInterceptor$execute$12.L$5 = null;
                        engineInterceptor$execute$12.L$6 = null;
                        engineInterceptor$execute$12.label = 2;
                        Object k0 = tje.k0(fseVar, engineInterceptor$execute$executeResult$1, engineInterceptor$execute$12);
                        if (k0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef6 = ref$ObjectRef2;
                        agoVar3 = agoVar2;
                        obj3 = k0;
                        t1oVar = (t1o) obj3;
                        ref$ObjectRef2 = ref$ObjectRef6;
                        agoVar2 = agoVar3;
                        T t322 = ref$ObjectRef5.element;
                        if (t322 instanceof zct0) {
                        }
                        if (zct0Var2 != null) {
                            oo31.o(xevVar2);
                        }
                        lg70 lg70Var322 = (lg70) ref$ObjectRef2.element;
                        engineInterceptor$execute$12.L$0 = null;
                        engineInterceptor$execute$12.L$1 = null;
                        engineInterceptor$execute$12.L$2 = null;
                        engineInterceptor$execute$12.L$3 = null;
                        engineInterceptor$execute$12.L$4 = null;
                        engineInterceptor$execute$12.L$5 = null;
                        engineInterceptor$execute$12.L$6 = null;
                        engineInterceptor$execute$12.label = 3;
                        Object a22 = b.a(t1oVar, gevVar2, lg70Var322, agoVar2, engineInterceptor$execute$12);
                        obj4 = a22;
                    }
                }
            }
            if (i != 0) {
            }
            ref$ObjectRef3.element = t;
            T t42 = ref$ObjectRef4.element;
            hwqVar = (hwq) t42;
            if (hwqVar instanceof zct0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        engineInterceptor$execute$1 = new EngineInterceptor$execute$1(aVar, continuationImpl);
        EngineInterceptor$execute$1 engineInterceptor$execute$132 = engineInterceptor$execute$1;
        Object obj52 = engineInterceptor$execute$132.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = engineInterceptor$execute$132.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r1v10, types: [l8w] */
    @Override // defpackage.o8w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c cVar, Continuation continuation) {
        EngineInterceptor$intercept$1 engineInterceptor$intercept$1;
        int i;
        Object a;
        c cVar2 = cVar;
        gp50 gp50Var = this.d;
        if (continuation instanceof EngineInterceptor$intercept$1) {
            engineInterceptor$intercept$1 = (EngineInterceptor$intercept$1) continuation;
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
                        gev gevVar = cVar2.d;
                        Object obj2 = gevVar.b;
                        xis0 xis0Var = cVar2.e;
                        ago agoVar = cVar2.f;
                        lg70 j = this.c.j(gevVar, xis0Var);
                        Scale scale = j.c;
                        agoVar.getClass();
                        List list = this.a.d.b;
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Pair pair = (Pair) list.get(i3);
                            ov00 ov00Var = (ov00) pair.getFirst();
                            if (((g0c) ((lfx) pair.getSecond())).e(obj2) && (a = ov00Var.a(obj2, j)) != null) {
                                obj2 = a;
                            }
                        }
                        ii10 I = gp50Var.I(gevVar, obj2, j, agoVar);
                        ji10 D = I != null ? gp50Var.D(gevVar, I, xis0Var, scale) : null;
                        if (D == null) {
                            fse fseVar = gevVar.i;
                            EngineInterceptor$intercept$2 engineInterceptor$intercept$2 = new EngineInterceptor$intercept$2(this, gevVar, obj2, j, agoVar, I, cVar2, null);
                            engineInterceptor$intercept$12.L$0 = cVar2;
                            engineInterceptor$intercept$12.label = 1;
                            Object k0 = tje.k0(fseVar, engineInterceptor$intercept$2, engineInterceptor$intercept$12);
                            return k0 == coroutineSingletons ? coroutineSingletons : k0;
                        }
                        Map map = D.b;
                        q7v q7vVar = D.a;
                        EnumC0136DataSource enumC0136DataSource = EnumC0136DataSource.MEMORY_CACHE;
                        Object obj3 = map.get("coil#disk_cache_key");
                        String str = obj3 instanceof String ? (String) obj3 : null;
                        Object obj4 = map.get("coil#is_sampled");
                        Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
                        return new t3v0(q7vVar, gevVar, enumC0136DataSource, I, str, bool != null ? bool.booleanValue() : false, cVar2.g);
                    } catch (Throwable th) {
                        th = th;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r1 = (l8w) engineInterceptor$intercept$12.L$0;
                    try {
                        kotlin.b.b(obj);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        cVar2 = r1;
                    }
                }
                if (th instanceof CancellationException) {
                    return ux21.a(cVar2.d, th);
                }
                throw th;
            }
        }
        engineInterceptor$intercept$1 = new EngineInterceptor$intercept$1(this, (ContinuationImpl) continuation);
        EngineInterceptor$intercept$1 engineInterceptor$intercept$122 = engineInterceptor$intercept$1;
        Object obj5 = engineInterceptor$intercept$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = engineInterceptor$intercept$122.label;
        if (i != 0) {
        }
        if (th instanceof CancellationException) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c4 -> B:10:0x00c7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(coil3.a aVar, gev gevVar, Object obj, lg70 lg70Var, ago agoVar, ContinuationImpl continuationImpl) {
        EngineInterceptor$fetch$1 engineInterceptor$fetch$1;
        int i;
        int i2;
        int size;
        Pair pair;
        pwq a;
        xev xevVar;
        if (continuationImpl instanceof EngineInterceptor$fetch$1) {
            engineInterceptor$fetch$1 = (EngineInterceptor$fetch$1) continuationImpl;
            int i3 = engineInterceptor$fetch$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                engineInterceptor$fetch$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = engineInterceptor$fetch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = engineInterceptor$fetch$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    i2 = 0;
                    size = ((List) aVar.f.getValue()).size();
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
                    ago agoVar2 = (ago) engineInterceptor$fetch$1.L$4;
                    lg70 lg70Var2 = (lg70) engineInterceptor$fetch$1.L$3;
                    Object obj3 = engineInterceptor$fetch$1.L$2;
                    gev gevVar2 = (gev) engineInterceptor$fetch$1.L$1;
                    coil3.a aVar2 = (coil3.a) engineInterceptor$fetch$1.L$0;
                    kotlin.b.b(obj2);
                    int intValue = i4;
                    aVar = aVar2;
                    agoVar = agoVar2;
                    gevVar = gevVar2;
                    lg70Var = lg70Var2;
                    obj = obj3;
                    hwq hwqVar = (hwq) obj2;
                    try {
                        agoVar.getClass();
                        if (hwqVar == null) {
                            return hwqVar;
                        }
                        i2 = intValue;
                        size = ((List) aVar.f.getValue()).size();
                        while (true) {
                            if (i2 < size) {
                                pair = null;
                                break;
                            }
                            Pair pair2 = (Pair) ((List) aVar.f.getValue()).get(i2);
                            nwq nwqVar = (nwq) pair2.getFirst();
                            if (((g0c) ((lfx) pair2.getSecond())).e(obj) && (a = nwqVar.a(obj, lg70Var, this.a)) != null) {
                                pair = new Pair(a, Integer.valueOf(i2));
                                break;
                            }
                            i2++;
                        }
                        if (pair != null) {
                            xfo.g(qv10.o("Unable to create a fetcher that supports: ", obj));
                            return null;
                        }
                        pwq pwqVar = (pwq) pair.c();
                        intValue = ((Number) pair.f()).intValue() + 1;
                        agoVar.getClass();
                        engineInterceptor$fetch$1.L$0 = aVar;
                        engineInterceptor$fetch$1.L$1 = gevVar;
                        engineInterceptor$fetch$1.L$2 = obj;
                        engineInterceptor$fetch$1.L$3 = lg70Var;
                        engineInterceptor$fetch$1.L$4 = agoVar;
                        engineInterceptor$fetch$1.L$5 = pwqVar;
                        engineInterceptor$fetch$1.I$0 = intValue;
                        engineInterceptor$fetch$1.label = 1;
                        obj2 = pwqVar.a(engineInterceptor$fetch$1);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        hwq hwqVar2 = (hwq) obj2;
                        agoVar.getClass();
                        if (hwqVar2 == null) {
                        }
                    } catch (Throwable th) {
                        zct0 zct0Var = hwqVar2 instanceof zct0 ? (zct0) hwqVar2 : null;
                        if (zct0Var != null && (xevVar = zct0Var.a) != null) {
                            try {
                                oo31.o(xevVar);
                            } catch (RuntimeException e) {
                                throw e;
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                }
            }
        }
        engineInterceptor$fetch$1 = new EngineInterceptor$fetch$1(this, continuationImpl);
        Object obj22 = engineInterceptor$fetch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = engineInterceptor$fetch$1.label;
        if (i != 0) {
        }
    }
}
