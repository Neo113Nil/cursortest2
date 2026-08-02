package com.yandex.go.zone.repository;

import com.yandex.go.zone.model.Zone;
import defpackage.id61;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/zone/model/Zone;", "<anonymous>", "(Ltse;)Lcom/yandex/go/zone/model/Zone;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.zone.repository.ZoneInfoParser$parseZoneInfoResponse$2", f = "ZoneInfoParser.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ZoneInfoParser$parseZoneInfoResponse$2 extends SuspendLambda implements wls {
    final /* synthetic */ kotlinx.serialization.json.c $zoneJson;
    final /* synthetic */ String $zoneName;
    int label;
    final /* synthetic */ id61 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneInfoParser$parseZoneInfoResponse$2(id61 id61Var, kotlinx.serialization.json.c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = id61Var;
        this.$zoneJson = cVar;
        this.$zoneName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZoneInfoParser$parseZoneInfoResponse$2(this.this$0, this.$zoneJson, this.$zoneName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoneInfoParser$parseZoneInfoResponse$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Zone zone = (Zone) ((xnt) this.this$0.a).d(this.$zoneJson, Zone.Companion.serializer());
        String str = this.$zoneName;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (zone.a.length() <= 0) {
            return new Zone(str2, zone.b, zone.c, zone.d, zone.e, zone.f, zone.g, zone.h, zone.i, zone.j, zone.k, zone.l, zone.m, zone.n, zone.o, zone.p, zone.q, zone.r, zone.s, zone.t, zone.u, zone.v, zone.w, zone.x, zone.y, zone.z, zone.A, zone.B, zone.C, zone.D, zone.E);
        }
        jst.e.k(new IllegalStateException("zone name was already assigned"), "zone name was already assigned");
        return zone;
    }
}
