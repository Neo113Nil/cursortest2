package xsna;

import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.libvideo.di.VideoDownloadsComponentImpl;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import xsna.rwm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2c0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ g2c0(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new j2n(R.attr.vk_ui_background_content);
            case 1:
                return new com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.a();
            case 2:
                return new d0c0((dw0) iuc0.g.getValue(), iuc0.c);
            case 3:
                return new p2r();
            case 4:
                return Boolean.valueOf(dek0.c);
            case 5:
                return new kc10();
            case 6:
                return PrivateFiles.e(e8r.a, PrivateSubdir.TEMP_UPLOADS, "old_avatar", "jpg", 24);
            case 7:
                int i = d9m0.n1;
                return s3q0.a;
            case 8:
                return Integer.valueOf(dhr0.t.c(R.attr.vk_ui_background_secondary_alpha));
            case 9:
                int i2 = rwm0.g;
                dhr0.a.getClass();
                return rwm0.a.b(dhr0.y());
            case 10:
                f9w f9wVar = d7o0.g;
                return "onClosed";
            case 11:
                return new tzr0();
            case 12:
                return new s290();
            case 13:
                qcy<Object>[] qcyVarArr = VideoDownloadsComponentImpl.b;
                return new gis0();
            case 14:
                return Boolean.valueOf(com.vk.toggle.b.A.a(VideoFeatures.VIDEO_NEW_API_RECOMM_METHOD));
            case 15:
                throw null;
            case 16:
                return (ofv0) jfv0.o.getValue();
            case 17:
                return new j19();
            case 18:
                VideoPipStateHolder.a.getClass();
                VideoPipStateHolder.b();
                return s3q0.a;
            default:
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.Y.d();
        }
    }
}
