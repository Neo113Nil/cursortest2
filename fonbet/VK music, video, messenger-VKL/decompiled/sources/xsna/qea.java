package xsna;

import com.vk.api.generated.account.dto.AccountToggleDto;
import com.vk.api.generated.catalog.dto.CatalogReplaceBlocksDto;
import com.vk.catalog.mvi.section.domain.CatalogBlockReplacementListDo;
import com.vk.toggle.features.VideoFeatures;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.ok.android.api.json.JsonToken;

/* compiled from: CatalogSectionRepositoryImpl.kt */
@b6l(c = "com.vk.catalog.mvi.section.impl.data.CatalogSectionRepositoryImpl$getBlocksReplacement$2", f = "CatalogSectionRepositoryImpl.kt", l = {JsonToken.END_ARRAY}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class qea extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends CatalogBlockReplacementListDo>>, Object> {
    final /* synthetic */ List<String> $replacementIdList;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ zea this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qea(List<String> list, zea zeaVar, spj<? super qea> spjVar) {
        super(2, spjVar);
        this.$replacementIdList = list;
        this.this$0 = zeaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qea(this.$replacementIdList, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends CatalogBlockReplacementListDo>> spjVar) {
        return ((qea) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        zea zeaVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                List<String> list = this.$replacementIdList;
                zea zeaVar2 = this.this$0;
                iz2 A = yfb.A(wga.n(new xga(), list, Collections.singletonList(new AccountToggleDto(com.vk.toggle.d.c() != null, VideoFeatures.VIDEO_AUTHOR_CABINET.getKey(), null, null, null, 28, null)), null, 12));
                fo50.J(A);
                this.L$0 = zeaVar2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = evj.p(A, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                zeaVar = zeaVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zeaVar = (zea) this.L$0;
                kotlin.a.a(obj);
            }
            obj2 = zeaVar.a.d((CatalogReplaceBlocksDto) obj);
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
