package defpackage;

import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class ifw {
    public final r0 a = bvf0.c(null);
    public final r0 b;
    public final mth c;

    public ifw() {
        r0 c = bvf0.c(null);
        this.b = c;
        this.c = new mth(c, 6);
    }

    public final v8b1 a() {
        hfw hfwVar = (hfw) this.a.getValue();
        if (hfwVar != null) {
            return hfwVar.b;
        }
        return null;
    }

    public final String b() {
        hfw hfwVar = (hfw) this.a.getValue();
        String str = hfwVar != null ? hfwVar.a : null;
        return str == null ? "" : str;
    }
}
