package xsna;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* compiled from: BaseDataSource.java */
/* loaded from: classes12.dex */
public abstract class gc6 implements androidx.media3.datasource.a {

    @Nullable
    private evk dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<mjp0> listeners = new ArrayList<>(1);

    public gc6(boolean z) {
        this.isNetwork = z;
    }

    @Override // androidx.media3.datasource.a
    public final void addTransferListener(mjp0 mjp0Var) {
        mjp0Var.getClass();
        if (this.listeners.contains(mjp0Var)) {
            return;
        }
        this.listeners.add(mjp0Var);
        this.listenerCount++;
    }

    public final void bytesTransferred(int i) {
        evk evkVar = this.dataSpec;
        String str = y2r0.a;
        for (int i2 = 0; i2 < this.listenerCount; i2++) {
            this.listeners.get(i2).f(this, evkVar, this.isNetwork, i);
        }
    }

    public final void transferEnded() {
        evk evkVar = this.dataSpec;
        String str = y2r0.a;
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).h(this, evkVar, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(evk evkVar) {
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).e(this, evkVar, this.isNetwork);
        }
    }

    public final void transferStarted(evk evkVar) {
        this.dataSpec = evkVar;
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).g(this, evkVar, this.isNetwork);
        }
    }
}
