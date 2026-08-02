package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.q630;

/* compiled from: Hoverable.kt */
/* loaded from: classes11.dex */
public final class sgv extends q630.c implements cmb0 {
    public sg50 p;
    public lgv q;

    /* compiled from: Hoverable.kt */
    @b6l(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return sgv.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                sgv sgvVar = sgv.this;
                this.label = 1;
                if (sgv.i2(sgvVar, this) == coroutineSingletons) {
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

    /* compiled from: Hoverable.kt */
    @b6l(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", l = {90}, m = "invokeSuspend", v = 1)
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return sgv.this.new b(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                sgv sgvVar = sgv.this;
                this.label = 1;
                if (sgv.j2(sgvVar, this) == coroutineSingletons) {
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i2(sgv sgvVar, ContinuationImpl continuationImpl) {
        qgv qgvVar;
        int i;
        lgv lgvVar;
        sgvVar.getClass();
        if (continuationImpl instanceof qgv) {
            qgvVar = (qgv) continuationImpl;
            int i2 = qgvVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qgvVar.label = i2 - Integer.MIN_VALUE;
                Object obj = qgvVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qgvVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (sgvVar.q == null) {
                        lgv lgvVar2 = new lgv();
                        sg50 sg50Var = sgvVar.p;
                        qgvVar.L$0 = lgvVar2;
                        qgvVar.label = 1;
                        if (sg50Var.a(lgvVar2, qgvVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        lgvVar = lgvVar2;
                    }
                    return s3q0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lgvVar = (lgv) qgvVar.L$0;
                kotlin.a.a(obj);
                sgvVar.q = lgvVar;
                return s3q0.a;
            }
        }
        qgvVar = new qgv(sgvVar, continuationImpl);
        Object obj2 = qgvVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qgvVar.label;
        if (i != 0) {
        }
        sgvVar.q = lgvVar;
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j2(sgv sgvVar, ContinuationImpl continuationImpl) {
        rgv rgvVar;
        int i;
        sgvVar.getClass();
        if (continuationImpl instanceof rgv) {
            rgvVar = (rgv) continuationImpl;
            int i2 = rgvVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rgvVar.label = i2 - Integer.MIN_VALUE;
                Object obj = rgvVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rgvVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    lgv lgvVar = sgvVar.q;
                    if (lgvVar != null) {
                        mgv mgvVar = new mgv(lgvVar);
                        sg50 sg50Var = sgvVar.p;
                        rgvVar.label = 1;
                        if (sg50Var.a(mgvVar, rgvVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return s3q0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                sgvVar.q = null;
                return s3q0.a;
            }
        }
        rgvVar = new rgv(sgvVar, continuationImpl);
        Object obj2 = rgvVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rgvVar.label;
        if (i != 0) {
        }
        sgvVar.q = null;
        return s3q0.a;
    }

    @Override // xsna.cmb0
    public final void H(plb0 plb0Var, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            int i = plb0Var.f;
            if (i == 4) {
                myc0.h(W1(), null, null, new a(null), 3);
            } else if (i == 5) {
                myc0.h(W1(), null, null, new b(null), 3);
            }
        }
    }

    @Override // xsna.q630.c
    public final void b2() {
        k2();
    }

    @Override // xsna.cmb0
    public final void h1() {
        k2();
    }

    public final void k2() {
        lgv lgvVar = this.q;
        if (lgvVar != null) {
            this.p.c(new mgv(lgvVar));
            this.q = null;
        }
    }
}
