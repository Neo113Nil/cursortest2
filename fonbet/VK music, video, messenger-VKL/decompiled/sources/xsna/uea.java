package xsna;

import com.vk.api.generated.account.dto.AccountToggleDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.toggle.features.VideoFeatures;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: CatalogSectionRepositoryImpl.kt */
@b6l(c = "com.vk.catalog.mvi.section.impl.data.CatalogSectionRepositoryImpl$hideBlock$2", f = "CatalogSectionRepositoryImpl.kt", l = {135}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class uea extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends s3q0>>, Object> {
    final /* synthetic */ String $blockId;
    int I$0;
    int I$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uea(String str, spj<? super uea> spjVar) {
        super(2, spjVar);
        this.$blockId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new uea(this.$blockId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends s3q0>> spjVar) {
        return ((uea) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                iz2 A = yfb.A(new xga().m(this.$blockId, Collections.singletonList(new AccountToggleDto(com.vk.toggle.d.c() != null, VideoFeatures.VIDEO_AUTHOR_CABINET.getKey(), null, null, null, 28, null))));
                fo50.J(A);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = evj.p(A, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
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
        if (((BaseOkResponseDto) obj) != BaseOkResponseDto.OK) {
            throw new IOException("Response isn't success");
        }
        obj2 = s3q0.a;
        return new Result(obj2);
    }
}
