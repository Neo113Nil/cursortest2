package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import xsna.sft0;

/* compiled from: VideoPickerRepositoryImpl.kt */
/* loaded from: classes2.dex */
public final class z2t0 implements y2t0 {
    public final uft0 a;
    public final VideoApiHelperRepository b;
    public final ums0 c = ums0.a;
    public final q7o d = new q7o();

    public z2t0(uft0 uft0Var, VideoApiHelperRepository videoApiHelperRepository) {
        this.a = uft0Var;
        this.b = videoApiHelperRepository;
    }

    @Override // xsna.y2t0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 a(int i, int i2, String str) {
        return io.reactivex.rxjava3.core.x.j(this.b.d(new VideoApiHelperRepository.SearchVideosParams(120, Integer.valueOf(i), Integer.valueOf(i2), str)));
    }

    @Override // xsna.y2t0
    public final io.reactivex.rxjava3.internal.operators.single.y b(int i, UserId userId, int i2) {
        return rsg0.w0(yfb.x(this.a.t(userId, Integer.valueOf(i), Integer.valueOf(i2)))).l(new x310(new lzl0(this, 7), 18));
    }

    @Override // xsna.y2t0
    public final io.reactivex.rxjava3.internal.operators.single.y c(UserId userId, int i, int i2, Integer num) {
        return rsg0.w0(yfb.x(sft0.a.b(this.a, userId, null, num, Integer.valueOf(i2), Integer.valueOf(i), null, null, 16777006))).l(new e4t(new r6i0(this, 19), 18));
    }
}
