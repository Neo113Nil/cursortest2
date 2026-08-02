package ru.ok.android.webrtc.participant.visible;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.List;
import ru.ok.android.webrtc.layout.CallDisplayLayoutItem;
import xsna.gxy0;

/* loaded from: classes9.dex */
public class VisibleParticipantsFactory {
    @NonNull
    public VisibleParticipants createFromDisplayLayout(@NonNull List<CallDisplayLayoutItem> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        for (CallDisplayLayoutItem callDisplayLayoutItem : list) {
            int i = gxy0.a[callDisplayLayoutItem.getVideoTrackParticipantKey().getType().ordinal()];
            if (i == 1) {
                hashSet.add(callDisplayLayoutItem.getVideoTrackParticipantKey().getParticipantId());
            } else if (i == 2) {
                hashSet2.add(callDisplayLayoutItem.getVideoTrackParticipantKey().getParticipantId());
            } else if (i == 3) {
                hashSet3.add(callDisplayLayoutItem.getVideoTrackParticipantKey().getParticipantId());
            }
        }
        return new VisibleParticipants(hashSet, hashSet2, hashSet3);
    }
}
