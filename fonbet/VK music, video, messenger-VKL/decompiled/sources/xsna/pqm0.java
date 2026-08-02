package xsna;

import com.vk.core.preference.Preference;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: PreferenceDelegates.kt */
/* loaded from: classes.dex */
public final class pqm0 implements p7f0, kjk0 {
    public final Serializable b;
    public final Object c;

    public pqm0() {
        EmptyList emptyList = EmptyList.b;
        this.b = emptyList;
        ArrayList arrayList = new ArrayList(c5g.u(emptyList, 10));
        Iterator<E> it = emptyList.iterator();
        while (it.hasNext()) {
            arrayList.add(((jjk0) it.next()).e());
        }
        this.c = j5g.S0(arrayList);
    }

    @Override // xsna.i7f0
    public Object getValue(Object obj, qcy qcyVar) {
        String str = (String) this.b;
        String str2 = (String) this.c;
        Preference preference = Preference.a;
        return Preference.u(EmptySet.b, str, str2);
    }

    @Override // xsna.p7f0
    public void setValue(Object obj, qcy qcyVar, Object obj2) {
        Preference.K((Set) obj2, (String) this.b, (String) this.c);
    }

    public pqm0(String str, String str2) {
        this.b = str;
        this.c = str2;
    }
}
