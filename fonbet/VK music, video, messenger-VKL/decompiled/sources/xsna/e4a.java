package xsna;

import com.vk.catalog.mvi.section.api.CatalogPerformanceMetrics;
import com.vk.dto.common.id.UserId;
import com.vk.video.playlist.playlistscreen.domain.PlaylistCatalogDo;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.el50;
import xsna.ln50;

/* compiled from: CatalogDelegate.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.ui.store.delegate.CatalogDelegateKt$loadCatalogSections$1$1", f = "CatalogDelegate.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class e4a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ vcb0 $this_loadCatalogSections;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4a(vcb0 vcb0Var, spj<? super e4a> spjVar) {
        super(2, spjVar);
        this.$this_loadCatalogSections = vcb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e4a(this.$this_loadCatalogSections, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((e4a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.$this_loadCatalogSections.c.b(CatalogPerformanceMetrics.Mode.ACTOR_START_REPO_FINISH);
            this.$this_loadCatalogSections.c.a();
            vcb0 vcb0Var = this.$this_loadCatalogSections;
            bdb0 bdb0Var = vcb0Var.d;
            int i2 = ((PlaylistScreenState) vcb0Var.b.getCurrentState()).b;
            UserId userId = ((PlaylistScreenState) this.$this_loadCatalogSections.b.getCurrentState()).c;
            String str = ((PlaylistScreenState) this.$this_loadCatalogSections.b.getCurrentState()).e;
            this.label = 1;
            a = bdb0Var.a(i2, userId, str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            a = ((Result) obj).d();
        }
        vcb0 vcb0Var2 = this.$this_loadCatalogSections;
        if (!(a instanceof Result.Failure)) {
            rdi.y(vcb0Var2, new hl1(3, vcb0Var2, (PlaylistCatalogDo) a));
            el50.a.a(vcb0Var2, new rn50("SectionStoresListenTask"), ln50.a.c, new qhf(new jy(vcb0Var2, 23), 1));
        }
        return s3q0.a;
    }
}
