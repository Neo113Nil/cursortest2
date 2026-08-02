package xsna;

import androidx.compose.foundation.MutatePriority;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TabsSheet.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.TabsSheetKt$TabsSheet$3$1", f = "TabsSheet.kt", l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class tzn0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mtk0<Float> $animatableSheetOffset$delegate;
    final /* synthetic */ boolean $isSheetAnimationNeedToPlay;
    final /* synthetic */ ParentBottomSheetState $parentCollapseState;
    final /* synthetic */ h17 $scaffoldState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzn0(ParentBottomSheetState parentBottomSheetState, boolean z, h17 h17Var, mtk0<Float> mtk0Var, spj<? super tzn0> spjVar) {
        super(2, spjVar);
        this.$parentCollapseState = parentBottomSheetState;
        this.$isSheetAnimationNeedToPlay = z;
        this.$scaffoldState = h17Var;
        this.$animatableSheetOffset$delegate = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new tzn0(this.$parentCollapseState, this.$isSheetAnimationNeedToPlay, this.$scaffoldState, this.$animatableSheetOffset$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((tzn0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$parentCollapseState == ParentBottomSheetState.EXPANDED && this.$isSheetAnimationNeedToPlay) {
                float floatValue = this.$animatableSheetOffset$delegate.getValue().floatValue();
                g07 g07Var = this.$scaffoldState.a;
                this.label = 1;
                MutatePriority mutatePriority = MutatePriority.PreventUserInput;
                vzn0 vzn0Var = new vzn0(floatValue, null);
                f12<BigPlayerBottomSheetValue> f12Var = g07Var.c;
                Object b = f12Var.f.b(mutatePriority, new l02(f12Var, null, vzn0Var), this);
                if (b != coroutineSingletons) {
                    b = s3q0.a;
                }
                if (b != coroutineSingletons) {
                    b = s3q0.a;
                }
                if (b != coroutineSingletons) {
                    b = s3q0.a;
                }
                if (b == coroutineSingletons) {
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
