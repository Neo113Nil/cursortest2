package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: EventsHandlerImpl.kt */
/* loaded from: classes17.dex */
public final class d1q implements com.vk.clips.viewer.vk.a {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList<z0q> b = new CopyOnWriteArrayList<>();

    @Override // com.vk.clips.viewer.vk.a
    public final void a(z0q z0qVar) {
        this.b.remove(z0qVar);
    }

    @Override // xsna.z0q
    public final void b(rxp rxpVar) {
        if (this.b.isEmpty()) {
            return;
        }
        com.vk.newsfeed.common.recycler.holders.attachments.a aVar = new com.vk.newsfeed.common.recycler.holders.attachments.a(14, this, rxpVar);
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            aVar.invoke();
        } else {
            this.a.post(new to2(aVar, 6));
        }
    }

    @Override // com.vk.clips.viewer.vk.a
    public final void c(z0q z0qVar) {
        this.b.add(z0qVar);
    }
}
