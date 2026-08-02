package xsna;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.VkValidatePhoneRouterInfo;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.passkey.PasskeyAlternative;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.passkey.web.PasskeyWebAuthScreen;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.utils.VkPhoneFormatUtils;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.base.stats.VerificationStatStartedFromReg;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.superapp.api.states.VkAuthState;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: ValidatePhoneHelper.kt */
/* loaded from: classes15.dex */
public final class sir0 {
    public static final sir0 a = new sir0();

    /* compiled from: ValidatePhoneHelper.kt */
    public static final class a {
        public final Country a;
        public final String b;
        public final VkAuthValidatePhoneResult c;

        public a(Country country, String str, VkAuthValidatePhoneResult vkAuthValidatePhoneResult) {
            this.a = country;
            this.b = str;
            this.c = vkAuthValidatePhoneResult;
        }
    }

    /* compiled from: ValidatePhoneHelper.kt */
    public static final class b {
        public final VkAuthState a;
        public final String b;
        public final String c;
        public final CodeState d;
        public final boolean e;

        public b(VkAuthState vkAuthState, String str, String str2, CodeState codeState, boolean z) {
            this.a = vkAuthState;
            this.b = str;
            this.c = str2;
            this.d = codeState;
            this.e = z;
        }
    }

    /* compiled from: ValidatePhoneHelper.kt */
    public static final class c {
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;
        public final CodeState e;

        public c(String str, String str2, String str3, boolean z, CodeState codeState) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = codeState;
        }
    }

    /* compiled from: ValidatePhoneHelper.kt */
    public static final class d {
        public final izs<VkAuthValidatePhoneResult, s3q0> a;
        public final izs<Throwable, s3q0> b;
        public final izs<io.reactivex.rxjava3.disposables.c, s3q0> c;
        public final gzs<s3q0> d;

        public d(izs izsVar, izs izsVar2, ow60 ow60Var, zqf0 zqf0Var, int i) {
            izsVar = (i & 1) != 0 ? new ye40(23) : izsVar;
            izsVar2 = (i & 2) != 0 ? new t3v(21) : izsVar2;
            izs oan0Var = (i & 4) != 0 ? new oan0(4) : ow60Var;
            gzs xk70Var = (i & 8) != 0 ? new xk70(11) : zqf0Var;
            this.a = izsVar;
            this.b = izsVar2;
            this.c = oan0Var;
            this.d = xk70Var;
        }
    }

    public static LibverifyScreenData a(Context context, String str, VkAuthValidatePhoneResult vkAuthValidatePhoneResult, boolean z, boolean z2, boolean z3) {
        if (!vkAuthValidatePhoneResult.c) {
            return null;
        }
        VerificationScreenData.Phone phone = new VerificationScreenData.Phone(str, VkPhoneFormatUtils.a(context, str, null, null, 28), vkAuthValidatePhoneResult.b, false, null, z, z2, z3, null, null, null, Long.valueOf(vkAuthValidatePhoneResult.i), 1816, null);
        return z ? new LibverifyScreenData.PasswordLessAuth(phone, vkAuthValidatePhoneResult.b, vkAuthValidatePhoneResult.j, vkAuthValidatePhoneResult.d, vkAuthValidatePhoneResult.q) : new LibverifyScreenData.SignUp(phone, vkAuthValidatePhoneResult.b, vkAuthValidatePhoneResult.j, vkAuthValidatePhoneResult.d, vkAuthValidatePhoneResult.q);
    }

    public static /* synthetic */ LibverifyScreenData b(sir0 sir0Var, Context context, String str, VkAuthValidatePhoneResult vkAuthValidatePhoneResult) {
        sir0Var.getClass();
        return a(context, str, vkAuthValidatePhoneResult, false, false, false);
    }

    public static boolean c(String str) {
        if (str == null || drm0.N(str)) {
            return false;
        }
        r55 r55Var = r55.a;
        return r55.h().n().a();
    }

    public static void d(com.vk.auth.main.e eVar, a aVar, VerificationStatStartedFromReg verificationStatStartedFromReg, boolean z) {
        SignUpRouter signUpRouter;
        LibverifyScreenData.SignUp signUp;
        Country country = aVar.a;
        String str = aVar.b;
        VkAuthValidatePhoneResult vkAuthValidatePhoneResult = aVar.c;
        SignUpRouter signUpRouter2 = eVar.c;
        SignUpDataHolder signUpDataHolder = eVar.b;
        signUpDataHolder.b = country;
        signUpDataHolder.c = str;
        boolean z2 = signUpDataHolder.f;
        DefaultAuthActivity defaultAuthActivity = eVar.a;
        if (vkAuthValidatePhoneResult.c) {
            signUpRouter = signUpRouter2;
            signUp = new LibverifyScreenData.SignUp(new VerificationScreenData.Phone(str, VkPhoneFormatUtils.a(defaultAuthActivity, str, null, null, 28), vkAuthValidatePhoneResult.b, false, null, false, z2, false, null, null, null, Long.valueOf(vkAuthValidatePhoneResult.i), 1816, null), vkAuthValidatePhoneResult.b, vkAuthValidatePhoneResult.j, vkAuthValidatePhoneResult.d, vkAuthValidatePhoneResult.q);
        } else {
            signUpRouter = signUpRouter2;
            signUp = null;
        }
        if (signUp != null) {
            signUpRouter.i(signUp);
            return;
        }
        boolean z3 = vkAuthValidatePhoneResult.e == VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_PASSKEY;
        if (z3) {
            boolean z4 = vkAuthValidatePhoneResult.f == null;
            String str2 = vkAuthValidatePhoneResult.b;
            PasskeyAlternative.Companion.getClass();
            boolean z5 = z4;
            PasskeyAlternative a2 = PasskeyAlternative.a.a(z5);
            PasskeyWebAuthScreen.Companion.getClass();
            e(a, eVar.c, new PasskeyCheckInfo(str, str2, a2, PasskeyWebAuthScreen.a.a(z5), false, z), null, null, null, 28);
        }
        if (z3) {
            return;
        }
        signUpRouter.k(new VerificationScreenData.Phone(str, VkPhoneFormatUtils.a(defaultAuthActivity, str, null, null, 28), vkAuthValidatePhoneResult.b, false, vkAuthValidatePhoneResult, false, z2, false, null, null, null, null, 4008, null), verificationStatStartedFromReg, z);
    }

    public static void e(sir0 sir0Var, com.vk.auth.main.b bVar, PasskeyCheckInfo passkeyCheckInfo, b bVar2, LibverifyScreenData.Auth auth, c cVar, int i) {
        if ((i & 2) != 0) {
            passkeyCheckInfo = null;
        }
        if ((i & 4) != 0) {
            bVar2 = null;
        }
        if ((i & 8) != 0) {
            auth = null;
        }
        if ((i & 16) != 0) {
            cVar = null;
        }
        sir0Var.getClass();
        if (passkeyCheckInfo != null) {
            bVar.I0(passkeyCheckInfo);
            return;
        }
        if (bVar2 != null) {
            bVar.W0(bVar2.b, bVar2.a, bVar2.c, bVar2.d, "", bVar2.e);
        } else if (auth != null) {
            bVar.P0(auth);
        } else if (cVar != null) {
            bVar.E0(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, false);
        } else {
            Log.e(fpf0.a(sir0.class).l(), "payload is null");
        }
    }

    public static void f(sir0 sir0Var, SignUpRouter signUpRouter, LibverifyScreenData libverifyScreenData, VerificationScreenData verificationScreenData, VkValidatePhoneRouterInfo vkValidatePhoneRouterInfo, int i) {
        if ((i & 2) != 0) {
            libverifyScreenData = null;
        }
        if ((i & 4) != 0) {
            verificationScreenData = null;
        }
        if ((i & 8) != 0) {
            vkValidatePhoneRouterInfo = null;
        }
        sir0Var.getClass();
        if (libverifyScreenData != null) {
            signUpRouter.i(libverifyScreenData);
            return;
        }
        if (verificationScreenData != null) {
            SignUpRouter.a.b(signUpRouter, verificationScreenData, false, 6);
        } else if (vkValidatePhoneRouterInfo != null) {
            signUpRouter.l(vkValidatePhoneRouterInfo);
        } else {
            Log.e(fpf0.a(sir0.class).l(), "payload is null");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|2|3|(11:5|7|8|(1:10)(1:21)|11|12|(1:14)|15|(1:17)|18|19)|24|7|8|(0)(0)|11|12|(0)|15|(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static io.reactivex.rxjava3.internal.operators.observable.a0 g(e eVar, d dVar) {
        String str;
        Bundle bundle;
        try {
            q55 q55Var = q55.a;
            bundle = q55.c().a.K;
        } catch (Throwable unused) {
        }
        if (bundle != null) {
            str = bundle.getString("white_label_flow_input_sat");
            r55 r55Var = r55.a;
            Boolean bool = Boolean.valueOf(r55.a().getPackageManager().hasSystemFeature("android.hardware.telephony"));
            boolean booleanValue = bool == null ? bool.booleanValue() : false;
            vdx0 vdx0Var = e370.e;
            wfn0 e2 = (vdx0Var != null ? vdx0Var : null).e();
            String str2 = eVar.a;
            String str3 = eVar.b;
            boolean z = eVar.f;
            boolean z2 = eVar.c;
            boolean z3 = eVar.g;
            boolean z4 = eVar.h;
            boolean z5 = eVar.d;
            boolean z6 = eVar.e;
            boolean z7 = eVar.i;
            if (str == null) {
                str = eVar.j;
            }
            io.reactivex.rxjava3.internal.operators.observable.m1 y = e2.y(str2, str3, z, z2, z3, z4, z5, z6, z7, str, booleanValue);
            vk40 vk40Var = new vk40(new eyp0(5), 28);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            int i = 26;
            return new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.c0(com.vk.registration.funnels.a.a(y.E(vk40Var, lVar, kVar, kVar)).E(new n240(dVar.a, i), lVar, kVar, kVar).F(new qg60(dVar.b, 20)), new m3y(dVar.c, i), kVar), new g30(dVar.d, 7));
        }
        str = null;
        r55 r55Var2 = r55.a;
        Boolean bool2 = Boolean.valueOf(r55.a().getPackageManager().hasSystemFeature("android.hardware.telephony"));
        boolean booleanValue2 = bool2 == null ? bool2.booleanValue() : false;
        vdx0 vdx0Var2 = e370.e;
        wfn0 e22 = (vdx0Var2 != null ? vdx0Var2 : null).e();
        String str22 = eVar.a;
        String str32 = eVar.b;
        boolean z8 = eVar.f;
        boolean z22 = eVar.c;
        boolean z32 = eVar.g;
        boolean z42 = eVar.h;
        boolean z52 = eVar.d;
        boolean z62 = eVar.e;
        boolean z72 = eVar.i;
        if (str == null) {
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 y2 = e22.y(str22, str32, z8, z22, z32, z42, z52, z62, z72, str, booleanValue2);
        vk40 vk40Var2 = new vk40(new eyp0(5), 28);
        a.l lVar2 = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar2 = io.reactivex.rxjava3.internal.functions.a.c;
        int i2 = 26;
        return new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.c0(com.vk.registration.funnels.a.a(y2.E(vk40Var2, lVar2, kVar2, kVar2)).E(new n240(dVar.a, i2), lVar2, kVar2, kVar2).F(new qg60(dVar.b, 20)), new m3y(dVar.c, i2), kVar2), new g30(dVar.d, 7));
    }

    public static /* synthetic */ io.reactivex.rxjava3.internal.operators.observable.a0 h(sir0 sir0Var, e eVar) {
        d dVar = new d(null, null, null, null, 15);
        sir0Var.getClass();
        return g(eVar, dVar);
    }

    /* compiled from: ValidatePhoneHelper.kt */
    public static final class e {
        public final String a;
        public final String b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final String j;

        public e(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str3) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = z4;
            this.g = z5;
            this.h = z6;
            this.i = z7;
            this.j = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f && this.g == eVar.g && this.h == eVar.h && this.i == eVar.i && epx.f(this.j, eVar.j);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
            String str3 = this.j;
            return b + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ValidationInfo(sid=");
            sb.append(this.a);
            sb.append(", phone=");
            sb.append(this.b);
            sb.append(", libverifySupport=");
            sb.append(this.c);
            sb.append(", allowPush=");
            sb.append(this.d);
            sb.append(", allowEmail=");
            sb.append(this.e);
            sb.append(", voice=");
            sb.append(this.f);
            sb.append(", forceRemoveAccessToken=");
            sb.append(this.g);
            sb.append(", disablePartial=");
            sb.append(this.h);
            sb.append(", allowPasskey=");
            sb.append(this.i);
            sb.append(", superAppToken=");
            return ho8.a(sb, this.j, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ e(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str3, int i) {
            this(str, str2, z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? true : z5, (i & 128) != 0 ? false : z6, (i & 256) != 0 ? false : z7, (i & 512) != 0 ? null : str3);
            str2 = (i & 2) != 0 ? null : str2;
            if ((i & 4) != 0) {
                sir0.a.getClass();
                z = sir0.c(str2);
            }
        }
    }
}
