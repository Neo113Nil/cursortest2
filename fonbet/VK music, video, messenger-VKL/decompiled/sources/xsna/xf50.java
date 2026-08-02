package xsna;

import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.sx40;

/* compiled from: MusicWithBottomPlayer.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.MusicWithBottomPlayerKt$MusicContent$3$1", f = "MusicWithBottomPlayer.kt", l = {186}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class xf50 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<sx40, s3q0> $onAction;
    final /* synthetic */ h17 $scaffoldState;
    final /* synthetic */ f3b0 $screenState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xf50(f3b0 f3b0Var, h17 h17Var, izs<? super sx40, s3q0> izsVar, spj<? super xf50> spjVar) {
        super(2, spjVar);
        this.$screenState = f3b0Var;
        this.$scaffoldState = h17Var;
        this.$onAction = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xf50(this.$screenState, this.$scaffoldState, this.$onAction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xf50) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$screenState.a() == ParentBottomSheetState.COLLAPSED) {
                g07 g07Var = this.$scaffoldState.a;
                BigPlayerBottomSheetValue bigPlayerBottomSheetValue = BigPlayerBottomSheetValue.Collapsed;
                this.label = 1;
                if (g07Var.d(bigPlayerBottomSheetValue, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        if (this.$screenState.a() == ParentBottomSheetState.EXPANDED) {
            this.$onAction.invoke(sx40.w.b);
        }
        return s3q0.a;
    }
}
