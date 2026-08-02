package com.yandex.go.places.map.ui.pinwar;

import com.yandex.mapkit.ConflictResolutionMode;
import com.yandex.mapkit.map.LayerIds;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.Sublayer;
import com.yandex.mapkit.map.SublayerFeatureType;
import com.yandex.mapkit.map.SublayerManager;
import defpackage.ah00;
import defpackage.czo0;
import defpackage.el00;
import defpackage.gh00;
import defpackage.hbp0;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes13.dex */
public final class a {
    public static final SublayerFeatureType e = SublayerFeatureType.PLACEMARKS_AND_LABELS;
    public final ah00 a;
    public final el00 b;
    public final hbp0 c;
    public ConflictResolutionMode d;

    public a(ah00 ah00Var, el00 el00Var) {
        this.a = ah00Var;
        this.b = el00Var;
        String d = qoi0.a(a.class).d();
        this.c = new hbp0(new czo0(14), d == null ? "" : d, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        PinWarMapkitConflictsResolver$saveOriginalConflictResolutionMode$1 pinWarMapkitConflictsResolver$saveOriginalConflictResolutionMode$1;
        int i;
        gh00 gh00Var;
        SublayerManager sublayerManager;
        Integer findFirstOf;
        Sublayer sublayer;
        ah00 ah00Var = aVar.a;
        if (continuationImpl instanceof PinWarMapkitConflictsResolver$saveOriginalConflictResolutionMode$1) {
            pinWarMapkitConflictsResolver$saveOriginalConflictResolutionMode$1 = (PinWarMapkitConflictsResolver$saveOriginalConflictResolutionMode$1) continuationImpl;
            int i2 = pinWarMapkitConflictsResolver$saveOriginalConflictResolutionMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinWarMapkitConflictsResolver$saveOriginalConflictResolutionMode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinWarMapkitConflictsResolver$saveOriginalConflictResolutionMode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinWarMapkitConflictsResolver$saveOriginalConflictResolutionMode$1.label;
                ConflictResolutionMode conflictResolutionMode = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    el00 el00Var = aVar.b;
                    pinWarMapkitConflictsResolver$saveOriginalConflictResolutionMode$1.label = 1;
                    if (el00Var.a(pinWarMapkitConflictsResolver$saveOriginalConflictResolutionMode$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                gh00Var = (gh00) ah00Var;
                Map map = gh00Var.b;
                sublayerManager = map == null ? map.getSublayerManager() : null;
                if (sublayerManager != null && (findFirstOf = sublayerManager.findFirstOf(LayerIds.getMapObjectsLayerId(), e)) != null) {
                    int intValue = findFirstOf.intValue();
                    Map map2 = gh00Var.b;
                    SublayerManager sublayerManager2 = map2 == null ? map2.getSublayerManager() : null;
                    sublayer = sublayerManager2 == null ? sublayerManager2.get(intValue) : null;
                    if (sublayer != null) {
                        conflictResolutionMode = sublayer.getConflictResolutionMode();
                    }
                }
                aVar.d = conflictResolutionMode;
                return zy11.a;
            }
        }
        pinWarMapkitConflictsResolver$saveOriginalConflictResolutionMode$1 = new PinWarMapkitConflictsResolver$saveOriginalConflictResolutionMode$1(aVar, continuationImpl);
        Object obj2 = pinWarMapkitConflictsResolver$saveOriginalConflictResolutionMode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinWarMapkitConflictsResolver$saveOriginalConflictResolutionMode$1.label;
        ConflictResolutionMode conflictResolutionMode2 = null;
        if (i != 0) {
        }
        gh00Var = (gh00) ah00Var;
        Map map3 = gh00Var.b;
        if (map3 == null) {
        }
        if (sublayerManager != null) {
            int intValue2 = findFirstOf.intValue();
            Map map22 = gh00Var.b;
            if (map22 == null) {
            }
            if (sublayerManager2 == null) {
            }
            if (sublayer != null) {
            }
        }
        aVar.d = conflictResolutionMode2;
        return zy11.a;
    }

    public final void b() {
        hbp0 hbp0Var = this.c;
        if (hbp0Var.d()) {
            return;
        }
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new PinWarMapkitConflictsResolver$attach$1(this, null), 3);
    }

    public final void c(ConflictResolutionMode conflictResolutionMode) {
        Sublayer sublayer;
        Map map = ((gh00) this.a).b;
        SublayerManager sublayerManager = map != null ? map.getSublayerManager() : null;
        String s = k.s();
        if (s == null) {
            return;
        }
        Integer findFirstOf = sublayerManager != null ? sublayerManager.findFirstOf(s, e) : null;
        if (findFirstOf == null || (sublayer = sublayerManager.get(findFirstOf.intValue())) == null) {
            return;
        }
        sublayer.setConflictResolutionMode(conflictResolutionMode);
    }
}
