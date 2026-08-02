package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpData;
import com.vk.auth.ui.checkaccess.PasswordCheckInitStructure;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$NavigationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vk.superapp.verification.account.b;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collections;
import xsna.eeu0;
import xsna.wbu0;

/* compiled from: VkVerificationBasePresenter.kt */
/* loaded from: classes6.dex */
public abstract class tyv0 implements kyv0 {
    public final com.vk.superapp.verification.account.e a;
    public final boolean b;
    public String c;
    public final com.vk.superapp.verification.account.c d;
    public com.vk.superapp.verification.account.d e;
    public final io.reactivex.rxjava3.disposables.b f;
    public final a g;

    public tyv0(com.vk.superapp.verification.account.e eVar, boolean z) {
        this.a = eVar;
        this.b = z;
        r55 r55Var = r55.a;
        this.d = new com.vk.superapp.verification.account.c(r55.a());
        this.f = new io.reactivex.rxjava3.disposables.b();
        this.g = new a();
    }

    @Override // xsna.kyv0
    public void a() {
        com.vk.superapp.verification.account.b g = g();
        boolean z = g instanceof b.d;
        com.vk.superapp.verification.account.e eVar = this.a;
        if (z) {
            eVar.b();
            return;
        }
        if (g instanceof b.a) {
            com.vk.superapp.verification.account.e.c(eVar, SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO, eVar.a(), SchemeStatSak$EventScreen.CONNECT_ACCOUNTS_VKID_OAUTH_START, SchemeStatSak$EventScreen.OTHER, null, 36);
            return;
        }
        if (g instanceof b.e) {
            com.vk.superapp.verification.account.e.c(eVar, SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO, eVar.a(), SchemeStatSak$EventScreen.OAUTH_LINKED_TO_ANOTHER_VKID, null, Collections.singletonList(new SchemeStatSak$NavigationFieldItem(SchemeStatSak$NavigationFieldItem.Name.VERIFICATION_AWAY, "support", null, 4, null)), 20);
            return;
        }
        if (g instanceof b.h) {
            com.vk.superapp.verification.account.e.c(eVar, SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO, eVar.a(), SchemeStatSak$EventScreen.OAUTH_NOT_VERIFIED, null, Collections.singletonList(new SchemeStatSak$NavigationFieldItem(SchemeStatSak$NavigationFieldItem.Name.VERIFICATION_AWAY, "esia_support", null, 4, null)), 20);
            return;
        }
        if (g instanceof b.C1911b) {
            com.vk.superapp.verification.account.e.c(eVar, SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO, eVar.a(), SchemeStatSak$EventScreen.REQUEST_SYNCHRONIZE_DATA_VKID_OAUTH, SchemeStatSak$EventScreen.CONNECT_ACCOUNTS_VKID_OAUTH_SUCCESS, e43.l(new SchemeStatSak$NavigationFieldItem(SchemeStatSak$NavigationFieldItem.Name.VERIFICATION_AWAY, null, 1, 2, null), new SchemeStatSak$NavigationFieldItem(SchemeStatSak$NavigationFieldItem.Name.OAUTH_SYNCHRONIZED_DATA, j5g.g0(((b.C1911b) g).h, StringUtils.COMMA, null, null, 0, null, 62), null, 4, null)), 4);
            return;
        }
        if (g instanceof b.c) {
            com.vk.superapp.verification.account.e.c(eVar, SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO, eVar.a(), SchemeStatSak$EventScreen.REQUEST_SYNCHRONIZE_DATA_VKID_OAUTH, SchemeStatSak$EventScreen.CONNECT_ACCOUNTS_VKID_OAUTH_SUCCESS, e43.l(new SchemeStatSak$NavigationFieldItem(SchemeStatSak$NavigationFieldItem.Name.VERIFICATION_AWAY, null, 0, 2, null), new SchemeStatSak$NavigationFieldItem(SchemeStatSak$NavigationFieldItem.Name.OAUTH_SYNCHRONIZED_DATA, j5g.g0(((b.c) g).h, StringUtils.COMMA, null, null, 0, null, 62), null, 4, null)), 4);
        } else {
            if (g instanceof b.k) {
                com.vk.superapp.verification.account.e.c(eVar, SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO, eVar.a(), SchemeStatSak$EventScreen.OAUTH_ACTIVATED_SUCCESS, null, null, 36);
                return;
            }
            if (g instanceof b.l) {
                com.vk.superapp.verification.account.e.c(eVar, SchemeStatSak$TypeVkConnectNavigationItem.EventType.VERIFICATION_TRY_AGAIN, eVar.a(), SchemeStatSak$EventScreen.OAUTH_ACTIVATED_SUCCESS, null, null, 52);
                return;
            }
            par0.a.getClass();
            par0.a("There isn't stats for " + g + ". There was a call to onPrimaryButtonClick");
        }
    }

    @Override // xsna.kyv0
    public void b() {
        com.vk.superapp.verification.account.e eVar = this.a;
        boolean z = eVar.a;
        com.vk.superapp.verification.account.b g = g();
        if (g instanceof b.d) {
            com.vk.superapp.verification.account.e.c(eVar, SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO, eVar.a(), SchemeStatSak$EventScreen.ONBOARDING_VERIFICATION, null, Collections.singletonList(new SchemeStatSak$NavigationFieldItem(SchemeStatSak$NavigationFieldItem.Name.VERIFICATION_AWAY, "verification_faq", null, 4, null)), 20);
            return;
        }
        if (g instanceof b.a) {
            com.vk.superapp.verification.account.e.c(eVar, SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO, eVar.a(), SchemeStatSak$EventScreen.CONNECT_ACCOUNTS_VKID_OAUTH_START, SchemeStatSak$EventScreen.NOWHERE, Collections.singletonList(new SchemeStatSak$NavigationFieldItem(SchemeStatSak$NavigationFieldItem.Name.VERIFICATION_AWAY, z ? "vkid" : "sferum", null, 4, null)), 4);
            return;
        }
        if ((g instanceof b.g) || (g instanceof b.e) || (g instanceof b.h)) {
            com.vk.superapp.verification.account.e.c(eVar, SchemeStatSak$TypeVkConnectNavigationItem.EventType.CLOSE_VERIFICATION_ERROR_TAB, eVar.a(), g.g, null, null, 52);
            return;
        }
        if (g instanceof b.l) {
            com.vk.superapp.verification.account.e.c(eVar, SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO, eVar.a(), SchemeStatSak$EventScreen.CONNECT_ACCOUNTS_VKID_OAUTH_SUCCESS, null, Collections.singletonList(new SchemeStatSak$NavigationFieldItem(SchemeStatSak$NavigationFieldItem.Name.VERIFICATION_AWAY, z ? "vkid" : "sferum", null, 4, null)), 4);
            return;
        }
        par0.a.getClass();
        par0.a("There isn't stats for " + g + ". There was a call to onSecondaryButtonClick");
    }

    public abstract void f(String str);

    public abstract com.vk.superapp.verification.account.b g();

    public final void h() {
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        String f = wdx0Var.f();
        if (f == null) {
            f = "";
        }
        wdx0 wdx0Var2 = e370.f;
        if (wdx0Var2 == null) {
            wdx0Var2 = null;
        }
        String g = wdx0Var2.g();
        String str = g != null ? g : "";
        wdx0 wdx0Var3 = e370.f;
        PasswordCheckInitStructure passwordCheckInitStructure = new PasswordCheckInitStructure(f, str, (wdx0Var3 != null ? wdx0Var3 : null).e(), null, false);
        com.vk.superapp.verification.account.d dVar = this.e;
        if (dVar != null) {
            Context requireContext = dVar.requireContext();
            DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
            Intent intent = new Intent(requireContext, (Class<?>) DefaultAuthActivity.BottomSheetActivity.class);
            intent.putExtra("checkUserActionData", passwordCheckInitStructure);
            requireContext.startActivity(intent);
        }
    }

    public final void i(wbu0.a aVar) {
        final com.vk.superapp.verification.account.d dVar;
        FragmentActivity activity;
        String str = aVar.a;
        if (aVar.c || (dVar = this.e) == null || (activity = dVar.getActivity()) == null) {
            return;
        }
        eeu0.a aVar2 = new eeu0.a(hnj.a(activity));
        aVar2.c = true;
        aVar2.i = new wsq0(dVar, 1);
        aVar2.setTitle(dVar.getString(R.string.vk_auth_error));
        aVar2.a.f = str;
        aVar2.j(dVar.getString(R.string.vk_ok), new DialogInterface.OnClickListener() { // from class: xsna.pyv0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                com.vk.superapp.verification.account.d.this.close();
            }
        });
        aVar2.m();
    }

    public final io.reactivex.rxjava3.internal.operators.single.p j(io.reactivex.rxjava3.core.x xVar) {
        ox80 ox80Var = new ox80(new lbt0(this, 1), 18);
        xVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.n(xVar, ox80Var), new e9b(this, 5));
    }

    /* compiled from: VkVerificationBasePresenter.kt */
    public static final class a implements s25 {
        public a() {
        }

        @Override // xsna.s25
        public final void b(String str) {
            tyv0.this.f(str);
        }

        @Override // xsna.s25
        public final void m() {
            com.vk.superapp.verification.account.d dVar;
            tyv0 tyv0Var = tyv0.this;
            tyv0Var.c = null;
            if (!tyv0Var.b || (dVar = tyv0Var.e) == null) {
                return;
            }
            dVar.close();
        }

        @Override // xsna.s25
        public final void A() {
        }

        @Override // xsna.s25
        public final void o() {
        }

        @Override // xsna.s25
        public final void p() {
        }

        @Override // xsna.s25
        public final void t() {
        }

        @Override // xsna.s25
        public final void u() {
        }

        @Override // xsna.s25
        public final void h(VkPhoneValidationCompleteResult vkPhoneValidationCompleteResult) {
        }

        @Override // xsna.s25
        @ozl
        public final void l(jq0 jq0Var) {
        }

        @Override // xsna.s25
        public final void n(AuthResult authResult) {
        }

        @Override // xsna.s25
        public final void r(t6v0 t6v0Var) {
        }

        @Override // xsna.s25
        public final void v(VkPhoneValidationErrorReason vkPhoneValidationErrorReason) {
        }

        @Override // xsna.s25
        public final void j(long j, SignUpData signUpData) {
        }
    }
}
