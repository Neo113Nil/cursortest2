package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.os.Build;
import defpackage.dy40;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes10.dex */
class AdvancedSessionProcessor$ExtensionMetadataMonitor {
    private final dy40 mCurrentExtensionTypeLiveData;
    private final dy40 mExtensionStrengthLiveData;

    public AdvancedSessionProcessor$ExtensionMetadataMonitor(dy40 dy40Var, dy40 dy40Var2) {
        this.mCurrentExtensionTypeLiveData = dy40Var;
        this.mExtensionStrengthLiveData = dy40Var2;
    }

    private int convertExtensionMode(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public void checkExtensionMetadata(Map<CaptureResult.Key, Object> map) {
        CaptureResult.Key key;
        CaptureResult.Key key2;
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.mCurrentExtensionTypeLiveData != null) {
                key2 = CaptureResult.EXTENSION_CURRENT_TYPE;
                Object obj = map.get(key2);
                if (obj != null) {
                    Integer num = (Integer) obj;
                    if (!Objects.equals(this.mCurrentExtensionTypeLiveData.d(), Integer.valueOf(convertExtensionMode(num.intValue())))) {
                        this.mCurrentExtensionTypeLiveData.m(Integer.valueOf(convertExtensionMode(num.intValue())));
                    }
                }
            }
            if (this.mExtensionStrengthLiveData != null) {
                key = CaptureResult.EXTENSION_STRENGTH;
                Object obj2 = map.get(key);
                if (obj2 == null || Objects.equals(this.mExtensionStrengthLiveData.d(), obj2)) {
                    return;
                }
                this.mExtensionStrengthLiveData.m((Integer) obj2);
            }
        }
    }
}
