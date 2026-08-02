package xsna;

import android.content.Intent;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class lrg implements Callable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;

    public /* synthetic */ lrg(e3u e3uVar) {
        this.c = e3uVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                return kzz.f(((CommunityAddressesFragment) this.c).requireContext());
            default:
                e3u e3uVar = (e3u) this.c;
                new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
                return Boolean.valueOf(!e3uVar.a.getPackageManager().queryIntentServices(r1, 128).isEmpty());
        }
    }

    public /* synthetic */ lrg(ndr0 ndr0Var, CommunityAddressesFragment communityAddressesFragment) {
        this.c = communityAddressesFragment;
    }
}
