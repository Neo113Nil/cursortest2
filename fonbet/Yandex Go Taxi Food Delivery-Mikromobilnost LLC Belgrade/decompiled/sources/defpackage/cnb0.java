package defpackage;

import android.content.Context;
import com.yandex.go.pickup_from_photo.data.PickupFromPhotoGyroscopeRepository;
import com.yandex.go.pickup_from_photo.domain.c;
import com.yandex.go.pickup_from_photo.domain.f;
import com.yandex.go.pickup_from_photo.experiment.p;
import com.yandex.go.pickup_from_photo.presentation.PickupFromPhotoModalView;

/* loaded from: classes13.dex */
public final class cnb0 extends m230 {
    public final w030 E;
    public final ynb0 F;
    public final lob0 G;
    public final yvf0 H;
    public final c I;
    public final bnb0 J;

    public cnb0(w030 w030Var, ynb0 ynb0Var, lob0 lob0Var, ph70 ph70Var, c cVar) {
        super(null);
        this.E = w030Var;
        this.F = ynb0Var;
        this.G = lob0Var;
        this.H = ph70Var;
        this.I = cVar;
        this.J = new bnb0(this);
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        kob0 kob0Var = this.G.a;
        job0 job0Var = new job0((dob0) kob0Var.a.get(), (ney) kob0Var.b.get(), this.J, (f) kob0Var.c.get(), (c) kob0Var.d.get(), (umb0) kob0Var.e.get(), (PickupFromPhotoGyroscopeRepository) kob0Var.f.get(), (p) kob0Var.g.get());
        dt20 dt20Var = this.F.a;
        return new PickupFromPhotoModalView((Context) ((z4g) dt20Var.b).get(), (ip11) ((n5g) dt20Var.c).get(), (tse) ((n5g) dt20Var.w).get(), (pav) ((n5g) dt20Var.x).get(), job0Var);
    }
}
