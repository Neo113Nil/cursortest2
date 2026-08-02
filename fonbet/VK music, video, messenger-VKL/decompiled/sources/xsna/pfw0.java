package xsna;

import com.vk.dto.common.id.UserId;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.rew0;

/* compiled from: VoipCallAuthDataListenersProxy.kt */
/* loaded from: classes7.dex */
public final class pfw0 implements rew0.b {
    public final CopyOnWriteArrayList<rew0.b> a = new CopyOnWriteArrayList<>();

    @Override // xsna.rew0.b
    public final void a(UserId userId) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((rew0.b) it.next()).a(userId);
        }
    }

    @Override // xsna.rew0.b
    public final void b() {
        Iterator<rew0.b> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }
}
