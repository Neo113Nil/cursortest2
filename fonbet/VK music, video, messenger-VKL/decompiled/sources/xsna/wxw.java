package xsna;

import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog.mvi.block.music.impl.recommended.entity.RecommendedPlaylistState;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InitDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.music.impl.recommended.delegates.InitDelegateKt$handleInit$1", f = "InitDelegate.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class wxw extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ bef0 $this_handleInit;
    int label;

    /* compiled from: InitDelegate.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ bef0 b;

        public a(bef0 bef0Var) {
            this.b = bef0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            Pair pair = (Pair) obj;
            PlayingState playingState = (PlayingState) pair.d();
            String str = (String) pair.g();
            bef0 bef0Var = this.b;
            bef0Var.getClass();
            bef0Var.m(new qb6(27, playingState, str));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxw(bef0 bef0Var, spj<? super wxw> spjVar) {
        super(2, spjVar);
        this.$this_handleInit = bef0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wxw(this.$this_handleInit, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((wxw) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            nb9 i2 = rsr.i(new fyw(this.$this_handleInit.c, ((RecommendedPlaylistState) ((b2a) this.$this_handleInit.b.b).getCurrentState()).h, null));
            a aVar = new a(this.$this_handleInit);
            this.label = 1;
            if (i2.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
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
