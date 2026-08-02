package xsna;

import java.io.IOException;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.yy70;

/* compiled from: OkioStorage.kt */
/* loaded from: classes.dex */
public final class bz70<T> implements ogl0<T> {
    public final tar a;
    public final aq90 b;
    public final vy70<T> c;
    public final uax d;
    public final yy70.a e;
    public final p04 f = new p04();
    public final wi50 g = bay.a();

    public bz70(tar tarVar, aq90 aq90Var, azc0 azc0Var, uax uaxVar, yy70.a aVar) {
        this.a = tarVar;
        this.b = aq90Var;
        this.c = azc0Var;
        this.d = uaxVar;
        this.e = aVar;
    }

    @Override // xsna.ogl0
    public final uax a() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fb A[Catch: all -> 0x010b, IOException -> 0x010e, TRY_ENTER, TryCatch #3 {all -> 0x010b, blocks: (B:19:0x00fb, B:21:0x0103, B:22:0x0113, B:26:0x011b, B:33:0x012a, B:36:0x0127), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011b A[Catch: all -> 0x010b, IOException -> 0x010e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x010b, blocks: (B:19:0x00fb, B:21:0x0103, B:22:0x0113, B:26:0x011b, B:33:0x012a, B:36:0x0127), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xsna.az70, xsna.spj] */
    /* JADX WARN: Type inference failed for: r0v3, types: [xsna.tar] */
    /* JADX WARN: Type inference failed for: r0v5, types: [xsna.tar] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, xsna.wi50] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [xsna.ui50] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [xsna.aq90] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, xsna.aq90] */
    /* JADX WARN: Type inference failed for: r4v6, types: [xsna.wzs] */
    /* JADX WARN: Type inference failed for: r8v1, types: [xsna.tar] */
    @Override // xsna.ogl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ovk ovkVar, ContinuationImpl continuationImpl) {
        ?? r0;
        ?? r11;
        CoroutineSingletons coroutineSingletons;
        ?? r2;
        bz70<T> bz70Var;
        ?? r22;
        aq90 h;
        ui50 ui50Var;
        dz70 dz70Var;
        Throwable th;
        ovf ovfVar;
        aq90 aq90Var;
        bz70<T> bz70Var2;
        ui50 ui50Var2;
        try {
            try {
                try {
                    try {
                        try {
                            if (continuationImpl instanceof az70) {
                                az70 az70Var = (az70) continuationImpl;
                                int i = az70Var.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    az70Var.label = i - Integer.MIN_VALUE;
                                    r0 = az70Var;
                                    r11 = r0.result;
                                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    r2 = r0.label;
                                    if (r2 != 0) {
                                        kotlin.a.a(r11);
                                        if (this.f.a.get()) {
                                            throw new IllegalStateException("StorageConnection has already been disposed.");
                                        }
                                        h = this.b.h();
                                        if (h == null) {
                                            throw new IllegalStateException("must have a parent path");
                                        }
                                        tar tarVar = this.a;
                                        tarVar.getClass();
                                        sk3 sk3Var = new sk3();
                                        for (aq90 aq90Var2 = h; aq90Var2 != null && !tarVar.d(aq90Var2); aq90Var2 = aq90Var2.h()) {
                                            sk3Var.addFirst(aq90Var2);
                                        }
                                        Iterator it = sk3Var.iterator();
                                        while (it.hasNext()) {
                                            tarVar.b((aq90) it.next());
                                        }
                                        r0.L$0 = this;
                                        r0.L$1 = ovkVar;
                                        r0.L$2 = h;
                                        ?? r112 = this.g;
                                        r0.L$3 = r112;
                                        r0.label = 1;
                                        if (r112.b(r0) != coroutineSingletons) {
                                            bz70Var = this;
                                            ui50Var = r112;
                                        }
                                        return coroutineSingletons;
                                    }
                                    if (r2 != 1) {
                                        if (r2 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ovfVar = (ovf) r0.L$3;
                                        aq90Var = (aq90) r0.L$2;
                                        ui50Var2 = (ui50) r0.L$1;
                                        bz70Var2 = (bz70) r0.L$0;
                                        try {
                                            kotlin.a.a(r11);
                                            s3q0 s3q0Var = s3q0.a;
                                            try {
                                                ovfVar.close();
                                                th = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                            if (th == null) {
                                                throw th;
                                            }
                                            if (bz70Var2.a.d(aq90Var)) {
                                                bz70Var2.a.a(aq90Var, bz70Var2.b);
                                            }
                                            s3q0 s3q0Var2 = s3q0.a;
                                            ui50Var2.c(null);
                                            return s3q0.a;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                ovfVar.close();
                                            } catch (Throwable th4) {
                                                mnh0.d(th, th4);
                                            }
                                            throw th;
                                        }
                                    }
                                    ui50 ui50Var3 = (ui50) r0.L$3;
                                    h = (aq90) r0.L$2;
                                    ?? r4 = (wzs) r0.L$1;
                                    bz70Var = (bz70) r0.L$0;
                                    kotlin.a.a(r11);
                                    ui50Var = ui50Var3;
                                    ovkVar = r4;
                                    StringBuilder sb = new StringBuilder();
                                    aq90 aq90Var3 = bz70Var.b;
                                    ?? r8 = bz70Var.a;
                                    sb.append(aq90Var3.c());
                                    sb.append(".tmp");
                                    r22 = h.j(sb.toString());
                                    r8.c(r22);
                                    dz70Var = new dz70(r8, r22, bz70Var.c);
                                    r0.L$0 = bz70Var;
                                    r0.L$1 = ui50Var;
                                    r0.L$2 = r22;
                                    r0.L$3 = dz70Var;
                                    r0.label = 2;
                                    if (ovkVar.invoke(dz70Var, r0) != coroutineSingletons) {
                                        aq90Var = r22;
                                        ovfVar = dz70Var;
                                        bz70Var2 = bz70Var;
                                        ui50Var2 = ui50Var;
                                        s3q0 s3q0Var3 = s3q0.a;
                                        ovfVar.close();
                                        th = null;
                                        if (th == null) {
                                        }
                                    }
                                    return coroutineSingletons;
                                }
                            }
                            r0.L$0 = bz70Var;
                            r0.L$1 = ui50Var;
                            r0.L$2 = r22;
                            r0.L$3 = dz70Var;
                            r0.label = 2;
                            if (ovkVar.invoke(dz70Var, r0) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        } catch (Throwable th5) {
                            th = th5;
                            ovfVar = dz70Var;
                            ovfVar.close();
                            throw th;
                        }
                        r8.c(r22);
                        dz70Var = new dz70(r8, r22, bz70Var.c);
                    } catch (IOException e) {
                        e = e;
                        if (bz70Var.a.d(r22)) {
                            try {
                                bz70Var.a.c(r22);
                            } catch (IOException unused) {
                            }
                        }
                        throw e;
                    }
                    if (r2 != 0) {
                    }
                    StringBuilder sb2 = new StringBuilder();
                    aq90 aq90Var32 = bz70Var.b;
                    ?? r82 = bz70Var.a;
                    sb2.append(aq90Var32.c());
                    sb2.append(".tmp");
                    r22 = h.j(sb2.toString());
                } catch (Throwable th6) {
                    th = th6;
                    r11.c(null);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                r11 = r2;
                r11.c(null);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            bz70Var = r0;
            r22 = coroutineSingletons;
        }
        r0 = new az70(this, continuationImpl);
        r11 = r0.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = r0.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|40|41|(1:43)(1:44))(2:53|54))|14|15|16|(2:(1:19)|20)(1:22)))|56|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0083, blocks: (B:22:0x0082, B:28:0x0093, B:31:0x0090, B:27:0x008b), top: B:7:0x0020, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [xsna.bz70] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xsna.zy70] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [xsna.bz70] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [xsna.pgl0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // xsna.ogl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(pgl0 pgl0Var, ContinuationImpl continuationImpl) {
        ?? r0;
        int i;
        Throwable th;
        ovf ovfVar;
        boolean z;
        bz70<T> bz70Var;
        try {
            if (continuationImpl instanceof zy70) {
                zy70 zy70Var = (zy70) continuationImpl;
                int i2 = zy70Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zy70Var.label = i2 - Integer.MIN_VALUE;
                    r0 = zy70Var;
                    Object obj = r0.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = r0.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        if (this.f.a.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean f = this.g.f();
                        try {
                            uy70 uy70Var = new uy70(this.a, this.b, this.c);
                            try {
                                Boolean valueOf = Boolean.valueOf(f);
                                r0.L$0 = this;
                                r0.L$1 = uy70Var;
                                r0.Z$0 = f;
                                r0.label = 1;
                                Object invoke = pgl0Var.invoke(uy70Var, valueOf, r0);
                                if (invoke == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                obj = invoke;
                                z = f;
                                bz70Var = this;
                                ovfVar = uy70Var;
                            } catch (Throwable th2) {
                                th = th2;
                                pgl0Var = f;
                                r0 = this;
                                ovfVar = uy70Var;
                                ovfVar.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            pgl0Var = f;
                            r0 = this;
                            if (pgl0Var != 0) {
                                r0.g.c(null);
                            }
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pgl0Var = r0.Z$0;
                        ovfVar = (ovf) r0.L$1;
                        r0 = (bz70) r0.L$0;
                        try {
                            kotlin.a.a(obj);
                            bz70Var = r0;
                            z = pgl0Var;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                ovfVar.close();
                            } catch (Throwable th5) {
                                mnh0.d(th, th5);
                            }
                            throw th;
                        }
                    }
                    ovfVar.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z) {
                        bz70Var.g.c(null);
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            ovfVar.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
        }
        r0 = new zy70(this, continuationImpl);
        Object obj2 = r0.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = r0.label;
    }

    @Override // xsna.ovf
    public final void close() {
        this.f.a.set(true);
        this.e.invoke();
    }
}
