package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.init.choose.ChooseProfileData;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.restore.RestoreReason;
import com.vk.auth.screendata.CreateVkEmailRequiredData;
import com.vk.auth.validation.VkValidatePhoneInfo;
import com.vk.auth.validation.internal.PhoneValidationContract$ValidationDialogMetaInfo;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.auth.UserItem;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.exceptions.AuthException;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.core.api.models.BanInfo;
import com.vk.superapp.core.api.models.SendOtpInfo;
import com.vk.superapp.core.api.models.ValidateInfo;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.p66;
import xsna.xbu0;

/* compiled from: BaseAuthObserver.kt */
/* loaded from: classes15.dex */
public class e66 extends ipj0 {
    public final p66.a.C3493a d;
    public final p66.a.b e;
    public final pbu0 f;
    public final p66.a.c g;
    public final VkAuthMetaInfo h;
    public final zn70 i;
    public final io.reactivex.rxjava3.disposables.b j;
    public final Context k;
    public final i060 l;

    /* compiled from: BaseAuthObserver.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<io.reactivex.rxjava3.core.q<AuthResult>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(io.reactivex.rxjava3.core.q<AuthResult> qVar) {
            ((pbu0) this.receiver).b(qVar);
            return s3q0.a;
        }
    }

    public e66(Context context, p66.a.C3493a c3493a, p66.a.b bVar, p66.c cVar, p66.a.c cVar2, VkAuthMetaInfo vkAuthMetaInfo, zn70 zn70Var, io.reactivex.rxjava3.disposables.b bVar2) {
        this.d = c3493a;
        this.e = bVar;
        this.f = cVar;
        this.g = cVar2;
        this.h = vkAuthMetaInfo;
        this.i = zn70Var;
        this.j = bVar2;
        this.k = context.getApplicationContext();
        this.l = new i060(context, vkAuthMetaInfo, new r7(this, 9), null);
    }

    @Override // xsna.ipj0
    public final void a(vgg vggVar) {
        com.vk.registration.funnels.b.a.getClass();
        com.vk.registration.funnels.b.v();
        vggVar.c();
    }

    @Override // xsna.ipj0
    public final void b(BanInfo banInfo) {
        x().g1(banInfo);
    }

    @Override // xsna.ipj0
    public final void c(com.vk.superapp.core.api.models.a aVar) {
        x().S0(new RestoreReason.CancelByOwner(aVar.F, aVar.G));
    }

    @Override // xsna.ipj0
    public final void d(AuthException.VkEmailSignUpRequiredException vkEmailSignUpRequiredException) {
        Serializer.c<CreateVkEmailRequiredData> cVar = CreateVkEmailRequiredData.CREATOR;
        r55 r55Var = r55.a;
        x().C0(CreateVkEmailRequiredData.a.a(vkEmailSignUpRequiredException, r55.h().e(), this.h));
    }

    @Override // xsna.ipj0
    public final void e(String str, vgg vggVar) {
        vggVar.d(new d66(this, vggVar, str, 0));
    }

    @Override // xsna.ipj0
    public void f(com.vk.superapp.core.api.models.a aVar, vgg vggVar) {
        throw null;
    }

    @Override // xsna.ipj0
    public final void g(xbu0 xbu0Var) {
        com.vk.auth.main.b x = x();
        List singletonList = Collections.singletonList(new UserItem(xbu0Var.a, xbu0Var.d, xbu0Var.b, null, null, null, xbu0Var.c, 0, xbu0Var.e, 0L, 568, null));
        List<xbu0.a> list = xbu0Var.f;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (xbu0.a aVar : list) {
            arrayList.add(new UserItem(aVar.a, aVar.d, aVar.b, null, null, null, aVar.c, 0, aVar.e, 0L, 568, null));
        }
        x.c1(new ChooseProfileData(j5g.u0(arrayList, singletonList)));
    }

    @Override // xsna.ipj0
    public final void j(VkAuthState vkAuthState, com.vk.superapp.core.api.models.a aVar, vgg vggVar) {
        f(aVar, vggVar);
    }

    @Override // xsna.ipj0
    public final void k(AuthException.MailAccountBlockedException mailAccountBlockedException) {
        com.vk.auth.main.b x = x();
        mailAccountBlockedException.getClass();
        x.getClass();
    }

    @Override // xsna.ipj0
    public final void m(com.vk.superapp.core.api.models.a aVar, VkAuthState vkAuthState) {
        this.l.a(aVar, vkAuthState, this.j);
    }

    @Override // xsna.ipj0
    public final void p(AuthException.OAuthSpecificException oAuthSpecificException) {
        this.i.c(oAuthSpecificException);
    }

    @Override // xsna.ipj0
    public final void q(AuthException.PhoneValidationRequiredException phoneValidationRequiredException) {
        FragmentActivity B0 = x().B0();
        a aVar = new a(1, this.f, pbu0.class, "runAuth", "runAuth(Lio/reactivex/rxjava3/core/Observable;)V", 0);
        lg lgVar = new lg(4);
        Context applicationContext = B0.getApplicationContext();
        VkAuthState g = phoneValidationRequiredException.g();
        d4a0 d4a0Var = new d4a0(applicationContext, this.h, phoneValidationRequiredException.h(), g, aVar, lgVar);
        q55 q55Var = q55.a;
        q55.a(d4a0Var);
        VkValidatePhoneInfo a2 = VkValidatePhoneInfo.a.a(phoneValidationRequiredException.k(), phoneValidationRequiredException.j(), phoneValidationRequiredException.i(), phoneValidationRequiredException.d(), true);
        if (!(a2 instanceof VkValidatePhoneInfo.ConfirmPhone)) {
            com.vk.auth.validation.b.a(r55.d, x().B0(), a2, 48);
        } else {
            VkValidatePhoneInfo.ConfirmPhone confirmPhone = (VkValidatePhoneInfo.ConfirmPhone) a2;
            x().D0(new PhoneValidationContract$ValidationDialogMetaInfo(confirmPhone.d, confirmPhone.c, confirmPhone.b, confirmPhone.e, confirmPhone.f));
        }
    }

    @Override // xsna.ipj0
    public final void r(vgg vggVar) {
        if (vggVar.b() != ApiErrorViewType.CUSTOM) {
            vggVar.c();
            return;
        }
        x65 y = y();
        if (y instanceof a66) {
            a66 a66Var = (a66) y;
            a66Var.qi(this.k.getString(R.string.vk_auth_error));
            FragmentActivity activity = a66Var.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        } else {
            vggVar.c();
        }
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.ipj0
    public final void s(VkAuthState vkAuthState, SendOtpInfo sendOtpInfo, ValidateInfo validateInfo) {
        x().d1(vkAuthState, sendOtpInfo, validateInfo);
    }

    @Override // xsna.ipj0
    public final void t(com.vk.superapp.core.api.models.a aVar) {
        String str = aVar.B;
        if (drm0.N(str)) {
            str = this.k.getString(R.string.vk_auth_too_much_tries);
        }
        x65 y = y();
        if (y != null) {
            y.wa(str, null, null);
        }
    }

    @Override // xsna.ipj0
    public final void u(com.vk.superapp.core.api.models.a aVar, vgg vggVar) {
        if (vggVar.b() != ApiErrorViewType.CUSTOM) {
            vggVar.c();
            return;
        }
        String str = aVar.B;
        if (str.length() == 0) {
            x65 y = y();
            if (y != null) {
                y.wa(this.k.getString(R.string.vk_auth_unknown_error), null, null);
            }
        } else {
            x65 y2 = y();
            if (y2 != null) {
                y2.wa(str, null, null);
            }
        }
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.ipj0
    public final void v(String str, VkAuthCredentials vkAuthCredentials, UtilityTokens utilityTokens) {
        x().Z0(str, vkAuthCredentials, utilityTokens);
    }

    public final com.vk.auth.main.b x() {
        return (com.vk.auth.main.b) this.g.invoke();
    }

    public final x65 y() {
        return (x65) this.d.invoke();
    }

    public void z(String str) {
        x65 y = y();
        if (y != null) {
            y.wa(str, null, null);
        }
    }
}
