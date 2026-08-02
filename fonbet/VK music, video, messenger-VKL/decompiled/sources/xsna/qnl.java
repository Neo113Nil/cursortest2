package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.ui.VkBrowserActivity;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.Result;
import kotlin.text.Regex;
import xsna.hl10;

/* compiled from: SuperappLinksHandler.kt */
/* loaded from: classes6.dex */
public final class qnl {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0122 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Context context, String str, io.reactivex.rxjava3.disposables.b bVar) {
        Object failure;
        List<String> b;
        String str2;
        m2v0.a.getClass();
        try {
            failure = Uri.parse(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        boolean z = failure instanceof Result.Failure;
        Object obj = failure;
        if (z) {
            obj = null;
        }
        Uri uri = (Uri) obj;
        boolean z2 = false;
        if (!(uri == null ? false : m2v0.a(uri))) {
            SimpleDateFormat simpleDateFormat = bgu0.a;
            rex0 rex0Var = e370.j;
            return bgu0.b(context, rex0Var != null ? rex0Var : null, str);
        }
        Uri parse = Uri.parse(str);
        List<String> pathSegments = parse.getPathSegments();
        String str3 = pathSegments != null ? (String) j5g.b0(0, pathSegments) : null;
        if (str3 != null) {
            String query = parse.getQuery();
            if (str3.equals("validate_phone")) {
                Activity h = e3m.h(context);
                FragmentActivity fragmentActivity = h instanceof FragmentActivity ? (FragmentActivity) h : null;
                if (fragmentActivity != null) {
                    bVar.b(com.vk.auth.validation.b.b(r55.d, fragmentActivity, null, 120));
                    z2 = true;
                }
                if (z2) {
                    return true;
                }
            } else {
                if (str3.equals("services")) {
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    if (superappUiRouterBridge == null) {
                        superappUiRouterBridge = null;
                    }
                    superappUiRouterBridge.Q(context);
                } else if (str3.equals("support")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("https://" + "static.".concat(a0a.d) + '/');
                    sb.append(str3);
                    if (myc0.f(query)) {
                        sb.append("?" + query);
                    }
                    String sb2 = sb.toString();
                    int i = VkBrowserActivity.l;
                    VkBrowserActivity.a.c(context, sb2, false);
                } else {
                    if (drm0.D(str3, "faq", false)) {
                        Uri.Builder buildUpon = Uri.parse("https://" + "static.".concat(a0a.d) + "/support").buildUpon();
                        hl10 b2 = new Regex("faq(\\d+)").b(str3);
                        if (b2 != null && (b = b2.b()) != null && (str2 = (String) ((hl10.a) b).get(1)) != null) {
                            buildUpon.appendQueryParameter("act", "article");
                            buildUpon.appendQueryParameter("id", str2);
                        }
                        String builder = buildUpon.toString();
                        int i2 = VkBrowserActivity.l;
                        VkBrowserActivity.a.c(context, builder, false);
                    }
                    if (z2) {
                    }
                }
                z2 = true;
                if (z2) {
                }
            }
        }
        vdx0 vdx0Var = e370.e;
        bVar.b((vdx0Var != null ? vdx0Var : null).d().X(str).subscribe(new ji3(new jl6(this, context, str, 3), 23), new np3(new np5(this, context, str), 16)));
        return true;
    }
}
