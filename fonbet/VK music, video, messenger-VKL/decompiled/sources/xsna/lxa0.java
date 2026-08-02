package xsna;

import com.vk.toggle.internal.ToggleManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class lxa0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.vk.toggle.b.A.x();
        } catch (ToggleManager.IllegalToggleException e) {
            com.vk.metrics.eventtracking.b.a.q(e);
        }
    }
}
