package xsna;

import com.vk.di.component.app.AppContextDiComponent;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.queue.di.QueueSyncComponentImpl;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.stat.di.StoryStatisticsComponentImpl;
import com.vk.superapp.pip.impl.MiniAppPipModeComponentImpl;
import com.vk.toggle.features.VideoFeatures;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class uy2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uy2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (com.vk.toggle.b.A.a(r0) != false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i = this.b;
        boolean z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                v6l v6lVar = ((wy2) obj).j;
                if (v6lVar == null || !((Boolean) v6lVar.g.getValue()).booleanValue()) {
                    return null;
                }
                return (wdp0) gav0.a.getValue();
            case 1:
                ((zdw) obj).u.getClass();
                cew.h().getAll();
                return s3q0.a;
            case 2:
                return ((qlm) ((ph20) obj).e.getValue()).b();
            case 3:
                return ((nx50) obj).F0().tf();
            case 4:
                qcy<Object>[] qcyVarArr = NewsFeedComponentImpl.D;
                nwy nwyVar = ((NewsFeedComponentImpl) obj).c;
                qcy<Object> qcyVar = NewsFeedComponentImpl.D[0];
                return new v30(((AppContextDiComponent) nwyVar.c()).a, new h00());
            case 5:
                return new sbb0(((OfflineAudioComponentImpl) obj).c);
            case 6:
                return new wcv(((i2c0) obj).g);
            case 7:
                QueueSyncComponentImpl queueSyncComponentImpl = (QueueSyncComponentImpl) obj;
                return new zre0(queueSyncComponentImpl.a.getValue(), queueSyncComponentImpl.b.J2());
            case 8:
                ((Runnable) obj).run();
                return s3q0.a;
            case 9:
                return ((fsk0) obj).k.invoke("VKStatsSaveThread");
            case 10:
                nwy nwyVar2 = ((StoryStatisticsComponentImpl) obj).c;
                qcy<Object> qcyVar2 = StoryStatisticsComponentImpl.e[0];
                return new kfm0((zgm0) nwyVar2.c());
            case 11:
                if (((qks0) obj).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_REPEATED_TAP_TO_DEFAULT_SECTION;
                    videoFeatures.getClass();
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 12:
                return new MiniAppPipModeComponentImpl.a(((jau0) obj).b);
            default:
                return ((StoriesComponent) ((k7m) m7m.f((kzv0) obj)).a(fpf0.a(StoriesComponent.class))).r2();
        }
    }
}
