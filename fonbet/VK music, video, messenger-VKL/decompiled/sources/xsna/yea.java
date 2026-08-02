package xsna;

import com.vk.api.generated.account.dto.AccountToggleDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.catalog.mvi.section.domain.CatalogReorderData;
import com.vk.internal.api.GsonHolder;
import com.vk.toggle.features.VideoFeatures;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: CatalogSectionRepositoryImpl.kt */
@b6l(c = "com.vk.catalog.mvi.section.impl.data.CatalogSectionRepositoryImpl$reorderBlockItems$2", f = "CatalogSectionRepositoryImpl.kt", l = {161}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class yea extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends s3q0>>, Object> {
    final /* synthetic */ String $blockId;
    final /* synthetic */ List<CatalogReorderData> $reorderData;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ zea this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yea(String str, zea zeaVar, List<CatalogReorderData> list, spj<? super yea> spjVar) {
        super(2, spjVar);
        this.$blockId = str;
        this.this$0 = zeaVar;
        this.$reorderData = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new yea(this.$blockId, this.this$0, this.$reorderData, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends s3q0>> spjVar) {
        return ((yea) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
                String str = this.$blockId;
                String a = zea.a(this.this$0, this.$reorderData);
                List singletonList = Collections.singletonList(new AccountToggleDto(com.vk.toggle.d.c() != null, VideoFeatures.VIDEO_AUTHOR_CABINET.getKey(), null, null, null, 28, null));
                tfx tfxVar = new tfx("catalog.reorderBlockItems", new io.reactivex.rxjava3.internal.operators.mixed.k(9), new fr(7));
                tfx.o(tfxVar, "block_id", str, 0, 0, 12);
                tfx.o(tfxVar, "replacement_ids", a, 0, 0, 12);
                tfx.o(tfxVar, "applied_toggles", GsonHolder.a().toJson(singletonList), 0, 0, 12);
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
        if (((BaseBoolIntDto) p) != BaseBoolIntDto.YES) {
            throw new IOException("Response isn't success");
        }
        obj2 = s3q0.a;
        return new Result(obj2);
    }
}
