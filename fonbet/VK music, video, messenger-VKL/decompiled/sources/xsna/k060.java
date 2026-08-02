package xsna;

import android.content.Context;
import com.vk.core.files.ExternalDirType;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.user.RequestUserProfile;
import com.vk.media.model.CameraVideoEncoderParameters;
import com.vk.stories.StoriesVideoEncoder;
import com.vk.story.api.domain.interactor.upload.StoryTaskParams;
import com.vk.storycamera.upload.a;
import java.io.File;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class k060 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k060(com.vk.storycamera.upload.a aVar, boolean z, a.b bVar) {
        this.c = aVar;
        this.d = bVar;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        StoryUploadParams storyUploadParams;
        StoryTaskParams storyTaskParams;
        CameraVideoEncoderParameters cameraVideoEncoderParameters;
        File file;
        StoryTaskParams storyTaskParams2;
        CameraVideoEncoderParameters cameraVideoEncoderParameters2;
        File file2;
        switch (this.b) {
            case 0:
                ((m060) this.c).c((RequestUserProfile) this.d, false);
                break;
            default:
                com.vk.storycamera.upload.a aVar = (com.vk.storycamera.upload.a) this.c;
                a.b bVar = (a.b) this.d;
                int i = com.vk.storycamera.upload.a.S;
                aVar.u0(null);
                StoriesVideoEncoder.b bVar2 = aVar.N;
                File file3 = bVar2 != null ? StoriesVideoEncoder.this.c : null;
                aVar.C = file3 != null ? file3.getAbsolutePath() : null;
                aVar.N = null;
                aVar.r0();
                aVar.Q = false;
                aVar.P = false;
                aVar.l0(true);
                ((uvl0) aVar.F.getValue()).i(aVar.d, file3);
                aVar.q0();
                StoryTaskParams storyTaskParams3 = aVar.z;
                if (storyTaskParams3 != null && (storyUploadParams = storyTaskParams3.f) != null) {
                    if (epx.f(storyUploadParams.p, Boolean.TRUE) && (storyTaskParams2 = com.vk.storycamera.upload.a.this.z) != null && (cameraVideoEncoderParameters2 = storyTaskParams2.c) != null && (file2 = cameraVideoEncoderParameters2.r) != null) {
                        Regex regex = com.vk.core.files.a.a;
                        vhk0.d(file2);
                    }
                    Boolean bool = storyUploadParams.o;
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    if (((evl0) aVar.E.getValue()).a() && !booleanValue && file3 != null) {
                        Context context = e43.a;
                        if (context == null) {
                            context = null;
                        }
                        itg0.k(com.vk.core.files.b.c(new com.vk.core.files.b(context), file3, ExternalDirType.VIDEO, 4), null, new t810(17), 1);
                    }
                    if (storyUploadParams.u && (storyTaskParams = aVar.z) != null && (cameraVideoEncoderParameters = storyTaskParams.c) != null && (file = cameraVideoEncoderParameters.d) != null) {
                        Regex regex2 = com.vk.core.files.a.a;
                        vhk0.b(file);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ k060(m060 m060Var, RequestUserProfile requestUserProfile) {
        this.c = m060Var;
        this.d = requestUserProfile;
    }
}
