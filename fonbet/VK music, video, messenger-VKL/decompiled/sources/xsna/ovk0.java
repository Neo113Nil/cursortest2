package xsna;

import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.shared.item.common.description.DescriptionViewState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.jvm0;
import xsna.m2m;
import xsna.ti50;
import xsna.vf00;
import xsna.wih0;
import xsna.zu;

/* compiled from: StaticAdsItemMainOverlayMapper.kt */
/* loaded from: classes17.dex */
public final class ovk0 extends oy8<of00, vf00> {
    public final yu b;
    public final b1n c = new b1n();
    public final c590 d;

    public ovk0(yof yofVar, d11 d11Var) {
        this.b = new yu(yofVar, false);
        this.d = new c590(d11Var.a);
    }

    @Override // xsna.oy8
    public final vf00 b(of00 of00Var) {
        DescriptionViewState bVar;
        of00 of00Var2 = of00Var;
        jxk0 jxk0Var = of00Var2.b;
        if (!of00Var2.a) {
            return new vf00.a(jxk0Var.g);
        }
        String str = jxk0Var.g;
        wih0.d.a aVar = jxk0Var.b;
        SdkActionLink sdkActionLink = jxk0Var.c;
        SdkOwner sdkOwner = aVar.d;
        SdkOwner sdkOwner2 = aVar.d;
        Boolean valueOf = sdkOwner != null ? Boolean.valueOf(sdkOwner.g) : null;
        Boolean bool = Boolean.TRUE;
        boolean f = epx.f(valueOf, bool);
        dv dvVar = of00Var2.f;
        lw a = this.b.a(new zu(sdkActionLink, f, zu.a.b.a, true, dvVar.a, null, dvVar.b, dvVar.c));
        m2m m2mVar = jxk0Var.f;
        String str2 = jxk0Var.d;
        boolean z = of00Var2.e;
        if (m2mVar instanceof m2m.b) {
            CharSequence charSequence = ((m2m.b) m2mVar).a;
            bVar = myc0.f(charSequence) ? new DescriptionViewState.b(charSequence, str2, DescriptionViewState.ExpansionState.STATIC) : DescriptionViewState.a.a;
        } else {
            if (!(m2mVar instanceof m2m.a)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = z ? new DescriptionViewState.b(((m2m.a) m2mVar).b, str2, DescriptionViewState.ExpansionState.EXPANDED) : new DescriptionViewState.b(((m2m.a) m2mVar).a, str2, DescriptionViewState.ExpansionState.COLLAPSED);
        }
        ti50.a aVar2 = ti50.a.a;
        g1n a2 = b1n.a(this.c, of00Var2.c, of00Var2.d, false, 12);
        x590 a3 = this.d.a(new g590(EmptyList.b, aVar.d, aVar.e, new e590(aVar.h), false));
        boolean f2 = epx.f(sdkOwner2 != null ? Boolean.valueOf(sdkOwner2.g) : null, bool);
        SdkActionLink sdkActionLink2 = jxk0Var.c;
        boolean z2 = epx.f(sdkOwner2 != null ? Boolean.valueOf(sdkOwner2.f) : null, bool) && !epx.f(sdkActionLink2 != null ? sdkActionLink2.e : null, "link_community_with_subscribe");
        jvm0 bVar2 = (z2 && f2) ? jvm0.c.a : (!z2 || f2) ? jvm0.a.a : new jvm0.b(false);
        return new vf00.c(str, a, bVar, aVar2, a2, a3, new vf00.b(bVar2, bVar2 instanceof jvm0.c));
    }
}
