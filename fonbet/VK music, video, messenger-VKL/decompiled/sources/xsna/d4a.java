package xsna;

import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionStateFlow;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenData;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.ncb0;

/* compiled from: CatalogDelegate.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.ui.store.delegate.CatalogDelegateKt$listenToStoreEvents$1$1", f = "CatalogDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class d4a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ vcb0 $this_listenToStoreEvents;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: CatalogDelegate.kt */
    @b6l(c = "com.vk.video.playlist.playlistscreen.ui.store.delegate.CatalogDelegateKt$listenToStoreEvents$1$1$1$1", f = "CatalogDelegate.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<CatalogSectionState, spj<? super s3q0>, Object> {
        final /* synthetic */ PlaylistScreenData $tabData;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PlaylistScreenData playlistScreenData, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$tabData = playlistScreenData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$tabData, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(CatalogSectionState catalogSectionState, spj<? super s3q0> spjVar) {
            return ((a) create(catalogSectionState, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CatalogSectionState catalogSectionState = (CatalogSectionState) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            utk0 utk0Var = this.$tabData.c.b;
            CatalogSectionState a = CatalogSectionState.a(catalogSectionState, null, false, false, null, null, false, null, null, null, ScrollScreenType.VK_VIDEO_PLAYLIST, 4095);
            utk0Var.getClass();
            utk0Var.i(null, a);
            return s3q0.a;
        }
    }

    /* compiled from: CatalogDelegate.kt */
    @b6l(c = "com.vk.video.playlist.playlistscreen.ui.store.delegate.CatalogDelegateKt$listenToStoreEvents$1$1$1$2", f = "CatalogDelegate.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<bea, spj<? super s3q0>, Object> {
        final /* synthetic */ vcb0 $this_listenToStoreEvents;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vcb0 vcb0Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$this_listenToStoreEvents = vcb0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(this.$this_listenToStoreEvents, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(bea beaVar, spj<? super s3q0> spjVar) {
            return ((b) create(beaVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            bea beaVar = (bea) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$this_listenToStoreEvents.c(new ncb0.a(beaVar));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4a(vcb0 vcb0Var, spj<? super d4a> spjVar) {
        super(2, spjVar);
        this.$this_listenToStoreEvents = vcb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        d4a d4aVar = new d4a(this.$this_listenToStoreEvents, spjVar);
        d4aVar.L$0 = obj;
        return d4aVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((d4a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        PlaylistScreenData playlistScreenData = ((PlaylistScreenState) this.$this_listenToStoreEvents.b.getCurrentState()).f;
        if (playlistScreenData != null) {
            CatalogSectionStateFlow catalogSectionStateFlow = playlistScreenData.c;
            vcb0 vcb0Var = this.$this_listenToStoreEvents;
            mm50<CatalogSectionState, yda, bea> mm50Var = catalogSectionStateFlow.c;
            if (mm50Var != null) {
                rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(tci.l(mm50Var), new a(playlistScreenData, null)), yvjVar);
            }
            mm50<CatalogSectionState, yda, bea> mm50Var2 = catalogSectionStateFlow.c;
            if (mm50Var2 != null) {
                rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(tci.k(mm50Var2), new b(vcb0Var, null)), yvjVar);
            }
        }
        return s3q0.a;
    }
}
