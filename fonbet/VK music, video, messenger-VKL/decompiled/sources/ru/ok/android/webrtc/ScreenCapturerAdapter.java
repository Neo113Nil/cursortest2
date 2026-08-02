package ru.ok.android.webrtc;

import android.annotation.TargetApi;
import android.content.Intent;
import android.media.projection.MediaProjection;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.VideoCapturer;
import xsna.odj;
import xsna.sm9;

@TargetApi(21)
/* loaded from: classes9.dex */
public class ScreenCapturerAdapter extends MediaProjection.Callback {
    public final ScreenCapturerAndroid a;
    public final RTCLog b;
    public volatile boolean c;
    public volatile boolean d;
    public int e;
    public int f;
    public int g;
    public final Executor h;

    public ScreenCapturerAdapter(Intent intent, Executor executor, @NonNull RTCLog rTCLog) {
        this.b = rTCLog;
        this.h = executor;
        this.a = new ScreenCapturerAndroid(intent, this);
    }

    public boolean changeFormat(int i, int i2) {
        return changeFormat(i, i2, 30);
    }

    public VideoCapturer getCapturer() {
        return this.a;
    }

    public int getFramerate() {
        return this.e;
    }

    public int getHeight() {
        return this.f;
    }

    public MediaProjection getMediaProjection() {
        return this.a.getMediaProjection();
    }

    public int getWidth() {
        return this.g;
    }

    public boolean isStarted() {
        return this.d;
    }

    @Override // android.media.projection.MediaProjection.Callback
    public void onStop() {
        this.b.log("ScreenCapturerAdapter", "onStop, screen capture session stopped");
        this.c = true;
        this.h.execute(new sm9(this, 13));
    }

    public void release() {
        this.b.log("ScreenCapturerAdapter", "release");
        stop();
        this.a.dispose();
    }

    public void start() {
        this.b.log("ScreenCapturerAdapter", "start");
        if (this.d) {
            this.b.log("ScreenCapturerAdapter", "Screen capturer is already started");
            return;
        }
        if (this.c) {
            this.b.log("ScreenCapturerAdapter", "Screen capture session stopped");
            return;
        }
        try {
            this.a.startCapture(this.g, this.f, this.e);
            this.d = true;
        } catch (Exception e) {
            this.b.reportException("ScreenCapturerAdapter", "screen.capture.start", new RuntimeException("Start screen capture failed", e));
        }
    }

    public void stop() {
        this.b.log("ScreenCapturerAdapter", "stop");
        if (!this.d) {
            this.b.log("ScreenCapturerAdapter", "Screen capturer is not yet started");
            return;
        }
        this.d = false;
        try {
            this.a.stopCapture();
        } catch (Exception e) {
            this.b.reportException("ScreenCapturerAdapter", "screen.capture.stop", new RuntimeException("Stop screen capture failed", e));
        }
    }

    public boolean changeFormat(int i, int i2, int i3) {
        RTCLog rTCLog = this.b;
        StringBuilder a = odj.a(i, i2, "changeFormat, ", "x", "@");
        a.append(i3);
        rTCLog.log("ScreenCapturerAdapter", a.toString());
        if (this.g == i && this.f == i2 && this.e == i3) {
            return false;
        }
        this.e = i3;
        this.f = i2;
        this.g = i;
        if (!this.d) {
            return true;
        }
        this.b.log("ScreenCapturerAdapter", "Screen capture is already started, just change capture format");
        try {
            this.a.changeCaptureFormat(i, i2, i3);
            return true;
        } catch (Exception e) {
            this.b.reportException("ScreenCapturerAdapter", "screen.capture.change.format", new RuntimeException("Cant change screen capture format", e));
            return true;
        }
    }
}
