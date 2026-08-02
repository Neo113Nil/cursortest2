package xsna;

import android.os.SystemClock;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.video.dto.VideoEditResponseDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.stories.entities.OrdData;
import com.vungle.ads.internal.protos.Sdk;
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
@b6l(c = "com.vk.video.ui.upload.impl.publish.data.network.PublishNetworkApiImpl$editVideo$2", f = "PublishNetworkApiImpl.kt", l = {301, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class gde0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends VideoFile>>, Object> {
    final /* synthetic */ ois0 $editDataDo;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ bee0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gde0(ois0 ois0Var, bee0 bee0Var, spj<? super gde0> spjVar) {
        super(2, spjVar);
        this.$editDataDo = ois0Var;
        this.this$0 = bee0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new gde0(this.$editDataDo, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends VideoFile>> spjVar) {
        return ((gde0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x016e A[Catch: all -> 0x002d, CancellationException -> 0x0030, TimeoutCancellationException -> 0x0033, TryCatch #2 {TimeoutCancellationException -> 0x0033, CancellationException -> 0x0030, all -> 0x002d, blocks: (B:7:0x0020, B:8:0x0166, B:10:0x016e, B:11:0x0171, B:13:0x0175, B:14:0x018c, B:18:0x0193, B:21:0x01b1, B:23:0x01b8, B:24:0x01c1, B:33:0x004c, B:35:0x012f, B:37:0x0139, B:41:0x01dd, B:42:0x01e4, B:44:0x005b, B:47:0x0063, B:48:0x006a, B:50:0x0094, B:51:0x00c3, B:52:0x00de, B:54:0x00e4, B:56:0x00f2, B:58:0x00f6, B:59:0x0102, B:64:0x009a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0175 A[Catch: all -> 0x002d, CancellationException -> 0x0030, TimeoutCancellationException -> 0x0033, TryCatch #2 {TimeoutCancellationException -> 0x0033, CancellationException -> 0x0030, all -> 0x002d, blocks: (B:7:0x0020, B:8:0x0166, B:10:0x016e, B:11:0x0171, B:13:0x0175, B:14:0x018c, B:18:0x0193, B:21:0x01b1, B:23:0x01b8, B:24:0x01c1, B:33:0x004c, B:35:0x012f, B:37:0x0139, B:41:0x01dd, B:42:0x01e4, B:44:0x005b, B:47:0x0063, B:48:0x006a, B:50:0x0094, B:51:0x00c3, B:52:0x00de, B:54:0x00e4, B:56:0x00f2, B:58:0x00f6, B:59:0x0102, B:64:0x009a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b8 A[Catch: all -> 0x002d, CancellationException -> 0x0030, TimeoutCancellationException -> 0x0033, TryCatch #2 {TimeoutCancellationException -> 0x0033, CancellationException -> 0x0030, all -> 0x002d, blocks: (B:7:0x0020, B:8:0x0166, B:10:0x016e, B:11:0x0171, B:13:0x0175, B:14:0x018c, B:18:0x0193, B:21:0x01b1, B:23:0x01b8, B:24:0x01c1, B:33:0x004c, B:35:0x012f, B:37:0x0139, B:41:0x01dd, B:42:0x01e4, B:44:0x005b, B:47:0x0063, B:48:0x006a, B:50:0x0094, B:51:0x00c3, B:52:0x00de, B:54:0x00e4, B:56:0x00f2, B:58:0x00f6, B:59:0x0102, B:64:0x009a), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        bee0 bee0Var;
        Object p;
        ois0 ois0Var;
        int i;
        int i2;
        int i3;
        Object l;
        int i4;
        VideoEditResponseDto videoEditResponseDto;
        VideoFile videoFile;
        Throwable a;
        String str;
        String d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.label;
        try {
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (i5 == 0) {
            kotlin.a.a(obj);
            ois0 ois0Var2 = this.$editDataDo;
            bee0Var = this.this$0;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Date date = ois0Var2.j;
            VideoFile videoFile2 = ois0Var2.a;
            int seconds = (int) timeUnit.toSeconds(date != null ? date.getTime() : 0L);
            uft0 uft0Var = bee0Var.a;
            int o0 = videoFile2.o0();
            UserId I0 = videoFile2.I0();
            String str2 = ois0Var2.b;
            String str3 = ois0Var2.c;
            ArrayList d2 = ois0Var2.d.d();
            ArrayList d3 = ois0Var2.e.d();
            OrdData ordData = ois0Var2.g;
            w9y w9yVar = new w9y();
            if (ordData == null) {
                w9yVar.b(Boolean.FALSE, "is_ads");
            } else {
                w9yVar.b(Boolean.valueOf(ordData.b), "is_ads");
                w9y w9yVar2 = new w9y();
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
            iz2 A = yfb.A(tft0.m(uft0Var, o0, I0, str2, str3, d2, d3, new Integer(seconds), jSONObject, arrayList, donutLevel != null ? new Integer(donutLevel.b) : null, 125888));
            this.L$0 = ois0Var2;
            this.L$1 = bee0Var;
            this.I$0 = 0;
            this.I$1 = 0;
            this.I$2 = seconds;
            this.label = 1;
            p = evj.p(A, this);
            if (p == coroutineSingletons) {
                return coroutineSingletons;
            }
            ois0Var = ois0Var2;
            i = seconds;
            i2 = 0;
            i3 = 0;
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4 = this.I$2;
                videoFile = (VideoFile) this.L$3;
                failure = (VideoFile) this.L$2;
                videoEditResponseDto = (VideoEditResponseDto) this.L$1;
                ois0Var = (ois0) this.L$0;
                kotlin.a.a(obj);
                l = ((Result) obj).d();
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                a = Result.a(l);
                if (a != null) {
                    bVar.a(a);
                }
                if (!(l instanceof Result.Failure)) {
                    VideoFile videoFile3 = (VideoFile) l;
                    videoFile.F8(videoFile3.Y3());
                    videoFile.P6(videoFile3.p1());
                    videoFile.w5(videoFile3.U3());
                }
                str = ois0Var.b;
                String str4 = "";
                if (str == null) {
                    str = "";
                }
                videoFile.m(str);
                videoFile.s2(ois0Var.c);
                videoFile.n2(ois0Var.d.b);
                videoFile.Y2(ois0Var.e.b);
                d = videoEditResponseDto.d();
                if (d == null) {
                    str4 = d;
                }
                videoFile.E(str4);
                DonutLevel donutLevel2 = ois0Var.i;
                videoFile.o5(donutLevel2 == null ? new Integer(donutLevel2.b) : null);
                videoFile.la(i4);
                gpt0 gpt0Var = gpt0.a;
                videoFile.Q4(gpt0.b(i4, videoFile));
                videoFile.jb(ois0Var.h);
                videoFile.setTimestamp(SystemClock.elapsedRealtime());
                return new Result(failure);
            }
            i = this.I$2;
            i2 = this.I$1;
            i3 = this.I$0;
            bee0Var = (bee0) this.L$1;
            ois0 ois0Var3 = (ois0) this.L$0;
            kotlin.a.a(obj);
            p = obj;
            ois0Var = ois0Var3;
        }
        VideoEditResponseDto videoEditResponseDto2 = (VideoEditResponseDto) p;
        if (videoEditResponseDto2.e() != BaseBoolIntDto.YES) {
            throw new IOException("Response isn't success");
        }
        VideoFileOld copy = ois0Var.a.copy();
        String a1 = ois0Var.a.a1();
        this.L$0 = ois0Var;
        this.L$1 = videoEditResponseDto2;
        this.L$2 = copy;
        this.L$3 = copy;
        this.I$0 = i3;
        this.I$1 = i2;
        this.I$2 = i;
        this.I$3 = 0;
        this.I$4 = 0;
        this.label = 2;
        l = bee0.l(bee0Var, a1, this);
        if (l != coroutineSingletons) {
            i4 = i;
            videoEditResponseDto = videoEditResponseDto2;
            videoFile = copy;
            failure = videoFile;
            com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
            a = Result.a(l);
            if (a != null) {
            }
            if (!(l instanceof Result.Failure)) {
            }
            str = ois0Var.b;
            String str42 = "";
            if (str == null) {
            }
            videoFile.m(str);
            videoFile.s2(ois0Var.c);
            videoFile.n2(ois0Var.d.b);
            videoFile.Y2(ois0Var.e.b);
            d = videoEditResponseDto.d();
            if (d == null) {
            }
            videoFile.E(str42);
            DonutLevel donutLevel22 = ois0Var.i;
            videoFile.o5(donutLevel22 == null ? new Integer(donutLevel22.b) : null);
            videoFile.la(i4);
            gpt0 gpt0Var2 = gpt0.a;
            videoFile.Q4(gpt0.b(i4, videoFile));
            videoFile.jb(ois0Var.h);
            videoFile.setTimestamp(SystemClock.elapsedRealtime());
            return new Result(failure);
        }
        return coroutineSingletons;
    }
}
