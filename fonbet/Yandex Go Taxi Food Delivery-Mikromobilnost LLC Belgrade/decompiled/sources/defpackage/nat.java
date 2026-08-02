package defpackage;

import com.yandex.messaging.ChatRequest;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class nat extends vds0 {
    public final p4t b;

    public nat(kse kseVar, p4t p4tVar) {
        super(kseVar.e);
        this.b = p4tVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.t(new syc(this.b.a((ChatRequest) obj), 22));
    }
}
