package defpackage;

import com.yandex.go.safety.center.SafetyCenterParams$Source;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$SafetyCenterNavigationSource;
import com.yandex.go.safety.center.analytics.a;
import com.yandex.go.safety.center.j;
import com.yandex.go.safety.center.model.PresentationContact$Mode;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class mpl0 extends ia5 implements abq0 {
    public final aye0 A;
    public final a B;
    public final itl0 C;
    public final j z;

    public mpl0(j jVar, hrl0 hrl0Var, aye0 aye0Var, a aVar, itl0 itl0Var, q3u0 q3u0Var) {
        super(kpl0.class, q3u0Var, hrl0Var);
        this.z = jVar;
        this.A = aye0Var;
        this.B = aVar;
        this.C = itl0Var;
    }

    @Override // defpackage.abq0
    public final void B0() {
    }

    @Override // defpackage.ia5, defpackage.ad5, defpackage.zc5
    public final void Bg(l050 l050Var) {
        super.Bg((kpl0) l050Var);
        final int i = 0;
        Runnable runnable = new Runnable(this) { // from class: lpl0
            public final /* synthetic */ mpl0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                mpl0 mpl0Var = this.b;
                switch (i2) {
                    case 0:
                        a aVar = mpl0Var.B;
                        SafetyCenterParams$Source safetyCenterParams$Source = mpl0Var.C.a;
                        ppl0 ppl0Var = aVar.a;
                        SafetyCenterAnalytics$SafetyCenterNavigationSource h = a.h(safetyCenterParams$Source);
                        HashMap o = tse0.o(ppl0Var);
                        o.put("source", h.getEventValue());
                        ppl0Var.a.a("SafetyCenter.AddTrustedContacts.Shown", o, 1, new HashMap());
                        break;
                    default:
                        ppl0 ppl0Var2 = mpl0Var.B.a;
                        ppl0Var2.a.a("SafetyCenter.AddTrustedContact.Closed", tse0.o(ppl0Var2), 1, new HashMap());
                        break;
                }
            }
        };
        hrl0 hrl0Var = this.y;
        hrl0Var.c(runnable, false);
        final int i2 = 1;
        hrl0Var.b(new Runnable(this) { // from class: lpl0
            public final /* synthetic */ mpl0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                mpl0 mpl0Var = this.b;
                switch (i22) {
                    case 0:
                        a aVar = mpl0Var.B;
                        SafetyCenterParams$Source safetyCenterParams$Source = mpl0Var.C.a;
                        ppl0 ppl0Var = aVar.a;
                        SafetyCenterAnalytics$SafetyCenterNavigationSource h = a.h(safetyCenterParams$Source);
                        HashMap o = tse0.o(ppl0Var);
                        o.put("source", h.getEventValue());
                        ppl0Var.a.a("SafetyCenter.AddTrustedContacts.Shown", o, 1, new HashMap());
                        break;
                    default:
                        ppl0 ppl0Var2 = mpl0Var.B.a;
                        ppl0Var2.a.a("SafetyCenter.AddTrustedContact.Closed", tse0.o(ppl0Var2), 1, new HashMap());
                        break;
                }
            }
        });
    }

    @Override // defpackage.abq0
    public final void I(bgq0 bgq0Var) {
        ide ideVar = new ide(bgq0Var.a, bgq0Var.b, 12);
        j jVar = this.z;
        ArrayList arrayList = new ArrayList(jVar.f());
        arrayList.add(new swe0(ideVar.a, ideVar.b, PresentationContact$Mode.ADDING));
        jVar.p(arrayList);
        ((sql0) this.A.b).r(new qu(9));
        ppl0 ppl0Var = this.B.a;
        ppl0Var.a.a("SafetyCenter.AddTrustedContacts.Contact.Selected", tse0.o(ppl0Var), 1, new HashMap());
    }

    @Override // defpackage.p95
    public final void onBackPressed() {
        ((sql0) this.A.b).r(new qu(9));
    }
}
