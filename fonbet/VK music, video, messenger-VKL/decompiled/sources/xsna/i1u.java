package xsna;

import com.vk.core.ui.swipes.ButtonsSwipeView;
import xsna.fx10;
import xsna.v1z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class i1u implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i1u(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                fx10.h hVar = h1u.this.d;
                if (hVar != null) {
                    hVar.j(this.c);
                    break;
                }
                break;
            case 1:
                ((ButtonsSwipeView) this.d).smoothScrollTo(this.c, 0);
                break;
            default:
                v1z0.a aVar = (v1z0.a) this.d;
                v1z0.a(aVar.b, this.c);
                break;
        }
    }
}
