package ru.ok.android.webrtc.signaling.record;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.command.SignalingCommand;

/* loaded from: classes9.dex */
public final class RecordCommandParamsCreator {
    public static /* synthetic */ SignalingCommand createStartRecordParams$default(RecordCommandParamsCreator recordCommandParamsCreator, boolean z, String str, Long l, SessionRoomId sessionRoomId, Long l2, String str2, CharSequence charSequence, CharSequence charSequence2, boolean z2, int i, Object obj) {
        return recordCommandParamsCreator.createStartRecordParams(z, str, l, sessionRoomId, l2, str2, charSequence, charSequence2, (i & 256) != 0 ? false : z2);
    }

    public static /* synthetic */ SignalingCommand createStopRecordParams$default(RecordCommandParamsCreator recordCommandParamsCreator, SessionRoomId sessionRoomId, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return recordCommandParamsCreator.createStopRecordParams(sessionRoomId, z, z2);
    }

    public final SignalingCommand createStartRecordParams(boolean z, String str, Long l, SessionRoomId sessionRoomId, Long l2, String str2, CharSequence charSequence, CharSequence charSequence2) {
        return createStartRecordParams$default(this, z, str, l, sessionRoomId, l2, str2, charSequence, charSequence2, false, 256, null);
    }

    public final SignalingCommand createStopRecordParams(SessionRoomId sessionRoomId, boolean z, boolean z2) {
        return SignalingProtocol.createStopRecord(sessionRoomId, z, z2);
    }

    public final SignalingCommand createStartRecordParams(boolean z, String str, Long l, SessionRoomId sessionRoomId, Long l2, String str2, CharSequence charSequence, CharSequence charSequence2, boolean z2) {
        Calendar calendar = Calendar.getInstance();
        return SignalingProtocol.createStartRecord(l, charSequence == null ? String.format(Locale.getDefault(), "%4d-%2d-%2d %2d:%2d:%2d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13))}, 6)) : charSequence, charSequence2, str, l2, str2, z, sessionRoomId, z2);
    }
}
