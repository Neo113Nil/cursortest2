package com.yandex.go.masstransit.sdk.order.impl.orders;

import defpackage.bvf0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.api.dto.Story;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrdersRepository$preloadAllMedia$4", f = "MasstransitOrdersRepository.kt", l = {263}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class MasstransitOrdersRepository$preloadAllMedia$4 extends SuspendLambda implements wls {
    final /* synthetic */ List<MasstransitOrderDto> $orders;
    final /* synthetic */ List<Story> $stories;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasstransitOrdersRepository$preloadAllMedia$4(k kVar, List list, List list2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$orders = list;
        this.$stories = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MasstransitOrdersRepository$preloadAllMedia$4(this.this$0, this.$orders, this.$stories, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MasstransitOrdersRepository$preloadAllMedia$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        k kVar = this.this$0;
        List<MasstransitOrderDto> list = this.$orders;
        kVar.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((MasstransitOrderDto) it.next()).getB().iterator();
            while (it2.hasNext()) {
                x c = ((MasstransitTicketDto) it2.next()).getC();
                if (c instanceof TransportPassDto$CppkSuburbanActivationDto) {
                    NeedActivationStateDto e = ((TransportPassDto$CppkSuburbanActivationDto) c).getE();
                    if (e != null && (a = e.getA()) != null) {
                        kVar.j(a);
                    }
                } else if (c instanceof TransportPassDto$DefaultPassDto) {
                    TransportPassDto$DefaultPassDto transportPassDto$DefaultPassDto = (TransportPassDto$DefaultPassDto) c;
                    String a2 = transportPassDto$DefaultPassDto.getA();
                    if (a2 != null) {
                        kVar.j(a2);
                    }
                    String c2 = transportPassDto$DefaultPassDto.getC();
                    if (c2 != null) {
                        kVar.j(c2);
                    }
                } else if (c instanceof TransportPassDto$QrCodePassDto) {
                    String b = ((TransportPassDto$QrCodePassDto) c).getB();
                    if (b != null) {
                        kVar.j(b);
                    }
                } else if (!jl40.l(c, w.INSTANCE)) {
                    w511.b();
                    return null;
                }
            }
        }
        k kVar2 = this.this$0;
        List<Story> list2 = this.$stories;
        kVar2.getClass();
        for (Story story : list2) {
            ru.yandex.taxi.stories.domain.b bVar = kVar2.b;
            List list3 = story.i.d;
            ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
            int i2 = 0;
            for (Object obj2 : list3) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    scc.m();
                    throw null;
                }
                arrayList.add(Integer.valueOf(i2));
                i2 = i3;
            }
            bVar.c(story, arrayList);
        }
        k kVar3 = this.this$0;
        List<MasstransitOrderDto> list4 = this.$orders;
        kVar3.getClass();
        for (MasstransitOrderDto masstransitOrderDto : list4) {
            kVar3.i(masstransitOrderDto.getF().getB());
            kVar3.i(masstransitOrderDto.getF().getA());
            kVar3.i(masstransitOrderDto.getF().getC());
            kVar3.i(masstransitOrderDto.getF().getD());
        }
        k kVar4 = this.this$0;
        List<MasstransitOrderDto> list5 = this.$orders;
        this.label = 1;
        kVar4.getClass();
        Object n = bvf0.n(new MasstransitOrdersRepository$preloadImages$2(kVar4, list5, null), this);
        if (n != CoroutineSingletons.COROUTINE_SUSPENDED) {
            n = zy11Var;
        }
        return n == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
