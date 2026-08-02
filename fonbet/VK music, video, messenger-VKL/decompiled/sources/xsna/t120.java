package xsna;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: MemCacheRegistry.kt */
/* loaded from: classes.dex */
public final class t120 implements j601 {
    public final Object b;

    public t120(yuz0 yuz0Var) {
        this.b = yuz0Var;
    }

    @Override // xsna.j601
    public Object zza() {
        bs01 c = bs01.c(((yuz0) this.b).a);
        if (c != null) {
            return c;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public t120(int i) {
        switch (i) {
            case 1:
                this.b = new LinkedHashSet();
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }
}
