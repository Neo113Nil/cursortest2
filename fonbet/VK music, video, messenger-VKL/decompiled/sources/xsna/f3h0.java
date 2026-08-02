package xsna;

import android.content.Context;
import android.net.Uri;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.nspk.search.NspkSearchBanksFeatureComponent;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;

/* compiled from: SbpUtils.kt */
/* loaded from: classes3.dex */
public final class f3h0 implements w8i {
    public final Context b;

    public f3h0(Context context) {
        this.b = context;
    }

    public final void a(UserId userId, int i, String str, d3h0 d3h0Var) {
        String encode = Uri.encode(str);
        v2h0 ya = ((NspkSearchBanksFeatureComponent) ((k7m) m7m.f(this)).a(fpf0.a(NspkSearchBanksFeatureComponent.class))).ya();
        Uri build = jeq0.g(f870.v(InternalVkMiniApps.P2P_SBP.h())).buildUpon().encodedFragment(DomExceptionUtils.SEPARATOR + i + '/' + userId + '/' + encode).build();
        Context context = this.b;
        Context applicationContext = context.getApplicationContext();
        r3y.b.put("VKWebAppSelectSbpBank", new lw20(ya, 28));
        r3y.a("VKWebAppOpenSbpLinkBank", new xbv(applicationContext, 1));
        xwk.d().e().d(context, build, LaunchContext.A, d3h0Var);
    }
}
