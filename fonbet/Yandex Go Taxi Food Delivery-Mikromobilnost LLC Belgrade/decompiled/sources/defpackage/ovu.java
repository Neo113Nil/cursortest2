package defpackage;

import com.apollographql.apollo3.api.d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ovu implements rko {
    public static final wly0 c = new wly0();
    public final int a;
    public final ArrayList b;

    public ovu(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.tko
    public final tko a(sko skoVar) {
        return c != skoVar ? this : ovn.a;
    }

    @Override // defpackage.tko
    public final tko b(tko tkoVar) {
        return d.a(this, tkoVar);
    }

    @Override // defpackage.tko
    public final rko c(sko skoVar) {
        if (c != skoVar) {
            return null;
        }
        return this;
    }

    @Override // defpackage.tko
    public final Object fold(Object obj, wls wlsVar) {
        return wlsVar.invoke(obj, this);
    }

    @Override // defpackage.rko
    public final sko getKey() {
        return c;
    }
}
