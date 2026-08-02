package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;

/* compiled from: PinBottomSheetFactoryInterceptor.kt */
/* loaded from: classes3.dex */
public final class gla0 implements r6s0 {
    public final UserId a;
    public final izs<String, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public gla0(UserId userId, izs<? super String, s3q0> izsVar) {
        this.a = userId;
        this.b = izsVar;
    }

    @Override // xsna.r6s0
    public final s6s0 a(s6s0 s6s0Var) {
        return s6s0.a(s6s0Var, this.a);
    }

    @Override // xsna.r6s0
    public final void b(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions) {
        if (rl3.y0(new VideoBottomSheetSideEffectOptions[]{VideoBottomSheetSideEffectOptions.PIN, VideoBottomSheetSideEffectOptions.UNPIN}).contains(videoBottomSheetSideEffectOptions)) {
            this.b.invoke("videos_pin");
        }
    }
}
