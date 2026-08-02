package com.yandex.messaging.internal.view.input;

import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.messaging.views.KeyboardAwareEmojiEditText;
import defpackage.d1w;
import defpackage.evu0;
import defpackage.j3b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.uqq0;
import defpackage.wls;
import defpackage.wwg0;
import defpackage.x22;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luqq0;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Luqq0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.input.StarInputController$onAttach$2", f = "StarInputController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class StarInputController$onAttach$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarInputController$onAttach$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StarInputController$onAttach$2 starInputController$onAttach$2 = new StarInputController$onAttach$2(this.this$0, continuation);
        starInputController$onAttach$2.L$0 = obj;
        return starInputController$onAttach$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        StarInputController$onAttach$2 starInputController$onAttach$2 = (StarInputController$onAttach$2) create((uqq0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        starInputController$onAttach$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        uqq0 uqq0Var = (uqq0) this.L$0;
        e eVar = this.this$0;
        boolean z = uqq0Var.a;
        if (z) {
            KeyboardAwareEmojiEditText keyboardAwareEmojiEditText = eVar.f;
            if (keyboardAwareEmojiEditText == null) {
                keyboardAwareEmojiEditText = null;
            }
            if (!evu0.J(keyboardAwareEmojiEditText.getEditableText())) {
                eVar.h = true;
            }
        }
        KeyboardAwareEmojiEditText keyboardAwareEmojiEditText2 = eVar.f;
        if (keyboardAwareEmojiEditText2 == null) {
            keyboardAwareEmojiEditText2 = null;
        }
        keyboardAwareEmojiEditText2.setBackgroundResource(z ? wwg0.msg_bg_chat_input_starred : wwg0.msg_bg_chat_input);
        eVar.a().c.a(false);
        if (eVar.d()) {
            d a = eVar.a();
            tje.N(a.b, null, null, new StarBrick$showTooltip$1(a, null), 3);
        }
        x22 x22Var = eVar.b;
        Pair pair = new Pair(BackendConfig.Restrictions.ENABLED, z ? "on" : "off");
        d1w d1wVar = eVar.g;
        if (d1wVar == null) {
            d1wVar = null;
        }
        j3b j3bVar = d1wVar.b.j0;
        x22Var.reportEvent("star pressed", kotlin.collections.b.i(pair, new Pair("chatId", j3bVar != null ? j3bVar.b : null)));
        return zy11.a;
    }
}
