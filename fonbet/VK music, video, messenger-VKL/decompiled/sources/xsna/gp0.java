package xsna;

import android.text.TextUtils;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;

/* compiled from: AddVideoByLink.kt */
/* loaded from: classes17.dex */
public final class gp0 implements hx2<VideoFile> {
    public final /* synthetic */ hp0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public gp0(hp0 hp0Var, int i, String str) {
        this.b = hp0Var;
        this.c = i;
        this.d = str;
    }

    @Override // xsna.hx2
    public final void b(VideoFile videoFile) {
        VideoFile videoFile2 = videoFile;
        boolean isEmpty = TextUtils.isEmpty(videoFile2.w9().Ab(VideoUrl.EXTERNAL_URL));
        hp0 hp0Var = this.b;
        if (isEmpty) {
            if (hp0Var.e.get() != null) {
                i0q0.d(1000L, new fp0(hp0Var, this.c, this.d, 0));
                return;
            }
            return;
        }
        videoFile2.N8(o25.a().o().b);
        StringBuilder sb = new StringBuilder();
        sb.append(hp0Var.b);
        sb.append('_');
        sb.append(hp0Var.d);
        wjs0.a(new cwr0(videoFile2, sb.toString(), 28));
        hp0Var.f.cancel();
    }

    @Override // xsna.hx2
    public final void e(VKApiExecutionException vKApiExecutionException) {
        hp0 hp0Var = this.b;
        if (hp0Var.e.get() != null) {
            h03.b(vKApiExecutionException);
        }
        hp0Var.f.cancel();
    }
}
