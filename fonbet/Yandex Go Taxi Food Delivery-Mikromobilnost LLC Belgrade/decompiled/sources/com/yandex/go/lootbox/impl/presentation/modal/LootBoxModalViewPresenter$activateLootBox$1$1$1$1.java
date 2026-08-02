package com.yandex.go.lootbox.impl.presentation.modal;

import com.yandex.go.lootbox.api.domain.entities.lootbox.animation_type.LootBoxAnimationType;
import com.yandex.go.lootbox.impl.domain.interactors.animation.e;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.LootBoxAnimationInfo;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppz;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lootbox.impl.presentation.modal.LootBoxModalViewPresenter$activateLootBox$1$1$1$1", f = "LootBoxModalViewPresenter.kt", l = {103, 104}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LootBoxModalViewPresenter$activateLootBox$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $animationId;
    final /* synthetic */ ppz $content;
    final /* synthetic */ String $lootBoxId;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LootBoxModalViewPresenter$activateLootBox$1$1$1$1(c cVar, String str, ppz ppzVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$animationId = str;
        this.$content = ppzVar;
        this.$lootBoxId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LootBoxModalViewPresenter$activateLootBox$1$1$1$1(this.this$0, this.$animationId, this.$content, this.$lootBoxId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LootBoxModalViewPresenter$activateLootBox$1$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        if (r13 == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InputStream inputStream;
        LootBoxAnimationInfo e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0.A;
            String str = this.$animationId;
            LootBoxAnimationType lootBoxAnimationType = LootBoxAnimationType.OPENING;
            this.label = 1;
            obj = eVar.d(str, lootBoxAnimationType, null, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                InputStream inputStream2 = (InputStream) this.L$0;
                kotlin.b.b(obj);
                inputStream = inputStream2;
                InputStream inputStream3 = (InputStream) obj;
                e = this.this$0.A.e(this.$animationId);
                if (e != null) {
                    jst.e.q("Could not find animation = " + this.$lootBoxId);
                    c.Kg(this.this$0);
                } else if (inputStream == null || inputStream3 == null) {
                    jst.e.q("Could not load animation = " + this.$lootBoxId);
                    c.Kg(this.this$0);
                } else {
                    c cVar = this.this$0;
                    tje.N(cVar.Jg(), null, null, new LootBoxModalViewPresenter$setAnimationGifts$1(cVar, this.$content.c, inputStream, inputStream3, e, null), 3);
                    c cVar2 = this.this$0;
                    tje.N(cVar2.Jg(), null, null, new LootBoxModalViewPresenter$setContentData$1(cVar2, this.$content, null), 3);
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        InputStream inputStream4 = (InputStream) obj;
        e eVar2 = this.this$0.A;
        String str2 = this.$animationId;
        LootBoxAnimationType lootBoxAnimationType2 = LootBoxAnimationType.COMPLETION;
        this.L$0 = inputStream4;
        this.label = 2;
        Object d = eVar2.d(str2, lootBoxAnimationType2, null, this);
        if (d != coroutineSingletons) {
            inputStream = inputStream4;
            obj = d;
            InputStream inputStream32 = (InputStream) obj;
            e = this.this$0.A.e(this.$animationId);
            if (e != null) {
            }
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
