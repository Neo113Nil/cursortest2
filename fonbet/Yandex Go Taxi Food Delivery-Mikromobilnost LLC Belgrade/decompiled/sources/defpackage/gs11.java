package defpackage;

import java.util.List;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.web.view.clients.TaxiWebViewClient;

/* loaded from: classes14.dex */
public final /* synthetic */ class gs11 implements em41, jms {
    public final /* synthetic */ ic01 a;

    public gs11(ic01 ic01Var) {
        this.a = ic01Var;
    }

    @Override // defpackage.em41
    public final /* synthetic */ TaxiWebViewClient a(boolean z, boolean z2, f fVar, List list) {
        return (TaxiWebViewClient) this.a.invoke(Boolean.valueOf(z), Boolean.valueOf(z2), fVar, list);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof em41) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
