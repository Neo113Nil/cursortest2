package ru.ok.android.webrtc.protocol.exceptions;

import androidx.annotation.Nullable;
import ru.ok.android.webrtc.protocol.RtcException;

/* loaded from: classes9.dex */
public class RtcCommandException extends RtcException {
    public final Long a;
    public final boolean b;

    public RtcCommandException(@Nullable Long l, boolean z) {
        this(l, z, null);
    }

    @Nullable
    public Long getCommandId() {
        return this.a;
    }

    public boolean isRecoverable() {
        return this.b;
    }

    public RtcCommandException(@Nullable Long l, boolean z, @Nullable Throwable th) {
        super(th);
        this.a = l;
        this.b = z;
    }
}
