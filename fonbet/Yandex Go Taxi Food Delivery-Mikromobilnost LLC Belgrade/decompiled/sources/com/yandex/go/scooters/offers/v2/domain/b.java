package com.yandex.go.scooters.offers.v2.domain;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.go.scooters.offers.v2.data.model.ScootersOfferCardHeightConfigExperiment;
import defpackage.agh0;
import defpackage.d0p0;
import defpackage.d3a;
import defpackage.f5n0;
import defpackage.i6w;
import defpackage.jr31;
import defpackage.l7h0;
import defpackage.mth;
import defpackage.nsg0;
import defpackage.ny61;
import defpackage.qfh0;
import defpackage.san0;
import defpackage.sjh;
import defpackage.tan0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xx40;
import defpackage.yw01;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public static final /* synthetic */ int h = 0;
    public final tt2 a;
    public final d0p0 b;
    public final d3a c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public b(Context context, tt2 tt2Var, d0p0 d0p0Var, d3a d3aVar) {
        this.a = tt2Var;
        this.b = d0p0Var;
        this.c = d3aVar;
        this.d = tje.r(nsg0.scooters_default_anchor_height, context);
        this.e = context.getResources().getDimensionPixelSize(nsg0.scooters_default_collapsed_height);
        this.f = tje.u(28, context);
        this.g = tje.u(24, context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        if (r2 != r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        if (kotlinx.coroutines.flow.e.y(r2, r3) == r4) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f6 A[LOOP:0: B:19:0x00f4->B:20:0x00f6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ViewGroup viewGroup, ContinuationImpl continuationImpl) {
        ScootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1 scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1;
        int i;
        ViewGroup viewGroup2;
        int i2;
        int i3;
        ViewGroup viewGroup3 = viewGroup;
        if (continuationImpl instanceof ScootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1) {
            scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1 = (ScootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1) continuationImpl;
            int i4 = scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.label = i4 - Integer.MIN_VALUE;
                Object obj = scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.label;
                int i5 = 0;
                d3a d3aVar = this.c;
                int i6 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d0p0 d0p0Var = this.b;
                    kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(new j(new mth(kotlinx.coroutines.flow.e.d(d0p0Var.b.a), 6)), new ScootersSuccessOfferLayoutInteractor$listenToLastLayoutEvent$1(d0p0Var, viewGroup3, null));
                    scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.L$0 = viewGroup3;
                    scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            viewGroup3 = (ViewGroup) scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.L$0;
                            kotlin.b.b(obj);
                            viewGroup2 = viewGroup3;
                            if (!((Boolean) obj).booleanValue()) {
                                return new f5n0(this.d, this.e);
                            }
                            scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.L$0 = viewGroup2;
                            scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.I$0 = 0;
                            scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.label = 3;
                            obj = d3aVar.b.b(scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1);
                            if (obj != coroutineSingletons) {
                                i2 = 0;
                                int max = Math.max(i2, ((ScootersOfferCardHeightConfigExperiment) obj).c);
                                int[] iArr = {qfh0.scooters_attention, agh0.dialogue_component_header, l7h0.scooters_attention_header, agh0.dialogue_component_content_container, qfh0.scooters_components, qfh0.scooters_component_header, qfh0.scooters_component_tariff_list, qfh0.scooters_component_options_list, qfh0.scooters_component_option_insurance, qfh0.scooters_component_option_super_pass, qfh0.scooters_component_option_subscription, qfh0.scooters_component_option_active_packages, qfh0.scooters_component_list_divider, qfh0.scooters_component_scooters_list};
                                int[] iArr2 = i6w.a;
                                xx40 xx40Var = new xx40(14);
                                while (i3 < 14) {
                                }
                                tan0 tan0Var = new tan0(viewGroup2.getId(), viewGroup2.getHeight(), viewGroup2.getPaddingTop(), kotlin.sequences.b.s(new yw01(kotlin.sequences.b.g(new jr31(viewGroup2, 0), new san0(xx40Var, i5)), new san0(xx40Var, i6))));
                                this.a.getClass();
                                sjh sjhVar = uyj.a;
                                ScootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$2 scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$2 = new ScootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$2(this, tan0Var, max, null);
                                scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.L$0 = null;
                                scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.L$1 = null;
                                scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.I$0 = max;
                                scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.label = 4;
                                Object k0 = tje.k0(sjhVar, scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$2, scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1);
                                if (k0 != coroutineSingletons) {
                                }
                            }
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        i2 = scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.I$0;
                        viewGroup2 = (ViewGroup) scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.L$0;
                        kotlin.b.b(obj);
                        int max2 = Math.max(i2, ((ScootersOfferCardHeightConfigExperiment) obj).c);
                        int[] iArr3 = {qfh0.scooters_attention, agh0.dialogue_component_header, l7h0.scooters_attention_header, agh0.dialogue_component_content_container, qfh0.scooters_components, qfh0.scooters_component_header, qfh0.scooters_component_tariff_list, qfh0.scooters_component_options_list, qfh0.scooters_component_option_insurance, qfh0.scooters_component_option_super_pass, qfh0.scooters_component_option_subscription, qfh0.scooters_component_option_active_packages, qfh0.scooters_component_list_divider, qfh0.scooters_component_scooters_list};
                        int[] iArr22 = i6w.a;
                        xx40 xx40Var2 = new xx40(14);
                        for (i3 = 0; i3 < 14; i3++) {
                            int i7 = iArr3[i3];
                            xx40Var2.b[xx40Var2.d(i7)] = i7;
                        }
                        tan0 tan0Var2 = new tan0(viewGroup2.getId(), viewGroup2.getHeight(), viewGroup2.getPaddingTop(), kotlin.sequences.b.s(new yw01(kotlin.sequences.b.g(new jr31(viewGroup2, 0), new san0(xx40Var2, i5)), new san0(xx40Var2, i6))));
                        this.a.getClass();
                        sjh sjhVar2 = uyj.a;
                        ScootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$2 scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$22 = new ScootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$2(this, tan0Var2, max2, null);
                        scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.L$0 = null;
                        scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.L$1 = null;
                        scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.I$0 = max2;
                        scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.label = 4;
                        Object k02 = tje.k0(sjhVar2, scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$22, scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1);
                        return k02 != coroutineSingletons ? coroutineSingletons : k02;
                    }
                    viewGroup3 = (ViewGroup) scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.L$0;
                    kotlin.b.b(obj);
                }
                scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.L$0 = viewGroup3;
                scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.label = 2;
                obj = d3aVar.b.f(scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1);
            }
        }
        scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1 = new ScootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1(this, continuationImpl);
        Object obj2 = scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.label;
        int i52 = 0;
        d3a d3aVar2 = this.c;
        int i62 = 1;
        if (i != 0) {
        }
        scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.L$0 = viewGroup3;
        scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1.label = 2;
        obj2 = d3aVar2.b.f(scootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$1);
    }
}
