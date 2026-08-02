package xsna;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.api.dto.identity.WebIdentityCard;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vk.superapp.browser.internal.ui.identity.WebIdentityContext;
import com.vk.superapp.browser.internal.ui.identity.fragments.VkIdentityActivity;
import com.vk.superapp.core.ui.VkDelegatingActivity;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;

/* compiled from: VkIdentityListFragment.kt */
/* loaded from: classes6.dex */
public final class f0v0 extends gi6<Object> implements e0v0 {
    public final g0v0 i;

    /* compiled from: VkIdentityListFragment.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<String, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(String str) {
            int i;
            SchemeStatSak$EventScreen schemeStatSak$EventScreen;
            String str2 = str;
            f0v0 f0v0Var = (f0v0) this.receiver;
            g0v0 g0v0Var = f0v0Var.i;
            WebIdentityCardData webIdentityCardData = g0v0Var.i;
            if (webIdentityCardData != null) {
                Bundle bundle = new Bundle();
                bundle.putString("arg_type", str2);
                bundle.putParcelable("arg_identity_card", webIdentityCardData);
                WebIdentityContext webIdentityContext = g0v0Var.h;
                if (webIdentityContext == null) {
                    i = 110;
                } else {
                    bundle.putParcelable("arg_identity_context", webIdentityContext);
                    i = 109;
                }
                int hashCode = str2.hashCode();
                if (hashCode == -1147692044) {
                    if (str2.equals(RTCStatsConstants.KEY_ADDRESS)) {
                        schemeStatSak$EventScreen = SchemeStatSak$EventScreen.CONTACTS_APPS_ADD_ADDRESS;
                        bundle.putSerializable("screen", schemeStatSak$EventScreen);
                        int i2 = VkDelegatingActivity.f;
                        VkDelegatingActivity.a.a(f0v0Var, VkIdentityActivity.class, a0v0.class, bundle, i);
                    }
                    throw new IllegalArgumentException();
                }
                if (hashCode == 96619420) {
                    if (str2.equals("email")) {
                        schemeStatSak$EventScreen = SchemeStatSak$EventScreen.CONTACTS_APPS_ADD_EMAIL;
                        bundle.putSerializable("screen", schemeStatSak$EventScreen);
                        int i22 = VkDelegatingActivity.f;
                        VkDelegatingActivity.a.a(f0v0Var, VkIdentityActivity.class, a0v0.class, bundle, i);
                    }
                    throw new IllegalArgumentException();
                }
                if (hashCode == 106642798 && str2.equals("phone")) {
                    schemeStatSak$EventScreen = SchemeStatSak$EventScreen.CONTACTS_APPS_ADD_PHONE;
                    bundle.putSerializable("screen", schemeStatSak$EventScreen);
                    int i222 = VkDelegatingActivity.f;
                    VkDelegatingActivity.a.a(f0v0Var, VkIdentityActivity.class, a0v0.class, bundle, i);
                }
                throw new IllegalArgumentException();
            }
            return s3q0.a;
        }
    }

    /* compiled from: VkIdentityListFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<WebIdentityCard, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(WebIdentityCard webIdentityCard) {
            int i;
            SchemeStatSak$EventScreen schemeStatSak$EventScreen;
            WebIdentityCard webIdentityCard2 = webIdentityCard;
            f0v0 f0v0Var = (f0v0) this.receiver;
            g0v0 g0v0Var = f0v0Var.i;
            WebIdentityCardData webIdentityCardData = g0v0Var.i;
            if (webIdentityCardData != null) {
                String type = webIdentityCard2.getType();
                Bundle bundle = new Bundle();
                bundle.putString("arg_type", type);
                bundle.putParcelable("arg_identity_card", webIdentityCardData);
                bundle.putInt("arg_identity_id", webIdentityCard2.zb());
                WebIdentityContext webIdentityContext = g0v0Var.h;
                if (webIdentityContext == null) {
                    i = 110;
                } else {
                    bundle.putParcelable("arg_identity_context", webIdentityContext);
                    i = 109;
                }
                String type2 = webIdentityCard2.getType();
                int hashCode = type2.hashCode();
                if (hashCode == -1147692044) {
                    if (type2.equals(RTCStatsConstants.KEY_ADDRESS)) {
                        schemeStatSak$EventScreen = SchemeStatSak$EventScreen.CONTACTS_APPS_EDIT_ADDRESS;
                        bundle.putSerializable("screen", schemeStatSak$EventScreen);
                        int i2 = VkDelegatingActivity.f;
                        VkDelegatingActivity.a.a(f0v0Var, VkIdentityActivity.class, a0v0.class, bundle, i);
                    }
                    throw new IllegalArgumentException();
                }
                if (hashCode == 96619420) {
                    if (type2.equals("email")) {
                        schemeStatSak$EventScreen = SchemeStatSak$EventScreen.CONTACTS_APPS_EDIT_EMAIL;
                        bundle.putSerializable("screen", schemeStatSak$EventScreen);
                        int i22 = VkDelegatingActivity.f;
                        VkDelegatingActivity.a.a(f0v0Var, VkIdentityActivity.class, a0v0.class, bundle, i);
                    }
                    throw new IllegalArgumentException();
                }
                if (hashCode == 106642798 && type2.equals("phone")) {
                    schemeStatSak$EventScreen = SchemeStatSak$EventScreen.CONTACTS_APPS_EDIT_PHONE;
                    bundle.putSerializable("screen", schemeStatSak$EventScreen);
                    int i222 = VkDelegatingActivity.f;
                    VkDelegatingActivity.a.a(f0v0Var, VkIdentityActivity.class, a0v0.class, bundle, i);
                }
                throw new IllegalArgumentException();
            }
            return s3q0.a;
        }
    }

    public f0v0() {
        d0v0 d0v0Var = new d0v0(this);
        this.h = d0v0Var;
        this.i = new g0v0(this, d0v0Var, new kvv(new a(1, this, f0v0.class, "addIdentity", "addIdentity(Ljava/lang/String;)V", 0), new b(1, this, f0v0.class, "editIdentity", "editIdentity(Lcom/vk/superapp/api/dto/identity/WebIdentityCard;)V", 0)), new ptl0(this, 16));
    }

    @Override // xsna.e0v0
    public final void I6(WebIdentityCardData webIdentityCardData) {
        this.i.c(webIdentityCardData);
    }

    @Override // xsna.e0v0
    public final void R0(VKApiException vKApiException) {
        this.i.R0(vKApiException);
    }

    @Override // xsna.gi6, xsna.iv5
    public final boolean a0() {
        this.i.d();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.i.a(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        g0v0 g0v0Var = this.i;
        g0v0Var.getClass();
        if (arguments == null || !arguments.containsKey("arg_identity_context")) {
            return;
        }
        g0v0Var.h = (WebIdentityContext) arguments.getParcelable("arg_identity_context");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.i.getClass();
        return layoutInflater.inflate(R.layout.vk_layout_list_fragment, viewGroup, false);
    }

    @Override // xsna.gi6, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        g0v0 g0v0Var = this.i;
        g0v0Var.g = null;
        g0v0Var.h = null;
    }

    @Override // xsna.gi6, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.i.b(view, bundle);
    }
}
