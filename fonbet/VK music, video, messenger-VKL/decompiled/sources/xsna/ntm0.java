package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import xsna.cdp0;
import xsna.q630;

/* compiled from: StylusHandwriting.kt */
/* loaded from: classes11.dex */
public final class ntm0 extends ytl implements cmb0, lvr, uwr {
    public gzs<s3q0> r;
    public boolean s;
    public final tkn0 t;

    /* compiled from: StylusHandwriting.kt */
    public static final class a implements PointerInputEventHandler {

        /* compiled from: StylusHandwriting.kt */
        @b6l(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {116, 144, 182}, m = "invokeSuspend", v = 1)
        /* renamed from: xsna.ntm0$a$a, reason: collision with other inner class name */
        public static final class C3415a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ ntm0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3415a(ntm0 ntm0Var, spj<? super C3415a> spjVar) {
                super(2, spjVar);
                this.this$0 = ntm0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C3415a c3415a = new C3415a(this.this$0, spjVar);
                c3415a.L$0 = obj;
                return c3415a;
            }

            @Override // xsna.wzs
            public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
                return ((C3415a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:150:0x01af, code lost:
            
                continue;
             */
            /* JADX WARN: Code restructure failed: missing block: B:159:0x00c9, code lost:
            
                if (r10 == r1) goto L140;
             */
            /* JADX WARN: Code restructure failed: missing block: B:191:0x0058, code lost:
            
                if (r8 == r1) goto L140;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0237, code lost:
            
                if (r3 != r1) goto L141;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0239, code lost:
            
                return r1;
             */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x00c9 -> B:29:0x00cd). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0237 -> B:7:0x023a). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                eu5 eu5Var;
                Object a;
                xlb0 xlb0Var;
                boolean z;
                eu5 eu5Var2;
                PointerEventPass pointerEventPass;
                Object I1;
                xlb0 xlb0Var2;
                xlb0 xlb0Var3;
                eu5 eu5Var3;
                Object I12;
                xlb0 xlb0Var4;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                int i2 = 2;
                if (i == 0) {
                    kotlin.a.a(obj);
                    eu5Var = (eu5) this.L$0;
                    PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                    this.L$0 = eu5Var;
                    this.label = 1;
                    a = z2o0.a(eu5Var, true, pointerEventPass2, this);
                } else if (i == 1) {
                    eu5Var = (eu5) this.L$0;
                    kotlin.a.a(obj);
                    a = obj;
                } else if (i == 2) {
                    pointerEventPass = (PointerEventPass) this.L$2;
                    xlb0Var = (xlb0) this.L$1;
                    eu5Var2 = (eu5) this.L$0;
                    kotlin.a.a(obj);
                    I1 = obj;
                    plb0 plb0Var = (plb0) I1;
                    List<xlb0> list = plb0Var.a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            xlb0Var2 = null;
                            break;
                        }
                        xlb0Var2 = list.get(i3);
                        xlb0 xlb0Var5 = xlb0Var2;
                        if (!xlb0Var5.c() && wlb0.g(xlb0Var5.a, xlb0Var.a) && xlb0Var5.d) {
                            break;
                        }
                        i3++;
                    }
                    xlb0 xlb0Var6 = xlb0Var2;
                    if (xlb0Var6 != null && xlb0Var6.b - xlb0Var.b < eu5Var2.getViewConfiguration().c()) {
                        i2 = 2;
                        if (plb0Var.c != 2) {
                            if (ov70.d(ov70.e(xlb0Var6.c, xlb0Var.c)) <= eu5Var2.getViewConfiguration().d()) {
                                this.L$0 = eu5Var2;
                                this.L$1 = xlb0Var;
                                this.L$2 = pointerEventPass;
                                this.label = i2;
                                I1 = eu5Var2.I1(pointerEventPass, this);
                            }
                            if (xlb0Var6 != null) {
                                return s3q0.a;
                            }
                            ntm0 ntm0Var = this.this$0;
                            if (!ntm0Var.s) {
                                q630.c cVar = ntm0Var.b;
                                ci50 ci50Var = null;
                                while (true) {
                                    if (cVar == null) {
                                        if (!ntm0Var.b.o) {
                                            uzw.b("visitChildren called on an unattached node");
                                        }
                                        ci50 ci50Var2 = new ci50(new q630.c[16]);
                                        q630.c cVar2 = ntm0Var.b;
                                        q630.c cVar3 = cVar2.g;
                                        if (cVar3 == null) {
                                            itl.a(ci50Var2, cVar2);
                                        } else {
                                            ci50Var2.b(cVar3);
                                        }
                                        loop4: while (true) {
                                            int i4 = ci50Var2.d;
                                            if (i4 == 0) {
                                                break;
                                            }
                                            q630.c cVar4 = (q630.c) ci50Var2.k(i4 - 1);
                                            if ((cVar4.e & 1024) == 0) {
                                                itl.a(ci50Var2, cVar4);
                                            } else {
                                                while (true) {
                                                    if (cVar4 == null) {
                                                        break;
                                                    }
                                                    if ((cVar4.d & 1024) != 0) {
                                                        ci50 ci50Var3 = null;
                                                        while (cVar4 != null) {
                                                            if (cVar4 instanceof dxr) {
                                                                ((dxr) cVar4).v1(7);
                                                                break loop4;
                                                            }
                                                            if ((cVar4.d & 1024) != 0 && (cVar4 instanceof ytl)) {
                                                                int i5 = 0;
                                                                for (q630.c cVar5 = ((ytl) cVar4).q; cVar5 != null; cVar5 = cVar5.g) {
                                                                    if ((cVar5.d & 1024) != 0) {
                                                                        i5++;
                                                                        if (i5 == 1) {
                                                                            cVar4 = cVar5;
                                                                        } else {
                                                                            if (ci50Var3 == null) {
                                                                                ci50Var3 = new ci50(new q630.c[16]);
                                                                            }
                                                                            if (cVar4 != null) {
                                                                                ci50Var3.b(cVar4);
                                                                                cVar4 = null;
                                                                            }
                                                                            ci50Var3.b(cVar5);
                                                                        }
                                                                    }
                                                                }
                                                                if (i5 == 1) {
                                                                }
                                                            }
                                                            cVar4 = itl.b(ci50Var3);
                                                        }
                                                    } else {
                                                        cVar4 = cVar4.g;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (cVar instanceof dxr) {
                                            ((dxr) cVar).v1(7);
                                            break;
                                        }
                                        if ((cVar.d & 1024) != 0 && (cVar instanceof ytl)) {
                                            int i6 = 0;
                                            for (q630.c cVar6 = ((ytl) cVar).q; cVar6 != null; cVar6 = cVar6.g) {
                                                if ((cVar6.d & 1024) != 0) {
                                                    i6++;
                                                    if (i6 == 1) {
                                                        cVar = cVar6;
                                                    } else {
                                                        if (ci50Var == null) {
                                                            ci50Var = new ci50(new q630.c[16]);
                                                        }
                                                        if (cVar != null) {
                                                            ci50Var.b(cVar);
                                                            cVar = null;
                                                        }
                                                        ci50Var.b(cVar6);
                                                    }
                                                }
                                            }
                                            if (i6 == 1) {
                                            }
                                        }
                                        cVar = itl.b(ci50Var);
                                    }
                                }
                            }
                            this.this$0.r.invoke();
                            xlb0Var6.a();
                            xlb0Var3 = xlb0Var;
                            eu5Var3 = eu5Var2;
                            PointerEventPass pointerEventPass3 = PointerEventPass.Initial;
                            this.L$0 = eu5Var3;
                            this.L$1 = xlb0Var3;
                            this.L$2 = null;
                            this.label = 3;
                            I12 = eu5Var3.I1(pointerEventPass3, this);
                        }
                    }
                    xlb0Var6 = null;
                    if (xlb0Var6 != null) {
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xlb0Var3 = (xlb0) this.L$1;
                    eu5Var3 = (eu5) this.L$0;
                    kotlin.a.a(obj);
                    I12 = obj;
                    List<xlb0> list2 = ((plb0) I12).a;
                    int size2 = list2.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size2) {
                            xlb0Var4 = null;
                            break;
                        }
                        xlb0Var4 = list2.get(i7);
                        xlb0 xlb0Var7 = xlb0Var4;
                        if (!xlb0Var7.c() && wlb0.g(xlb0Var7.a, xlb0Var3.a) && xlb0Var7.d) {
                            break;
                        }
                        i7++;
                    }
                    xlb0 xlb0Var8 = xlb0Var4;
                    if (xlb0Var8 == null) {
                        return s3q0.a;
                    }
                    xlb0Var8.a();
                    PointerEventPass pointerEventPass32 = PointerEventPass.Initial;
                    this.L$0 = eu5Var3;
                    this.L$1 = xlb0Var3;
                    this.L$2 = null;
                    this.label = 3;
                    I12 = eu5Var3.I1(pointerEventPass32, this);
                }
                xlb0Var = (xlb0) a;
                int i8 = xlb0Var.i;
                long j = xlb0Var.c;
                if (i8 != 3 && i8 != 4) {
                    return s3q0.a;
                }
                int i9 = (int) (j >> 32);
                if (Float.intBitsToFloat(i9) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Float.intBitsToFloat(i9) < ((int) (eu5Var.a() >> 32))) {
                    int i10 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i10) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Float.intBitsToFloat(i10) < ((int) (eu5Var.a() & 4294967295L))) {
                        z = true;
                        PointerEventPass pointerEventPass4 = (!this.this$0.s || z) ? PointerEventPass.Initial : PointerEventPass.Main;
                        eu5Var2 = eu5Var;
                        pointerEventPass = pointerEventPass4;
                        this.L$0 = eu5Var2;
                        this.L$1 = xlb0Var;
                        this.L$2 = pointerEventPass;
                        this.label = i2;
                        I1 = eu5Var2.I1(pointerEventPass, this);
                    }
                }
                z = false;
                PointerEventPass pointerEventPass42 = (!this.this$0.s || z) ? PointerEventPass.Initial : PointerEventPass.Main;
                eu5Var2 = eu5Var;
                pointerEventPass = pointerEventPass42;
                this.L$0 = eu5Var2;
                this.L$1 = xlb0Var;
                this.L$2 = pointerEventPass;
                this.label = i2;
                I1 = eu5Var2.I1(pointerEventPass, this);
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
            Object c = d7s.c(dmb0Var, new C3415a(ntm0.this, null), spjVar);
            return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : s3q0.a;
        }
    }

    public ntm0(gzs<s3q0> gzsVar) {
        this.r = gzsVar;
        xkn0 a2 = skn0.a(new a());
        i2(a2);
        this.t = a2;
    }

    @Override // xsna.lvr
    public final void D(xwr xwrVar) {
        this.s = xwrVar.h();
    }

    @Override // xsna.cmb0
    public final void H(plb0 plb0Var, PointerEventPass pointerEventPass, long j) {
        this.t.H(plb0Var, pointerEventPass, j);
    }

    @Override // xsna.cmb0
    public final long c1() {
        vco vcoVar = mtm0.a;
        azl azlVar = itl.f(this).z;
        vcoVar.getClass();
        int i = cdp0.b;
        return cdp0.a.b(azlVar.r0(vcoVar.a), azlVar.r0(vcoVar.b), azlVar.r0(vcoVar.c), azlVar.r0(vcoVar.d));
    }

    @Override // xsna.cmb0
    public final void h1() {
        this.t.h1();
    }
}
