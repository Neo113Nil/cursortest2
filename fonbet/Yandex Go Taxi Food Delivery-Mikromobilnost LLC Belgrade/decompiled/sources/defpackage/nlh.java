package defpackage;

import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.concurrent.futures.b;

/* loaded from: classes10.dex */
public final /* synthetic */ class nlh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ nlh(int i, b bVar) {
        this.a = i;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                DefaultSurfaceProcessor.lambda$snapshot$7(bVar);
                break;
            default:
                bVar.b(null);
                break;
        }
    }
}
