package defpackage;

import androidx.heifwriter.HeifEncoder;

/* loaded from: classes10.dex */
public final class dfu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ HeifEncoder b;

    public /* synthetic */ dfu(HeifEncoder heifEncoder, int i) {
        this.a = i;
        this.b = heifEncoder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        HeifEncoder heifEncoder = this.b;
        switch (i) {
            case 0:
                heifEncoder.maybeCopyOneTileYUV();
                break;
            default:
                heifEncoder.stopInternal();
                break;
        }
    }
}
