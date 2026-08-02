package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.internal.compat.quirk.GetAvailableKeysNeedsOnInit;
import java.util.List;

/* loaded from: classes10.dex */
public class pa4 {
    public final boolean a;

    public pa4() {
        this.a = ubj.a.b(GetAvailableKeysNeedsOnInit.class) != null;
    }

    public final List a(ImageCaptureExtenderImpl imageCaptureExtenderImpl, String str, CameraCharacteristics cameraCharacteristics, Context context) {
        boolean z = this.a;
        if (z) {
            imageCaptureExtenderImpl.onInit(str, cameraCharacteristics, context);
        }
        try {
            return imageCaptureExtenderImpl.getAvailableCaptureRequestKeys();
        } finally {
            if (z) {
                imageCaptureExtenderImpl.onDeInit();
            }
        }
    }
}
