package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.q630;

/* compiled from: NestedScrollNode.kt */
/* loaded from: classes11.dex */
public final class k160 extends q630.c implements npp0, d160 {
    public d160 p;
    public e160 q;
    public k160 r;
    public final String s;

    /* compiled from: NestedScrollNode.kt */
    @b6l(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {113, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "onPostFling-RZ2iAVY", v = 1)
    public static final class a extends ContinuationImpl {
        long J$0;
        long J$1;
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k160.this.m0(0L, 0L, this);
        }
    }

    /* compiled from: NestedScrollNode.kt */
    @b6l(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED}, m = "onPreFling-QWom1Mo", v = 1)
    public static final class b extends ContinuationImpl {
        long J$0;
        int label;
        /* synthetic */ Object result;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k160.this.M(0L, this);
        }
    }

    public k160(d160 d160Var, e160 e160Var) {
        this.p = d160Var;
        this.q = e160Var == null ? new e160() : e160Var;
        this.s = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x00f1, code lost:
    
        if (r3 == r5) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // xsna.d160
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(long j, spj<? super jmr0> spjVar) {
        b bVar;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        long j2;
        u470 u470Var;
        long j3;
        long j4 = j;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                obj = bVar.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    boolean z = this.o;
                    k160 k160Var = null;
                    if (z && z) {
                        if (!this.b.o) {
                            uzw.b("visitAncestors called on an unattached node");
                        }
                        q630.c cVar = this.b.f;
                        LayoutNode f = itl.f(this);
                        loop0: while (true) {
                            if (f == null) {
                                break;
                            }
                            if ((f.G.f.e & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                while (cVar != null) {
                                    if ((cVar.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                        q630.c cVar2 = cVar;
                                        ci50 ci50Var = null;
                                        while (cVar2 != null) {
                                            if (cVar2 instanceof npp0) {
                                                npp0 npp0Var = (npp0) cVar2;
                                                if (epx.f(this.s, npp0Var.g0()) && k160.class == npp0Var.getClass()) {
                                                    k160Var = npp0Var;
                                                    break loop0;
                                                }
                                            }
                                            if ((cVar2.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && (cVar2 instanceof ytl)) {
                                                int i3 = 0;
                                                for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                                    if ((cVar3.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                                        i3++;
                                                        if (i3 == 1) {
                                                            cVar2 = cVar3;
                                                        } else {
                                                            if (ci50Var == null) {
                                                                ci50Var = new ci50(new q630.c[16]);
                                                            }
                                                            if (cVar2 != null) {
                                                                ci50Var.b(cVar2);
                                                                cVar2 = null;
                                                            }
                                                            ci50Var.b(cVar3);
                                                        }
                                                    }
                                                }
                                                if (i3 == 1) {
                                                }
                                            }
                                            cVar2 = itl.b(ci50Var);
                                        }
                                    }
                                    cVar = cVar.f;
                                }
                            }
                            f = f.I();
                            cVar = (f == null || (u470Var = f.G) == null) ? null : u470Var.e;
                        }
                        k160Var = k160Var;
                    }
                    if (k160Var == null) {
                        j2 = 0;
                        d160 d160Var = this.p;
                        long d = jmr0.d(j4, j2);
                        bVar.J$0 = j2;
                        bVar.label = 2;
                        obj = d160Var.M(d, bVar);
                        if (obj != coroutineSingletons) {
                            j3 = j2;
                            return new jmr0(jmr0.e(j3, ((jmr0) obj).a));
                        }
                        return coroutineSingletons;
                    }
                    bVar.J$0 = j4;
                    bVar.label = 1;
                    obj = k160Var.M(j4, bVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j3 = bVar.J$0;
                        kotlin.a.a(obj);
                        return new jmr0(jmr0.e(j3, ((jmr0) obj).a));
                    }
                    j4 = bVar.J$0;
                    kotlin.a.a(obj);
                }
                j2 = ((jmr0) obj).a;
                d160 d160Var2 = this.p;
                long d2 = jmr0.d(j4, j2);
                bVar.J$0 = j2;
                bVar.label = 2;
                obj = d160Var2.M(d2, bVar);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        bVar = new b((ContinuationImpl) spjVar);
        obj = bVar.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        j2 = ((jmr0) obj).a;
        d160 d160Var22 = this.p;
        long d22 = jmr0.d(j4, j2);
        bVar.J$0 = j2;
        bVar.label = 2;
        obj = d160Var22.M(d22, bVar);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.d160
    public final long R0(int i, long j) {
        u470 u470Var;
        boolean z = this.o;
        k160 k160Var = null;
        if (z && z) {
            if (!this.b.o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar = this.b.f;
            LayoutNode f = itl.f(this);
            loop0: while (true) {
                if (f == null) {
                    break;
                }
                if ((f.G.f.e & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                    while (cVar != null) {
                        if ((cVar.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                            q630.c cVar2 = cVar;
                            ci50 ci50Var = null;
                            while (cVar2 != null) {
                                if (cVar2 instanceof npp0) {
                                    npp0 npp0Var = (npp0) cVar2;
                                    if (epx.f(this.s, npp0Var.g0()) && k160.class == npp0Var.getClass()) {
                                        k160Var = npp0Var;
                                        break loop0;
                                    }
                                }
                                if ((cVar2.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && (cVar2 instanceof ytl)) {
                                    int i2 = 0;
                                    for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                        if ((cVar3.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVar2 = cVar3;
                                            } else {
                                                if (ci50Var == null) {
                                                    ci50Var = new ci50(new q630.c[16]);
                                                }
                                                if (cVar2 != null) {
                                                    ci50Var.b(cVar2);
                                                    cVar2 = null;
                                                }
                                                ci50Var.b(cVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVar2 = itl.b(ci50Var);
                            }
                        }
                        cVar = cVar.f;
                    }
                }
                f = f.I();
                cVar = (f == null || (u470Var = f.G) == null) ? null : u470Var.e;
            }
            k160Var = k160Var;
        }
        long R0 = k160Var != null ? k160Var.R0(i, j) : 0L;
        return ov70.f(R0, this.p.R0(i, ov70.e(j, R0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.d160
    public final long W0(int i, long j, long j2) {
        u470 u470Var;
        long W0 = this.p.W0(i, j, j2);
        boolean z = this.o;
        k160 k160Var = null;
        if (z && z) {
            if (!this.b.o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar = this.b.f;
            LayoutNode f = itl.f(this);
            loop0: while (true) {
                if (f == null) {
                    break;
                }
                if ((f.G.f.e & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                    while (cVar != null) {
                        if ((cVar.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                            q630.c cVar2 = cVar;
                            ci50 ci50Var = null;
                            while (cVar2 != null) {
                                if (cVar2 instanceof npp0) {
                                    npp0 npp0Var = (npp0) cVar2;
                                    if (epx.f(this.s, npp0Var.g0()) && k160.class == npp0Var.getClass()) {
                                        k160Var = npp0Var;
                                        break loop0;
                                    }
                                }
                                if ((cVar2.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && (cVar2 instanceof ytl)) {
                                    int i2 = 0;
                                    for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                        if ((cVar3.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVar2 = cVar3;
                                            } else {
                                                if (ci50Var == null) {
                                                    ci50Var = new ci50(new q630.c[16]);
                                                }
                                                if (cVar2 != null) {
                                                    ci50Var.b(cVar2);
                                                    cVar2 = null;
                                                }
                                                ci50Var.b(cVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVar2 = itl.b(ci50Var);
                            }
                        }
                        cVar = cVar.f;
                    }
                }
                f = f.I();
                cVar = (f == null || (u470Var = f.G) == null) ? null : u470Var.e;
            }
            k160Var = k160Var;
        }
        k160 k160Var2 = k160Var;
        return ov70.f(W0, k160Var2 != null ? k160Var2.W0(i, ov70.f(j, W0), ov70.e(j2, W0)) : 0L);
    }

    @Override // xsna.q630.c
    public final void a2() {
        e160 e160Var = this.q;
        e160Var.a = this;
        e160Var.b = null;
        this.r = null;
        e160Var.c = new l160(this);
        this.q.d = W1();
    }

    @Override // xsna.q630.c
    public final void b2() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        hr80.I(this, new m160(ref$ObjectRef));
        k160 k160Var = (k160) ((npp0) ref$ObjectRef.element);
        this.r = k160Var;
        e160 e160Var = this.q;
        e160Var.b = k160Var;
        if (e160Var.a == this) {
            e160Var.a = null;
        }
    }

    @Override // xsna.npp0
    public final Object g0() {
        return this.s;
    }

    public final yvj i2() {
        k160 k160Var;
        npp0 npp0Var;
        u470 u470Var;
        if (this.o) {
            if (!this.b.o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar = this.b.f;
            LayoutNode f = itl.f(this);
            loop0: while (true) {
                if (f == null) {
                    npp0Var = null;
                    break;
                }
                if ((f.G.f.e & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                    while (cVar != null) {
                        if ((cVar.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                            q630.c cVar2 = cVar;
                            ci50 ci50Var = null;
                            while (cVar2 != null) {
                                if (cVar2 instanceof npp0) {
                                    npp0Var = (npp0) cVar2;
                                    if (epx.f(this.s, npp0Var.g0()) && k160.class == npp0Var.getClass()) {
                                        break loop0;
                                    }
                                }
                                if ((cVar2.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && (cVar2 instanceof ytl)) {
                                    int i = 0;
                                    for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                        if ((cVar3.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cVar2 = cVar3;
                                            } else {
                                                if (ci50Var == null) {
                                                    ci50Var = new ci50(new q630.c[16]);
                                                }
                                                if (cVar2 != null) {
                                                    ci50Var.b(cVar2);
                                                    cVar2 = null;
                                                }
                                                ci50Var.b(cVar3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                cVar2 = itl.b(ci50Var);
                            }
                        }
                        cVar = cVar.f;
                    }
                }
                f = f.I();
                cVar = (f == null || (u470Var = f.G) == null) ? null : u470Var.e;
            }
            k160Var = (k160) npp0Var;
        } else {
            k160Var = null;
        }
        yvj i2 = k160Var != null ? k160Var.i2() : null;
        if (i2 != null && zvj.f(i2)) {
            return i2;
        }
        yvj yvjVar = this.q.d;
        if (yvjVar != null) {
            return yvjVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // xsna.d160
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m0(long j, long j2, spj<? super jmr0> spjVar) {
        a aVar;
        int i;
        long j3;
        long j4;
        long j5;
        boolean z;
        k160 k160Var;
        long j6;
        long j7;
        npp0 npp0Var;
        u470 u470Var;
        int i2;
        int i3;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i4 = aVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.label = i4 - Integer.MIN_VALUE;
                a aVar2 = aVar;
                Object obj = aVar2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar2.label;
                int i5 = 1;
                if (i != 0) {
                    kotlin.a.a(obj);
                    d160 d160Var = this.p;
                    aVar2.J$0 = j;
                    aVar2.J$1 = j2;
                    aVar2.label = 1;
                    obj = d160Var.m0(j, j2, aVar2);
                    if (obj != coroutineSingletons) {
                        j3 = j;
                        j4 = j2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j7 = aVar2.J$0;
                    kotlin.a.a(obj);
                    j6 = ((jmr0) obj).a;
                    j5 = j7;
                    return new jmr0(jmr0.e(j5, j6));
                }
                j4 = aVar2.J$1;
                j3 = aVar2.J$0;
                kotlin.a.a(obj);
                j5 = ((jmr0) obj).a;
                z = this.o;
                if (z) {
                    k160Var = this.r;
                } else if (z && z) {
                    if (!this.b.o) {
                        uzw.b("visitAncestors called on an unattached node");
                    }
                    q630.c cVar = this.b.f;
                    LayoutNode f = itl.f(this);
                    loop0: while (true) {
                        if (f == null) {
                            npp0Var = null;
                            break;
                        }
                        int i6 = f.G.f.e;
                        int i7 = SQLiteDatabase.OPEN_PRIVATECACHE;
                        if ((i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                            while (cVar != null) {
                                if ((cVar.d & i7) != 0) {
                                    q630.c cVar2 = cVar;
                                    ci50 ci50Var = null;
                                    while (cVar2 != null) {
                                        if (cVar2 instanceof npp0) {
                                            npp0Var = (npp0) cVar2;
                                            i2 = i7;
                                            if (epx.f(this.s, npp0Var.g0()) && k160.class == npp0Var.getClass()) {
                                                break loop0;
                                            }
                                        } else {
                                            i2 = i7;
                                        }
                                        if ((cVar2.d & i2) == 0 || !(cVar2 instanceof ytl)) {
                                            i3 = i5;
                                        } else {
                                            q630.c cVar3 = ((ytl) cVar2).q;
                                            int i8 = 0;
                                            while (cVar3 != null) {
                                                if ((cVar3.d & i2) != 0) {
                                                    i8++;
                                                    if (i8 == i5) {
                                                        cVar2 = cVar3;
                                                    } else {
                                                        ci50 ci50Var2 = ci50Var == null ? new ci50(new q630.c[16]) : ci50Var;
                                                        if (cVar2 != null) {
                                                            ci50Var2.b(cVar2);
                                                            cVar2 = null;
                                                        }
                                                        ci50Var2.b(cVar3);
                                                        ci50Var = ci50Var2;
                                                    }
                                                }
                                                cVar3 = cVar3.g;
                                                i5 = 1;
                                            }
                                            i3 = i5;
                                            if (i8 == i3) {
                                                i7 = i2;
                                                i5 = i3;
                                            }
                                        }
                                        cVar2 = itl.b(ci50Var);
                                        i7 = i2;
                                        i5 = i3;
                                    }
                                }
                                cVar = cVar.f;
                                i7 = i7;
                                i5 = i5;
                            }
                        }
                        int i9 = i5;
                        f = f.I();
                        cVar = (f == null || (u470Var = f.G) == null) ? null : u470Var.e;
                        i5 = i9;
                    }
                    k160Var = (k160) npp0Var;
                } else {
                    k160Var = null;
                }
                if (k160Var != null) {
                    j6 = 0;
                    return new jmr0(jmr0.e(j5, j6));
                }
                long e = jmr0.e(j3, j5);
                long d = jmr0.d(j4, j5);
                aVar2.J$0 = j5;
                aVar2.label = 2;
                obj = k160Var.m0(e, d, aVar2);
                if (obj != coroutineSingletons) {
                    j7 = j5;
                    j6 = ((jmr0) obj).a;
                    j5 = j7;
                    return new jmr0(jmr0.e(j5, j6));
                }
                return coroutineSingletons;
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        a aVar22 = aVar;
        Object obj2 = aVar22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar22.label;
        int i52 = 1;
        if (i != 0) {
        }
        j5 = ((jmr0) obj2).a;
        z = this.o;
        if (z) {
        }
        if (k160Var != null) {
        }
    }
}
