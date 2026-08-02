package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.api.states.VkAuthState;
import com.vkontakte.android.R;
import ru.ok.android.sdk.SharedKt;

/* compiled from: UrlCheckFragment.kt */
/* loaded from: classes15.dex */
public class ueq0 extends a66<veq0> {
    public String s;

    /* compiled from: UrlCheckFragment.kt */
    public static final class a {
        public static Bundle a(String str, VkAuthState vkAuthState) {
            Bundle bundle = new Bundle(2);
            bundle.putParcelable("authState", vkAuthState);
            bundle.putString("url", str);
            return bundle;
        }
    }

    /* compiled from: UrlCheckFragment.kt */
    public static final class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            UserId userId;
            FragmentActivity activity;
            Long n;
            ueq0 ueq0Var = ueq0.this;
            Uri parse = Uri.parse(str.replace('#', '?'));
            if (!mnh0.p(parse)) {
                return false;
            }
            boolean f = epx.f(parse.getQueryParameter("success"), "1");
            String queryParameter = parse.getQueryParameter(SharedKt.PARAM_ACCESS_TOKEN);
            String queryParameter2 = parse.getQueryParameter("secret");
            String queryParameter3 = parse.getQueryParameter("user_id");
            if (queryParameter3 == null || (n = arm0.n(queryParameter3)) == null) {
                userId = null;
            } else {
                long longValue = n.longValue();
                gzs<s3q0> gzsVar = fkq0.a;
                userId = new UserId(longValue);
            }
            Object obj = ueq0Var.o;
            if (obj == null) {
                obj = null;
            }
            veq0 veq0Var = (veq0) obj;
            veq0Var.getClass();
            if (queryParameter != null && userId != null) {
                AuthResult authResult = new AuthResult(queryParameter, queryParameter2, userId, false, 0, null, null, null, null, 0, null, 0, null, null, null, 0L, null, null, null, null, null, null, null, 8388600, null);
                l55 l55Var = l55.a;
                Context context = veq0Var.b;
                SignUpDataHolder signUpDataHolder = veq0Var.p;
                if (signUpDataHolder == null) {
                    signUpDataHolder = null;
                }
                p66.r0(veq0Var, l55Var.b(context, authResult, signUpDataHolder.I), null, null, 7);
            } else if (f) {
                p66.j0(veq0Var, veq0Var.x, null, null, null, 30);
            }
            if (f || (activity = ueq0Var.getActivity()) == null) {
                return true;
            }
            activity.onBackPressed();
            return true;
        }
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.s = arguments != null ? arguments.getString("url") : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vk_auth_check_url_fragment, viewGroup, false);
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        WebView webView = (WebView) view.findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSupportMultipleWindows(true);
        webView.setWebViewClient(new b());
        String str = this.s;
        if (str == null) {
            str = null;
        }
        webView.loadUrl(str);
    }

    @Override // xsna.a66
    public final veq0 tn(Bundle bundle) {
        Bundle arguments = getArguments();
        return new veq0(arguments != null ? (VkAuthState) arguments.getParcelable("authState") : null);
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
    }
}
