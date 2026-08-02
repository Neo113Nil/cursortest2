package xsna;

import com.vk.dto.actionlinks.SnippetTarget;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import xsna.ln50;
import xsna.zno;

/* compiled from: PlayerControlsDelegate.kt */
/* loaded from: classes16.dex */
public final class m0b0 {

    /* compiled from: PlayerControlsDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnippetTarget.values().length];
            try {
                iArr[SnippetTarget.DISCOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnippetTarget.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnippetTarget.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PlayerControlsDelegate.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.PlayerControlsDelegateKt$showTopRightActionsBackground$1", f = "PlayerControlsDelegate.kt", l = {149}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ ars0 $this_showTopRightActionsBackground;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ars0 ars0Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$this_showTopRightActionsBackground = ars0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$this_showTopRightActionsBackground, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.$this_showTopRightActionsBackground.m(new gky(14));
                zno.a aVar = zno.c;
                long e = eoo.e(5, DurationUnit.SECONDS);
                this.label = 1;
                if (qsl.c(e, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            this.$this_showTopRightActionsBackground.m(new f6w(17));
            return s3q0.a;
        }
    }

    public static final void a(ars0 ars0Var) {
        w1a.a(ars0Var, new rn50("actionsBackground"), ln50.a.c, new b(ars0Var, null));
    }
}
