package xsna;

import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesComponent;
import com.vk.fave.di.FaveComponent;
import com.vk.profile.user.api.di.UserProfileComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class unh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ unh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((UserProfileComponent) this.c.mo408a(fpf0.a(UserProfileComponent.class))).Jc();
            case 1:
                return (ClassifiedsComponent) this.c.a(fpf0.a(ClassifiedsComponent.class));
            case 2:
                return ((FaveComponent) this.c.mo408a(fpf0.a(FaveComponent.class))).S8();
            default:
                return ((StorefrontServicesComponent) this.c.a(fpf0.a(StorefrontServicesComponent.class))).a();
        }
    }
}
