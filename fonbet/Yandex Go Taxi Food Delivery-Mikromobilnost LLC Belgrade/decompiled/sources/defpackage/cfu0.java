package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class cfu0 {
    public final boolean a;

    public cfu0() {
        this.a = ((StillCaptureFlashStopRepeatingQuirk) xbj.a.b(StillCaptureFlashStopRepeatingQuirk.class)) != null;
    }

    public final boolean a(ArrayList arrayList, boolean z) {
        if (!this.a || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
            if (intValue == 2 || intValue == 3) {
                return true;
            }
        }
        return false;
    }
}
