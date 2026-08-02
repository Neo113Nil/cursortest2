package defpackage;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;

/* loaded from: classes10.dex */
public final class iiv extends DeferrableSurface {
    public final /* synthetic */ int o = 0;
    public final Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iiv(znw0 znw0Var, Size size) {
        super(34, size);
        this.p = znw0Var;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public final euy f() {
        int i = this.o;
        Object obj = this.p;
        switch (i) {
            case 0:
                return ni91.f((Surface) obj);
            default:
                return ((znw0) obj).h;
        }
    }

    public iiv(Surface surface) {
        this.p = surface;
    }

    public iiv(Surface surface, Size size, int i) {
        super(i, size);
        this.p = surface;
    }
}
