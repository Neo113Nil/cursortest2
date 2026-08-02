package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Quirks.java */
/* loaded from: classes11.dex */
public final class sse0 {

    @NonNull
    public final ArrayList a;

    public sse0(@NonNull ArrayList arrayList) {
        this.a = new ArrayList(arrayList);
    }

    @Nullable
    public final <T extends rse0> T a(@NonNull Class<T> cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }
}
