package com.yandex.go.platform.js_api;

import com.yandex.go.platform.js_api.contact.Contact;
import com.yandex.go.platform.js_api.models.JsContacts;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sbx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.js_api.JsNativeApi$selectContacts$1", f = "JsNativeApi.kt", l = {MSException.ERROR_NO_MORE_ITEMS}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class JsNativeApi$selectContacts$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ JsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsNativeApi$selectContacts$1(JsNativeApi jsNativeApi, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jsNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsNativeApi$selectContacts$1(this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JsNativeApi$selectContacts$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.platform.js_api.contact.b bVar = this.this$0.c;
            this.label = 1;
            b = bVar.b(this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        JsNativeApi jsNativeApi = this.this$0;
        String str = this.$promiseId;
        Throwable a = Result.a(b);
        if (a != null) {
            String localizedMessage = a.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "Failed to select contacts";
            }
            jsNativeApi.f("goplatform.app.contacts.choose", str, localizedMessage);
        }
        JsNativeApi jsNativeApi2 = this.this$0;
        String str2 = this.$promiseId;
        if (!(b instanceof Result.Failure)) {
            JsContacts jsContacts = new JsContacts(Collections.singletonList((Contact) b));
            sbx.d.getClass();
            jsNativeApi2.e("goplatform.app.contacts.choose", str2, jsContacts, JsContacts.Companion.serializer(), false);
        }
        return zy11.a;
    }
}
