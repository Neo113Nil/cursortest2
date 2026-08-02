package xsna;

import android.net.Uri;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.mediastore.storage.MediaStorage;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.Map;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.urlsharing.SignalingUrlSharingInfo;
import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.impl.EffectNativeSink;
import ru.ok.tensorflow.tflite.InterpreterWrapper;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class u8p implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u8p(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m7q e;
        Uri uri;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((EffectHolder) obj3).lambda$pushImage$22((String) obj2, (EffectNativeSink) obj);
                break;
            case 1:
                ((InterpreterWrapper) obj3).lambda$runForMultipleInputsOutputs$5((Object[]) obj2, (Map) obj);
                break;
            case 2:
                UrlSharingListenerManagerImpl.saveUrlSharing$lambda$0((UrlSharingListenerManagerImpl) obj3, (SignalingUrlSharingInfo) obj2, (SessionRoomId) obj);
                break;
            case 3:
                StoryEntry storyEntry = (StoryEntry) obj2;
                Long l = (Long) obj;
                q7r q7rVar = (q7r) ((om3) obj3).b;
                vrl0 a = q7rVar.a();
                if (a != null) {
                    MediaStorage mediaStorage = MediaStorage.b;
                    j7q c = MediaStorage.c(MediaStorage.VideoCacheType.STORIES);
                    VideoFile videoFile = storyEntry.n;
                    String str = null;
                    if (videoFile != null && (e = gpt0.e(gpt0.a, videoFile, -1, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER), false, false, null, null, false, 480)) != null && (uri = e.K) != null) {
                        str = uri.toString();
                    }
                    a.a(storyEntry, c.i(str), storyEntry.y != null, q7rVar.i0.f, l);
                    break;
                }
                break;
            default:
                ((yads.gk3) obj3).b((yads.nx0) obj2, (yads.va0) obj);
                break;
        }
    }
}
