package xsna;

import com.vk.catalog.mvi.block.music.impl.artists.slider.entity.ArtistSliderState;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: InitDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.music.impl.artists.slider.delegates.InitDelegateKt$handleInit$1", f = "InitDelegate.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class vxw extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ht3 $this_handleInit;
    int label;

    /* compiled from: InitDelegate.kt */
    public static final /* synthetic */ class a implements lsr, g0t {
        public final /* synthetic */ ht3 b;

        public a(ht3 ht3Var) {
            this.b = ht3Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            ht3 ht3Var = this.b;
            ht3Var.getClass();
            ht3Var.m(new k9((PlayingState) obj, 4));
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
            return new AdaptedFunctionReference(2, this.b, ht3.class, "changePlayingState", "changePlayingState$impl_release(Lcom/vk/catalog/mvi/block/music/impl/entity/PlayingState;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxw(ht3 ht3Var, spj<? super vxw> spjVar) {
        super(2, spjVar);
        this.$this_handleInit = ht3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new vxw(this.$this_handleInit, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((vxw) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            nb9 i2 = rsr.i(new eyw(this.$this_handleInit.c, ((ArtistSliderState) ((b2a) this.$this_handleInit.b.b).getCurrentState()).e, null));
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
