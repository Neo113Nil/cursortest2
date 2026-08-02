package xsna;

import android.app.Activity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ActiveVkMixMeta.kt */
/* loaded from: classes16.dex */
public final class r80 implements fkd {
    public Serializable a;
    public Object b;
    public Object c;

    @Override // xsna.fkd
    public void b(Activity activity, int i) {
        Object obj;
        Iterator it = ((ArrayList) this.a).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ckd) obj).a == i) {
                    break;
                }
            }
        }
        ckd ckdVar = (ckd) obj;
        if (ckdVar != null) {
            ckdVar.b(activity, (ikd) this.b, (nkd) this.c);
        }
    }
}
