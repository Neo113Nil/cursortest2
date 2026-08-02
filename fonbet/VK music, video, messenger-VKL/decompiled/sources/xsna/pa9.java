package xsna;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: VoipCallViewAnimationDelegate.kt */
/* loaded from: classes7.dex */
public final class pa9 implements qa9 {
    public final ArrayList b = new ArrayList();

    @Override // xsna.qa9
    public final void a(float f) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((qa9) it.next()).a(f);
        }
    }
}
