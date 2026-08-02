package xsna;

import com.vk.design.demo.presentation.nav.ScreenKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.h3m;
import xsna.u3m;

/* compiled from: DesignDemoFeature.kt */
/* loaded from: classes18.dex */
public final class i3m extends wk50<y3m, x3m, h3m, u3m> {
    public final f4z<Boolean> f;

    public i3m() {
        super(null, new v3m(new x3m(0)));
        this.f = new f4z<>();
    }

    @Override // xsna.wk50
    public final void N(x3m x3mVar, h3m h3mVar) {
        ArrayList v0;
        h3m h3mVar2 = h3mVar;
        List<ScreenKey> list = x3mVar.b;
        if (h3mVar2.equals(h3m.a.b)) {
            v0 = new ArrayList(list);
            g5g.J(v0);
        } else {
            if (!(h3mVar2 instanceof h3m.b)) {
                throw new NoWhenBranchMatchedException();
            }
            v0 = j5g.v0(((h3m.b) h3mVar2).b, list);
        }
        this.f.b(Boolean.valueOf(v0.size() > 1));
        T(new u3m.a(v0));
    }
}
