package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.e;

/* loaded from: classes15.dex */
public final class p4t extends vds0 {
    public final e b;

    public p4t(e eVar, kse kseVar) {
        super(kseVar.b);
        this.b = eVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return new syc(this.b.a((ChatRequest) obj), 18);
    }
}
