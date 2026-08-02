package defpackage;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class jj1 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public jj1(CameraManager cameraManager, String str) {
        CameraDevice.CameraDeviceSetup cameraDeviceSetup;
        cameraDeviceSetup = cameraManager.getCameraDeviceSetup(str);
        this.b = cameraDeviceSetup;
    }

    public final dn60 a(SessionConfiguration sessionConfiguration) {
        boolean isSessionConfigurationSupported;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    dn60 a = ((jj1) it.next()).a(sessionConfiguration);
                    if (a.b != 0) {
                        return a;
                    }
                }
                return new dn60(0, 1, (byte) 0);
            default:
                isSessionConfigurationSupported = ((CameraDevice.CameraDeviceSetup) obj).isSessionConfigurationSupported(sessionConfiguration);
                int i2 = isSessionConfigurationSupported ? 1 : 2;
                String property = System.getProperty("ro.build.date.utc");
                if (property != null) {
                    try {
                        Long.parseLong(property);
                    } catch (NumberFormatException unused) {
                    }
                }
                return new dn60(i2, 1, (byte) 0);
        }
    }

    public jj1(ArrayList arrayList) {
        this.b = arrayList;
    }
}
