package com.yandex.passport.sloth.ui;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.yandex.passport.common.resources.StringResource;
import com.yandex.passport.sloth.ui.string.SlothString;
import defpackage.eja1;
import defpackage.tje;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class y implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ d0 b;
    public final /* synthetic */ b1 c;

    public /* synthetic */ y(d0 d0Var, b1 b1Var) {
        this.b = d0Var;
        this.c = b1Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        b1 b1Var = this.c;
        final d0 d0Var = this.b;
        switch (i) {
            case 0:
                g2 g2Var = d0Var.I;
                String str = (String) obj;
                com.yandex.passport.sloth.b1 b1Var2 = (com.yandex.passport.sloth.b1) b1Var;
                com.yandex.passport.sloth.url.p a = b1Var2.a(str);
                boolean z = true;
                if (a instanceof com.yandex.passport.sloth.url.l) {
                    d0Var.M.a(new com.yandex.passport.sloth.n0(str, 1));
                }
                Activity activity = d0Var.E;
                if (a.equals(com.yandex.passport.sloth.url.k.a)) {
                    z = false;
                } else if (a.equals(com.yandex.passport.sloth.url.l.a)) {
                    d0Var.K.b(d0Var, b1Var2, com.yandex.passport.sloth.ui.webview.a.a);
                } else if (a instanceof com.yandex.passport.sloth.url.n) {
                    tje.N(eja1.s(d0Var), null, null, new SlothSlab$handle$1(d0Var, b1Var2, null), 3);
                } else if (a instanceof com.yandex.passport.sloth.url.m) {
                    com.yandex.passport.sloth.url.m mVar = (com.yandex.passport.sloth.url.m) a;
                    tje.N(d0Var, null, null, new SlothSlab$openExternalBrowser$1(d0Var, mVar.a, null), 3);
                    if (mVar.b) {
                        g2Var.a(SlothUiWish.CANCEL);
                    }
                } else if (a.equals(com.yandex.passport.sloth.url.k.b)) {
                    g2Var.a(SlothUiWish.CANCEL);
                } else if (a instanceof com.yandex.passport.sloth.url.o) {
                    String str2 = ((com.yandex.passport.sloth.url.o) a).a;
                    AlertDialog.a aVar = new AlertDialog.a(activity);
                    com.yandex.passport.internal.ui.sloth.k kVar = (com.yandex.passport.internal.ui.sloth.k) d0Var.H;
                    aVar.i(kVar.a(SlothString.FATAL_ERROR_DIALOG_TEXT));
                    com.yandex.passport.internal.ui.g gVar = kVar.a;
                    if (str2 == null) {
                        str2 = "unknown error";
                    }
                    aVar.c(StringResource.m277constructorimpl(gVar.b(str2)));
                    aVar.a();
                    aVar.setPositiveButton(kVar.a(SlothString.FATAL_ERROR_DIALOG_BUTTON), new DialogInterface.OnClickListener() { // from class: com.yandex.passport.sloth.ui.SlothSlab$showFatalErrorDialog$lambda$12$$inlined$positiveButton-96bAjMM$1
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            d0.this.I.a(SlothUiWish.BACK);
                        }
                    });
                    aVar.create().show();
                } else if (a.equals(com.yandex.passport.sloth.url.k.d)) {
                    d0Var.F.b(s0.b);
                } else {
                    if (!a.equals(com.yandex.passport.sloth.url.k.c)) {
                        w511.b();
                        return null;
                    }
                    activity.setResult(17121);
                    activity.finish();
                }
                return Boolean.valueOf(z);
            default:
                d0Var.K.b(d0Var, b1Var, (com.yandex.passport.sloth.ui.webview.f) obj);
                return zy11.a;
        }
    }

    public /* synthetic */ y(b1 b1Var, d0 d0Var) {
        this.c = b1Var;
        this.b = d0Var;
    }
}
