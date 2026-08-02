package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class nyq0 {
    public final SessionConfiguration a;

    public nyq0(int i, ArrayList arrayList, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((OutputConfiguration) ((ey80) it.next()).a.a());
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(i, arrayList2, executor, stateCallback);
        this.a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList3 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            arrayList3.add(outputConfiguration == null ? null : new ey80(Build.VERSION.SDK_INT >= 33 ? new hy80(outputConfiguration) : new gy80(new fy80(outputConfiguration))));
        }
        Collections.unmodifiableList(arrayList3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nyq0)) {
            return false;
        }
        return Objects.equals(this.a, ((nyq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
