package defpackage;

import com.yandex.messenger.websdk.internal.web.MessageType;
import defpackage.qsx;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class fh41 extends qsx.a {
    public final nax c;
    public final c9v d;
    public final rax e;
    public final ew2 f;
    public final LinkedHashMap g = new LinkedHashMap();

    public fh41(nax naxVar, c9v c9vVar, rax raxVar, ew2 ew2Var) {
        this.c = naxVar;
        this.d = c9vVar;
        this.e = raxVar;
        this.f = ew2Var;
    }

    public final void b(String str) {
        eh41 eh41Var = (eh41) this.g.remove(str);
        if (eh41Var != null) {
            fh41 fh41Var = eh41Var.c;
            ew2 ew2Var = fh41Var.f;
            String str2 = eh41Var.a;
            ew2Var.b("wm_web_unobserve " + str2);
            eh41Var.b.cancel();
            c9v.h(fh41Var.d, nax.b(hdu.n(fh41Var.c.a, MessageType.Unobserve, new JSONObject().put("objectName", "chatsLastMessageChanged").put("observerId", str2), udq0.F())));
        }
    }
}
