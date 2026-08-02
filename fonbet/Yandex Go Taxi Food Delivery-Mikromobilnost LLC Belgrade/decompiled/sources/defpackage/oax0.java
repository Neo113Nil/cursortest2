package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class oax0 implements hey {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.hey
    public final void onDestroy() {
        Iterator it = pw21.i(this.a).iterator();
        while (it.hasNext()) {
            ((iax0) it.next()).onDestroy();
        }
    }

    @Override // defpackage.hey
    public final void onStart() {
        Iterator it = pw21.i(this.a).iterator();
        while (it.hasNext()) {
            ((iax0) it.next()).onStart();
        }
    }

    @Override // defpackage.hey
    public final void onStop() {
        Iterator it = pw21.i(this.a).iterator();
        while (it.hasNext()) {
            ((iax0) it.next()).onStop();
        }
    }
}
