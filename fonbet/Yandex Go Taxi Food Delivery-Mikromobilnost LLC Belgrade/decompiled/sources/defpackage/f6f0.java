package defpackage;

import androidx.camera.camera2.internal.x;
import androidx.camera.core.impl.DeferrableSurface;

/* loaded from: classes10.dex */
public final /* synthetic */ class f6f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DeferrableSurface b;

    public /* synthetic */ f6f0(DeferrableSurface deferrableSurface, int i) {
        this.a = i;
        this.b = deferrableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DeferrableSurface deferrableSurface = this.b;
        switch (i) {
            case 0:
                x.o.remove(deferrableSurface);
                break;
            case 1:
                deferrableSurface.a();
                break;
            default:
                deferrableSurface.b();
                break;
        }
    }
}
