package com.yandex.go.places.experiments.map.social_pin;

import android.content.Context;
import com.yandex.go.places.experiments.map.social_pin.PlacesSocialPinDimensionsExperiment;
import com.yandex.go.places.experiments.map.social_pin.b;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.m810;
import defpackage.ny61;
import defpackage.ofc0;
import defpackage.rqo;
import defpackage.sls;
import defpackage.t1b0;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final Context a;
    public final rqo b;
    public final i3y c;
    public final i3y d;
    public final i3y e;

    public b(Context context, rqo rqoVar) {
        this.a = context;
        this.b = rqoVar;
        final int i = 0;
        this.c = kotlin.a.a(new sls(this) { // from class: pfc0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                b bVar = this.b;
                switch (i2) {
                    case 0:
                        return Integer.valueOf(tje.r(aug0.discovery_map_social_pin_image_icon_width, bVar.a));
                    case 1:
                        return Integer.valueOf(tje.r(aug0.discovery_map_social_pin_image_icon_height, bVar.a));
                    default:
                        return ((jbh) bVar.b).e(PlacesSocialPinDimensionsExperiment.e);
                }
            }
        });
        final int i2 = 1;
        this.d = kotlin.a.a(new sls(this) { // from class: pfc0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                b bVar = this.b;
                switch (i22) {
                    case 0:
                        return Integer.valueOf(tje.r(aug0.discovery_map_social_pin_image_icon_width, bVar.a));
                    case 1:
                        return Integer.valueOf(tje.r(aug0.discovery_map_social_pin_image_icon_height, bVar.a));
                    default:
                        return ((jbh) bVar.b).e(PlacesSocialPinDimensionsExperiment.e);
                }
            }
        });
        final int i3 = 2;
        this.e = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls(this) { // from class: pfc0
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                b bVar = this.b;
                switch (i22) {
                    case 0:
                        return Integer.valueOf(tje.r(aug0.discovery_map_social_pin_image_icon_width, bVar.a));
                    case 1:
                        return Integer.valueOf(tje.r(aug0.discovery_map_social_pin_image_icon_height, bVar.a));
                    default:
                        return ((jbh) bVar.b).e(PlacesSocialPinDimensionsExperiment.e);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PlacesSocialPinDimensionsExperimentRepository$getSocialPinDimensions$1 placesSocialPinDimensionsExperimentRepository$getSocialPinDimensions$1;
        int i;
        boolean z;
        if (continuationImpl instanceof PlacesSocialPinDimensionsExperimentRepository$getSocialPinDimensions$1) {
            placesSocialPinDimensionsExperimentRepository$getSocialPinDimensions$1 = (PlacesSocialPinDimensionsExperimentRepository$getSocialPinDimensions$1) continuationImpl;
            int i2 = placesSocialPinDimensionsExperimentRepository$getSocialPinDimensions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesSocialPinDimensionsExperimentRepository$getSocialPinDimensions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesSocialPinDimensionsExperimentRepository$getSocialPinDimensions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesSocialPinDimensionsExperimentRepository$getSocialPinDimensions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 t1b0Var = (t1b0) this.e.getValue();
                    placesSocialPinDimensionsExperimentRepository$getSocialPinDimensions$1.label = 1;
                    obj = t1b0Var.b(placesSocialPinDimensionsExperimentRepository$getSocialPinDimensions$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                PlacesSocialPinDimensionsExperiment placesSocialPinDimensionsExperiment = (PlacesSocialPinDimensionsExperiment) obj;
                z = placesSocialPinDimensionsExperiment.b;
                Float f = placesSocialPinDimensionsExperiment.c;
                Float f2 = placesSocialPinDimensionsExperiment.d;
                if (z || f2 == null || f == null || jl40.j(f, 0.0f)) {
                    return new ofc0(((Number) this.c.getValue()).intValue(), ((Number) this.d.getValue()).intValue());
                }
                float floatValue = f2.floatValue() * this.a.getResources().getDisplayMetrics().widthPixels;
                return new ofc0(m810.b(floatValue), m810.b(floatValue / f.floatValue()));
            }
        }
        placesSocialPinDimensionsExperimentRepository$getSocialPinDimensions$1 = new PlacesSocialPinDimensionsExperimentRepository$getSocialPinDimensions$1(this, continuationImpl);
        Object obj2 = placesSocialPinDimensionsExperimentRepository$getSocialPinDimensions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesSocialPinDimensionsExperimentRepository$getSocialPinDimensions$1.label;
        if (i != 0) {
        }
        PlacesSocialPinDimensionsExperiment placesSocialPinDimensionsExperiment2 = (PlacesSocialPinDimensionsExperiment) obj2;
        z = placesSocialPinDimensionsExperiment2.b;
        Float f3 = placesSocialPinDimensionsExperiment2.c;
        Float f22 = placesSocialPinDimensionsExperiment2.d;
        if (z) {
        }
        return new ofc0(((Number) this.c.getValue()).intValue(), ((Number) this.d.getValue()).intValue());
    }
}
