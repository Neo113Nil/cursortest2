package com.yandex.go.safety.center.main;

import com.yandex.go.safety.center.SafetyCenterParams$Source;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import com.yandex.go.safety.center.m;
import com.yandex.go.safety.center.main.SafetyCenterMainMvpView;
import com.yandex.go.safety.center.main.a;
import com.yandex.go.zone.repository.o;
import defpackage.as21;
import defpackage.btl0;
import defpackage.d6z;
import defpackage.hrl0;
import defpackage.itl0;
import defpackage.j5z;
import defpackage.l050;
import defpackage.o8g0;
import defpackage.p95;
import defpackage.qu;
import defpackage.tje;
import defpackage.w511;
import defpackage.xsl0;
import java.util.HashMap;
import java.util.Iterator;
import ru.yandex.taxi.am.g;

/* loaded from: classes13.dex */
public final class a extends p95 {
    public final itl0 A;
    public final g B;
    public final m C;
    public final o D;
    public final j5z E;
    public final com.yandex.go.something_wrong_screen.repository.b F;
    public final o8g0 G;
    public final com.yandex.go.safety.center.analytics.a H;
    public final hrl0 I;
    public final j x;
    public final SafetyCenterExperiment y;
    public final as21 z;

    public a(j jVar, SafetyCenterExperiment safetyCenterExperiment, as21 as21Var, itl0 itl0Var, g gVar, m mVar, o oVar, j5z j5zVar, com.yandex.go.something_wrong_screen.repository.b bVar, o8g0 o8g0Var, com.yandex.go.safety.center.analytics.a aVar, hrl0 hrl0Var) {
        super(SafetyCenterMainMvpView.class);
        this.x = jVar;
        this.y = safetyCenterExperiment;
        this.z = as21Var;
        this.A = itl0Var;
        this.B = gVar;
        this.C = mVar;
        this.D = oVar;
        this.E = j5zVar;
        this.F = bVar;
        this.G = o8g0Var;
        this.H = aVar;
        this.I = hrl0Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Bg(l050 l050Var) {
        Object obj;
        SafetyCenterMainMvpView.ButtonState buttonState;
        SafetyCenterMainMvpView safetyCenterMainMvpView = (SafetyCenterMainMvpView) l050Var;
        super.Bg(safetyCenterMainMvpView);
        g gVar = this.B;
        final int i = 0;
        final int i2 = 1;
        boolean z = gVar.f() && gVar.g();
        Runnable runnable = new Runnable(this) { // from class: wsl0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                a aVar = this.b;
                switch (i3) {
                    case 0:
                        com.yandex.go.safety.center.analytics.a aVar2 = aVar.H;
                        SafetyCenterParams$Source safetyCenterParams$Source = aVar.A.a;
                        String str = aVar.x.d.b;
                        aVar2.g(safetyCenterParams$Source, !(str == null || str.length() == 0), false, false, null);
                        break;
                    default:
                        ppl0 ppl0Var = aVar.H.a;
                        ppl0Var.a.a("SafetyCenter.Main.Closed", tse0.o(ppl0Var), 1, new HashMap());
                        break;
                }
            }
        };
        hrl0 hrl0Var = this.I;
        hrl0Var.c(runnable, z);
        hrl0Var.b(new Runnable(this) { // from class: wsl0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                a aVar = this.b;
                switch (i3) {
                    case 0:
                        com.yandex.go.safety.center.analytics.a aVar2 = aVar.H;
                        SafetyCenterParams$Source safetyCenterParams$Source = aVar.A.a;
                        String str = aVar.x.d.b;
                        aVar2.g(safetyCenterParams$Source, !(str == null || str.length() == 0), false, false, null);
                        break;
                    default:
                        ppl0 ppl0Var = aVar.H.a;
                        ppl0Var.a.a("SafetyCenter.Main.Closed", tse0.o(ppl0Var), 1, new HashMap());
                        break;
                }
            }
        });
        tje.N(Jg(), null, null, new SafetyCenterMainPresenter$attachView$3(safetyCenterMainMvpView, this, null), 3);
        j jVar = this.x;
        if (z) {
            tje.N(Jg(), null, null, new SafetyCenterMainPresenter$attachView$$inlined$safeCollectIn$1(jVar.o, null, this), 3);
        }
        SafetyCenterExperiment safetyCenterExperiment = this.y;
        Iterator it = safetyCenterExperiment.n.iterator();
        while (it.hasNext()) {
            SafetyCenterExperiment.ButtonType buttonType = ((SafetyCenterExperiment.SafetyCenterButton) it.next()).a;
            if (buttonType != null) {
                int i3 = xsl0.a[buttonType.ordinal()];
                if (i3 == 1) {
                    Iterator it2 = safetyCenterExperiment.j.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (d6z.Y(safetyCenterExperiment, ((SafetyCenterExperiment.Instruction) obj).b).length() > 0) {
                                break;
                            }
                        }
                    }
                    buttonState = obj != null ? SafetyCenterMainMvpView.ButtonState.VISIBLE : SafetyCenterMainMvpView.ButtonState.GONE;
                } else if (i3 == 2) {
                    buttonState = z ? SafetyCenterMainMvpView.ButtonState.LOADING : SafetyCenterMainMvpView.ButtonState.GONE;
                } else if (i3 == 3) {
                    String str = jVar.d.b;
                    buttonState = (str == null || str.length() == 0) ? SafetyCenterMainMvpView.ButtonState.DISABLED : SafetyCenterMainMvpView.ButtonState.VISIBLE;
                } else {
                    if (i3 != 4) {
                        w511.b();
                        return;
                    }
                    buttonState = SafetyCenterMainMvpView.ButtonState.VISIBLE;
                }
                ((SafetyCenterMainMvpView) Dg()).setButtonState(buttonType, buttonState);
            }
        }
        tje.N(Jg(), null, null, new SafetyCenterMainPresenter$attachView$5(safetyCenterMainMvpView, this, null), 3);
    }

    @Override // defpackage.p95
    public final void onBackPressed() {
        ((btl0) this.G.b).r(new qu(9));
    }
}
