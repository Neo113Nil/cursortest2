package ru.ok.android.webrtc.enumerator.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.enumerator.camera.CameraInfo;
import ru.ok.android.webrtc.enumerator.camera.CameraParams;
import xsna.epx;

/* loaded from: classes9.dex */
public abstract class BaseCameraEnumeratorHandler implements CameraEnumeratorHandler {
    public final RTCLog a;
    public final String b = getClass().getSimpleName();

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraParams.Facing.values().length];
            try {
                iArr[CameraParams.Facing.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraParams.Facing.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CameraParams.Facing.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BaseCameraEnumeratorHandler(RTCLog rTCLog) {
        this.a = rTCLog;
    }

    @Override // org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper, CameraVideoCapturer.CameraConfigurationProvider cameraConfigurationProvider) {
        try {
            return getEnumerator().createCapturer(str, cameraEventsHandler, captureFormatHelper, cameraConfigurationProvider);
        } catch (Exception e) {
            RTCLog rTCLog = this.a;
            String str2 = this.b;
            String message = e.getMessage();
            if (message == null) {
                message = "camera error";
            }
            rTCLog.reportException(str2, message, e);
            return null;
        }
    }

    @Override // ru.ok.android.webrtc.enumerator.base.CameraEnumeratorHandler
    public CameraInfo getCameraInfo(String str) {
        Object obj;
        Iterator<T> it = getCameraInfoList().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((CameraInfo) obj).getCameraId(), str)) {
                break;
            }
        }
        return (CameraInfo) obj;
    }

    @Override // ru.ok.android.webrtc.enumerator.base.CameraEnumeratorHandler
    public List<CameraInfo> getCameraInfoList() {
        ArrayList arrayList = new ArrayList();
        for (String str : getDeviceNames()) {
            List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = getEnumerator().getSupportedFormats(str);
            arrayList.add(isFrontFacing(str) ? new CameraInfo.Front(str, supportedFormats) : isBackFacing(str) ? new CameraInfo.Back(str, supportedFormats) : new CameraInfo.Unknown(str, supportedFormats));
        }
        return arrayList;
    }

    @Override // ru.ok.android.webrtc.enumerator.base.CameraEnumeratorHandler, org.webrtc.CameraEnumerator
    public String[] getDeviceNames() {
        return getEnumerator().getDeviceNames();
    }

    public abstract CameraEnumerator getEnumerator();

    @Override // ru.ok.android.webrtc.enumerator.base.CameraEnumeratorHandler
    public CameraInfo getFirstCamera(CameraParams.Facing facing) {
        List<CameraInfo> cameraInfoList = getCameraInfoList();
        int i = WhenMappings.$EnumSwitchMapping$0[facing.ordinal()];
        Object obj = null;
        if (i == 1) {
            Iterator<T> it = cameraInfoList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((CameraInfo) next) instanceof CameraInfo.Front) {
                    obj = next;
                    break;
                }
            }
            return (CameraInfo) obj;
        }
        if (i == 2) {
            Iterator<T> it2 = cameraInfoList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((CameraInfo) next2) instanceof CameraInfo.Back) {
                    obj = next2;
                    break;
                }
            }
            return (CameraInfo) obj;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator<T> it3 = cameraInfoList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            if (((CameraInfo) next3) instanceof CameraInfo.Unknown) {
                obj = next3;
                break;
            }
        }
        return (CameraInfo) obj;
    }

    @Override // ru.ok.android.webrtc.enumerator.base.CameraEnumeratorHandler, org.webrtc.CameraEnumerator
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getEnumerator().getSupportedFormats(str);
    }

    public final String getTAG() {
        return this.b;
    }

    @Override // ru.ok.android.webrtc.enumerator.base.CameraEnumeratorHandler, org.webrtc.CameraEnumerator
    public boolean isBackFacing(String str) {
        return getEnumerator().isBackFacing(str);
    }

    @Override // ru.ok.android.webrtc.enumerator.base.CameraEnumeratorHandler, org.webrtc.CameraEnumerator
    public boolean isFrontFacing(String str) {
        return getEnumerator().isFrontFacing(str);
    }

    @Override // ru.ok.android.webrtc.enumerator.base.CameraEnumeratorHandler, org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CameraConfigurationProvider cameraConfigurationProvider) {
        try {
            return getEnumerator().createCapturer(str, cameraEventsHandler, cameraConfigurationProvider);
        } catch (Exception e) {
            RTCLog rTCLog = this.a;
            String str2 = this.b;
            String message = e.getMessage();
            if (message == null) {
                message = "camera error";
            }
            rTCLog.reportException(str2, message, e);
            return null;
        }
    }
}
