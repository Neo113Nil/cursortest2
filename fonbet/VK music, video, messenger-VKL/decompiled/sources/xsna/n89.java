package xsna;

import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class n89 implements Runnable {
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ com.vk.voip.ui.settings.participants_view.c d;

    public /* synthetic */ n89(long j, int i, com.vk.voip.ui.settings.participants_view.c cVar) {
        this.b = j;
        this.c = i;
        this.d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L.e("onListItemsUpdate=" + (System.currentTimeMillis() - this.b));
        if (this.c == 0) {
            this.d.c.scrollToPosition(0);
        }
    }
}
