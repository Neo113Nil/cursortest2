package xsna;

import com.vk.im.engine.models.dialogs.Dialog;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MsgSearchPeersInteractor.kt */
/* loaded from: classes2.dex */
public final class xx30 {
    public final a1w a;
    public final b25 b;
    public final b c;
    public final fy30 d;
    public final dy30 e;
    public final ey30 f;
    public final bpn0 g = new bpn0(new l500(this, 9));

    /* compiled from: MsgSearchPeersInteractor.kt */
    public interface a {
        boolean a(Dialog dialog);

        boolean b(Dialog dialog);
    }

    /* compiled from: MsgSearchPeersInteractor.kt */
    public static final class b {
        public final sqw a;
        public final r9f0 b;
        public final sqw c;
        public final r9f0 d;
        public final my8 e;
        public final xcj f;
        public final rmm g;
        public final tw30 h;
        public final q2u i;

        public b(sqw sqwVar, r9f0 r9f0Var, sqw sqwVar2, r9f0 r9f0Var2, my8 my8Var, xcj xcjVar, rmm rmmVar, tw30 tw30Var, q2u q2uVar) {
            this.a = sqwVar;
            this.b = r9f0Var;
            this.c = sqwVar2;
            this.d = r9f0Var2;
            this.e = my8Var;
            this.f = xcjVar;
            this.g = rmmVar;
            this.h = tw30Var;
            this.i = q2uVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "SearchRepositories(localImportantDialogsRepository=" + this.a + ", localRecentSearchedDialogsRepository=" + this.b + ", remoteImportantDialogsRepository=" + this.c + ", remoteRecentSearchedDialogsRepository=" + this.d + ", cachedSearchedDialogsRepository=" + this.e + ", contactsRepository=" + this.f + ", dialogWithSelfRepository=" + this.g + ", msgSearchConversationsRepository=" + this.h + ", globalUsersSearchRepository=" + this.i + ')';
        }
    }

    public xx30(a1w a1wVar, b25 b25Var, b bVar, fy30 fy30Var, dy30 dy30Var, ey30 ey30Var) {
        this.a = a1wVar;
        this.b = b25Var;
        this.c = bVar;
        this.d = fy30Var;
        this.e = dy30Var;
        this.f = ey30Var;
    }

    public static io.reactivex.rxjava3.internal.operators.single.n0 a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            io.reactivex.rxjava3.core.x xVar = (io.reactivex.rxjava3.core.x) it.next();
            asu0.a.getClass();
            arrayList2.add(xVar.q(asu0.r()));
        }
        return io.reactivex.rxjava3.core.x.D(arrayList2, new do3(new wx30(0), 25));
    }
}
