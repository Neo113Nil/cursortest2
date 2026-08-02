package xsna;

import com.vk.dto.video.VideoOwner;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class l74 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ l74(String str, int i) {
        this.b = i;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                if (this.c != null) {
                    qgi0.r(tgi0Var, "PostingSettingsStep2RemoveCustomDonutTeaser");
                }
                return s3q0.a;
            case 1:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
            case 2:
                List<VideoOwner> list = (List) obj;
                String str = this.c;
                if (str != null) {
                    for (VideoOwner videoOwner : list) {
                        if (epx.f(videoOwner.c, str)) {
                            if (videoOwner != null) {
                                list.remove(videoOwner);
                            }
                            return list;
                        }
                    }
                }
                videoOwner = null;
                if (videoOwner != null) {
                }
                return list;
            default:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.h(tgi0Var2, this.c);
                qgi0.q(tgi0Var2, "");
                qgi0.r(tgi0Var2, "playlistTitle");
                return s3q0.a;
        }
    }
}
