package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ogo;

/* compiled from: LyricsPage.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.LyricsPageKt$ContentLyrics$2$1$1", f = "LyricsPage.kt", l = {163}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class fb00 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<Boolean> $manualScroll$delegate;
    final /* synthetic */ xvy $scrollState;
    int label;

    /* compiled from: LyricsPage.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ wh50<Boolean> b;

        public a(wh50<Boolean> wh50Var) {
            this.b = wh50Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            vax vaxVar = (vax) obj;
            boolean z = vaxVar instanceof ogo.b;
            wh50<Boolean> wh50Var = this.b;
            if (z) {
                float f = kb00.a;
                wh50Var.setValue(Boolean.TRUE);
            } else if ((vaxVar instanceof ogo.a) || (vaxVar instanceof ogo.c)) {
                float f2 = kb00.a;
                wh50Var.setValue(Boolean.FALSE);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb00(xvy xvyVar, wh50<Boolean> wh50Var, spj<? super fb00> spjVar) {
        super(2, spjVar);
        this.$scrollState = xvyVar;
        this.$manualScroll$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new fb00(this.$scrollState, this.$manualScroll$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((fb00) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            caj0 caj0Var = this.$scrollState.g.a;
            a aVar = new a(this.$manualScroll$delegate);
            this.label = 1;
            caj0Var.getClass();
            if (caj0.k(caj0Var, aVar, this) == coroutineSingletons) {
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
