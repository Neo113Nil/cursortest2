package com.yandex.go.scooters.data.mapper;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.scooters.data.model.ScootersAlternativeOfferResponse;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.fef;
import defpackage.gwk0;
import defpackage.lxm0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.q7p0;
import defpackage.qoh;
import defpackage.r7p0;
import defpackage.tje;
import defpackage.tse;
import defpackage.ukn0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;
import ru.yandex.taxi.scooters.experiments.g0;
import ru.yandex.taxi.scooters.experiments.t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llxm0;", "<anonymous>", "(Ltse;)Llxm0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersAlternativeOfferMapper$mapToAlternativeOfferPreview$2", f = "ScootersAlternativeOfferMapper.kt", l = {39, 53, 54, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 56, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersAlternativeOfferMapper$mapToAlternativeOfferPreview$2 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersAlternativeOfferResponse.AlternativeOffer $response;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersAlternativeOfferMapper$mapToAlternativeOfferPreview$2(b bVar, ScootersAlternativeOfferResponse.AlternativeOffer alternativeOffer, Continuation continuation) {
        super(2, continuation);
        this.$response = alternativeOffer;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersAlternativeOfferMapper$mapToAlternativeOfferPreview$2 scootersAlternativeOfferMapper$mapToAlternativeOfferPreview$2 = new ScootersAlternativeOfferMapper$mapToAlternativeOfferPreview$2(this.this$0, this.$response, continuation);
        scootersAlternativeOfferMapper$mapToAlternativeOfferPreview$2.L$0 = obj;
        return scootersAlternativeOfferMapper$mapToAlternativeOfferPreview$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersAlternativeOfferMapper$mapToAlternativeOfferPreview$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x022a  */
    /* JADX WARN: Type inference failed for: r11v9, types: [noh] */
    /* JADX WARN: Type inference failed for: r7v6, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        noh h3;
        Object b;
        qoh qohVar;
        noh nohVar;
        r7p0 r7p0Var;
        Object k;
        noh nohVar2;
        ScootersCardV2.a aVar;
        noh nohVar3;
        t tVar;
        qoh qohVar2;
        noh nohVar4;
        q7p0 q7p0Var;
        Object k2;
        t tVar2;
        BitmapDrawable bitmapDrawable;
        noh nohVar5;
        r7p0 r7p0Var2;
        q7p0 q7p0Var2;
        noh nohVar6;
        noh nohVar7;
        Object k3;
        ScootersCardV2.a aVar2;
        CharSequence charSequence;
        noh nohVar8;
        r7p0 r7p0Var3;
        Object k4;
        CharSequence charSequence2;
        CharSequence charSequence3;
        noh nohVar9;
        r7p0 r7p0Var4;
        q7p0 q7p0Var3;
        t tVar3;
        ScootersCardV2.a aVar3;
        BitmapDrawable bitmapDrawable2;
        Object k5;
        t tVar4;
        r7p0 r7p0Var5;
        CharSequence charSequence4;
        CharSequence charSequence5;
        BitmapDrawable bitmapDrawable3;
        q7p0 q7p0Var4;
        CharSequence charSequence6;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                fef h4 = gwk0.h(this.$response.c);
                h = tje.h(tseVar, null, null, new ScootersAlternativeOfferMapper$mapToAlternativeOfferPreview$2$imageAsync$1(this.this$0, this.$response, null), 3);
                qoh h5 = tje.h(tseVar, null, null, new ScootersAlternativeOfferMapper$mapToAlternativeOfferPreview$2$priceTextAsync$1(h4, this.this$0, this.$response, null), 3);
                qoh h6 = tje.h(tseVar, null, null, new ScootersAlternativeOfferMapper$mapToAlternativeOfferPreview$2$buttonTitleAsync$1(h4, this.this$0, this.$response, null), 3);
                h2 = tje.h(tseVar, null, null, new ScootersAlternativeOfferMapper$mapToAlternativeOfferPreview$2$buttonSubtitleAsync$1(h4, this.this$0, this.$response, null), 3);
                h3 = tje.h(tseVar, null, null, new ScootersAlternativeOfferMapper$mapToAlternativeOfferPreview$2$buttonIconAsync$1(this.this$0, this.$response, null), 3);
                ukn0 ukn0Var = this.this$0.d;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = h;
                this.L$3 = h5;
                this.L$4 = h6;
                this.L$5 = h2;
                this.L$6 = h3;
                this.label = 1;
                b = ukn0Var.a.b(this);
                if (b != coroutineSingletons) {
                    qohVar = h5;
                    nohVar = h6;
                    ScootersAlternativeOfferResponse.AlternativeOffer.Vehicle vehicle = this.$response.a;
                    r7p0Var = new r7p0(vehicle.a, vehicle.b);
                    ScootersAlternativeOfferResponse.AlternativeOffer.Vehicle.VehicleStatus vehicleStatus = this.$response.a.c;
                    int i = vehicleStatus.a;
                    q7p0 q7p0Var5 = new q7p0(vehicleStatus.b, vehicleStatus.c, i);
                    ScootersCardV2 scootersCardV2 = ((g0) b).k;
                    t tVar5 = scootersCardV2.b.a;
                    ScootersCardV2.a aVar4 = scootersCardV2.a;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = qohVar;
                    this.L$4 = nohVar;
                    this.L$5 = h2;
                    this.L$6 = h3;
                    this.L$7 = null;
                    this.L$8 = r7p0Var;
                    this.L$9 = q7p0Var5;
                    this.L$10 = tVar5;
                    this.L$11 = aVar4;
                    this.label = 2;
                    k = h.k(this);
                    if (k != coroutineSingletons) {
                        nohVar2 = h3;
                        aVar = aVar4;
                        nohVar3 = h2;
                        tVar = tVar5;
                        qohVar2 = qohVar;
                        nohVar4 = nohVar;
                        q7p0Var = q7p0Var5;
                        BitmapDrawable bitmapDrawable4 = (BitmapDrawable) k;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = nohVar4;
                        this.L$5 = nohVar3;
                        this.L$6 = nohVar2;
                        this.L$7 = null;
                        this.L$8 = r7p0Var;
                        this.L$9 = q7p0Var;
                        this.L$10 = tVar;
                        this.L$11 = aVar;
                        this.L$12 = bitmapDrawable4;
                        this.label = 3;
                        k2 = qohVar2.k(this);
                        if (k2 != coroutineSingletons) {
                            q7p0 q7p0Var6 = q7p0Var;
                            tVar2 = tVar;
                            bitmapDrawable = bitmapDrawable4;
                            nohVar5 = nohVar2;
                            r7p0Var2 = r7p0Var;
                            q7p0Var2 = q7p0Var6;
                            noh nohVar10 = nohVar4;
                            nohVar6 = nohVar3;
                            nohVar7 = nohVar10;
                            CharSequence charSequence7 = (CharSequence) k2;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = nohVar6;
                            this.L$6 = nohVar5;
                            this.L$7 = null;
                            this.L$8 = r7p0Var2;
                            this.L$9 = q7p0Var2;
                            this.L$10 = tVar2;
                            this.L$11 = aVar;
                            this.L$12 = bitmapDrawable;
                            this.L$13 = charSequence7;
                            this.label = 4;
                            k3 = nohVar7.k(this);
                            if (k3 != coroutineSingletons) {
                                aVar2 = aVar;
                                charSequence = charSequence7;
                                r7p0 r7p0Var6 = r7p0Var2;
                                nohVar8 = nohVar5;
                                r7p0Var3 = r7p0Var6;
                                CharSequence charSequence8 = (CharSequence) k3;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = nohVar8;
                                this.L$7 = null;
                                this.L$8 = r7p0Var3;
                                this.L$9 = q7p0Var2;
                                this.L$10 = tVar2;
                                this.L$11 = aVar2;
                                this.L$12 = bitmapDrawable;
                                this.L$13 = charSequence;
                                this.L$14 = charSequence8;
                                this.label = 5;
                                k4 = nohVar6.k(this);
                                if (k4 != coroutineSingletons) {
                                    BitmapDrawable bitmapDrawable5 = bitmapDrawable;
                                    charSequence2 = charSequence;
                                    charSequence3 = charSequence8;
                                    nohVar9 = nohVar8;
                                    r7p0Var4 = r7p0Var3;
                                    q7p0Var3 = q7p0Var2;
                                    tVar3 = tVar2;
                                    aVar3 = aVar2;
                                    bitmapDrawable2 = bitmapDrawable5;
                                    CharSequence charSequence9 = (CharSequence) k4;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.L$7 = null;
                                    this.L$8 = r7p0Var4;
                                    this.L$9 = q7p0Var3;
                                    this.L$10 = tVar3;
                                    this.L$11 = aVar3;
                                    this.L$12 = bitmapDrawable2;
                                    this.L$13 = charSequence2;
                                    this.L$14 = charSequence3;
                                    this.L$15 = charSequence9;
                                    this.label = 6;
                                    k5 = nohVar9.k(this);
                                    if (k5 != coroutineSingletons) {
                                        tVar4 = tVar3;
                                        r7p0Var5 = r7p0Var4;
                                        charSequence4 = charSequence9;
                                        charSequence5 = charSequence2;
                                        bitmapDrawable3 = bitmapDrawable2;
                                        q7p0Var4 = q7p0Var3;
                                        charSequence6 = charSequence3;
                                        return new lxm0(r7p0Var5, bitmapDrawable3, q7p0Var4, tVar4, aVar3, charSequence5, charSequence6, charSequence4, (BitmapDrawable) k5);
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                h3 = (noh) this.L$6;
                h2 = (noh) this.L$5;
                nohVar = (noh) this.L$4;
                ?? r7 = (noh) this.L$3;
                h = (noh) this.L$2;
                kotlin.b.b(obj);
                b = obj;
                qohVar = r7;
                ScootersAlternativeOfferResponse.AlternativeOffer.Vehicle vehicle2 = this.$response.a;
                r7p0Var = new r7p0(vehicle2.a, vehicle2.b);
                ScootersAlternativeOfferResponse.AlternativeOffer.Vehicle.VehicleStatus vehicleStatus2 = this.$response.a.c;
                int i2 = vehicleStatus2.a;
                q7p0 q7p0Var52 = new q7p0(vehicleStatus2.b, vehicleStatus2.c, i2);
                ScootersCardV2 scootersCardV22 = ((g0) b).k;
                t tVar52 = scootersCardV22.b.a;
                ScootersCardV2.a aVar42 = scootersCardV22.a;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = qohVar;
                this.L$4 = nohVar;
                this.L$5 = h2;
                this.L$6 = h3;
                this.L$7 = null;
                this.L$8 = r7p0Var;
                this.L$9 = q7p0Var52;
                this.L$10 = tVar52;
                this.L$11 = aVar42;
                this.label = 2;
                k = h.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                aVar = (ScootersCardV2.a) this.L$11;
                tVar = (t) this.L$10;
                q7p0Var = (q7p0) this.L$9;
                r7p0Var = (r7p0) this.L$8;
                noh nohVar11 = (noh) this.L$6;
                noh nohVar12 = (noh) this.L$5;
                noh nohVar13 = (noh) this.L$4;
                ?? r11 = (noh) this.L$3;
                kotlin.b.b(obj);
                qohVar2 = r11;
                nohVar4 = nohVar13;
                nohVar3 = nohVar12;
                nohVar2 = nohVar11;
                k = obj;
                BitmapDrawable bitmapDrawable42 = (BitmapDrawable) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar4;
                this.L$5 = nohVar3;
                this.L$6 = nohVar2;
                this.L$7 = null;
                this.L$8 = r7p0Var;
                this.L$9 = q7p0Var;
                this.L$10 = tVar;
                this.L$11 = aVar;
                this.L$12 = bitmapDrawable42;
                this.label = 3;
                k2 = qohVar2.k(this);
                if (k2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                BitmapDrawable bitmapDrawable6 = (BitmapDrawable) this.L$12;
                ScootersCardV2.a aVar5 = (ScootersCardV2.a) this.L$11;
                t tVar6 = (t) this.L$10;
                q7p0 q7p0Var7 = (q7p0) this.L$9;
                r7p0 r7p0Var7 = (r7p0) this.L$8;
                nohVar5 = (noh) this.L$6;
                noh nohVar14 = (noh) this.L$5;
                nohVar7 = (noh) this.L$4;
                kotlin.b.b(obj);
                bitmapDrawable = bitmapDrawable6;
                aVar = aVar5;
                nohVar6 = nohVar14;
                r7p0Var2 = r7p0Var7;
                q7p0Var2 = q7p0Var7;
                tVar2 = tVar6;
                k2 = obj;
                CharSequence charSequence72 = (CharSequence) k2;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = nohVar6;
                this.L$6 = nohVar5;
                this.L$7 = null;
                this.L$8 = r7p0Var2;
                this.L$9 = q7p0Var2;
                this.L$10 = tVar2;
                this.L$11 = aVar;
                this.L$12 = bitmapDrawable;
                this.L$13 = charSequence72;
                this.label = 4;
                k3 = nohVar7.k(this);
                if (k3 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 4:
                charSequence = (CharSequence) this.L$13;
                bitmapDrawable = (BitmapDrawable) this.L$12;
                aVar2 = (ScootersCardV2.a) this.L$11;
                tVar2 = (t) this.L$10;
                q7p0Var2 = (q7p0) this.L$9;
                r7p0Var3 = (r7p0) this.L$8;
                nohVar8 = (noh) this.L$6;
                noh nohVar15 = (noh) this.L$5;
                kotlin.b.b(obj);
                nohVar6 = nohVar15;
                k3 = obj;
                CharSequence charSequence82 = (CharSequence) k3;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = nohVar8;
                this.L$7 = null;
                this.L$8 = r7p0Var3;
                this.L$9 = q7p0Var2;
                this.L$10 = tVar2;
                this.L$11 = aVar2;
                this.L$12 = bitmapDrawable;
                this.L$13 = charSequence;
                this.L$14 = charSequence82;
                this.label = 5;
                k4 = nohVar6.k(this);
                if (k4 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                charSequence3 = (CharSequence) this.L$14;
                charSequence2 = (CharSequence) this.L$13;
                bitmapDrawable2 = (BitmapDrawable) this.L$12;
                aVar3 = (ScootersCardV2.a) this.L$11;
                tVar3 = (t) this.L$10;
                q7p0Var3 = (q7p0) this.L$9;
                r7p0Var4 = (r7p0) this.L$8;
                nohVar9 = (noh) this.L$6;
                kotlin.b.b(obj);
                k4 = obj;
                CharSequence charSequence92 = (CharSequence) k4;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = r7p0Var4;
                this.L$9 = q7p0Var3;
                this.L$10 = tVar3;
                this.L$11 = aVar3;
                this.L$12 = bitmapDrawable2;
                this.L$13 = charSequence2;
                this.L$14 = charSequence3;
                this.L$15 = charSequence92;
                this.label = 6;
                k5 = nohVar9.k(this);
                if (k5 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                CharSequence charSequence10 = (CharSequence) this.L$15;
                CharSequence charSequence11 = (CharSequence) this.L$14;
                CharSequence charSequence12 = (CharSequence) this.L$13;
                BitmapDrawable bitmapDrawable7 = (BitmapDrawable) this.L$12;
                ScootersCardV2.a aVar6 = (ScootersCardV2.a) this.L$11;
                t tVar7 = (t) this.L$10;
                q7p0 q7p0Var8 = (q7p0) this.L$9;
                r7p0 r7p0Var8 = (r7p0) this.L$8;
                kotlin.b.b(obj);
                charSequence6 = charSequence11;
                r7p0Var5 = r7p0Var8;
                charSequence5 = charSequence12;
                bitmapDrawable3 = bitmapDrawable7;
                q7p0Var4 = q7p0Var8;
                aVar3 = aVar6;
                tVar4 = tVar7;
                k5 = obj;
                charSequence4 = charSequence10;
                return new lxm0(r7p0Var5, bitmapDrawable3, q7p0Var4, tVar4, aVar3, charSequence5, charSequence6, charSequence4, (BitmapDrawable) k5);
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
