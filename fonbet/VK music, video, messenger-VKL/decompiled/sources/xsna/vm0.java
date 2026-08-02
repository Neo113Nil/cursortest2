package xsna;

import com.vk.common.view.EditText;
import com.vk.voip.ui.sessionrooms.f;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: AddOrRenameSessionRoomDialog.kt */
/* loaded from: classes7.dex */
public final class vm0 implements izs<?, s3q0> {
    public final /* synthetic */ ym0 b;
    public final /* synthetic */ EditText c;

    public vm0(ym0 ym0Var, EditText editText) {
        this.b = ym0Var;
        this.c = editText;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Object obj) {
        Object obj2;
        Iterator it = ((Collection) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (epx.f(((f.a.b) obj2).a, this.b.h1)) {
                break;
            }
        }
        f.a.b bVar = (f.a.b) obj2;
        if (bVar != null) {
            this.c.setText(bVar.b);
        }
        return s3q0.a;
    }
}
