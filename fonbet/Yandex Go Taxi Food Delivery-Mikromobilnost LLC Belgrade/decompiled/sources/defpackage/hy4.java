package defpackage;

import com.yandex.quark.capability.CapabilityListener;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes8.dex */
public abstract class hy4 implements u28 {
    public final LinkedHashSet a = new LinkedHashSet();

    @Override // defpackage.u28
    public synchronized syj0 b(CapabilityListener capabilityListener) {
        syj0 jyj0Var;
        try {
            if (this.a.add(capabilityListener)) {
                capabilityListener.onStateChanged(getCurrentState());
                jyj0Var = new lyj0(new ks1(1, this, capabilityListener));
            } else {
                jyj0Var = new jyj0(new upi0());
            }
        } catch (Throwable th) {
            throw th;
        }
        return jyj0Var;
    }

    public final synchronized void e(png pngVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CapabilityListener) it.next()).onStateChanged(pngVar);
        }
    }
}
