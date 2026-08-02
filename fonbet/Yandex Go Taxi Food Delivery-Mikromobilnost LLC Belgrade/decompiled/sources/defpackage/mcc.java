package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes9.dex */
public abstract class mcc extends jcc {
    @Override // defpackage.a7
    public final Iterator c(Object obj) {
        return ((Collection) obj).iterator();
    }

    @Override // defpackage.a7
    public final int d(Object obj) {
        return ((Collection) obj).size();
    }
}
