package com.yandex.passport.internal.links;

import android.net.Uri;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.c9;
import com.yandex.passport.internal.report.d9;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.reporters.e0;
import com.yandex.passport.internal.report.x8;
import com.yandex.passport.internal.report.yd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.links.LinkHandlingViewModel$launchPayUrl$1", f = "LinkHandlingViewModel.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class LinkHandlingViewModel$launchPayUrl$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $browser;
    final /* synthetic */ LoginProperties $loginProperties;
    final /* synthetic */ ModernAccount $preferredAccount;
    final /* synthetic */ Uri $uri;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkHandlingViewModel$launchPayUrl$1(g gVar, Uri uri, ModernAccount modernAccount, LoginProperties loginProperties, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$uri = uri;
        this.$preferredAccount = modernAccount;
        this.$loginProperties = loginProperties;
        this.$browser = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LinkHandlingViewModel$launchPayUrl$1(this.this$0, this.$uri, this.$preferredAccount, this.$loginProperties, this.$browser, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LinkHandlingViewModel$launchPayUrl$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Uri uri;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                e0 e0Var = this.this$0.C;
                Uri uri2 = this.$uri;
                e0Var.getClass();
                e0Var.f(c9.w, new jd(uri2));
                String queryParameter = this.$uri.getQueryParameter("pay_session_id");
                String str2 = "";
                if (queryParameter == null) {
                    queryParameter = "";
                }
                String queryParameter2 = this.$uri.getQueryParameter("pay_url");
                if (queryParameter2 != null) {
                    str2 = queryParameter2;
                }
                Uri parse = Uri.parse(str2);
                g.a0(this.this$0, parse);
                com.yandex.passport.internal.report.g gVar = this.this$0.H;
                gVar.getClass();
                gVar.d = new com.yandex.passport.internal.report.f("pay_session_id", queryParameter);
                g gVar2 = this.this$0;
                ModernAccount modernAccount = this.$preferredAccount;
                LoginProperties loginProperties = this.$loginProperties;
                this.L$0 = queryParameter;
                this.L$1 = parse;
                this.label = 1;
                Object b0 = g.b0(gVar2, modernAccount, loginProperties, this);
                if (b0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = queryParameter;
                obj = b0;
                uri = parse;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uri = (Uri) this.L$1;
                str = (String) this.L$0;
                kotlin.b.b(obj);
            }
            e0 e0Var2 = this.this$0.C;
            e0Var2.getClass();
            e0Var2.h(d9.w);
            this.this$0.J.m(new b(uri, (ModernAccount) obj, str, this.$browser));
        } catch (Exception e) {
            e0 e0Var3 = this.this$0.C;
            e0Var3.getClass();
            e0Var3.f(x8.w, new yd(e));
        }
        return zy11.a;
    }
}
