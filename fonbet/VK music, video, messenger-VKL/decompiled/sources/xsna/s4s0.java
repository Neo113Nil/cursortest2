package xsna;

import android.app.Activity;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistActionItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s4s0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s4s0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((com.vk.libvideo.autoplay.background.controller.f) this.c).G((yg5) this.d);
                break;
            case 1:
                ((com.vk.libvideo.offline.ui.a) this.c).q6((Activity) this.d);
                break;
            default:
                ((izs) this.c).invoke((VideoPlaylistActionItem) this.d);
                break;
        }
        return s3q0.a;
    }
}
