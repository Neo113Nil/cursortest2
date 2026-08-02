package com.yandex.passport.internal.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.tasks.Task;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity;
import com.yandex.passport.internal.ui.domik.common.BasePhoneNumberFragment;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesSlothActivity;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothActivity;
import com.yandex.passport.internal.ui.social.gimap.GimapServerPrefsBaseFragment;
import com.yandex.passport.internal.widget.ConfirmationCodeInput;
import defpackage.bx60;
import defpackage.n751;
import defpackage.t070;
import defpackage.u1w;
import defpackage.wx60;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements com.yandex.passport.legacy.lx.a, com.yandex.passport.legacy.lx.j, bx60, t070, wx60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.yandex.passport.legacy.lx.a
    /* renamed from: a */
    public void mo290a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AccountNotAuthorizedActivity.onCreate$lambda$0((AccountNotAuthorizedActivity) obj2, (Bitmap) obj);
                break;
            case 1:
                AutoLoginActivity.onCreate$lambda$0((AutoLoginActivity) obj2, (Bitmap) obj);
                break;
            case 2:
                ((BaseActivity) obj2).lambda$runCheckAuthenticator$0((String) obj);
                break;
            case 3:
                ((SocialApplicationBindActivity) obj2).lambda$finishBindApplication$1((Boolean) obj);
                break;
            case 4:
                ((SocialBindActivity) obj2).lambda$initializeBinding$1((Throwable) obj);
                break;
            case 11:
                ((BasePhoneNumberFragment) obj2).hideFieldError();
                break;
            case 14:
                ((GimapServerPrefsBaseFragment) obj2).lambda$new$0((Editable) obj);
                break;
            default:
                ((ConfirmationCodeInput) obj2).lambda$new$0((Editable) obj);
                break;
        }
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        n751 startBindSlothOrError$lambda$11;
        n751 onCreate$lambda$2;
        n751 onCreate$lambda$5;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 6:
                ViewGroup viewGroup = (ViewGroup) obj;
                u1w g = n751Var.a.g(647);
                viewGroup.setPadding(viewGroup.getPaddingLeft(), g.b, viewGroup.getPaddingRight(), g.d);
                return n751.b;
            case 7:
                ConstraintLayout constraintLayout = (ConstraintLayout) obj;
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), n751Var.a.g(2).d);
                return n751.b;
            case 8:
                startBindSlothOrError$lambda$11 = DeleteForeverActivity.startBindSlothOrError$lambda$11((DeleteForeverActivity) obj, view, n751Var);
                return startBindSlothOrError$lambda$11;
            case 9:
                u1w g2 = n751Var.a.g(655);
                ((ConstraintLayout.LayoutParams) obj).setMargins(g2.a, g2.b, g2.c, g2.d);
                return n751.b;
            case 10:
            case 11:
            default:
                onCreate$lambda$5 = WebCardSlothActivity.onCreate$lambda$5((WebCardSlothActivity) obj, view, n751Var);
                return onCreate$lambda$5;
            case 12:
                onCreate$lambda$2 = ManagingPlusDevicesSlothActivity.onCreate$lambda$2((ManagingPlusDevicesSlothActivity) obj, view, n751Var);
                return onCreate$lambda$2;
        }
    }

    @Override // defpackage.wx60
    public void onComplete(Task task) {
        io.appmetrica.analytics.push.provider.firebase.impl.f.a((CountDownLatch) this.b, task);
    }

    @Override // defpackage.t070
    public void onSuccess(Object obj) {
        ((com.yandex.passport.internal.ui.domik.common.a) this.b).invoke(obj);
    }

    @Override // com.yandex.passport.legacy.lx.j
    public Object a(Object obj) {
        LoginProperties loginProperties = (LoginProperties) this.b;
        GlobalRouterActivity.Companion.getClass();
        return com.yandex.passport.internal.ui.router.c.a((Context) obj, loginProperties, true, null, null);
    }
}
