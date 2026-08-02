package com.yandex.passport.internal.links;

import android.net.Uri;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.reporters.LinkHandlingReporter$UidFrom;
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
@mvg(c = "com.yandex.passport.internal.links.LinkHandlingViewModel$launchQrWithoutQr$1", f = "LinkHandlingViewModel.kt", l = {141}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class LinkHandlingViewModel$launchQrWithoutQr$1 extends SuspendLambda implements wls {
    final /* synthetic */ ModernAccount $accountWithMachineReadableLogin;
    final /* synthetic */ String $browser;
    final /* synthetic */ ModernAccount $currentAccount;
    final /* synthetic */ LoginProperties $loginProperties;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkHandlingViewModel$launchQrWithoutQr$1(g gVar, ModernAccount modernAccount, ModernAccount modernAccount2, LoginProperties loginProperties, Uri uri, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$accountWithMachineReadableLogin = modernAccount;
        this.$currentAccount = modernAccount2;
        this.$loginProperties = loginProperties;
        this.$uri = uri;
        this.$browser = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LinkHandlingViewModel$launchQrWithoutQr$1(this.this$0, this.$accountWithMachineReadableLogin, this.$currentAccount, this.$loginProperties, this.$uri, this.$browser, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LinkHandlingViewModel$launchQrWithoutQr$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0;
            ModernAccount modernAccount = this.$accountWithMachineReadableLogin;
            if (modernAccount == null) {
                modernAccount = this.$currentAccount;
            }
            LoginProperties loginProperties = this.$loginProperties;
            this.label = 1;
            obj = g.b0(gVar, modernAccount, loginProperties, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ModernAccount modernAccount2 = (ModernAccount) obj;
        this.this$0.J.m(new d(this.$uri, modernAccount2, this.$browser, this.$accountWithMachineReadableLogin != null ? LinkHandlingReporter$UidFrom.ACCOUNT_WITH_MACHINE_READABLE_LOGIN : this.$currentAccount != null ? LinkHandlingReporter$UidFrom.CURRENT_ACCOUNT : modernAccount2 != null ? LinkHandlingReporter$UidFrom.AUTOLOGIN : LinkHandlingReporter$UidFrom.EMPTY));
        return zy11.a;
    }
}
