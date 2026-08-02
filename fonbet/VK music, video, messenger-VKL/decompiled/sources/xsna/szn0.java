package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TabsSheet.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.TabsSheetKt$TabsSheet$2$1", f = "TabsSheet.kt", l = {Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, 108}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class szn0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mtk0<Boolean> $isCollapsed$delegate;
    final /* synthetic */ mtk0<Boolean> $isParentBottomSheetExpanded$delegate;
    final /* synthetic */ boolean $isSheetAnimationNeedToPlay;
    final /* synthetic */ izs<sx40, s3q0> $onAction;
    final /* synthetic */ h17 $scaffoldState;
    final /* synthetic */ float $sheetCollapsedOffset;
    final /* synthetic */ kg50 $targetSheetOffset;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public szn0(boolean z, kg50 kg50Var, float f, h17 h17Var, izs<? super sx40, s3q0> izsVar, mtk0<Boolean> mtk0Var, mtk0<Boolean> mtk0Var2, spj<? super szn0> spjVar) {
        super(2, spjVar);
        this.$isSheetAnimationNeedToPlay = z;
        this.$targetSheetOffset = kg50Var;
        this.$sheetCollapsedOffset = f;
        this.$scaffoldState = h17Var;
        this.$onAction = izsVar;
        this.$isParentBottomSheetExpanded$delegate = mtk0Var;
        this.$isCollapsed$delegate = mtk0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new szn0(this.$isSheetAnimationNeedToPlay, this.$targetSheetOffset, this.$sheetCollapsedOffset, this.$scaffoldState, this.$onAction, this.$isParentBottomSheetExpanded$delegate, this.$isCollapsed$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((szn0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (xsna.qzn0.e(r6, r1, r3, r4, r5) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        if (xsna.qsl.b(600, r5) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        if (this.$isParentBottomSheetExpanded$delegate.getValue().booleanValue() && this.$isSheetAnimationNeedToPlay && this.$isCollapsed$delegate.getValue().booleanValue()) {
            kg50 kg50Var = this.$targetSheetOffset;
            float f = this.$sheetCollapsedOffset;
            g07 g07Var = this.$scaffoldState.a;
            izs<sx40, s3q0> izsVar = this.$onAction;
            this.label = 2;
        }
        return s3q0.a;
    }
}
