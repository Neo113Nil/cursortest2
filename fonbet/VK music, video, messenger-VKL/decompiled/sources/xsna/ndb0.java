package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.video.dto.VideoGetFromAlbumResponseDto;
import com.vk.api.generated.video.dto.VideoGetFromAlbumSortAlbumDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoListWithTotalCount;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.sft0;

/* compiled from: PlaylistScreenRepository.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.data.PlaylistScreenRepositoryImpl$getShuffledPlaylistVideos$2", f = "PlaylistScreenRepository.kt", l = {200}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ndb0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends VideoListWithTotalCount>>, Object> {
    final /* synthetic */ UserId $ownerId;
    final /* synthetic */ int $playlistId;
    final /* synthetic */ int $shuffleId;
    final /* synthetic */ String $trackCode;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ sdb0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndb0(sdb0 sdb0Var, UserId userId, int i, String str, int i2, spj<? super ndb0> spjVar) {
        super(2, spjVar);
        this.this$0 = sdb0Var;
        this.$ownerId = userId;
        this.$playlistId = i;
        this.$trackCode = str;
        this.$shuffleId = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ndb0(this.this$0, this.$ownerId, this.$playlistId, this.$trackCode, this.$shuffleId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends VideoListWithTotalCount>> spjVar) {
        return ((ndb0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        Object p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                sdb0 sdb0Var = this.this$0;
                UserId userId = this.$ownerId;
                int i2 = this.$playlistId;
                iz2 A = yfb.A(sft0.a.d(sdb0Var.b, i2, userId, null, null, this.$trackCode, sdb0Var.d.L0(i2, userId.b) ? VideoGetFromAlbumSortAlbumDto.TYPE_1 : VideoGetFromAlbumSortAlbumDto.TYPE_0, null, new Integer(this.$shuffleId), null, tby.d(UsersFieldsDto.FOLLOWERS_COUNT, GroupsFieldsDto.MEMBERS_COUNT, BaseUserGroupFieldsDto.IS_NFT, BaseUserGroupFieldsDto.IS_NFT_PHOTO, UsersFieldsDto.PHOTO_BASE), 4));
                fo50.J(A);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                p = evj.p(A, this);
                if (p == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                p = obj;
            }
            ddt0.a.getClass();
            obj2 = ddt0.a((VideoGetFromAlbumResponseDto) p);
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            return new Result(obj2);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            return new Result(obj2);
        }
        return new Result(obj2);
    }
}
