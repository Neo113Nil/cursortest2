package xsna;

import android.hardware.Camera;
import com.vk.superapp.browser.internal.utils.FlashlightUtils;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class vbj implements Callable {
    public final /* synthetic */ int b;

    public /* synthetic */ vbj(int i) {
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                try {
                    return com.vk.contacts.c.b.m(false);
                } finally {
                    com.vk.contacts.c.d = null;
                }
            default:
                Camera camera = FlashlightUtils.b;
                return Boolean.valueOf(camera != null ? epx.f(camera.getParameters().getFlashMode(), "torch") : false);
        }
    }
}
