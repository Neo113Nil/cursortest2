package ru.ok.android.webrtc.protocol;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.ok.android.webrtc.protocol.exceptions.RtcNotificationSerializeException;

/* loaded from: classes9.dex */
public interface RtcNotificationSerializer {
    @Nullable
    RtcNotification deserialize(@NonNull byte[] bArr, @NonNull RtcFormat rtcFormat) throws RtcNotificationSerializeException;
}
