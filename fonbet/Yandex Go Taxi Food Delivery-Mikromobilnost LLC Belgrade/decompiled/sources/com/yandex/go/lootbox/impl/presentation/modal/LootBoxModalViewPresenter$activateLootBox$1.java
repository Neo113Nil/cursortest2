package com.yandex.go.lootbox.impl.presentation.modal;

import com.yandex.go.lootbox.api.domain.entities.lootbox.animation_type.LootBoxAnimationType;
import com.yandex.go.lootbox.impl.domain.interactors.animation.e;
import defpackage.jst;
import defpackage.lqz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppz;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lootbox.impl.presentation.modal.LootBoxModalViewPresenter$activateLootBox$1", f = "LootBoxModalViewPresenter.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LootBoxModalViewPresenter$activateLootBox$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $animationId;
    final /* synthetic */ String $lootBoxId;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LootBoxModalViewPresenter$activateLootBox$1(c cVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$animationId = str;
        this.$lootBoxId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LootBoxModalViewPresenter$activateLootBox$1(this.this$0, this.$animationId, this.$lootBoxId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LootBoxModalViewPresenter$activateLootBox$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.yandex.go.lootbox.impl.presentation.modal.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            final c cVar = this.this$0;
            e eVar = cVar.A;
            String str = this.$animationId;
            LootBoxAnimationType lootBoxAnimationType = LootBoxAnimationType.LOADING;
            ?? r6 = new sls() { // from class: com.yandex.go.lootbox.impl.presentation.modal.a
                @Override // defpackage.sls
                public final Object invoke() {
                    c cVar2 = c.this;
                    tje.N(cVar2.Jg(), null, null, new LootBoxModalViewPresenter$activateLootBox$1$animationInputStream$1$1(cVar2, null), 3);
                    return zy11.a;
                }
            };
            this.label = 1;
            obj = eVar.d(str, lootBoxAnimationType, r6, this);
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
        InputStream inputStream = (InputStream) obj;
        if (inputStream != null) {
            final c cVar2 = this.this$0;
            final String str2 = this.$lootBoxId;
            final String str3 = this.$animationId;
            ((lqz) cVar2.Dg()).showLoadingLottie(inputStream);
            tje.N(cVar2.Jg(), null, null, new LootBoxModalViewPresenter$activate$1(cVar2, str2, new tls() { // from class: com.yandex.go.lootbox.impl.presentation.modal.b
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    c cVar3 = c.this;
                    tje.N(cVar3.Jg(), null, null, new LootBoxModalViewPresenter$activateLootBox$1$1$1$1(cVar3, str3, (ppz) obj2, str2, null), 3);
                    return zy11.a;
                }
            }, null), 3);
        } else {
            String str4 = this.$lootBoxId;
            c cVar3 = this.this$0;
            jst.e.q("Could not find animation = " + str4);
            c.Kg(cVar3);
        }
        return zy11.a;
    }
}
