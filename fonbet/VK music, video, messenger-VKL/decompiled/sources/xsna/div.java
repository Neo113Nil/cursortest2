package xsna;

import java.io.IOException;

/* compiled from: TaskQueue.kt */
/* loaded from: classes8.dex */
public final class div extends c5o0 {
    public final /* synthetic */ vhv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public div(String str, vhv vhvVar) {
        super(str, true);
        this.e = vhvVar;
    }

    @Override // xsna.c5o0
    public final long a() {
        vhv vhvVar = this.e;
        vhvVar.getClass();
        try {
            vhvVar.y.k(2, 0, false);
            return -1L;
        } catch (IOException e) {
            vhvVar.c(e);
            return -1L;
        }
    }
}
