package xsna;

import java.io.File;
import java.util.Comparator;
import java.util.Locale;

/* compiled from: Comparisons.kt */
/* loaded from: classes17.dex */
public final class i5l<T> implements Comparator {
    public final /* synthetic */ h5l b;

    public i5l(h5l h5lVar) {
        this.b = h5lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.b.compare(t, t2);
        if (compare != 0) {
            return compare;
        }
        String name = ((File) t).getName();
        Locale locale = Locale.ROOT;
        return jw5.b(name.toLowerCase(locale), ((File) t2).getName().toLowerCase(locale));
    }
}
