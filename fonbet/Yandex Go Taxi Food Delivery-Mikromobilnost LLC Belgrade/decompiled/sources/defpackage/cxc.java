package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes8.dex */
public final class cxc extends efe {
    public final yvf0 b;

    public cxc(yvf0 yvf0Var) {
        this.b = yvf0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if (r0.equals(r1.g()) != false) goto L9;
     */
    @Override // com.yandex.go.deeplinks.typed.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        dfe dfeVar = (dfe) obj;
        zy11 zy11Var = zy11.a;
        try {
            long parseLong = Long.parseLong(dfeVar.a());
            String c = dfeVar.c();
            ye0 ye0Var = fxc.b;
            if (!c.equals(ye0Var.g())) {
                ye0Var = gxc.b;
            }
            ((pep0) oep0Var).f((m950) this.b.get(), new mxc(parseLong, dfeVar.b(), ye0Var), hxx.a);
            return zy11Var;
        } catch (NumberFormatException e) {
            jst.e.k(e, "ComplaintDeeplinkHandler: invalid organization id=".concat(dfeVar.a()));
            return zy11Var;
        }
    }
}
