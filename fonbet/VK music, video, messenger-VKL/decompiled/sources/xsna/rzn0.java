package xsna;

import com.vk.music.stickyplayer.presentation.components.PlayerSheetTab;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.sx40;

/* compiled from: TabsSheet.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.TabsSheetKt$TabsSheet$1$1", f = "TabsSheet.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class rzn0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mtk0<Boolean> $isCollapsed$delegate;
    final /* synthetic */ izs<sx40, s3q0> $onAction;
    final /* synthetic */ rg50 $selectedTabIndex;
    final /* synthetic */ List $tabs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzn0(rg50 rg50Var, List list, izs izsVar, mtk0 mtk0Var, spj spjVar) {
        super(2, spjVar);
        this.$selectedTabIndex = rg50Var;
        this.$tabs = list;
        this.$onAction = izsVar;
        this.$isCollapsed$delegate = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rzn0(this.$selectedTabIndex, this.$tabs, this.$onAction, this.$isCollapsed$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rzn0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$isCollapsed$delegate.getValue().booleanValue() && this.$selectedTabIndex.getIntValue() == this.$tabs.indexOf(PlayerSheetTab.LYRICS)) {
            this.$onAction.invoke(sx40.n.a.b);
        }
        return s3q0.a;
    }
}
