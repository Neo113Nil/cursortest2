package xsna;

import androidx.compose.ui.node.LayoutNode;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import xsna.q630;

/* compiled from: NestedScrollModifier.kt */
/* loaded from: classes11.dex */
public final class e160 {
    public k160 a;
    public k160 b;
    public Lambda c = new a();
    public yvj d;

    /* compiled from: NestedScrollModifier.kt */
    public static final class a extends Lambda implements gzs<yvj> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final yvj invoke() {
            return e160.this.d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (r1 == r2) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c3, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c1, code lost:
    
        if (r1 == r2) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j2, ContinuationImpl continuationImpl) {
        f160 f160Var;
        int i;
        int i2;
        k160 k160Var;
        k160 k160Var2;
        npp0 npp0Var;
        u470 u470Var;
        long j3;
        npp0 npp0Var2;
        u470 u470Var2;
        if (continuationImpl instanceof f160) {
            f160Var = (f160) continuationImpl;
            int i3 = f160Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f160Var.label = i3 - Integer.MIN_VALUE;
                f160 f160Var2 = f160Var;
                Object obj = f160Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = f160Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    k160 k160Var3 = this.a;
                    int i4 = SQLiteDatabase.OPEN_PRIVATECACHE;
                    if (k160Var3 == null || !k160Var3.o) {
                        i2 = 262144;
                        k160Var = null;
                    } else {
                        if (!k160Var3.b.o) {
                            uzw.b("visitAncestors called on an unattached node");
                        }
                        q630.c cVar = k160Var3.b.f;
                        LayoutNode f = itl.f(k160Var3);
                        loop0: while (true) {
                            if (f == null) {
                                i2 = i4;
                                npp0Var2 = null;
                                break;
                            }
                            if ((f.G.f.e & i4) != 0) {
                                while (cVar != null) {
                                    if ((cVar.d & i4) != 0) {
                                        q630.c cVar2 = cVar;
                                        ci50 ci50Var = null;
                                        while (cVar2 != null) {
                                            i2 = i4;
                                            if (cVar2 instanceof npp0) {
                                                npp0Var2 = (npp0) cVar2;
                                                if (epx.f(k160Var3.s, npp0Var2.g0()) && k160.class == npp0Var2.getClass()) {
                                                    break loop0;
                                                }
                                            }
                                            if ((cVar2.d & i2) != 0 && (cVar2 instanceof ytl)) {
                                                int i5 = 0;
                                                for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                                    if ((cVar3.d & i2) != 0) {
                                                        i5++;
                                                        if (i5 == 1) {
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
                                                if (i5 == 1) {
                                                    i4 = i2;
                                                }
                                            }
                                            cVar2 = itl.b(ci50Var);
                                            i4 = i2;
                                        }
                                    }
                                    cVar = cVar.f;
                                    i4 = i4;
                                }
                            }
                            int i6 = i4;
                            f = f.I();
                            cVar = (f == null || (u470Var2 = f.G) == null) ? null : u470Var2.e;
                            i4 = i6;
                        }
                        k160Var = (k160) npp0Var2;
                    }
                    if (k160Var == null) {
                        k160 k160Var4 = this.b;
                        if (k160Var4 != null) {
                            f160Var2.label = 1;
                            obj = k160Var4.m0(j, j2, f160Var2);
                        }
                        j3 = 0;
                    } else {
                        k160 k160Var5 = this.a;
                        if (k160Var5 == null || !k160Var5.o) {
                            k160Var2 = null;
                        } else {
                            if (!k160Var5.b.o) {
                                uzw.b("visitAncestors called on an unattached node");
                            }
                            q630.c cVar4 = k160Var5.b.f;
                            LayoutNode f2 = itl.f(k160Var5);
                            loop3: while (true) {
                                if (f2 == null) {
                                    npp0Var = null;
                                    break;
                                }
                                if ((f2.G.f.e & i2) != 0) {
                                    while (cVar4 != null) {
                                        if ((cVar4.d & i2) != 0) {
                                            q630.c cVar5 = cVar4;
                                            ci50 ci50Var2 = null;
                                            while (cVar5 != null) {
                                                if (cVar5 instanceof npp0) {
                                                    npp0 npp0Var3 = (npp0) cVar5;
                                                    if (epx.f(k160Var5.s, npp0Var3.g0()) && k160.class == npp0Var3.getClass()) {
                                                        npp0Var = npp0Var3;
                                                        break loop3;
                                                    }
                                                }
                                                if ((cVar5.d & i2) != 0 && (cVar5 instanceof ytl)) {
                                                    int i7 = 0;
                                                    for (q630.c cVar6 = ((ytl) cVar5).q; cVar6 != null; cVar6 = cVar6.g) {
                                                        if ((cVar6.d & i2) != 0) {
                                                            i7++;
                                                            if (i7 == 1) {
                                                                cVar5 = cVar6;
                                                            } else {
                                                                if (ci50Var2 == null) {
                                                                    ci50Var2 = new ci50(new q630.c[16]);
                                                                }
                                                                if (cVar5 != null) {
                                                                    ci50Var2.b(cVar5);
                                                                    cVar5 = null;
                                                                }
                                                                ci50Var2.b(cVar6);
                                                            }
                                                        }
                                                    }
                                                    if (i7 == 1) {
                                                    }
                                                }
                                                cVar5 = itl.b(ci50Var2);
                                            }
                                        }
                                        cVar4 = cVar4.f;
                                    }
                                }
                                f2 = f2.I();
                                cVar4 = (f2 == null || (u470Var = f2.G) == null) ? null : u470Var.e;
                            }
                            k160Var2 = (k160) npp0Var;
                        }
                        if (k160Var2 != null) {
                            f160Var2.label = 2;
                            obj = k160Var2.m0(j, j2, f160Var2);
                        }
                        j3 = 0;
                    }
                } else if (i == 1) {
                    kotlin.a.a(obj);
                    j3 = ((jmr0) obj).a;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    j3 = ((jmr0) obj).a;
                }
                return new jmr0(j3);
            }
        }
        f160Var = new f160(this, continuationImpl);
        f160 f160Var22 = f160Var;
        Object obj2 = f160Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = f160Var22.label;
        if (i != 0) {
        }
        return new jmr0(j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, ContinuationImpl continuationImpl) {
        g160 g160Var;
        int i;
        long j2;
        u470 u470Var;
        if (continuationImpl instanceof g160) {
            g160Var = (g160) continuationImpl;
            int i2 = g160Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g160Var.label = i2 - Integer.MIN_VALUE;
                Object obj = g160Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = g160Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    k160 k160Var = this.a;
                    k160 k160Var2 = null;
                    if (k160Var != null && k160Var.o) {
                        if (!k160Var.b.o) {
                            uzw.b("visitAncestors called on an unattached node");
                        }
                        q630.c cVar = k160Var.b.f;
                        LayoutNode f = itl.f(k160Var);
                        loop0: while (true) {
                            if (f == null) {
                                break;
                            }
                            if ((f.G.f.e & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                while (cVar != null) {
                                    if ((cVar.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                        ci50 ci50Var = null;
                                        q630.c cVar2 = cVar;
                                        while (cVar2 != null) {
                                            if (cVar2 instanceof npp0) {
                                                npp0 npp0Var = (npp0) cVar2;
                                                if (epx.f(k160Var.s, npp0Var.g0()) && k160.class == npp0Var.getClass()) {
                                                    k160Var2 = npp0Var;
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
                        k160Var2 = k160Var2;
                    }
                    if (k160Var2 == null) {
                        j2 = 0;
                        return new jmr0(j2);
                    }
                    g160Var.label = 1;
                    obj = k160Var2.M(j, g160Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                j2 = ((jmr0) obj).a;
                return new jmr0(j2);
            }
        }
        g160Var = new g160(this, continuationImpl);
        Object obj2 = g160Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = g160Var.label;
        if (i != 0) {
        }
        j2 = ((jmr0) obj2).a;
        return new jmr0(j2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.Lambda, xsna.gzs] */
    public final yvj c() {
        yvj yvjVar = (yvj) this.c.invoke();
        if (yvjVar != null) {
            return yvjVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
