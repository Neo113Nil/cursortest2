package com.yandex.go.platform.js_api;

import com.yandex.go.platform.sdk.models.WebAccountType;
import defpackage.auu0;
import defpackage.fk;
import defpackage.gk;
import defpackage.kj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sbx;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.am.GoAccountType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.js_api.JsNativeApi$getAccountType$1", f = "JsNativeApi.kt", l = {347}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class JsNativeApi$getAccountType$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ JsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsNativeApi$getAccountType$1(JsNativeApi jsNativeApi, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jsNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsNativeApi$getAccountType$1(this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JsNativeApi$getAccountType$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fk fkVar = this.this$0.e;
            this.label = 1;
            kj Ig = ((com.yandex.taxi.go_platform.delegates.a) fkVar).a.a.Ig();
            GoAccountType goAccountType = Ig != null ? Ig.c : null;
            int i2 = goAccountType == null ? -1 : gk.a[goAccountType.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    obj = WebAccountType.YANDEX;
                } else if (i2 == 2) {
                    obj = WebAccountType.LITE;
                } else if (i2 == 3) {
                    obj = WebAccountType.PHONISH;
                } else if (i2 == 4) {
                    obj = WebAccountType.SOCIAL;
                } else if (i2 != 5) {
                    w511.b();
                    return null;
                }
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            obj = WebAccountType.NONE;
            if (obj == coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        String lowerCase = ((WebAccountType) obj).name().toLowerCase(Locale.ROOT);
        JsNativeApi jsNativeApi = this.this$0;
        String str = this.$promiseId;
        sbx.d.getClass();
        jsNativeApi.e("goplatform.private.portalAuth.getAccountType", str, lowerCase, auu0.a, false);
        return zy11.a;
    }
}
