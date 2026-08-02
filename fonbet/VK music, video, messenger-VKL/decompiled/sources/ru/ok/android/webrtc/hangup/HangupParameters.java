package ru.ok.android.webrtc.hangup;

import androidx.annotation.Nullable;
import ru.ok.android.webrtc.HangupReason;

/* loaded from: classes9.dex */
public class HangupParameters {
    public final HangupReason a;
    public final boolean b;

    public static class Builder {
        public HangupReason a;
        public boolean b;

        public HangupParameters build() {
            return new HangupParameters(this.a, this.b);
        }

        public Builder setEndCallForAllThroughExternalApiCalled(boolean z) {
            this.b = z;
            return this;
        }

        public Builder setReason(@Nullable HangupReason hangupReason) {
            this.a = hangupReason;
            return this;
        }
    }

    public HangupParameters(HangupReason hangupReason, boolean z) {
        this.a = hangupReason;
        this.b = z;
    }

    @Nullable
    public HangupReason getReason() {
        return this.a;
    }

    public boolean isEndCallForAllThroughExternalApiCalled() {
        return this.b;
    }
}
