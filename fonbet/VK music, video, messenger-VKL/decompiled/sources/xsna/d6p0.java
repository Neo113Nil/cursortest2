package xsna;

import com.vk.core.compose.component.defaults.VkTooltipAppearance;
import com.vk.core.view.components.tooltip.VkTooltip;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TooltipScreenContent.kt */
@b6l(c = "com.vk.design.demo.presentation.screens.TooltipScreenContent$Content$1$1$1", f = "TooltipScreenContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class d6p0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ e6p0 this$0;

    /* compiled from: TooltipScreenContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[l6p0.values().length];
            try {
                iArr[l6p0.Lego.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l6p0.Milkshake.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6p0(e6p0 e6p0Var, spj<? super d6p0> spjVar) {
        super(2, spjVar);
        this.this$0 = e6p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new d6p0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((d6p0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        int i = a.$EnumSwitchMapping$0[this.this$0.n().ordinal()];
        if (i == 1) {
            h6v0 h6v0Var = h6v0.a;
            h6v0.b(true);
            if (this.this$0.k() == VkTooltip.Appearance.Accent || this.this$0.k() == VkTooltip.Appearance.Transparent) {
                e6p0 e6p0Var = this.this$0;
                ((zak0) e6p0Var.m).setValue(VkTooltip.Appearance.Neutral);
            }
            if (this.this$0.l() == VkTooltipAppearance.Accent || this.this$0.l() == VkTooltipAppearance.Transparent) {
                e6p0 e6p0Var2 = this.this$0;
                ((zak0) e6p0Var2.n).setValue(VkTooltipAppearance.Neutral);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            h6v0 h6v0Var2 = h6v0.a;
            h6v0.b(false);
        }
        return s3q0.a;
    }
}
