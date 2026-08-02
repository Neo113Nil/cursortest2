package xsna;

import android.content.Context;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import com.vk.log.L;

/* compiled from: VideoApiHelper.kt */
/* loaded from: classes17.dex */
public final class v1s0 extends fhs0<VideoFile> {
    public final /* synthetic */ Context d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ UserId g;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ izs<VideoFile, s3q0> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v1s0(Context context, boolean z, boolean z2, UserId userId, int i, boolean z3, izs<? super VideoFile, s3q0> izsVar) {
        super(context);
        this.d = context;
        this.e = z;
        this.f = z2;
        this.g = userId;
        this.h = i;
        this.i = z3;
        this.j = izsVar;
    }

    @Override // xsna.fhs0, io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        if (this.i) {
            super.onError(th);
        } else {
            L.i(th);
        }
        this.j.invoke(null);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        VideoFile videoFile = (VideoFile) obj;
        boolean z = videoFile.Z9() || fxc0.B().c(videoFile) || videoFile.Q0();
        boolean isEmpty = videoFile.isEmpty();
        izs<VideoFile, s3q0> izsVar = this.j;
        if (!isEmpty || !this.e || this.f || z) {
            w1s0.a(videoFile, izsVar);
            return;
        }
        w1s0 w1s0Var = w1s0.b;
        io.reactivex.rxjava3.core.q f = ((VideoApiHelperRepository) w1s0.f.getValue()).f(this.h, this.g);
        Context context = this.d;
        hg1.m(f, context, 500L, false, 60).subscribe(new u1s0(context, izsVar, this.i));
    }
}
