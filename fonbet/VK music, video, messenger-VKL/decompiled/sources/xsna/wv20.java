package xsna;

import android.content.Context;
import com.vk.auth.modal.base.ModalAuthInfo;
import com.vk.auth.modal.base.SelectedQrUserType;
import com.vk.auth.ui.consent.ConsentScreenInfo;
import com.vk.dto.common.id.UserId;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.registration.funnels.b;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.arf0;
import xsna.gv20;
import xsna.iv20;
import xsna.jv20;

/* compiled from: ModalAuthPresenter.kt */
/* loaded from: classes15.dex */
public abstract class wv20<V extends jv20 & arf0> implements hv20<V> {
    public final Context a;
    public final Object b;
    public iv20.b d;
    public volatile boolean g;
    public final bpn0 c = new bpn0(new f5x(this, 10));
    public final coe0 e = coe0.b;
    public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: ModalAuthPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelectedQrUserType.values().length];
            try {
                iArr[SelectedQrUserType.DELETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectedQrUserType.BANNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelectedQrUserType.UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wv20(Context context, V v) {
        this.a = context;
        this.b = v;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, xsna.jv20] */
    @Override // xsna.hv20
    public final void I2(com.vk.superapp.multiaccount.api.f fVar) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        iv20.b bVar2 = this.d;
        String str = (bVar2 != null ? bVar2 : null).f;
        if (bVar2 == null) {
            bVar2 = null;
        }
        Integer num = bVar2.i;
        ?? r5 = this.b;
        arf0 arf0Var = (arf0) r5;
        SchemeStatSak$EventScreen u5 = arf0Var.u5();
        bVar.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SWITCH_ACCOUNT_TAP, com.vk.registration.funnels.b.h(str, com.vk.registration.funnels.b.g(u5), String.valueOf(num), true), null, null, null, null, null, 252);
        iv20.b bVar3 = this.d;
        String str2 = (bVar3 != null ? bVar3 : null).f;
        Integer num2 = (bVar3 != null ? bVar3 : null).i;
        SchemeStatSak$EventScreen u52 = arf0Var.u5();
        frf0.f(SchemeStatSak$EventScreen.MULTI_ACC_SWITCHER, u52, com.vk.registration.funnels.b.b(str2, u52, String.valueOf(num2), true), false, null, null, 56);
        r5.I2(fVar);
    }

    @Override // xsna.hv20
    public final boolean J2() {
        return !this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, xsna.jv20] */
    @Override // xsna.hv20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K2(UserId userId, SelectedQrUserType selectedQrUserType) {
        Integer valueOf;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen2;
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        iv20.b bVar2 = this.d;
        if (bVar2 == null) {
            bVar2 = null;
        }
        String str = bVar2.f;
        ?? r4 = this.b;
        arf0 arf0Var = (arf0) r4;
        SchemeStatSak$EventScreen u5 = arf0Var.u5();
        iv20.b bVar3 = this.d;
        if (bVar3 == null) {
            bVar3 = null;
        }
        Integer num = bVar3.i;
        this.e.getClass();
        boolean a2 = coe0.a();
        bVar.getClass();
        int i = b.c.$EnumSwitchMapping$0[u5.ordinal()];
        if (i == 1) {
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ENTRY_BY_QR_CODE_CONFIRM_TAP, com.vk.registration.funnels.b.b(str, u5, String.valueOf(num), a2), null, null, null, null, null, 252);
        } else if (i == 2) {
            RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ENTRY_CONFIRM_TAP, com.vk.registration.funnels.b.b(str, u5, String.valueOf(num), a2), null, null, null, null, null, 252);
        }
        int i2 = 3;
        if (selectedQrUserType == SelectedQrUserType.NORMAL) {
            r4.W8(iv20.a.a);
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            wfn0 e = vdx0Var.e();
            iv20.b bVar4 = this.d;
            String str2 = (bVar4 != null ? bVar4 : null).e;
            if (bVar4 == null) {
                bVar4 = null;
            }
            this.f.b(mnh0.B(e.v(userId, str2, !bVar4.j).a0(io.reactivex.rxjava3.android.schedulers.a.b()), (ygg) this.c.getValue(), new uv20(this, 0), new o010(this, i2), null));
            return;
        }
        int i3 = a.$EnumSwitchMapping$0[selectedQrUserType.ordinal()];
        if (i3 == 1) {
            valueOf = Integer.valueOf(R.string.vk_qr_auth_user_deleted_error_message);
            schemeStatSak$EventScreen = SchemeStatSak$EventScreen.ALERT_USER_DELETED;
        } else if (i3 == 2) {
            valueOf = Integer.valueOf(R.string.vk_qr_auth_user_blocked_error_message);
            schemeStatSak$EventScreen = SchemeStatSak$EventScreen.ALERT_USER_BLOCKED;
        } else {
            if (i3 != 3) {
                valueOf = null;
                schemeStatSak$EventScreen2 = null;
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    xis xisVar = new xis(this, 17);
                    m1y m1yVar = new m1y(this, 6);
                    Context context = this.a;
                    VkAlertData.b bVar5 = new VkAlertData.b(context.getString(R.string.vk_auth_error), context.getString(intValue), (VkAlertData.DialogType) null, new VkAlertData.a(context.getString(R.string.vk_ok), null), (VkAlertData.a) null, 52);
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    if (superappUiRouterBridge == null) {
                        superappUiRouterBridge = null;
                    }
                    superappUiRouterBridge.O(e3m.h(context), bVar5, new qr1(m1yVar, xisVar));
                }
                if (schemeStatSak$EventScreen2 == null) {
                    SchemeStatSak$EventScreen u52 = arf0Var.u5();
                    iv20.b bVar6 = this.d;
                    String str3 = (bVar6 != null ? bVar6 : null).f;
                    Integer num2 = (bVar6 != null ? bVar6 : null).i;
                    boolean a3 = coe0.a();
                    RegistrationFunnelScreenStack registrationFunnelScreenStack3 = frf0.a;
                    frf0.f(SchemeStatSak$EventScreen.OTHER, schemeStatSak$EventScreen2, com.vk.registration.funnels.b.h(str3, com.vk.registration.funnels.b.g(u52), String.valueOf(num2), a3), false, null, null, 56);
                    return;
                }
                return;
            }
            valueOf = Integer.valueOf(R.string.vk_qr_auth_user_unavailable_error_message);
            schemeStatSak$EventScreen = SchemeStatSak$EventScreen.ALERT_TRY_AGAIN;
        }
        schemeStatSak$EventScreen2 = schemeStatSak$EventScreen;
        if (valueOf != null) {
        }
        if (schemeStatSak$EventScreen2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xsna.jv20] */
    @Override // xsna.hv20
    public final void L0() {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        ?? r1 = this.b;
        SchemeStatSak$EventScreen u5 = ((arf0) r1).u5();
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.MULTI_ACC_SWITCHER;
        iv20.b bVar2 = this.d;
        String str = (bVar2 != null ? bVar2 : null).f;
        if (bVar2 == null) {
            bVar2 = null;
        }
        Integer num = bVar2.i;
        bVar.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.f(u5, schemeStatSak$EventScreen, com.vk.registration.funnels.b.b(str, u5, String.valueOf(num), true), false, null, null, 56);
        r1.L0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.jv20] */
    @Override // xsna.hv20
    public void L2() {
        this.b.G8();
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, xsna.jv20] */
    @Override // xsna.hv20
    public void M2(ModalAuthInfo modalAuthInfo) {
        String str = modalAuthInfo.k;
        String str2 = modalAuthInfo.l;
        String str3 = modalAuthInfo.m;
        Context context = this.a;
        ArrayList o = e43.o(new gv20.b(context.getString(R.string.vk_qr_auth_service), modalAuthInfo.e, modalAuthInfo.f, a(modalAuthInfo.o)), new gv20.a(context.getString(R.string.vk_login_confirmation_device), modalAuthInfo.g, R.drawable.vk_icon_computer_outline_24, null), new gv20.a(context.getString(R.string.vk_qr_auth_location), modalAuthInfo.h, R.drawable.vk_icon_place_outline_28, new cm(21, this, modalAuthInfo)));
        String str4 = modalAuthInfo.c;
        String str5 = modalAuthInfo.d;
        String str6 = modalAuthInfo.f;
        String str7 = modalAuthInfo.n;
        ConsentScreenInfo consentScreenInfo = modalAuthInfo.p;
        iv20.b bVar = new iv20.b(str, str2, str3, o, str4, str5, str6, str7, consentScreenInfo != null ? consentScreenInfo.b : null, modalAuthInfo.q, modalAuthInfo.o);
        this.d = bVar;
        this.b.W8(bVar);
    }

    public int a(boolean z) {
        return z ? R.drawable.vk_icon_logo_vk_outline_28 : R.drawable.vk_icon_services_outline_28;
    }

    public void b(vgg vggVar) {
        Throwable th = vggVar.a;
        iv20.b bVar = this.d;
        if (bVar == null) {
            bVar = null;
        }
        String str = bVar.f;
        SchemeStatSak$EventScreen u5 = ((arf0) this.b).u5();
        vv20 vv20Var = new vv20(this, 0);
        cg1 cg1Var = new cg1(18, this, vggVar);
        this.e.getClass();
        qv20.i(this.a, th, str, u5, null, vggVar, vv20Var, cg1Var, coe0.a(), 16);
    }

    public abstract void c();

    @Override // xsna.hv20
    public void onDestroy() {
        this.f.dispose();
    }
}
