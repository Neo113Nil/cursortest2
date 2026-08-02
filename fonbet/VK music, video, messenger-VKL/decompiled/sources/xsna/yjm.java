package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: DialogSortIdChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class yjm extends e500 {
    public final w2w c;
    public final Peer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public gkx0 h;

    public yjm(w2w w2wVar, Peer peer, Integer num, Integer num2, Integer num3) {
        super("DialogSortIdChangeLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = num;
        this.f = num2;
        this.g = num3;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        LinkedHashMap linkedHashMap = c400Var.d;
        Peer peer = this.d;
        long j = peer.b;
        long j2 = peer.b;
        com.vk.im.engine.models.dialogs.a aVar = (com.vk.im.engine.models.dialogs.a) linkedHashMap.get(Long.valueOf(j));
        boolean z = aVar != null;
        boolean booleanValue = ((Boolean) this.c.I0().c(new xjm(j2, 0))).booleanValue();
        if (!z && !booleanValue) {
            f400Var.c.add(Long.valueOf(j2));
        }
        if (aVar == null) {
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
        z300Var.g(this.d.b);
        gkx0 gkx0Var = this.h;
        if (gkx0Var != null) {
            z300Var.e.add(gkx0Var);
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        LinkedHashMap linkedHashMap = c400Var.d;
        Peer peer = this.d;
        long j = peer.b;
        long j2 = peer.b;
        w2w w2wVar = this.c;
        Integer num = null;
        if (!((Boolean) w2wVar.I0().c(new xjm(j, 0))).booleanValue()) {
            com.vk.im.engine.models.dialogs.a aVar = (com.vk.im.engine.models.dialogs.a) linkedHashMap.get(Long.valueOf(j2));
            if (aVar != null) {
                int i = aVar.f;
                Map map = (Map) c400Var.h.get(Long.valueOf(j2));
                Msg msg = map != null ? (Msg) map.get(Integer.valueOf(i)) : null;
                new wfm(aVar, null).o(w2wVar);
                Serializer.c<Peer> cVar = Peer.CREATOR;
                new com.vk.im.engine.internal.merge.messages.b(Peer.a.b(j2), msg, false, true, 48).o(w2wVar);
            }
        } else if (w2wVar.getExperiments().n()) {
            Integer num2 = this.g;
            if (num2 == null) {
                com.vk.im.engine.models.dialogs.a aVar2 = (com.vk.im.engine.models.dialogs.a) linkedHashMap.get(Long.valueOf(j2));
                if (aVar2 != null) {
                    num = Integer.valueOf(aVar2.L);
                }
            } else {
                num = num2;
            }
            L.d(new d5(9, this, num));
            if (num == null) {
                f();
            } else {
                hpm c = sn.c(w2wVar);
                dhl0<com.vk.im.engine.models.dialogs.b, Long> dhl0Var = c.c;
                Long valueOf = Long.valueOf(j2);
                Integer num3 = this.e;
                Integer num4 = this.f;
                dhl0Var.a(valueOf, new hs1(num3, num4, num, 6), new g6(10, num, c));
                g(j2, num3, num4);
            }
        } else {
            f();
        }
        xgl0 I0 = w2wVar.I0();
        this.h = (gkx0) ((Map) I0.u(new mmm(I0, Collections.singletonList(Long.valueOf(j2)), w2wVar.getExperiments().n(), 0))).get(Long.valueOf(j2));
    }

    public final void f() {
        hpm c = sn.c(this.c);
        Peer peer = this.d;
        Integer num = this.f;
        Integer num2 = this.e;
        if (num2 == null || num == null) {
            if (num2 != null) {
                c.C(num2.intValue(), peer.b);
            }
            if (num != null) {
                c.c.a(Long.valueOf(peer.b), new fwh(num.intValue(), 1), new pcg(c, 15));
            }
        } else {
            long j = peer.b;
            int intValue = num2.intValue();
            int intValue2 = num.intValue();
            c.getClass();
            c.B(j, new vjm(intValue, intValue2));
        }
        g(peer.b, num2, num);
    }

    public final void g(long j, Integer num, Integer num2) {
        vjm vjmVar;
        final hpm c = sn.c(this.c);
        com.vk.im.engine.models.dialogs.b c2 = c.c(j);
        dhl0<com.vk.im.engine.models.dialogs.b, Long> dhl0Var = c.c;
        if (num != null) {
            if (epx.f((c2 == null || (vjmVar = c2.e) == null) ? null : Integer.valueOf(vjmVar.b), num)) {
                dhl0Var.a(Long.valueOf(j), new com.vk.movika.sdk.base.observable.u(22), new wje(c, 15));
                return;
            }
        }
        if (num2 != null) {
            final int intValue = num2.intValue();
            dhl0Var.a(Long.valueOf(j), new wom(intValue, 0), new izs() { // from class: xsna.xom
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                    long j2 = bVar.b;
                    vjm vjmVar2 = bVar.e;
                    if (vjmVar2 == null) {
                        return s3q0.a;
                    }
                    vjm e = vjm.e(vjmVar2, 0, intValue, 1);
                    String[] strArr = {String.valueOf(e.a()), String.valueOf(j2)};
                    tgl0 tgl0Var = c.b;
                    tgl0Var.b().execSQL("UPDATE dialogs SET sort_id_local = ? WHERE id = ?", strArr);
                    Object[] objArr = {Long.valueOf(e.a()), Long.valueOf(j2), -1};
                    tgl0Var.b().execSQL("UPDATE dialog_weight SET x_sort_id_local = ? WHERE x_dialog_id = ? AND x_folder_id = ?", objArr);
                    objArr[0] = Integer.valueOf(e.c);
                    tgl0Var.b().execSQL("UPDATE dialog_weight SET x_sort_id_local = ? WHERE x_dialog_id = ? AND x_folder_id != ?", objArr);
                    return s3q0.a;
                }
            });
        }
    }
}
