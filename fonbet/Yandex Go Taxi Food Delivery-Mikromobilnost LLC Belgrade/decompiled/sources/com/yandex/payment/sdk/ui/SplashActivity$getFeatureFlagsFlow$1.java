package com.yandex.payment.sdk.ui;

import android.content.SharedPreferences;
import com.yandex.payment.sdk.core.data.AppInfo;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;
import defpackage.bib;
import defpackage.d0a0;
import defpackage.dvw;
import defpackage.hsz;
import defpackage.i3y;
import defpackage.ifr;
import defpackage.j18;
import defpackage.jln;
import defpackage.kd51;
import defpackage.l1g;
import defpackage.md51;
import defpackage.mdh;
import defpackage.mfr;
import defpackage.mj31;
import defpackage.mvg;
import defpackage.n891;
import defpackage.ny61;
import defpackage.ogb1;
import defpackage.pfr;
import defpackage.pwf;
import defpackage.q96;
import defpackage.qmy0;
import defpackage.qs20;
import defpackage.qv90;
import defpackage.rv10;
import defpackage.rwo;
import defpackage.s1r;
import defpackage.sbh;
import defpackage.si3;
import defpackage.sjh;
import defpackage.tse;
import defpackage.u1r;
import defpackage.uyj;
import defpackage.v1r;
import defpackage.vpr;
import defpackage.w0b1;
import defpackage.we51;
import defpackage.wh6;
import defpackage.wj00;
import defpackage.wls;
import defpackage.wwf;
import defpackage.xc8;
import defpackage.xh6;
import defpackage.y22;
import defpackage.y891;
import defpackage.ymx;
import defpackage.zdz;
import defpackage.zy11;
import io.appmetrica.analytics.AppMetrica;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.sdk.ui.SplashActivity$getFeatureFlagsFlow$1", f = "SplashActivity.kt", l = {69, 82}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class SplashActivity$getFeatureFlagsFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SplashActivity this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.payment.sdk.ui.SplashActivity$getFeatureFlagsFlow$1$1", f = "SplashActivity.kt", l = {74}, m = "invokeSuspend", v = 1)
    /* renamed from: com.yandex.payment.sdk.ui.SplashActivity$getFeatureFlagsFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ SplashActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SplashActivity splashActivity, Continuation continuation) {
            super(2, continuation);
            this.this$0 = splashActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x025f  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0262 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0263 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            j18 j18Var;
            Object s;
            q96 q96Var;
            q96 q96Var2;
            int i;
            md51 f;
            q96 q96Var3 = ifr.a;
            q96 q96Var4 = d0a0.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            zy11 zy11Var = zy11.a;
            if (i2 != 0) {
                if (i2 == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            SplashActivity splashActivity = this.this$0;
            mj31 mj31Var = new mj31(splashActivity, (PaymentSdkEnvironment) ((pwf) splashActivity.getBaseComponent$paymentsdk_release()).n.get(), ((pwf) this.this$0.getBaseComponent$paymentsdk_release()).c(), 7);
            qs20 qs20Var = (qs20) ((pwf) this.this$0.getBaseComponent$paymentsdk_release()).k.get();
            AppInfo appInfo = ((pwf) this.this$0.getBaseComponent$paymentsdk_release()).a().getAppInfo();
            SharedPreferences sharedPreferences = (SharedPreferences) ((pwf) this.this$0.getBaseComponent$paymentsdk_release()).C.get();
            rwo c = ((pwf) this.this$0.getBaseComponent$paymentsdk_release()).c();
            y22 y22Var = (y22) ((pwf) this.this$0.getBaseComponent$paymentsdk_release()).t.get();
            this.label = 1;
            i3y i3yVar = (i3y) mj31Var.w;
            j18 j18Var2 = new j18(1, dvw.b(this));
            j18Var2.u();
            try {
                pfr pfrVar = pfr.b;
                pfrVar.a(q96Var4);
                pfrVar.a(q96Var3);
                Iterator it = FeatureFlag.b().iterator();
                while (it.hasNext()) {
                    FeatureFlag featureFlag = (FeatureFlag) it.next();
                    pfr.b.a(new q96(featureFlag.getFlagName(), 1, String.valueOf(featureFlag.getDefaultValue())));
                    it = it;
                    q96Var3 = q96Var3;
                    q96Var4 = q96Var4;
                }
                q96Var = q96Var3;
                q96Var2 = q96Var4;
                v1r v1rVar = (v1r) ((l1g) i3yVar.getValue()).b.get();
                sbh sbhVar = (sbh) ((l1g) i3yVar.getValue()).d.get();
                mfr mfrVar = kd51.a;
                jln jlnVar = v1rVar.a;
                String str = v1rVar.b.c;
                wwf wwfVar = (wwf) jlnVar.b;
                md51 j = ymx.j(w0b1.a((wh6) wwfVar.b, (xh6) wwfVar.c, new xc8(wwfVar, str)), new u1r(v1rVar, 1), null, 5);
                u1r u1rVar = new u1r(v1rVar, 0);
                ymx ymxVar = (ymx) j;
                ymxVar.getClass();
                md51 j2 = ymx.j(ymxVar, u1rVar, null, 5);
                i = 3;
                s1r s1rVar = new s1r(3, sbhVar);
                ymx ymxVar2 = (ymx) j2;
                ymxVar2.getClass();
                n891.d(mfrVar.a(ymx.l(ymxVar2, s1rVar, null, 5)), 500L);
                qv90.a.getClass();
                wj00 wj00Var = new wj00(0);
                wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Получение фичефлагов");
                ((y22) c).a(y891.c("get_feature_flags", wj00Var));
                String packageName = splashActivity.getApplicationContext().getPackageName();
                if (packageName == null) {
                    String appid = appInfo.getAppid();
                    packageName = appid != null ? appid.toLowerCase(Locale.ROOT) : null;
                    if (packageName == null) {
                        packageName = "";
                    }
                }
                String uuid = AppMetrica.getUuid(splashActivity.getApplicationContext());
                f = qs20Var.a.f(new bib(packageName, uuid != null ? uuid : "", 1), new rv10(16), NetworkServiceRetryingStrategy.retryOnce);
                j18Var = j18Var2;
            } catch (Throwable th) {
                th = th;
                j18Var = j18Var2;
            }
            try {
                f.g(new hsz(mj31Var, sharedPreferences, y22Var, c, 1)).h(new si3(j18Var, 19)).b(new qmy0(i, c, j18Var));
                boolean booleanValue = ((Boolean) q96Var.a()).booleanValue();
                LinkedHashMap linkedHashMap = zdz.a;
                String str2 = "xmail_flushEnvVariables " + booleanValue;
                if (((we51) zdz.a.get("default")) != null) {
                    we51.a("generic_info", str2);
                }
                boolean booleanValue2 = ((Boolean) q96Var2.a()).booleanValue();
                String concat = "Флаги загрузились, тестовые флаги ".concat(booleanValue2 ? "включены" : "выключены");
                wj00 wj00Var2 = new wj00(0);
                wj00Var2.i("value", booleanValue2);
                wj00Var2.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
                ((y22) c).a(y891.c("xflags_testBooleanFlagEnabled", wj00Var2));
            } catch (Throwable th2) {
                th = th2;
                LinkedHashMap linkedHashMap2 = zdz.a;
                ogb1.b("Failed to initialize flags: " + th.getMessage());
                j18Var.resumeWith(zy11Var);
                s = j18Var.s();
                if (s != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
                if (s != coroutineSingletons) {
                }
            }
            s = j18Var.s();
            if (s != CoroutineSingletons.COROUTINE_SUSPENDED) {
                s = zy11Var;
            }
            return s != coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashActivity$getFeatureFlagsFlow$1(SplashActivity splashActivity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = splashActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SplashActivity$getFeatureFlagsFlow$1 splashActivity$getFeatureFlagsFlow$1 = new SplashActivity$getFeatureFlagsFlow$1(this.this$0, continuation);
        splashActivity$getFeatureFlagsFlow$1.L$0 = obj;
        return splashActivity$getFeatureFlagsFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplashActivity$getFeatureFlagsFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (defpackage.tje.k0(r9, r2, r8) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.L$0 = vprVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
        return vprVar.emit(zy11Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
