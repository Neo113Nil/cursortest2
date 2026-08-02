package ru.ok.android.webrtc.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes9.dex */
public class HangupInfo {

    @Nullable
    public final String errorCode;

    @NonNull
    public final Set<HangupError> errorSet;

    @Nullable
    public final String explanationHtml;

    public enum HangupError {
        ONE_VIDEO_TIMEOUT(1),
        RINGING_TIMEOUT(2);

        public final int a;

        HangupError(int i) {
            this.a = i;
        }

        @Nullable
        public static HangupError fromCode(int i) {
            for (HangupError hangupError : values()) {
                if (i == hangupError.a) {
                    return hangupError;
                }
            }
            return null;
        }
    }

    public HangupInfo(@Nullable Set<HangupError> set, @Nullable String str, @Nullable String str2) {
        this.errorSet = set == null ? Collections.EMPTY_SET : set;
        this.explanationHtml = str;
        this.errorCode = str2;
    }

    public boolean shouldSuggestReconnect() {
        return this.errorSet.contains(HangupError.ONE_VIDEO_TIMEOUT);
    }
}
