package com.yandex.go.tappable_poi;

import com.yandex.go.layers.api.presentation.mapkit.MapKitObjectType;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.tappable_poi.b;
import com.yandex.go.tappable_poi.experiments.TappablePoiCardExperiment;
import com.yandex.go.tappable_poi.experiments.TappablePoiExperiment;
import com.yandex.go.tappable_poi.experiments.c;
import com.yandex.go.tappable_poi.experiments.f;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.mapkit.geometry.Point;
import defpackage.aax0;
import defpackage.ag80;
import defpackage.bg80;
import defpackage.cg80;
import defpackage.eg80;
import defpackage.evu0;
import defpackage.fg80;
import defpackage.g6u;
import defpackage.gcc0;
import defpackage.hcc0;
import defpackage.he80;
import defpackage.hg80;
import defpackage.hl00;
import defpackage.ity;
import defpackage.je80;
import defpackage.jl40;
import defpackage.kg80;
import defpackage.kl80;
import defpackage.kuj;
import defpackage.lg80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o400;
import defpackage.p2y0;
import defpackage.qi80;
import defpackage.r501;
import defpackage.sjh;
import defpackage.sls;
import defpackage.svj;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xl80;
import defpackage.zy11;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tappable_poi.TappablePoiController$onObjectTap$1", f = "TappablePoiController.kt", l = {HProv.ALG_SID_SHA3_224, 74, HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TappablePoiController$onObjectTap$1 extends SuspendLambda implements wls {
    final /* synthetic */ Optional<hl00> $mapObjectOptional;
    final /* synthetic */ Point $point;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.tappable_poi.TappablePoiController$onObjectTap$1$1", f = "TappablePoiController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.tappable_poi.TappablePoiController$onObjectTap$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ TappablePoiCardExperiment.CardOption $currentCardPoiOptions;
        final /* synthetic */ Optional<hl00> $mapObjectOptional;
        final /* synthetic */ Point $point;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TappablePoiCardExperiment.CardOption cardOption, b bVar, Optional optional, Point point, Continuation continuation) {
            super(2, continuation);
            this.$currentCardPoiOptions = cardOption;
            this.this$0 = bVar;
            this.$mapObjectOptional = optional;
            this.$point = point;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$currentCardPoiOptions, this.this$0, this.$mapObjectOptional, this.$point, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ee  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            lg80 lg80Var;
            Float f;
            int i;
            lg80 lg80Var2 = cg80.b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            TappablePoiCardExperiment.CardOption cardOption = this.$currentCardPoiOptions;
            final b bVar = this.this$0;
            Optional<hl00> optional = this.$mapObjectOptional;
            if (cardOption != null) {
                hl00 hl00Var = optional.get();
                bVar.d.a(hl00Var.a, hl00Var.b, hl00Var.d, null, null, true, bVar.f.b().b().toUpperCase(Locale.ROOT));
                String str2 = hl00Var.a;
                qi80 qi80Var = (str2 == null || evu0.J(str2)) ? null : new qi80(str2, null);
                if (qi80Var != null) {
                    bVar.n = hl00Var.a;
                    gcc0 gcc0Var = (gcc0) bVar.e.get();
                    String str3 = cardOption.h;
                    if (str3 != null) {
                        lg80 lg80Var3 = eg80.b;
                        if (!str3.equals("navigator")) {
                            lg80Var3 = fg80.b;
                            if (!str3.equals("navigator_gas_stations")) {
                                if (!str3.equals("discovery")) {
                                    lg80Var2 = kg80.b;
                                    if (!str3.equals(TariffOrderFlow.ORDER_FLOW_TAXI_KEY)) {
                                        lg80Var2 = ag80.b;
                                        if (!str3.equals("advert")) {
                                            lg80Var2 = hg80.b;
                                            if (!str3.equals("ride_geosearch")) {
                                                lg80Var2 = new bg80(str3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        lg80Var = lg80Var3;
                        svj p = r501.p(kuj.b, cardOption.i);
                        boolean z = cardOption.c;
                        je80 je80Var = je80.u;
                        he80 he80Var = new he80();
                        if (cardOption.d) {
                            he80Var.e = new ity();
                        }
                        f = cardOption.f;
                        if (f != null) {
                            he80Var.c(f.floatValue());
                        }
                        i = cardOption.e;
                        if (i != 0) {
                            he80Var.h = Integer.valueOf(i);
                        }
                        final int i2 = 0;
                        he80Var.j = false;
                        final int i3 = 1;
                        he80Var.a = true;
                        he80Var.f = true;
                        he80Var.g = true;
                        aax0 aax0Var = bVar.o;
                        he80Var.o = aax0Var == null ? aax0Var.o() : false;
                        final int i4 = 2;
                        ((hcc0) gcc0Var).b(new xl80(p, qi80Var, lg80Var, null, null, z, null, null, he80Var.a(), null, new sls() { // from class: fax0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i5 = i2;
                                b bVar2 = bVar;
                                switch (i5) {
                                    case 0:
                                        aax0 aax0Var2 = bVar2.o;
                                        if (aax0Var2 != null) {
                                            aax0Var2.l();
                                        }
                                        break;
                                    case 1:
                                        aax0 aax0Var3 = bVar2.o;
                                        if (aax0Var3 != null) {
                                            aax0Var3.y();
                                        }
                                        break;
                                    default:
                                        aax0 aax0Var4 = bVar2.o;
                                        if (aax0Var4 != null) {
                                            aax0Var4.y();
                                        }
                                        bVar2.n = null;
                                        break;
                                }
                                return zy11.a;
                            }
                        }, new sls() { // from class: fax0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i5 = i3;
                                b bVar2 = bVar;
                                switch (i5) {
                                    case 0:
                                        aax0 aax0Var2 = bVar2.o;
                                        if (aax0Var2 != null) {
                                            aax0Var2.l();
                                        }
                                        break;
                                    case 1:
                                        aax0 aax0Var3 = bVar2.o;
                                        if (aax0Var3 != null) {
                                            aax0Var3.y();
                                        }
                                        break;
                                    default:
                                        aax0 aax0Var4 = bVar2.o;
                                        if (aax0Var4 != null) {
                                            aax0Var4.y();
                                        }
                                        bVar2.n = null;
                                        break;
                                }
                                return zy11.a;
                            }
                        }, new sls() { // from class: fax0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i5 = i4;
                                b bVar2 = bVar;
                                switch (i5) {
                                    case 0:
                                        aax0 aax0Var2 = bVar2.o;
                                        if (aax0Var2 != null) {
                                            aax0Var2.l();
                                        }
                                        break;
                                    case 1:
                                        aax0 aax0Var3 = bVar2.o;
                                        if (aax0Var3 != null) {
                                            aax0Var3.y();
                                        }
                                        break;
                                    default:
                                        aax0 aax0Var4 = bVar2.o;
                                        if (aax0Var4 != null) {
                                            aax0Var4.y();
                                        }
                                        bVar2.n = null;
                                        break;
                                }
                                return zy11.a;
                            }
                        }, 728), kl80.a);
                    }
                    lg80Var = lg80Var2;
                    svj p2 = r501.p(kuj.b, cardOption.i);
                    boolean z2 = cardOption.c;
                    je80 je80Var2 = je80.u;
                    he80 he80Var2 = new he80();
                    if (cardOption.d) {
                    }
                    f = cardOption.f;
                    if (f != null) {
                    }
                    i = cardOption.e;
                    if (i != 0) {
                    }
                    final int i22 = 0;
                    he80Var2.j = false;
                    final int i32 = 1;
                    he80Var2.a = true;
                    he80Var2.f = true;
                    he80Var2.g = true;
                    aax0 aax0Var2 = bVar.o;
                    he80Var2.o = aax0Var2 == null ? aax0Var2.o() : false;
                    final int i42 = 2;
                    ((hcc0) gcc0Var).b(new xl80(p2, qi80Var, lg80Var, null, null, z2, null, null, he80Var2.a(), null, new sls() { // from class: fax0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i5 = i22;
                            b bVar2 = bVar;
                            switch (i5) {
                                case 0:
                                    aax0 aax0Var22 = bVar2.o;
                                    if (aax0Var22 != null) {
                                        aax0Var22.l();
                                    }
                                    break;
                                case 1:
                                    aax0 aax0Var3 = bVar2.o;
                                    if (aax0Var3 != null) {
                                        aax0Var3.y();
                                    }
                                    break;
                                default:
                                    aax0 aax0Var4 = bVar2.o;
                                    if (aax0Var4 != null) {
                                        aax0Var4.y();
                                    }
                                    bVar2.n = null;
                                    break;
                            }
                            return zy11.a;
                        }
                    }, new sls() { // from class: fax0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i5 = i32;
                            b bVar2 = bVar;
                            switch (i5) {
                                case 0:
                                    aax0 aax0Var22 = bVar2.o;
                                    if (aax0Var22 != null) {
                                        aax0Var22.l();
                                    }
                                    break;
                                case 1:
                                    aax0 aax0Var3 = bVar2.o;
                                    if (aax0Var3 != null) {
                                        aax0Var3.y();
                                    }
                                    break;
                                default:
                                    aax0 aax0Var4 = bVar2.o;
                                    if (aax0Var4 != null) {
                                        aax0Var4.y();
                                    }
                                    bVar2.n = null;
                                    break;
                            }
                            return zy11.a;
                        }
                    }, new sls() { // from class: fax0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i5 = i42;
                            b bVar2 = bVar;
                            switch (i5) {
                                case 0:
                                    aax0 aax0Var22 = bVar2.o;
                                    if (aax0Var22 != null) {
                                        aax0Var22.l();
                                    }
                                    break;
                                case 1:
                                    aax0 aax0Var3 = bVar2.o;
                                    if (aax0Var3 != null) {
                                        aax0Var3.y();
                                    }
                                    break;
                                default:
                                    aax0 aax0Var4 = bVar2.o;
                                    if (aax0Var4 != null) {
                                        aax0Var4.y();
                                    }
                                    bVar2.n = null;
                                    break;
                            }
                            return zy11.a;
                        }
                    }, 728), kl80.a);
                }
            } else {
                Point point = this.$point;
                aax0 aax0Var3 = bVar.o;
                if (aax0Var3 != null) {
                    if (optional.isPresent()) {
                        hl00 hl00Var2 = optional.get();
                        if (aax0Var3.d()) {
                            bVar.d.a(hl00Var2.a, hl00Var2.b, hl00Var2.d, aax0Var3.a(), Boolean.valueOf(aax0Var3.b()), false, null);
                            List<TappablePoiExperiment.TappablePoiExpItem> list = ((f) bVar.b).a.c;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                for (TappablePoiExperiment.TappablePoiExpItem tappablePoiExpItem : list) {
                                    String str4 = tappablePoiExpItem.a;
                                    boolean z3 = tappablePoiExpItem.b;
                                    if ((jl40.l(str4, "transit") ? MapKitObjectType.MASS_TRANSIT_STOP : jl40.l(str4, "org") ? MapKitObjectType.ORGANISATION : MapKitObjectType.UNKNOWN) == hl00Var2.e && ((z3 && (str = hl00Var2.d) != null && str.length() != 0) || !z3)) {
                                        Point point2 = hl00Var2.c;
                                        if (point2 != null) {
                                            aax0Var3.q(ru.yandex.taxi.map.utils.a.E(point2, null));
                                        }
                                    }
                                }
                            }
                        }
                    } else if (!((f) bVar.b).a.c.isEmpty() && aax0Var3.d() && point != null) {
                        aax0Var3.i(ru.yandex.taxi.map.utils.a.E(point, null));
                    }
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TappablePoiController$onObjectTap$1(b bVar, Optional optional, Point point, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$mapObjectOptional = optional;
        this.$point = point;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TappablePoiController$onObjectTap$1(this.this$0, this.$mapObjectOptional, this.$point, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TappablePoiController$onObjectTap$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0096, code lost:
    
        if (defpackage.tje.k0(r14, r6, r13) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r14 == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        Screen screen;
        Optional<hl00> optional;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            cVar = bVar.c;
            Optional<hl00> optional2 = this.$mapObjectOptional;
            Screen b = bVar.f.b();
            p2y0 p2y0Var = this.this$0.h;
            this.L$0 = cVar;
            this.L$1 = optional2;
            this.L$2 = b;
            this.label = 1;
            Object y = ((e0) p2y0Var).y(this);
            if (y != coroutineSingletons) {
                screen = b;
                obj = y;
                optional = optional2;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            screen = (Screen) this.L$2;
            optional = (Optional) this.L$1;
            cVar = (c) this.L$0;
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            TappablePoiCardExperiment.CardOption cardOption = (TappablePoiCardExperiment.CardOption) obj;
            this.this$0.i.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cardOption, this.this$0, this.$mapObjectOptional, this.$point, null);
            this.L$0 = null;
            this.label = 3;
        }
        o2y0 o2y0Var = (o2y0) obj;
        DriveState c = o2y0Var != null ? o2y0Var.c() : null;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        obj = cVar.a(optional, screen, c, this);
    }
}
