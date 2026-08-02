package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public final class mjd implements dh2 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public mjd(dh2[] dh2VarArr) {
        this.b = j73.d0(dh2VarArr);
    }

    @Override // defpackage.dh2
    public final KSerializer decoder(String str) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    KSerializer decoder = ((dh2) it.next()).decoder(str);
                    if (decoder != null) {
                        return decoder;
                    }
                }
                return null;
            default:
                return ((gj2) obj).select(str);
        }
    }

    public mjd(gj2 gj2Var) {
        this.b = gj2Var;
    }
}
