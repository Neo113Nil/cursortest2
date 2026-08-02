package com.yandex.go.multimodal_route.order;

import com.yandex.go.multimodal_route.api.MultimodalRouteRootPayload$Source;
import com.yandex.go.preorder.source.altpins.Alternatives;
import com.yandex.go.taxi.order.models.api.preorder.SelectedTariffInfo;
import com.yandex.go.taxi.order.models.api.preorder.TollRoads;
import com.yandex.go.taxi.order.models.api.preorder.c;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.as40;
import defpackage.aw40;
import defpackage.dbl0;
import defpackage.e3n;
import defpackage.fu40;
import defpackage.g6u;
import defpackage.hxx;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.lz6;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.o430;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.pex0;
import defpackage.sjh;
import defpackage.tr40;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.yal0;
import defpackage.zy11;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.preorder.tollroad.data.RoadRestriction;
import ru.yandex.taxi.preorder.tollroad.data.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.order.MultimodalOrderPart$interruptOrderProcess$1", f = "MultimodalOrderPart.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 58}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MultimodalOrderPart$interruptOrderProcess$1 extends SuspendLambda implements wls {
    final /* synthetic */ tr40 $multimodalOption;
    final /* synthetic */ pex0 $originalTariff;
    final /* synthetic */ String $routeType;
    final /* synthetic */ String $routeUri;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.multimodal_route.order.MultimodalOrderPart$interruptOrderProcess$1$1", f = "MultimodalOrderPart.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.multimodal_route.order.MultimodalOrderPart$interruptOrderProcess$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ CharSequence $buttonText;
        final /* synthetic */ long $etaMills;
        final /* synthetic */ tr40 $multimodalOption;
        final /* synthetic */ pex0 $originalTariff;
        final /* synthetic */ String $routeType;
        final /* synthetic */ String $routeUri;
        final /* synthetic */ String $taxiEta;
        final /* synthetic */ String $taxiPrice;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, String str, String str2, pex0 pex0Var, tr40 tr40Var, CharSequence charSequence, String str3, String str4, long j, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$routeUri = str;
            this.$routeType = str2;
            this.$originalTariff = pex0Var;
            this.$multimodalOption = tr40Var;
            this.$buttonText = charSequence;
            this.$taxiPrice = str3;
            this.$taxiEta = str4;
            this.$etaMills = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$routeUri, this.$routeType, this.$originalTariff, this.$multimodalOption, this.$buttonText, this.$taxiPrice, this.$taxiEta, this.$etaMills, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a aVar = this.this$0;
            oep0 oep0Var = aVar.c;
            m950 m950Var = (m950) aVar.d.get();
            String str = this.$routeUri;
            String str2 = this.$routeType;
            String str3 = this.$originalTariff.b;
            tr40 tr40Var = this.$multimodalOption;
            String str4 = tr40Var.c;
            CharSequence charSequence = this.$buttonText;
            String a = tr40Var.a.J0.b.a();
            e eVar = this.this$0.g;
            TollRoads tollRoads = new TollRoads(eVar.f(), eVar.a().size() >= 2 && eVar.b() == RoadRestriction.NONE);
            c cVar = SelectedTariffInfo.Companion;
            String str5 = this.$originalTariff.b;
            cVar.getClass();
            lz6 lz6Var = new lz6(charSequence, new aw40(a, tollRoads, new SelectedTariffInfo(str5, Collections.singleton(str5), false), null, this.$taxiPrice, this.$taxiEta, this.$etaMills));
            a aVar2 = this.this$0;
            tr40 tr40Var2 = this.$multimodalOption;
            aVar2.getClass();
            ((pep0) oep0Var).f(m950Var, new fu40(str, str2, str3, str4, lz6Var, new as40(tr40Var2.f, tr40Var2.g), MultimodalRouteRootPayload$Source.Taxi, EmptyList.a, null), hxx.a);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalOrderPart$interruptOrderProcess$1(a aVar, tr40 tr40Var, pex0 pex0Var, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$multimodalOption = tr40Var;
        this.$originalTariff = pex0Var;
        this.$routeUri = str;
        this.$routeType = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultimodalOrderPart$interruptOrderProcess$1(this.this$0, this.$multimodalOption, this.$originalTariff, this.$routeUri, this.$routeType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MultimodalOrderPart$interruptOrderProcess$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0163, code lost:
    
        if (defpackage.tje.k0(r2, r6, r18) == r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0165, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x003f, code lost:
    
        if (r2 == r1) goto L78;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object i;
        com.yandex.go.preorder.source.altpins.b bVar;
        ServiceLevel serviceLevel;
        String str;
        ServiceLevel.HighlightedTariffs highlightedTariffs;
        List list;
        long j;
        com.yandex.go.zone.dto.response.c cVar;
        List list2;
        Object obj2;
        Alternatives alternatives;
        List list3;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            ru.yandex.taxi.widget.c cVar2 = this.this$0.e;
            FormattedText formattedText = this.$multimodalOption.d;
            this.label = 1;
            i = ru.yandex.taxi.widget.c.i(cVar2, formattedText, null, this, 30);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
            i = obj;
        }
        CharSequence charSequence = (CharSequence) i;
        a aVar = this.this$0;
        String str2 = this.$originalTariff.b;
        dbl0 b = aVar.h.b();
        yal0 yal0Var = b != null ? b.a : null;
        if (yal0Var == null || (alternatives = yal0Var.e) == null || (list3 = alternatives.a) == null) {
            bVar = null;
        } else {
            Iterator it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (((com.yandex.go.preorder.source.altpins.b) obj3) instanceof Alternatives.MultimodalOptionDto) {
                    break;
                }
            }
            bVar = (com.yandex.go.preorder.source.altpins.b) obj3;
        }
        Alternatives.MultimodalOptionDto multimodalOptionDto = bVar instanceof Alternatives.MultimodalOptionDto ? (Alternatives.MultimodalOptionDto) bVar : null;
        if (multimodalOptionDto == null || (list2 = multimodalOptionDto.b) == null) {
            serviceLevel = null;
        } else {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (jl40.l(((ServiceLevel) obj2).f, str2)) {
                    break;
                }
            }
            serviceLevel = (ServiceLevel) obj2;
        }
        String a = aVar.i.a(yal0Var != null ? yal0Var.g() : null, serviceLevel != null ? serviceLevel.g : null, false, true);
        if (a.length() <= 0) {
            a = null;
        }
        Integer valueOf = (serviceLevel == null || (cVar = serviceLevel.d) == null) ? null : Integer.valueOf((int) Math.ceil(cVar.getA() / 60.0d));
        if (valueOf == null || (str = String.valueOf(valueOf.intValue())) == null) {
            str = (serviceLevel == null || (highlightedTariffs = serviceLevel.W) == null || (list = highlightedTariffs.a) == null) ? null : (String) kotlin.collections.a.R(list);
        }
        if (valueOf != null) {
            o430 o430Var = e3n.b;
            j = e3n.e(kp50.U(valueOf.intValue(), DurationUnit.SECONDS));
        } else {
            j = 0;
        }
        Triple triple = new Triple(a, str, Long.valueOf(j));
        String str3 = (String) triple.getFirst();
        String str4 = (String) triple.getSecond();
        long longValue = ((Number) triple.getThird()).longValue();
        this.this$0.f.getClass();
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$routeUri, this.$routeType, this.$originalTariff, this.$multimodalOption, charSequence, str3, str4, longValue, null);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.J$0 = longValue;
        this.label = 2;
    }
}
