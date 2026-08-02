package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: AdditionalSettingsContentView.kt */
/* loaded from: classes4.dex */
public final class gr0 implements PointerInputEventHandler {
    public final /* synthetic */ gzs<s3q0> a;

    /* compiled from: AdditionalSettingsContentView.kt */
    @b6l(c = "com.vk.newsfeed.posting.additional_settings.presentation.base.view.AdditionalSettingsContentView$NonClickableOverlay$1$1$1", f = "AdditionalSettingsContentView.kt", l = {326}, m = "invokeSuspend")
    public static final class a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
        final /* synthetic */ gzs<s3q0> $onOverlayClick;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gzs<s3q0> gzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$onOverlayClick = gzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$onOverlayClick, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
            return ((a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            eu5 eu5Var = (eu5) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.L$0 = null;
                this.label = 1;
                if (z2o0.b(eu5Var, null, this, 2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            this.$onOverlayClick.invoke();
            return s3q0.a;
        }
    }

    public gr0(gzs<s3q0> gzsVar) {
        this.a = gzsVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        Object c = d7s.c(dmb0Var, new a(this.a, null), spjVar);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : s3q0.a;
    }
}
