package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.Window;
import java.util.Collections;

/* loaded from: classes15.dex */
public final class iep0 implements pj21 {
    public final /* synthetic */ int a;
    public Activity b;
    public boolean c;

    public /* synthetic */ iep0(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    public void a() {
        f69 f69Var = xi7.a;
        f69.k("disableScreenSecurity", Collections.singletonList("ScreenSecurityManager"));
        Activity activity = this.b;
        if (activity == null) {
            xi7.a.m("Cannot disable screen security: Activity is null", null, Collections.singletonList("ScreenSecurityManager"));
            ny61.r("Activity is not available");
            return;
        }
        Window window = activity.getWindow();
        if (window != null) {
            window.clearFlags(8192);
        }
        this.c = false;
        f69.k("Screen security disabled successfully", Collections.singletonList("ScreenSecurityManager"));
    }

    public void b() {
        f69 f69Var = xi7.a;
        f69.k("enableScreenSecurity", Collections.singletonList("ScreenSecurityManager"));
        Activity activity = this.b;
        if (activity == null) {
            xi7.a.m("Cannot enable screen security: Activity is null", null, Collections.singletonList("ScreenSecurityManager"));
            ny61.r("Activity is not available");
            return;
        }
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(8192);
        }
        this.c = true;
        f69.k("Screen security enabled successfully", Collections.singletonList("ScreenSecurityManager"));
    }

    @Override // defpackage.pj21
    public void m() {
        switch (this.a) {
            case 1:
                if (!this.c) {
                    final int i = 0;
                    final int i2 = 1;
                    new AlertDialog.Builder(this.b, w0i0.Messaging_AlertDialog).setTitle(oyh0.restricted_with_ban_title).setMessage(oyh0.restricted_with_ban_text).setNegativeButton(oyh0.button_close, new DialogInterface.OnClickListener(this) { // from class: lk21
                        public final /* synthetic */ iep0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            int i4 = i;
                            iep0 iep0Var = this.b;
                            switch (i4) {
                                case 0:
                                    iep0Var.c = false;
                                    break;
                                default:
                                    iep0Var.c = false;
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setData(Uri.parse("https://yandex.ru/support/messenger/rules.html"));
                                    iep0Var.b.startActivity(intent);
                                    break;
                            }
                        }
                    }).setPositiveButton(oyh0.restricted_with_ban_button_more, new DialogInterface.OnClickListener(this) { // from class: lk21
                        public final /* synthetic */ iep0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            int i4 = i2;
                            iep0 iep0Var = this.b;
                            switch (i4) {
                                case 0:
                                    iep0Var.c = false;
                                    break;
                                default:
                                    iep0Var.c = false;
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setData(Uri.parse("https://yandex.ru/support/messenger/rules.html"));
                                    iep0Var.b.startActivity(intent);
                                    break;
                            }
                        }
                    }).show();
                    this.c = true;
                    break;
                }
                break;
            default:
                if (!this.c) {
                    new AlertDialog.Builder(this.b, w0i0.Messaging_AlertDialog).setTitle(oyh0.restricted_with_blacklisted_title).setMessage(oyh0.restricted_with_blacklisted_text).setNegativeButton(oyh0.button_close, new p97(9, this)).show();
                    this.c = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ iep0() {
        this.a = 0;
    }
}
