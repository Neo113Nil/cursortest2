package xsna;

import android.content.Context;
import android.graphics.Rect;
import com.vk.core.view.components.tooltip.VkTooltip;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TooltipWrapper.kt */
@b6l(c = "com.vk.clips.upload.ui.impl.compose.views.TooltipWrapperKt$TooltipWrapper$2$1", f = "TooltipWrapper.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class p6p0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $canShow;
    final /* synthetic */ wh50<Rect> $cellRect$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ long $delayTooltipShowMS;
    final /* synthetic */ wh50<Boolean> $isContentVisibleOnScreen$delegate;
    final /* synthetic */ gzs<s3q0> $onTooltipShown;
    final /* synthetic */ String $tooltip;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6p0(long j, String str, boolean z, Context context, gzs<s3q0> gzsVar, wh50<Boolean> wh50Var, wh50<Rect> wh50Var2, spj<? super p6p0> spjVar) {
        super(2, spjVar);
        this.$delayTooltipShowMS = j;
        this.$tooltip = str;
        this.$canShow = z;
        this.$context = context;
        this.$onTooltipShown = gzsVar;
        this.$isContentVisibleOnScreen$delegate = wh50Var;
        this.$cellRect$delegate = wh50Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new p6p0(this.$delayTooltipShowMS, this.$tooltip, this.$canShow, this.$context, this.$onTooltipShown, this.$isContentVisibleOnScreen$delegate, this.$cellRect$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((p6p0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            long j = this.$delayTooltipShowMS;
            this.label = 1;
            if (qsl.b(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        if (this.$tooltip.length() != 0 && this.$canShow) {
            wh50<Boolean> wh50Var = this.$isContentVisibleOnScreen$delegate;
            pqo pqoVar = q6p0.a;
            if (wh50Var.getValue().booleanValue()) {
                VkTooltip.a aVar = new VkTooltip.a(this.$context);
                aVar.c = this.$tooltip;
                aVar.e = VkTooltip.Appearance.Inversion;
                aVar.g = true;
                aVar.a(this.$cellRect$delegate.getValue());
                this.$onTooltipShown.invoke();
                return s3q0.a;
            }
        }
        return s3q0.a;
    }
}
