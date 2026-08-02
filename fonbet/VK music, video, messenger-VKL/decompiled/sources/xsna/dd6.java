package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.mbridge.msdk.config.dynamic.baseview.ComponentTextView;
import com.vk.api.generated.auth.dto.AuthValidateRegistrationConfirmTextsDto;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.screendata.VkExistingProfileScreenData;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.core.view.search.ModernSearchView;
import com.vk.im.ui.views.settings.MaterialSwitchSettingsView;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$NavigationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vk.superapp.api.dto.auth.VkAuthProfileInfo;
import com.vk.superapp.verification.account.b;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.e3m;
import xsna.p66;
import xsna.ptw0;
import xsna.w1m0;
import xsna.w4q;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class dd6 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dd6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Object obj2 = ((ed6) obj).o;
                Object obj3 = obj2;
                if (obj2 == null) {
                    obj3 = null;
                }
                w4q w4qVar = (w4q) obj3;
                final String str = w4qVar.z;
                final VkAuthProfileInfo vkAuthProfileInfo = w4qVar.B;
                com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
                bVar.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.NO_USER_ACCOUNT_TAP, null, null, null, null, null, null, 254);
                SignUpDataHolder signUpDataHolder = w4qVar.p;
                if (signUpDataHolder == null) {
                    signUpDataHolder = null;
                }
                if (signUpDataHolder.o != null) {
                    w4qVar.e.getClass();
                }
                if (!w4qVar.z0(new oz4(bVar, 1))) {
                    VkExistingProfileScreenData.SignUpRestrictedReason signUpRestrictedReason = w4qVar.D;
                    if ((signUpRestrictedReason == null ? -1 : w4q.a.$EnumSwitchMapping$0[signUpRestrictedReason.ordinal()]) != 1) {
                        if (!w4qVar.H) {
                            final com.vk.auth.main.e eVar = w4qVar.o;
                            if (eVar == null) {
                                eVar = null;
                            }
                            final p66.c cVar = w4qVar.w;
                            DefaultAuthActivity defaultAuthActivity = eVar.a;
                            SignUpDataHolder signUpDataHolder2 = eVar.b;
                            if (!signUpDataHolder2.f) {
                                e3m.a aVar = e3m.a;
                                Drawable a = m33.a(R.drawable.vk_icon_user_circle_outline_56, defaultAuthActivity);
                                if (a != null) {
                                    a.mutate();
                                    a.setTint(e3m.f(R.attr.vk_ui_icon_accent, defaultAuthActivity));
                                } else {
                                    a = null;
                                }
                                hz20 hz20Var = new hz20() { // from class: xsna.fmj0
                                    @Override // xsna.hz20
                                    public final void a(int i2) {
                                        com.vk.auth.main.e eVar2 = com.vk.auth.main.e.this;
                                        SignUpRouter signUpRouter = eVar2.c;
                                        if (i2 != -2) {
                                            if (i2 != -1) {
                                                return;
                                            }
                                            signUpRouter.L0("");
                                        } else if (vkAuthProfileInfo.d()) {
                                            eVar2.j(SignUpRouter.DataScreen.PHONE, cVar);
                                        } else {
                                            String str2 = eVar2.b.x;
                                            signUpRouter.b(str);
                                        }
                                    }
                                };
                                dw20.b bVar2 = new dw20.b(defaultAuthActivity, null);
                                cbq.a(bVar2);
                                bVar2.N(a).v0(R.string.vk_connect_profile_exists_question_vkid).i0(R.string.vk_connect_profile_exists_yes, hz20Var).U(R.string.vk_connect_profile_exists_no, hz20Var).I0("NotMyAccount");
                                break;
                            } else if (!vkAuthProfileInfo.d()) {
                                SignUpRouter signUpRouter = eVar.c;
                                String str2 = signUpDataHolder2.x;
                                signUpRouter.b(str);
                                break;
                            } else {
                                eVar.j(SignUpRouter.DataScreen.PHONE, cVar);
                                break;
                            }
                        } else {
                            com.vk.auth.main.e eVar2 = w4qVar.o;
                            com.vk.auth.main.e eVar3 = eVar2 != null ? eVar2 : null;
                            AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto = w4qVar.G;
                            eVar3.getClass();
                            if (!vkAuthProfileInfo.g) {
                                SignUpRouter signUpRouter2 = eVar3.c;
                                String str3 = eVar3.b.x;
                                signUpRouter2.b(str);
                                break;
                            } else {
                                eVar3.g(authValidateRegistrationConfirmTextsDto);
                                break;
                            }
                        }
                    } else {
                        zn70 zn70Var = w4qVar.q;
                        (zn70Var != null ? zn70Var : null).b(w4qVar.E);
                        break;
                    }
                }
                break;
            case 1:
                ((ComponentTextView) obj).a(view);
                break;
            case 2:
                djo djoVar = (djo) obj;
                w1m0.a aVar2 = djoVar.G;
                if (aVar2.b < e43.h(aVar2.d)) {
                    w1m0.a aVar3 = djoVar.G;
                    int i2 = aVar3.b + 1;
                    aVar3.b = i2;
                    djoVar.l.b(aVar3.d.get(i2));
                    djoVar.c.invalidate();
                }
                djoVar.u();
                break;
            case 3:
                Object obj4 = ((sys) obj).o;
                ((qys) (obj4 != null ? obj4 : null)).a();
                break;
            case 4:
                quv.a((quv) obj);
                break;
            case 5:
                ((MaterialSwitchSettingsView) obj).v.toggle();
                break;
            case 6:
                ((rl20) obj).l.g();
                break;
            case 7:
                gzs gzsVar = (gzs) obj;
                h94 h94Var = ModernSearchView.y;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 8:
                ((z150) obj).a.invoke();
                break;
            case 9:
                String str4 = ((rym0) obj).n;
                if (str4 != null) {
                    xwk.d().e().a(view.getContext(), str4);
                    break;
                }
                break;
            case 10:
                VkSpinnerContent.b bVar3 = (VkSpinnerContent.b) obj;
                int i3 = VkSpinnerContent.k;
                if (bVar3 != null) {
                    bVar3.onCancel();
                    break;
                }
                break;
            case 11:
                tyv0 tyv0Var = ((com.vk.superapp.verification.account.d) obj).M;
                if (tyv0Var == null) {
                    tyv0Var = null;
                }
                com.vk.superapp.verification.account.e eVar4 = tyv0Var.a;
                com.vk.superapp.verification.account.b g = tyv0Var.g();
                eVar4.c = true;
                com.vk.superapp.verification.account.e.c(eVar4, e43.l(b.g.class, b.e.class, b.h.class).contains(g.getClass()) ? SchemeStatSak$TypeVkConnectNavigationItem.EventType.CLOSE_VERIFICATION_ERROR_TAB : SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO, eVar4.a(), g.g, SchemeStatSak$EventScreen.NOWHERE, rl3.I(new SchemeStatSak$NavigationFieldItem[]{new SchemeStatSak$NavigationFieldItem(SchemeStatSak$NavigationFieldItem.Name.CLOSE_TAB, null, 1, 2, null), new SchemeStatSak$NavigationFieldItem(SchemeStatSak$NavigationFieldItem.Name.VERIFICATION_AWAY, eVar4.a ? "vkid" : "sferum", null, 4, null), g instanceof b.C1911b ? new SchemeStatSak$NavigationFieldItem(SchemeStatSak$NavigationFieldItem.Name.LEAVE_UNCHANGED, null, 1, 2, null) : null}), 4);
                com.vk.superapp.verification.account.d dVar = tyv0Var.e;
                if (dVar != null) {
                    dVar.close();
                    break;
                }
                break;
            case 12:
                ((cuw0) obj).c.invoke(ptw0.h.b);
                break;
            case 13:
                ((z7z0) obj).g.a(view, 1);
                break;
            default:
                yads.q90.a((izs) obj, view);
                break;
        }
    }
}
