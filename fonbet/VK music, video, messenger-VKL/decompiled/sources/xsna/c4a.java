package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.video.playlist.playlistscreen.domain.PlaylistDataDo;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenInfoDataState;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CatalogDelegate.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.ui.store.delegate.CatalogDelegateKt$listenEvents$1", f = "CatalogDelegate.kt", l = {TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class c4a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ vcb0 $this_listenEvents;
    int label;

    /* compiled from: CatalogDelegate.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ vcb0 b;

        public a(vcb0 vcb0Var) {
            this.b = vcb0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            boolean z;
            y4a y4aVar = (y4a) obj;
            if (y4aVar instanceof sxm0) {
                vcb0 vcb0Var = this.b;
                PlaylistScreenInfoDataState playlistScreenInfoDataState = ((PlaylistScreenState) vcb0Var.b.getCurrentState()).d;
                if (!(playlistScreenInfoDataState instanceof PlaylistScreenInfoDataState.Loaded)) {
                    return s3q0.a;
                }
                PlaylistDataDo playlistDataDo = ((PlaylistScreenInfoDataState.Loaded) playlistScreenInfoDataState).b;
                sxm0 sxm0Var = (sxm0) y4aVar;
                if (epx.f(sxm0Var.b, ((PlaylistScreenState) vcb0Var.b.getCurrentState()).d) && (z = sxm0Var.c) != playlistDataDo.d) {
                    rdi.y(vcb0Var, new x7(new PlaylistScreenInfoDataState.Loaded(PlaylistDataDo.a(playlistDataDo, z, false, 123)), 18));
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4a(vcb0 vcb0Var, spj<? super c4a> spjVar) {
        super(2, spjVar);
        this.$this_listenEvents = vcb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new c4a(this.$this_listenEvents, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((c4a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ksr<y4a> b = this.$this_listenEvents.e.b();
            a aVar = new a(this.$this_listenEvents);
            this.label = 1;
            if (b.collect(aVar, this) == coroutineSingletons) {
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
