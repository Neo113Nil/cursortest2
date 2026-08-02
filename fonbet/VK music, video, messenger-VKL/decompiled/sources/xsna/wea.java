package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.dto.common.id.UserId;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: CatalogSectionRepositoryImpl.kt */
@b6l(c = "com.vk.catalog.mvi.section.impl.data.CatalogSectionRepositoryImpl$reorderAlbumItems$2", f = "CatalogSectionRepositoryImpl.kt", l = {185}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class wea extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends s3q0>>, Object> {
    final /* synthetic */ Integer $afterId;
    final /* synthetic */ int $albumId;
    final /* synthetic */ Integer $beforeId;
    final /* synthetic */ long $ownerId;
    int I$0;
    int I$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wea(int i, long j, Integer num, Integer num2, spj<? super wea> spjVar) {
        super(2, spjVar);
        this.$albumId = i;
        this.$ownerId = j;
        this.$beforeId = num;
        this.$afterId = num2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wea(this.$albumId, this.$ownerId, this.$beforeId, this.$afterId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends s3q0>> spjVar) {
        return ((wea) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
                int i2 = this.$albumId;
                long j = this.$ownerId;
                Integer num = this.$beforeId;
                Integer num2 = this.$afterId;
                UserId userId = new UserId(j);
                tfx tfxVar = new tfx("video.reorderAlbums", new wd10(17), new nyh0(6));
                tfx.l(tfxVar, "album_id", i2, 0, 0, 12);
                tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
                if (num != null) {
                    tfx.l(tfxVar, "before", num.intValue(), 0, 0, 12);
                }
                if (num2 != null) {
                    tfx.l(tfxVar, "after", num2.intValue(), 0, 0, 12);
                }
                iz2 A = yfb.A(tfxVar);
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
        if (((BaseOkResponseDto) p) != BaseOkResponseDto.OK) {
            throw new IOException("Response isn't success");
        }
        obj2 = s3q0.a;
        return new Result(obj2);
    }
}
