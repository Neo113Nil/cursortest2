package xsna;

import android.content.Context;
import android.content.DialogInterface;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.superapp.api.exceptions.AuthException;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.bzp0;
import xsna.cfv0;
import xsna.tcl;

/* compiled from: CommonApiErrorViewDelegate.kt */
/* loaded from: classes.dex */
public abstract class ehg {
    public final Context a;
    public final DialogInterface.OnDismissListener b;
    public final tcl c;

    public ehg(Context context, DialogInterface.OnDismissListener onDismissListener) {
        this.a = context;
        this.b = onDismissListener;
        this.c = new tcl(context);
    }

    public final z46 a(Throwable th) {
        wz2 wz2Var;
        VKApiExecutionException vKApiExecutionException;
        tcl tclVar = this.c;
        Context context = tclVar.a;
        if (sd9.l(th)) {
            wz2Var = new wz2("unknown", ApiErrorViewType.FULLSCREEN);
        } else if (th instanceof VKApiExecutionException) {
            VKApiExecutionException vKApiExecutionException2 = (VKApiExecutionException) th;
            ApiErrorViewType G = vKApiExecutionException2.s() == 14 ? ApiErrorViewType.SKIP : vKApiExecutionException2.G();
            if (G == null) {
                G = ApiErrorViewType.CUSTOM;
            }
            wz2Var = new cfv0(vKApiExecutionException2.g(), G, vKApiExecutionException2.t(), vKApiExecutionException2.s(), vKApiExecutionException2.C(), vKApiExecutionException2.u());
        } else if (th instanceof AuthException.DetailedAuthException) {
            com.vk.superapp.core.api.models.a d = ((AuthException.DetailedAuthException) th).d();
            JSONObject j = cqm0.j(d.a());
            if (j.has("error_code")) {
                int i = VKApiExecutionException.b;
                vKApiExecutionException = VKApiExecutionException.a.a(j, (r2 & 2) != 0 ? null : "/v2/bulk_upload", null);
            } else {
                vKApiExecutionException = null;
            }
            if (vKApiExecutionException == null) {
                ApiErrorViewType g = d.g();
                if (g == null) {
                    g = ApiErrorViewType.CUSTOM;
                }
                wz2Var = new fp70(g, d.a(), d.b());
            } else {
                wz2Var = cfv0.a.a(vKApiExecutionException);
            }
        } else {
            wz2Var = th instanceof AuthException ? new wz2("oauth", ApiErrorViewType.CUSTOM) : new wz2("unknown", ApiErrorViewType.CUSTOM);
        }
        int i2 = tcl.a.$EnumSwitchMapping$0[wz2Var.a().ordinal()];
        if (i2 == 1) {
            return new f1x(wz2Var, tclVar.a(wz2Var), context.getString(R.string.vk_auth_unknown_error));
        }
        if (i2 == 2) {
            return tclVar.a(wz2Var);
        }
        if (i2 == 3) {
            return new ixs(context.getString(R.string.vk_auth_error_no_internet), context.getString(R.string.vk_auth_error_no_internet_hint), wz2Var);
        }
        if (i2 == 4) {
            return tclVar.a(wz2Var);
        }
        if (i2 == 5) {
            return new gzj0(wz2Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    public abstract void b(bzp0.a aVar);

    public abstract void c(bzp0.b bVar);
}
