package com.yandex.go.scooters.ignition.controlling;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import com.yandex.go.scooters.ignition.domain.model.ScootersIgnitionOption;
import defpackage.avj0;
import defpackage.drn0;
import defpackage.gqn0;
import defpackage.hqn0;
import defpackage.iqn0;
import defpackage.kyh0;
import defpackage.lqn0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oqn0;
import defpackage.qoh;
import defpackage.rqn0;
import defpackage.scc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uqn0;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrqn0;", "<anonymous>", "(Ltse;)Lrqn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.controlling.ScootersIgnitionControllingUiStateMapper$mapToUiState$2", f = "ScootersIgnitionControllingUiStateMapper.kt", l = {39, 40, 41, 42}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionControllingUiStateMapper$mapToUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersIgnitionExperiment $experiment;
    final /* synthetic */ boolean $firstShowing;
    final /* synthetic */ boolean $ignitionEnabled;
    final /* synthetic */ drn0 $optionsStateHolder;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ uqn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionControllingUiStateMapper$mapToUiState$2(uqn0 uqn0Var, drn0 drn0Var, boolean z, boolean z2, ScootersIgnitionExperiment scootersIgnitionExperiment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uqn0Var;
        this.$optionsStateHolder = drn0Var;
        this.$firstShowing = z;
        this.$ignitionEnabled = z2;
        this.$experiment = scootersIgnitionExperiment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersIgnitionControllingUiStateMapper$mapToUiState$2 scootersIgnitionControllingUiStateMapper$mapToUiState$2 = new ScootersIgnitionControllingUiStateMapper$mapToUiState$2(this.this$0, this.$optionsStateHolder, this.$firstShowing, this.$ignitionEnabled, this.$experiment, continuation);
        scootersIgnitionControllingUiStateMapper$mapToUiState$2.L$0 = obj;
        return scootersIgnitionControllingUiStateMapper$mapToUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionControllingUiStateMapper$mapToUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ee, code lost:
    
        if (r3 == r2) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Type inference failed for: r3v14, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        qoh h2;
        noh h3;
        Object s;
        Object k;
        noh nohVar;
        String str;
        Object k2;
        String str2;
        String str3;
        noh nohVar2;
        Object k3;
        String str4;
        gqn0 gqn0Var;
        String str5;
        uqn0 uqn0Var;
        int i;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            h = tje.h(tseVar, null, null, new ScootersIgnitionControllingUiStateMapper$mapToUiState$2$topItemsAsync$1(this.this$0, this.$experiment, null, this.$firstShowing), 3);
            qoh h4 = tje.h(tseVar, null, null, new ScootersIgnitionControllingUiStateMapper$mapToUiState$2$titleAsync$1(this.this$0, this.$experiment, null, this.$firstShowing), 3);
            h2 = tje.h(tseVar, null, null, new ScootersIgnitionControllingUiStateMapper$mapToUiState$2$buttonTextAsync$1(this.this$0, this.$firstShowing, this.$ignitionEnabled, this.$experiment, null), 3);
            h3 = tje.h(tseVar, null, null, new ScootersIgnitionControllingUiStateMapper$mapToUiState$2$bottomLegalTermsAsync$1(this.this$0, this.$experiment, null, this.$firstShowing), 3);
            this.L$0 = null;
            this.L$1 = h;
            this.L$2 = null;
            this.L$3 = h2;
            this.L$4 = h3;
            this.label = 1;
            s = h4.s(this);
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    str = (String) this.L$5;
                    nohVar = (noh) this.L$4;
                    h = (noh) this.L$1;
                    kotlin.b.b(obj);
                    k = obj;
                    String str6 = (String) k;
                    this.L$0 = null;
                    this.L$1 = h;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = str;
                    this.L$6 = str6;
                    this.label = 3;
                    k2 = nohVar.k(this);
                    if (k2 != coroutineSingletons) {
                        noh nohVar3 = h;
                        str2 = str;
                        str3 = str6;
                        nohVar2 = nohVar3;
                        gqn0 gqn0Var2 = (gqn0) k2;
                        uqn0 uqn0Var2 = this.this$0;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = str2;
                        this.L$6 = str3;
                        this.L$7 = gqn0Var2;
                        this.L$8 = uqn0Var2;
                        this.label = 4;
                        k3 = nohVar2.k(this);
                        if (k3 != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uqn0Var = (uqn0) this.L$8;
                    gqn0 gqn0Var3 = (gqn0) this.L$7;
                    String str7 = (String) this.L$6;
                    String str8 = (String) this.L$5;
                    kotlin.b.b(obj);
                    gqn0Var = gqn0Var3;
                    str4 = str7;
                    str5 = str8;
                    k3 = obj;
                    drn0 drn0Var = this.$optionsStateHolder;
                    uqn0Var.getClass();
                    hqn0 hqn0Var = new hqn0((List) k3);
                    avj0 avj0Var = (avj0) uqn0Var.a;
                    iqn0 iqn0Var = new iqn0(new lqn0(avj0Var.h(kyh0.scooters_ignition_options_title)));
                    ScootersIgnitionOption scootersIgnitionOption = ScootersIgnitionOption.NOTIFICATION;
                    int i3 = drn0Var.a;
                    i = drn0Var.c;
                    int i4 = drn0Var.b;
                    String h5 = avj0Var.h(kyh0.scooters_ignition_option_notification_title);
                    int i5 = drn0Var.a;
                    String str9 = "";
                    oqn0 oqn0Var = new oqn0(h5, i5 != 3 ? avj0Var.h(kyh0.scooters_ignition_option_notification_subtitle_disallowed_and_disabled) : i5 == 1 ? avj0Var.h(kyh0.scooters_ignition_option_notification_subtitle_disallowed) : i5 == 2 ? avj0Var.h(kyh0.scooters_ignition_option_notification_subtitle_disabled) : "", scootersIgnitionOption, i3);
                    oqn0 oqn0Var2 = new oqn0(avj0Var.h(kyh0.scooters_ignition_option_geolocation_title), i4 != 3 ? avj0Var.h(kyh0.scooters_ignition_option_geolocation_subtitle_disallowed_and_disabled) : i4 == 1 ? avj0Var.h(kyh0.scooters_ignition_option_geolocation_subtitle_disallowed) : i4 == 2 ? avj0Var.h(kyh0.scooters_ignition_option_geolocation_subtitle_disabled) : "", ScootersIgnitionOption.GEOLOCATION, i4);
                    ScootersIgnitionOption scootersIgnitionOption2 = ScootersIgnitionOption.BLUETOOTH;
                    String h6 = avj0Var.h(kyh0.scooters_ignition_option_bluetooth_title);
                    if (i != 3) {
                        str9 = avj0Var.h(kyh0.scooters_ignition_option_bluetooth_subtitle_disallowed_and_disabled);
                    } else if (i == 1) {
                        str9 = avj0Var.h(kyh0.scooters_ignition_option_bluetooth_subtitle_disallowed);
                    } else if (i == 2) {
                        str9 = avj0Var.h(kyh0.scooters_ignition_option_bluetooth_subtitle_disabled);
                    }
                    List g = scc.g(hqn0Var, iqn0Var, new hqn0(scc.g(oqn0Var, oqn0Var2, new oqn0(h6, str9, scootersIgnitionOption2, i))));
                    drn0 drn0Var2 = this.$optionsStateHolder;
                    return new rqn0(this.$firstShowing, str5, g, str4, gqn0Var, drn0Var2.a != 0 && drn0Var2.b == 0 && drn0Var2.c == 0, this.$ignitionEnabled);
                }
                str3 = (String) this.L$6;
                String str10 = (String) this.L$5;
                noh nohVar4 = (noh) this.L$1;
                kotlin.b.b(obj);
                nohVar2 = nohVar4;
                str2 = str10;
                k2 = obj;
                gqn0 gqn0Var22 = (gqn0) k2;
                uqn0 uqn0Var22 = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = str2;
                this.L$6 = str3;
                this.L$7 = gqn0Var22;
                this.L$8 = uqn0Var22;
                this.label = 4;
                k3 = nohVar2.k(this);
                if (k3 != coroutineSingletons) {
                    str4 = str3;
                    gqn0Var = gqn0Var22;
                    str5 = str2;
                    uqn0Var = uqn0Var22;
                    drn0 drn0Var3 = this.$optionsStateHolder;
                    uqn0Var.getClass();
                    hqn0 hqn0Var2 = new hqn0((List) k3);
                    avj0 avj0Var2 = (avj0) uqn0Var.a;
                    iqn0 iqn0Var2 = new iqn0(new lqn0(avj0Var2.h(kyh0.scooters_ignition_options_title)));
                    ScootersIgnitionOption scootersIgnitionOption3 = ScootersIgnitionOption.NOTIFICATION;
                    int i32 = drn0Var3.a;
                    i = drn0Var3.c;
                    int i42 = drn0Var3.b;
                    String h52 = avj0Var2.h(kyh0.scooters_ignition_option_notification_title);
                    int i52 = drn0Var3.a;
                    String str92 = "";
                    oqn0 oqn0Var3 = new oqn0(h52, i52 != 3 ? avj0Var2.h(kyh0.scooters_ignition_option_notification_subtitle_disallowed_and_disabled) : i52 == 1 ? avj0Var2.h(kyh0.scooters_ignition_option_notification_subtitle_disallowed) : i52 == 2 ? avj0Var2.h(kyh0.scooters_ignition_option_notification_subtitle_disabled) : "", scootersIgnitionOption3, i32);
                    oqn0 oqn0Var22 = new oqn0(avj0Var2.h(kyh0.scooters_ignition_option_geolocation_title), i42 != 3 ? avj0Var2.h(kyh0.scooters_ignition_option_geolocation_subtitle_disallowed_and_disabled) : i42 == 1 ? avj0Var2.h(kyh0.scooters_ignition_option_geolocation_subtitle_disallowed) : i42 == 2 ? avj0Var2.h(kyh0.scooters_ignition_option_geolocation_subtitle_disabled) : "", ScootersIgnitionOption.GEOLOCATION, i42);
                    ScootersIgnitionOption scootersIgnitionOption22 = ScootersIgnitionOption.BLUETOOTH;
                    String h62 = avj0Var2.h(kyh0.scooters_ignition_option_bluetooth_title);
                    if (i != 3) {
                    }
                    List g2 = scc.g(hqn0Var2, iqn0Var2, new hqn0(scc.g(oqn0Var3, oqn0Var22, new oqn0(h62, str92, scootersIgnitionOption22, i))));
                    drn0 drn0Var22 = this.$optionsStateHolder;
                    return new rqn0(this.$firstShowing, str5, g2, str4, gqn0Var, drn0Var22.a != 0 && drn0Var22.b == 0 && drn0Var22.c == 0, this.$ignitionEnabled);
                }
                return coroutineSingletons;
            }
            h3 = (noh) this.L$4;
            ?? r3 = (noh) this.L$3;
            h = (noh) this.L$1;
            kotlin.b.b(obj);
            h2 = r3;
            s = obj;
        }
        String str11 = (String) s;
        this.L$0 = null;
        this.L$1 = h;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = h3;
        this.L$5 = str11;
        this.label = 2;
        k = h2.k(this);
        if (k != coroutineSingletons) {
            nohVar = h3;
            str = str11;
            String str62 = (String) k;
            this.L$0 = null;
            this.L$1 = h;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = str;
            this.L$6 = str62;
            this.label = 3;
            k2 = nohVar.k(this);
            if (k2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
