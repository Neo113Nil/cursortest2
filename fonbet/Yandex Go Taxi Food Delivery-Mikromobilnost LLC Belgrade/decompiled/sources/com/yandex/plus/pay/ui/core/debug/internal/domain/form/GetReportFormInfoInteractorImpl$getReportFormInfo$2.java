package com.yandex.plus.pay.ui.core.debug.internal.domain.form;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.ebd0;
import defpackage.gct;
import defpackage.j73;
import defpackage.k2j0;
import defpackage.l2j0;
import defpackage.m2j0;
import defpackage.mvg;
import defpackage.n2j0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.startup.StartupRequest;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ln2j0;", "<anonymous>", "(Ltse;)Ln2j0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.core.debug.internal.domain.form.GetReportFormInfoInteractorImpl$getReportFormInfo$2", f = "GetReportFormInfoInteractorImpl.kt", l = {53, 54}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class GetReportFormInfoInteractorImpl$getReportFormInfo$2 extends SuspendLambda implements wls {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetReportFormInfoInteractorImpl$getReportFormInfo$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetReportFormInfoInteractorImpl$getReportFormInfo$2 getReportFormInfoInteractorImpl$getReportFormInfo$2 = new GetReportFormInfoInteractorImpl$getReportFormInfo$2(this.this$0, continuation);
        getReportFormInfoInteractorImpl$getReportFormInfo$2.L$0 = obj;
        return getReportFormInfoInteractorImpl$getReportFormInfo$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetReportFormInfoInteractorImpl$getReportFormInfo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        if (defpackage.vng.y(r3) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01c2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        m2j0[] m2j0VarArr;
        int i;
        Object s;
        String str;
        String str2;
        m2j0[] m2j0VarArr2;
        int i2;
        Object k;
        m2j0[] m2j0VarArr3;
        m2j0[] m2j0VarArr4;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            b.b(obj);
            Context a = this.this$0.d.a();
            h = tje.h(tseVar, null, null, new GetReportFormInfoInteractorImpl$getReportFormInfo$2$screenshotDataUrl$1(this.this$0, a, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new GetReportFormInfoInteractorImpl$getReportFormInfo$2$logsDataUrl$1(this.this$0, null), 3);
            int i4 = gct.a[((PlusTheme) this.this$0.e.invoke()).ordinal()];
            String str3 = "dark";
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        w511.b();
                        return null;
                    }
                }
                str3 = "light";
            }
            String uri = Uri.parse("https://forms.yandex-team.ru/ext/surveys/13754011/?iframe=1").buildUpon().appendQueryParameter("platform", ConstantDeviceInfo.APP_PLATFORM).appendQueryParameter(DivkitThemeChangeListener.THEME_VARIABLE_NAME, str3).build().toString();
            m2j0VarArr = new m2j0[11];
            m2j0VarArr[0] = new l2j0("puid", String.valueOf(this.this$0.a.a));
            m2j0VarArr[1] = new l2j0(MetaDataField.DEVICE_ID_FIELD, String.valueOf(this.this$0.a.b));
            ebd0 ebd0Var = this.this$0.a;
            m2j0VarArr[2] = new l2j0(StartupRequest.PARAM_APP_VERSION, ebd0Var.c);
            m2j0VarArr[3] = new l2j0("sdk_version", "110.0.2");
            m2j0VarArr[4] = new l2j0("os_version", Build.VERSION.RELEASE);
            m2j0VarArr[5] = new l2j0(Constants.KEY_SERVICE, ebd0Var.d);
            m2j0VarArr[6] = new l2j0(WebViewActivity.KEY_ENVIRONMENT, ebd0Var.e.name().toLowerCase(Locale.ROOT));
            m2j0VarArr[7] = new l2j0(CommonUrlParts.APP_ID, a.getApplicationInfo().packageName);
            m2j0VarArr[8] = new l2j0("active_flags", kotlin.collections.a.X(this.this$0.a.f, Extension.FIX_SPACE, null, null, null, 62));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = null;
            this.L$4 = m2j0VarArr;
            this.L$5 = uri;
            this.L$6 = m2j0VarArr;
            this.L$7 = "logs";
            i = 9;
            this.I$0 = 9;
            this.label = 1;
            s = h2.s(this);
            if (s != coroutineSingletons) {
                str = "logs";
                str2 = uri;
                m2j0VarArr2 = m2j0VarArr;
            }
            return coroutineSingletons;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.I$0;
            m2j0VarArr3 = (m2j0[]) this.L$6;
            str2 = (String) this.L$5;
            m2j0VarArr4 = (m2j0[]) this.L$4;
            b.b(obj);
            k = obj;
            String str4 = (String) k;
            m2j0VarArr3[i2] = str4 != null ? new k2j0("files", str4, "screenshot.png") : null;
            return new n2j0(str2, j73.A(m2j0VarArr4));
        }
        int i5 = this.I$0;
        String str5 = (String) this.L$7;
        m2j0[] m2j0VarArr5 = (m2j0[]) this.L$6;
        String str6 = (String) this.L$5;
        m2j0[] m2j0VarArr6 = (m2j0[]) this.L$4;
        h = (noh) this.L$2;
        b.b(obj);
        str = str5;
        str2 = str6;
        m2j0VarArr2 = m2j0VarArr5;
        m2j0VarArr = m2j0VarArr6;
        i = i5;
        s = obj;
        m2j0VarArr2[i] = new k2j0(str, (String) s, "logs.txt");
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = m2j0VarArr;
        this.L$5 = str2;
        this.L$6 = m2j0VarArr;
        this.L$7 = null;
        i2 = 10;
        this.I$0 = 10;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            m2j0VarArr3 = m2j0VarArr;
            m2j0VarArr4 = m2j0VarArr3;
            String str42 = (String) k;
            m2j0VarArr3[i2] = str42 != null ? new k2j0("files", str42, "screenshot.png") : null;
            return new n2j0(str2, j73.A(m2j0VarArr4));
        }
        return coroutineSingletons;
    }
}
