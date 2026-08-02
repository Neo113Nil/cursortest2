package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ImEngineHistoryStorageEvents.kt */
/* loaded from: classes13.dex */
public final class n1w implements r8v {
    public final a1w a;
    public final long b;

    public n1w(long j, a1w a1wVar) {
        this.a = a1wVar;
        this.b = j;
    }

    @Override // xsna.r8v
    public final void a(gj30 gj30Var) {
        this.a.D(this, new vk70(new UserId(this.b), gj30Var.k()));
    }
}
