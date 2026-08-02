package xsna;

import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InitDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.music.impl.artists.mix.delegates.InitDelegateKt$playStateFlow$1", f = "InitDelegate.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class gyw extends SuspendLambda implements wzs<zhd0<? super PlayingState>, spj<? super s3q0>, Object> {
    final /* synthetic */ u2b0 $playerModel;
    final /* synthetic */ com.vk.catalog.mvi.block.music.impl.artists.mix.a $this_playStateFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* compiled from: InitDelegate.kt */
    public static final class a extends e.a {
        public final /* synthetic */ com.vk.catalog.mvi.block.music.impl.artists.mix.a b;
        public final /* synthetic */ zhd0<PlayingState> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(com.vk.catalog.mvi.block.music.impl.artists.mix.a aVar, zhd0<? super PlayingState> zhd0Var) {
            this.b = aVar;
            this.c = zhd0Var;
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            this.c.f(!this.b.w() ? PlayingState.NONE : (playState == null || !playState.h()) ? PlayingState.PAUSED : PlayingState.PLAYING);
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void onError(String str) {
            this.c.f(PlayingState.PAUSED);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyw(u2b0 u2b0Var, com.vk.catalog.mvi.block.music.impl.artists.mix.a aVar, spj<? super gyw> spjVar) {
        super(2, spjVar);
        this.$playerModel = u2b0Var;
        this.$this_playStateFlow = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        gyw gywVar = new gyw(this.$playerModel, this.$this_playStateFlow, spjVar);
        gywVar.L$0 = obj;
        return gywVar;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super PlayingState> zhd0Var, spj<? super s3q0> spjVar) {
        return ((gyw) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zhd0 zhd0Var = (zhd0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            a aVar = new a(this.$this_playStateFlow, zhd0Var);
            this.$playerModel.P0(aVar, true);
            rs0 rs0Var = new rs0(9, this.$playerModel, aVar);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (phd0.a(zhd0Var, rs0Var, this) == coroutineSingletons) {
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
