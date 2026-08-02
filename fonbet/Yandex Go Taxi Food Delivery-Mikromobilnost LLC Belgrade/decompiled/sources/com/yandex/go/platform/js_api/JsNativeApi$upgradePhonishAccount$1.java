package com.yandex.go.platform.js_api;

import com.yandex.go.platform.js_api.models.JsUpgradePhonishAccountOptions;
import com.yandex.go.platform.sdk.models.PhonishUpgradeResult;
import defpackage.auu0;
import defpackage.fk;
import defpackage.g0c;
import defpackage.lfx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.sbx;
import defpackage.tse;
import defpackage.wls;
import defpackage.za21;
import defpackage.zy11;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.js_api.JsNativeApi$upgradePhonishAccount$1", f = "JsNativeApi.kt", l = {356}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class JsNativeApi$upgradePhonishAccount$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ JsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsNativeApi$upgradePhonishAccount$1(JsNativeApi jsNativeApi, String str, Continuation continuation, String[] strArr) {
        super(2, continuation);
        this.$params = strArr;
        this.this$0 = jsNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsNativeApi$upgradePhonishAccount$1(this.this$0, this.$promiseId, continuation, this.$params);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JsNativeApi$upgradePhonishAccount$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String[] strArr = this.$params;
            boolean z = false;
            String str = strArr.length - 1 >= 0 ? strArr[0] : "";
            KSerializer serializer = JsUpgradePhonishAccountOptions.Companion.serializer();
            lfx[] lfxVarArr = {qoi0.a(IllegalArgumentException.class)};
            try {
                failure = sbx.d.b(serializer, str);
            } catch (Exception e) {
                if (!((g0c) lfxVarArr[0]).e(e)) {
                    throw e;
                }
                failure = new Result.Failure(e);
            }
            JsUpgradePhonishAccountOptions jsUpgradePhonishAccountOptions = (JsUpgradePhonishAccountOptions) (failure instanceof Result.Failure ? null : failure);
            fk fkVar = this.this$0.e;
            JsUpgradePhonishAccountOptions.Companion.getClass();
            if (jsUpgradePhonishAccountOptions != null && jsUpgradePhonishAccountOptions.a) {
                z = true;
            }
            za21 za21Var = new za21(z);
            this.label = 1;
            obj = ((com.yandex.taxi.go_platform.delegates.a) fkVar).f(za21Var, this);
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
        JsNativeApi jsNativeApi = this.this$0;
        String str2 = this.$promiseId;
        String lowerCase = ((PhonishUpgradeResult) obj).name().toLowerCase(Locale.ROOT);
        sbx.d.getClass();
        jsNativeApi.e("goplatform.private.portalAuth.upgradePhonishAccount", str2, lowerCase, auu0.a, false);
        return zy11.a;
    }
}
