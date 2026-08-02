package ru.ok.android.webrtc;

import ru.ok.android.webrtc.protocol.RtcNotification;
import ru.ok.android.webrtc.protocol.RtcNotificationReceiver;
import ru.ok.android.webrtc.protocol.notifications.AudioActivityNotification;
import ru.ok.android.webrtc.protocol.notifications.IdMappingNotification;
import ru.ok.android.webrtc.protocol.notifications.NetworkStatusNotification;
import ru.ok.android.webrtc.protocol.notifications.SpeakerChangedNotification;
import ru.ok.android.webrtc.protocol.notifications.StalledParticipantsNotification;
import ru.ok.android.webrtc.protocol.notifications.VideoQualityUpdateNotification;
import ru.ok.android.webrtc.protocol.notifications.WatchTogetherUpdateNotification;

/* loaded from: classes9.dex */
public final class b implements RtcNotificationReceiver.Listener {
    public final /* synthetic */ Call a;

    public b(Call call) {
        this.a = call;
    }

    @Override // ru.ok.android.webrtc.protocol.RtcNotificationReceiver.Listener
    public final void onNotificationReceived(RtcNotification rtcNotification) {
        Call call = this.a;
        call.getClass();
        if (rtcNotification instanceof StalledParticipantsNotification) {
            call.w0 = ((StalledParticipantsNotification) rtcNotification).participantIds;
            return;
        }
        if (rtcNotification instanceof AudioActivityNotification) {
            call.c0.setTalkingParticipants(((AudioActivityNotification) rtcNotification).participantIds);
            return;
        }
        if (rtcNotification instanceof SpeakerChangedNotification) {
            call.c0.setPrimarySpeakerId(((SpeakerChangedNotification) rtcNotification).speaker);
            return;
        }
        if (rtcNotification instanceof IdMappingNotification) {
            call.p0.update(((IdMappingNotification) rtcNotification).mapping);
            return;
        }
        if (rtcNotification instanceof VideoQualityUpdateNotification) {
            call.I0.getVideoQualityUpdateHandler().onVideoQualityUpdate(rtcNotification);
        } else if (rtcNotification instanceof NetworkStatusNotification) {
            call.c0.setNetworkStatus(((NetworkStatusNotification) rtcNotification).networkStatus, call.params.getBadNetworkIndicatorConfig());
        } else if (rtcNotification instanceof WatchTogetherUpdateNotification) {
            call.b(CallEvents.WATCH_TOGETHER_UPDATE, ((WatchTogetherUpdateNotification) rtcNotification).getUpdates());
        }
    }
}
