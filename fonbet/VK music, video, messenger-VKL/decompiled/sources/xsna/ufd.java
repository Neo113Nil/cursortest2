package xsna;

import android.content.Context;
import android.media.AudioManager;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeVolumeItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipVolumeAnalyticsUseCase.kt */
/* loaded from: classes17.dex */
public final class ufd {
    public final Context a;
    public final SchemeStat$TypeClipViewerItem.ScreenType b;
    public final com.vk.movika.sdk.android.defaultplayer.view.timeline.a c;
    public final bpn0 d = new bpn0(new v6(this, 14));
    public final bpn0 e = new bpn0(new y6(this, 18));

    /* compiled from: ClipVolumeAnalyticsUseCase.kt */
    public final class a implements izs<Integer, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(Integer num) {
            num.intValue();
            ufd ufdVar = ufd.this;
            ufdVar.a(new ClipViewerAnalyticsEvent.a.C0641a((SdkClipVideoFile) ufdVar.c.invoke()));
            return s3q0.a;
        }
    }

    /* compiled from: ClipVolumeAnalyticsUseCase.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileOfficialAppsClipsStat$TypeVolumeItem.EventSubtype.values().length];
            try {
                iArr[MobileOfficialAppsClipsStat$TypeVolumeItem.EventSubtype.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ufd(cro0 cro0Var, SchemeStat$TypeClipViewerItem.ScreenType screenType, com.vk.movika.sdk.android.defaultplayer.view.timeline.a aVar, androidx.lifecycle.m mVar) {
        this.a = cro0Var;
        this.b = screenType;
        this.c = aVar;
        mVar.addObserver(new tfd(this));
    }

    public final void a(ClipViewerAnalyticsEvent.a aVar) {
        MobileOfficialAppsClipsStat$TypeVolumeItem.EventSubtype eventSubtype;
        int streamVolume;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS;
        SchemeStat$TypeClipViewerItem.EventType eventType = SchemeStat$TypeClipViewerItem.EventType.AUDIO_VOLUME;
        SdkClipVideoFile a2 = aVar.a();
        MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem = a2 == null ? null : new MobileOfficialAppsClipsStat$TypeClipsClipItem(a2.o0(), a2.I0().b, a2.r());
        if (aVar instanceof ClipViewerAnalyticsEvent.a.C0641a) {
            eventSubtype = MobileOfficialAppsClipsStat$TypeVolumeItem.EventSubtype.MANUAL;
        } else {
            if (!(aVar instanceof ClipViewerAnalyticsEvent.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            eventSubtype = com.vk.libvideo.autoplay.e.b() ? MobileOfficialAppsClipsStat$TypeVolumeItem.EventSubtype.OFF : MobileOfficialAppsClipsStat$TypeVolumeItem.EventSubtype.ON;
        }
        if (b.$EnumSwitchMapping$0[eventSubtype.ordinal()] == 1) {
            streamVolume = 0;
        } else {
            bpn0 bpn0Var = this.d;
            streamVolume = (int) ((((AudioManager) bpn0Var.getValue()).getStreamVolume(3) / ((AudioManager) bpn0Var.getValue()).getStreamMaxVolume(3)) * 100);
        }
        new iof(mobileOfficialAppsCoreNavStat$EventScreen, new SchemeStat$TypeClipViewerItem(this.b, eventType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mobileOfficialAppsClipsStat$TypeClipsClipItem, null, new MobileOfficialAppsClipsStat$TypeVolumeItem(eventSubtype, Integer.valueOf(streamVolume)), 402653180, null)).q();
    }
}
