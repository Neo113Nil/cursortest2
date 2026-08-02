package xsna;

import com.vk.onboardingscreens.impl.georequest.presentation.fragment.GeoRequestFragment;
import com.vk.socialgraph.init.GeoRequestFragmentContainer;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: GeoRequestRouterImpl.kt */
/* loaded from: classes4.dex */
public final class bnt implements ant {
    @Override // xsna.ant
    public final void a(GeoRequestFragmentContainer geoRequestFragmentContainer) {
        oz50 oz50Var = new oz50(GeoRequestFragment.class, null, null);
        oz50Var.s(true);
        oz50Var.t();
        oz50Var.g(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, geoRequestFragmentContainer);
    }
}
