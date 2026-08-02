package com.yandex.go.zone.repository;

import com.yandex.go.zone.model.SupportPage;
import com.yandex.go.zone.model.Zone;
import defpackage.ae61;
import defpackage.as21;
import defpackage.auu0;
import defpackage.be61;
import defpackage.bqe;
import defpackage.cne0;
import defpackage.gd61;
import defpackage.h73;
import defpackage.jl40;
import defpackage.k8u;
import defpackage.kd61;
import defpackage.ld61;
import defpackage.md61;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pae;
import defpackage.tse;
import defpackage.u431;
import defpackage.wls;
import defpackage.xnt;
import defpackage.yw01;
import defpackage.zy11;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import kotlinx.serialization.json.JsonNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.zone.repository.ZoneInfoRepositoryImpl$updateLastObservedZone$2", f = "ZoneInfoRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ZoneInfoRepositoryImpl$updateLastObservedZone$2 extends SuspendLambda implements wls {
    final /* synthetic */ Zone $newZone;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneInfoRepositoryImpl$updateLastObservedZone$2(o oVar, Zone zone, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
        this.$newZone = zone;
        this.$userId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZoneInfoRepositoryImpl$updateLastObservedZone$2(this.this$0, this.$newZone, this.$userId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ZoneInfoRepositoryImpl$updateLastObservedZone$2 zoneInfoRepositoryImpl$updateLastObservedZone$2 = (ZoneInfoRepositoryImpl$updateLastObservedZone$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        zoneInfoRepositoryImpl$updateLastObservedZone$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Zone zone = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        r rVar = this.this$0.g;
        String str2 = this.$newZone.a;
        synchronized (rVar) {
            str = rVar.j;
            rVar.j = str2;
            rVar.i.r("lastCity", str2);
        }
        Zone h = this.this$0.h(this.$userId, str);
        Zone zone2 = this.$newZone;
        String str3 = this.$userId;
        be61 be61Var = new be61(zone2, str3);
        be61 be61Var2 = (be61) this.this$0.r.getValue();
        boolean z = h != null && h.i(this.$newZone);
        if (z && be61Var2 != null) {
            if (jl40.l(be61Var2.b, str3) ? be61Var2.a.i(zone2) : false) {
                return zy11Var;
            }
        }
        o oVar = this.this$0;
        Zone zone3 = this.$newZone;
        ae61 ae61Var = oVar.j;
        ae61Var.a.t(ae61Var.c, kotlin.sequences.b.u(new yw01(kotlin.sequences.b.g(new h73(1, zone3.k), new u431(27)), new u431(28))));
        r0 r0Var = this.this$0.r;
        r0Var.getClass();
        r0Var.m(null, be61Var);
        this.this$0.n.a.l(this.$newZone.B);
        o oVar2 = this.this$0;
        String str4 = this.$userId;
        Zone zone4 = this.$newZone;
        oVar2.getClass();
        String str5 = zone4.a;
        if (str5.length() > 0) {
            kd61 kd61Var = oVar2.d;
            ConcurrentHashMap concurrentHashMap = kd61Var.b;
            md61 md61Var = new md61(str4, str5);
            kd61Var.a.getClass();
            concurrentHashMap.put(md61Var, new ld61(zone4, System.currentTimeMillis()));
        }
        if (!z) {
            zone = h;
        } else if (be61Var2 != null) {
            zone = be61Var2.a;
        }
        this.this$0.s.g(new gd61(zone, this.$newZone));
        bqe bqeVar = this.this$0.l;
        Zone zone5 = this.$newZone;
        pae paeVar = bqeVar.a;
        kotlinx.serialization.json.b bVar = zone5.q;
        SupportPage supportPage = zone5.l;
        String str6 = paeVar.b;
        cne0 cne0Var = paeVar.c;
        if (bVar == null || bVar.equals(JsonNull.INSTANCE)) {
            cne0Var.w(str6);
        } else {
            cne0Var.r(str6, ((xnt) paeVar.a).e(bVar, kotlinx.serialization.json.b.Companion.serializer()));
        }
        as21 as21Var = bqeVar.b;
        as21Var.g("LAST_KNOWN_SUPPORT_URL", supportPage.a);
        as21Var.g("LAST_KNOWN_SUPPORT_MAILTO", supportPage.b);
        as21Var.g("LAST_KNOWN_SUPPORT_MODE", supportPage.c);
        as21Var.g("LAST_KNOWN_SUPPORT_EMERGENCY_BOT_GUID", supportPage.d);
        Map map = supportPage.e;
        auu0 auu0Var = auu0.a;
        as21Var.h("LAST_KNOWN_SUPPORT_SERVICES_BOT_GUID", new k8u(auu0Var, auu0Var, 1), map);
        this.this$0.k.l(this.$newZone);
        return zy11Var;
    }
}
