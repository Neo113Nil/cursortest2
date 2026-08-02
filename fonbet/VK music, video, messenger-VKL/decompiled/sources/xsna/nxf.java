package xsna;

import com.vk.im.engine.models.messages.Msg;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: CnvMsgEditLpTask.kt */
/* loaded from: classes2.dex */
public final class nxf extends e500 {
    public final w2w c;
    public final long d;
    public final int e;
    public final Msg f;
    public final boolean g;
    public Long h;
    public Integer i;

    public nxf(w2w w2wVar, mxf mxfVar) {
        super("CnvMsgEditLpTask");
        this.c = w2wVar;
        this.d = mxfVar.a.b;
        this.e = mxfVar.b;
        this.f = mxfVar.c;
        this.g = mxfVar.d;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        LinkedHashMap linkedHashMap = c400Var.h;
        long j = this.d;
        Map map = (Map) linkedHashMap.get(Long.valueOf(j));
        int i = this.e;
        boolean z = false;
        boolean containsKey = map != null ? map.containsKey(Integer.valueOf(i)) : false;
        Msg msg = this.f;
        if (msg != null || containsKey) {
            Map map2 = (Map) linkedHashMap.get(Long.valueOf(j));
            if (!(map2 != null ? map2.containsKey(Integer.valueOf(i)) : false) && msg != null) {
                gtx0 t0 = this.c.I0().o().t0(msg.d, msg.c);
                aux0 aux0Var = t0 instanceof aux0 ? (aux0) t0 : null;
                if (aux0Var != null && aux0Var.Qa()) {
                    z = true;
                }
            }
            if (!z) {
                return;
            }
        }
        f400Var.d(i, j);
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        Long l = this.h;
        if (l != null) {
            z300Var.g(l.longValue());
        }
        Integer num = this.i;
        if (num != null) {
            int intValue = num.intValue();
            long j = this.d;
            z300Var.j(intValue, j);
            z300Var.i(intValue, j);
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        Msg msg;
        Map map = (Map) c400Var.h.get(Long.valueOf(this.d));
        if (map == null || (msg = (Msg) map.get(Integer.valueOf(this.e))) == null) {
            msg = this.f;
        }
        this.c.I0().u(new du0(8, this, msg));
    }
}
