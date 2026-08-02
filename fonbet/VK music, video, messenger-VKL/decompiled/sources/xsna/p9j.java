package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.contacts.Contact;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ContactProfilesLoadAndGet.kt */
/* loaded from: classes2.dex */
public final class p9j extends xl6<Map<String, ? extends Contact>> {
    public final Object b;

    public p9j() {
        this(null);
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-contacts-sync";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        List<Contact> all = w2wVar.I0().w().p() ? w2wVar.I0().w().getAll() : g5g.E((Iterable) w2wVar.b1(this, new com.vk.im.engine.commands.contacts.a(Source.NETWORK, this.b, 8)), Contact.class);
        HashMap hashMap = new HashMap(all.size());
        for (Contact contact : all) {
            hashMap.put(contact.i, contact);
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9j) && epx.f(this.b, ((p9j) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return k73.c(new StringBuilder("ContactProfilesLoadAndGet(changerTag="), this.b, ')');
    }

    public p9j(String str) {
        this.b = str;
    }
}
