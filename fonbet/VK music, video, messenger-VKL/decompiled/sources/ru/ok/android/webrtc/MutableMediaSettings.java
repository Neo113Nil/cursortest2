package ru.ok.android.webrtc;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes9.dex */
public final class MutableMediaSettings {
    public final CopyOnWriteArraySet a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public PushedMediaSettingsParams h;
    public boolean i;

    public interface EventListener {
        void onMediaSettingsChanged(@NonNull MutableMediaSettings mutableMediaSettings);
    }

    public MutableMediaSettings() {
        this(true, false, false, false);
    }

    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onMediaSettingsChanged(this);
        }
    }

    public void addEventListener(EventListener eventListener) {
        this.a.add(eventListener);
    }

    public void enableAnimoji(boolean z) {
        if (this.g == z) {
            return;
        }
        this.g = z;
        a();
    }

    public void enableAudio(boolean z) {
        if (this.e != z) {
            this.e = z;
            a();
        }
    }

    public boolean enableAudioSharing(boolean z) {
        if (!this.b) {
            return false;
        }
        this.d = z;
        a();
        return true;
    }

    public boolean enableScreenCapture(boolean z, boolean z2) {
        if (this.b == z) {
            return false;
        }
        this.b = z;
        this.c = z2;
        a();
        return true;
    }

    public void enableVideo(boolean z) {
        if (this.f != z) {
            this.f = z;
            a();
        }
    }

    public boolean isAnimojiEnabled() {
        return this.g;
    }

    public boolean isAudioEnabled() {
        return this.e;
    }

    public boolean isAudioSharingEnabled() {
        return this.d;
    }

    public boolean isFastScreenCaptureEnabled() {
        return this.c;
    }

    public boolean isPushed() {
        return this.i;
    }

    public boolean isScreenCaptureEnabled() {
        return this.b;
    }

    public boolean isVideoEnabled() {
        return this.f;
    }

    public void popVideoCaptureEnablity() {
        this.b = this.h.getPushedScreenCaptureEnabled();
        this.f = this.h.getPushedCameraCaptureEnabled();
        this.c = this.h.getPushedFastScreenCaptureEnabled();
        this.d = this.h.getPushedAudioSharingEnabled();
        this.i = false;
        a();
    }

    public void pushVideoCaptureEnablity() {
        this.h = new PushedMediaSettingsParams(this.b, this.c, this.f, this.d);
        this.i = true;
    }

    public void redeliverActiveSettings() {
        a();
    }

    public void removeEventListener(EventListener eventListener) {
        this.a.remove(eventListener);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaSettings{");
        if (this.e) {
            sb.append("|audio");
        }
        if (this.f) {
            sb.append("|video");
        }
        if (this.b) {
            sb.append("|screen capture");
        }
        if (this.g) {
            sb.append("|animoji");
        }
        return sb.toString();
    }

    public boolean updateBy(@NonNull MutableMediaSettings mutableMediaSettings) {
        boolean z = this.e;
        boolean z2 = mutableMediaSettings.e;
        if (z == z2 && this.f == mutableMediaSettings.f && this.b == mutableMediaSettings.b && this.g == mutableMediaSettings.g && this.c == mutableMediaSettings.c && this.d == mutableMediaSettings.d) {
            return false;
        }
        this.e = z2;
        this.f = mutableMediaSettings.f;
        this.b = mutableMediaSettings.b;
        this.g = mutableMediaSettings.g;
        this.c = mutableMediaSettings.c;
        this.d = mutableMediaSettings.d;
        a();
        return true;
    }

    public MutableMediaSettings(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = new CopyOnWriteArraySet();
        this.e = z;
        this.f = z2;
        this.b = z3;
        this.g = z4;
    }
}
