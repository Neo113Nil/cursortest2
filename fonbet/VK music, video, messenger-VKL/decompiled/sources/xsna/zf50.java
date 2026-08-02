package xsna;

import com.vk.music.stickyplayer.presentation.components.PlayerSheetTab;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.sx40;

/* compiled from: MusicWithBottomPlayer.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.MusicWithBottomPlayerKt$MusicContent$4$1$2$1", f = "MusicWithBottomPlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class zf50 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<sx40, s3q0> $onAction;
    final /* synthetic */ h17 $scaffoldState;
    final /* synthetic */ rg50 $selectedTabIndex;
    final /* synthetic */ mtk0<wow<PlayerSheetTab>> $tabs$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zf50(h17 h17Var, rg50 rg50Var, izs<? super sx40, s3q0> izsVar, mtk0<wow<PlayerSheetTab>> mtk0Var, spj<? super zf50> spjVar) {
        super(2, spjVar);
        this.$scaffoldState = h17Var;
        this.$selectedTabIndex = rg50Var;
        this.$onAction = izsVar;
        this.$tabs$delegate = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zf50(this.$scaffoldState, this.$selectedTabIndex, this.$onAction, this.$tabs$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zf50) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (((zak0) this.$scaffoldState.a.c.m).getValue() == null && this.$scaffoldState.a.c()) {
            int intValue = this.$selectedTabIndex.getIntValue();
            if (intValue == bg50.d(this.$tabs$delegate).indexOf(PlayerSheetTab.QUEUE)) {
                this.$onAction.invoke(sx40.s0.b);
            } else if (intValue == bg50.d(this.$tabs$delegate).indexOf(PlayerSheetTab.LYRICS)) {
                this.$onAction.invoke(sx40.k0.b);
            }
        }
        return s3q0.a;
    }
}
