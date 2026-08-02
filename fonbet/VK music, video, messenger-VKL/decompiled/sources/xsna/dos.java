package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FriendsBindListener.kt */
/* loaded from: classes16.dex */
public final class dos implements vls {
    public final ArrayList a;

    public dos(vls... vlsVarArr) {
        this.a = rl3.w0(vlsVarArr);
    }

    @Override // xsna.vls
    public final void a(UIBlock uIBlock) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((vls) it.next()).a(uIBlock);
        }
    }

    public final void b(vls vlsVar) {
        this.a.add(vlsVar);
    }
}
