package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cbl implements c4x {
    public final pdk a;
    public final pdk b;
    public final m3k c;
    public final String d;
    public final List e;
    public Integer f;

    public cbl(pdk pdkVar, pdk pdkVar2, m3k m3kVar, String str, List list) {
        this.a = pdkVar;
        this.b = pdkVar2;
        this.c = m3kVar;
        this.d = str;
        this.e = list;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((jbl) ft6.b.J7.getValue()).b(ft6.a, this);
    }
}
