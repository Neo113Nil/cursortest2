package xsna;

import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import com.vk.dto.live.LiveEventModel;

/* compiled from: WritePresenter.java */
/* loaded from: classes3.dex */
public final class n2y0 extends io.reactivex.rxjava3.observers.a<VideoGetCommentsExtendedResponseDto> {
    public final /* synthetic */ LiveEventModel c;
    public final /* synthetic */ l2y0 d;

    public n2y0(l2y0 l2y0Var, LiveEventModel liveEventModel) {
        this.d = l2y0Var;
        this.c = liveEventModel;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        this.d.d.remove(this);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        this.d.d.remove(this);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        for (WallWallCommentDto wallWallCommentDto : ((VideoGetCommentsExtendedResponseDto) obj).f()) {
            int id = wallWallCommentDto.getId();
            LiveEventModel liveEventModel = this.c;
            if (id == liveEventModel.m) {
                l2y0 l2y0Var = this.d;
                if (l2y0Var.w == null || liveEventModel.n.equals(wallWallCommentDto.C())) {
                    return;
                }
                l2y0Var.w.O0(liveEventModel.m, wallWallCommentDto.C());
                return;
            }
        }
    }
}
