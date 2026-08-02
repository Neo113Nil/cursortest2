package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.fd50;

/* compiled from: MusicTrackMenuReducer.kt */
/* loaded from: classes3.dex */
public final class gd50 extends dm50<jd50, fd50, id50> {
    @Override // xsna.dm50
    public final id50 c(id50 id50Var, fd50 fd50Var) {
        id50 id50Var2 = id50Var;
        fd50 fd50Var2 = fd50Var;
        if (fd50Var2 instanceof fd50.a) {
            fd50.a aVar = (fd50.a) fd50Var2;
            return id50.a(id50Var2, aVar.b, aVar.c, null, null, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
        }
        if (fd50Var2 instanceof fd50.c) {
            return id50.a(id50Var2, null, null, ((fd50.c) fd50Var2).b, null, 111);
        }
        if (!(fd50Var2 instanceof fd50.b)) {
            throw new NoWhenBranchMatchedException();
        }
        fd50.b bVar = (fd50.b) fd50Var2;
        return epx.f(bVar.b, id50Var2.b) ? id50.a(id50Var2, null, null, null, bVar.c, 95) : id50Var2;
    }

    @Override // xsna.dm50
    public final jd50 d() {
        return new jd50(e(new jr3(28)), e(new leq(20)));
    }

    @Override // xsna.dm50
    public final void h(id50 id50Var, jd50 jd50Var) {
        id50 id50Var2 = id50Var;
        jd50 jd50Var2 = jd50Var;
        if (id50Var2.b.Wb()) {
            f(jd50Var2.b, id50Var2);
        } else {
            f(jd50Var2.a, id50Var2);
        }
    }
}
