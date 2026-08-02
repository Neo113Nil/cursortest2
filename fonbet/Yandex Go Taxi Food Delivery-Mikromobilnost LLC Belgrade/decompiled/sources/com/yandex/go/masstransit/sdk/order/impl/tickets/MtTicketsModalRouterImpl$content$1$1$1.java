package com.yandex.go.masstransit.sdk.order.impl.tickets;

import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemActionDto$CopyToClipboard;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemActionDto$Deeplink;
import com.yandex.go.masstransit.sdk.order.api.tickets.analytics.MtTicketOrderAction;
import com.yandex.go.masstransit.sdk.order.api.tickets.analytics.MtTicketTappedButtonName;
import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrderDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitTicketDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.TransportPassDto$CppkSuburbanActivationDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.x;
import defpackage.a60;
import defpackage.a940;
import defpackage.at20;
import defpackage.avj0;
import defpackage.b940;
import defpackage.c940;
import defpackage.cyh0;
import defpackage.d940;
import defpackage.e100;
import defpackage.e940;
import defpackage.f940;
import defpackage.g940;
import defpackage.h310;
import defpackage.h940;
import defpackage.i940;
import defpackage.jl40;
import defpackage.k410;
import defpackage.m410;
import defpackage.m950;
import defpackage.mvg;
import defpackage.n410;
import defpackage.ny61;
import defpackage.q840;
import defpackage.qu;
import defpackage.s640;
import defpackage.sy60;
import defpackage.tse;
import defpackage.uk10;
import defpackage.v770;
import defpackage.w511;
import defpackage.wls;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.tickets.MtTicketsModalRouterImpl$content$1$1$1", f = "MtTicketsModalRouterImpl.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtTicketsModalRouterImpl$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ i940 $action;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTicketsModalRouterImpl$content$1$1$1(g gVar, i940 i940Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$action = i940Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTicketsModalRouterImpl$content$1$1$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTicketsModalRouterImpl$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01e2 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object obj2;
        String str;
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
        g gVar = this.this$0;
        e100 e100Var = gVar.J;
        i940 i940Var = this.$action;
        uk10 uk10Var = gVar.P;
        String str2 = gVar.Q;
        this.label = 1;
        i iVar = (i) e100Var.b;
        at20 at20Var = (at20) e100Var.c;
        if (!jl40.l(i940Var, b940.a)) {
            if (i940Var instanceof d940) {
                at20Var.j(MtTicketOrderAction.Update, null);
                a = iVar.b(((d940) i940Var).a, this);
            } else if (i940Var instanceof h940) {
                n410 n410Var = ((h940) i940Var).a;
                if (!jl40.l(n410Var, m410.INSTANCE)) {
                    if (n410Var instanceof MasstransitSlotItemActionDto$CopyToClipboard) {
                        at20Var.j(MtTicketOrderAction.CopyToClipboard, null);
                        ((g) uk10Var.a).O.c.a(false, ((MasstransitSlotItemActionDto$CopyToClipboard) n410Var).a, "TicketNumber");
                    } else if (n410Var instanceof MasstransitSlotItemActionDto$Deeplink) {
                        MtTicketOrderAction mtTicketOrderAction = MtTicketOrderAction.Deeplink;
                        String str3 = ((MasstransitSlotItemActionDto$Deeplink) n410Var).a;
                        at20Var.j(mtTicketOrderAction, str3);
                        ((a60) ((g) uk10Var.a).O.d).c(str3, v770.c);
                    } else {
                        if (!jl40.l(n410Var, k410.INSTANCE)) {
                            w511.b();
                            return null;
                        }
                        if (str2 != null) {
                            Object value = kotlinx.coroutines.flow.e.d(iVar.d).a.getValue();
                            h310 h310Var = value instanceof h310 ? (h310) value : null;
                            if (h310Var != null) {
                                MasstransitOrderDto masstransitOrderDto = h310Var.a;
                                Iterator it = masstransitOrderDto.b.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it.next();
                                    if (jl40.l(((MasstransitTicketDto) obj2).a, str2)) {
                                        break;
                                    }
                                }
                                MasstransitTicketDto masstransitTicketDto = (MasstransitTicketDto) obj2;
                                if (masstransitTicketDto != null) {
                                    x xVar = masstransitTicketDto.c;
                                    TransportPassDto$CppkSuburbanActivationDto transportPassDto$CppkSuburbanActivationDto = xVar instanceof TransportPassDto$CppkSuburbanActivationDto ? (TransportPassDto$CppkSuburbanActivationDto) xVar : null;
                                    if (transportPassDto$CppkSuburbanActivationDto == null || (str = transportPassDto$CppkSuburbanActivationDto.b) == null) {
                                        str = (String) h310Var.b.get(str2);
                                    }
                                    String str4 = str;
                                    at20Var.i(str2);
                                    String str5 = masstransitOrderDto.a;
                                    String str6 = transportPassDto$CppkSuburbanActivationDto != null ? transportPassDto$CppkSuburbanActivationDto.a : null;
                                    Boolean bool = transportPassDto$CppkSuburbanActivationDto != null ? transportPassDto$CppkSuburbanActivationDto.d : null;
                                    String str7 = masstransitOrderDto.e;
                                    String h = ((avj0) ((zuj0) e100Var.w)).h(cyh0.mt_sdk_ticket_success_activated_message);
                                    g gVar2 = (g) uk10Var.a;
                                    gVar2.A((m950) gVar2.N.invoke(), new s640(str7, str2, str6, str4, bool), new b(gVar2, h, str2, str5));
                                }
                            }
                        }
                    }
                }
            } else if (i940Var instanceof g940) {
                g940 g940Var = (g940) i940Var;
                String str8 = g940Var.a;
                String str9 = g940Var.b;
                if (str8 != null && str9 != null) {
                    at20Var.k(str9, g940Var.f != null ? MtTicketTappedButtonName.HowActivate : MtTicketTappedButtonName.Activate);
                    at20Var.i(str9);
                    String str10 = g940Var.b;
                    String str11 = g940Var.c;
                    String str12 = g940Var.d;
                    Boolean bool2 = g940Var.e;
                    String str13 = g940Var.f;
                    CharSequence charSequence = g940Var.g;
                    g gVar3 = (g) uk10Var.a;
                    gVar3.A((m950) gVar3.N.invoke(), new s640(str13, str10, str11, str12, bool2), new b(gVar3, charSequence, str10, str8));
                }
            } else if (i940Var instanceof e940) {
                e940 e940Var = (e940) i940Var;
                String str14 = e940Var.a;
                if (str14 != null) {
                    at20Var.k(str14, MtTicketTappedButtonName.NameRoute);
                }
                String str15 = e940Var.b;
                String str16 = e940Var.c;
                g gVar4 = (g) uk10Var.a;
                gVar4.A((m950) gVar4.M.invoke(), new q840(str15, str16), sy60.Q2);
            } else if (jl40.l(i940Var, c940.a)) {
                at20Var.j(MtTicketOrderAction.Scroll, null);
            } else if (i940Var instanceof f940) {
                at20Var.k(((f940) i940Var).a, MtTicketTappedButtonName.VisualCode);
            } else {
                if (!(i940Var instanceof a940)) {
                    w511.b();
                    return null;
                }
                a = iVar.a(((a940) i940Var).a, this);
            }
            return a != coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        ((g) uk10Var.a).r(new qu(9));
        a = zy11Var;
        if (a != coroutineSingletons) {
        }
    }
}
