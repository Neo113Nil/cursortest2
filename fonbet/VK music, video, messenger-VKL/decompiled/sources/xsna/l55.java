package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.AuthModel;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.main.VkClientLibverifyInfo;
import com.vk.auth.main.VkFastLoginModifiedUser;
import com.vk.dto.common.id.UserId;
import com.vk.mail.auth.api.MailAuthFlowConfig;
import com.vk.mail.auth.contract.result.userblockstatus.MailUserBlockedStatus;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.silentauth.SilentAuthInfo;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.dto.auth.AuthPayload;
import com.vk.superapp.api.exceptions.AuthException;
import com.vk.superapp.api.internal.oauthrequests.AuthByExchangeTokenInitiator;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;
import java.util.concurrent.Callable;
import kotlin.Result;
import xsna.l55;
import xsna.pgn0;
import xsna.xjv0;

/* compiled from: AuthHelper.kt */
/* loaded from: classes.dex */
public final class l55 {
    public static final l55 a = new l55();
    public static final bpn0 b = new bpn0(new y45(0));
    public static final bpn0 c = new bpn0(new b55(0));
    public static final bpn0 d = new bpn0(new q03(1));
    public static final bpn0 e = new bpn0(new r12(1));
    public static final bpn0 f = new bpn0(new j55(0));
    public static final bpn0 g = new bpn0(new k55(0));
    public static final bpn0 h = new bpn0(new u35(0));

    /* compiled from: AuthHelper.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MailUserBlockedStatus.values().length];
            try {
                iArr[MailUserBlockedStatus.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MailUserBlockedStatus.BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SilentAuthSource.values().length];
            try {
                iArr2[SilentAuthSource.FAST_LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SilentAuthSource.REGISTRATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SilentAuthSource.SILENT_LOGIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: AuthHelper.kt */
    /* loaded from: classes15.dex */
    public static final class b implements w8i {
    }

    /* compiled from: AuthHelper.kt */
    /* loaded from: classes15.dex */
    public static final class c implements w8i {
    }

    /* compiled from: AuthHelper.kt */
    /* loaded from: classes15.dex */
    public static final class d implements w8i {
    }

    /* compiled from: AuthHelper.kt */
    /* loaded from: classes15.dex */
    public static final class e implements w8i {
    }

    /* compiled from: AuthHelper.kt */
    /* loaded from: classes15.dex */
    public static final class f implements w8i {
    }

    /* compiled from: AuthHelper.kt */
    /* loaded from: classes15.dex */
    public static final class g implements w8i {
    }

    /* compiled from: AuthHelper.kt */
    public static final class h implements w8i {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:0|1|(2:2|3)|(3:71|72|(3:76|(1:78)|79))|5|(3:63|64|(22:66|8|(3:57|58|(19:60|11|(3:51|52|(16:54|14|15|(3:45|46|(12:48|18|(2:41|42)(1:20)|21|22|23|24|(1:26)|27|(1:29)(1:37)|30|(2:32|33)(2:35|36)))|17|18|(0)(0)|21|22|23|24|(0)|27|(0)(0)|30|(0)(0)))|13|14|15|(0)|17|18|(0)(0)|21|22|23|24|(0)|27|(0)(0)|30|(0)(0)))|10|11|(0)|13|14|15|(0)|17|18|(0)(0)|21|22|23|24|(0)|27|(0)(0)|30|(0)(0)))|7|8|(0)|10|11|(0)|13|14|15|(0)|17|18|(0)(0)|21|22|23|24|(0)|27|(0)(0)|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static io.reactivex.rxjava3.core.q a(Context context, VkAuthState vkAuthState, String str, VkAuthMetaInfo vkAuthMetaInfo) {
        SignUpDataHolder signUpDataHolder;
        String str2;
        Bundle bundle;
        String string;
        MailAuthFlowConfig mailAuthFlowConfig;
        Bundle bundle2;
        MailAuthFlowConfig e2;
        SilentAuthSource silentAuthSource;
        Bundle bundle3;
        SilentAuthSource f2;
        int i;
        Boolean bool;
        Bundle bundle4;
        Boolean valueOf;
        String str3;
        String str4;
        Object failure;
        r55 r55Var = r55.a;
        AuthModel h2 = r55.h();
        Context applicationContext = context.getApplicationContext();
        try {
            q55 q55Var = q55.a;
            signUpDataHolder = q55.c().a;
        } catch (Throwable unused) {
            signUpDataHolder = null;
        }
        if (signUpDataHolder != null) {
            try {
                Bundle bundle5 = signUpDataHolder.K;
                if (bundle5 != null && m63.g(bundle5)) {
                    if (signUpDataHolder.K == null) {
                        signUpDataHolder.K = new Bundle();
                    }
                    signUpDataHolder.K.putParcelable("white_label_flow_auth_state", vkAuthState);
                    s3q0 s3q0Var = s3q0.a;
                }
            } catch (Throwable unused2) {
            }
        }
        s3q0 s3q0Var2 = s3q0.a;
        if (signUpDataHolder != null) {
            try {
                bundle = signUpDataHolder.K;
            } catch (Throwable unused3) {
                str2 = null;
            }
            if (bundle != null) {
                string = bundle.getString("white_label_flow_input_sat");
                str2 = string;
                if (signUpDataHolder != null) {
                    try {
                        bundle2 = signUpDataHolder.K;
                    } catch (Throwable unused4) {
                        mailAuthFlowConfig = null;
                    }
                    if (bundle2 != null) {
                        e2 = m63.e(bundle2);
                        mailAuthFlowConfig = e2;
                        if (signUpDataHolder != null) {
                            try {
                                bundle3 = signUpDataHolder.K;
                            } catch (Throwable unused5) {
                                silentAuthSource = null;
                            }
                            if (bundle3 != null) {
                                f2 = m63.f(bundle3);
                                silentAuthSource = f2;
                                i = 0;
                                if (signUpDataHolder != null) {
                                    try {
                                        bundle4 = signUpDataHolder.K;
                                    } catch (Throwable unused6) {
                                        bool = null;
                                    }
                                    if (bundle4 != null) {
                                        valueOf = Boolean.valueOf(bundle4.getBoolean("mail_flow_white_link_password", false));
                                        bool = valueOf;
                                        if (signUpDataHolder != null) {
                                            try {
                                                str4 = signUpDataHolder.L;
                                            } catch (Throwable unused7) {
                                                str3 = null;
                                            }
                                        } else {
                                            str4 = null;
                                        }
                                        str3 = str4;
                                        failure = Boolean.valueOf(SakFeatures.Type.VKC_BACKUP_SENDING.h());
                                        Object obj = Boolean.FALSE;
                                        if (failure instanceof Result.Failure) {
                                            failure = obj;
                                        }
                                        boolean booleanValue = ((Boolean) failure).booleanValue();
                                        x35 x35Var = new x35(h2, booleanValue, str, context, vkAuthState, booleanValue ? str : (String) j5g.a0(((hsp0) b.getValue()).getAll()), str2, str3, vkAuthMetaInfo, mailAuthFlowConfig, applicationContext, silentAuthSource, bool);
                                        return vkAuthState.d.containsKey("validate_session") ? (io.reactivex.rxjava3.core.q) x35Var.invoke(null) : j(new y35(x35Var, i));
                                    }
                                }
                                valueOf = null;
                                bool = valueOf;
                                if (signUpDataHolder != null) {
                                }
                                str3 = str4;
                                failure = Boolean.valueOf(SakFeatures.Type.VKC_BACKUP_SENDING.h());
                                Object obj2 = Boolean.FALSE;
                                if (failure instanceof Result.Failure) {
                                }
                                boolean booleanValue2 = ((Boolean) failure).booleanValue();
                                x35 x35Var2 = new x35(h2, booleanValue2, str, context, vkAuthState, booleanValue2 ? str : (String) j5g.a0(((hsp0) b.getValue()).getAll()), str2, str3, vkAuthMetaInfo, mailAuthFlowConfig, applicationContext, silentAuthSource, bool);
                                if (vkAuthState.d.containsKey("validate_session")) {
                                }
                            }
                        }
                        f2 = null;
                        silentAuthSource = f2;
                        i = 0;
                        if (signUpDataHolder != null) {
                        }
                        valueOf = null;
                        bool = valueOf;
                        if (signUpDataHolder != null) {
                        }
                        str3 = str4;
                        failure = Boolean.valueOf(SakFeatures.Type.VKC_BACKUP_SENDING.h());
                        Object obj22 = Boolean.FALSE;
                        if (failure instanceof Result.Failure) {
                        }
                        boolean booleanValue22 = ((Boolean) failure).booleanValue();
                        x35 x35Var22 = new x35(h2, booleanValue22, str, context, vkAuthState, booleanValue22 ? str : (String) j5g.a0(((hsp0) b.getValue()).getAll()), str2, str3, vkAuthMetaInfo, mailAuthFlowConfig, applicationContext, silentAuthSource, bool);
                        if (vkAuthState.d.containsKey("validate_session")) {
                        }
                    }
                }
                e2 = null;
                mailAuthFlowConfig = e2;
                if (signUpDataHolder != null) {
                }
                f2 = null;
                silentAuthSource = f2;
                i = 0;
                if (signUpDataHolder != null) {
                }
                valueOf = null;
                bool = valueOf;
                if (signUpDataHolder != null) {
                }
                str3 = str4;
                failure = Boolean.valueOf(SakFeatures.Type.VKC_BACKUP_SENDING.h());
                Object obj222 = Boolean.FALSE;
                if (failure instanceof Result.Failure) {
                }
                boolean booleanValue222 = ((Boolean) failure).booleanValue();
                x35 x35Var222 = new x35(h2, booleanValue222, str, context, vkAuthState, booleanValue222 ? str : (String) j5g.a0(((hsp0) b.getValue()).getAll()), str2, str3, vkAuthMetaInfo, mailAuthFlowConfig, applicationContext, silentAuthSource, bool);
                if (vkAuthState.d.containsKey("validate_session")) {
                }
            }
        }
        string = null;
        str2 = string;
        if (signUpDataHolder != null) {
        }
        e2 = null;
        mailAuthFlowConfig = e2;
        if (signUpDataHolder != null) {
        }
        f2 = null;
        silentAuthSource = f2;
        i = 0;
        if (signUpDataHolder != null) {
        }
        valueOf = null;
        bool = valueOf;
        if (signUpDataHolder != null) {
        }
        str3 = str4;
        failure = Boolean.valueOf(SakFeatures.Type.VKC_BACKUP_SENDING.h());
        Object obj2222 = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
        }
        boolean booleanValue2222 = ((Boolean) failure).booleanValue();
        x35 x35Var2222 = new x35(h2, booleanValue2222, str, context, vkAuthState, booleanValue2222 ? str : (String) j5g.a0(((hsp0) b.getValue()).getAll()), str2, str3, vkAuthMetaInfo, mailAuthFlowConfig, applicationContext, silentAuthSource, bool);
        if (vkAuthState.d.containsKey("validate_session")) {
        }
    }

    public static io.reactivex.rxjava3.core.q c(l55 l55Var, Context context, VkAuthState vkAuthState, VkAuthMetaInfo vkAuthMetaInfo, int i) {
        if ((i & 8) != 0) {
            vkAuthMetaInfo = VkAuthMetaInfo.h;
        }
        l55Var.getClass();
        return a(context, vkAuthState, null, vkAuthMetaInfo);
    }

    public static io.reactivex.rxjava3.core.q d(l55 l55Var, Context context, VkAuthState vkAuthState, SilentAuthInfo silentAuthInfo, VkAuthMetaInfo vkAuthMetaInfo) {
        l55Var.getClass();
        if (silentAuthInfo.e()) {
            return e(l55Var, context, silentAuthInfo.d(), UserId.d, vkAuthMetaInfo, AuthByExchangeTokenInitiator.SILENT_AUTHORIZATION);
        }
        String str = null;
        try {
            q55 q55Var = q55.a;
            Bundle bundle = q55.c().a.K;
            if (bundle != null) {
                str = bundle.getString("white_label_flow_input_sat");
            }
        } catch (Throwable unused) {
        }
        String str2 = str;
        Context applicationContext = context.getApplicationContext();
        r55 r55Var = r55.a;
        r55.e().d(VkClientLibverifyInfo.Service.PASSWORDLESS);
        return j(new w35(vkAuthState, silentAuthInfo, str2, applicationContext, vkAuthMetaInfo, 0));
    }

    public static io.reactivex.rxjava3.core.q e(l55 l55Var, final Context context, final String str, final UserId userId, final VkAuthMetaInfo vkAuthMetaInfo, final AuthByExchangeTokenInitiator authByExchangeTokenInitiator) {
        l55Var.getClass();
        return j(new izs() { // from class: xsna.b45
            /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
            @Override // xsna.izs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                io.reactivex.rxjava3.core.q a2;
                Bundle bundle;
                VkAuthState vkAuthState;
                io.reactivex.rxjava3.core.q qVar;
                Context context2;
                Context context3;
                Context applicationContext;
                Parcelable parcelable;
                Object parcelable2;
                int i = dgn0.b().b;
                String str2 = dgn0.b().l;
                VkAuthMetaInfo vkAuthMetaInfo2 = vkAuthMetaInfo;
                a2 = px2.a((r3 & 4) != 0 ? "" : "AuthGetExchangeLoginData", new q25(str, userId, i, str2, authByExchangeTokenInitiator, (String) obj, vkAuthMetaInfo2.f.f), dgn0.c(), null, null);
                l55 l55Var2 = l55.a;
                l55Var2.getClass();
                try {
                    q55 q55Var = q55.a;
                    bundle = q55.c().a.K;
                } catch (Throwable unused) {
                    bundle = null;
                }
                if (bundle != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = bundle.getParcelable("white_label_flow_auth_state", VkAuthState.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        Parcelable parcelable3 = bundle.getParcelable("white_label_flow_auth_state");
                        if (!(parcelable3 instanceof VkAuthState)) {
                            parcelable3 = null;
                        }
                        parcelable = (VkAuthState) parcelable3;
                    }
                    vkAuthState = (VkAuthState) parcelable;
                } else {
                    vkAuthState = null;
                }
                if (bundle != null) {
                    int i2 = 1;
                    if (m63.g(bundle) && vkAuthState != null) {
                        qVar = new io.reactivex.rxjava3.internal.operators.observable.o1(a2, new h7(new mp3(i2, vkAuthState, bundle), 4));
                        context2 = context;
                        if (context2 != null || (applicationContext = context2.getApplicationContext()) == null) {
                            Context context4 = e43.a;
                            context3 = context4 != null ? context4 : null;
                        } else {
                            context3 = applicationContext;
                        }
                        return l55.i(l55Var2, qVar, context3, vkAuthMetaInfo2, null, 12).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                    }
                }
                qVar = a2;
                context2 = context;
                if (context2 != null) {
                }
                Context context42 = e43.a;
                context3 = context42 != null ? context42 : null;
                return l55.i(l55Var2, qVar, context3, vkAuthMetaInfo2, null, 12).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            }
        });
    }

    public static io.reactivex.rxjava3.internal.operators.observable.a f(l55 l55Var, final Context context, final SilentAuthInfo silentAuthInfo, final VkAuthMetaInfo vkAuthMetaInfo, int i) {
        boolean z = (i & 8) != 0;
        l55Var.getClass();
        umu0 umu0Var = r55.g;
        if (umu0Var == null) {
            umu0Var = null;
        }
        final xjv0 xjv0Var = umu0Var.f;
        io.reactivex.rxjava3.internal.operators.observable.l2 r0 = new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.v35
            @Override // java.util.concurrent.Callable
            public final Object call() {
                xjv0.b.a aVar;
                Object failure;
                SilentAuthInfo silentAuthInfo2 = silentAuthInfo;
                xjv0 xjv0Var2 = xjv0Var;
                Context context2 = context;
                try {
                    try {
                        q55 q55Var = q55.a;
                        failure = q55.c().a.K;
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    Bundle bundle = (Bundle) failure;
                    SilentAuthSource silentAuthSource = bundle != null ? (SilentAuthSource) rl3.S(bundle.getInt("silent_auth_source_key", -1), SilentAuthSource.values()) : null;
                    SilentAuthSource silentAuthSource2 = SilentAuthSource.ADDITIONAL_OAUTH;
                    VkAuthMetaInfo vkAuthMetaInfo2 = VkAuthMetaInfo.this;
                    if (silentAuthSource != silentAuthSource2) {
                        if ((bundle != null ? m63.f(bundle) : null) != null) {
                            silentAuthSource2 = m63.f(bundle);
                            if (silentAuthSource2 == null) {
                                silentAuthSource2 = SilentAuthSource.INTERNAL;
                            }
                        } else {
                            silentAuthSource2 = vkAuthMetaInfo2.e;
                            if (silentAuthSource2 == null) {
                                silentAuthSource2 = SilentAuthSource.INTERNAL;
                            }
                        }
                    }
                    mnj0 mnj0Var = lnj0.a;
                    mnj0Var.a();
                    if (silentAuthSource2 != null) {
                        mnj0Var.f("auth_source", silentAuthSource2.name());
                    }
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    String str = silentAuthInfo2.d;
                    String str2 = silentAuthInfo2.c;
                    l55.a.getClass();
                    int i2 = l55.a.$EnumSwitchMapping$1[silentAuthSource2.ordinal()];
                    SchemeStatSak$TypeRegistrationItem.EventType eventType = i2 != 1 ? i2 != 2 ? i2 != 3 ? SchemeStatSak$TypeRegistrationItem.EventType.SILENT_TOKEN_PROVIDED_AUTHORIZATION : SchemeStatSak$TypeRegistrationItem.EventType.FAST_SILENT_TOKEN_PROVIDED_AUTHORIZATION : SchemeStatSak$TypeRegistrationItem.EventType.SILENT_TOKEN_PROVIDED_REGISTRATION : SchemeStatSak$TypeRegistrationItem.EventType.SILENT_TOKEN_PROVIDED_AUTHORIZATION;
                    frf0.d = str;
                    frf0.e = str2;
                    try {
                        frf0.a(eventType, null, null, null, null, null, null, 254);
                        frf0.d = null;
                        frf0.e = null;
                        VkFastLoginModifiedUser vkFastLoginModifiedUser = vkAuthMetaInfo2.b;
                        aVar = xjv0Var2.a();
                    } catch (Throwable th2) {
                        frf0.d = null;
                        frf0.e = null;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    par0.a.getClass();
                    par0.c("Exception during silent-token exchange", th3);
                    aVar = new xjv0.b.a(th3, context2.getString(R.string.vk_auth_silent_token_exchange_error_dialog_description));
                }
                lnj0.a();
                boolean z2 = aVar.c;
                String str3 = aVar.b;
                if (str3 == null) {
                    str3 = context2.getString(R.string.vk_auth_silent_token_exchange_error_dialog_description);
                }
                throw new AuthException.ExchangeSilentTokenException(str3, aVar.a, z2);
            }
        }).r0(io.reactivex.rxjava3.schedulers.a.b());
        return z ? i(a, r0, context, vkAuthMetaInfo, null, 12).a0(io.reactivex.rxjava3.android.schedulers.a.b()) : r0;
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 g(l55 l55Var, AuthResult authResult, UserId userId, int i) {
        if ((i & 2) != 0) {
            wdx0 wdx0Var = e370.f;
            if (wdx0Var == null) {
                wdx0Var = null;
            }
            int i2 = pgn0.a.a;
            userId = wdx0Var.c().b;
        }
        VkAuthMetaInfo vkAuthMetaInfo = VkAuthMetaInfo.h;
        l55Var.getClass();
        return io.reactivex.rxjava3.core.q.T(authResult).L(new pj4(new mu1(1, vkAuthMetaInfo, userId), 3), false).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public static io.reactivex.rxjava3.core.q h(io.reactivex.rxjava3.core.q qVar, Context context, VkAuthMetaInfo vkAuthMetaInfo, VkAuthState vkAuthState, String str, AuthPayload authPayload) {
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        int i = pgn0.a.a;
        UserId userId = wdx0Var.c().b;
        a45 a45Var = new a45(new z35(vkAuthMetaInfo, 0));
        qVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.o1 o1Var = new io.reactivex.rxjava3.internal.operators.observable.o1(qVar, a45Var);
        final l45 l45Var = new l45(authPayload, vkAuthMetaInfo, context, userId, vkAuthState, str);
        return o1Var.L(new io.reactivex.rxjava3.functions.l() { // from class: xsna.m45
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                return (io.reactivex.rxjava3.core.t) l45.this.invoke(obj);
            }
        }, false);
    }

    public static /* synthetic */ io.reactivex.rxjava3.core.q i(l55 l55Var, io.reactivex.rxjava3.core.q qVar, Context context, VkAuthMetaInfo vkAuthMetaInfo, VkAuthState vkAuthState, int i) {
        if ((i & 4) != 0) {
            vkAuthState = null;
        }
        l55Var.getClass();
        return h(qVar, context, vkAuthMetaInfo, vkAuthState, null, null);
    }

    public static io.reactivex.rxjava3.core.q j(izs izsVar) {
        r55 r55Var = r55.a;
        io.reactivex.rxjava3.core.q<String> b2 = r55.e().b();
        final nu2 nu2Var = new nu2(izsVar, 1);
        return b2.L(new io.reactivex.rxjava3.functions.l() { // from class: xsna.k45
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                return (io.reactivex.rxjava3.core.t) nu2.this.invoke(obj);
            }
        }, false);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.m1 b(Context context, AuthResult authResult, VkAuthMetaInfo vkAuthMetaInfo) {
        return i(this, io.reactivex.rxjava3.core.q.T(authResult).a0(io.reactivex.rxjava3.schedulers.a.b()), context, vkAuthMetaInfo, null, 28).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }
}
