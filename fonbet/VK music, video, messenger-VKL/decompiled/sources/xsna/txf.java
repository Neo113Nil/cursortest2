package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: CnvMsgInvalidateLpTask.kt */
/* loaded from: classes2.dex */
public final class txf extends e500 {
    public final w2w c;
    public final Peer d;
    public final int e;
    public Msg f;
    public final Integer g;
    public final Integer h;
    public long i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;

    public txf(w2w w2wVar, Peer peer, int i, Msg msg, Integer num, Integer num2) {
        super("CnvMsgInvalidateLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = i;
        this.f = msg;
        this.g = num;
        this.h = num2;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        LinkedHashMap linkedHashMap = c400Var.h;
        if (this.m) {
            return;
        }
        Msg msg = this.f;
        Peer peer = this.d;
        long j = peer.b;
        long j2 = peer.b;
        Map map = (Map) linkedHashMap.get(Long.valueOf(j));
        boolean z = false;
        int i = this.e;
        boolean containsKey = map != null ? map.containsKey(Integer.valueOf(i)) : false;
        if (msg != null || containsKey) {
            Map map2 = (Map) linkedHashMap.get(Long.valueOf(j2));
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
        f400Var.d(i, j2);
        this.m = true;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        if (this.k) {
            z300Var.g(this.i);
        }
        if (this.l) {
            z300Var.j(this.j, this.i);
        }
    }

    @Override // xsna.e500
    public final void c() {
        gtx0 gtx0Var;
        boolean z;
        List<NestedMsg> q7;
        Integer num = this.g;
        if (num == null || this.f == null) {
            return;
        }
        Msg t0 = this.c.I0().o().t0(num.intValue(), this.i);
        if (t0 == null || !((z = (gtx0Var = this.f) instanceof com.vk.im.engine.models.messages.a))) {
            this.f = null;
            return;
        }
        com.vk.im.engine.models.messages.a aVar = z ? (com.vk.im.engine.models.messages.a) gtx0Var : null;
        if (aVar == null || (q7 = aVar.q7()) == null) {
            return;
        }
        q7.add(new NestedMsg(t0, NestedMsg.Type.REPLY));
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        Msg msg;
        Integer num;
        Map map = (Map) c400Var.h.get(Long.valueOf(this.d.b));
        if ((map == null || (msg = (Msg) map.get(Integer.valueOf(this.e))) == null) && (msg = this.f) == null) {
            return;
        }
        this.i = msg.c;
        boolean z = msg.D;
        w2w w2wVar = this.c;
        if (z) {
            sn.c(w2wVar).F(msg.d, this.i);
        }
        MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
        if (msgFromUser != null && (num = this.h) != null) {
            msgFromUser.R = Integer.valueOf(num.intValue());
        }
        w2wVar.I0().u(new nv2(11, this, msg));
    }
}
