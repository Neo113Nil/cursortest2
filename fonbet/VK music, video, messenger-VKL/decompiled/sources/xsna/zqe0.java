package xsna;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import kotlin.collections.EmptySet;

/* compiled from: QueueApiManager.kt */
/* loaded from: classes.dex */
public interface zqe0 {
    default tre0 a(HashSet hashSet) {
        return new tre0(jgp.b, EmptySet.b);
    }

    cre0 b(long j, String str, Collection collection);

    void c(Collection collection);

    Map d(HashSet hashSet);
}
