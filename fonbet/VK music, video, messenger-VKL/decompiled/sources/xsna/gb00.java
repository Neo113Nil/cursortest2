package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.sx40;

/* compiled from: LyricsPage.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.LyricsPageKt$ContentLyrics$2$2$1", f = "LyricsPage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class gb00 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<eyx> $job$delegate;
    final /* synthetic */ wh50<Boolean> $manualScroll$delegate;
    final /* synthetic */ izs<sx40, s3q0> $onAction;
    final /* synthetic */ xvy $scrollState;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: LyricsPage.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.LyricsPageKt$ContentLyrics$2$2$1$1", f = "LyricsPage.kt", l = {181}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<eyx> $job$delegate;
        final /* synthetic */ izs<sx40, s3q0> $onAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super sx40, s3q0> izsVar, wh50<eyx> wh50Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$onAction = izsVar;
            this.$job$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$onAction, this.$job$delegate, spjVar);
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
                this.label = 1;
                if (qsl.b(5000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            wh50<eyx> wh50Var = this.$job$delegate;
            float f = kb00.a;
            wh50Var.setValue(null);
            this.$onAction.invoke(new sx40.n.d(true));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gb00(xvy xvyVar, izs<? super sx40, s3q0> izsVar, wh50<Boolean> wh50Var, wh50<eyx> wh50Var2, spj<? super gb00> spjVar) {
        super(2, spjVar);
        this.$scrollState = xvyVar;
        this.$onAction = izsVar;
        this.$manualScroll$delegate = wh50Var;
        this.$job$delegate = wh50Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        gb00 gb00Var = new gb00(this.$scrollState, this.$onAction, this.$manualScroll$delegate, this.$job$delegate, spjVar);
        gb00Var.L$0 = obj;
        return gb00Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((gb00) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        eyx value;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$scrollState.j.a()) {
            wh50<Boolean> wh50Var = this.$manualScroll$delegate;
            float f = kb00.a;
            if (wh50Var.getValue().booleanValue()) {
                eyx value2 = this.$job$delegate.getValue();
                if (value2 != null) {
                    value2.b(null);
                }
                this.$onAction.invoke(new sx40.n.d(false));
                return s3q0.a;
            }
        }
        wh50<eyx> wh50Var2 = this.$job$delegate;
        float f2 = kb00.a;
        if (wh50Var2.getValue() == null || ((value = this.$job$delegate.getValue()) != null && value.m())) {
            wh50<eyx> wh50Var3 = this.$job$delegate;
            bdn bdnVar = bdn.a;
            wh50Var3.setValue(myc0.h(yvjVar, ie00.a, null, new a(this.$onAction, wh50Var3, null), 2));
        }
        return s3q0.a;
    }
}
