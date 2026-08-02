package xsna;

import java.util.Collection;
import java.util.Set;

/* compiled from: FolderPeersSelectNavigationEvent.kt */
/* loaded from: classes18.dex */
public abstract class qzr implements vl50 {

    /* compiled from: FolderPeersSelectNavigationEvent.kt */
    public static final class a extends qzr {
        public final Collection<Long> a;
        public final Collection<Long> b;

        public a(Set set, Set set2) {
            this.a = set;
            this.b = set2;
        }
    }

    /* compiled from: FolderPeersSelectNavigationEvent.kt */
    public static final class b extends qzr {
        public static final b a = new b();
    }
}
