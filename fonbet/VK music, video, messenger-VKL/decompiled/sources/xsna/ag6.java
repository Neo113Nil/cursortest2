package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.music.podcast.api.di.PodcastComponent;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vk.superapp.qr.web2app.QrWebToAppComponentImpl;
import com.vk.toggle.b;
import com.vk.toggle.features.MusicFeatures;
import com.vk.voip.stereo.api.notifications.di.VoipStereoNotificationsComponent;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import java.lang.reflect.Field;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ag6 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ag6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((BiometricsLockComponent) ((k7m) m7m.f((dg6) obj)).a(fpf0.a(BiometricsLockComponent.class))).b();
            case 1:
                return new bwe0((Context) obj);
            case 2:
                return ((VoipStereoNotificationsComponent) ((hlg) obj).c.getValue()).Rb();
            case 3:
                return ((BridgeComponent) ((gxw) obj).c().a(fpf0.a(BridgeComponent.class))).h8();
            case 4:
                return com.vk.toggle.b.A.i((b.a) obj);
            case 5:
                return ((PodcastComponent) ((LinksBridgeComponentImpl) obj).z.getValue()).t5();
            case 6:
                if (((Boolean) ((sg40) obj).o.getValue()).booleanValue() && MusicFeatures.AUDIO_PLAYER_VIDEO_BUFFERING.h()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                if (p1p0.a(((r360) obj).d().e().h()) && !r360.e()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                PhotosComponentImpl photosComponentImpl = (PhotosComponentImpl) obj;
                qcy<Object>[] qcyVarArr = PhotosComponentImpl.u;
                return new com.vk.photos.root.photoflow.domain.a(photosComponentImpl.r1(), photosComponentImpl.i3());
            case 9:
                aid0 aid0Var = (aid0) obj;
                bpn0 bpn0Var = aid0Var.o;
                if (!lhs.d()) {
                    return aid0Var.g((thd0) bpn0Var.getValue());
                }
                lhs.a("ProducerSequenceFactory#getNetworkFetchSequence:init");
                try {
                    return aid0Var.g((thd0) bpn0Var.getValue());
                } finally {
                    lhs.b();
                }
            case 10:
                return new ooe0(((QrWebToAppComponentImpl) obj).a.J2());
            case 11:
                StoryViewerComponentImpl storyViewerComponentImpl = (StoryViewerComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = StoryViewerComponentImpl.s;
                StoryViewerRouter tb = storyViewerComponentImpl.tb();
                StoriesComponent storiesComponent = storyViewerComponentImpl.a;
                return new uql0(tb, storiesComponent.b(), storyViewerComponentImpl.z3(), storiesComponent.te());
            default:
                gdr0 gdr0Var = (gdr0) obj;
                try {
                    Field declaredField = LayoutInflater.class.getDeclaredField("mConstructorArgs");
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(gdr0Var);
                    Object[] objArr = obj2 instanceof Object[] ? (Object[]) obj2 : null;
                    declaredField.setAccessible(false);
                    return objArr;
                } catch (NoSuchFieldException e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                    return null;
                }
        }
    }
}
