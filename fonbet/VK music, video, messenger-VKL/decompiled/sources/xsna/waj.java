package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ContactSyncEvents.kt */
/* loaded from: classes17.dex */
public final class waj extends daj {
    public final ArrayList a;

    public waj(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final List<Long> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof waj) && epx.f(this.a, ((waj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("ContactsDeleted(contactIds="), this.a);
    }
}
