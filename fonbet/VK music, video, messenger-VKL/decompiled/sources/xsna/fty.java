package xsna;

import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes11.dex */
public final class fty<T> implements Comparator {
    public final /* synthetic */ jty b;

    public fty(jty jtyVar) {
        this.b = jtyVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Object key = ((rty) t2).getKey();
        jty jtyVar = this.b;
        return jw5.b(Integer.valueOf(jtyVar.b(key)), Integer.valueOf(jtyVar.b(((rty) t).getKey())));
    }
}
