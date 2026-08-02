package ru.ok.android.webrtc.protocol.exceptions;

import androidx.annotation.NonNull;
import java.util.Map;

/* loaded from: classes9.dex */
public class RtcCommandExecutionException extends RtcCommandException {
    public final String c;
    public final Map d;

    public RtcCommandExecutionException(@NonNull Long l, boolean z, @NonNull String str, @NonNull Map<String, String> map) {
        super(l, z);
        this.c = str;
        this.d = map;
    }

    @NonNull
    public String getError() {
        return this.c;
    }

    @NonNull
    public Map<String, String> getExtra() {
        return this.d;
    }
}
