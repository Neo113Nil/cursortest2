package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.UIBlockVideoHide;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zjs0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VideoFile c;

    public /* synthetic */ zjs0(int i, VideoFile videoFile) {
        this.b = i;
        this.c = videoFile;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UIBlockVideo uIBlockVideo;
        VideoFile videoFile;
        UserId I0;
        boolean z;
        switch (this.b) {
            case 0:
                ArrayList<UIBlock> arrayList = ((UIBlockList) obj).y;
                if (arrayList == null || !arrayList.isEmpty()) {
                    for (UIBlock uIBlock : arrayList) {
                        boolean z2 = uIBlock instanceof UIBlockVideo;
                        VideoFile videoFile2 = this.c;
                        if (z2) {
                            UIBlockVideo uIBlockVideo2 = (UIBlockVideo) uIBlock;
                            if (!uIBlockVideo2.B.C2() && uIBlockVideo2.B.I0().b == videoFile2.I0().b) {
                                z = true;
                                return Boolean.valueOf(z);
                            }
                        }
                        if ((uIBlock instanceof UIBlockVideoHide) && (uIBlockVideo = ((UIBlockVideoHide) uIBlock).y) != null && (videoFile = uIBlockVideo.B) != null && (I0 = videoFile.I0()) != null && I0.b == videoFile2.I0().b) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                VideoFile videoFile3 = (VideoFile) obj;
                int o0 = videoFile3.o0();
                VideoFile videoFile4 = this.c;
                return Boolean.valueOf(o0 == videoFile4.o0() && epx.f(videoFile3.I0(), videoFile4.I0()));
        }
    }
}
