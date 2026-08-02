package xsna;

import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.catalog.dto.CatalogGetVideoAlbumCatalogTypeDto;
import com.vk.api.generated.catalog.dto.CatalogGetVideoAlbumSortAlbumDto;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import com.vk.video.playlist.playlistscreen.domain.PlaylistCatalogDo;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: PlaylistScreenRepository.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.data.PlaylistScreenRepositoryImpl$getPlaylistCatalogData$2", f = "PlaylistScreenRepository.kt", l = {Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class jdb0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends PlaylistCatalogDo>>, Object> {
    final /* synthetic */ UserId $ownerId;
    final /* synthetic */ int $playlistId;
    final /* synthetic */ String $trackCode;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ sdb0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdb0(sdb0 sdb0Var, UserId userId, int i, String str, spj<? super jdb0> spjVar) {
        super(2, spjVar);
        this.this$0 = sdb0Var;
        this.$ownerId = userId;
        this.$playlistId = i;
        this.$trackCode = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jdb0(this.this$0, this.$ownerId, this.$playlistId, this.$trackCode, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends PlaylistCatalogDo>> spjVar) {
        return ((jdb0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        CatalogGetVideoAlbumSortAlbumDto catalogGetVideoAlbumSortAlbumDto;
        sdb0 sdb0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                sdb0 sdb0Var2 = this.this$0;
                UserId userId = this.$ownerId;
                int i2 = this.$playlistId;
                String str = this.$trackCode;
                if (sdb0Var2.e.k()) {
                    catalogGetVideoAlbumSortAlbumDto = sdb0Var2.d.L0(i2, userId.b) ? CatalogGetVideoAlbumSortAlbumDto.TYPE_1 : CatalogGetVideoAlbumSortAlbumDto.TYPE_0;
                } else {
                    catalogGetVideoAlbumSortAlbumDto = null;
                }
                iz2 A = yfb.A(sdb0Var2.a.j(userId, i2, str, BuildInfo.q() ? CatalogGetVideoAlbumCatalogTypeDto.VIDEO_STANDALONE_PROFILE : null, catalogGetVideoAlbumSortAlbumDto));
                fo50.J(A);
                this.L$0 = sdb0Var2;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                Object p = evj.p(A, this);
                if (p == coroutineSingletons) {
                    return coroutineSingletons;
                }
                sdb0Var = sdb0Var2;
                obj = p;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sdb0Var = (sdb0) this.L$0;
                kotlin.a.a(obj);
            }
            obj2 = hdb0.a((CatalogCatalogResponseObjectDto) obj, sdb0Var.c);
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
