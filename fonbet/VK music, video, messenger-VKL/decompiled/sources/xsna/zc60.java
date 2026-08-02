package xsna;

import com.vk.dto.newsfeed.SituationalSuggest;

/* compiled from: NewsfeedBackstageSitpostingPlugin.kt */
/* loaded from: classes4.dex */
public final class zc60 implements fsr {
    public final /* synthetic */ ad60 b;
    public final /* synthetic */ SituationalSuggest c;

    public zc60(ad60 ad60Var, SituationalSuggest situationalSuggest) {
        this.b = ad60Var;
        this.c = situationalSuggest;
    }

    @Override // xsna.fsr
    public final void C1() {
        this.b.a.a(new xs60(this.c));
    }

    @Override // xsna.fsr
    public final void c0() {
        ad60 ad60Var = this.b;
        ad60Var.b();
        ad60Var.a.a(new ys60(this.c));
        gsr gsrVar = ad60Var.d;
        if (gsrVar != null) {
            gsrVar.setIsVisible(false);
        }
    }

    @Override // xsna.fsr
    public final void o() {
        ad60 ad60Var = this.b;
        ad60Var.b();
        ad60Var.a.a(new ws60(this.c));
        gsr gsrVar = ad60Var.d;
        if (gsrVar != null) {
            gsrVar.setIsVisible(false);
        }
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }
}
