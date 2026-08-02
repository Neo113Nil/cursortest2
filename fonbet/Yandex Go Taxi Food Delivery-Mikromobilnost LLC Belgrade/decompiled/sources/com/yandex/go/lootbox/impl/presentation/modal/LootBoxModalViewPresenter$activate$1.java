package com.yandex.go.lootbox.impl.presentation.modal;

import com.yandex.go.lootbox.api.domain.entities.lootbox.content.LootBoxContentTypeEntity;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.opz;
import defpackage.ppz;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xoz;
import defpackage.yoz;
import defpackage.zoz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lootbox.impl.presentation.modal.LootBoxModalViewPresenter$activate$1", f = "LootBoxModalViewPresenter.kt", l = {151}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LootBoxModalViewPresenter$activate$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $lootBoxId;
    final /* synthetic */ tls $onContentLoaded;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LootBoxModalViewPresenter$activate$1(c cVar, String str, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$lootBoxId = str;
        this.$onContentLoaded = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LootBoxModalViewPresenter$activate$1(this.this$0, this.$lootBoxId, this.$onContentLoaded, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LootBoxModalViewPresenter$activate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LootBoxModalViewPresenter$activate$1 lootBoxModalViewPresenter$activate$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            com.yandex.go.lootbox.impl.domain.interactors.activation.a aVar = cVar.z;
            String str = this.$lootBoxId;
            LootBoxContentTypeEntity lootBoxContentTypeEntity = LootBoxContentTypeEntity.LOOT_BOX;
            String str2 = cVar.G;
            String str3 = cVar.H;
            this.label = 1;
            lootBoxModalViewPresenter$activate$1 = this;
            obj = aVar.a(str, lootBoxContentTypeEntity, str2, str3, lootBoxModalViewPresenter$activate$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            lootBoxModalViewPresenter$activate$1 = this;
        }
        yoz yozVar = (yoz) obj;
        if (yozVar instanceof zoz) {
            opz opzVar = ((zoz) yozVar).a;
            if (opzVar instanceof ppz) {
                lootBoxModalViewPresenter$activate$1.$onContentLoaded.invoke(opzVar);
            } else {
                jst.e.getClass();
            }
        } else {
            if (!(yozVar instanceof xoz)) {
                w511.b();
                return null;
            }
            String str4 = ((xoz) yozVar).a;
            if (str4 != null) {
                c cVar2 = lootBoxModalViewPresenter$activate$1.this$0;
                tje.N(cVar2.Jg(), null, null, new LootBoxModalViewPresenter$showError$1(cVar2, str4, null), 3);
            }
        }
        return zy11.a;
    }
}
