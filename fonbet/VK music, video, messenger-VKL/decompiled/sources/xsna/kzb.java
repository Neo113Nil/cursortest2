package xsna;

import com.vk.libvideo.live.impl.views.chat.LiveRecycleView;

/* compiled from: ChatView.java */
/* loaded from: classes16.dex */
public final class kzb implements Runnable {
    public final /* synthetic */ nzb b;

    public kzb(nzb nzbVar) {
        this.b = nzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nzb nzbVar = this.b;
        LiveRecycleView liveRecycleView = nzbVar.b;
        if (liveRecycleView == null || liveRecycleView.getAdapter() == null || nzbVar.b.getAdapter().getItemCount() <= 0) {
            return;
        }
        nzbVar.b.scrollBy(0, 1000);
    }
}
