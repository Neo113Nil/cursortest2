package com.yandex.messaging.input.bricks.writing;

import android.content.SharedPreferences;
import com.squareup.moshi.JsonAdapter;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.input.bricks.writing.InputDraftController$save$1", f = "InputDraftController.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class InputDraftController$save$1 extends SuspendLambda implements wls {
    final /* synthetic */ InputDraft $draft;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputDraftController$save$1(b bVar, InputDraft inputDraft, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$draft = inputDraft;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InputDraftController$save$1(this.this$0, this.$draft, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InputDraftController$save$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh qohVar = this.this$0.f;
            this.label = 1;
            obj = qohVar.s(this);
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
        String str = (String) obj;
        b bVar = this.this$0;
        SharedPreferences sharedPreferences = bVar.a;
        InputDraft inputDraft = this.$draft;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (inputDraft.isEmpty()) {
            edit.remove(str);
        } else {
            edit.putString(str, ((JsonAdapter) bVar.e.b).toJson(inputDraft));
        }
        edit.apply();
        return zy11.a;
    }
}
