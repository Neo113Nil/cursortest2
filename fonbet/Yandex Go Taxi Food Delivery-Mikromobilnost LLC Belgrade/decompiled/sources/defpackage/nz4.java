package defpackage;

import java.util.ArrayList;

/* loaded from: classes10.dex */
public abstract class nz4 implements kpg {
    private npg dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<cj01> listeners = new ArrayList<>(1);

    public nz4(boolean z) {
        this.isNetwork = z;
    }

    @Override // defpackage.kpg
    public final void addTransferListener(cj01 cj01Var) {
        cj01Var.getClass();
        if (this.listeners.contains(cj01Var)) {
            return;
        }
        this.listeners.add(cj01Var);
        this.listenerCount++;
    }

    public final void bytesTransferred(int i) {
        npg npgVar = this.dataSpec;
        int i2 = tw21.a;
        for (int i3 = 0; i3 < this.listenerCount; i3++) {
            this.listeners.get(i3).onBytesTransferred(this, npgVar, this.isNetwork, i);
        }
    }

    public final void transferEnded() {
        npg npgVar = this.dataSpec;
        int i = tw21.a;
        for (int i2 = 0; i2 < this.listenerCount; i2++) {
            this.listeners.get(i2).onTransferEnd(this, npgVar, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(npg npgVar) {
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).onTransferInitializing(this, npgVar, this.isNetwork);
        }
    }

    public final void transferStarted(npg npgVar) {
        this.dataSpec = npgVar;
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).onTransferStart(this, npgVar, this.isNetwork);
        }
    }
}
