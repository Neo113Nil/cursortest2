package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.o2d0;
import xsna.q630;

/* compiled from: Indication.kt */
/* loaded from: classes11.dex */
public final class idl implements guw {
    public static final idl a = new idl();

    /* compiled from: Indication.kt */
    public static final class a extends q630.c implements lio {
        public final wax p;
        public boolean q;
        public boolean r;
        public boolean s;

        /* compiled from: Indication.kt */
        @b6l(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", l = {228}, m = "invokeSuspend", v = 1)
        /* renamed from: xsna.idl$a$a, reason: collision with other inner class name */
        public static final class C3051a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            int label;

            /* compiled from: Indication.kt */
            /* renamed from: xsna.idl$a$a$a, reason: collision with other inner class name */
            public static final class C3052a<T> implements lsr {
                public final /* synthetic */ Ref$IntRef b;
                public final /* synthetic */ Ref$IntRef c;
                public final /* synthetic */ Ref$IntRef d;
                public final /* synthetic */ a e;

                public C3052a(Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, Ref$IntRef ref$IntRef3, a aVar) {
                    this.b = ref$IntRef;
                    this.c = ref$IntRef2;
                    this.d = ref$IntRef3;
                    this.e = aVar;
                }

                @Override // xsna.lsr
                public final Object emit(Object obj, spj spjVar) {
                    vax vaxVar = (vax) obj;
                    boolean z = vaxVar instanceof o2d0.b;
                    Ref$IntRef ref$IntRef = this.d;
                    Ref$IntRef ref$IntRef2 = this.c;
                    Ref$IntRef ref$IntRef3 = this.b;
                    boolean z2 = true;
                    if (z) {
                        ref$IntRef3.element++;
                    } else if (vaxVar instanceof o2d0.c) {
                        ref$IntRef3.element--;
                    } else if (vaxVar instanceof o2d0.a) {
                        ref$IntRef3.element--;
                    } else if (vaxVar instanceof lgv) {
                        ref$IntRef2.element++;
                    } else if (vaxVar instanceof mgv) {
                        ref$IntRef2.element--;
                    } else if (vaxVar instanceof pvr) {
                        ref$IntRef.element++;
                    } else if (vaxVar instanceof qvr) {
                        ref$IntRef.element--;
                    }
                    boolean z3 = false;
                    boolean z4 = ref$IntRef3.element > 0;
                    boolean z5 = ref$IntRef2.element > 0;
                    boolean z6 = ref$IntRef.element > 0;
                    a aVar = this.e;
                    if (aVar.q != z4) {
                        aVar.q = z4;
                        z3 = true;
                    }
                    if (aVar.r != z5) {
                        aVar.r = z5;
                        z3 = true;
                    }
                    if (aVar.s != z6) {
                        aVar.s = z6;
                    } else {
                        z2 = z3;
                    }
                    if (z2) {
                        mio.a(aVar);
                    }
                    return s3q0.a;
                }
            }

            public C3051a(spj<? super C3051a> spjVar) {
                super(2, spjVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return a.this.new C3051a(spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C3051a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                    Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                    Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                    caj0 b = a.this.p.b();
                    C3052a c3052a = new C3052a(ref$IntRef, ref$IntRef2, ref$IntRef3, a.this);
                    this.label = 1;
                    b.getClass();
                    if (caj0.k(b, c3052a, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return s3q0.a;
            }
        }

        public a(wax waxVar) {
            this.p = waxVar;
        }

        @Override // xsna.q630.c
        public final void a2() {
            myc0.h(W1(), null, null, new C3051a(null), 3);
        }

        @Override // xsna.lio
        public final void v(toy toyVar) {
            er9 er9Var = toyVar.b;
            toyVar.s1();
            if (this.q) {
                oio.P(toyVar, l5g.c(14, l5g.b, 0.3f), 0L, er9Var.d(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            } else if (this.r || this.s) {
                oio.P(toyVar, l5g.c(14, l5g.b, 0.1f), 0L, er9Var.d(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            }
        }
    }

    @Override // xsna.guw
    public final htl a(wax waxVar) {
        return new a(waxVar);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // xsna.guw
    public final int hashCode() {
        return -1;
    }
}
