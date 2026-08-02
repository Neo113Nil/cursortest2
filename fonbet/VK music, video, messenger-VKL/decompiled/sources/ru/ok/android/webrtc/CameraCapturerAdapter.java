package ru.ok.android.webrtc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.VideoCapturer;
import ru.ok.android.webrtc.OKCameraCapturer;
import ru.ok.android.webrtc.camera.PatchedVideoCapturer;
import ru.ok.android.webrtc.enumerator.base.CameraEnumeratorHandler;
import ru.ok.android.webrtc.enumerator.camera.CameraInfo;
import ru.ok.android.webrtc.enumerator.camera.CameraParams;
import ru.ok.android.webrtc.stat.camera.CameraStatProvider;
import ru.ok.android.webrtc.utils.MiscHelper;
import xsna.cgn;
import xsna.efz;
import xsna.go9;
import xsna.odj;

/* loaded from: classes9.dex */
public class CameraCapturerAdapter {
    public final ArrayList a;
    public final ArrayList b;
    public final OKCameraCapturer c;
    public final CameraEnumeratorHandler d;
    public final RTCLog e;
    public final CopyOnWriteArraySet f;
    public final Object g;
    public volatile String h;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public int l;
    public int m;
    public int n;

    public CameraCapturerAdapter(@NonNull OKCameraCapturer.Factory factory, CameraVideoCapturer cameraVideoCapturer, @NonNull CameraEnumeratorHandler cameraEnumeratorHandler, @NonNull List<CameraEnumerationAndroid.CaptureFormat> list, @NonNull List<CameraEnumerationAndroid.CaptureFormat> list2, boolean z, @NonNull RTCLog rTCLog) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        this.f = new CopyOnWriteArraySet();
        this.g = new Object();
        this.h = null;
        this.e = rTCLog;
        this.c = factory.create(cameraVideoCapturer);
        this.d = cameraEnumeratorHandler;
        arrayList.addAll(list);
        arrayList2.addAll(list2);
        this.i = z;
    }

    public void addEventListener(EventListener eventListener) {
        this.f.add(eventListener);
    }

    public void changeFormat(int i, int i2, int i3) {
        int round = i3 < 1000 ? i3 : Math.round(i3 / 1000.0f);
        if (round != i3) {
            String a = efz.a(i3, round, "Unexpected frame rate requested: ", ", truncated to ");
            this.e.reportException("CameraCapturerAdapter", a, new IllegalArgumentException(a));
        }
        RTCLog rTCLog = this.e;
        StringBuilder a2 = odj.a(i, i2, "changeFormat, ", "x", "@");
        a2.append(round);
        rTCLog.log("CameraCapturerAdapter", a2.toString());
        if (this.n == i && this.m == i2 && this.l == round) {
            return;
        }
        this.l = round;
        this.m = i2;
        this.n = i;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onCaptureFormatChanged(this, i, i2);
        }
        if (this.k) {
            this.e.log("CameraCapturerAdapter", "Camera is already started, just change capture format");
            this.c.instance.changeCaptureFormat(i, i2, round);
        }
    }

    public CameraStatProvider getCameraStatProvider() {
        CameraVideoCapturer cameraVideoCapturer = this.c.instance;
        if (cameraVideoCapturer instanceof PatchedVideoCapturer) {
            return ((PatchedVideoCapturer) cameraVideoCapturer).getCameraStatProvider();
        }
        return null;
    }

    public VideoCapturer getCapturer() {
        return this.c.instance;
    }

    public int getFramerate() {
        return this.l;
    }

    public int getHeight() {
        return this.m;
    }

    public int getWidth() {
        return this.n;
    }

    public void handleCameraSwitchDone(String str, boolean z) {
        this.e.log("CameraCapturerAdapter", "onCameraSwitchDone, new camera: " + str + ", is front: " + z);
        synchronized (this.g) {
            this.h = str;
            this.i = z;
            this.j = false;
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onCameraCapturerSwitchDone(this, true);
        }
    }

    public boolean isFrontCamera() {
        return this.i;
    }

    public boolean isStarted() {
        return this.k;
    }

    public void release() {
        this.e.log("CameraCapturerAdapter", "release");
        this.f.clear();
        stop();
        this.c.instance.dispose();
    }

    public void start() {
        boolean z;
        ArrayList arrayList;
        synchronized (this.g) {
            try {
                z = this.i;
                arrayList = z ? this.a : this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e.log("CameraCapturerAdapter", "select capture format for ".concat(z ? "front camera" : "back camera"));
        CameraEnumerationAndroid.CaptureFormat selectFormat = MiscHelper.selectFormat(arrayList, z);
        int round = Math.round(selectFormat.framerate.max / 1000.0f);
        int i = (round <= 0 || round > 60) ? 30 : round;
        RTCLog rTCLog = this.e;
        StringBuilder sb = new StringBuilder("capture format selected, size: ");
        sb.append(selectFormat.width);
        sb.append("x");
        cgn.a(selectFormat.height, round, ", frame rate: ", ", actual frame rate: ", sb);
        sb.append(i);
        rTCLog.log("CameraCapturerAdapter", sb.toString());
        changeFormat(selectFormat.width, selectFormat.height, i);
        startImpl();
    }

    public void startImpl() {
        this.e.log("CameraCapturerAdapter", "start");
        if (this.k) {
            this.e.log("CameraCapturerAdapter", "Camera is already started");
            return;
        }
        if (this.n == 0 || this.m == 0 || this.l == 0) {
            this.e.log("CameraCapturerAdapter", "start camera capture invalid arguments: " + this.n + "x" + this.m + "@" + this.l);
        }
        try {
            this.c.instance.startCapture(this.n, this.m, this.l);
            this.k = true;
        } catch (RuntimeException e) {
            this.e.reportException("CameraCapturerAdapter", "Camera start was interrupted", e);
            Thread.currentThread().interrupt();
        }
    }

    public void stop() {
        this.e.log("CameraCapturerAdapter", "stop");
        if (!this.k) {
            this.e.log("CameraCapturerAdapter", "Camera is already stopped");
            return;
        }
        try {
            this.c.instance.stopCapture();
            this.k = false;
        } catch (InterruptedException e) {
            this.e.reportException("CameraCapturerAdapter", "Camera stop was interrupted", e);
            Thread.currentThread().interrupt();
        }
    }

    public void switchCamera(@Nullable CameraParams cameraParams) {
        CameraInfo firstCamera;
        this.e.log("CameraCapturerAdapter", "switchCamera");
        if (!this.k) {
            this.e.log("CameraCapturerAdapter", "Camera is not started");
            return;
        }
        if (this.j) {
            synchronized (this.g) {
                try {
                    if (this.j) {
                        this.e.log("CameraCapturerAdapter", "Camera switch is pending");
                        return;
                    }
                    this.j = true;
                } finally {
                }
            }
        }
        if (cameraParams == null) {
            firstCamera = this.d.getFirstCamera(this.i ? CameraParams.Facing.BACK : CameraParams.Facing.FRONT);
        } else {
            firstCamera = this.d.getFirstCamera(cameraParams.getFacing());
        }
        if (firstCamera == null || Objects.equals(this.h, firstCamera.getCameraId())) {
            return;
        }
        final String cameraId = firstCamera.getCameraId();
        this.c.instance.switchCamera(new CameraVideoCapturer.CameraSwitchHandler() { // from class: ru.ok.android.webrtc.CameraCapturerAdapter.1
            @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
            public void onCameraSwitchDone(boolean z) {
                CameraCapturerAdapter.this.handleCameraSwitchDone(cameraId, z);
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
            public void onCameraSwitchError(String str) {
                CameraCapturerAdapter cameraCapturerAdapter = CameraCapturerAdapter.this;
                cameraCapturerAdapter.e.reportException("CameraCapturerAdapter", "Error on camera switch", new IllegalStateException(go9.b("onCameraSwitchError, ", str)));
                synchronized (cameraCapturerAdapter.g) {
                    cameraCapturerAdapter.j = false;
                }
                Iterator it = cameraCapturerAdapter.f.iterator();
                while (it.hasNext()) {
                    ((EventListener) it.next()).onCameraCapturerSwitchDone(cameraCapturerAdapter, false);
                }
            }
        }, cameraId);
    }

    public interface EventListener {
        void onCameraCapturerStreamStarted();

        void onCameraCapturerSwitchDone(CameraCapturerAdapter cameraCapturerAdapter, boolean z);

        default void onCaptureFormatChanged(CameraCapturerAdapter cameraCapturerAdapter, int i, int i2) {
        }
    }
}
