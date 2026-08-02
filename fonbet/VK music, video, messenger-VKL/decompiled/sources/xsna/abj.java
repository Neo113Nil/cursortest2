package xsna;

import android.util.ArraySet;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.contacts.Contact;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ContactsGetByIdsCmd.kt */
/* loaded from: classes2.dex */
public final class abj extends le6<wpp<Long, Contact>> {
    public final Collection<Long> b;
    public final Source c;
    public final boolean d;
    public final Object e;

    /* compiled from: ContactsGetByIdsCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public abj(Collection<Long> collection, Source source, boolean z, Object obj) {
        this.b = collection;
        this.c = source;
        this.d = z;
        this.e = obj;
    }

    @Override // xsna.le6
    public final wpp<Long, Contact> e(w2w w2wVar) {
        Collection<Long> collection = this.b;
        if (collection.isEmpty()) {
            return new wpp<>();
        }
        int i = a.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i == 1) {
            return f(w2wVar);
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            g(collection, w2wVar);
            return f(w2wVar);
        }
        wpp<Long, Contact> f = f(w2wVar);
        if (!f.f()) {
            return f;
        }
        g(f.a(), w2wVar);
        return f(w2wVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abj)) {
            return false;
        }
        abj abjVar = (abj) obj;
        return epx.f(this.b, abjVar.b) && this.c == abjVar.c && this.d == abjVar.d && epx.f(this.e, abjVar.e);
    }

    public final wpp<Long, Contact> f(w2w w2wVar) {
        hdj w = w2wVar.I0().w();
        Collection<Long> collection = this.b;
        Map<Long, Contact> d = w.d(collection);
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(d.size()));
        Iterator<T> it = d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Contact contact = (Contact) entry.getValue();
            if (contact.c.length() == 0) {
                contact = Contact.zb(contact, w2wVar.getConfig().V.a.a(contact.d).toString(), false, null, null, 0L, 0L, 32765);
            }
            linkedHashMap.put(key, contact);
        }
        long f1 = w2wVar.f1() - w2wVar.getConfig().y;
        ArraySet arraySet = new ArraySet();
        ArraySet arraySet2 = new ArraySet();
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            long longValue = ((Number) it2.next()).longValue();
            Contact contact2 = (Contact) linkedHashMap.get(Long.valueOf(longValue));
            if (contact2 == null) {
                arraySet.add(Long.valueOf(longValue));
            } else if (contact2.k <= f1) {
                arraySet2.add(Long.valueOf(longValue));
            }
        }
        wpp<Long, Contact> wppVar = new wpp<>(linkedHashMap);
        wppVar.t(arraySet);
        wppVar.s(arraySet2);
        return wppVar;
    }

    public final void g(Collection collection, w2w w2wVar) {
        new ccj(true, w2wVar.f1(), (Map) bz2.c(new ne20(collection, w2wVar.getDeviceId(), this.d), "MessagesGetContactsByIdApiCmd")).o(w2wVar);
        w2wVar.S0().i();
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        Object obj = this.e;
        return b + (obj == null ? 0 : obj.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactsGetByIdsCmd(contactIds=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", awaitNetwork=");
        sb.append(this.d);
        sb.append(", changerTag=");
        return k73.c(sb, this.e, ')');
    }
}
