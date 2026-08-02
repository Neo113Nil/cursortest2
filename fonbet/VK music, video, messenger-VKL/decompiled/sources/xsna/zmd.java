package xsna;

import com.vk.core.compose.component.defaults.SpinnerState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.vmd;

/* compiled from: ClipsCoauthorsSelectorContentView.kt */
@b6l(c = "com.vk.clips.coauthors.selector.ui.ClipsCoauthorsSelectorContentView$FullscreenLoader$1$2$1", f = "ClipsCoauthorsSelectorContentView.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class zmd extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<vmd, s3q0> $onAction;
    final /* synthetic */ SpinnerState $spinnerState;
    int label;

    /* compiled from: ClipsCoauthorsSelectorContentView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpinnerState.values().length];
            try {
                iArr[SpinnerState.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpinnerState.Done.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SpinnerState.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SpinnerState.Custom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zmd(SpinnerState spinnerState, izs<? super vmd, s3q0> izsVar, spj<? super zmd> spjVar) {
        super(2, spjVar);
        this.$spinnerState = spinnerState;
        this.$onAction = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zmd(this.$spinnerState, this.$onAction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zmd) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            int i2 = a.$EnumSwitchMapping$0[this.$spinnerState.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            }
            this.label = 1;
            if (qsl.b(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.$onAction.invoke(vmd.i.b);
        return s3q0.a;
    }
}
