package xsna;

import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.sj9;

/* compiled from: CameraParametersImpl.kt */
/* loaded from: classes16.dex */
public final class tj9 implements sj9 {
    public final Camera.Parameters a;
    public final ol9 b;
    public final int c;

    public tj9(Camera.Parameters parameters, ol9 ol9Var, int i) {
        this.a = parameters;
        this.b = ol9Var;
        this.c = i;
    }

    public static ArrayList d(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Camera.Area(((sj9.a) it.next()).a, 1));
        }
        return arrayList;
    }

    @Override // xsna.sj9
    public final Size[] a() {
        List<Camera.Size> supportedPictureSizes;
        ol9 ol9Var = this.b;
        if (ol9Var != null) {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ol9Var.a.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                return streamConfigurationMap.getOutputSizes(256);
            }
            return null;
        }
        Camera.Parameters parameters = this.a;
        if (parameters == null || (supportedPictureSizes = parameters.getSupportedPictureSizes()) == null) {
            return null;
        }
        int size = supportedPictureSizes.size();
        Size[] sizeArr = new Size[size];
        for (int i = 0; i < size; i++) {
            sizeArr[i] = new Size(supportedPictureSizes.get(i).width, supportedPictureSizes.get(i).height);
        }
        return sizeArr;
    }

    @Override // xsna.sj9
    public final String b() {
        String focusMode;
        Camera.Parameters parameters = this.a;
        return (parameters == null || (focusMode = parameters.getFocusMode()) == null) ? "auto" : focusMode;
    }

    @Override // xsna.sj9
    public final List<String> c() {
        Camera.Parameters parameters = this.a;
        if (parameters != null) {
            return parameters.getSupportedFocusModes();
        }
        if (this.b == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("auto");
        arrayList.add("infinity");
        arrayList.add("fixed");
        arrayList.add("edof");
        arrayList.add("continuous-video");
        arrayList.add("continuous-picture");
        return arrayList;
    }

    public final int e() {
        Camera.Parameters parameters = this.a;
        return parameters != null ? parameters.getMaxNumFocusAreas() : this.b != null ? 2 : 0;
    }

    public final int f() {
        Camera.Parameters parameters = this.a;
        if (parameters != null) {
            return parameters.getMaxNumMeteringAreas();
        }
        return 0;
    }

    public final int g() {
        Float f;
        Camera.Parameters parameters = this.a;
        if (parameters != null) {
            return parameters.getMaxZoom();
        }
        ol9 ol9Var = this.b;
        if (ol9Var == null || (f = (Float) ol9Var.a.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)) == null) {
            return 0;
        }
        return ((int) f.floatValue()) * 10;
    }

    @Override // xsna.sj9
    public final String get(String str) {
        Camera.Parameters parameters = this.a;
        if (parameters != null) {
            return parameters.get(str);
        }
        return null;
    }

    public final Size h() {
        Camera.Parameters parameters = this.a;
        if (parameters != null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                return new Size(previewSize.width, previewSize.height);
            }
            return null;
        }
        ol9 ol9Var = this.b;
        if (ol9Var != null) {
            return ol9Var.c;
        }
        return null;
    }

    public final Size i() {
        Camera.Size previewSize;
        Camera.Parameters parameters = this.a;
        if (parameters != null && (previewSize = parameters.getPreviewSize()) != null) {
            return new Size(previewSize.width, previewSize.height);
        }
        ol9 ol9Var = this.b;
        if (ol9Var != null) {
            return ol9Var.b;
        }
        return null;
    }

    public final List<int[]> j() {
        Camera.Parameters parameters = this.a;
        if (parameters != null) {
            return parameters.getSupportedPreviewFpsRange();
        }
        ol9 ol9Var = this.b;
        if (ol9Var == null) {
            return null;
        }
        Range[] rangeArr = (Range[]) ol9Var.a.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        ArrayList arrayList = new ArrayList();
        if (rangeArr == null) {
            return null;
        }
        wk3 wk3Var = new wk3(rangeArr);
        while (wk3Var.hasNext()) {
            Range range = (Range) wk3Var.next();
            arrayList.add(new int[]{((Number) range.getLower()).intValue(), ((Number) range.getUpper()).intValue()});
        }
        return arrayList;
    }

    public final Size[] k() {
        List<Camera.Size> supportedPreviewSizes;
        ol9 ol9Var = this.b;
        if (ol9Var != null) {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ol9Var.a.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                return streamConfigurationMap.getOutputSizes(35);
            }
            return null;
        }
        Camera.Parameters parameters = this.a;
        if (parameters == null || (supportedPreviewSizes = parameters.getSupportedPreviewSizes()) == null) {
            return null;
        }
        int size = supportedPreviewSizes.size();
        Size[] sizeArr = new Size[size];
        for (int i = 0; i < size; i++) {
            sizeArr[i] = new Size(supportedPreviewSizes.get(i).width, supportedPreviewSizes.get(i).height);
        }
        return sizeArr;
    }

    public final boolean l() {
        int[] iArr;
        Camera.Parameters parameters = this.a;
        if (parameters == null || !parameters.isVideoStabilizationSupported()) {
            ol9 ol9Var = this.b;
            if (ol9Var != null && (iArr = (int[]) ol9Var.a.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null) {
                for (int i : iArr) {
                    if (i != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean m() {
        Camera.Parameters parameters = this.a;
        return parameters != null ? parameters.isZoomSupported() : this.b != null;
    }

    public final void n(String str) {
        String str2;
        List<String> supportedFlashModes;
        Camera.Parameters parameters = this.a;
        if (parameters != null) {
            List<String> supportedFlashModes2 = parameters.getSupportedFlashModes();
            if (supportedFlashModes2 == null || !supportedFlashModes2.contains(str)) {
                str2 = "on";
                if ((!str.equals("on") && !str.equals("torch")) || (supportedFlashModes = parameters.getSupportedFlashModes()) == null || !supportedFlashModes.contains("on")) {
                    str2 = "off";
                }
            } else {
                str2 = str;
            }
            parameters.setFlashMode(str2);
        }
        ol9 ol9Var = this.b;
        if (ol9Var != null) {
            ol9Var.g = str;
        }
    }

    public final void o(String str) {
        Camera.Parameters parameters = this.a;
        if (parameters != null) {
            parameters.setFocusMode(str);
        }
    }

    public final void p(int i) {
        Camera.Parameters parameters = this.a;
        if (parameters != null) {
            parameters.setRotation(i);
        }
    }

    public final void q(boolean z) {
        Camera.Parameters parameters = this.a;
        if (parameters != null) {
            parameters.setVideoStabilization(z);
        }
        ol9 ol9Var = this.b;
        if (ol9Var != null) {
            ol9Var.h = z ? 1 : 0;
        }
    }

    public final void r(int i) {
        Camera.Parameters parameters = this.a;
        if (parameters != null) {
            parameters.setZoom(i);
        }
        ol9 ol9Var = this.b;
        if (ol9Var != null) {
            ol9Var.f = i;
        }
    }
}
