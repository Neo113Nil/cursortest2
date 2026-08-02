package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.superapp.api.exceptions.AuthException;
import com.vk.superapp.api.states.VkAuthState;
import com.vkontakte.android.R;
import xsna.eeu0;

/* compiled from: OAuthErrorRouterImpl.kt */
/* loaded from: classes.dex */
public final class ao70 implements zn70 {
    public final SignUpRouter a;
    public final SignUpDataHolder b;
    public final com.vk.auth.oauth.di.a c;
    public final FragmentActivity d;

    /* compiled from: OAuthErrorRouterImpl.kt */
    /* loaded from: classes15.dex */
    public static final class a {
        public final SignUpRouter a;

        public a(SignUpRouter signUpRouter) {
            this.a = signUpRouter;
        }
    }

    /* compiled from: OAuthErrorRouterImpl.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkOAuthService.values().length];
            try {
                iArr[VkOAuthService.ALFA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkOAuthService.GOOGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkOAuthService.SBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkOAuthService.TINKOFF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkOAuthService.YANDEX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VkOAuthService.OK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ao70(SignUpRouter signUpRouter, SignUpDataHolder signUpDataHolder, com.vk.auth.oauth.di.a aVar) {
        this.a = signUpRouter;
        this.b = signUpDataHolder;
        this.c = aVar;
        this.d = signUpRouter.B0();
    }

    @Override // xsna.zn70
    public final void a(int i, int i2, j66 j66Var) {
        rv1 a2;
        if (i != 8) {
            j66Var.invoke();
            return;
        }
        if (i2 != 1000 && i2 != 1001) {
            j66Var.invoke();
            return;
        }
        VkOAuthService.a aVar = VkOAuthService.Companion;
        String str = this.b.I.c;
        aVar.getClass();
        VkOAuthService a3 = VkOAuthService.a.a(str);
        switch (a3 == null ? -1 : b.$EnumSwitchMapping$0[a3.ordinal()]) {
            case 1:
                a2 = vs1.a(d());
                break;
            case 2:
                a2 = b9u.a(d());
                break;
            case 3:
                a2 = l2h0.a(d());
                break;
            case 4:
                a2 = ryo0.a(d());
                break;
            case 5:
                a2 = y4y0.a(d());
                break;
            case 6:
                a2 = lw70.a(d());
                break;
            default:
                a2 = u46.a(d(), a3);
                break;
        }
        a2.a(this.d);
    }

    @Override // xsna.zn70
    public final void b(String str) {
        if (str == null) {
            str = "";
        }
        new xc00(str, new a(this.a)).a(this.d);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xsna.zn70
    public final void c(AuthException.OAuthSpecificException oAuthSpecificException) {
        String h = oAuthSpecificException.h();
        int hashCode = h.hashCode();
        com.vk.auth.oauth.di.a aVar = this.c;
        FragmentActivity fragmentActivity = this.d;
        switch (hashCode) {
            case -1890523016:
                if (h.equals("alfa_has_link")) {
                    if (!aVar.c(VkOAuthService.ALFA)) {
                        eeu0.a aVar2 = new eeu0.a(fragmentActivity);
                        aVar2.q(R.string.vk_auth_unknown_api_error);
                        aVar2.setTitle(fragmentActivity.getString(R.string.vk_auth_error));
                        aVar2.j(fragmentActivity.getString(R.string.vk_ok), null);
                        aVar2.m();
                        break;
                    } else {
                        vs1.a(d()).a(fragmentActivity);
                        s3q0 s3q0Var = s3q0.a;
                        break;
                    }
                }
                break;
            case -1416447966:
                if (h.equals("sber_has_link")) {
                    if (!aVar.c(VkOAuthService.SBER)) {
                        eeu0.a aVar3 = new eeu0.a(fragmentActivity);
                        aVar3.q(R.string.vk_auth_unknown_api_error);
                        aVar3.setTitle(fragmentActivity.getString(R.string.vk_auth_error));
                        aVar3.j(fragmentActivity.getString(R.string.vk_ok), null);
                        aVar3.m();
                        break;
                    } else {
                        l2h0.a(d()).a(fragmentActivity);
                        s3q0 s3q0Var2 = s3q0.a;
                        break;
                    }
                }
                break;
            case -1214094974:
                if (h.equals("ok_has_link")) {
                    if (!aVar.c(VkOAuthService.OK)) {
                        eeu0.a aVar4 = new eeu0.a(fragmentActivity);
                        aVar4.q(R.string.vk_auth_unknown_api_error);
                        aVar4.setTitle(fragmentActivity.getString(R.string.vk_auth_error));
                        aVar4.j(fragmentActivity.getString(R.string.vk_ok), null);
                        aVar4.m();
                        break;
                    } else {
                        lw70.a(d()).a(fragmentActivity);
                        s3q0 s3q0Var3 = s3q0.a;
                        break;
                    }
                }
                break;
            case -654890555:
                if (h.equals("google_has_link")) {
                    if (!aVar.c(VkOAuthService.GOOGLE)) {
                        eeu0.a aVar5 = new eeu0.a(fragmentActivity);
                        aVar5.q(R.string.vk_auth_unknown_api_error);
                        aVar5.setTitle(fragmentActivity.getString(R.string.vk_auth_error));
                        aVar5.j(fragmentActivity.getString(R.string.vk_ok), null);
                        aVar5.m();
                        break;
                    } else {
                        b9u.a(d()).a(fragmentActivity);
                        s3q0 s3q0Var4 = s3q0.a;
                        break;
                    }
                }
                break;
            case -639752435:
                if (h.equals("yandex_has_link")) {
                    if (!aVar.c(VkOAuthService.YANDEX)) {
                        eeu0.a aVar6 = new eeu0.a(fragmentActivity);
                        aVar6.q(R.string.vk_auth_unknown_api_error);
                        aVar6.setTitle(fragmentActivity.getString(R.string.vk_auth_error));
                        aVar6.j(fragmentActivity.getString(R.string.vk_ok), null);
                        aVar6.m();
                        break;
                    } else {
                        y4y0.a(d()).a(fragmentActivity);
                        s3q0 s3q0Var5 = s3q0.a;
                        break;
                    }
                }
                break;
            case -615051455:
                if (h.equals("tinkoff_has_link")) {
                    if (!aVar.c(VkOAuthService.TINKOFF)) {
                        eeu0.a aVar7 = new eeu0.a(fragmentActivity);
                        aVar7.q(R.string.vk_auth_unknown_api_error);
                        aVar7.setTitle(fragmentActivity.getString(R.string.vk_auth_error));
                        aVar7.j(fragmentActivity.getString(R.string.vk_ok), null);
                        aVar7.m();
                        break;
                    } else {
                        ryo0.a(d()).a(fragmentActivity);
                        s3q0 s3q0Var6 = s3q0.a;
                        break;
                    }
                }
                break;
            case -503167225:
                if (h.equals("email_already_used")) {
                    b(oAuthSpecificException.g());
                    break;
                }
                break;
            case 1038524504:
                if (h.equals("esia_has_link")) {
                    VkAuthState d = oAuthSpecificException.d();
                    VkOAuthService vkOAuthService = VkOAuthService.ESIA;
                    n0 n0Var = new n0(22, d, this);
                    if (!aVar.c(vkOAuthService)) {
                        eeu0.a aVar8 = new eeu0.a(fragmentActivity);
                        aVar8.q(R.string.vk_auth_unknown_api_error);
                        aVar8.setTitle(fragmentActivity.getString(R.string.vk_auth_error));
                        aVar8.j(fragmentActivity.getString(R.string.vk_ok), null);
                        aVar8.m();
                        break;
                    } else {
                        n0Var.invoke();
                        break;
                    }
                }
                break;
            case 1523035039:
                if (h.equals("esia_is_not_approved")) {
                    if (!aVar.c(VkOAuthService.ESIA)) {
                        eeu0.a aVar9 = new eeu0.a(fragmentActivity);
                        aVar9.q(R.string.vk_auth_unknown_api_error);
                        aVar9.setTitle(fragmentActivity.getString(R.string.vk_auth_error));
                        aVar9.j(fragmentActivity.getString(R.string.vk_ok), null);
                        aVar9.m();
                        break;
                    } else {
                        new kxp(d()).a(fragmentActivity);
                        s3q0 s3q0Var7 = s3q0.a;
                        break;
                    }
                }
                break;
        }
    }

    public final ld20 d() {
        return new ld20(this.a, this.b);
    }
}
