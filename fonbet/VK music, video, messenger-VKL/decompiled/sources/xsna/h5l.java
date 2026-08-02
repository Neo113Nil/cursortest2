package xsna;

import java.io.File;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes17.dex */
public final class h5l<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return jw5.b(Boolean.valueOf(!((File) t).isDirectory()), Boolean.valueOf(!((File) t2).isDirectory()));
    }
}
