package xsna;

import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: RadioWithBottomPlayer.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.RadioWithBottomPlayerKt$RadioContent$4$1", f = "RadioWithBottomPlayer.kt", l = {138}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class zve0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ h17 $scaffoldState;
    final /* synthetic */ f3b0 $screenState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zve0(f3b0 f3b0Var, h17 h17Var, spj<? super zve0> spjVar) {
        super(2, spjVar);
        this.$screenState = f3b0Var;
        this.$scaffoldState = h17Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zve0(this.$screenState, this.$scaffoldState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zve0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
        return s3q0.a;
    }
}
