package defpackage;

import android.content.Context;
import com.yandex.go.scooters.ignition.controlling.disabling_confirmation.b;

/* loaded from: classes13.dex */
public final class pej extends pgd {
    public final /* synthetic */ int F = 0;
    public final Context G;
    public final Object H;
    public final wfd I;

    public pej(qxm0 qxm0Var, b bVar, Context context, w030 w030Var) {
        super(0);
        this.G = context;
        this.H = w030Var;
        this.I = new p1b(bVar, new zon0(qxm0Var, this, 0));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        switch (this.F) {
            case 0:
                return (mu5) this.I;
            default:
                return (p1b) this.I;
        }
    }

    @Override // defpackage.pgd
    public final Context Q() {
        switch (this.F) {
        }
        return this.G;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        switch (this.F) {
            case 0:
                return ((i130) this.H).a();
            default:
                return (w030) this.H;
        }
    }

    public pej(Context context, i130 i130Var) {
        super(0);
        this.G = context;
        this.H = i130Var;
        this.I = new mu5(new nej(this, 0));
    }
}
