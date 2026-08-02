package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.yandex.alice.protos.endpoint.capabilities.deeplinks.TDeeplinkCapability;
import ru.yandex.alice.protos.endpoint.platform.utils.TCapability;

/* loaded from: classes8.dex */
public final class a4h extends hy4 {
    public final t830 b;
    public final String c;
    public ul2 d;
    public final cxq0 e;
    public final String f;

    public a4h(e4h e4hVar, zwf0 zwf0Var) {
        t830 t830Var = new t830(b.f(), true);
        this.b = t830Var;
        this.c = "QuarkDeeplinksCapability";
        this.d = f(EmptyList.a);
        this.e = new cxq0(e4hVar, zwf0Var, t830Var);
        this.f = "DeeplinksModule";
    }

    @Override // defpackage.u28
    public final String a() {
        return this.c;
    }

    @Override // defpackage.u28
    public final String c() {
        return this.f;
    }

    @Override // defpackage.u28
    public final bnj d() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ul2 f(List list) {
        int i = 2;
        Object[] objArr = 0 == true ? 1 : 0;
        return new ul2(TCapability.ECapabilityType.DeeplinkCapabilityType, new TDeeplinkCapability(null, objArr, new TDeeplinkCapability.TState(new TDeeplinkCapability.TSupportedDeeplinks(list, null, i, 0 == true ? 1 : 0), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0), null, 11, null), this.b);
    }

    @Override // defpackage.u28
    public final synchronized png getCurrentState() {
        return this.d;
    }
}
