package xsna;

import android.content.Context;
import com.vk.superapp.multiaccount.api.PinCodeAnalyticsParams;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicKidsModeManagerImpl.kt */
@b6l(c = "com.vk.musc.kidsmode.impl.MusicKidsModeManagerImpl$showOnboardingDialog$1$1$1", f = "MusicKidsModeManagerImpl.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class gm40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ gzs<s3q0> $onToggleError;
    final /* synthetic */ gzs<s3q0> $onToggleSuccess;
    int label;
    final /* synthetic */ zl40 this$0;

    /* compiled from: MusicKidsModeManagerImpl.kt */
    @b6l(c = "com.vk.musc.kidsmode.impl.MusicKidsModeManagerImpl$showOnboardingDialog$1$1$1$1", f = "MusicKidsModeManagerImpl.kt", l = {149}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ gzs<s3q0> $onToggleError;
        final /* synthetic */ gzs<s3q0> $onToggleSuccess;
        int label;
        final /* synthetic */ zl40 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zl40 zl40Var, Context context, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, spj<? super a> spjVar) {
            super(1, spjVar);
            this.this$0 = zl40Var;
            this.$context = context;
            this.$onToggleSuccess = gzsVar;
            this.$onToggleError = gzsVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new a(this.this$0, this.$context, this.$onToggleSuccess, this.$onToggleError, spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((a) create(spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                zl40 zl40Var = this.this$0;
                Context context = this.$context;
                gzs<s3q0> gzsVar = this.$onToggleSuccess;
                gzs<s3q0> gzsVar2 = this.$onToggleError;
                this.label = 1;
                if (zl40.b(zl40Var, context, gzsVar, gzsVar2, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm40(zl40 zl40Var, Context context, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, spj<? super gm40> spjVar) {
        super(2, spjVar);
        this.this$0 = zl40Var;
        this.$context = context;
        this.$onToggleSuccess = gzsVar;
        this.$onToggleError = gzsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new gm40(this.this$0, this.$context, this.$onToggleSuccess, this.$onToggleError, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((gm40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            zl40 zl40Var = this.this$0;
            Context context = this.$context;
            PinCodeAnalyticsParams pinCodeAnalyticsParams = new PinCodeAnalyticsParams("vkmusic_set_pincode");
            a aVar = new a(this.this$0, this.$context, this.$onToggleSuccess, this.$onToggleError, null);
            this.label = 1;
            if (zl40Var.d(context, pinCodeAnalyticsParams, aVar, this) == coroutineSingletons) {
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
