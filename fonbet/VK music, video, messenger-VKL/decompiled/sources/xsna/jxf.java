package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.engine.models.messages.Msg;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: CnvMsgDeleteLpTask.kt */
/* loaded from: classes2.dex */
public final class jxf extends e500 {
    public final w2w c;
    public final Peer d;
    public final int e;

    public jxf(w2w w2wVar, Peer peer, int i) {
        super("CnvMsgDeleteLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = i;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        LinkedHashMap linkedHashMap = c400Var.d;
        Peer peer = this.d;
        long j = peer.b;
        long j2 = peer.b;
        com.vk.im.engine.models.dialogs.a aVar = (com.vk.im.engine.models.dialogs.a) linkedHashMap.get(Long.valueOf(j));
        if (aVar == null) {
            f400Var.c.add(Long.valueOf(j2));
            return;
        }
        int i = aVar.f;
        Map map = (Map) c400Var.h.get(Long.valueOf(j2));
        boolean containsKey = map != null ? map.containsKey(Integer.valueOf(i)) : false;
        if (i == 0 || containsKey) {
            return;
        }
        f400Var.d(i, j2);
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.a = Boolean.TRUE;
        Peer peer = this.d;
        z300Var.d(this.e, peer.b);
        z300Var.h(new b5w(peer.b, ImItemType.DIALOG));
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        LinkedHashMap linkedHashMap = c400Var.d;
        Peer peer = this.d;
        com.vk.im.engine.models.dialogs.a aVar = (com.vk.im.engine.models.dialogs.a) pn00.h(Long.valueOf(peer.b), linkedHashMap);
        Map map = (Map) c400Var.h.get(Long.valueOf(peer.b));
        this.c.I0().u(new x4c(this, aVar, map != null ? (Msg) map.get(Integer.valueOf(aVar.f)) : null, 1));
    }
}
