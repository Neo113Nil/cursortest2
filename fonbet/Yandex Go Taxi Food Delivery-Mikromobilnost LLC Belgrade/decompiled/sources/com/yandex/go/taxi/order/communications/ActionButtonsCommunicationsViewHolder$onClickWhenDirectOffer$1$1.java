package com.yandex.go.taxi.order.communications;

import android.net.Uri;
import com.yandex.go.lootbox.api.domain.entities.lootbox.content.LootBoxContentTypeEntity;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.avj0;
import defpackage.dg41;
import defpackage.dqz;
import defpackage.hxx;
import defpackage.jst;
import defpackage.lpz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.opz;
import defpackage.pep0;
import defpackage.qoz;
import defpackage.rqz;
import defpackage.toz;
import defpackage.tse;
import defpackage.uoz;
import defpackage.voz;
import defpackage.w511;
import defpackage.wls;
import defpackage.woz;
import defpackage.xoz;
import defpackage.yoz;
import defpackage.zoz;
import defpackage.zxh0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.communications.ActionButtonsCommunicationsViewHolder$onClickWhenDirectOffer$1$1", f = "ActionButtonsCommunicationsViewHolder.kt", l = {212}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ActionButtonsCommunicationsViewHolder$onClickWhenDirectOffer$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ActionButton.f $action;
    final /* synthetic */ ButtonComponent $button;
    final /* synthetic */ CommunicationItem $item;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButtonsCommunicationsViewHolder$onClickWhenDirectOffer$1$1(e eVar, ActionButton.f fVar, ButtonComponent buttonComponent, CommunicationItem communicationItem, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$action = fVar;
        this.$button = buttonComponent;
        this.$item = communicationItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ActionButtonsCommunicationsViewHolder$onClickWhenDirectOffer$1$1(this.this$0, this.$action, this.$button, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ActionButtonsCommunicationsViewHolder$onClickWhenDirectOffer$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        TaxiOrder b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            com.yandex.go.lootbox.impl.domain.interactors.activation.a aVar = eVar.p0;
            String str = this.$action.a;
            LootBoxContentTypeEntity lootBoxContentTypeEntity = LootBoxContentTypeEntity.DIRECT_OFFER;
            o2y0 o2y0Var = eVar.r0;
            String d = o2y0Var != null ? o2y0Var.d() : null;
            o2y0 o2y0Var2 = this.this$0.r0;
            String w = (o2y0Var2 == null || (b = o2y0Var2.b()) == null) ? null : b.w();
            this.label = 1;
            a = aVar.a(str, lootBoxContentTypeEntity, d, w, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = obj;
        }
        yoz yozVar = (yoz) a;
        this.$button.stopAnimation();
        this.this$0.f0.d(this.$item.a);
        if (yozVar instanceof zoz) {
            opz opzVar = ((zoz) yozVar).a;
            boolean z = opzVar instanceof lpz;
            e eVar2 = this.this$0;
            if (z) {
                rqz rqzVar = (rqz) eVar2.g0;
                rqzVar.getClass();
                toz tozVar = ((lpz) opzVar).a;
                if (tozVar instanceof voz) {
                    jst.e.q("direct offer content type is unknown in response activate");
                } else if (tozVar instanceof uoz) {
                    rqzVar.f.a((uoz) tozVar);
                } else if (tozVar instanceof qoz) {
                    rqzVar.d.a(Uri.parse(((qoz) tozVar).a), DeeplinkSource.UNSPECIFIED);
                } else if (tozVar instanceof woz) {
                    CoreWebViewConfig.Companion.getClass();
                    CoreWebViewConfig.a aVar2 = new CoreWebViewConfig.a();
                    aVar2.b = ((woz) tozVar).a;
                    aVar2.i = true;
                    ((pep0) rqzVar.g).f(rqzVar.a.a().b(), new dg41(new UiWebViewConfig(aVar2.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null), null, null, null, null, null, null, 254), hxx.a);
                }
            } else {
                dqz dqzVar = (dqz) eVar2.q0;
                dqzVar.a(null, ((avj0) dqzVar.b).h(zxh0.error_text));
            }
        } else {
            if (!(yozVar instanceof xoz)) {
                w511.b();
                return null;
            }
            String str2 = ((xoz) yozVar).a;
            if (str2 != null) {
                ((dqz) this.this$0.q0).a(null, str2);
            }
        }
        return zy11.a;
    }
}
