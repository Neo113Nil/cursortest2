package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.core.net.entities.proto.TimestampRange;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.MessageReactions;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class f5b implements cbi0 {
    public static final /* synthetic */ kgx[] C;
    public TimestampRange A;
    public Long[] B;
    public final ExistingChatRequest a;
    public final z7b b;
    public boolean y;
    public final Handler c = new Handler();
    public final rnz w = new rnz((Object) null);
    public final rnz x = new rnz((Object) null);
    public final qp3 z = new qp3();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("rangeSubscription", 0, "getRangeSubscription()Lcom/yandex/alicekit/core/Disposable;", f5b.class);
        qoi0.a.getClass();
        C = new kgx[]{mutablePropertyReference1Impl};
    }

    public f5b(ExistingChatRequest existingChatRequest, z7b z7bVar) {
        this.a = existingChatRequest;
        this.b = z7bVar;
    }

    @Override // defpackage.cbi0
    public final void c(ServerMessageRef serverMessageRef, long j, MessageReactions messageReactions) {
        c5b c5bVar;
        z83.g(null, Looper.myLooper(), this.c.getLooper());
        d5b d5bVar = (d5b) this.w.c(serverMessageRef.getTimestamp());
        if (d5bVar == null || (c5bVar = d5bVar.b) == null) {
            return;
        }
        c5bVar.f(j, messageReactions);
    }
}
