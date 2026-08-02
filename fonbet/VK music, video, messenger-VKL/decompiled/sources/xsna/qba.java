package xsna;

import com.vk.profile.core.onboarding.model.ContentHintOnboardingResource;
import kotlin.NoWhenBranchMatchedException;
import xsna.a080;
import xsna.b280;
import xsna.c280;
import xsna.d080;
import xsna.d280;
import xsna.e080;
import xsna.z180;

/* compiled from: CatalogOnboardingFeature.kt */
/* loaded from: classes5.dex */
public final class qba extends wk50<o080, i080, a080, e080> {
    public final f4z<z180> f;

    public qba(a080.d dVar) {
        super(dVar, new h080());
        this.f = new f4z<>();
    }

    @Override // xsna.wk50
    public final void N(i080 i080Var, a080 a080Var) {
        ContentHintOnboardingResource.RemoteContentResource remoteContentResource;
        a080 a080Var2 = a080Var;
        boolean z = a080Var2 instanceof a080.a;
        f4z<z180> f4zVar = this.f;
        if (z) {
            f4zVar.b(new z180.b(false));
            return;
        }
        if (!(a080Var2 instanceof a080.d)) {
            if (a080Var2.equals(a080.e.b)) {
                f4zVar.b(new z180.b(false));
                return;
            } else {
                if (!a080Var2.equals(a080.b.b) && !a080Var2.equals(a080.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        ContentHintOnboardingResource contentHintOnboardingResource = ((a080.d) a080Var2).b;
        ContentHintOnboardingResource.Contents contents = dhr0.M() ? contentHintOnboardingResource.b : contentHintOnboardingResource.c;
        ContentHintOnboardingResource.Contents.ServicesContents servicesContents = contents instanceof ContentHintOnboardingResource.Contents.ServicesContents ? (ContentHintOnboardingResource.Contents.ServicesContents) contents : null;
        if (servicesContents == null || (remoteContentResource = (ContentHintOnboardingResource.RemoteContentResource) j5g.a0(servicesContents.b)) == null) {
            return;
        }
        T(new e080.b(new d080.a(new c280.c(new d280.b(fls0.a(remoteContentResource.d.getUrl())), remoteContentResource.b, remoteContentResource.c, null), new b280.c(remoteContentResource.e)), 0));
    }
}
