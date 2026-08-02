package defpackage;

import com.yandex.go.quark.dynamic.chat.a;
import java.util.Collections;
import kotlin.collections.b;
import okio.ByteString;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatHostCapability;
import ru.yandex.alice.protos.endpoint.platform.utils.TCapability;
import ru.yandex.alice.protos.endpoint.quark.webchat.TCapability;

/* loaded from: classes8.dex */
public final class bs1 extends hy4 implements e2z {
    public final String b;
    public final ul2 c;
    public final nfh d;
    public final String e;

    /* JADX WARN: Multi-variable type inference failed */
    public bs1(zwf0 zwf0Var, a aVar) {
        t830 t830Var = new t830(b.f(), true);
        this.b = "AliceChatHostCapability";
        TCapability.TMeta tMeta = null;
        TAliceChatHostCapability.TParameters tParameters = null;
        ByteString byteString = null;
        this.c = new ul2(TCapability.ECapabilityType.AliceChatHostCapabilityType, new TAliceChatHostCapability(tMeta, tParameters, new TAliceChatHostCapability.TState(null, 1, 0 == true ? 1 : 0), byteString, 11, null), t830Var);
        nfh nfhVar = new nfh();
        nfhVar.a = zwf0Var;
        nfhVar.b = aVar;
        nfhVar.c = Collections.singleton(new dnj("dismiss_chat_directive"));
        this.d = nfhVar;
        this.e = "WebChatModule";
    }

    @Override // defpackage.u28
    public final String a() {
        return this.b;
    }

    @Override // defpackage.u28
    public final String c() {
        return this.e;
    }

    @Override // defpackage.u28
    public final bnj d() {
        return this.d;
    }

    @Override // defpackage.u28
    public final synchronized png getCurrentState() {
        return this.c;
    }
}
