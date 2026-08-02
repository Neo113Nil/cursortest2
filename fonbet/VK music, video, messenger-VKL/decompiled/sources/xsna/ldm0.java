package xsna;

import com.vk.masks.MasksController;
import com.vk.stories.StorySettingsActivity;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ldm0 implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        long J;
        int i = StorySettingsActivity.P;
        MasksController f = MasksController.f();
        synchronized (f) {
            f.c.getClass();
            pro0.b();
            pro0.b();
            J = com.vk.core.files.a.J(f9t.g()) + com.vk.core.files.a.J(f9t.p());
        }
        return Long.valueOf(J);
    }
}
