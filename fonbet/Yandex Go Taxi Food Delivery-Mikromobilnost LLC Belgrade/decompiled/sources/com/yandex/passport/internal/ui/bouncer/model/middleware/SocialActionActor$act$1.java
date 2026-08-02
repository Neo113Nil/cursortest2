package com.yandex.passport.internal.ui.bouncer.model.middleware;

import android.net.Uri;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.ui.AppTheme;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.social.esia.EsiaInternalBindProperties;
import com.yandex.passport.internal.ui.bouncer.model.SocialContentData;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/h0;", "action", "Lcom/yandex/passport/internal/ui/bouncer/model/s1;", "loginState", "Lcom/yandex/passport/internal/ui/bouncer/model/g0;", "<anonymous>", "(Lcom/yandex/passport/internal/ui/bouncer/model/h0;Lcom/yandex/passport/internal/ui/bouncer/model/s1;)Lcom/yandex/passport/internal/ui/bouncer/model/g0;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.SocialActionActor$act$1", f = "SocialActionActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SocialActionActor$act$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ e1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialActionActor$act$1(e1 e1Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = e1Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SocialActionActor$act$1 socialActionActor$act$1 = new SocialActionActor$act$1(this.this$0, (Continuation) obj3);
        socialActionActor$act$1.L$0 = (com.yandex.passport.internal.ui.bouncer.model.h0) obj;
        socialActionActor$act$1.L$1 = (s1) obj2;
        return socialActionActor$act$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Environment environment;
        AppTheme appTheme;
        PassportTheme theme;
        Filter filter;
        PassportEnvironmentImpl primaryEnvironment;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        LoginProperties loginProperties = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.internal.ui.bouncer.model.h0 h0Var = (com.yandex.passport.internal.ui.bouncer.model.h0) this.L$0;
        s1 s1Var = (s1) this.L$1;
        String str = h0Var.a;
        String str2 = h0Var.c;
        String str3 = h0Var.b;
        if (!jl40.l(str, "esia")) {
            e1 e1Var = this.this$0;
            Uri parse = Uri.parse(str3);
            String str4 = this.this$0.a.getPackageName() + ".passport://social";
            e1Var.getClass();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            for (String str5 : parse.getQueryParameterNames()) {
                if (!jl40.l(str5, "retpath")) {
                    clearQuery.appendQueryParameter(str5, parse.getQueryParameter(str5));
                }
                clearQuery.appendQueryParameter("retpath", str4);
            }
            return new com.yandex.passport.internal.ui.bouncer.model.g0(new SocialContentData.BrowserOnly(clearQuery.build(), Uri.parse(str2)));
        }
        LoginProperties loginProperties2 = s1Var.c;
        if (loginProperties2 == null) {
            com.yandex.passport.internal.ui.bouncer.model.g1 g1Var = s1Var.d;
            if (g1Var != null) {
                loginProperties = g1Var.a;
            }
        } else {
            loginProperties = loginProperties2;
        }
        if (loginProperties == null || (filter = loginProperties.getFilter()) == null || (primaryEnvironment = filter.getPrimaryEnvironment()) == null || (environment = com.yandex.passport.internal.util.p.u(primaryEnvironment)) == null) {
            environment = Environment.PRODUCTION;
        }
        LoginProperties loginProperties3 = s1Var.c;
        if (loginProperties3 == null || (theme = loginProperties3.getTheme()) == null || (appTheme = com.yandex.passport.internal.util.p.t(theme)) == null) {
            appTheme = AppTheme.FOLLOW_SYSTEM;
        }
        return new com.yandex.passport.internal.ui.bouncer.model.g0(new SocialContentData.EsiaApp2App(new EsiaInternalBindProperties.UserUnknownRequest(str3, environment, appTheme), Uri.parse(str2)));
    }
}
