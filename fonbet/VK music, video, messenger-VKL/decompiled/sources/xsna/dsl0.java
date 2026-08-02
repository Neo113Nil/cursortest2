package xsna;

import com.vk.dto.stories.model.GetStoriesResponse;
import java.util.ArrayList;

/* compiled from: StoriesFeedInteractorImpl.kt */
/* loaded from: classes6.dex */
public final class dsl0 implements bsl0 {
    public final lrl0 a;
    public final lul0 b;
    public final p870 c;
    public final gul0 d;
    public final ysg0<asl0> e;
    public String f;

    public dsl0(lrl0 lrl0Var, lul0 lul0Var, p870 p870Var, gul0 gul0Var, ysg0 ysg0Var) {
        this.a = lrl0Var;
        this.b = lul0Var;
        this.c = p870Var;
        this.d = gul0Var;
        this.e = ysg0Var;
    }

    @Override // xsna.bsl0
    public final void a() {
        lrl0 lrl0Var = this.a;
        GetStoriesResponse i = lrl0Var.i();
        if (i == null) {
            return;
        }
        lrl0Var.b(this.d.a(new ArrayList<>(i7o0.a(i.c)), null, true, true), false);
    }

    @Override // xsna.bsl0
    public final String b() {
        return this.f;
    }

    @Override // xsna.bsl0
    public final io.reactivex.rxjava3.core.x<Boolean> c(boolean z) {
        avl0 avl0Var = this.b.a;
        Boolean valueOf = Boolean.valueOf(z);
        avl0Var.getClass();
        tfx tfxVar = new tfx("stories.setDiscoverVisible", new b690(6), new ohl0(1));
        tfxVar.j("is_discover_visible", valueOf.booleanValue());
        return new io.reactivex.rxjava3.internal.operators.single.o(lul0.c(tfxVar), new jw80(new csl0(this, z, 0), 14));
    }

    @Override // xsna.bsl0
    public final io.reactivex.rxjava3.core.x<hsl0> d() {
        this.b.a.getClass();
        return rsg0.w0(yfb.x(new tfx("stories.getFeedSettings", new hsi0(2), new vul0(0)))).l(new uxb0(new kul0(0), 7));
    }
}
