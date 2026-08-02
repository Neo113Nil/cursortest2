package xsna;

import com.vk.music.offline.ui.presentation.entity.MusicDownloadsSettingsState;
import kotlin.NoWhenBranchMatchedException;
import xsna.el50;
import xsna.ln50;
import xsna.wi40;
import xsna.xi40;

/* compiled from: MusicDownloadsSettingsInlineActor.kt */
/* loaded from: classes3.dex */
public final class ej40 extends bl50<MusicDownloadsSettingsState, wi40, on50, bwj, dwj, xi40> {
    public final j850 c;
    public final sj50<MusicDownloadsSettingsState, on50, ll50<on50, bwj, dwj>, jl50<MusicDownloadsSettingsState>, xi40> d;

    public ej40(j850 j850Var, sj50<MusicDownloadsSettingsState, on50, ll50<on50, bwj, dwj>, jl50<MusicDownloadsSettingsState>, xi40> sj50Var) {
        super(sj50Var);
        this.c = j850Var;
        this.d = sj50Var;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<MusicDownloadsSettingsState, on50, ll50<on50, bwj, dwj>, jl50<MusicDownloadsSettingsState>, xi40> W() {
        return this.d;
    }

    @Override // xsna.bl50, xsna.qj50
    public final void init() {
        rn50 rn50Var = new rn50("TASK_INIT_MOBILE_NETWORK_DOWNLOAD");
        c2u c2uVar = new c2u(this, 20);
        ln50.a.C3276a c3276a = ln50.a.b;
        el50.a.a(this, rn50Var, c3276a, c2uVar);
        el50.a.a(this, new rn50("TASK_UPDATE_DOWNLOADS_SIZE"), c3276a, new iou(this, 18));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        wi40 wi40Var = (wi40) lj50Var;
        if (wi40Var.equals(wi40.b.b)) {
            c(xi40.a.a);
            return;
        }
        if (wi40Var.equals(wi40.c.b)) {
            this.c.S(!r3.a.P());
            el50.a.b(this, new es00(this, 5));
        } else {
            if (!wi40Var.equals(wi40.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            el50.a.a(this, new in50(fpf0.a(wi40.a.class)), ln50.a.b, new x2y(this, 16));
        }
    }
}
