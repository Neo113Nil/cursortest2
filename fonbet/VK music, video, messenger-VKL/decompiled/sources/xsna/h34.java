package xsna;

import java.util.LinkedHashMap;
import xsna.g34;

/* compiled from: AttachProgressMediator.kt */
/* loaded from: classes2.dex */
public final class h34 implements g34 {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // xsna.g34
    public final void a(int i, g34.a aVar) {
        this.a.put(Integer.valueOf(i), aVar);
    }

    public final void b(int i, int i2, int i3) {
        g34.a aVar = (g34.a) this.a.get(Integer.valueOf(i));
        if (aVar != null) {
            aVar.e(i, i2, i3);
        }
    }
}
