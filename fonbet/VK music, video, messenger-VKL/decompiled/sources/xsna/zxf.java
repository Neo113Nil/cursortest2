package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.engine.models.messages.Msg;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.gv30;

/* compiled from: CnvMsgRestoreLpTask.kt */
/* loaded from: classes2.dex */
public final class zxf extends e500 {
    public final w2w c;
    public final Peer d;
    public final int e;

    public zxf(w2w w2wVar, Peer peer, int i) {
        super("CnvMsgRestoreLpTask(d=" + peer.b + ",cmid=" + i + ')');
        this.c = w2wVar;
        this.d = peer;
        this.e = i;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        LinkedHashMap linkedHashMap = c400Var.h;
        Peer peer = this.d;
        long j = peer.b;
        long j2 = peer.b;
        Map map = (Map) linkedHashMap.get(Long.valueOf(j));
        int i = this.e;
        if (!(map != null ? map.containsKey(Integer.valueOf(i)) : false)) {
            f400Var.d(i, j2);
        }
        com.vk.im.engine.models.dialogs.a aVar = (com.vk.im.engine.models.dialogs.a) c400Var.d.get(Long.valueOf(j2));
        if (aVar == null) {
            f400Var.c.add(Long.valueOf(j2));
            return;
        }
        int i2 = aVar.f;
        Map map2 = (Map) linkedHashMap.get(Long.valueOf(j2));
        boolean containsKey = map2 != null ? map2.containsKey(Integer.valueOf(i2)) : false;
        if (!(i2 != 0) || containsKey) {
            return;
        }
        f400Var.d(i2, j2);
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.a = Boolean.TRUE;
        z300Var.h(new b5w(this.d.b, ImItemType.DIALOG));
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        final Msg msg;
        LinkedHashMap linkedHashMap = c400Var.d;
        Peer peer = this.d;
        final com.vk.im.engine.models.dialogs.a aVar = (com.vk.im.engine.models.dialogs.a) pn00.h(Long.valueOf(peer.b), linkedHashMap);
        LinkedHashMap linkedHashMap2 = c400Var.h;
        long j = peer.b;
        Map map = (Map) linkedHashMap2.get(Long.valueOf(j));
        final Msg msg2 = map != null ? (Msg) map.get(Integer.valueOf(aVar.f)) : null;
        Map map2 = (Map) linkedHashMap2.get(Long.valueOf(j));
        if (map2 == null || (msg = (Msg) map2.get(Integer.valueOf(this.e))) == null) {
            return;
        }
        this.c.I0().u(new izs() { // from class: xsna.yxf
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                zxf zxfVar = zxf.this;
                com.vk.im.engine.internal.merge.messages.b bVar = new com.vk.im.engine.internal.merge.messages.b(zxfVar.d, msg, false, false, 48);
                w2w w2wVar = zxfVar.c;
                bVar.o(w2wVar);
                Msg msg3 = msg2;
                if (msg3 == null) {
                    long j2 = zxfVar.d.b;
                    gv30.a aVar2 = new gv30.a();
                    aVar2.a = j2;
                    aVar2.a();
                    aVar2.b();
                    aVar2.e = 1;
                    aVar2.d(Integer.MAX_VALUE);
                    new zd20(new gv30(aVar2), new utb(w2wVar.I0(), w2wVar.getExperiments()), false, false).a(w2wVar);
                } else {
                    new com.vk.im.engine.internal.merge.messages.b(zxfVar.d, msg3, false, true, 48).o(w2wVar);
                }
                return (List) new wfm(aVar, null).o(w2wVar);
            }
        });
    }
}
