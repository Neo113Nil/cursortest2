package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vkontakte.android.R;
import java.io.File;
import ru.ok.android.webrtc.animoji.render.AnimojiRenderWrapperImpl;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class es2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ es2(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return AnimojiRenderWrapperImpl.a((AnimojiRenderWrapperImpl) this.d, this.c, (CallOpenGLContext) obj);
            case 1:
                o84 o84Var = (o84) this.d;
                File file = (File) obj;
                if (file != null) {
                    o84.i(o84Var, file, this.c, new l84(file, 0), null, 8);
                } else {
                    cvk.u(R.string.vk_photo_download_error, false);
                }
                return s3q0.a;
            default:
                VideoFile videoFile = (VideoFile) obj;
                Object V0 = ((VideoAutoPlay) this.d).V0(videoFile, true, this.c);
                kotlin.a.a(V0);
                return new VideoAutoPlay.e(videoFile, (m7q) V0);
        }
    }
}
