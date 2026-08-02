package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.model.ClipUploadParams;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.video.VideoListWithTotalCount;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class cef implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cef(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                xdd xddVar = (xdd) obj2;
                ClipVideoFile clipVideoFile = (ClipVideoFile) obj;
                ClipUploadData clipUploadData = xddVar.b;
                VideoToClipInfo videoToClipInfo = clipUploadData.b.y;
                if (videoToClipInfo != null && videoToClipInfo.d) {
                    g620.f().e().y();
                }
                com.vk.clips.upload.vk.impl.uploader.c.a.getClass();
                com.vk.clips.upload.vk.impl.uploader.c.c.remove(i2);
                com.vk.clips.upload.vk.impl.uploader.c.d.remove(i2);
                ysg0.b.a(new ced(xddVar, clipVideoFile));
                ClipUploadParams clipUploadParams = clipUploadData.b;
                Integer num = clipUploadParams.F;
                String str = clipUploadParams.G;
                if (num != null && str != null) {
                    fxv0.a.a(new jvv0(num.intValue(), clipVideoFile.b.b, clipVideoFile.c, str));
                    s3q0 s3q0Var = s3q0.a;
                }
                wjs0.a(new fyr0(clipVideoFile));
                break;
            case 1:
                ((tra0.a) obj).q((tra0) obj2, 0, -i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            default:
                VideoListWithTotalCount videoListWithTotalCount = (VideoListWithTotalCount) obj;
                ((n9e) obj2).invoke(new rbt0(this.c, 50, videoListWithTotalCount.c, 48, com.vk.video.ui.discovery.minimizable.related_videos.d.b(videoListWithTotalCount.b)));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ cef(n9e n9eVar, com.vk.video.ui.discovery.minimizable.related_videos.d dVar, int i) {
        this.b = 2;
        this.d = n9eVar;
        this.c = i;
    }
}
