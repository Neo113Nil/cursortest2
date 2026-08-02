package xsna;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: VkMusicHintsManager.kt */
/* loaded from: classes3.dex */
public final class x5v0 implements ll40 {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // xsna.ll40
    public final void a() {
        Iterator it = j5g.V(this.a.values()).iterator();
        while (it.hasNext()) {
            ((dcn) it.next()).dismiss();
        }
    }
}
