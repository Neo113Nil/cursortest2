package xsna;

import com.vk.dto.common.Peer;
import java.util.List;
import xsna.v6w;

/* compiled from: ImItemListMviBootstrapper.kt */
/* loaded from: classes2.dex */
public final class k6w implements vj50<o6w, on50, v6w, m6w> {
    public final Peer a;

    public k6w(Peer peer) {
        this.a = peer;
    }

    @Override // xsna.vj50
    public final o6w a() {
        return new o6w(this.a, (n5w) n5w.d.getValue(), (i8w) i8w.d.getValue(), (f8w) f8w.b.getValue(), (p8w) p8w.b.getValue(), 0);
    }

    @Override // xsna.vj50
    public final /* bridge */ /* synthetic */ m6w b() {
        return null;
    }

    @Override // xsna.vj50
    public final List<v6w> c(o6w o6wVar) {
        return e43.l(v6w.d.b, v6w.g.b);
    }
}
