package xsna;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.ironsource.Z3;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.auth.modal.base.ModalAuthInvalidAccountException;
import com.vk.auth.modal.base.ModalAuthOpenerInterface$AuthParams;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.dto.qr.ModalAuthFlowType;
import com.vk.superapp.api.internal.requests.qr.ProcessAuthCode$Companion$Action;
import com.vk.toggle.anonymous.SakFeatures;
import xsna.usi0;

/* compiled from: ModalAuthOpenerDelegate.kt */
/* loaded from: classes15.dex */
public final class sv20 {
    public final ahg a;
    public final int b;

    /* compiled from: ModalAuthOpenerDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModalAuthFlowType.values().length];
            try {
                iArr[ModalAuthFlowType.QrAuthFlow.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModalAuthFlowType.TvCodeAuthFlow.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ModalAuthFlowType.MvkAuthFlow.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public sv20(Context context) {
        this.a = chg.a(context);
        this.b = SakFeatures.Type.SAK_QR_WITH_CODE.h() ? Integer.parseInt(ProcessAuthCode$Companion$Action.INFO_FOR_CODE.h()) : Integer.parseInt(ProcessAuthCode$Companion$Action.INFO.h());
    }

    public final void a(Context context, ModalAuthOpenerInterface$AuthParams modalAuthOpenerInterface$AuthParams, tv20 tv20Var) {
        Throwable th;
        AccountProfileType accountProfileType;
        fhq0 c;
        String str = modalAuthOpenerInterface$AuthParams.b;
        if (str == null || str.length() == 0) {
            IllegalStateException illegalStateException = new IllegalStateException("authCode must not be null");
            qv20.i(context, illegalStateException, modalAuthOpenerInterface$AuthParams.c, null, null, null, null, null, false, Z3.l);
            th = illegalStateException;
        } else {
            r55 r55Var = r55.a;
            usi0.a i = r55.g().i();
            if (i == null || (c = i.c()) == null || (accountProfileType = c.b) == null) {
                accountProfileType = AccountProfileType.NORMAL;
            }
            if (accountProfileType != AccountProfileType.NORMAL) {
                th = new ModalAuthInvalidAccountException();
                qv20.i(context, th, modalAuthOpenerInterface$AuthParams.c, null, null, null, null, null, false, Z3.l);
            } else {
                com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
                String str2 = modalAuthOpenerInterface$AuthParams.c;
                String str3 = modalAuthOpenerInterface$AuthParams.e;
                coe0 coe0Var = coe0.b;
                boolean a2 = coe0.a();
                bVar.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ENTRY_LINK_OPEN, com.vk.registration.funnels.b.c(bVar, str2, null, str3, a2, 2), null, null, null, null, null, 252);
                th = null;
            }
        }
        if (th != null) {
            tv20Var.a(th);
            return;
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) e3m.h(context);
        String str4 = modalAuthOpenerInterface$AuthParams.b;
        if (str4 == null) {
            return;
        }
        int i2 = this.b;
        boolean z = !modalAuthOpenerInterface$AuthParams.d;
        ufx ufxVar = new ufx("auth.processAuthCodeMulti", new up(3), new vp(4));
        ufx.n(ufxVar, "auth_code", str4, 0, 12);
        ufx.k(ufxVar, "action", i2, 0, 12);
        ufxVar.i("is_internal_camera", z);
        bx2 e = e370.e(ufxVar);
        e.f = true;
        e.d = true;
        e.h = true;
        mnh0.B(bug0.d(rdx0.u(e), context, null, 6), this.a, new erh(this, appCompatActivity, modalAuthOpenerInterface$AuthParams, tv20Var), new zkk(this, context, modalAuthOpenerInterface$AuthParams, tv20Var, 1), null);
    }
}
