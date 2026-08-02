package com.yandex.passport.internal.ui.sloth.plusdevices;

import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.app.d1;
import com.yandex.passport.api.impl.UserIdProperties;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardComposeActivity;
import com.yandex.passport.internal.ui.sloth.webcard.v0;
import com.yandex.passport.internal.ui.social.SocialBindingFragment;
import com.yandex.passport.internal.ui.social.SocialFragment;
import com.yandex.passport.internal.widget.ErrorView;
import com.yandex.passport.sloth.ui.SlothUiWish;
import com.yandex.passport.sloth.ui.g2;
import defpackage.sls;
import defpackage.zy11;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class w implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        com.yandex.passport.internal.ui.social.authenticators.f createViewModel;
        com.yandex.passport.internal.ui.social.authenticators.f createViewModel2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                h0 h0Var = (h0) obj;
                return new c0(h0Var.b, h0Var.c, h0Var.d, h0Var.e);
            case 1:
                ((RegisterWebAuthNActivity) obj).finish();
                return zy11Var;
            case 2:
                com.yandex.passport.internal.ui.sloth.webauthn.p pVar = (com.yandex.passport.internal.ui.sloth.webauthn.p) obj;
                return new com.yandex.passport.internal.ui.sloth.webauthn.k(pVar.b, pVar.c, pVar.d);
            case 3:
                ((WebCardComposeActivity) obj).finish();
                return zy11Var;
            case 4:
                com.yandex.passport.internal.ui.sloth.webcard.w wVar = (com.yandex.passport.internal.ui.sloth.webcard.w) obj;
                return new com.yandex.passport.internal.ui.sloth.webcard.q(wVar.c, wVar.d, wVar.e, wVar.f, wVar.g);
            case 5:
                v0 v0Var = (v0) obj;
                com.yandex.passport.biometric.ui.verification.a aVar = new com.yandex.passport.biometric.ui.verification.a();
                aVar.b = com.yandex.passport.internal.ui.sloth.l.b(v0Var.a, v0Var.b, v0Var.c, 4);
                return aVar.f().a();
            case 6:
                createViewModel = ((SocialBindingFragment) obj).createViewModel();
                return createViewModel;
            case 7:
                createViewModel2 = ((SocialFragment) obj).createViewModel();
                return createViewModel2;
            case 8:
                return ((com.yandex.passport.internal.usecase.l) obj).a.getSharedPreferences("ebs_initialization_pref", 0);
            case 9:
                com.yandex.passport.internal.widget.c cVar = (com.yandex.passport.internal.widget.c) obj;
                FrameLayout frameLayout = cVar.a;
                int paddingTop = frameLayout.getPaddingTop();
                ErrorView[] errorViewArr = cVar.b;
                ArrayList arrayList = new ArrayList(2);
                for (int i2 = 0; i2 < 2; i2++) {
                    arrayList.add(Float.valueOf(errorViewArr[i2].getTranslationY() + r7.getMeasuredHeight()));
                }
                float floatValue = kotlin.collections.a.e0(arrayList).floatValue();
                float f = paddingTop;
                if (f <= floatValue) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.topMargin = (int) (floatValue - f);
                    frameLayout.setLayoutParams(layoutParams);
                } else {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams2.topMargin = 0;
                    frameLayout.setLayoutParams(layoutParams2);
                }
                return zy11Var;
            case 10:
                ((g2) ((com.yandex.passport.internal.ui.challenge.vpn.o) obj).b).a(SlothUiWish.CANCEL);
                return zy11Var;
            case 11:
                d1 d1Var = (d1) obj;
                return new com.yandex.passport.user_id.r((com.yandex.passport.biometric.ui.verification.a) d1Var.b, (com.yandex.passport.internal.upgrader.h) d1Var.c, (com.yandex.passport.internal.methods.requester.e) d1Var.w, (UserIdProperties) d1Var.x);
            default:
                ((WebView) obj).goBack();
                return zy11Var;
        }
    }
}
