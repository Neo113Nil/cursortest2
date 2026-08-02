package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.chat.b;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class ibt extends vds0 {
    public final b b;

    public ibt(kse kseVar, b bVar) {
        super(kseVar.a);
        this.b = bVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        b bVar = this.b;
        return new pb(e.F(bVar.b((ChatRequest) obj), bVar.f.e), 27);
    }
}
