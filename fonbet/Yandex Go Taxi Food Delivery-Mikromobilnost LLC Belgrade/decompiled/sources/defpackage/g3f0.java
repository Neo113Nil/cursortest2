package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager;
import java.util.Map;

/* loaded from: classes10.dex */
public final class g3f0 implements kpg {
    public final kpg a;
    public final PriorityTaskManager b;
    public final int c;

    public g3f0(kpg kpgVar, PriorityTaskManager priorityTaskManager, int i) {
        kpgVar.getClass();
        this.a = kpgVar;
        priorityTaskManager.getClass();
        this.b = priorityTaskManager;
        this.c = i;
    }

    @Override // defpackage.kpg
    public final void addTransferListener(cj01 cj01Var) {
        cj01Var.getClass();
        this.a.addTransferListener(cj01Var);
    }

    @Override // defpackage.kpg
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.kpg
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // defpackage.kpg
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.kpg
    public final long open(npg npgVar) {
        this.b.c(this.c);
        return this.a.open(npgVar);
    }

    @Override // defpackage.apg
    public final int read(byte[] bArr, int i, int i2) {
        this.b.c(this.c);
        return this.a.read(bArr, i, i2);
    }
}
