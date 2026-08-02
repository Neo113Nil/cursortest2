package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.mobile.drive.core.network.ResponseError;
import com.yandex.mobile.drive.scan.ui.ScanActivity;
import com.yandex.mobile.drive.view.AlertView;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Collections;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class ir1 {
    public final Context a;
    public final h651 b;
    public final qx60 c;
    public final int d;
    public final int e;
    public ViewGroup f;
    public AlertView g;

    public ir1(ScanActivity scanActivity, h651 h651Var, qx60 qx60Var) {
        int i = dph0.view_alert;
        int i2 = m0h0.vec_alert_failure;
        this.a = scanActivity;
        this.b = h651Var;
        this.c = qx60Var;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AlertView a(ir1 ir1Var, fvj0 fvj0Var, String str, String str2, int i) {
        String str3;
        String str4;
        ResponseError.Details details;
        qgn0 qgn0Var;
        ResponseError.Info specialInfo;
        String errorCode;
        ResponseError responseError;
        ResponseError responseError2;
        String str5 = (i & 2) != 0 ? null : str;
        String str6 = (i & 4) != 0 ? null : str2;
        int i2 = wxh0.default_error_message;
        int i3 = wxh0.default_error_title;
        int i4 = wxh0.camera_alert_ok;
        int i5 = 12;
        bgc bgcVar = new bgc(i5);
        ir1Var.getClass();
        evj0 evj0Var = fvj0Var instanceof evj0 ? (evj0) fvj0Var : null;
        qq1 qq1Var = new qq1(Integer.valueOf(i4), new ic0(3, bgcVar), crg0.dark_blue, 497);
        ResponseError.Details details2 = (fvj0Var == null || (responseError2 = fvj0Var.a) == null) ? null : responseError2.getDetails();
        AlertView b = ir1Var.b();
        Integer valueOf = Integer.valueOf(i3);
        if (str5 == null) {
            if (details2 == null) {
                str3 = null;
                Integer valueOf2 = Integer.valueOf(i2);
                if (str6 == null) {
                    if (details2 == null) {
                        str4 = null;
                        b.show(valueOf, str3, valueOf2, str4, Collections.singletonList(qq1Var), Integer.valueOf(ir1Var.e), false, new bgc(i5));
                        Context context = ir1Var.a;
                        details = (evj0Var != null || (responseError = evj0Var.a) == null) ? null : responseError.getDetails();
                        if (details != null || (r2 = details.getUiTitle()) == null) {
                            String string = context.getString(i3);
                        }
                        Pair pair = new Pair("title", string);
                        if (details != null || (r2 = details.getUiMessage()) == null) {
                            String string2 = context.getString(i2);
                        }
                        HashMap h = b.h(pair, new Pair(Constants.KEY_MESSAGE, string2));
                        if (evj0Var != null) {
                            fwj0 fwj0Var = evj0Var.b;
                            h.put("url", fwj0Var.b);
                            if (details != null && (specialInfo = details.getSpecialInfo()) != null && (errorCode = specialInfo.getErrorCode()) != null) {
                                h.put(AuthSdkActivity.RESPONSE_TYPE_CODE, errorCode);
                            }
                            h.put("http_code", Integer.valueOf(fwj0Var.a));
                            h.put("response_time", Long.valueOf((fwj0Var.d - fwj0Var.c) / 1000));
                            String debugMessage = details != null ? details.getDebugMessage() : null;
                            if (debugMessage == null) {
                                debugMessage = "";
                            }
                            h.put("tech_description", debugMessage);
                        }
                        qgn0Var = h2b1.c;
                        if (qgn0Var != null) {
                            qgn0Var.n("error_shown", h);
                        }
                        return b;
                    }
                    str6 = details2.getUiMessage();
                }
                str4 = str6;
                b.show(valueOf, str3, valueOf2, str4, Collections.singletonList(qq1Var), Integer.valueOf(ir1Var.e), false, new bgc(i5));
                Context context2 = ir1Var.a;
                if (evj0Var != null) {
                }
                if (details != null) {
                }
                String string3 = context2.getString(i3);
                Pair pair2 = new Pair("title", string3);
                if (details != null) {
                }
                String string22 = context2.getString(i2);
                HashMap h2 = b.h(pair2, new Pair(Constants.KEY_MESSAGE, string22));
                if (evj0Var != null) {
                }
                qgn0Var = h2b1.c;
                if (qgn0Var != null) {
                }
                return b;
            }
            str5 = details2.getUiTitle();
        }
        str3 = str5;
        Integer valueOf22 = Integer.valueOf(i2);
        if (str6 == null) {
        }
        str4 = str6;
        b.show(valueOf, str3, valueOf22, str4, Collections.singletonList(qq1Var), Integer.valueOf(ir1Var.e), false, new bgc(i5));
        Context context22 = ir1Var.a;
        if (evj0Var != null) {
        }
        if (details != null) {
        }
        String string32 = context22.getString(i3);
        Pair pair22 = new Pair("title", string32);
        if (details != null) {
        }
        String string222 = context22.getString(i2);
        HashMap h22 = b.h(pair22, new Pair(Constants.KEY_MESSAGE, string222));
        if (evj0Var != null) {
        }
        qgn0Var = h2b1.c;
        if (qgn0Var != null) {
        }
        return b;
    }

    public final AlertView b() {
        AlertView alertView = this.g;
        if (alertView != null) {
            ViewParent parent = alertView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(alertView);
            }
            alertView.destroy();
        }
        AlertView alertView2 = new AlertView(this.a, this.b, true, this.c, this.d);
        ViewGroup viewGroup2 = this.f;
        if (viewGroup2 != null) {
            viewGroup2.addView(alertView2, new ViewGroup.LayoutParams(-1, -1));
        }
        this.g = alertView2;
        return alertView2;
    }
}
