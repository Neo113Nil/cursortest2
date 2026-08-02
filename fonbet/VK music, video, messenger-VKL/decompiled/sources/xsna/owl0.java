package xsna;

import com.vk.reefton.Reef;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: StoringReefExecutor.kt */
/* loaded from: classes3.dex */
public final class owl0 implements Executor {
    public final ArrayList b = new ArrayList();
    public Reef c;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i0q0.j(new ii4(6, this, runnable));
    }
}
