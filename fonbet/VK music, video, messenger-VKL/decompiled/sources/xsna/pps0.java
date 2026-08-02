package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.rps0;
import xsna.t3s0;

/* compiled from: VideoHolderActor.kt */
@b6l(c = "com.vk.video.ui.slider.impl.store.VideoHolderActor$changeSubscribing$1$1$1", f = "VideoHolderActor.kt", l = {156}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class pps0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isGrantedPermission;
    final /* synthetic */ VideoFile $videoFile;
    int label;
    final /* synthetic */ qps0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pps0(VideoFile videoFile, qps0 qps0Var, boolean z, spj<? super pps0> spjVar) {
        super(2, spjVar);
        this.$videoFile = videoFile;
        this.this$0 = qps0Var;
        this.$isGrantedPermission = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pps0(this.$videoFile, this.this$0, this.$isGrantedPermission, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pps0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            iz2 A = yfb.A(epx.f(this.$videoFile.P8(), Boolean.TRUE) ? new uft0().c(this.$videoFile.I0(), new Integer(this.$videoFile.o0())) : tft0.l(new uft0(), this.$videoFile.I0(), new Integer(this.$videoFile.o0()), 4));
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
        VideoFile videoFile = this.$videoFile;
        qps0 qps0Var = this.this$0;
        boolean z = this.$isGrantedPermission;
        if (((BaseOkResponseDto) obj) == BaseOkResponseDto.OK) {
            Boolean P8 = videoFile.P8();
            boolean booleanValue = P8 != null ? P8.booleanValue() : false;
            videoFile.p5(Boolean.valueOf(!booleanValue));
            rdi.y(qps0Var, new gs80(7, qps0Var, videoFile));
            t3s0.a aVar = qps0Var.c;
            if (!z) {
                qps0Var.c(new rps0.b(aVar.a.getString(R.string.video_send_notification_on_live_start_in_bell), R.drawable.vk_icon_notification_check_outline_28));
            } else if (booleanValue) {
                qps0Var.c(new rps0.b(aVar.a.getString(R.string.video_do_not_send_notification_on_live_start), R.drawable.vk_icon_notifications_28));
            } else {
                qps0Var.c(new rps0.b(aVar.a.getString(R.string.video_send_notification_on_live_start), R.drawable.vk_icon_notification_check_outline_28));
            }
        }
        return s3q0.a;
    }
}
