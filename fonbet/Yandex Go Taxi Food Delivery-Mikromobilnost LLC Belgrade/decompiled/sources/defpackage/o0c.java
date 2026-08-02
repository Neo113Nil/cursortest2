package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class o0c {
    public final ReferenceQueue a = new ReferenceQueue();
    public final Set b = Collections.synchronizedSet(new HashSet());
}
