package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;

/* compiled from: PinBottomSheetFactoryInterceptor.kt */
/* loaded from: classes16.dex */
public final class hla0 implements r6s0 {
    public final UserId a;
    public final lda b;

    public hla0(UserId userId, lda ldaVar) {
        this.a = userId;
        this.b = ldaVar;
    }

    @Override // xsna.r6s0
    public final s6s0 a(s6s0 s6s0Var) {
        return s6s0.a(s6s0Var, this.a);
    }

    @Override // xsna.r6s0
    public final void b(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions) {
        if (rl3.y0(new VideoBottomSheetSideEffectOptions[]{VideoBottomSheetSideEffectOptions.PIN, VideoBottomSheetSideEffectOptions.UNPIN}).contains(videoBottomSheetSideEffectOptions)) {
            this.b.b(new oon0("videos_pin", null, false, false, 14), false);
        }
    }
}
