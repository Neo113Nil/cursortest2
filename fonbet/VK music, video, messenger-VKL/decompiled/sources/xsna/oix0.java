package xsna;

import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.util.Features;
import xsna.crk0;
import xsna.gy2;
import xsna.vix0;

/* compiled from: WebViewFeatureInternal.java */
/* loaded from: classes12.dex */
public final class oix0 {
    public static final gy2.b a = new gy2.b(Features.VISUAL_STATE_CALLBACK, Features.VISUAL_STATE_CALLBACK);
    public static final gy2.b b;
    public static final gy2.b c;
    public static final gy2.f d;
    public static final gy2.d e;
    public static final gy2.e f;
    public static final gy2.d g;
    public static final gy2.h h;
    public static final gy2.d i;
    public static final gy2.d j;

    /* compiled from: WebViewFeatureInternal.java */
    public class a extends gy2.i {
        public final Pattern d;

        public a() {
            super(Features.ALGORITHMIC_DARKENING, Features.ALGORITHMIC_DARKENING);
            this.d = Pattern.compile("\\A\\d+");
        }

        @Override // xsna.gy2
        public final boolean c() {
            boolean c = super.c();
            if (!c || Build.VERSION.SDK_INT >= 29) {
                return c;
            }
            int i = mix0.a;
            PackageInfo a = ny2.a();
            if (a == null) {
                return false;
            }
            Matcher matcher = this.d.matcher(a.versionName);
            return matcher.find() && Integer.parseInt(a.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    /* compiled from: WebViewFeatureInternal.java */
    public class b extends gy2.d {
        @Override // xsna.gy2
        public final boolean c() {
            if (!super.c() || !zq70.C("MULTI_PROCESS")) {
                return false;
            }
            int i = mix0.a;
            if (oix0.g.c()) {
                return vix0.b.a.getStatics().isMultiProcessEnabled();
            }
            throw oix0.a();
        }
    }

    static {
        new gy2.b(Features.OFF_SCREEN_PRERASTER, Features.OFF_SCREEN_PRERASTER);
        new gy2.e(Features.SAFE_BROWSING_ENABLE, Features.SAFE_BROWSING_ENABLE);
        new gy2.c(Features.DISABLED_ACTION_MODE_MENU_ITEMS, Features.DISABLED_ACTION_MODE_MENU_ITEMS);
        new gy2.f(Features.START_SAFE_BROWSING, Features.START_SAFE_BROWSING);
        new gy2.f(Features.SAFE_BROWSING_WHITELIST, Features.SAFE_BROWSING_WHITELIST);
        new gy2.f(Features.SAFE_BROWSING_WHITELIST, Features.SAFE_BROWSING_ALLOWLIST);
        new gy2.f(Features.SAFE_BROWSING_ALLOWLIST, Features.SAFE_BROWSING_WHITELIST);
        new gy2.f(Features.SAFE_BROWSING_ALLOWLIST, Features.SAFE_BROWSING_ALLOWLIST);
        new gy2.f(Features.SAFE_BROWSING_PRIVACY_POLICY_URL, Features.SAFE_BROWSING_PRIVACY_POLICY_URL);
        new gy2.c(Features.SERVICE_WORKER_BASIC_USAGE, Features.SERVICE_WORKER_BASIC_USAGE);
        new gy2.c(Features.SERVICE_WORKER_CACHE_MODE, Features.SERVICE_WORKER_CACHE_MODE);
        new gy2.c(Features.SERVICE_WORKER_CONTENT_ACCESS, Features.SERVICE_WORKER_CONTENT_ACCESS);
        new gy2.c(Features.SERVICE_WORKER_FILE_ACCESS, Features.SERVICE_WORKER_FILE_ACCESS);
        new gy2.c(Features.SERVICE_WORKER_BLOCK_NETWORK_LOADS, Features.SERVICE_WORKER_BLOCK_NETWORK_LOADS);
        new gy2.c(Features.SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST, Features.SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST);
        new gy2.b(Features.RECEIVE_WEB_RESOURCE_ERROR, Features.RECEIVE_WEB_RESOURCE_ERROR);
        new gy2.b(Features.RECEIVE_HTTP_ERROR, Features.RECEIVE_HTTP_ERROR);
        new gy2.c(Features.SHOULD_OVERRIDE_WITH_REDIRECTS, Features.SHOULD_OVERRIDE_WITH_REDIRECTS);
        new gy2.f(Features.SAFE_BROWSING_HIT, Features.SAFE_BROWSING_HIT);
        new gy2.c(Features.WEB_RESOURCE_REQUEST_IS_REDIRECT, Features.WEB_RESOURCE_REQUEST_IS_REDIRECT);
        b = new gy2.b(Features.WEB_RESOURCE_ERROR_GET_DESCRIPTION, Features.WEB_RESOURCE_ERROR_GET_DESCRIPTION);
        c = new gy2.b(Features.WEB_RESOURCE_ERROR_GET_CODE, Features.WEB_RESOURCE_ERROR_GET_CODE);
        new gy2.f(Features.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY, Features.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY);
        new gy2.f(Features.SAFE_BROWSING_RESPONSE_PROCEED, Features.SAFE_BROWSING_RESPONSE_PROCEED);
        d = new gy2.f(Features.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL, Features.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL);
        new gy2.b(Features.WEB_MESSAGE_PORT_POST_MESSAGE, Features.WEB_MESSAGE_PORT_POST_MESSAGE);
        new gy2.b(Features.WEB_MESSAGE_PORT_CLOSE, Features.WEB_MESSAGE_PORT_CLOSE);
        e = new gy2.d(Features.WEB_MESSAGE_ARRAY_BUFFER, Features.WEB_MESSAGE_ARRAY_BUFFER);
        new gy2.b(Features.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK, Features.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK);
        new gy2.b(Features.CREATE_WEB_MESSAGE_CHANNEL, Features.CREATE_WEB_MESSAGE_CHANNEL);
        new gy2.b(Features.POST_WEB_MESSAGE, Features.POST_WEB_MESSAGE);
        new gy2.b(Features.WEB_MESSAGE_CALLBACK_ON_MESSAGE, Features.WEB_MESSAGE_CALLBACK_ON_MESSAGE);
        f = new gy2.e(Features.GET_WEB_VIEW_CLIENT, Features.GET_WEB_VIEW_CLIENT);
        new gy2.e(Features.GET_WEB_CHROME_CLIENT, Features.GET_WEB_CHROME_CLIENT);
        new gy2.h(Features.GET_WEB_VIEW_RENDERER, Features.GET_WEB_VIEW_RENDERER);
        new gy2.h(Features.WEB_VIEW_RENDERER_TERMINATE, Features.WEB_VIEW_RENDERER_TERMINATE);
        new gy2.g(Features.TRACING_CONTROLLER_BASIC_USAGE, Features.TRACING_CONTROLLER_BASIC_USAGE);
        new crk0.b();
        new crk0.a();
        new gy2.h(Features.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE, Features.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE);
        new a();
        new gy2.d("PROXY_OVERRIDE", Features.PROXY_OVERRIDE);
        g = new gy2.d("MULTI_PROCESS", Features.MULTI_PROCESS_QUERY);
        h = new gy2.h(Features.FORCE_DARK, Features.FORCE_DARK);
        i = new gy2.d("FORCE_DARK_STRATEGY", Features.FORCE_DARK_BEHAVIOR);
        j = new gy2.d(Features.WEB_MESSAGE_LISTENER, Features.WEB_MESSAGE_LISTENER);
        new gy2.d("DOCUMENT_START_SCRIPT", Features.DOCUMENT_START_SCRIPT);
        new gy2.d(Features.PROXY_OVERRIDE_REVERSE_BYPASS, Features.PROXY_OVERRIDE_REVERSE_BYPASS);
        new gy2.d(Features.GET_VARIATIONS_HEADER, Features.GET_VARIATIONS_HEADER);
        new gy2.d(Features.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY, Features.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY);
        new gy2.d(Features.GET_COOKIE_INFO, Features.GET_COOKIE_INFO);
        new gy2.d(Features.REQUESTED_WITH_HEADER_ALLOW_LIST, Features.REQUESTED_WITH_HEADER_ALLOW_LIST);
        new gy2.d(Features.USER_AGENT_METADATA, Features.USER_AGENT_METADATA);
        new b(Features.MULTI_PROFILE, Features.MULTI_PROFILE);
        new gy2.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", Features.ATTRIBUTION_BEHAVIOR);
        new gy2.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", Features.WEBVIEW_MEDIA_INTEGRITY_API_STATUS);
        new gy2.d(Features.MUTE_AUDIO, Features.MUTE_AUDIO);
    }

    @NonNull
    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
