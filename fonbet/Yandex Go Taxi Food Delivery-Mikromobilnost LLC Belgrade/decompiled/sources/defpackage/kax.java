package defpackage;

import java.util.LinkedHashMap;
import kotlin.collections.a;

/* loaded from: classes6.dex */
public final class kax implements fax, lbx {
    public final LinkedHashMap a;

    public kax(int i) {
        this.a = new LinkedHashMap();
    }

    @Override // defpackage.lbx
    public final String a() {
        StringBuilder sb = new StringBuilder();
        a.W(this.a.values(), sb, "\n", new mtw(7), 60);
        return sb.toString();
    }

    @Override // defpackage.fax
    public final String d() {
        return null;
    }

    @Override // defpackage.fax
    public final LinkedHashMap getChildren() {
        return this.a;
    }

    public kax() {
        this(0);
    }
}
