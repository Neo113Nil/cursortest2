package xsna;

import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class b4i implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b4i(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((y89) this.d).invoke(new CommunityProfileAction.e.i.C1585e(this.c));
                break;
            default:
                evs evsVar = (evs) this.d;
                r6p0 r6p0Var = evsVar.K;
                c4u0 c4u0Var = evsVar.E;
                r6p0Var.a();
                if (this.c) {
                    c4u0Var.I.setVisibility(4);
                } else {
                    ocx ocxVar = evsVar.l;
                    if (ocxVar.c && ocxVar.a.a) {
                        c4u0Var.I.setVisibility(0);
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
