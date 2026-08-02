package xsna;

import com.vk.games.presentation.catalog.model.SectionTypePrefixKey;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CategoryDetailItem.kt */
/* loaded from: classes17.dex */
public final class qka {
    public final ArrayList a;
    public final String b;

    public qka(ArrayList arrayList) {
        this.a = arrayList;
        StringBuilder sb = new StringBuilder();
        sb.append(SectionTypePrefixKey.GAMES_DETAIL_SECTION.h());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h8t h8tVar = (h8t) it.next();
            sb.append('_');
            sb.append(h8tVar.b);
        }
        this.b = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qka) && this.a.equals(((qka) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return bo.c(')', new StringBuilder("CategoryDetailItem(items="), this.a);
    }
}
