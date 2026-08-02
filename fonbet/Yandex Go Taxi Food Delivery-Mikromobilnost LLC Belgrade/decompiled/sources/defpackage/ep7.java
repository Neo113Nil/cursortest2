package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class ep7 {
    public final sr4 b;
    public final String c;
    public final HashMap a = new HashMap();
    public amp0 d = null;

    public ep7(CameraCharacteristics cameraCharacteristics, String str) {
        this.b = new sr4(16, cameraCharacteristics);
        this.c = str;
    }

    public final Object a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.b.b).get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristics) this.b.b).get(key);
                if (obj2 != null) {
                    this.a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b() {
        Integer num;
        CameraCharacteristics.Key key;
        if (!d() || Build.VERSION.SDK_INT < 35) {
            num = null;
        } else {
            key = CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL;
            num = (Integer) a(key);
        }
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final amp0 c() {
        if (this.d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    ny61.g("StreamConfigurationMap is null!");
                    return null;
                }
                oy80 oy80Var = new oy80(this.c);
                amp0 amp0Var = new amp0();
                amp0Var.c = new HashMap();
                new HashMap();
                new HashMap();
                amp0Var.a = new wor0(streamConfigurationMap);
                amp0Var.b = oy80Var;
                this.d = amp0Var;
            } catch (AssertionError | NullPointerException e) {
                ny61.g(e.getMessage());
                return null;
            }
        }
        return this.d;
    }

    public final boolean d() {
        Boolean bool = (Boolean) a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        return bool != null && bool.booleanValue();
    }
}
