package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.commands.contacts.ContactsSearchCmd;
import java.util.Comparator;
import xsna.fcw;

/* compiled from: ContactsRepository.kt */
/* loaded from: classes2.dex */
public final class xcj implements fcw {
    public final a1w a;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(((q2a0) t).La(), ((q2a0) t2).La());
        }
    }

    public xcj(a1w a1wVar) {
        this.a = a1wVar;
    }

    @Override // xsna.fcw
    public final io.reactivex.rxjava3.core.x<gcw> a(fcw.a aVar, Object obj) {
        ContactsSearchCmd.a cVar;
        ContactsSearchCmd.MatchType matchType;
        b25 a2 = o25.a();
        a1w a1wVar = this.a;
        Peer q = a1wVar.q();
        cau0 cau0Var = a1wVar.r().h;
        q.getClass();
        if (!q.Ab(Peer.Type.GROUP) && (!o25.b(a2) || a2.i().S)) {
            cVar = new ContactsSearchCmd.a.C1108a();
            matchType = ContactsSearchCmd.MatchType.ANY;
        } else {
            cVar = new ContactsSearchCmd.a.c();
            matchType = ContactsSearchCmd.MatchType.BY_NAME;
        }
        return a1wVar.C(obj, new ContactsSearchCmd(aVar.a, cVar, matchType)).l(new xl0(new wcj(aVar, 0), 15));
    }
}
