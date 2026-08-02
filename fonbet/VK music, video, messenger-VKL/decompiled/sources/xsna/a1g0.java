package xsna;

import android.util.Base64;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.engine.models.users.User;
import com.vk.instantjobs.InstantJob;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.u6x;

/* compiled from: ReplaceMsgsAttachesJob.kt */
/* loaded from: classes.dex */
public final class a1g0 extends u4w {
    public final AttachWithId c;

    /* compiled from: ReplaceMsgsAttachesJob.kt */
    public static final class a implements s7x<a1g0> {
        @Override // xsna.s7x
        public final a1g0 a(ny90 ny90Var) {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(ny90Var.f("attach"), 0)));
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                Serializer.StreamParcelable G = new Serializer.d(dataInputStream).G(AttachWithId.class.getClassLoader());
                dataInputStream.close();
                return new a1g0((AttachWithId) G);
            } finally {
            }
        }

        @Override // xsna.s7x
        public final void b(a1g0 a1g0Var, ny90 ny90Var) {
            ny90Var.o("attach", dni0.a(a1g0Var.c));
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ReplaceMsgsAttachesJob";
        }
    }

    public a1g0(AttachWithId attachWithId) {
        this.c = attachWithId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        r3b y = w2wVar.I0().y();
        xgl0 I0 = w2wVar.I0();
        AttachWithId attachWithId = this.c;
        Map map = (Map) I0.u(new com.vk.libvideo.design.view.video.a(y, attachWithId, this));
        if (!map.isEmpty()) {
            w2wVar.e1(this, new o280(this, map));
            w2wVar.S0().O(attachWithId);
        }
        hpm c = sn.c(w2wVar);
        d040 o = w2wVar.I0().o();
        Map<Long, PinnedMsg> I = c.I(attachWithId.getClass(), attachWithId.q(), Long.valueOf(attachWithId.getId()));
        List<Msg> Y = o.Y(attachWithId.getClass(), attachWithId.q(), Long.valueOf(attachWithId.getId()));
        if (I.isEmpty() && Y.isEmpty()) {
            return;
        }
        if (attachWithId instanceof AttachPoll) {
            AttachPoll attachPoll = (AttachPoll) attachWithId;
            if (!attachPoll.d().Cb().isEmpty()) {
                Map<UserId, Owner> Hb = attachPoll.d().Hb();
                List<UserId> Cb = attachPoll.d().Cb();
                ArrayList arrayList = new ArrayList(c5g.u(Cb, 10));
                Iterator<T> it = Cb.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.vk.dto.common.a.a((UserId) it.next()));
                }
                HashMap hashMap = ((wpp) w2wVar.L0(this, new b1r0(arrayList, Source.CACHE))).c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (UserId userId : Hb.keySet()) {
                    User user = (User) hashMap.get(Long.valueOf(userId.b));
                    if (user != null) {
                        linkedHashMap.put(userId, new Owner(userId, user.Db(), user.i().Fb(), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194296, null));
                    }
                }
                attachPoll.d().Lb(linkedHashMap);
            }
        }
        b140 b140Var = new b140(attachWithId, 15);
        fa00 fa00Var = new fa00(attachWithId, 19);
        Iterator<Map.Entry<Long, PinnedMsg>> it2 = I.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().u8(b140Var, fa00Var);
        }
        List<Msg> list = Y;
        Iterator it3 = g5g.E(list, MsgFromUser.class).iterator();
        while (it3.hasNext()) {
            ((MsgFromUser) it3.next()).u8(b140Var, fa00Var);
        }
        w2wVar.I0().u(new lxo(c, I, o, Y, 1));
        w2wVar.S0().n("ReplaceMsgsAttachesJob", I.keySet());
        ArrayList E = g5g.E(list, com.vk.im.engine.models.messages.a.class);
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = E.iterator();
        while (it4.hasNext()) {
            g5g.y(((com.vk.im.engine.models.messages.a) it4.next()).K0(), arrayList2);
        }
        List H0 = j5g.H0(j5g.D0(new drt(2), arrayList2), 10);
        ArrayList arrayList3 = new ArrayList(c5g.u(H0, 10));
        Iterator it5 = H0.iterator();
        while (it5.hasNext()) {
            arrayList3.add(new y080((Attach) it5.next(), "ReplaceMsgsAttachesJob"));
        }
        w2wVar.T0(this, arrayList3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1g0) && epx.f(this.c, ((a1g0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return "msg-attaches-updates";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "ReplaceMsgsAttachesJob";
    }

    public final String toString() {
        return "ReplaceMsgsAttachesJob(attach=" + this.c + ')';
    }
}
