package xsna;

import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.dto.music.Playlist;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InitDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.music.impl.artists.slider.delegates.InitDelegateKt$playStateFlow$1", f = "InitDelegate.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class eyw extends SuspendLambda implements wzs<zhd0<? super PlayingState>, spj<? super s3q0>, Object> {
    final /* synthetic */ u2b0 $playerModel;
    final /* synthetic */ Playlist $playlist;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* compiled from: InitDelegate.kt */
    public static final class a extends e.a {
        public final /* synthetic */ u2b0 b;
        public final /* synthetic */ Playlist c;
        public final /* synthetic */ zhd0<PlayingState> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(u2b0 u2b0Var, Playlist playlist, zhd0<? super PlayingState> zhd0Var) {
            this.b = u2b0Var;
            this.c = playlist;
            this.d = zhd0Var;
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            this.d.f(uzp.h(this.c, this.b));
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void onError(String str) {
            this.d.f(PlayingState.NONE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyw(u2b0 u2b0Var, Playlist playlist, spj<? super eyw> spjVar) {
        super(2, spjVar);
        this.$playerModel = u2b0Var;
        this.$playlist = playlist;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        eyw eywVar = new eyw(this.$playerModel, this.$playlist, spjVar);
        eywVar.L$0 = obj;
        return eywVar;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super PlayingState> zhd0Var, spj<? super s3q0> spjVar) {
        return ((eyw) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zhd0 zhd0Var = (zhd0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            a aVar = new a(this.$playerModel, this.$playlist, zhd0Var);
            this.$playerModel.P0(aVar, true);
            defpackage.e0 e0Var = new defpackage.e0(10, this.$playerModel, aVar);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (phd0.a(zhd0Var, e0Var, this) == coroutineSingletons) {
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
