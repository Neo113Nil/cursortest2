package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: ContactsPromoInfoGet.kt */
/* loaded from: classes2.dex */
public final class mcj extends le6<a> {

    /* compiled from: ContactsPromoInfoGet.kt */
    public static final class a {
        public final ArrayList a;
        public final int b;

        public a(ArrayList arrayList, int i) {
            this.a = arrayList;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContactsPromoInfo(promoContacts=");
            sb.append(this.a);
            sb.append(", allContactsSize=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public static ArrayList f(Collection collection, ProfilesSimpleInfo profilesSimpleInfo) {
        Collection<qtd0> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        for (qtd0 qtd0Var : collection2) {
            if (qtd0Var instanceof Contact) {
                Long l = ((Contact) qtd0Var).j;
                if (l == null) {
                    l = null;
                }
                qtd0 Ab = l != null ? profilesSimpleInfo.Ab(Long.valueOf(l.longValue())) : null;
                if (Ab != null) {
                    qtd0Var = Ab;
                }
            }
            arrayList.add(qtd0Var);
        }
        return arrayList;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        ProfilesSimpleInfo Ob = ((y8j) k9q0.f(w2wVar, this, new zaj(Source.CACHE, this, 10))).b.Ob();
        Collection values = Ob.c.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (((Contact) obj).j == null) {
                arrayList.add(obj);
            }
        }
        List D0 = j5g.D0(new ncj(), arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : values) {
            if (((Contact) obj2).j != null) {
                arrayList2.add(obj2);
            }
        }
        ArrayList u0 = j5g.u0(j5g.D0(new ocj(0), arrayList2), D0);
        if (u0.size() < 3) {
            return new a(f(u0, Ob), u0.size());
        }
        Object obj3 = nbj.a;
        ArrayList E = g5g.E(nbj.b(w2wVar.f1(), u0, Ob), Contact.class);
        return new a(f(E.size() < 3 ? j5g.u0(j5g.H0(j5g.D0(new pcj(0), j5g.t0(u0, E)), 3 - E.size()), E) : j5g.H0(E, 3), Ob), u0.size());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return mcj.class.equals(obj != null ? obj.getClass() : null);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 696491980;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ContactsPromoInfoGet";
    }
}
