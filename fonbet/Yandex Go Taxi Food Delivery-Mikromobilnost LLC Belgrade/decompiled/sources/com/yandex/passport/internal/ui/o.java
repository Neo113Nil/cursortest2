package com.yandex.passport.internal.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import com.yandex.passport.R;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.authsdk.TurboAppFragment;
import com.yandex.passport.internal.ui.browser.SocialBrowserActivity;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import defpackage.bx60;
import defpackage.n751;
import defpackage.tka1;
import defpackage.u1w;
import defpackage.x651;
import defpackage.y651;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements com.yandex.passport.legacy.lx.a, com.yandex.passport.legacy.lx.j, bx60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // com.yandex.passport.legacy.lx.j
    public Object a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 1:
                com.yandex.passport.internal.ui.router.c cVar = GlobalRouterActivity.Companion;
                LoginProperties.a aVar = new LoginProperties.a(((com.yandex.passport.internal.ui.authsdk.l) obj3).I.getLoginProperties());
                aVar.A = com.yandex.passport.internal.util.p.A((Uid) obj2);
                aVar.a = true;
                LoginProperties a = aVar.a();
                cVar.getClass();
                return com.yandex.passport.internal.ui.router.c.a((Context) obj, a, true, null, null);
            case 5:
                return SocialBrowserActivity.createIntent((Context) obj3, (Uri) obj2);
            default:
                com.yandex.passport.internal.ui.social.authenticators.e eVar = (com.yandex.passport.internal.ui.social.authenticators.e) obj3;
                Context context = (Context) obj;
                com.yandex.passport.internal.network.client.e b = eVar.D.b(com.yandex.passport.internal.util.p.u(eVar.b.getFilter().getPrimaryEnvironment()));
                String providerCodeOld = eVar.c.getProviderCodeOld();
                String b2 = com.yandex.passport.common.browser.c.b(context);
                String value = eVar.F.getValue();
                eVar.C.getClass();
                return SocialBrowserActivity.createIntent(context, Uri.parse(Uri.parse(b.e()).buildUpon().appendEncodedPath("broker2/start").appendQueryParameter("bind", "1").appendQueryParameter("yandex_token", value).appendQueryParameter("consumer", ((com.yandex.passport.internal.common.e) b.f).a()).appendQueryParameter("provider", providerCodeOld).appendQueryParameter("retpath", b2).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("code_challenge", com.yandex.passport.internal.util.j.a((String) obj2)).appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("passthrough_errors", "UserDeniedError").toString()));
        }
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        com.yandex.passport.internal.ui.bouncer.roundabout.m mVar = (com.yandex.passport.internal.ui.bouncer.roundabout.m) this.c;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
        u1w g = n751Var.a.g(HProv.PP_SECURITY_LEVEL);
        mVar.w.F = tka1.g(coordinatorLayout).getResources().getDisplayMetrics().heightPixels - g.b;
        x651 x651Var = new x651(n751Var);
        u1w c = u1w.c(0, 0, 0, 0);
        y651 y651Var = x651Var.a;
        y651Var.b(HProv.PP_SECURITY_LEVEL, c);
        return y651Var.h();
    }

    @Override // com.yandex.passport.legacy.lx.a
    /* renamed from: a */
    public void mo290a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((SocialApplicationBindActivity) obj3).lambda$finishBindApplication$2((Uid) obj2, (Throwable) obj);
                break;
            case 1:
            default:
                final Context context = (Context) obj2;
                final String str = (String) obj;
                ((com.yandex.passport.internal.util.h) obj3).b = null;
                AlertDialog.a aVar = new AlertDialog.a(context);
                final int i2 = 0;
                aVar.a.m = false;
                aVar.i(R.string.passport_debug_information_title);
                aVar.c(R.string.passport_debug_additional_info_collected);
                aVar.f(R.string.passport_debug_send_email, new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.util.g
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        int i4 = i2;
                        String str2 = str;
                        Context context2 = context;
                        switch (i4) {
                            case 0:
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("message/rfc822");
                                intent.putExtra("android.intent.extra.EMAIL", new String[]{"passport@support.yandex.ru"});
                                intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, "Yandex Accounts report");
                                intent.putExtra("android.intent.extra.TEXT", str2);
                                context2.startActivity(intent);
                                break;
                            default:
                                ClipboardManager clipboardManager = (ClipboardManager) context2.getSystemService("clipboard");
                                if (clipboardManager != null) {
                                    clipboardManager.setPrimaryClip(ClipData.newPlainText("AM debug info", str2));
                                }
                                Toast.makeText(context2, R.string.passport_debug_copied_to_clipboard, 0).show();
                                break;
                        }
                    }
                });
                final int i3 = 1;
                aVar.setPositiveButton(R.string.passport_debug_copy_to_clipboard, new DialogInterface.OnClickListener() { // from class: com.yandex.passport.internal.util.g
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i32) {
                        int i4 = i3;
                        String str2 = str;
                        Context context2 = context;
                        switch (i4) {
                            case 0:
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("message/rfc822");
                                intent.putExtra("android.intent.extra.EMAIL", new String[]{"passport@support.yandex.ru"});
                                intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, "Yandex Accounts report");
                                intent.putExtra("android.intent.extra.TEXT", str2);
                                context2.startActivity(intent);
                                break;
                            default:
                                ClipboardManager clipboardManager = (ClipboardManager) context2.getSystemService("clipboard");
                                if (clipboardManager != null) {
                                    clipboardManager.setPrimaryClip(ClipData.newPlainText("AM debug info", str2));
                                }
                                Toast.makeText(context2, R.string.passport_debug_copied_to_clipboard, 0).show();
                                break;
                        }
                    }
                }).create().show();
                break;
            case 2:
                TurboAppFragment.showContent$lambda$10((TurboAppFragment) obj3, (String) obj2, (Bitmap) obj);
                break;
            case 3:
                TurboAppFragment.showAccount$lambda$14((TurboAppFragment) obj3, (ModernAccount) obj2, (Bitmap) obj);
                break;
        }
    }
}
