package com.yandex.passport.internal.account;

import com.yandex.passport.api.exception.PassportCredentialsNotFoundException;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.entities.UserCredentials;
import com.yandex.passport.internal.network.response.AuthMethod;
import com.yandex.passport.internal.usecase.authorize.i;
import com.yandex.passport.internal.usecase.authorize.j;
import com.yandex.passport.internal.usecase.m1;
import com.yandex.passport.internal.usecase.n1;
import com.yandex.passport.internal.util.p;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/internal/ModernAccount;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.account.LoginController$authorizeByCredentials$2", f = "LoginController.kt", l = {MSException.ERROR_INVALID_PARAMETER, 104}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class LoginController$authorizeByCredentials$2 extends SuspendLambda implements wls {
    final /* synthetic */ AnalyticsFromValue $analyticsFromValue;
    final /* synthetic */ String $applicationPackageName;
    final /* synthetic */ String $applicationVersion;
    final /* synthetic */ String $captchaAnswer;
    final /* synthetic */ UserCredentials $credentials;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginController$authorizeByCredentials$2(UserCredentials userCredentials, c cVar, String str, String str2, String str3, AnalyticsFromValue analyticsFromValue, Continuation continuation) {
        super(2, continuation);
        this.$credentials = userCredentials;
        this.this$0 = cVar;
        this.$applicationPackageName = str;
        this.$applicationVersion = str2;
        this.$captchaAnswer = str3;
        this.$analyticsFromValue = analyticsFromValue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginController$authorizeByCredentials$2(this.$credentials, this.this$0, this.$applicationPackageName, this.$applicationVersion, this.$captchaAnswer, this.$analyticsFromValue, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginController$authorizeByCredentials$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PassportEnvironmentImpl environment;
        Object a;
        String str;
        com.yandex.passport.internal.network.client.a aVar;
        int i;
        ClientCredentials clientCredentials;
        int i2;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.b.b(obj);
            environment = this.$credentials.getEnvironment();
            com.yandex.passport.internal.network.client.a a2 = this.this$0.a.a(p.u(environment));
            String login = this.$credentials.getLogin();
            com.yandex.passport.internal.properties.p pVar = this.this$0.c;
            Environment u = p.u(environment);
            ClientCredentials r = pVar.r(u);
            if (r == null) {
                throw new PassportCredentialsNotFoundException(p.y(u));
            }
            n1 n1Var = this.this$0.i;
            m1 m1Var = new m1(null, p.u(environment));
            this.L$0 = environment;
            this.L$1 = a2;
            this.L$2 = login;
            this.L$3 = r;
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 1;
            a = n1Var.a(m1Var, this);
            if (a != coroutineSingletons) {
                str = login;
                aVar = a2;
                i = 0;
                clientCredentials = r;
                i2 = 0;
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i4 = this.I$1;
        int i5 = this.I$0;
        ClientCredentials clientCredentials2 = (ClientCredentials) this.L$3;
        String str3 = (String) this.L$2;
        com.yandex.passport.internal.network.client.a aVar2 = (com.yandex.passport.internal.network.client.a) this.L$1;
        environment = (PassportEnvironmentImpl) this.L$0;
        kotlin.b.b(obj);
        str = str3;
        aVar = aVar2;
        clientCredentials = clientCredentials2;
        i2 = i5;
        i = i4;
        a = obj;
        PassportEnvironmentImpl passportEnvironmentImpl = environment;
        boolean z = i2 != 0;
        boolean z2 = i != 0;
        Object value = ((Result) a).getValue();
        kotlin.b.b(value);
        com.yandex.passport.internal.network.response.f o = aVar.o(str, z, z2, clientCredentials, (String) value, this.$applicationPackageName, this.$applicationVersion);
        boolean z3 = o.a;
        String str4 = o.c;
        ArrayList arrayList = o.e;
        if (!z3 || str4 == null || !arrayList.contains(AuthMethod.PASSWORD)) {
            List list = o.f;
            if (list == null || (str2 = (String) list.get(0)) == null) {
                str2 = "start failed";
            }
            throw new FailedResponseException(str2);
        }
        j jVar = this.this$0.g;
        i iVar = new i(p.u(passportEnvironmentImpl), str4, this.$credentials.getPassword(), this.$credentials.getAvatarUrl(), this.$captchaAnswer, this.$analyticsFromValue);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        Object a3 = jVar.a(iVar, this);
        return a3 == coroutineSingletons ? coroutineSingletons : a3;
    }
}
