package xsna;

import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class fmh implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fmh(hmh hmhVar, boolean z) {
        this.d = hmhVar;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((hmh) this.d).b.invoke(new CommunityProfileAction.g.c(this.c));
                return s3q0.a;
            default:
                return Boolean.valueOf(this.c || ((vak0) ((zfe0) this.d).e).getFloatValue() > 0.5f);
        }
    }

    public /* synthetic */ fmh(boolean z, zfe0 zfe0Var) {
        this.c = z;
        this.d = zfe0Var;
    }
}
