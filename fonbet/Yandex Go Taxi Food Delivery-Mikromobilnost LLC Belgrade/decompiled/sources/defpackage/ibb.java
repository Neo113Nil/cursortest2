package defpackage;

import com.yandex.messaging.internal.ServerMessageRef;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final class ibb extends kbb {
    public final ServerMessageRef w;
    public final /* synthetic */ lbb x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibb(lbb lbbVar, ServerMessageRef serverMessageRef, nab nabVar) {
        super(lbbVar, nabVar);
        this.x = lbbVar;
        this.w = serverMessageRef;
    }

    @Override // defpackage.kbb
    public final Pair c() {
        ebb ebbVar = this.x.d;
        ServerMessageRef serverMessageRef = this.w;
        return new Pair(ebbVar.b(serverMessageRef), Long.valueOf(serverMessageRef.getTimestamp()));
    }
}
