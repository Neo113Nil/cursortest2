package xsna;

import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: InitDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.music.impl.artists.mix.delegates.InitDelegateKt$handleInit$1", f = "InitDelegate.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class yxw extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ com.vk.catalog.mvi.block.music.impl.artists.mix.a $this_handleInit;
    int label;

    /* compiled from: InitDelegate.kt */
    public static final /* synthetic */ class a implements lsr, g0t {
        public final /* synthetic */ com.vk.catalog.mvi.block.music.impl.artists.mix.a b;

        public a(com.vk.catalog.mvi.block.music.impl.artists.mix.a aVar) {
            this.b = aVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            com.vk.catalog.mvi.block.music.impl.artists.mix.a aVar = this.b;
            aVar.getClass();
            aVar.m(new tb((PlayingState) obj, 9));
            s3q0 s3q0Var = s3q0.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return s3q0Var;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lsr) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new AdaptedFunctionReference(2, this.b, com.vk.catalog.mvi.block.music.impl.artists.mix.a.class, "changePlayingState", "changePlayingState$impl_release(Lcom/vk/catalog/mvi/block/music/impl/entity/PlayingState;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxw(com.vk.catalog.mvi.block.music.impl.artists.mix.a aVar, spj<? super yxw> spjVar) {
        super(2, spjVar);
        this.$this_handleInit = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new yxw(this.$this_handleInit, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((yxw) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            com.vk.catalog.mvi.block.music.impl.artists.mix.a aVar = this.$this_handleInit;
            nb9 i2 = rsr.i(new gyw(aVar.d, aVar, null));
            a aVar2 = new a(this.$this_handleInit);
            this.label = 1;
            if (i2.collect(aVar2, this) == coroutineSingletons) {
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
