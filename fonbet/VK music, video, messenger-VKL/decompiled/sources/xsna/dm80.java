package xsna;

import java.util.Comparator;
import java.util.List;

/* compiled from: Comparisons.kt */
/* loaded from: classes8.dex */
public final class dm80<T> implements Comparator {
    public final /* synthetic */ List b;

    public dm80(List list) {
        this.b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String str = ((hq10) t).a;
        List list = this.b;
        return jw5.b(Integer.valueOf(list.indexOf(str)), Integer.valueOf(list.indexOf(((hq10) t2).a)));
    }
}
