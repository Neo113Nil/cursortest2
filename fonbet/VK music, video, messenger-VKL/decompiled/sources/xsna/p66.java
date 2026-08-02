package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.auth.dto.AuthOnSuccessValidationResponseDto;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.AuthModel;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpData;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.oauth.component.di.OAuthUiComponent;
import com.vk.auth.signup.VkAdditionalSignUpData;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import ru.ok.gl.tf.Tensorflow;
import xsna.c2r0;
import xsna.p4g;
import xsna.q55;
import xsna.wbu0;
import xsna.x65;

/* compiled from: BaseAuthPresenter.kt */
/* loaded from: classes.dex */
public abstract class p66<V extends x65> implements z55<V> {
    public V a;
    public final Context b;
    public final AuthModel c;
    public com.vk.auth.main.b d;
    public final AuthStatSender e;
    public final c2r0 f;
    public final c2r0 g;
    public final gau h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public SignUpRouter n;
    public com.vk.auth.main.e o;
    public SignUpDataHolder p;
    public zn70 q;
    public io.reactivex.rxjava3.disposables.b r;
    public ygg s;
    public final io.reactivex.rxjava3.disposables.b t;
    public int u;
    public int v;
    public final c w;

    /* compiled from: BaseAuthPresenter.kt */
    /* loaded from: classes15.dex */
    public class a extends e66 {

        /* compiled from: BaseAuthPresenter.kt */
        /* renamed from: xsna.p66$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3493a extends MutablePropertyReference0Impl {
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
            public final Object get() {
                return ((p66) this.receiver).a;
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
            public final void set(Object obj) {
                ((p66) this.receiver).a = (V) obj;
            }
        }

        /* compiled from: BaseAuthPresenter.kt */
        public static final /* synthetic */ class b extends MutablePropertyReference0Impl {
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
            public final Object get() {
                com.vk.auth.main.e eVar = ((p66) this.receiver).o;
                if (eVar != null) {
                    return eVar;
                }
                return null;
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
            public final void set(Object obj) {
                ((p66) this.receiver).o = (com.vk.auth.main.e) obj;
            }
        }

        /* compiled from: BaseAuthPresenter.kt */
        public static final /* synthetic */ class c extends MutablePropertyReference0Impl {
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
            public final Object get() {
                com.vk.auth.main.b bVar = ((p66) this.receiver).d;
                if (bVar != null) {
                    return bVar;
                }
                return null;
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
            public final void set(Object obj) {
                ((p66) this.receiver).d = (com.vk.auth.main.b) obj;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a() {
            super(r1, r2, r3, r4, r5, r6, r15 != null ? r15 : null, p66.this.t);
            Context context = p66.this.b;
            C3493a c3493a = new C3493a(p66.this, p66.class, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "getView()Lcom/vk/auth/base/AuthView;", 0);
            b bVar = new b(p66.this, p66.class, "signUpStrategy", "getSignUpStrategy()Lcom/vk/auth/main/SignUpStrategy;", 0);
            c cVar = p66.this.w;
            c cVar2 = new c(p66.this, p66.class, "authRouter", "getAuthRouter()Lcom/vk/auth/main/AuthRouter;", 0);
            SignUpDataHolder signUpDataHolder = p66.this.p;
            VkAuthMetaInfo vkAuthMetaInfo = (signUpDataHolder == null ? null : signUpDataHolder).I;
            zn70 zn70Var = p66.this.q;
        }

        @Override // xsna.e66, xsna.ipj0
        public void f(com.vk.superapp.core.api.models.a aVar, vgg vggVar) {
            String str = aVar.B;
            String str2 = aVar.u;
            boolean f = epx.f(str2, "wrong_otp");
            Context context = this.k;
            String string = (f || epx.f(str2, "otp_format_is_incorrect")) ? context.getString(R.string.vk_auth_wrong_code) : null;
            if (string == null) {
                if (drm0.N(str)) {
                    str = null;
                }
                string = str == null ? context.getString(R.string.vk_auth_log_in_network_error) : str;
            }
            if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                if (epx.f(str2, "wrong_otp") || epx.f(str2, "otp_format_is_incorrect")) {
                    z(string);
                } else {
                    x65 y = y();
                    if (y != null) {
                        y.wa(string, null, null);
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } else {
                vggVar.c();
            }
            p66.this.getClass();
        }

        @Override // xsna.ipj0
        public final void i(com.vk.superapp.core.api.models.a aVar, vgg vggVar) {
            r55 r55Var = r55.a;
            c2r0 j = r55.j();
            UserId userId = aVar.c;
            Context context = this.k;
            ((yui) j).b(context, userId);
            if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                x65 y = y();
                if (y != null) {
                    y.wa(context.getString(R.string.vk_auth_sign_up_invalid_session), null, null);
                }
                s3q0 s3q0Var = s3q0.a;
            } else {
                vggVar.c();
            }
            p66.this.n0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.ipj0
        public final void l(VkAdditionalSignUpData vkAdditionalSignUpData) {
            ((com.vk.auth.main.e) this.e.invoke()).e(vkAdditionalSignUpData, this.f);
            p66.this.getClass();
        }

        @Override // xsna.ipj0
        public void n(Throwable th, vgg vggVar) {
            if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                x65 y = y();
                if (y != null) {
                    y.qi(this.k.getString(R.string.vk_auth_load_network_error));
                }
                s3q0 s3q0Var = s3q0.a;
            } else {
                vggVar.c();
            }
            p66.this.getClass();
        }

        @Override // xsna.ipj0, io.reactivex.rxjava3.core.v
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public void onNext(AuthResult authResult) {
            q55 q55Var = q55.a;
            q55.d(authResult);
            p66.this.p0();
        }

        @Override // xsna.ipj0, io.reactivex.rxjava3.core.v
        public void onError(Throwable th) {
            super.onError(th);
            p66<V> p66Var = p66.this;
            p66Var.e.b(p66Var.g0());
        }
    }

    /* compiled from: BaseAuthPresenter.kt */
    /* loaded from: classes15.dex */
    public final class b extends p66<V>.a {
        public final String n;
        public final SignUpData o;

        public b(String str, SignUpData signUpData) {
            super();
            this.n = str;
            this.o = signUpData;
        }

        @Override // xsna.p66.a, xsna.ipj0
        public final void n(Throwable th, vgg vggVar) {
            com.vk.registration.funnels.b.t(com.vk.registration.funnels.b.a);
            super.n(th, vggVar);
        }

        @Override // xsna.p66.a, xsna.ipj0, io.reactivex.rxjava3.core.v
        /* renamed from: o */
        public final void onNext(AuthResult authResult) {
            super.onNext(authResult);
            UserId userId = authResult.d;
            SignUpData signUpData = this.o;
            q55 q55Var = q55.a;
            List y0 = j5g.y0(q55.b);
            q55.b bVar = new q55.b(par0.a);
            p4g.a aVar = p4g.a;
            Iterator it = y0.iterator();
            while (it.hasNext()) {
                try {
                    ((s25) it.next()).j(userId.b, signUpData);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    bVar.invoke(th);
                }
            }
            udx0 udx0Var = e370.i;
            if (udx0Var == null) {
                udx0Var = null;
            }
            udx0Var.getClass();
            com.vk.metrics.eventtracking.b.a.e(userId.b);
        }

        @Override // xsna.p66.a, xsna.ipj0, io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            String str = this.o.b;
            p66<V> p66Var = p66.this;
            Context context = p66Var.b;
            if (!(th instanceof VKApiExecutionException)) {
                super.onError(th);
                return;
            }
            wbu0.a a = wbu0.a(context, th, false);
            VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
            int s = vKApiExecutionException.s();
            if (s == 100) {
                String str2 = a.a;
                String u = vKApiExecutionException.u();
                if ((u != null && drm0.D(u, "first_name", false)) || ((u != null && drm0.D(u, "birthday", false)) || (u != null && drm0.D(u, "last_name", false)))) {
                    V v = p66Var.a;
                    if (v != null) {
                        String string = context.getString(R.string.vk_auth_error);
                        String string2 = context.getString(R.string.vk_ok);
                        com.vk.auth.main.e eVar = p66Var.o;
                        x65.a.a(v, string, str2, string2, new t66(0, eVar != null ? eVar : null, com.vk.auth.main.e.class, "openEnterProfile", "openEnterProfile()V", 0, 0), null, null, false, null, null, Tensorflow.FRAME_WIDTH);
                        return;
                    }
                    return;
                }
                if (u == null || !drm0.D(u, "phone", false)) {
                    V v2 = p66Var.a;
                    if (v2 != null) {
                        v2.wa(str2, null, null);
                        return;
                    }
                    return;
                }
                V v3 = p66Var.a;
                if (v3 != null) {
                    String string3 = context.getString(R.string.vk_auth_error);
                    String string4 = context.getString(R.string.vk_ok);
                    com.vk.auth.main.e eVar2 = p66Var.o;
                    x65.a.a(v3, string3, str2, string4, new u66(0, eVar2 != null ? eVar2 : null, com.vk.auth.main.e.class, "onNeedNewNumber", "onNeedNewNumber()V", 0, 0), null, null, false, null, null, Tensorflow.FRAME_WIDTH);
                    return;
                }
                return;
            }
            if (s == 1000) {
                String str3 = a.a;
                V v4 = p66Var.a;
                if (v4 != null) {
                    String string5 = context.getString(R.string.vk_auth_error);
                    String string6 = context.getString(R.string.vk_ok);
                    com.vk.auth.main.e eVar3 = p66Var.o;
                    x65.a.a(v4, string5, str3, string6, new r66(0, eVar3 != null ? eVar3 : null, com.vk.auth.main.e.class, "onNeedNewNumber", "onNeedNewNumber()V", 0, 0), null, null, false, null, null, Tensorflow.FRAME_WIDTH);
                    return;
                }
                return;
            }
            if (s == 1004) {
                p66Var.o0(str, new eu1(p66Var, 7), new ml1(1, p66Var, str), a.a);
                return;
            }
            if (s == 1113) {
                String str4 = a.a;
                V v5 = p66Var.a;
                if (v5 != null) {
                    String string7 = context.getString(R.string.vk_auth_error);
                    String string8 = context.getString(R.string.vk_ok);
                    com.vk.auth.main.e eVar4 = p66Var.o;
                    x65.a.a(v5, string7, str4, string8, new s66(0, eVar4 != null ? eVar4 : null, com.vk.auth.main.e.class, "startRegistration", "startRegistration()V", 0, 0), null, null, false, null, null, Tensorflow.FRAME_WIDTH);
                    return;
                }
                return;
            }
            if (s == 1110) {
                String str5 = a.a;
                V v6 = p66Var.a;
                if (v6 != null) {
                    x65.a.a(v6, context.getString(R.string.vk_auth_error), str5, context.getString(R.string.vk_ok), new i66(p66Var, this.n, str, 0), null, null, false, null, null, Tensorflow.FRAME_WIDTH);
                    return;
                }
                return;
            }
            if (s != 1111) {
                V v7 = p66Var.a;
                if (v7 != null) {
                    v7.vf(a);
                    return;
                }
                return;
            }
            String str6 = a.a;
            V v8 = p66Var.a;
            if (v8 != null) {
                x65.a.a(v8, context.getString(R.string.vk_auth_error), str6, context.getString(R.string.vk_ok), new pu(p66Var, 11), null, null, false, null, null, Tensorflow.FRAME_WIDTH);
            }
        }
    }

    /* compiled from: BaseAuthPresenter.kt */
    public static final class c implements pbu0 {
        public final /* synthetic */ p66<V> a;

        /* compiled from: BaseAuthPresenter.kt */
        /* loaded from: classes15.dex */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AuthOnSuccessValidationResponseDto.NextStepDto.values().length];
                try {
                    iArr[AuthOnSuccessValidationResponseDto.NextStepDto.OK_MIMICRY_PASSWORD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AuthOnSuccessValidationResponseDto.NextStepDto.OK_MIMICRY_NEED_VALIDATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AuthOnSuccessValidationResponseDto.NextStepDto.OK_MIMICRY_ITS_ME.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AuthOnSuccessValidationResponseDto.NextStepDto.OK_MIMICRY_VKID_ITS_ME.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AuthOnSuccessValidationResponseDto.NextStepDto.OK_MIMICRY_VKID_SEAMLESS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c(p66<V> p66Var) {
            this.a = p66Var;
        }

        @Override // xsna.pbu0
        public final void a(io.reactivex.rxjava3.core.q<AuthOnSuccessValidationResponseDto> qVar, String str, String str2, String str3) {
            io.reactivex.rxjava3.disposables.c B;
            p66<V> p66Var = this.a;
            B = mnh0.B(p66Var.w0(qVar, true), p66Var.s, new q66(str2, str, str3, 0), new ec(this, p66Var), null);
            p66Var.t.b(B);
        }

        @Override // xsna.pbu0
        public final void b(io.reactivex.rxjava3.core.q<AuthResult> qVar) {
            p66<V> p66Var = this.a;
            p66.r0(p66Var, qVar, p66Var.new a(), null, 6);
        }

        @Override // xsna.pbu0
        public final void c(String str, SignUpData signUpData, io.reactivex.rxjava3.core.q<AuthResult> qVar) {
            p66<V> p66Var = this.a;
            p66.r0(p66Var, qVar, p66Var.new b(str, signUpData), null, 6);
        }
    }

    public p66() {
        r55 r55Var = r55.a;
        this.b = r55.a();
        this.c = r55.h();
        this.e = r55.c();
        this.f = r55.j();
        umu0 umu0Var = r55.g;
        (umu0Var == null ? null : umu0Var).getClass();
        this.g = c2r0.a.a;
        umu0 umu0Var2 = r55.g;
        this.h = (umu0Var2 != null ? umu0Var2 : null).e;
        int i = 0;
        m66 m66Var = new m66(this, i);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, m66Var);
        this.j = msy.a(lazyThreadSafetyMode, new n66(this, i));
        this.k = msy.a(lazyThreadSafetyMode, new o66(this, i));
        this.l = msy.a(lazyThreadSafetyMode, new dr4(this, 2));
        this.m = msy.a(lazyThreadSafetyMode, new f53(this, 3));
        this.t = new io.reactivex.rxjava3.disposables.b();
        this.w = new c(this);
        v0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j0(p66 p66Var, VkAuthState vkAuthState, a aVar, VkAuthMetaInfo vkAuthMetaInfo, izs izsVar, int i) {
        if ((i & 2) != 0) {
            aVar = new a();
        }
        if ((i & 4) != 0) {
            SignUpDataHolder signUpDataHolder = p66Var.p;
            if (signUpDataHolder == null) {
                signUpDataHolder = null;
            }
            vkAuthMetaInfo = signUpDataHolder.I;
        }
        if ((i & 16) != 0) {
            izsVar = null;
        }
        p66Var.getClass();
        l55 l55Var = l55.a;
        Context context = p66Var.b;
        l55Var.getClass();
        p66Var.q0(l55.a(context, vkAuthState, null, vkAuthMetaInfo), aVar, vkAuthMetaInfo, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r0(p66 p66Var, io.reactivex.rxjava3.core.q qVar, a aVar, VkAuthMetaInfo vkAuthMetaInfo, int i) {
        if ((i & 1) != 0) {
            aVar = new a();
        }
        if ((i & 2) != 0) {
            SignUpDataHolder signUpDataHolder = p66Var.p;
            if (signUpDataHolder == null) {
                signUpDataHolder = null;
            }
            vkAuthMetaInfo = signUpDataHolder.I;
        }
        p66Var.q0(qVar, aVar, vkAuthMetaInfo, null);
    }

    public static io.reactivex.rxjava3.internal.operators.single.p x0(r0c r0cVar, io.reactivex.rxjava3.core.x xVar) {
        return new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.n(xVar, new defpackage.d(new com.vk.movika.sdk.base.observable.m(r0cVar, 10), 8)), new k66(r0cVar, 0));
    }

    @Override // xsna.z55
    public void e() {
        io.reactivex.rxjava3.disposables.b bVar = this.r;
        if (bVar != null) {
            if (bVar == null) {
                bVar = null;
            }
            bVar.dispose();
        }
        this.a = null;
        this.s = null;
    }

    public final void h0(io.reactivex.rxjava3.disposables.c cVar) {
        this.t.b(cVar);
    }

    public final boolean i0(io.reactivex.rxjava3.disposables.c cVar) {
        io.reactivex.rxjava3.disposables.b bVar = this.r;
        if (bVar == null) {
            bVar = null;
        }
        return bVar.b(cVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final nmg0 k0() {
        return (nmg0) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final wmj0 l0() {
        return (wmj0) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    public final String m0(String str) {
        if (l0().b(str) || SakFeatures.Type.VKC_BACKUP_SENDING.h()) {
            return null;
        }
        return (String) j5g.a0(((hsp0) this.j.getValue()).getAll());
    }

    public void o0(String str, gzs<s3q0> gzsVar, izs<? super String, s3q0> izsVar, String str2) {
        V v = this.a;
        if (v != null) {
            Context context = this.b;
            x65.a.a(v, context.getString(R.string.vk_auth_error), str2, context.getString(R.string.vk_auth_sign_up_btn_restore), new g4(5, izsVar, str), context.getString(R.string.vk_ok), gzsVar, false, null, null, 384);
        }
    }

    @Override // xsna.z55
    public boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // xsna.z55
    public void onDestroy() {
        this.t.dispose();
    }

    @Override // xsna.z55
    public void onResume() {
        v0();
    }

    @Override // xsna.z55
    /* renamed from: p */
    public void y0(V v) {
        v0();
        this.r = new io.reactivex.rxjava3.disposables.b();
        this.a = v;
        this.s = new bhg(v.Mb());
    }

    public void p0() {
        this.e.f(g0());
    }

    public final void q0(io.reactivex.rxjava3.core.q<AuthResult> qVar, p66<V>.a aVar, VkAuthMetaInfo vkAuthMetaInfo, izs<? super String, s3q0> izsVar) {
        SignUpDataHolder signUpDataHolder = this.p;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        signUpDataHolder.I = vkAuthMetaInfo;
        oz ozVar = new oz(new e5(this, 7), 3);
        qVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.c0 c0Var = new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(qVar, ozVar, io.reactivex.rxjava3.internal.functions.a.c).F(new wf1(new x7(this, 8), 7)), io.reactivex.rxjava3.internal.functions.a.d, new g66(this, 0));
        aVar.w(new ll1(2, this, izsVar != null ? new ngl(null, null, null, null, null, new yi2(izsVar, 2), null, null, null, null, 991) : null));
        c0Var.subscribe(aVar);
        this.t.b(aVar);
    }

    public final void s0(int i) {
        this.u = i;
        V v = this.a;
        if (v != null) {
            v.S(i > 0);
        }
    }

    public final void t0(int i) {
        this.v = i;
        V v = this.a;
        if (v != null) {
            v.wm(i > 0);
        }
    }

    public void u0(Throwable th) {
        wbu0.a a2;
        V v = this.a;
        if (v != null) {
            a2 = wbu0.a(this.b, th, false);
            v.vf(a2);
        }
    }

    public final void v0() {
        q55 q55Var = q55.a;
        this.d = q55.c().b;
        this.n = q55.c().b;
        this.o = q55.c().c;
        this.p = q55.c().a;
        this.q = ((OAuthUiComponent) k0().a(fpf0.a(OAuthUiComponent.class))).n1();
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 w0(io.reactivex.rxjava3.core.q qVar, boolean z) {
        cz czVar = new cz(new f66(this, z, 0), 5);
        qVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.c0(qVar, czVar, io.reactivex.rxjava3.internal.functions.a.c).G(new l66(this, z));
    }

    public void n0() {
    }

    @Override // xsna.z55
    public void onPause() {
    }

    @Override // xsna.z55
    public void onStart() {
    }

    @Override // xsna.z55
    public void onStop() {
    }

    @Override // xsna.z55
    public void x(Bundle bundle) {
    }
}
