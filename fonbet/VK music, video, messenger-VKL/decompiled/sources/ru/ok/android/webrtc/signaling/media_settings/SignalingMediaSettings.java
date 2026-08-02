package ru.ok.android.webrtc.signaling.media_settings;

/* loaded from: classes9.dex */
public final class SignalingMediaSettings {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public static class Builder {
        public boolean a;
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public boolean f;

        public SignalingMediaSettings build() {
            return new SignalingMediaSettings(this);
        }

        public Builder setAnimojiEnabled(boolean z) {
            this.e = z;
            return this;
        }

        public Builder setAudioEnabled(boolean z) {
            this.b = z;
            return this;
        }

        public Builder setAudioSharingEnabled(boolean z) {
            this.f = z;
            return this;
        }

        public Builder setFastScreenSharingEnabled(boolean z) {
            this.d = z;
            return this;
        }

        public Builder setScreenSharingEnabled(boolean z) {
            this.c = z;
            return this;
        }

        public Builder setVideoEnabled(boolean z) {
            this.a = z;
            return this;
        }
    }

    public SignalingMediaSettings(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.e = builder.e;
        this.d = builder.d;
        this.f = builder.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SignalingMediaSettings.class == obj.getClass()) {
            SignalingMediaSettings signalingMediaSettings = (SignalingMediaSettings) obj;
            if (this.a == signalingMediaSettings.a && this.b == signalingMediaSettings.b && this.c == signalingMediaSettings.c && this.d == signalingMediaSettings.d && this.f == signalingMediaSettings.f && this.e == signalingMediaSettings.e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0);
    }

    public boolean isAnimojiEnabled() {
        return this.e;
    }

    public boolean isAudioEnabled() {
        return this.b;
    }

    public boolean isAudioSharingEnabled() {
        return this.f;
    }

    public boolean isFastScreenSharingEnabled() {
        return this.d;
    }

    public boolean isScreenSharingEnabled() {
        return this.c;
    }

    public boolean isVideoEnabled() {
        return this.a;
    }
}
