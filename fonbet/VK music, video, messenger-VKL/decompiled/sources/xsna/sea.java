package xsna;

import com.vk.api.generated.account.dto.AccountToggleDto;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.catalog.mvi.section.domain.CatalogSectionDo;
import com.vk.toggle.features.VideoFeatures;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: CatalogSectionRepositoryImpl.kt */
@b6l(c = "com.vk.catalog.mvi.section.impl.data.CatalogSectionRepositoryImpl$getSection$2", f = "CatalogSectionRepositoryImpl.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class sea extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends CatalogSectionDo>>, Object> {
    final /* synthetic */ String $sectionId;
    final /* synthetic */ String $startFrom;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ zea this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sea(String str, String str2, zea zeaVar, spj<? super sea> spjVar) {
        super(2, spjVar);
        this.$sectionId = str;
        this.$startFrom = str2;
        this.this$0 = zeaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new sea(this.$sectionId, this.$startFrom, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends CatalogSectionDo>> spjVar) {
        return ((sea) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        int i;
        Object p;
        zea zeaVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                kotlin.a.a(obj);
                String str = this.$sectionId;
                String str2 = this.$startFrom;
                zea zeaVar2 = this.this$0;
                xga xgaVar = new xga();
                boolean z = false;
                if (com.vk.toggle.d.c() != null) {
                    i = 0;
                    z = true;
                } else {
                    i = 0;
                }
                int i3 = i;
                iz2 A = yfb.A(wga.d(xgaVar, str, null, str2, null, Collections.singletonList(new AccountToggleDto(z, VideoFeatures.VIDEO_AUTHOR_CABINET.getKey(), null, null, null, 28, null)), null, 31738));
                fo50.J(A);
                this.L$0 = zeaVar2;
                this.I$0 = i3;
                this.I$1 = i3;
                this.label = 1;
                p = evj.p(A, this);
                if (p == coroutineSingletons) {
                    return coroutineSingletons;
                }
                zeaVar = zeaVar2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zeaVar = (zea) this.L$0;
                kotlin.a.a(obj);
                p = obj;
            }
            obj2 = zeaVar.a.b((CatalogSectionResponseObjectDto) p);
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
