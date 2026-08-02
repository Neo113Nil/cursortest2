package xsna;

import android.view.View;
import com.vk.dto.common.VideoFile;
import one.video.exo.offline.DownloadInfo;

/* compiled from: VideoFullscreenBottomBarView.kt */
/* loaded from: classes2.dex */
public final class xms0 implements j8o {
    public final /* synthetic */ uys0 a;

    public xms0(uys0 uys0Var) {
        this.a = uys0Var;
    }

    @Override // xsna.j8o
    public final void a(VideoFile videoFile) {
        this.a.a(videoFile);
    }

    @Override // xsna.j8o
    public final void b(DownloadInfo downloadInfo, String str) {
        this.a.c(gpt0.F(downloadInfo), str);
    }

    @Override // xsna.j8o
    public final String c(String str) {
        return fxc0.B().s().v(str);
    }

    @Override // xsna.j8o
    public final View getView() {
        return (View) this.a;
    }

    @Override // xsna.j8o
    public final void setTint(int i) {
        this.a.setTint(i);
    }
}
