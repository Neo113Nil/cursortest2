package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.passkey.PasskeyAlternative;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.passkey.web.PasskeyWebAuthScreen;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.core.api.models.ValidationType;
import kotlin.NoWhenBranchMatchedException;
import xsna.sir0;
import xsna.wbu0;

/* compiled from: NeedValidationHandler.kt */
/* loaded from: classes15.dex */
public final class i060 {
    public final Context a;
    public final VkAuthMetaInfo b;
    public final izs<wbu0.a, s3q0> c;
    public final gzs<s3q0> d;
    public final SignUpRouter e;
    public final com.vk.auth.main.e f;

    /* compiled from: NeedValidationHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ValidationType.values().length];
            try {
                iArr[ValidationType.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValidationType.PUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValidationType.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValidationType.APP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ValidationType.CALL_RESET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ValidationType.LIBVERIFY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ValidationType.PHONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ValidationType.URL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ValidationType.PHONE_OAUTH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ValidationType.PHONE_OAUTH_CONFIRMATION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public i060(Context context, VkAuthMetaInfo vkAuthMetaInfo, izs izsVar, i8n0 i8n0Var) {
        this.a = context;
        this.b = vkAuthMetaInfo;
        this.c = izsVar;
        this.d = i8n0Var;
        q55 q55Var = q55.a;
        this.e = q55.c().b;
        this.f = q55.c().c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.vk.superapp.core.api.models.a aVar, final VkAuthState vkAuthState, io.reactivex.rxjava3.disposables.b bVar) {
        gzs vt30Var;
        final gzs gzsVar;
        String str = aVar.q;
        ValidationType validationType = aVar.o;
        int i = a.$EnumSwitchMapping$0[validationType.ordinal()];
        SignUpRouter signUpRouter = this.e;
        gzs<s3q0> gzsVar2 = this.d;
        switch (i) {
            case 1:
                vt30Var = new vt30(this, 7);
                gzsVar = vt30Var;
                if (gzsVar == null) {
                    String str2 = aVar.q;
                    r55 r55Var = r55.a;
                    AuthStatSender c = r55.c();
                    sir0 sir0Var = sir0.a;
                    sir0.e eVar = new sir0.e(str2, null, r55.h().n().a(), true, true, false, false, false, ol90.a(), null, 738);
                    sir0.d dVar = new sir0.d(new v4v(c, 21), new tuq(c, 19), null, null, 12);
                    sir0Var.getClass();
                    io.reactivex.rxjava3.internal.operators.observable.a0 g = sir0.g(eVar, dVar);
                    final String str3 = aVar.s;
                    final String str4 = aVar.q;
                    final boolean z = aVar.H;
                    bVar.b(g.subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.g060
                        @Override // io.reactivex.rxjava3.functions.f
                        public final void accept(Object obj) {
                            sir0.b bVar2;
                            PasskeyCheckInfo passkeyCheckInfo;
                            VkAuthValidatePhoneResult vkAuthValidatePhoneResult = (VkAuthValidatePhoneResult) obj;
                            i060 i060Var = this;
                            gzs<s3q0> gzsVar3 = i060Var.d;
                            if (gzsVar3 != null) {
                                gzsVar3.invoke();
                            }
                            CodeState c2 = ezf.c(vkAuthValidatePhoneResult, (CodeState) gzsVar.invoke());
                            boolean z2 = c2 instanceof CodeState.Passkey;
                            String str5 = str3;
                            String str6 = str4;
                            if (z2) {
                                PasskeyAlternative.a aVar2 = PasskeyAlternative.Companion;
                                boolean z3 = ((CodeState.Passkey) c2).e;
                                aVar2.getClass();
                                PasskeyAlternative a2 = PasskeyAlternative.a.a(z3);
                                PasskeyWebAuthScreen.Companion.getClass();
                                passkeyCheckInfo = new PasskeyCheckInfo(str5, str6, a2, PasskeyWebAuthScreen.a.a(z3), true, false, 32, null);
                                bVar2 = null;
                            } else {
                                String str7 = vkAuthValidatePhoneResult.m;
                                bVar2 = new sir0.b(vkAuthState, str5, str6, c2, z);
                                passkeyCheckInfo = null;
                            }
                            sir0.e(sir0.a, i060Var.e, passkeyCheckInfo, bVar2, null, null, 24);
                        }
                    }, new io.reactivex.rxjava3.functions.f() { // from class: xsna.h060
                        @Override // io.reactivex.rxjava3.functions.f
                        public final void accept(Object obj) {
                            Throwable th = (Throwable) obj;
                            boolean z2 = th instanceof VKApiExecutionException;
                            i060 i060Var = this;
                            if (!z2 || !f35.b((VKApiExecutionException) th)) {
                                izs<wbu0.a, s3q0> izsVar = i060Var.c;
                                if (izsVar != null) {
                                    izsVar.invoke(wbu0.a(i060Var.a, th, false));
                                    return;
                                }
                                return;
                            }
                            gzs<s3q0> gzsVar3 = i060Var.d;
                            if (gzsVar3 != null) {
                                gzsVar3.invoke();
                            }
                            i060Var.e.W0(str3, vkAuthState, str4, (CodeState) gzsVar.invoke(), "", z);
                        }
                    }));
                    return;
                }
                return;
            case 2:
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                String str5 = aVar.s;
                String str6 = aVar.q;
                CodeState.PushWait pushWait = new CodeState.PushWait(System.currentTimeMillis(), 0L, aVar.y, 2, null);
                boolean z2 = aVar.H;
                this.e.W0(str5, vkAuthState, str6, pushWait, aVar.x, z2);
                vt30Var = null;
                gzsVar = vt30Var;
                if (gzsVar == null) {
                }
                break;
            case 3:
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                String str7 = aVar.s;
                String str8 = aVar.q;
                CodeState.SmsWait smsWait = new CodeState.SmsWait(System.currentTimeMillis(), 0L, 0, 6, null);
                CodeState a2 = ezf.a(validationType, smsWait, aVar);
                CodeState.NotReceive notReceive = new CodeState.NotReceive(0L);
                CodeState a3 = ezf.a(aVar.p, smsWait, aVar);
                a3.b = notReceive;
                notReceive.c = a3;
                notReceive.b = a2;
                a2.c = notReceive;
                boolean z3 = aVar.H;
                this.e.W0(str7, vkAuthState, str8, a2, aVar.x, z3);
                vt30Var = null;
                gzsVar = vt30Var;
                if (gzsVar == null) {
                }
                break;
            case 4:
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                String str9 = aVar.s;
                String str10 = aVar.q;
                CodeState.AppWait appWait = new CodeState.AppWait(System.currentTimeMillis(), 6);
                boolean z4 = aVar.H;
                this.e.W0(str9, vkAuthState, str10, appWait, aVar.x, z4);
                vt30Var = null;
                gzsVar = vt30Var;
                if (gzsVar == null) {
                }
                break;
            case 5:
                vt30Var = new uq50(this, 1);
                gzsVar = vt30Var;
                if (gzsVar == null) {
                }
                break;
            case 6:
                VkAuthCredentials Ab = vkAuthState.Ab();
                if (Ab != null) {
                    signUpRouter.P0(new LibverifyScreenData.Auth(Ab.b, aVar.q, aVar.r, null, false, vkAuthState, aVar.s));
                }
                vt30Var = null;
                gzsVar = vt30Var;
                if (gzsVar == null) {
                }
                break;
            case 7:
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                signUpRouter.O0(str, vkAuthState);
                vt30Var = null;
                gzsVar = vt30Var;
                if (gzsVar == null) {
                }
                break;
            case 8:
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                signUpRouter.F0(aVar.n, vkAuthState);
                vt30Var = null;
                gzsVar = vt30Var;
                if (gzsVar == null) {
                }
                break;
            case 9:
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                String str11 = aVar.q;
                com.vk.auth.main.e eVar2 = this.f;
                eVar2.b.o = str11;
                SignUpRouter.a.a(eVar2.c, str11, null, null, this.b, 6);
                vt30Var = null;
                gzsVar = vt30Var;
                if (gzsVar == null) {
                }
                break;
            case 10:
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                String str12 = aVar.s;
                q55 q55Var = q55.a;
                q55.c().a.p = str;
                signUpRouter.H0(str12, str);
                vt30Var = null;
                gzsVar = vt30Var;
                if (gzsVar == null) {
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
