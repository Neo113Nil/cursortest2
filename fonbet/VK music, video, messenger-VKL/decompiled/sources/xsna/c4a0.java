package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.main.AuthModel;
import com.vk.auth.validation.VkChangePhoneRouterInfo;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.auth.validation.VkValidatePhoneInfo;
import com.vk.auth.validation.VkValidateRouterInfo;
import com.vk.auth.validation.internal.PhoneValidationContract$SkipBehaviour;
import com.vk.auth.validation.internal.PhoneValidationContract$ValidationDialogMetaInfo;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import java.util.Iterator;
import java.util.List;
import xsna.p4g;
import xsna.q55;
import xsna.sir0;
import xsna.wbu0;

/* compiled from: PhoneValidationPresenter.kt */
/* loaded from: classes15.dex */
public final class c4a0 implements u3a0 {
    public final ctu0 a;
    public final io.reactivex.rxjava3.disposables.b b;
    public final w9l0 c;
    public k4a0 d;
    public final g4a0 e = new g4a0();
    public final Context f;
    public final AuthModel g;
    public final bpn0 h;

    /* compiled from: PhoneValidationPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhoneValidationContract$SkipBehaviour.values().length];
            try {
                iArr[PhoneValidationContract$SkipBehaviour.LOGOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhoneValidationContract$SkipBehaviour.UNLINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhoneValidationContract$SkipBehaviour.NOTHING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c4a0(ctu0 ctu0Var, io.reactivex.rxjava3.disposables.b bVar, w9l0 w9l0Var) {
        this.a = ctu0Var;
        this.b = bVar;
        this.c = w9l0Var;
        r55 r55Var = r55.a;
        this.f = r55.a();
        this.g = r55.h();
        this.h = new bpn0(new l500(this, 21));
    }

    @Override // xsna.u3a0
    public final void a() {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        io.reactivex.rxjava3.internal.operators.single.b0 m = vdx0Var.e().l(null).m(io.reactivex.rxjava3.android.schedulers.a.b());
        k4a0 k4a0Var = this.d;
        if (k4a0Var == null) {
            k4a0Var = null;
        }
        this.b.b(mnh0.C(k4a0Var.c(m), (ygg) this.h.getValue(), new l6u(this, 27), new e810(this, 14), null));
    }

    @Override // xsna.u3a0
    public final void b(VkValidatePhoneInfo vkValidatePhoneInfo) {
        boolean z = vkValidatePhoneInfo instanceof VkValidatePhoneInfo.Instant;
        g4a0 g4a0Var = this.e;
        if (z) {
            g4a0Var.a = false;
            VkValidatePhoneInfo.Instant instant = (VkValidatePhoneInfo.Instant) vkValidatePhoneInfo;
            h(instant.c, instant.d, false, vkValidatePhoneInfo.b);
            return;
        }
        if (vkValidatePhoneInfo instanceof VkValidatePhoneInfo.PhoneRequired) {
            sir0 sir0Var = sir0.a;
            VkValidateRouterInfo.EnterPhone enterPhone = new VkValidateRouterInfo.EnterPhone(((VkValidatePhoneInfo.PhoneRequired) vkValidatePhoneInfo).c, false, vkValidatePhoneInfo.b, null, 8, null);
            sir0Var.getClass();
            this.a.d(enterPhone, false);
            return;
        }
        if (vkValidatePhoneInfo instanceof VkValidatePhoneInfo.ConfirmPhone) {
            VkValidatePhoneInfo.ConfirmPhone confirmPhone = (VkValidatePhoneInfo.ConfirmPhone) vkValidatePhoneInfo;
            PhoneValidationContract$SkipBehaviour phoneValidationContract$SkipBehaviour = confirmPhone.e;
            phoneValidationContract$SkipBehaviour.getClass();
            g4a0Var.a = phoneValidationContract$SkipBehaviour == PhoneValidationContract$SkipBehaviour.NOTHING;
            g4a0Var.a(new mij(com.vk.registration.funnels.b.a, 6));
            k4a0 k4a0Var = this.d;
            if (k4a0Var == null) {
                k4a0Var = null;
            }
            k4a0Var.b(new PhoneValidationContract$ValidationDialogMetaInfo(confirmPhone.d, confirmPhone.c, confirmPhone.b, confirmPhone.e, confirmPhone.f));
            return;
        }
        if (!(vkValidatePhoneInfo instanceof VkValidatePhoneInfo.Skip)) {
            this.c.invoke(VkPhoneValidationErrorReason.API);
            return;
        }
        q55 q55Var = q55.a;
        List y0 = j5g.y0(q55.b);
        q55.b bVar = new q55.b(par0.a);
        p4g.a aVar = p4g.a;
        Iterator it = y0.iterator();
        while (it.hasNext()) {
            try {
                ((s25) it.next()).h(VkPhoneValidationCompleteResult.Skip.c);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                bVar.invoke(th);
            }
        }
    }

    public final void c(k4a0 k4a0Var) {
        this.d = k4a0Var;
    }

    public final void d(PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo) {
        g(phoneValidationContract$ValidationDialogMetaInfo.b, new nly(this, 25), new qd1(27, this, phoneValidationContract$ValidationDialogMetaInfo));
    }

    public final void e(PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo) {
        this.a.a(new VkChangePhoneRouterInfo(phoneValidationContract$ValidationDialogMetaInfo.f));
    }

    public final void f(Throwable th) {
        this.e.a(new q090(com.vk.registration.funnels.b.a, 1));
        k4a0 k4a0Var = this.d;
        if (k4a0Var == null) {
            k4a0Var = null;
        }
        wbu0.a a2 = wbu0.a(this.f, th, true);
        k4a0Var.getClass();
        String str = a2.a;
        if (a2.c) {
            return;
        }
        k4a0Var.a(str, new u4u(19));
    }

    public final void g(String str, gzs gzsVar, izs izsVar) {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        io.reactivex.rxjava3.internal.operators.single.b0 m = vdx0Var.e().a(str).m(io.reactivex.rxjava3.android.schedulers.a.b());
        k4a0 k4a0Var = this.d;
        this.b.b((k4a0Var != null ? k4a0Var : null).c(m).subscribe(new s520(new wqb(18, gzsVar, this), 6), new amt(new pc5(izsVar, 3), 19)));
    }

    public final void h(final String str, final String str2, final boolean z, final boolean z2) {
        io.reactivex.rxjava3.internal.operators.observable.a0 h = sir0.h(sir0.a, new sir0.e(str2, null, false, false, false, false, z2, false, false, null, 954));
        k4a0 k4a0Var = this.d;
        if (k4a0Var == null) {
            k4a0Var = null;
        }
        this.b.b(mnh0.B(bug0.d(h, k4a0Var.b, k4a0Var.f, 2), (ygg) this.h.getValue(), new izs() { // from class: xsna.a4a0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                VkAuthValidatePhoneResult vkAuthValidatePhoneResult = (VkAuthValidatePhoneResult) obj;
                sir0 sir0Var = sir0.a;
                ctu0 ctu0Var = c4a0.this.a;
                VkValidateRouterInfo.EnterSmsCode enterSmsCode = new VkValidateRouterInfo.EnterSmsCode(vkAuthValidatePhoneResult.b, z, z2, vkAuthValidatePhoneResult, str);
                sir0Var.getClass();
                ctu0Var.d(enterSmsCode, false);
                return s3q0.a;
            }
        }, new izs() { // from class: xsna.b4a0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                par0.a.getClass();
                par0.d(th);
                boolean z3 = th instanceof VKApiExecutionException;
                c4a0 c4a0Var = c4a0.this;
                boolean z4 = z;
                boolean z5 = false;
                if (z3 && f35.b((VKApiExecutionException) th)) {
                    sir0 sir0Var = sir0.a;
                    ctu0 ctu0Var = c4a0Var.a;
                    VkValidateRouterInfo.EnterSmsCode enterSmsCode = new VkValidateRouterInfo.EnterSmsCode(str2, z4, z2, null, str, 8, null);
                    sir0Var.getClass();
                    ctu0Var.d(enterSmsCode, false);
                    z5 = true;
                } else if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                    c4a0Var.f(th);
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    vggVar.c();
                }
                if (!z4 && !z5) {
                    c4a0Var.c.invoke(VkPhoneValidationErrorReason.API);
                }
                return s3q0.a;
            }
        }, null));
    }
}
