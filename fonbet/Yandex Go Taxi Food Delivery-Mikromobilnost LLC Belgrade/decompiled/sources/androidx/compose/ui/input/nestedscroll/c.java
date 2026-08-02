package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.LayoutNode;
import defpackage.bvf0;
import defpackage.dai0;
import defpackage.dd11;
import defpackage.e530;
import defpackage.gn50;
import defpackage.ixv;
import defpackage.jl40;
import defpackage.k631;
import defpackage.lqh;
import defpackage.ny61;
import defpackage.qje;
import defpackage.t300;
import defpackage.tls;
import defpackage.tse;
import defpackage.v7x0;
import defpackage.wu60;
import defpackage.wz40;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class c extends e530 implements dd11, gn50 {
    public gn50 a;
    public NestedScrollDispatcher b;
    public c c;
    public final String w;

    public c(gn50 gn50Var, NestedScrollDispatcher nestedScrollDispatcher) {
        this.a = gn50Var;
        this.b = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.w = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public final tse E0() {
        c F0 = F0();
        tse E0 = F0 != null ? F0.E0() : null;
        if (E0 != null && bvf0.D(E0)) {
            return E0;
        }
        tse tseVar = this.b.d;
        if (tseVar != null) {
            return tseVar;
        }
        ny61.r("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final c F0() {
        t300 t300Var;
        dd11 dd11Var = null;
        if (!isAttached()) {
            return null;
        }
        if (!getNode().isAttached()) {
            ixv.b("visitAncestors called on an unattached node");
        }
        e530 parent$ui = getNode().getParent$ui();
        LayoutNode P = qje.P(this);
        loop0: while (true) {
            if (P == null) {
                break;
            }
            if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & 262144) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                        e530 e530Var = parent$ui;
                        wz40 wz40Var = null;
                        while (e530Var != null) {
                            if (e530Var instanceof dd11) {
                                dd11 dd11Var2 = (dd11) e530Var;
                                if (jl40.l(this.w, dd11Var2.V()) && c.class == dd11Var2.getClass()) {
                                    dd11Var = dd11Var2;
                                    break loop0;
                                }
                            }
                            if ((e530Var.getKindSet$ui() & 262144) != 0 && (e530Var instanceof lqh)) {
                                int i = 0;
                                for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                    if ((e530Var2.getKindSet$ui() & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            e530Var = e530Var2;
                                        } else {
                                            if (wz40Var == null) {
                                                wz40Var = new wz40(new e530[16]);
                                            }
                                            if (e530Var != null) {
                                                wz40Var.b(e530Var);
                                                e530Var = null;
                                            }
                                            wz40Var.b(e530Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            e530Var = qje.c(wz40Var);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            P = P.s();
            parent$ui = (P == null || (t300Var = P.a0) == null) ? null : (v7x0) t300Var.f;
        }
        return (c) dd11Var;
    }

    @Override // defpackage.dd11
    public final Object V() {
        return this.w;
    }

    @Override // defpackage.e530
    public final void onAttach() {
        NestedScrollDispatcher nestedScrollDispatcher = this.b;
        nestedScrollDispatcher.a = this;
        nestedScrollDispatcher.b = null;
        this.c = null;
        nestedScrollDispatcher.c = new NestedScrollNode$updateDispatcherFields$1(this);
        nestedScrollDispatcher.d = getCoroutineScope();
    }

    @Override // defpackage.e530
    public final void onDetach() {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        dai0.M(this, new tls() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt$findNearestAttachedAncestor$1
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, cqh, dd11] */
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                boolean z;
                ?? r2 = (dd11) obj;
                if (r2.getNode().isAttached()) {
                    Ref$ObjectRef.this.element = r2;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        c cVar = (c) ((dd11) ref$ObjectRef.element);
        this.c = cVar;
        NestedScrollDispatcher nestedScrollDispatcher = this.b;
        nestedScrollDispatcher.b = cVar;
        if (nestedScrollDispatcher.a == this) {
            nestedScrollDispatcher.a = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.gn50
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo28onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$1;
        int i;
        long j3;
        long i2;
        gn50 gn50Var;
        long j4;
        long j5;
        if (continuation instanceof NestedScrollNode$onPostFling$1) {
            nestedScrollNode$onPostFling$1 = (NestedScrollNode$onPostFling$1) continuation;
            int i3 = nestedScrollNode$onPostFling$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPostFling$1.label = i3 - Integer.MIN_VALUE;
                NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$12 = nestedScrollNode$onPostFling$1;
                Object obj = nestedScrollNode$onPostFling$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nestedScrollNode$onPostFling$12.label;
                c cVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gn50 gn50Var2 = this.a;
                    nestedScrollNode$onPostFling$12.J$0 = j;
                    nestedScrollNode$onPostFling$12.J$1 = j2;
                    nestedScrollNode$onPostFling$12.label = 1;
                    obj = gn50Var2.mo28onPostFlingRZ2iAVY(j, j2, nestedScrollNode$onPostFling$12);
                    if (obj != coroutineSingletons) {
                        j3 = j2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j5 = nestedScrollNode$onPostFling$12.J$0;
                    kotlin.b.b(obj);
                    j4 = ((k631) obj).i();
                    i2 = j5;
                    return k631.a(k631.f(i2, j4));
                }
                long j6 = nestedScrollNode$onPostFling$12.J$1;
                long j7 = nestedScrollNode$onPostFling$12.J$0;
                kotlin.b.b(obj);
                j3 = j6;
                j = j7;
                i2 = ((k631) obj).i();
                if (isAttached()) {
                    cVar = this.c;
                } else if (isAttached()) {
                    cVar = F0();
                }
                gn50Var = cVar;
                if (gn50Var != null) {
                    j4 = 0;
                    return k631.a(k631.f(i2, j4));
                }
                long f = k631.f(j, i2);
                long e = k631.e(j3, i2);
                nestedScrollNode$onPostFling$12.J$0 = i2;
                nestedScrollNode$onPostFling$12.label = 2;
                obj = gn50Var.mo28onPostFlingRZ2iAVY(f, e, nestedScrollNode$onPostFling$12);
                if (obj != coroutineSingletons) {
                    j5 = i2;
                    j4 = ((k631) obj).i();
                    i2 = j5;
                    return k631.a(k631.f(i2, j4));
                }
                return coroutineSingletons;
            }
        }
        nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, (ContinuationImpl) continuation);
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$122 = nestedScrollNode$onPostFling$1;
        Object obj2 = nestedScrollNode$onPostFling$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nestedScrollNode$onPostFling$122.label;
        c cVar2 = null;
        if (i != 0) {
        }
        i2 = ((k631) obj2).i();
        if (isAttached()) {
        }
        gn50Var = cVar2;
        if (gn50Var != null) {
        }
    }

    @Override // defpackage.gn50
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo29onPostScrollDzOQY0M(long j, long j2, int i) {
        long mo29onPostScrollDzOQY0M = this.a.mo29onPostScrollDzOQY0M(j, j2, i);
        c F0 = isAttached() ? F0() : null;
        return wu60.f(mo29onPostScrollDzOQY0M, F0 != null ? F0.mo29onPostScrollDzOQY0M(wu60.f(j, mo29onPostScrollDzOQY0M), wu60.e(j2, mo29onPostScrollDzOQY0M), i) : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.gn50
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo33onPreFlingQWom1Mo(long j, Continuation continuation) {
        NestedScrollNode$onPreFling$1 nestedScrollNode$onPreFling$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        long j2;
        long j3;
        if (continuation instanceof NestedScrollNode$onPreFling$1) {
            nestedScrollNode$onPreFling$1 = (NestedScrollNode$onPreFling$1) continuation;
            int i2 = nestedScrollNode$onPreFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPreFling$1.label = i2 - Integer.MIN_VALUE;
                obj = nestedScrollNode$onPreFling$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nestedScrollNode$onPreFling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c F0 = isAttached() ? F0() : null;
                    if (F0 == null) {
                        j2 = 0;
                        gn50 gn50Var = this.a;
                        long e = k631.e(j, j2);
                        nestedScrollNode$onPreFling$1.J$0 = j2;
                        nestedScrollNode$onPreFling$1.label = 2;
                        obj = gn50Var.mo33onPreFlingQWom1Mo(e, nestedScrollNode$onPreFling$1);
                        if (obj != coroutineSingletons) {
                            j3 = j2;
                            return k631.a(k631.f(j3, ((k631) obj).i()));
                        }
                        return coroutineSingletons;
                    }
                    nestedScrollNode$onPreFling$1.J$0 = j;
                    nestedScrollNode$onPreFling$1.label = 1;
                    obj = F0.mo33onPreFlingQWom1Mo(j, nestedScrollNode$onPreFling$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = nestedScrollNode$onPreFling$1.J$0;
                        kotlin.b.b(obj);
                        return k631.a(k631.f(j3, ((k631) obj).i()));
                    }
                    j = nestedScrollNode$onPreFling$1.J$0;
                    kotlin.b.b(obj);
                }
                j2 = ((k631) obj).i();
                gn50 gn50Var2 = this.a;
                long e2 = k631.e(j, j2);
                nestedScrollNode$onPreFling$1.J$0 = j2;
                nestedScrollNode$onPreFling$1.label = 2;
                obj = gn50Var2.mo33onPreFlingQWom1Mo(e2, nestedScrollNode$onPreFling$1);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        nestedScrollNode$onPreFling$1 = new NestedScrollNode$onPreFling$1(this, (ContinuationImpl) continuation);
        obj = nestedScrollNode$onPreFling$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nestedScrollNode$onPreFling$1.label;
        if (i != 0) {
        }
        j2 = ((k631) obj).i();
        gn50 gn50Var22 = this.a;
        long e22 = k631.e(j, j2);
        nestedScrollNode$onPreFling$1.J$0 = j2;
        nestedScrollNode$onPreFling$1.label = 2;
        obj = gn50Var22.mo33onPreFlingQWom1Mo(e22, nestedScrollNode$onPreFling$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // defpackage.gn50
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo34onPreScrollOzD1aCk(long j, int i) {
        c F0 = isAttached() ? F0() : null;
        long mo34onPreScrollOzD1aCk = F0 != null ? F0.mo34onPreScrollOzD1aCk(j, i) : 0L;
        return wu60.f(mo34onPreScrollOzD1aCk, this.a.mo34onPreScrollOzD1aCk(wu60.e(j, mo34onPreScrollOzD1aCk), i));
    }
}
