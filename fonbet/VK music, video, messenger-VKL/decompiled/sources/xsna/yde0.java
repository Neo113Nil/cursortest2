package xsna;

import android.os.SystemClock;
import com.vk.api.generated.video.dto.VideoPublishResponseDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.stories.entities.OrdData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: PublishNetworkApiImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.data.network.PublishNetworkApiImpl$publishDraft$2", f = "PublishNetworkApiImpl.kt", l = {256}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class yde0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends VideoFile>>, Object> {
    final /* synthetic */ ois0 $editDataDo;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ bee0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yde0(ois0 ois0Var, bee0 bee0Var, spj<? super yde0> spjVar) {
        super(2, spjVar);
        this.$editDataDo = ois0Var;
        this.this$0 = bee0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new yde0(this.$editDataDo, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends VideoFile>> spjVar) {
        return ((yde0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Result.Failure failure2;
        uft0 uft0Var;
        UserId userId;
        int i;
        Object p;
        ois0 ois0Var;
        VideoVideoFullDto d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                kotlin.a.a(obj);
                ois0 ois0Var2 = this.$editDataDo;
                bee0 bee0Var = this.this$0;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Date date = ois0Var2.j;
                VideoFile videoFile = ois0Var2.a;
                long seconds = timeUnit.toSeconds(date != null ? date.getTime() : 0L);
                uft0 uft0Var2 = bee0Var.a;
                UserId I0 = videoFile.I0();
                int o0 = videoFile.o0();
                String str = ois0Var2.c;
                String str2 = ois0Var2.b;
                ArrayList d2 = ois0Var2.d.d();
                ArrayList d3 = ois0Var2.e.d();
                Boolean valueOf = Boolean.valueOf(ois0Var2.f);
                Integer num = new Integer((int) seconds);
                OrdData ordData = ois0Var2.g;
                w9y w9yVar = new w9y();
                if (ordData == null) {
                    w9yVar.b(Boolean.FALSE, "is_ads");
                    uft0Var = uft0Var2;
                    userId = I0;
                    i = o0;
                } else {
                    uft0Var = uft0Var2;
                    w9yVar.b(Boolean.valueOf(ordData.b), "is_ads");
                    w9y w9yVar2 = new w9y();
                    userId = I0;
                    i = o0;
                    w9yVar2.e(ordData.d, "er_id");
                    w9yVar2.e(ordData.c, "ord_pred_id");
                    s3q0 s3q0Var = s3q0.a;
                    w9yVar.e(Collections.singletonList(w9yVar2.a), "advertisers");
                }
                s3q0 s3q0Var2 = s3q0.a;
                String jSONObject = w9yVar.a.toString();
                List<VideoFile> list = ois0Var2.h;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((VideoFile) it.next()).a1());
                }
                DonutLevel donutLevel = ois0Var2.i;
                iz2 A = yfb.A(uft0Var.x(userId, i, str, str2, d2, d3, valueOf, num, jSONObject, arrayList, donutLevel != null ? new Integer(donutLevel.b) : null));
                this.L$0 = ois0Var2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.J$0 = seconds;
                this.label = 1;
                p = evj.p(A, this);
                if (p == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ois0Var = ois0Var2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ois0Var = (ois0) this.L$0;
                kotlin.a.a(obj);
                p = obj;
            }
            d = ((VideoPublishResponseDto) p).d();
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            failure2 = failure;
            return new Result(failure2);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            failure2 = failure;
            return new Result(failure2);
        }
        if (d == null) {
            throw new IOException("Response isn't success");
        }
        VideoFileOld d4 = ums0.d(ums0.a, d, null, null, null, 30);
        VideoFileOld copy = ois0Var.a.copy();
        copy.m = d4.m;
        copy.l = d4.l;
        copy.x0 = d4.x0;
        copy.y0 = d4.y0;
        copy.r = d4.r;
        copy.d0 = d4.d0;
        copy.b1 = d4.b1;
        copy.l1 = d4.l1;
        copy.r0 = d4.r0;
        copy.q = d4.q;
        copy.a1 = d4.a1;
        copy.A0 = SystemClock.elapsedRealtime();
        failure2 = copy;
        return new Result(failure2);
    }
}
