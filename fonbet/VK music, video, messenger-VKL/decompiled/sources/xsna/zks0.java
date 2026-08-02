package xsna;

import android.content.Context;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.b;
import com.vkontakte.android.R;
import kotlin.Pair;

/* compiled from: VideoFileController.kt */
/* loaded from: classes17.dex */
public final class zks0 extends fhs0<Pair<? extends VideoFile, ? extends VideoFile>> {
    public final /* synthetic */ Context d;
    public final /* synthetic */ yks0 e;
    public final /* synthetic */ izs<VideoFile, s3q0> f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zks0(Context context, yks0 yks0Var, izs<? super VideoFile, s3q0> izsVar, boolean z) {
        super(context);
        this.d = context;
        this.e = yks0Var;
        this.f = izsVar;
        this.g = z;
    }

    @Override // xsna.fhs0, io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        h03.b(th);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        Pair pair = (Pair) obj;
        VideoFile videoFile = (VideoFile) pair.i();
        yks0 yks0Var = this.e;
        yks0Var.j(videoFile);
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        b.C1208b.a().e(yks0Var.e, null).N((VideoFile) pair.j());
        this.f.invoke(yks0Var.e);
        if (this.g) {
            cvk.w(this.d.getString(R.string.video_owner_subscribed, yks0Var.e.P()), false);
        }
    }
}
