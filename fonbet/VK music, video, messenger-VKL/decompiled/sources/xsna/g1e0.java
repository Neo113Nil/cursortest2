package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogMember;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: ProfilesInfoGetArgs.kt */
/* loaded from: classes2.dex */
public final class g1e0 {
    public final f1e0 a;
    public final Source b;
    public final boolean c;
    public final Object d;

    /* compiled from: ProfilesInfoGetArgs.kt */
    public static final class a {
        public final f1e0 a = new f1e0();
        public Source b = Source.CACHE;
        public boolean c;
        public Object d;

        public final void a() {
            this.c = true;
        }

        public final g1e0 b() {
            return new g1e0(this);
        }

        public final void c(Object obj) {
            this.d = obj;
        }

        public final void d(Collection collection) {
            this.a.b(Peer.Type.CONTACT, collection);
        }

        public final void e(Collection collection) {
            this.a.b(Peer.Type.EMAIL, collection);
        }

        public final void f(Collection collection) {
            this.a.b(Peer.Type.GROUP, collection);
        }

        public final void g(f1e0 f1e0Var) {
            this.a.e(f1e0Var);
        }

        public final void h(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.a.c((Peer) it.next());
            }
        }

        public final void i(ohm ohmVar) {
            ListIterator listIterator = ohmVar.b.listIterator();
            while (listIterator.hasNext()) {
                DialogMember dialogMember = (DialogMember) listIterator.next();
                Peer peer = dialogMember.b;
                f1e0 f1e0Var = this.a;
                f1e0Var.c(peer);
                if (dialogMember.zb()) {
                    f1e0Var.c(dialogMember.c);
                }
            }
        }

        public final void j(Source source) {
            this.b = source;
        }

        public final void k(Collection collection) {
            this.a.b(Peer.Type.USER, collection);
        }
    }

    public g1e0(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1e0)) {
            return false;
        }
        g1e0 g1e0Var = (g1e0) obj;
        return epx.f(this.a, g1e0Var.a) && this.b == g1e0Var.b && this.c == g1e0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + io.reactivex.rxjava3.internal.operators.mixed.k.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MembersInfoGetArgs(ids=");
        sb.append(this.a.j(new f1s(22)));
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", isAwaitNetwork=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g1e0(Peer peer, Source source) {
        this(r0);
        a aVar = new a();
        aVar.a.c(peer);
        aVar.b = source;
        aVar.c = true;
        aVar.d = null;
    }
}
