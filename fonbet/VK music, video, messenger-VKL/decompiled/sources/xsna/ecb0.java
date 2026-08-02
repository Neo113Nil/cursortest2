package xsna;

import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoListWithTotalCount;
import com.vk.video.playlist.playlistscreen.domain.PlaylistDataDo;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ncb0;

/* compiled from: PlaylistPlayDelegate.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.ui.store.delegate.PlaylistPlayDelegateKt$handleWatchShuffledClick$1$1", f = "PlaylistPlayDelegate.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ecb0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ CatalogLinkButtonActionDo.ToggleAlbumShuffle $buttonAction;
    final /* synthetic */ int $shuffleId;
    final /* synthetic */ vcb0 $this_handleWatchShuffledClick;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecb0(vcb0 vcb0Var, int i, CatalogLinkButtonActionDo.ToggleAlbumShuffle toggleAlbumShuffle, spj<? super ecb0> spjVar) {
        super(2, spjVar);
        this.$this_handleWatchShuffledClick = vcb0Var;
        this.$shuffleId = i;
        this.$buttonAction = toggleAlbumShuffle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ecb0(this.$this_handleWatchShuffledClick, this.$shuffleId, this.$buttonAction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ecb0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        if (r10 != null) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ecb0 ecb0Var;
        Object c;
        List<VideoFile> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            vcb0 vcb0Var = this.$this_handleWatchShuffledClick;
            bdb0 bdb0Var = vcb0Var.d;
            int i2 = ((PlaylistScreenState) vcb0Var.b.getCurrentState()).b;
            UserId userId = ((PlaylistScreenState) this.$this_handleWatchShuffledClick.b.getCurrentState()).c;
            int i3 = this.$shuffleId;
            String str = ((PlaylistScreenState) this.$this_handleWatchShuffledClick.b.getCurrentState()).e;
            this.label = 1;
            ecb0Var = this;
            c = bdb0Var.c(i2, userId, i3, str, ecb0Var);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            c = ((Result) obj).d();
            ecb0Var = this;
        }
        if (c instanceof Result.Failure) {
            c = null;
        }
        VideoListWithTotalCount videoListWithTotalCount = (VideoListWithTotalCount) c;
        if (videoListWithTotalCount != null && (list = videoListWithTotalCount.b) != null) {
            if (list.isEmpty()) {
                list = null;
            }
        }
        list = ((PlaylistScreenState) ecb0Var.$this_handleWatchShuffledClick.b.getCurrentState()).k;
        vcb0 vcb0Var2 = ecb0Var.$this_handleWatchShuffledClick;
        int i4 = ecb0Var.$shuffleId;
        PlaylistDataDo j = ((PlaylistScreenState) vcb0Var2.b.getCurrentState()).j();
        vcb0Var2.c(new ncb0.g(list, j != null ? j.g : null, i4));
        return s3q0.a;
    }
}
