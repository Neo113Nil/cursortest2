package xsna;

import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.log.L;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class h6r implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h6r(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                i6r i6rVar = (i6r) this.d;
                StringBuilder sb = new StringBuilder("feedbackListeners: ");
                CopyOnWriteArraySet<f39> copyOnWriteArraySet = i6rVar.b;
                L.e("FeedbackListenerProxyImpl", fw3.d(copyOnWriteArraySet, sb));
                Iterator<f39> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().onFeedbackEnabledChanged(this.c);
                }
                return s3q0.a;
            default:
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) this.d;
                return "play() - refused, isRestricted= " + videoAutoPlay.B() + " videoFile.isLiveUpcoming= " + videoAutoPlay.u.z0() + " needReload= " + this.c;
        }
    }
}
