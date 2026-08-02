package com.yandex.go.scooters.zones.legend.ui;

import android.graphics.drawable.BitmapDrawable;
import defpackage.fap0;
import defpackage.hap0;
import defpackage.iap0;
import defpackage.ny61;
import defpackage.rap0;
import defpackage.sap0;
import defpackage.tap0;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class b {
    public final ru.yandex.taxi.widget.utils.e a;

    public b(ru.yandex.taxi.widget.utils.e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tap0 tap0Var, ContinuationImpl continuationImpl) {
        ScootersZonesLegendContentItemMapper$mapButtonItem$1 scootersZonesLegendContentItemMapper$mapButtonItem$1;
        int i;
        if (continuationImpl instanceof ScootersZonesLegendContentItemMapper$mapButtonItem$1) {
            scootersZonesLegendContentItemMapper$mapButtonItem$1 = (ScootersZonesLegendContentItemMapper$mapButtonItem$1) continuationImpl;
            int i2 = scootersZonesLegendContentItemMapper$mapButtonItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersZonesLegendContentItemMapper$mapButtonItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersZonesLegendContentItemMapper$mapButtonItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersZonesLegendContentItemMapper$mapButtonItem$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = tap0Var.d;
                    scootersZonesLegendContentItemMapper$mapButtonItem$1.L$0 = null;
                    scootersZonesLegendContentItemMapper$mapButtonItem$1.label = 1;
                    obj = this.a.t(formattedText, scootersZonesLegendContentItemMapper$mapButtonItem$1);
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
                return new fap0((CharSequence) obj);
            }
        }
        scootersZonesLegendContentItemMapper$mapButtonItem$1 = new ScootersZonesLegendContentItemMapper$mapButtonItem$1(this, continuationImpl);
        Object obj2 = scootersZonesLegendContentItemMapper$mapButtonItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersZonesLegendContentItemMapper$mapButtonItem$1.label;
        if (i != 0) {
        }
        return new fap0((CharSequence) obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e0, code lost:
    
        if (r1 != r3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00e0 -> B:11:0x00e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(tap0 tap0Var, ContinuationImpl continuationImpl) {
        ScootersZonesLegendContentItemMapper$mapZoneListItem$1 scootersZonesLegendContentItemMapper$mapZoneListItem$1;
        int i;
        Collection arrayList;
        Iterator it;
        Collection collection;
        Iterator it2;
        sap0 sap0Var;
        sap0 sap0Var2;
        CharSequence charSequence;
        if (continuationImpl instanceof ScootersZonesLegendContentItemMapper$mapZoneListItem$1) {
            scootersZonesLegendContentItemMapper$mapZoneListItem$1 = (ScootersZonesLegendContentItemMapper$mapZoneListItem$1) continuationImpl;
            int i2 = scootersZonesLegendContentItemMapper$mapZoneListItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersZonesLegendContentItemMapper$mapZoneListItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersZonesLegendContentItemMapper$mapZoneListItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersZonesLegendContentItemMapper$mapZoneListItem$1.label;
                ru.yandex.taxi.widget.utils.e eVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = tap0Var.c;
                    arrayList = new ArrayList(tcc.n(list, 10));
                    it = list.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        arrayList = (Collection) scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$8;
                        charSequence = (CharSequence) scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$7;
                        sap0Var2 = (sap0) scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$6;
                        it2 = (Iterator) scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$4;
                        collection = (Collection) scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$3;
                        kotlin.b.b(obj);
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                        rap0 rap0Var = sap0Var2.b;
                        arrayList.add(new iap0(charSequence, new hap0(bitmapDrawable, rap0Var.b, rap0Var.c, rap0Var.d, rap0Var.e, rap0Var.f)));
                        it = it2;
                        arrayList = collection;
                        if (it.hasNext()) {
                            return (List) arrayList;
                        }
                        sap0Var = (sap0) it.next();
                        FormattedText formattedText = sap0Var.a;
                        scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$0 = null;
                        scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$1 = null;
                        scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$2 = null;
                        scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$3 = arrayList;
                        scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$4 = it;
                        scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$5 = null;
                        scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$6 = sap0Var;
                        scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$7 = arrayList;
                        scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$8 = null;
                        scootersZonesLegendContentItemMapper$mapZoneListItem$1.label = 1;
                        Object t = eVar.t(formattedText, scootersZonesLegendContentItemMapper$mapZoneListItem$1);
                        if (t != coroutineSingletons) {
                            it2 = it;
                            collection = arrayList;
                            obj = t;
                            sap0Var2 = sap0Var;
                            charSequence = (CharSequence) obj;
                            String str = sap0Var2.b.a;
                            scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$0 = null;
                            scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$1 = null;
                            scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$2 = null;
                            scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$3 = collection;
                            scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$4 = it2;
                            scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$5 = null;
                            scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$6 = sap0Var2;
                            scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$7 = charSequence;
                            scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$8 = arrayList;
                            scootersZonesLegendContentItemMapper$mapZoneListItem$1.label = 2;
                            obj = ru.yandex.taxi.widget.utils.e.f(eVar, str, null, scootersZonesLegendContentItemMapper$mapZoneListItem$1, 6);
                        }
                        return coroutineSingletons;
                    }
                    arrayList = (Collection) scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$7;
                    sap0Var = (sap0) scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$6;
                    Iterator it3 = (Iterator) scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$4;
                    Collection collection2 = (Collection) scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$3;
                    kotlin.b.b(obj);
                    collection = collection2;
                    it2 = it3;
                    sap0Var2 = sap0Var;
                    charSequence = (CharSequence) obj;
                    String str2 = sap0Var2.b.a;
                    scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$0 = null;
                    scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$1 = null;
                    scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$2 = null;
                    scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$3 = collection;
                    scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$4 = it2;
                    scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$5 = null;
                    scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$6 = sap0Var2;
                    scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$7 = charSequence;
                    scootersZonesLegendContentItemMapper$mapZoneListItem$1.L$8 = arrayList;
                    scootersZonesLegendContentItemMapper$mapZoneListItem$1.label = 2;
                    obj = ru.yandex.taxi.widget.utils.e.f(eVar, str2, null, scootersZonesLegendContentItemMapper$mapZoneListItem$1, 6);
                }
            }
        }
        scootersZonesLegendContentItemMapper$mapZoneListItem$1 = new ScootersZonesLegendContentItemMapper$mapZoneListItem$1(this, continuationImpl);
        Object obj2 = scootersZonesLegendContentItemMapper$mapZoneListItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersZonesLegendContentItemMapper$mapZoneListItem$1.label;
        ru.yandex.taxi.widget.utils.e eVar2 = this.a;
        if (i != 0) {
        }
    }
}
