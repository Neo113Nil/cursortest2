package com.yandex.go.urbanads;

import android.content.Context;
import com.yandex.div.state.db.StateEntry;
import com.yandex.urbanads.UrbanAdsCreativeParams$Format;
import com.yandex.urbanads.UrbanAdsView;
import defpackage.bf21;
import defpackage.bgc;
import defpackage.ck91;
import defpackage.i3y;
import defpackage.kcz0;
import defpackage.mf21;
import defpackage.nf21;
import defpackage.ny61;
import defpackage.on70;
import defpackage.qf21;
import defpackage.ryl;
import defpackage.u1m;
import defpackage.uir;
import defpackage.uyl;
import defpackage.vf21;
import defpackage.ze21;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b {
    public final Context a;
    public final mf21 b;

    public b(Context context, mf21 mf21Var) {
        this.a = context;
        this.b = mf21Var;
    }

    public final kcz0 a(String str, String str2, String str3) {
        MapBuilder mapBuilder = new MapBuilder();
        if (str2 != null) {
            mapBuilder.put(StateEntry.COLUMN_PATH, str2);
        }
        if (str3 != null) {
            mapBuilder.put("experiments", str3);
        }
        bf21 a = ze21.a(bf21.Companion, UrbanAdsCreativeParams$Format.HERO, str, mapBuilder.j());
        mf21 mf21Var = this.b;
        mf21Var.getClass();
        u1m c = on70.c(a);
        i3y i3yVar = ryl.c;
        uyl uylVar = (uyl) ck91.b().b.get(c);
        vf21 vf21Var = new vf21(uir.a(mf21Var.a, c, null, null, 14), a, (uylVar != null ? uylVar.c : null) != null);
        UrbanAdsView urbanAdsView = new UrbanAdsView(this.a, null, 0, 6, null);
        UrbanAdsView.set$default(urbanAdsView, vf21Var, null, 2, null);
        urbanAdsView.load();
        return new kcz0(urbanAdsView, vf21Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, bgc bgcVar, bgc bgcVar2, ContinuationImpl continuationImpl) {
        UrbanAdsManagerDeliveryAdapterImpl$requestPopup$1 urbanAdsManagerDeliveryAdapterImpl$requestPopup$1;
        int i;
        if (continuationImpl instanceof UrbanAdsManagerDeliveryAdapterImpl$requestPopup$1) {
            urbanAdsManagerDeliveryAdapterImpl$requestPopup$1 = (UrbanAdsManagerDeliveryAdapterImpl$requestPopup$1) continuationImpl;
            int i2 = urbanAdsManagerDeliveryAdapterImpl$requestPopup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                urbanAdsManagerDeliveryAdapterImpl$requestPopup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = urbanAdsManagerDeliveryAdapterImpl$requestPopup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = urbanAdsManagerDeliveryAdapterImpl$requestPopup$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MapBuilder mapBuilder = new MapBuilder();
                    if (str2 != null) {
                        mapBuilder.put(StateEntry.COLUMN_PATH, str2);
                    }
                    if (str3 != null) {
                        mapBuilder.put("experiments", str3);
                    }
                    MapBuilder j = mapBuilder.j();
                    urbanAdsManagerDeliveryAdapterImpl$requestPopup$1.L$0 = null;
                    urbanAdsManagerDeliveryAdapterImpl$requestPopup$1.L$1 = null;
                    urbanAdsManagerDeliveryAdapterImpl$requestPopup$1.L$2 = null;
                    urbanAdsManagerDeliveryAdapterImpl$requestPopup$1.L$3 = null;
                    urbanAdsManagerDeliveryAdapterImpl$requestPopup$1.L$4 = null;
                    urbanAdsManagerDeliveryAdapterImpl$requestPopup$1.L$5 = null;
                    urbanAdsManagerDeliveryAdapterImpl$requestPopup$1.label = 1;
                    mf21 mf21Var = this.b;
                    mf21Var.getClass();
                    bf21 a = ze21.a(bf21.Companion, UrbanAdsCreativeParams$Format.POPUP, str, j);
                    uir uirVar = mf21Var.a;
                    obj = new com.yandex.urbanads.internal.flex.b(uirVar.h, uirVar.q.get(), uirVar.s).a(a, bgcVar, bgcVar2, urbanAdsManagerDeliveryAdapterImpl$requestPopup$1);
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
                return Boolean.valueOf(!(((qf21) obj) instanceof nf21));
            }
        }
        urbanAdsManagerDeliveryAdapterImpl$requestPopup$1 = new UrbanAdsManagerDeliveryAdapterImpl$requestPopup$1(this, continuationImpl);
        Object obj2 = urbanAdsManagerDeliveryAdapterImpl$requestPopup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = urbanAdsManagerDeliveryAdapterImpl$requestPopup$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!(((qf21) obj2) instanceof nf21));
    }
}
