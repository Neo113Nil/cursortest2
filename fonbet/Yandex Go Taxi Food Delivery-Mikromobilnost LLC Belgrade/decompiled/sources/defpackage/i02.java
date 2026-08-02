package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.altpins.walking_route.map.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class i02 implements jms {
    public final /* synthetic */ a a;

    public i02(a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i02) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, a.class, "focusOnRoute", "focusOnRoute()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
