package xsna;

import android.view.View;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.chromium.base.version_info.VersionConstants;
import xsna.epx;
import xsna.f1z;
import xsna.g1z;

/* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
@b6l(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {125}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class ma2 extends SuspendLambda implements wzs<pua0, spj<?>, Object> {
    final /* synthetic */ izs<k1z, s3q0> $initializeRequest;
    final /* synthetic */ f1z.a $node;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ na2 this$0;

    /* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
    @b6l(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {149}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<?>, Object> {
        final /* synthetic */ pua0 $$this$launchTextInputSession;
        final /* synthetic */ izs<k1z, s3q0> $initializeRequest;
        final /* synthetic */ f1z.a $node;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ na2 this$0;

        /* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
        @b6l(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {VersionConstants.PRODUCT_MAJOR_VERSION, 141}, m = "invokeSuspend", v = 1)
        /* renamed from: xsna.ma2$a$a, reason: collision with other inner class name */
        public static final class C3328a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ h2x $inputMethodManager;
            int label;
            final /* synthetic */ na2 this$0;

            /* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
            /* renamed from: xsna.ma2$a$a$a, reason: collision with other inner class name */
            public static final class C3329a<T> implements lsr {
                public final /* synthetic */ h2x b;

                public C3329a(h2x h2xVar) {
                    this.b = h2xVar;
                }

                @Override // xsna.lsr
                public final Object emit(Object obj, spj spjVar) {
                    this.b.a();
                    return s3q0.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3328a(na2 na2Var, h2x h2xVar, spj<? super C3328a> spjVar) {
                super(2, spjVar);
                this.this$0 = na2Var;
                this.$inputMethodManager = h2xVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C3328a(this.this$0, this.$inputMethodManager, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C3328a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
            
                if (xsna.caj0.k((xsna.caj0) r5, r1, r4) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
            
                if (xsna.i830.a(getContext()).k(new xsna.h830(r5), r4) == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    la2 la2Var = new la2(0);
                    this.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        throw new KotlinNothingValueException();
                    }
                    kotlin.a.a(obj);
                }
                sh50<s3q0> k = this.this$0.k();
                if (k == null) {
                    return s3q0.a;
                }
                C3329a c3329a = new C3329a(this.$inputMethodManager);
                this.label = 2;
            }
        }

        /* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
        public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<en10, s3q0> {
            final /* synthetic */ f1z.a $node;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f1z.a aVar) {
                super(1, epx.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                this.$node = aVar;
            }

            @Override // xsna.izs
            public final s3q0 invoke(en10 en10Var) {
                float[] fArr = en10Var.a;
                tny j0 = this.$node.j0();
                if (j0 != null) {
                    if (!j0.e()) {
                        j0 = null;
                    }
                    if (j0 != null) {
                        j0.k0(fArr);
                    }
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(pua0 pua0Var, izs<? super k1z, s3q0> izsVar, na2 na2Var, f1z.a aVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$$this$launchTextInputSession = pua0Var;
            this.$initializeRequest = izsVar;
            this.this$0 = na2Var;
            this.$node = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$$this$launchTextInputSession, this.$initializeRequest, this.this$0, this.$node, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<?> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    yvj yvjVar = (yvj) this.L$0;
                    g1z.a aVar = g1z.a;
                    View view = this.$$this$launchTextInputSession.getView();
                    aVar.getClass();
                    j2x j2xVar = new j2x(view);
                    k1z k1zVar = new k1z(this.$$this$launchTextInputSession.getView(), new b(this.$node), j2xVar);
                    if (otm0.a) {
                        myc0.h(yvjVar, null, null, new C3328a(this.this$0, j2xVar, null), 3);
                    }
                    izs<k1z, s3q0> izsVar = this.$initializeRequest;
                    if (izsVar != null) {
                        izsVar.invoke(k1zVar);
                    }
                    this.this$0.c = k1zVar;
                    pua0 pua0Var = this.$$this$launchTextInputSession;
                    this.label = 1;
                    if (pua0Var.a(k1zVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.this$0.c = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ma2(izs<? super k1z, s3q0> izsVar, na2 na2Var, f1z.a aVar, spj<? super ma2> spjVar) {
        super(2, spjVar);
        this.$initializeRequest = izsVar;
        this.this$0 = na2Var;
        this.$node = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ma2 ma2Var = new ma2(this.$initializeRequest, this.this$0, this.$node, spjVar);
        ma2Var.L$0 = obj;
        return ma2Var;
    }

    @Override // xsna.wzs
    public final Object invoke(pua0 pua0Var, spj<?> spjVar) {
        return ((ma2) create(pua0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            a aVar = new a((pua0) this.L$0, this.$initializeRequest, this.this$0, this.$node, null);
            this.label = 1;
            if (zvj.d(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        throw new KotlinNothingValueException();
    }
}
