package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.sx40;

/* compiled from: LyricsPage.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.LyricsPageKt$LyricsPage$2$1", f = "LyricsPage.kt", l = {112}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class jb00 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isOnScreen;
    final /* synthetic */ izs<sx40, s3q0> $onAction;
    final /* synthetic */ xvy $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jb00(boolean z, izs<? super sx40, s3q0> izsVar, xvy xvyVar, spj<? super jb00> spjVar) {
        super(2, spjVar);
        this.$isOnScreen = z;
        this.$onAction = izsVar;
        this.$scrollState = xvyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jb00(this.$isOnScreen, this.$onAction, this.$scrollState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jb00) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (!this.$isOnScreen) {
                this.$onAction.invoke(sx40.n.c.b);
                return s3q0.a;
            }
            this.$onAction.invoke(sx40.n.b.b);
            xvy xvyVar = this.$scrollState;
            this.label = 1;
            fh9 fh9Var = xvy.y;
            if (xvyVar.k(0, 0, this) == coroutineSingletons) {
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
