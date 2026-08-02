package com.yandex.go.taxi.tariffs.factory;

import com.yandex.go.preorder.extraphone.ExtraContactPhonesRules;
import com.yandex.go.zone.dto.objects.BrandingType;
import com.yandex.go.zone.dto.objects.DeliveryZoneTariffExtra;
import com.yandex.go.zone.dto.objects.SuggestsPreferences;
import com.yandex.go.zone.dto.objects.TariffBranding;
import com.yandex.go.zone.dto.objects.TariffCard;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.model.Zone;
import defpackage.ati;
import defpackage.cti;
import defpackage.cwd;
import defpackage.ijx0;
import defpackage.jgv;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.pjx0;
import defpackage.pmw0;
import defpackage.qex0;
import defpackage.sb2;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.tariffs.model.TariffSource;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcwd;", "<anonymous>", "(Ltse;)Lcwd;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.factory.CompoundTariffInfoFactoryImpl$createFromZone$2", f = "CompoundTariffInfoFactoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class CompoundTariffInfoFactoryImpl$createFromZone$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<pjx0> $tariffOverrides;
    final /* synthetic */ Zone $zone;
    final /* synthetic */ String $zoneMode;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompoundTariffInfoFactoryImpl$createFromZone$2(a aVar, Zone zone, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$zone = zone;
        this.$zoneMode = str;
        this.$tariffOverrides = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CompoundTariffInfoFactoryImpl$createFromZone$2(this.this$0, this.$zone, this.$zoneMode, this.$tariffOverrides, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CompoundTariffInfoFactoryImpl$createFromZone$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Set set = this.this$0.e.b.j;
        List J0 = kotlin.collections.a.J0(this.$zone.k);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = J0.iterator();
        while (it2.hasNext()) {
            ZoneTariffInfo zoneTariffInfo = (ZoneTariffInfo) it2.next();
            if (zoneTariffInfo.s || zoneTariffInfo.a(this.$zoneMode)) {
                it = it2;
            } else {
                qex0 qex0Var = this.this$0.c;
                Zone zone = this.$zone;
                qex0Var.getClass();
                EmptyList emptyList = EmptyList.a;
                TariffSource tariffSource = TariffSource.ZONE_INFO;
                Integer num = (Integer) kotlin.collections.a.S(0, zoneTariffInfo.h);
                int intValue = num != null ? num.intValue() : -1;
                jgv jgvVar = qex0Var.a;
                String a = jgvVar.a(zoneTariffInfo.c);
                String a2 = jgvVar.a(zoneTariffInfo.f);
                String str = zoneTariffInfo.a;
                String str2 = zoneTariffInfo.e;
                String str3 = zoneTariffInfo.d;
                boolean z = zoneTariffInfo.k;
                Boolean bool = zoneTariffInfo.r;
                boolean z2 = bool == null || bool.booleanValue() || zoneTariffInfo.C.a();
                boolean z3 = zoneTariffInfo.u;
                boolean z4 = zoneTariffInfo.i;
                boolean z5 = zoneTariffInfo.j;
                ArrayList p = sb2.p(zoneTariffInfo);
                pmw0 pmw0Var = qex0Var.d;
                List list = zoneTariffInfo.o;
                it = it2;
                String str4 = zoneTariffInfo.e;
                pmw0Var.getClass();
                ArrayList b = pmw0.b(str4, list);
                List list2 = zoneTariffInfo.q;
                List list3 = zoneTariffInfo.m;
                if (list3 == null) {
                    list3 = emptyList;
                }
                ?? r2 = zoneTariffInfo.n;
                if (r2 != 0) {
                    emptyList = r2;
                }
                String str5 = zoneTariffInfo.v;
                TariffCard tariffCard = zoneTariffInfo.t;
                int i = zoneTariffInfo.x;
                if (i <= 0) {
                    i = Math.max(zone.p, 2);
                }
                int i2 = i - 1;
                int i3 = zoneTariffInfo.w;
                Map map = zoneTariffInfo.y;
                List list4 = zoneTariffInfo.B;
                List list5 = zoneTariffInfo.z;
                boolean z6 = zoneTariffInfo.D;
                ExtraContactPhonesRules extraContactPhonesRules = zoneTariffInfo.C;
                ijx0 ijx0Var = TariffOrderFlow.Companion;
                String str6 = zoneTariffInfo.E;
                ijx0Var.getClass();
                TariffOrderFlow a3 = ijx0.a(str6);
                if (a3 == null) {
                    a3 = TariffOrderFlow.TAXI_FLOW;
                }
                TariffOrderFlow tariffOrderFlow = a3;
                Iterator it3 = zoneTariffInfo.z.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it3.next();
                    Iterator it4 = it3;
                    if (set.contains(((TariffBranding) obj2).a)) {
                        break;
                    }
                    it3 = it4;
                }
                TariffBranding tariffBranding = (TariffBranding) obj2;
                BrandingType brandingType = tariffBranding != null ? tariffBranding.a : null;
                cti ctiVar = qex0Var.c;
                DeliveryZoneTariffExtra deliveryZoneTariffExtra = zoneTariffInfo.F;
                ctiVar.getClass();
                ati c = cti.c(deliveryZoneTariffExtra);
                SuggestsPreferences suggestsPreferences = zoneTariffInfo.H;
                arrayList.add(new pex0(tariffSource, str2, b, list2, list3, emptyList, null, null, a, a2, null, str3, null, intValue, str, null, null, null, z4, z5, false, false, false, null, null, z, z2, z3, false, null, null, null, null, null, null, null, null, null, i3, null, null, false, false, null, null, null, null, null, extraContactPhonesRules, z6, c, null, null, p, null, null, false, null, tariffCard, null, null, null, brandingType, str5, i2, map, list4, null, list5, null, tariffOrderFlow, null, null, null, null, null, null, null, null, null, null, suggestsPreferences != null ? suggestsPreferences.a : null, zoneTariffInfo.I, null, 0, -235694912, -277545025, 6815392));
            }
            it2 = it;
        }
        Zone zone2 = this.$zone;
        return new cwd(zone2, null, this.this$0.d.b(arrayList, zone2, null), this.$tariffOverrides, EmptySet.a, false);
    }
}
