package com.yandex.go.business.impl.domain;

import com.yandex.go.business.impl.experiment.YangoBusinessExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.experiments.q;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.business.impl.domain.YangoBusinessInteractorImpl$yangoBusinessUrl$2", f = "YangoBusinessInteractorImpl.kt", l = {38, 41}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class YangoBusinessInteractorImpl$yangoBusinessUrl$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YangoBusinessInteractorImpl$yangoBusinessUrl$2(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YangoBusinessInteractorImpl$yangoBusinessUrl$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YangoBusinessInteractorImpl$yangoBusinessUrl$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            q qVar = (q) this.this$0.c.getValue();
            this.label = 1;
            obj = qVar.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.L$0;
                kotlin.b.b(obj);
                WebViewFromDeeplinkExperiment webViewFromDeeplinkExperiment = (WebViewFromDeeplinkExperiment) obj;
                WebViewFromDeeplinkExperiment.a a = webViewFromDeeplinkExperiment == null ? webViewFromDeeplinkExperiment.a(str) : null;
                String str2 = a != null ? a.b : null;
                return str2 != null ? "" : str2;
            }
            kotlin.b.b(obj);
        }
        String str3 = ((YangoBusinessExperiment) obj).d;
        f fVar = new f(this.this$0.a.a.a());
        this.L$0 = str3;
        this.label = 2;
        Object A = kotlinx.coroutines.flow.e.A(fVar, this);
        if (A != coroutineSingletons) {
            obj = A;
            str = str3;
            WebViewFromDeeplinkExperiment webViewFromDeeplinkExperiment2 = (WebViewFromDeeplinkExperiment) obj;
            if (webViewFromDeeplinkExperiment2 == null) {
            }
            if (a != null) {
            }
            if (str2 != null) {
            }
        }
        return coroutineSingletons;
    }
}
