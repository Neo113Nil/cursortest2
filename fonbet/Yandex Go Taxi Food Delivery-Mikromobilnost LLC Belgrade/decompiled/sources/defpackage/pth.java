package defpackage;

import java.util.Comparator;

/* loaded from: classes9.dex */
public final class pth implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(((isi) obj).getTimestamp()).compareTo(Long.valueOf(((isi) obj2).getTimestamp()));
    }
}
