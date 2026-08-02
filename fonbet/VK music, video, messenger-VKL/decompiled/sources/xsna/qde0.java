package xsna;

import com.vk.api.generated.donut.dto.DonutGetLevelsResponseDto;
import com.vk.api.generated.donut.dto.DonutLevelDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.donut.DonutLevel;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: PublishNetworkApiImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.data.network.PublishNetworkApiImpl$getDonutLevel$2", f = "PublishNetworkApiImpl.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class qde0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends DonutLevel>>, Object> {
    final /* synthetic */ VideoFile $videoFile;
    int I$0;
    int I$1;
    int I$2;
    int label;
    final /* synthetic */ bee0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qde0(VideoFile videoFile, bee0 bee0Var, spj<? super qde0> spjVar) {
        super(2, spjVar);
        this.$videoFile = videoFile;
        this.this$0 = bee0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qde0(this.$videoFile, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends DonutLevel>> spjVar) {
        return ((qde0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        boolean z = false;
        Object obj3 = null;
        try {
        } catch (TimeoutCancellationException e) {
            obj3 = new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            obj3 = new Result.Failure(th);
        }
        if (i2 == 0) {
            kotlin.a.a(obj);
            VideoFile videoFile = this.$videoFile;
            bee0 bee0Var = this.this$0;
            Integer j2 = videoFile.j2();
            if (j2 != null) {
                int intValue = j2.intValue();
                iz2 A = yfb.A(dy2.c(bee0Var.c, videoFile.I0(), null, 26));
                this.I$0 = 0;
                this.I$1 = 0;
                this.I$2 = intValue;
                this.label = 1;
                obj = evj.p(A, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i = intValue;
            }
            return new Result(obj3);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = this.I$2;
        kotlin.a.a(obj);
        DonutGetLevelsResponseDto donutGetLevelsResponseDto = (DonutGetLevelsResponseDto) obj;
        Iterator<T> it = donutGetLevelsResponseDto.e().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((DonutLevelDto) obj2).getId() == i) {
                break;
            }
        }
        DonutLevelDto donutLevelDto = (DonutLevelDto) obj2;
        if (donutLevelDto != null) {
            int id = donutLevelDto.getId();
            String title = donutLevelDto.getTitle();
            int d = donutLevelDto.d();
            DonutLevelDto donutLevelDto2 = (DonutLevelDto) j5g.k0(donutGetLevelsResponseDto.e());
            if (donutLevelDto2 != null && donutLevelDto2.getId() == donutLevelDto.getId()) {
                z = true;
            }
            obj3 = new DonutLevel(id, title, d, z);
        }
        return new Result(obj3);
    }
}
