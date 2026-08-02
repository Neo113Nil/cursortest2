package ru.ok.android.webrtc.enumerator.camera;

import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes9.dex */
public abstract class CameraInfo {
    public final String a;
    public final List b;

    public static final class Back extends CameraInfo {
        public final String c;
        public final List d;

        public Back(String str, List<? extends CameraEnumerationAndroid.CaptureFormat> list) {
            super(str, list, null);
            this.c = str;
            this.d = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Back copy$default(Back back, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = back.c;
            }
            if ((i & 2) != 0) {
                list = back.d;
            }
            return back.copy(str, list);
        }

        public final String component1() {
            return this.c;
        }

        public final List<CameraEnumerationAndroid.CaptureFormat> component2() {
            return this.d;
        }

        public final Back copy(String str, List<? extends CameraEnumerationAndroid.CaptureFormat> list) {
            return new Back(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Back)) {
                return false;
            }
            Back back = (Back) obj;
            return epx.f(this.c, back.c) && epx.f(this.d, back.d);
        }

        @Override // ru.ok.android.webrtc.enumerator.camera.CameraInfo
        public String getCameraId() {
            return this.c;
        }

        @Override // ru.ok.android.webrtc.enumerator.camera.CameraInfo
        public List<CameraEnumerationAndroid.CaptureFormat> getCameraParameterList() {
            return this.d;
        }

        public int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public String toString() {
            return "Back(cameraId=" + this.c + ", cameraParameterList=" + this.d + ")";
        }
    }

    public static final class Front extends CameraInfo {
        public final String c;
        public final List d;

        public Front(String str, List<? extends CameraEnumerationAndroid.CaptureFormat> list) {
            super(str, list, null);
            this.c = str;
            this.d = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Front copy$default(Front front, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = front.c;
            }
            if ((i & 2) != 0) {
                list = front.d;
            }
            return front.copy(str, list);
        }

        public final String component1() {
            return this.c;
        }

        public final List<CameraEnumerationAndroid.CaptureFormat> component2() {
            return this.d;
        }

        public final Front copy(String str, List<? extends CameraEnumerationAndroid.CaptureFormat> list) {
            return new Front(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Front)) {
                return false;
            }
            Front front = (Front) obj;
            return epx.f(this.c, front.c) && epx.f(this.d, front.d);
        }

        @Override // ru.ok.android.webrtc.enumerator.camera.CameraInfo
        public String getCameraId() {
            return this.c;
        }

        @Override // ru.ok.android.webrtc.enumerator.camera.CameraInfo
        public List<CameraEnumerationAndroid.CaptureFormat> getCameraParameterList() {
            return this.d;
        }

        public int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public String toString() {
            return "Front(cameraId=" + this.c + ", cameraParameterList=" + this.d + ")";
        }
    }

    public static final class Unknown extends CameraInfo {
        public final String c;
        public final List d;

        public Unknown(String str, List<? extends CameraEnumerationAndroid.CaptureFormat> list) {
            super(str, list, null);
            this.c = str;
            this.d = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.c;
            }
            if ((i & 2) != 0) {
                list = unknown.d;
            }
            return unknown.copy(str, list);
        }

        public final String component1() {
            return this.c;
        }

        public final List<CameraEnumerationAndroid.CaptureFormat> component2() {
            return this.d;
        }

        public final Unknown copy(String str, List<? extends CameraEnumerationAndroid.CaptureFormat> list) {
            return new Unknown(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unknown)) {
                return false;
            }
            Unknown unknown = (Unknown) obj;
            return epx.f(this.c, unknown.c) && epx.f(this.d, unknown.d);
        }

        @Override // ru.ok.android.webrtc.enumerator.camera.CameraInfo
        public String getCameraId() {
            return this.c;
        }

        @Override // ru.ok.android.webrtc.enumerator.camera.CameraInfo
        public List<CameraEnumerationAndroid.CaptureFormat> getCameraParameterList() {
            return this.d;
        }

        public int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public String toString() {
            return "Unknown(cameraId=" + this.c + ", cameraParameterList=" + this.d + ")";
        }
    }

    public CameraInfo(String str, List list, zcl zclVar) {
        this.a = str;
        this.b = list;
    }

    public String getCameraId() {
        return this.a;
    }

    public List<CameraEnumerationAndroid.CaptureFormat> getCameraParameterList() {
        return this.b;
    }
}
