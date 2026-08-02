package xsna;

/* compiled from: View.kt */
/* loaded from: classes5.dex */
public final class hvh implements Runnable {
    public final /* synthetic */ com.vk.profile.community.impl.ui.profile.f b;
    public final /* synthetic */ int c;

    public hvh(com.vk.profile.community.impl.ui.profile.f fVar, int i) {
        this.b = fVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.l.smoothScrollToPosition(this.c);
    }
}
