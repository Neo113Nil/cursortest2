package com.yandex.passport.sloth.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.ViewCompat$Api21Impl;
import com.lightside.visum.layouts.FrameLayoutBuilder;
import com.lightside.visum.layouts.LinearLayoutBuilder;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.resources.StringResource;
import com.yandex.passport.sloth.SlothMetricaEvent$PhoneNumberHintState;
import com.yandex.passport.sloth.ui.string.SlothString;
import defpackage.a4b1;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                h hVar = (h) obj3;
                z1 z1Var = (z1) obj2;
                Intent data = ((ActivityResult) obj).getData();
                l lVar = hVar.a;
                try {
                    z1Var.W(new t1(a4b1.a(hVar.d).e(data)));
                    ((com.yandex.passport.internal.ui.sloth.f) lVar).a(new com.yandex.passport.sloth.n0(SlothMetricaEvent$PhoneNumberHintState.SUCCESS, (String) null));
                    break;
                } catch (Exception e) {
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.WARN, null, "Phone Number Hint launcher failed", e);
                    }
                    ((com.yandex.passport.internal.ui.sloth.f) lVar).a(new com.yandex.passport.sloth.n0(SlothMetricaEvent$PhoneNumberHintState.FAILED, e.getMessage()));
                    z1Var.W(new t1(null));
                    break;
                }
            case 1:
                h hVar2 = (h) obj3;
                String str = (String) obj;
                final u uVar = new u((p) obj2, 1);
                AlertDialog.a aVar = new AlertDialog.a(hVar2.d);
                com.yandex.passport.internal.ui.sloth.k kVar = (com.yandex.passport.internal.ui.sloth.k) hVar2.b;
                aVar.i(kVar.a(SlothString.FATAL_ERROR_DIALOG_TEXT));
                com.yandex.passport.internal.ui.g gVar = kVar.a;
                if (str == null) {
                    str = "unknown error";
                }
                aVar.c(StringResource.m277constructorimpl(gVar.b(str)));
                aVar.a();
                aVar.setPositiveButton(kVar.a(SlothString.FATAL_ERROR_DIALOG_BUTTON), new DialogInterface.OnClickListener() { // from class: com.yandex.passport.sloth.ui.SlothActivityInteractor$showFatalErrorDialog$lambda$1$$inlined$positiveButton-96bAjMM$1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        sls.this.invoke();
                    }
                });
                aVar.create().show();
                break;
            case 2:
                FrameLayoutBuilder frameLayoutBuilder = (FrameLayoutBuilder) obj3;
                o0 o0Var = (o0) obj2;
                WebView webView = (WebView) obj;
                ViewGroup.LayoutParams generateLayoutParams = frameLayoutBuilder.generateLayoutParams(-2, -2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) generateLayoutParams;
                layoutParams.width = -1;
                layoutParams.height = -1;
                Integer num = o0Var.w.f().c;
                if (num != null) {
                    frameLayoutBuilder.setBackgroundColor(o0Var.c.getColor(num.intValue()));
                    f fVar = new f(2, frameLayoutBuilder);
                    WeakHashMap weakHashMap = androidx.core.view.b.a;
                    ViewCompat$Api21Impl.o(webView, fVar);
                }
                webView.setLayoutParams(generateLayoutParams);
                break;
            default:
                i2 i2Var = (i2) obj2;
                View view = (View) obj;
                ViewGroup.LayoutParams generateLayoutParams2 = ((LinearLayoutBuilder) obj3).generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) generateLayoutParams2;
                com.yandex.passport.sloth.ui.dependencies.o oVar = i2Var.c;
                com.yandex.passport.sloth.ui.dependencies.k kVar2 = i2Var.x;
                layoutParams2.width = oVar.d() instanceof com.yandex.passport.sloth.ui.dependencies.f ? kVar2.a : -2;
                layoutParams2.height = kVar2.b;
                view.setLayoutParams(generateLayoutParams2);
                break;
        }
        return zy11Var;
        return zy11Var;
    }
}
