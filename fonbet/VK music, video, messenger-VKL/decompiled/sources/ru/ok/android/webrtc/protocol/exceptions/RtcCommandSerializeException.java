package ru.ok.android.webrtc.protocol.exceptions;

import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public class RtcCommandSerializeException extends RtcCommandException {
    public RtcCommandSerializeException(@Nullable Long l, boolean z) {
        super(l, z);
    }

    public RtcCommandSerializeException(@Nullable Long l, boolean z, @Nullable Throwable th) {
        super(l, z, th);
    }
}
