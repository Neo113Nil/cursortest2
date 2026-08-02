package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.engine.models.messages.DraftMsg;

/* compiled from: DialogsUpdateDraftMsgCmd.kt */
/* loaded from: classes2.dex */
public final class swm extends le6<a> {
    public final Peer b;
    public final DraftMsg c;
    public final Object d;

    /* compiled from: DialogsUpdateDraftMsgCmd.kt */
    public interface a {

        /* compiled from: DialogsUpdateDraftMsgCmd.kt */
        /* renamed from: xsna.swm$a$a, reason: collision with other inner class name */
        public static final class C3697a implements a {
            public static final C3697a a = new C3697a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3697a);
            }

            public final int hashCode() {
                return 1333461444;
            }

            public final String toString() {
                return "Created";
            }
        }

        /* compiled from: DialogsUpdateDraftMsgCmd.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1855369973;
            }

            public final String toString() {
                return "Deleted";
            }
        }

        /* compiled from: DialogsUpdateDraftMsgCmd.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -866694139;
            }

            public final String toString() {
                return "NotChanged";
            }
        }

        /* compiled from: DialogsUpdateDraftMsgCmd.kt */
        public static final class d implements a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 70476695;
            }

            public final String toString() {
                return "Updated";
            }
        }
    }

    public swm(Peer peer, DraftMsg draftMsg, String str) {
        this.b = peer;
        this.c = draftMsg;
        this.d = str;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        a aVar;
        hpm c = sn.c(w2wVar);
        long j = this.b.b;
        com.vk.im.engine.models.dialogs.b d = c.c.d(Long.valueOf(j));
        DraftMsg draftMsg = d != null ? d.v : null;
        if (draftMsg == null) {
            draftMsg = DraftMsg.h;
        }
        DraftMsg draftMsg2 = this.c;
        if (epx.f(draftMsg, draftMsg2) || (draftMsg.isEmpty() && draftMsg2.isEmpty())) {
            return a.c.a;
        }
        boolean isEmpty = draftMsg2.isEmpty();
        Object obj = this.d;
        if (isEmpty) {
            c.k0(j, new DraftMsg(w2wVar.f1(), null, null, null, null, null, 62, null));
            w2wVar.S0().I(j, obj);
            aVar = a.b.a;
        } else {
            c.k0(j, draftMsg2);
            aVar = draftMsg.d() ? a.d.a : a.C3697a.a;
        }
        xgl0 I0 = w2wVar.I0();
        w2wVar.S0().v(j, obj);
        w2wVar.S0().u(this, OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swm)) {
            return false;
        }
        swm swmVar = (swm) obj;
        return epx.f(this.b, swmVar.b) && epx.f(this.c, swmVar.c) && epx.f(this.d, swmVar.d);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31;
        Object obj = this.d;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsUpdateDraftMsgCmd(peer=");
        sb.append(this.b);
        sb.append(", draft=");
        sb.append(this.c);
        sb.append(", changerTag=");
        return k73.c(sb, this.d, ')');
    }
}
