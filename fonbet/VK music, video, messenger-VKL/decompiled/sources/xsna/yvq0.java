package xsna;

import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class yvq0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ yvq0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                ((ece0) izsVar).invoke(obj);
                break;
            case 1:
                int i2 = VideoRelatedVideosFragment.n0;
                ((ece0) izsVar).invoke(obj);
                break;
            case 2:
                ((ece0) izsVar).invoke(obj);
                break;
            case 3:
                ((csk0) izsVar).invoke(obj);
                break;
            case 4:
                ((vcw0) izsVar).invoke(obj);
                break;
            default:
                ((vcw0) izsVar).invoke(obj);
                break;
        }
    }
}
