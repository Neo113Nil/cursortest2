package com.yandex.passport.sloth.ui;

import android.webkit.JavascriptInterface;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.sloth.ui.webview.WebViewController;
import defpackage.b64;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class SlothJsApi {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/passport/sloth/ui/SlothJsApi$WebAmJsInterface;", "", "Ltse;", "coroutineScope", "Lcom/yandex/passport/sloth/ui/b1;", "interactor", "Lcom/yandex/passport/sloth/ui/webview/WebViewController;", "webViewController", "<init>", "(Ltse;Lcom/yandex/passport/sloth/ui/b1;Lcom/yandex/passport/sloth/ui/webview/WebViewController;)V", "", "payload", "Lzy11;", "processRequest", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "json", "send", "(Ljava/lang/String;)V", "Ltse;", "Lcom/yandex/passport/sloth/ui/b1;", "Lcom/yandex/passport/sloth/ui/webview/WebViewController;", "passport-sloth-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WebAmJsInterface {
        private final tse coroutineScope;
        private final b1 interactor;
        private final WebViewController webViewController;

        public WebAmJsInterface(tse tseVar, b1 b1Var, WebViewController webViewController) {
            this.coroutineScope = tseVar;
            this.interactor = b1Var;
            this.webViewController = webViewController;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object processRequest(String str, Continuation<? super zy11> continuation) {
            SlothJsApi$WebAmJsInterface$processRequest$1 slothJsApi$WebAmJsInterface$processRequest$1;
            int i;
            String str2;
            if (continuation instanceof SlothJsApi$WebAmJsInterface$processRequest$1) {
                slothJsApi$WebAmJsInterface$processRequest$1 = (SlothJsApi$WebAmJsInterface$processRequest$1) continuation;
                int i2 = slothJsApi$WebAmJsInterface$processRequest$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    slothJsApi$WebAmJsInterface$processRequest$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = slothJsApi$WebAmJsInterface$processRequest$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = slothJsApi$WebAmJsInterface$processRequest$1.label;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (!this.webViewController.getIsDestroyed()) {
                            b1 b1Var = this.interactor;
                            slothJsApi$WebAmJsInterface$processRequest$1.L$0 = this;
                            slothJsApi$WebAmJsInterface$processRequest$1.L$1 = str;
                            slothJsApi$WebAmJsInterface$processRequest$1.label = 1;
                            obj = ((com.yandex.passport.sloth.b1) b1Var).d(str, slothJsApi$WebAmJsInterface$processRequest$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11Var;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) slothJsApi$WebAmJsInterface$processRequest$1.L$1;
                    this = (WebAmJsInterface) slothJsApi$WebAmJsInterface$processRequest$1.L$0;
                    kotlin.b.b(obj);
                    LogLevel logLevel = LogLevel.DEBUG;
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(logLevel, null, b64.l("performJsCommand(", str, ") resulted in ", (String) obj), 10);
                    }
                    str2 = (String) obj;
                    if (str2 != null) {
                        this.webViewController.execJsAsync(str2);
                    }
                    return zy11Var;
                }
            }
            slothJsApi$WebAmJsInterface$processRequest$1 = new SlothJsApi$WebAmJsInterface$processRequest$1(this, continuation);
            Object obj2 = slothJsApi$WebAmJsInterface$processRequest$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = slothJsApi$WebAmJsInterface$processRequest$1.label;
            zy11 zy11Var2 = zy11.a;
            if (i != 0) {
            }
            LogLevel logLevel2 = LogLevel.DEBUG;
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            }
            str2 = (String) obj2;
            if (str2 != null) {
            }
            return zy11Var2;
        }

        @JavascriptInterface
        public final void send(String json2) {
            tje.N(this.coroutineScope, null, null, new SlothJsApi$WebAmJsInterface$send$1(this, json2, null), 3);
        }
    }
}
