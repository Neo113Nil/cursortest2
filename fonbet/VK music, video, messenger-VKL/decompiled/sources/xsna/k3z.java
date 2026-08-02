package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.auth.main.LibverifyListener;
import com.vk.auth.main.LibverifyVerificationSource;
import com.vk.auth.main.VkClientLibverifyInfo;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.auth.utils.VkPhoneFormatUtils;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.MethodSelectorCodeState;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.api.dto.auth.LibverifyValidationType;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.gl.tf.Tensorflow;
import xsna.lnr0;
import xsna.mcv0;
import xsna.x65;

/* compiled from: LibverifyMethodSelectorPresenter.kt */
/* loaded from: classes15.dex */
public final class k3z extends r0c<t3z> implements m3z {
    public final boolean R;
    public final String S;
    public final String T;
    public final String U;
    public final String V;
    public final LibverifyScreenData.MethodSelectorAuth.FactorsNumber W;
    public final List<LibverifyValidationType> X;
    public boolean Y;
    public boolean Z;
    public final d3z a0;
    public boolean b0;
    public final String[] c0;
    public b d0;
    public boolean e0;
    public final a f0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LibverifyMethodSelectorPresenter.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b DENIED;
        public static final b GRANTED;
        public static final b REQUESTED;
        public static final b UNKNOWN;

        static {
            b bVar = new b(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = bVar;
            b bVar2 = new b("REQUESTED", 1);
            REQUESTED = bVar2;
            b bVar3 = new b("GRANTED", 2);
            GRANTED = bVar3;
            b bVar4 = new b("DENIED", 3);
            DENIED = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: LibverifyMethodSelectorPresenter.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VerificationMethodTypes.values().length];
            try {
                iArr[VerificationMethodTypes.MAX_MESSENGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LibverifyScreenData.MethodSelectorAuth.FactorsNumber.values().length];
            try {
                iArr2[LibverifyScreenData.MethodSelectorAuth.FactorsNumber.ONE_FA.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[LibverifyScreenData.MethodSelectorAuth.FactorsNumber.TWO_FA.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public k3z(VerificationMethodState verificationMethodState, Bundle bundle, String str, LibverifyScreenData.MethodSelectorAuth methodSelectorAuth, boolean z, a3z a3zVar, com.vk.auth.suspicious_auth.b bVar) {
        super(verificationMethodState, bundle, str, methodSelectorAuth.g, a3zVar, bVar);
        VkClientLibverifyInfo.Service service;
        VerificationScreenData verificationScreenData;
        this.R = z;
        this.S = methodSelectorAuth.b;
        this.T = methodSelectorAuth.i;
        this.U = methodSelectorAuth.j;
        CheckPresenterInfo checkPresenterInfo = methodSelectorAuth.g;
        String str2 = null;
        CheckPresenterInfo.MethodSelectorAuth methodSelectorAuth2 = checkPresenterInfo instanceof CheckPresenterInfo.MethodSelectorAuth ? (CheckPresenterInfo.MethodSelectorAuth) checkPresenterInfo : null;
        if (methodSelectorAuth2 != null && (verificationScreenData = methodSelectorAuth2.b) != null) {
            str2 = verificationScreenData.c;
        }
        this.V = str2;
        LibverifyScreenData.MethodSelectorAuth.FactorsNumber factorsNumber = methodSelectorAuth.m;
        this.W = factorsNumber;
        this.X = methodSelectorAuth.k;
        this.Y = true;
        gau gauVar = this.h;
        if (gauVar == null) {
            throw new IllegalStateException("There is no libverify controller provider! Please provide it in Superappkit.init or AuthLibBridge.init");
        }
        Context context = this.b;
        VkClientLibverifyInfo n = this.c.n();
        int i = c.$EnumSwitchMapping$1[factorsNumber.ordinal()];
        if (i == 1) {
            service = z ? VkClientLibverifyInfo.Service.ODKL_VERIFICATION_MODULE : VkClientLibverifyInfo.Service.PASSWORDLESS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            service = VkClientLibverifyInfo.Service.OTP_AUTH;
        }
        this.a0 = gauVar.a(context, n.c(service));
        this.c0 = this.c.n().b(this.b);
        this.d0 = b.UNKNOWN;
        this.f0 = new a();
    }

    public static final void a1(k3z k3zVar, int i) {
        Context context = k3zVar.b;
        t3z t3zVar = (t3z) k3zVar.a;
        if (t3zVar != null) {
            x65.a.a(t3zVar, context.getString(R.string.vk_auth_error), context.getString(i), context.getString(R.string.vk_ok), new akh(k3zVar, 29), null, null, false, null, null, Tensorflow.FRAME_WIDTH);
        }
    }

    @Override // xsna.ya6
    public final void A0(VerificationMethodTypes verificationMethodTypes, boolean z) {
        String str;
        String str2;
        String str3;
        if (c.$EnumSwitchMapping$0[verificationMethodTypes.ordinal()] != 1) {
            super.A0(verificationMethodTypes, z);
            return;
        }
        com.vk.auth.main.b bVar = this.d;
        if (bVar == null) {
            bVar = null;
        }
        VerificationScreenData verificationScreenData = this.I;
        String str4 = (verificationScreenData == null || (str3 = verificationScreenData.b) == null) ? "" : str3;
        if (verificationScreenData == null || (str = verificationScreenData.b) == null) {
            str = "";
        }
        bVar.J0(new VerificationScreenData.Phone(str4, VkPhoneFormatUtils.a(this.b, str, null, VkPhoneFormatUtils.PhoneFormatterMode.RUSSIAN_SPECIFIC, 12), (verificationScreenData == null || (str2 = verificationScreenData.d) == null) ? "" : str2, true, null, false, true, false, null, null, null, null, 4016, null), VerificationMethodTypes.MAX_MESSENGER);
    }

    @Override // xsna.ya6
    public final void O0(String str) {
        d3z d3zVar = this.a0;
        super.O0(str);
        if (!c1()) {
            W0(str);
            return;
        }
        this.Y = true;
        try {
            if (d3zVar.h(str)) {
                d3zVar.b(str);
            } else {
                R0();
                e1();
            }
        } catch (Exception e) {
            par0.a.getClass();
            par0.b("Exception: " + e);
        }
    }

    @Override // xsna.r0c
    public final boolean V0() {
        PermissionHelper.a.getClass();
        return PermissionHelper.b(this.b, this.c0);
    }

    @Override // xsna.r0c, xsna.p66, xsna.z55
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public final void y0(c3z c3zVar) {
        super.y0(c3zVar);
        b bVar = this.d0;
        b bVar2 = b.UNKNOWN;
        boolean z = bVar == bVar2;
        if (!SakFeatures.Type.VKC_LIBVERIFY_CONF_CHANGE.h() || z) {
            g1(c3zVar);
        } else if (this.d0 != b.REQUESTED) {
            f1();
        } else {
            this.d0 = bVar2;
            g1(c3zVar);
        }
    }

    public final boolean c1() {
        MethodSelectorCodeState methodSelectorCodeState = this.A;
        return (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifySms) || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallReset) || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMobileId) || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallIn) || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMessengerPush);
    }

    public final boolean d1() {
        return c1() || (this.A instanceof MethodSelectorCodeState.Loading);
    }

    public final void e1() {
        t3z t3zVar = (t3z) this.a;
        if (t3zVar != null) {
            t3zVar.E1(this.b.getString(R.string.vk_auth_wrong_code), (r5 & 2) == 0, (r5 & 4) == 0);
        }
    }

    @Override // xsna.m3z
    public final void f() {
        MethodSelectorCodeState methodSelectorCodeState = this.A;
        MethodSelectorCodeState.LibverifyCallIn libverifyCallIn = methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallIn ? (MethodSelectorCodeState.LibverifyCallIn) methodSelectorCodeState : null;
        if (libverifyCallIn != null) {
            this.a0.g();
            p090 p090Var = this.F;
            p090Var.getClass();
            p090Var.d(new rjd(com.vk.registration.funnels.b.a, 3));
            t3z t3zVar = (t3z) this.a;
            if (t3zVar != null) {
                t3zVar.D2(libverifyCallIn.b);
            }
        }
    }

    public final void f1() {
        if (this.b0) {
            return;
        }
        PermissionHelper.a.getClass();
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"android.permission.READ_PHONE_STATE"}, 1);
        this.a0.k(this.b, !tvo.a(r2, strArr));
        MethodSelectorCodeState methodSelectorCodeState = this.A;
        if (!(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallReset) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallIn)) {
            int y0 = y0();
            String str = this.V;
            if (str == null) {
                str = this.S;
            }
            methodSelectorCodeState = new MethodSelectorCodeState.LibverifySms(y0, str);
        }
        L0(methodSelectorCodeState);
        X0();
        N0();
        t3z t3zVar = (t3z) this.a;
        if (t3zVar != null) {
            t3zVar.O1();
        }
        this.a0.d(this.S, this.U, SakFeatures.Type.FEATURE_VKC_LIBVERIFY_CALLIN_AUTH.h(), this.X, null, false);
        this.b0 = true;
    }

    public final void g1(c3z c3zVar) {
        PermissionHelper.a.getClass();
        Context context = this.b;
        String[] strArr = this.c0;
        if (PermissionHelper.b(context, strArr)) {
            this.d0 = b.GRANTED;
            return;
        }
        this.d0 = b.REQUESTED;
        dgm dgmVar = new dgm(this, 17);
        tvj tvjVar = new tvj(this, 19);
        int i = mcv0.o1;
        mcv0 a2 = mcv0.a.a(R.drawable.vk_icon_phone_outline_56, c3zVar.requireContext().getString(R.string.vk_apps_phone_verify_auto_call_permission_title), c3zVar.requireContext().getString(R.string.vk_apps_phone_verify_auto_call_permission_subtitle));
        a2.j1 = R.string.vk_auth_phone_permissions_grant;
        a2.k1 = R.string.vk_auth_phone_permissions_deny;
        a2.f1 = new b3z(c3zVar, strArr, dgmVar, tvjVar);
        a2.Td(c3zVar.getChildFragmentManager(), "phonePermissions");
    }

    @Override // xsna.r0c, xsna.p66, xsna.z55
    public final void onDestroy() {
        super.onDestroy();
        if (!this.b0 || this.e0) {
            return;
        }
        d3z d3zVar = this.a0;
        d3zVar.i(null);
        d3zVar.onCancel();
    }

    @Override // xsna.p66, xsna.z55
    public final void onPause() {
        this.a0.i(null);
    }

    @Override // xsna.r0c, xsna.p66, xsna.z55
    public final void onResume() {
        super.onResume();
        if (d1()) {
            this.Y = false;
            this.a0.i(this.f0);
            if (this.d0 != b.REQUESTED) {
                f1();
            }
        }
    }

    @Override // xsna.ya6
    public final int y0() {
        return c1() ? this.a0.a() : this.A.d();
    }

    /* compiled from: LibverifyMethodSelectorPresenter.kt */
    public final class a implements LibverifyListener {

        /* compiled from: LibverifyMethodSelectorPresenter.kt */
        /* renamed from: xsna.k3z$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3161a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LibverifyVerificationSource.values().length];
                try {
                    iArr[LibverifyVerificationSource.ALREADY_VERIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a() {
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void a(Integer num, String str) {
            k3z k3zVar = k3z.this;
            k3zVar.Z = true;
            if (k3zVar.d1()) {
                MethodSelectorCodeState methodSelectorCodeState = k3zVar.A;
                if (num == null) {
                    k3zVar.Z = false;
                    return;
                }
                if ((methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallReset) && ((MethodSelectorCodeState.LibverifyCallReset) methodSelectorCodeState).b == num.intValue()) {
                    return;
                }
                int intValue = num.intValue();
                if (str == null && (str = k3zVar.V) == null) {
                    str = k3zVar.S;
                }
                k3zVar.L0(new MethodSelectorCodeState.LibverifyCallReset(intValue, str));
                k3zVar.N0();
                k3zVar.X0();
            }
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void c(LibverifyListener.State state) {
            k3z k3zVar = k3z.this;
            if (k3zVar.d1() && !k3zVar.Z && state == LibverifyListener.State.ENTER_SMS_CODE) {
                MethodSelectorCodeState methodSelectorCodeState = k3zVar.A;
                if ((methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifySms) && ((MethodSelectorCodeState.LibverifySms) methodSelectorCodeState).b == k3zVar.y0()) {
                    return;
                }
                int y0 = k3zVar.y0();
                String str = k3zVar.V;
                if (str == null) {
                    str = k3zVar.S;
                }
                k3zVar.L0(new MethodSelectorCodeState.LibverifySms(y0, str));
                k3zVar.X0();
            }
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void d(boolean z) {
            k3z k3zVar = k3z.this;
            k3zVar.Z = z;
            if (k3zVar.d1() && z && !(k3zVar.A instanceof MethodSelectorCodeState.LibverifyMobileId)) {
                k3zVar.L0(new MethodSelectorCodeState.LibverifyMobileId(rte0.q(k3zVar.z)));
                k3zVar.X0();
            }
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void f(Integer num, String str, String str2) {
            k3z k3zVar = k3z.this;
            k3zVar.Z = true;
            if (k3zVar.d1()) {
                MethodSelectorCodeState methodSelectorCodeState = k3zVar.A;
                if (str == null) {
                    k3zVar.Z = false;
                    return;
                }
                if ((methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMessengerPush) && epx.f(((MethodSelectorCodeState.LibverifyMessengerPush) methodSelectorCodeState).c, str)) {
                    return;
                }
                int y0 = k3zVar.y0();
                Integer valueOf = Integer.valueOf(num != null ? num.intValue() : -1);
                String str3 = k3zVar.V;
                if (str3 == null) {
                    str3 = k3zVar.S;
                }
                k3zVar.L0(new MethodSelectorCodeState.LibverifyMessengerPush(y0, str, valueOf, str3));
                k3zVar.N0();
                k3zVar.X0();
                p090 p090Var = k3zVar.F;
                p090Var.getClass();
                p090Var.d(new t9w(com.vk.registration.funnels.b.a, 1));
            }
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void g(LibverifyListener.a aVar) {
            k3z k3zVar = k3z.this;
            p090 p090Var = k3zVar.F;
            Context context = k3zVar.b;
            if (k3zVar.A instanceof MethodSelectorCodeState.LibverifyCallIn) {
                if (aVar instanceof LibverifyListener.a.e) {
                    p090Var.getClass();
                    p090Var.d(new r010(null, 16));
                } else {
                    String a = aVar.a();
                    p090Var.getClass();
                    p090Var.d(new r010(a, 16));
                }
            }
            if (aVar instanceof LibverifyListener.a.b) {
                k3zVar.R0();
                k3z.a1(k3zVar, R.string.vk_auth_sign_up_invalid_phone);
                return;
            }
            if (aVar instanceof LibverifyListener.a.h) {
                k3zVar.R0();
                k3z.a1(k3zVar, R.string.vk_auth_sign_up_invalid_phone_format);
                return;
            }
            if ((aVar instanceof LibverifyListener.a.f) || (aVar instanceof LibverifyListener.a.d)) {
                k3zVar.R0();
                t3z t3zVar = (t3z) k3zVar.a;
                if (t3zVar != null) {
                    t3zVar.qi(context.getString(R.string.vk_auth_load_network_error));
                    return;
                }
                return;
            }
            if (aVar instanceof LibverifyListener.a.g) {
                k3zVar.R0();
                gzs<s3q0> ufkVar = k3zVar.R ? new ufk(k3zVar, 11) : new bih(k3zVar, 24);
                t3z t3zVar2 = (t3z) k3zVar.a;
                if (t3zVar2 != null) {
                    t3zVar2.wa(context.getString(R.string.vk_auth_too_much_tries), ufkVar, ufkVar);
                    return;
                }
                return;
            }
            if (aVar instanceof LibverifyListener.a.C0402a) {
                String str = ((LibverifyListener.a.C0402a) aVar).a;
                k3zVar.R0();
                if (drm0.N(str)) {
                    str = null;
                }
                if (str == null) {
                    str = context.getString(R.string.vk_auth_unknown_error);
                }
                t3z t3zVar3 = (t3z) k3zVar.a;
                if (t3zVar3 != null) {
                    t3zVar3.wa(str, null, null);
                    return;
                }
                return;
            }
            if (aVar instanceof LibverifyListener.a.c) {
                if (k3zVar.Y) {
                    p090Var.b(null);
                    k3zVar.R0();
                    k3zVar.e1();
                    return;
                }
                return;
            }
            if (!(aVar instanceof LibverifyListener.a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            t3z t3zVar4 = (t3z) k3zVar.a;
            if (t3zVar4 != null) {
                t3zVar4.wa(context.getString(R.string.vk_otp_method_selection_verification_methods_libverify_callin_error), null, null);
            }
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void h(Integer num, String str) {
            k3z k3zVar = k3z.this;
            p090 p090Var = k3zVar.F;
            k3zVar.Z = true;
            if (!k3zVar.d1()) {
                d3z d3zVar = k3zVar.a0;
                if (!k3zVar.b0 || k3zVar.e0) {
                    return;
                }
                d3zVar.i(null);
                d3zVar.onCancel();
                return;
            }
            MethodSelectorCodeState methodSelectorCodeState = k3zVar.A;
            if (str == null || num == null) {
                MethodSelectorCodeState.LibverifyCallIn libverifyCallIn = methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallIn ? (MethodSelectorCodeState.LibverifyCallIn) methodSelectorCodeState : null;
                if (libverifyCallIn != null) {
                    k3zVar.L0(new MethodSelectorCodeState.LibverifyCallIn(libverifyCallIn.b, libverifyCallIn.c, libverifyCallIn.d, libverifyCallIn.e, false));
                    k3zVar.X0();
                    k3zVar.N0();
                }
                p090Var.getClass();
                p090Var.d(new kun(com.vk.registration.funnels.b.a, 2));
                k3zVar.Z = false;
                return;
            }
            if (!(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallIn)) {
                i(num.intValue(), str);
                k3zVar.X0();
            } else {
                if (epx.f(((MethodSelectorCodeState.LibverifyCallIn) methodSelectorCodeState).b, str)) {
                    return;
                }
                i(num.intValue(), str);
                p090Var.getClass();
                p090Var.d(new q090(com.vk.registration.funnels.b.a, 0));
            }
        }

        public final void i(int i, String str) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            k3z k3zVar = k3z.this;
            String str2 = k3zVar.V;
            if (str2 == null) {
                str2 = k3zVar.S;
            }
            k3zVar.L0(new MethodSelectorCodeState.LibverifyCallIn(str, elapsedRealtime, elapsedRealtime + i, str2, true));
            k3zVar.X0();
            k3zVar.N0();
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void onCompleted(String str, String str2, String str3) {
            lnr0.a aVar;
            k3z k3zVar = k3z.this;
            k3zVar.e0 = true;
            d3z d3zVar = k3zVar.a0;
            d3zVar.e();
            r55 r55Var = r55.a;
            r55.e().a();
            LibverifyVerificationSource f = d3zVar.f();
            int i = f == null ? -1 : C3161a.$EnumSwitchMapping$0[f.ordinal()];
            if (i == -1) {
                aVar = null;
            } else {
                if (i != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = lnr0.a.b;
            }
            if (aVar != null) {
                p090 p090Var = k3zVar.F;
                p090Var.e = aVar;
                p090Var.d(new uz(22));
            }
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            io.reactivex.rxjava3.internal.operators.single.y a = vdx0Var.r().a(k3zVar.T, str2);
            io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
            int i2 = 0;
            bVar.b(new io.reactivex.rxjava3.internal.operators.single.i(a, new h66(bVar, 0)).subscribe());
            String str4 = k3zVar.T;
            boolean z = k3zVar.D;
            if (!(k3zVar.z instanceof CheckPresenterInfo.MethodSelectorAuth)) {
                m200.C(new IllegalStateException("This method should be used only for method selector auth."));
                return;
            }
            boolean z2 = k3zVar.W == LibverifyScreenData.MethodSelectorAuth.FactorsNumber.ONE_FA;
            vdx0 vdx0Var2 = e370.e;
            if (vdx0Var2 == null) {
                vdx0Var2 = null;
            }
            io.reactivex.rxjava3.internal.operators.observable.j1 e = vdx0Var2.e().e(str, str4, null, str2, str3, true, z2, z, null);
            ljs ljsVar = new ljs(new xgv(k3zVar, 4), 3);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            io.reactivex.rxjava3.internal.operators.observable.b0 E = e.E(ljsVar, lVar, kVar, kVar);
            int i3 = 25;
            io.reactivex.rxjava3.core.q a0 = com.vk.registration.funnels.a.a(E.F(new j3z(new ozh(k3zVar, i3), i2))).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            if (!(k3zVar.A instanceof MethodSelectorCodeState.LibverifyMobileId)) {
                a0 = k3zVar.w0(a0, true);
            }
            k3zVar.t.b(mnh0.B(a0, k3zVar.s, new cqf(k3zVar, 28), new j9k(k3zVar, i3), null));
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void onNotification(String str) {
            qro0.c(new com.vk.movika.sdk.base.ui.z(7, k3z.this, str));
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void onProgress(boolean z) {
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void b(String str, String str2) {
        }

        @Override // com.vk.auth.main.LibverifyListener
        public final void e(String str, String str2) {
        }
    }
}
