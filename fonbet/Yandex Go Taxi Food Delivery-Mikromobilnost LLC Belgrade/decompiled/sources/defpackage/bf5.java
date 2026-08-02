package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Pair;
import android.util.Size;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightPreviewExtenderImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import androidx.camera.extensions.internal.sessionprocessor.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class bf5 implements b731 {
    public static final ArrayList A;
    public final PreviewExtenderImpl b;
    public final ImageCaptureExtenderImpl c;
    public ar7 w;
    public String x;
    public CameraCharacteristics y;
    public final fyo a = new fyo();
    public final pa4 z = new pa4();

    static {
        CaptureRequest.Key key;
        ArrayList arrayList = new ArrayList(Arrays.asList(CaptureRequest.SCALER_CROP_REGION, CaptureRequest.CONTROL_AF_MODE, CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AF_REGIONS, CaptureRequest.CONTROL_AE_REGIONS, CaptureRequest.CONTROL_AWB_REGIONS, CaptureRequest.CONTROL_AE_MODE, CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, CaptureRequest.FLASH_MODE, CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION));
        A = arrayList;
        if (Build.VERSION.SDK_INT >= 30) {
            key = CaptureRequest.CONTROL_ZOOM_RATIO;
            arrayList.add(key);
        }
    }

    public bf5() {
        this.b = null;
        this.c = null;
        try {
            this.b = new NightPreviewExtenderImpl();
            this.c = new NightImageCaptureExtenderImpl();
        } catch (NoClassDefFoundError unused) {
            sgb1.d("BasicVendorExtender", "OEM implementation for extension mode 3does not exist!");
        }
    }

    public static ArrayList d(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (((Integer) pair.first).intValue() == i) {
                arrayList.add(new Pair(Integer.valueOf(i), (Size[]) pair.second));
                return arrayList;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            if (((Integer) pair2.first).intValue() == i2) {
                arrayList.add(new Pair(Integer.valueOf(i), (Size[]) pair2.second));
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ny61.g(oyr.j(i, "Supported resolution should contain ", " format."));
        return null;
    }

    public final int a() {
        ImageCaptureExtenderImpl imageCaptureExtenderImpl = this.c;
        return (imageCaptureExtenderImpl == null || imageCaptureExtenderImpl.getCaptureProcessor() == null) ? 256 : 35;
    }

    public final int b() {
        PreviewExtenderImpl previewExtenderImpl = this.b;
        return (previewExtenderImpl == null || previewExtenderImpl.getProcessorType() != PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) ? 34 : 35;
    }

    public final Map c(Size size) {
        c94 c94Var = c94.B;
        if (!a3c.b(c94Var) || !azo.f(c94Var)) {
            return Collections.EMPTY_MAP;
        }
        List<Pair> supportedPostviewResolutions = this.c.getSupportedPostviewResolutions(size);
        HashMap hashMap = new HashMap();
        for (Pair pair : supportedPostviewResolutions) {
            Integer num = (Integer) pair.first;
            num.intValue();
            hashMap.put(num, Arrays.asList((Size[]) pair.second));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.b731
    public final List e() {
        d6z.v(this.w, "VendorExtender#init() must be called first");
        if (this.c != null) {
            c94 b = azo.b();
            c94 c94Var = c94.y;
            b.getClass();
            if (c94.b(b).compareTo(c94.b(c94Var)) >= 0) {
                try {
                    List supportedResolutions = this.c.getSupportedResolutions();
                    if (supportedResolutions != null) {
                        return this.c.getCaptureProcessor() != null ? d(35, 256, supportedResolutions) : supportedResolutions;
                    }
                } catch (NoSuchMethodError unused) {
                }
            }
        }
        int a = this.a();
        return Arrays.asList(new Pair(Integer.valueOf(a), ((StreamConfigurationMap) this.y.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(a)));
    }

    @Override // defpackage.b731
    public final List g() {
        if (azo.f(c94.A)) {
            try {
                List availableCaptureResultKeys = this.c.getAvailableCaptureResultKeys();
                if (availableCaptureResultKeys != null) {
                    return Collections.unmodifiableList(availableCaptureResultKeys);
                }
            } catch (Exception e) {
                sgb1.e("BasicVendorExtender", "ImageCaptureExtenderImpl.getAvailableCaptureResultKeys throws exceptions", e);
            }
        }
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.b731
    public final boolean h(String str, LinkedHashMap linkedHashMap) {
        if (this.a.a(str) || this.b == null || this.c == null) {
            return false;
        }
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) linkedHashMap.get(str);
        return this.b.isExtensionAvailable(str, cameraCharacteristics) && this.c.isExtensionAvailable(str, cameraCharacteristics);
    }

    @Override // defpackage.b731
    public final boolean j() {
        c94 c94Var = c94.B;
        if (a3c.b(c94Var) && azo.f(c94Var)) {
            return this.c.isCaptureProcessProgressAvailable();
        }
        return false;
    }

    @Override // defpackage.b731
    public final void l(ar7 ar7Var) {
        this.w = ar7Var;
        if (this.b == null || this.c == null) {
            return;
        }
        this.x = ar7Var.c();
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) this.w.o();
        this.y = cameraCharacteristics;
        this.b.init(this.x, cameraCharacteristics);
        this.c.init(this.x, this.y);
        Objects.toString(this.b.getProcessorType());
        sgb1.g(3, "BasicVendorExtender");
        Objects.toString(this.c.getCaptureProcessor());
        sgb1.g(3, "BasicVendorExtender");
    }

    @Override // defpackage.b731
    public final Size[] n() {
        d6z.v(this.w, "VendorExtender#init() must be called first");
        return new Size[0];
    }

    @Override // defpackage.b731
    public final List o() {
        d6z.v(this.w, "VendorExtender#init() must be called first");
        if (this.b != null) {
            c94 b = azo.b();
            c94 c94Var = c94.y;
            b.getClass();
            if (c94.b(b).compareTo(c94.b(c94Var)) >= 0) {
                try {
                    List supportedResolutions = this.b.getSupportedResolutions();
                    if (supportedResolutions != null) {
                        return d(34, 35, supportedResolutions);
                    }
                } catch (NoSuchMethodError unused) {
                }
            }
        }
        return Arrays.asList(new Pair(34, ((StreamConfigurationMap) this.y.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(this.b())));
    }

    @Override // defpackage.b731
    public final m0r0 p(Context context) {
        List list;
        d6z.v(this.w, "VendorExtender#init() must be called first");
        PreviewExtenderImpl previewExtenderImpl = this.b;
        ImageCaptureExtenderImpl imageCaptureExtenderImpl = this.c;
        if (azo.f(c94.A)) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = this.z.a(this.c, this.x, this.y, context).iterator();
                while (it.hasNext()) {
                    arrayList.add((CaptureRequest.Key) it.next());
                }
                list = Collections.unmodifiableList(arrayList);
            } catch (Exception e) {
                sgb1.e("BasicVendorExtender", "ImageCaptureExtenderImpl.getAvailableCaptureRequestKeys throws exceptions", e);
                list = Collections.EMPTY_LIST;
            }
        } else {
            list = Collections.unmodifiableList(A);
        }
        return new h(previewExtenderImpl, imageCaptureExtenderImpl, list, this, context);
    }

    @Override // defpackage.b731
    public final boolean s() {
        c94 c94Var = c94.B;
        if (a3c.b(c94Var) && azo.f(c94Var)) {
            return this.c.isPostviewAvailable();
        }
        return false;
    }
}
