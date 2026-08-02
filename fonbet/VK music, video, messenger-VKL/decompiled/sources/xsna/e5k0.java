package xsna;

import com.vk.api.generated.serverEffects.dto.ServerEffectsCutVideoResponseDto;
import com.vk.dto.common.id.UserId;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: SmartCropRepositoryImpl.kt */
@b6l(c = "com.vk.video.ui.smartcrop.impl.data.SmartCropRepositoryImpl$startCropVideo$2", f = "SmartCropRepositoryImpl.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class e5k0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends Long>>, Object> {
    final /* synthetic */ boolean $isSmartCrop;
    final /* synthetic */ q500 $range;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ a5k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5k0(a5k0 a5k0Var, q500 q500Var, boolean z, spj<? super e5k0> spjVar) {
        super(2, spjVar);
        this.this$0 = a5k0Var;
        this.$range = q500Var;
        this.$isSmartCrop = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new e5k0(this.this$0, this.$range, this.$isSmartCrop, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends Long>> spjVar) {
        return ((e5k0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
                a5k0 a5k0Var = this.this$0;
                q500 q500Var = this.$range;
                boolean z = this.$isSmartCrop;
                UserId userId = new UserId(a5k0Var.a.b.n);
                int i2 = a5k0Var.a.b.o;
                String str = "[[" + q500Var.b + ',' + q500Var.c + "]]";
                tfx tfxVar = new tfx("serverEffects.cutVideo", new sni0(0), new a690(4));
                tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
                tfx.l(tfxVar, "video_id", i2, 1, 0, 8);
                tfx.o(tfxVar, "cut_fragment", str, 0, 0, 12);
                tfxVar.j("smart_crop", z);
                iz2 A = yfb.A(tfxVar);
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
            obj2 = new Long(((ServerEffectsCutVideoResponseDto) obj).d());
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
