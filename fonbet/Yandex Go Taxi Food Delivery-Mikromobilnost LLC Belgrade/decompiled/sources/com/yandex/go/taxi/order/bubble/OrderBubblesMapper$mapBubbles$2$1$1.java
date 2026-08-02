package com.yandex.go.taxi.order.bubble;

import com.yandex.go.taxi.order.bubble.model.Bubble$Type;
import com.yandex.go.taxi.order.models.api.objects.RouteInfo;
import com.yandex.go.taxi.order.models.api.objects.e1;
import com.yandex.go.taxi.order.models.api.objects.l1;
import defpackage.a3y0;
import defpackage.avj0;
import defpackage.cds0;
import defpackage.cvu0;
import defpackage.hi70;
import defpackage.jl40;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sxu0;
import defpackage.tse;
import defpackage.uxu0;
import defpackage.vxu0;
import defpackage.w511;
import defpackage.wls;
import defpackage.xc8;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltl6;", "<anonymous>", "(Ltse;)Ltl6;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.bubble.OrderBubblesMapper$mapBubbles$2$1$1", f = "OrderBubblesMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderBubblesMapper$mapBubbles$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ float $currentZoom;
    final /* synthetic */ DriveState $driveState;
    final /* synthetic */ RouteInfo.Position $it;
    final /* synthetic */ Map<String, String> $keySet;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderBubblesMapper$mapBubbles$2$1$1(b bVar, RouteInfo.Position position, Map map, DriveState driveState, float f, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$it = position;
        this.$keySet = map;
        this.$driveState = driveState;
        this.$currentZoom = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderBubblesMapper$mapBubbles$2$1$1(this.this$0, this.$it, this.$keySet, this.$driveState, this.$currentZoom, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderBubblesMapper$mapBubbles$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        sxu0 sxu0Var;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        RouteInfo.Position position = this.$it;
        Map<String, String> map = this.$keySet;
        DriveState driveState = this.$driveState;
        float f = this.$currentZoom;
        bVar.getClass();
        zzs zzsVar = position.b;
        RouteInfo.Position.Type type = position.a;
        if (zzsVar != zzs.f) {
            int i = hi70.a[type.ordinal()];
            Bubble$Type bubble$Type = (i == 1 || i == 2) ? Bubble$Type.COMBO : i != 3 ? Bubble$Type.DEFAULT : Bubble$Type.CHAIN;
            RouteInfo.Style style = position.d;
            if (style == null) {
                DriveState driveState2 = DriveState.TRANSPORTING;
                String str = "";
                if ((driveState == driveState2 || driveState == DriveState.DRIVING) && (driveState != driveState2 || type != RouteInfo.Position.Type.CHAIN)) {
                    String str2 = position.c;
                    if (str2.length() != 0) {
                        avj0 avj0Var = (avj0) bVar.b;
                        int identifier = avj0Var.a.getResources().getIdentifier(cvu0.v(str2, Extension.DOT_CHAR, "_", false), "string", bVar.a.getPackageName());
                        if (identifier == 0) {
                            ((a3y0) bVar.d.getValue()).b("getDefaultValue", new IllegalStateException("No default bubble string"), new xc8(str2, 15));
                        } else {
                            str = avj0Var.h(identifier);
                        }
                        str = map.getOrDefault(str2, str);
                    }
                }
                if (str.length() != 0) {
                    return new cds0(zzsVar, bubble$Type, str);
                }
            } else {
                Iterator it = style.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    e1 e1Var = (e1) obj2;
                    if (e1Var instanceof RouteInfo.ImageIcon) {
                        list = ((RouteInfo.ImageIcon) e1Var).b;
                    } else if (e1Var instanceof RouteInfo.PinIcon) {
                        list = ((RouteInfo.PinIcon) e1Var).b;
                    } else {
                        if (!jl40.l(e1Var, l1.INSTANCE)) {
                            w511.b();
                            return null;
                        }
                        list = EmptyList.a;
                    }
                    Float f2 = (Float) kotlin.collections.a.R(list);
                    if (f2 != null) {
                        float floatValue = f2.floatValue();
                        Float f3 = (Float) kotlin.collections.a.b0(list);
                        if (f3 != null) {
                            float floatValue2 = f3.floatValue();
                            if (floatValue <= f && f <= floatValue2) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                e1 e1Var2 = (e1) obj2;
                if (e1Var2 != null) {
                    if (e1Var2 instanceof RouteInfo.ImageIcon) {
                        sxu0Var = bVar.c((RouteInfo.ImageIcon) e1Var2);
                    } else {
                        if (e1Var2 instanceof RouteInfo.PinIcon) {
                            RouteInfo.PinIcon pinIcon = (RouteInfo.PinIcon) e1Var2;
                            String str3 = pinIcon.c;
                            String str4 = pinIcon.a;
                            if (str3.length() != 0 && str4.length() != 0) {
                                String a = ((m7x0) bVar.c).a(str3);
                                RouteInfo.ImageIcon imageIcon = pinIcon.e;
                                sxu0Var = new uxu0(a, str4, imageIcon != null ? bVar.c(imageIcon) : null, pinIcon.d);
                            }
                        } else if (!e1Var2.equals(l1.INSTANCE)) {
                            w511.b();
                            return null;
                        }
                        sxu0Var = null;
                    }
                    if (sxu0Var != null) {
                        return new vxu0(zzsVar, bubble$Type, sxu0Var);
                    }
                }
            }
        }
        return null;
    }
}
