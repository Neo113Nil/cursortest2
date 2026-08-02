package xsna;

import com.vk.voip.ui.sessionrooms.f;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: AddOrRenameSessionRoomDialog.kt */
/* loaded from: classes7.dex */
public final class xm0 implements izs {
    public final /* synthetic */ String b;
    public final /* synthetic */ ym0 c;

    public xm0(String str, ym0 ym0Var) {
        this.b = str;
        this.c = ym0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        Iterator it = ((Collection) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            f.a.b bVar = (f.a.b) obj2;
            if (epx.f(bVar.b, this.b) && !epx.f(bVar.a, this.c.h1)) {
                break;
            }
        }
        return Boolean.valueOf(obj2 == null);
    }
}
