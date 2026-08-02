package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import xsna.hf20;

/* compiled from: SharedDialogsGetCmd.kt */
/* loaded from: classes2.dex */
public final class z9j0 extends le6<a> {
    public final b b;

    /* compiled from: SharedDialogsGetCmd.kt */
    public static final class a {
        public final Map<Long, Dialog> a;
        public final ProfilesSimpleInfo b;

        public a(Map<Long, Dialog> map, ProfilesSimpleInfo profilesSimpleInfo) {
            this.a = map;
            this.b = profilesSimpleInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Result(dialogs=" + this.a + ", profiles=" + this.b + ')';
        }
    }

    /* compiled from: SharedDialogsGetCmd.kt */
    public static final class b {
        public final Peer a;

        public b(Peer peer) {
            this.a = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            return "SharedDialogsArgs(peer=" + this.a + ", isAwaitNetwork=true)";
        }
    }

    public z9j0(b bVar) {
        this.b = bVar;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        ArrayList arrayList = ((hf20.b) bz2.c(new hf20(this.b.a), "MessagesGetSharedConversationsApiCmd")).b;
        new wfm(arrayList, null, 0, 14).o(w2wVar);
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long j = ((com.vk.im.engine.models.dialogs.a) it.next()).a;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList2.add(Peer.a.b(j));
        }
        return new a(((wpp) w2wVar.J0(this, new tqm(arrayList2, Source.CACHE)).await()).c, new ProfilesSimpleInfo());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z9j0) && epx.f(this.b, ((z9j0) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "SharedDialogsGetCmd(args=" + this.b + ')';
    }
}
