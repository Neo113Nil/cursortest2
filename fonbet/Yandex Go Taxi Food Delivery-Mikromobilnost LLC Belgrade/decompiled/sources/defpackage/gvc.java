package defpackage;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes10.dex */
public final class gvc implements Comparator {
    public final boolean a;

    public gvc(boolean z) {
        this.a = z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.a ? signum * (-1) : signum;
    }

    public gvc() {
        this(false);
    }
}
