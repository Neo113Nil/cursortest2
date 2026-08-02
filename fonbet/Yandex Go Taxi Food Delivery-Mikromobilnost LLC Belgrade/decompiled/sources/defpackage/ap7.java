package defpackage;

import android.hardware.camera2.CaptureResult;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public interface ap7 {
    default void a(ilo iloVar) {
        int i;
        ArrayList arrayList = iloVar.a;
        CameraCaptureMetaData$FlashState d = d();
        if (d == CameraCaptureMetaData$FlashState.UNKNOWN) {
            return;
        }
        int i2 = flo.a[d.ordinal()];
        if (i2 == 1) {
            i = 0;
        } else if (i2 == 2) {
            i = 32;
        } else {
            if (i2 != 3) {
                d.toString();
                sgb1.g(5, "ExifData");
                return;
            }
            i = 1;
        }
        if ((i & 1) == 1) {
            iloVar.c("LightSource", String.valueOf(4), arrayList);
        }
        iloVar.c("Flash", String.valueOf(i), arrayList);
    }

    q6x0 b();

    CameraCaptureMetaData$FlashState d();

    CameraCaptureMetaData$AfState f();

    long getTimestamp();

    CameraCaptureMetaData$AwbState i();

    CameraCaptureMetaData$AeState l();

    default CaptureResult m() {
        return null;
    }
}
