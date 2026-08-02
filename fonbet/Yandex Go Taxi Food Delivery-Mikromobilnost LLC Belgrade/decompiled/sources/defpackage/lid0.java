package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.api.e2;
import com.yandex.passport.internal.flags.j;
import com.yandex.passport.internal.flags.q;
import com.yandex.passport.internal.impl.r;
import com.yandex.passport.internal.links.LinksHandlingActivity;
import com.yandex.passport.internal.push.NotificationsBuilderActivity;
import com.yandex.passport.internal.report.diary.i;
import com.yandex.passport.internal.ui.SocialApplicationBindActivity;
import com.yandex.passport.internal.ui.SocialBindActivity;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.challenge.changecurrent.SetCurrentAccountActivity;
import com.yandex.passport.internal.ui.challenge.changecurrent.SetCurrentComposeActivity;
import com.yandex.passport.internal.ui.challenge.delete.DeleteAccountActivity;
import com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetActivity;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetComposeActivity;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.router.LoginRouterActivity;
import com.yandex.passport.internal.ui.router.RoadSign;
import com.yandex.passport.internal.ui.router.k;
import com.yandex.passport.internal.ui.router.l;
import com.yandex.passport.internal.ui.router.m;
import com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity;
import com.yandex.passport.internal.ui.tv.AuthInWebViewActivity;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.plus.core.activity.result.internal.d;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference0;

/* loaded from: classes8.dex */
public final class lid0 extends x40 {
    public final /* synthetic */ int a;
    public final Object b;

    public lid0(sls slsVar) {
        this.a = 2;
        this.b = slsVar;
    }

    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        Intent B;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((d) obj2).c.a(context, obj);
            case 1:
                return ((r) obj2).a.f(context, (e2) obj);
            default:
                k kVar = (k) obj;
                m mVar = (m) ((PropertyReference0) ((sls) obj2)).get();
                RoadSign roadSign = kVar.a;
                Bundle bundle = kVar.b;
                mVar.c.getDiaryRecorder().a(new i(roadSign), bundle, kVar.c);
                j jVar = mVar.b;
                int i2 = l.a[roadSign.ordinal()];
                Intent intent = null;
                switch (i2) {
                    case 1:
                        B = d6z.B(context, LoginRouterActivity.class, s8o.d(new Pair[0]));
                        intent = B;
                        intent.replaceExtras(bundle);
                        return intent;
                    case 2:
                        B = d6z.B(context, SocialBindActivity.class, s8o.d(new Pair[0]));
                        intent = B;
                        intent.replaceExtras(bundle);
                        return intent;
                    case 3:
                        B = d6z.B(context, SocialApplicationBindActivity.class, s8o.d(new Pair[0]));
                        intent = B;
                        intent.replaceExtras(bundle);
                        return intent;
                    case 4:
                        B = d6z.B(context, AuthInWebViewActivity.class, s8o.d(new Pair[0]));
                        intent = B;
                        intent.replaceExtras(bundle);
                        return intent;
                    case 5:
                        B = d6z.B(context, AuthSdkActivity.class, s8o.d(new Pair[0]));
                        intent = B;
                        intent.replaceExtras(bundle);
                        return intent;
                    case 6:
                        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vng.u(bundle, Uri.class, GlobalRouterActivity.URI) : bundle.getParcelable(GlobalRouterActivity.URI);
                        if (parcelable == null) {
                            ny61.r("can't get required parcelable URI");
                            return intent;
                        }
                        B = new Intent("android.intent.action.VIEW", (Uri) parcelable);
                        B.setComponent(new ComponentName(context, (Class<?>) LinksHandlingActivity.class));
                        intent = B;
                        intent.replaceExtras(bundle);
                        return intent;
                    case 7:
                        B = ((Boolean) jVar.b(q.V)).booleanValue() ? d6z.B(context, LogoutBottomSheetComposeActivity.class, s8o.d(new Pair[0])) : d6z.B(context, LogoutBottomSheetActivity.class, s8o.d(new Pair[0]));
                        intent = B;
                        intent.replaceExtras(bundle);
                        return intent;
                    case 8:
                        B = ((Boolean) jVar.b(q.U)).booleanValue() ? d6z.B(context, SetCurrentComposeActivity.class, s8o.d(new Pair[0])) : d6z.B(context, SetCurrentAccountActivity.class, s8o.d(new Pair[0]));
                        intent = B;
                        intent.replaceExtras(bundle);
                        return intent;
                    case 9:
                        B = d6z.B(context, WebViewActivity.class, s8o.d(new Pair[0]));
                        intent = B;
                        intent.replaceExtras(bundle);
                        return intent;
                    case 10:
                        B = d6z.B(context, NotificationsBuilderActivity.class, s8o.d(new Pair[0]));
                        intent = B;
                        intent.replaceExtras(bundle);
                        return intent;
                    case 11:
                        B = d6z.B(context, UserMenuActivity.class, s8o.d(new Pair[0]));
                        intent = B;
                        intent.replaceExtras(bundle);
                        return intent;
                    case 12:
                        B = ((Boolean) jVar.b(q.Y)).booleanValue() ? d6z.B(context, DeleteAccountActivity.class, s8o.d(new Pair[0])) : d6z.B(context, DeleteForeverActivity.class, s8o.d(new Pair[0]));
                        intent = B;
                        intent.replaceExtras(bundle);
                        return intent;
                    default:
                        w511.b();
                        return intent;
                }
        }
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        switch (this.a) {
            case 0:
                x40 x40Var = ((d) this.b).c;
                if (x40Var != null) {
                    return x40Var.c(i, intent);
                }
                return null;
            case 1:
                if (intent == null) {
                    return Boolean.valueOf(i == -1);
                }
                if (i == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i == -1);
            default:
                return new t40(i != -1 ? i != 0 ? new zyj0(i) : yyj0.b : yyj0.c, intent);
        }
    }

    public /* synthetic */ lid0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
