package defpackage;

import android.os.LocaleList;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class ea2 {
    public LocaleList a;
    public k5z b;
    public final i1x0 c = new i1x0();

    public final k5z a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.c) {
            k5z k5zVar = this.b;
            if (k5zVar != null && localeList == this.a) {
                return k5zVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new h5z(localeList.get(i)));
            }
            k5z k5zVar2 = new k5z(arrayList);
            this.a = localeList;
            this.b = k5zVar2;
            return k5zVar2;
        }
    }
}
