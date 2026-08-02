package xsna;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.log.L;
import com.vk.stat.scheme.CommonVideoStat$TypeVsidItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer;
import com.vk.video.ui.discovery.minimizable.tracker.VideoQualityTracker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.gl.tf.factory.FaceDetectionFactory;
import ru.ok.tensorflow.detection.Detector;
import xsna.fpe0;
import xsna.hul;
import xsna.j7q;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class wm8 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wm8(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset;
        int i = this.b;
        int i2 = 1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ym8 ym8Var = (ym8) obj3;
                ww8 ww8Var = (ww8) obj2;
                rip ripVar = (rip) obj;
                uok0 uok0Var = ym8Var.g;
                try {
                    ym8Var.g(ww8Var, ripVar);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        uok0Var.e(ww8Var, ripVar);
                        ripVar.close();
                    }
                }
            case 1:
                ((gul) obj3).b.execute(new w9j(i2, (Runnable) obj2, (hul.a) obj));
                return;
            case 2:
                b9o b9oVar = (b9o) obj3;
                j7q.a aVar = (j7q.a) obj2;
                n7o n7oVar = (n7o) obj;
                L.e("Start clearing cache process");
                b9oVar.f(true);
                j7q j7qVar = j7q.this;
                Set<String> set = j7qVar.q;
                try {
                    Set<String> set2 = set;
                    ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
                    Iterator<T> it = set2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(j7qVar.h.b(Uri.parse((String) it.next())));
                    }
                    if (p4g.b(j7qVar.c().getKeys(), arrayList)) {
                        aVar.c(arrayList);
                        set.clear();
                        j7qVar.o = true;
                    } else {
                        aVar.c(Collections.singletonList(n7oVar.a.b));
                    }
                } catch (Throwable th2) {
                    L.G(ms9.b("can't clear cache ", th2));
                }
                b9oVar.f(false);
                L.e("Finish clearing cache process");
                return;
            case 3:
                ((FaceDetectionFactory) obj3).lambda$create$1((Detector) obj2, (Runnable) obj);
                return;
            case 4:
                RecyclerView.e0 e0Var = (RecyclerView.e0) obj;
                ((View) obj3).setAlpha(1.0f);
                ((rny) obj2).h(e0Var);
                rny.H(e0Var, true);
                return;
            case 5:
                ((Signaling) obj3).b((JSONObject) obj2, (String) obj);
                return;
            default:
                VideoFile videoFile = (VideoFile) obj3;
                VideoQualityTracker videoQualityTracker = (VideoQualityTracker) obj2;
                fpe0 fpe0Var = (fpe0) obj;
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem = null;
                yg5 e = b.C1208b.a().e(videoFile, null);
                VideoAutoPlay videoAutoPlay = e instanceof VideoAutoPlay ? (VideoAutoPlay) e : null;
                if (videoAutoPlay == null || (str = videoAutoPlay.K) == null) {
                    return;
                }
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_SINGLE_VIDEO;
                videoQualityTracker.getClass();
                if (epx.f(fpe0Var, fpe0.a.a)) {
                    mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset = MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset.AUTO;
                } else if (epx.f(fpe0Var, fpe0.b.a)) {
                    mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset = MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset.ECONOMY;
                } else if (epx.f(fpe0Var, fpe0.c.a)) {
                    mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset = MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset.HIGH;
                } else {
                    if (!(fpe0Var instanceof fpe0.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset = MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset.OTHER;
                }
                MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset2 = mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset;
                if (fpe0Var instanceof fpe0.d) {
                    switch (VideoQualityTracker.a.$EnumSwitchMapping$2[((fpe0.d) fpe0Var).a.ordinal()]) {
                        case 1:
                            mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem = MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem.TYPE_144P;
                            break;
                        case 2:
                            mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem = MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem.TYPE_240P;
                            break;
                        case 3:
                            mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem = MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem.TYPE_360P;
                            break;
                        case 4:
                            mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem = MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem.TYPE_480P;
                            break;
                        case 5:
                            mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem = MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem.TYPE_720P;
                            break;
                        case 6:
                            mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem = MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem.TYPE_1080P;
                            break;
                        case 7:
                            mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem = MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem.TYPE_1440P;
                            break;
                        case 8:
                            mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem = MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem.TYPE_2160P;
                            break;
                        case 9:
                            mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem = MobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem.TYPE_4320P;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                VideoQualityTracker.a(mobileOfficialAppsCoreNavStat$EventScreen, videoFile, new MobileOfficialAppsVideoStat$TypeVideoQualityChangeInPlayer(mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityPreset2, new CommonVideoStat$TypeVsidItem(str), mobileOfficialAppsCoreSettingsStat$SettingsVideoPlaybackQualityItem, null, 8, null));
                return;
        }
    }
}
