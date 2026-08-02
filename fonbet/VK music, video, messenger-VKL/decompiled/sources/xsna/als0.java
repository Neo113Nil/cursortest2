package xsna;

import android.content.Context;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.b;
import com.vkontakte.android.R;
import kotlin.Pair;

/* compiled from: VideoFileController.kt */
/* loaded from: classes17.dex */
public final class als0 extends fhs0<Pair<? extends VideoFile, ? extends VideoFile>> {
    public final /* synthetic */ Context d;
    public final /* synthetic */ yks0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ gzs<s3q0> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public als0(Context context, yks0 yks0Var, boolean z, gzs<s3q0> gzsVar) {
        super(context);
        this.d = context;
        this.e = yks0Var;
        this.f = z;
        this.g = gzsVar;
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
        if (this.f) {
            cvk.w(this.d.getString(R.string.video_owner_unsubscribed, yks0Var.e.P()), false);
        }
        this.g.invoke();
    }
}
