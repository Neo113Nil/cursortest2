package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.epx;

/* compiled from: AuthorHeaderLiveCoverVideoPlayer.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class fa5 extends FunctionReferenceImpl implements izs<yg5, s3q0> {
    final /* synthetic */ wh50<yg5> $autoPlay$delegate;
    final /* synthetic */ mtk0<Boolean> $isExpandedState$delegate;
    final /* synthetic */ s95 $playbackController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa5(s95 s95Var, wh50 wh50Var, wh50 wh50Var2) {
        super(1, epx.a.class, "bindAutoPlayRef", "AuthorHeaderLiveCoverVideoPlayer$bindAutoPlayRef(Lcom/vk/profile/core/livecover/AuthorHeaderLiveCoverPlaybackController;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Lcom/vk/libvideo/autoplay/AutoPlay;)V", 0);
        this.$playbackController = s95Var;
        this.$autoPlay$delegate = wh50Var;
        this.$isExpandedState$delegate = wh50Var2;
    }

    @Override // xsna.izs
    public final s3q0 invoke(yg5 yg5Var) {
        yg5 yg5Var2 = yg5Var;
        s95 s95Var = this.$playbackController;
        wh50<yg5> wh50Var = this.$autoPlay$delegate;
        mtk0<Boolean> mtk0Var = this.$isExpandedState$delegate;
        wh50Var.setValue(yg5Var2);
        s95Var.a(yg5Var2, ha5.b(mtk0Var));
        return s3q0.a;
    }
}
