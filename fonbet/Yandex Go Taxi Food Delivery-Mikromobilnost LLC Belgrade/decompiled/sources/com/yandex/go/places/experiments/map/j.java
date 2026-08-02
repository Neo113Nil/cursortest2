package com.yandex.go.places.experiments.map;

import com.yandex.go.places.experiments.map.PlacesMapScreenExperiment;
import com.yandex.go.places.models.data.entities.network.CategoryFilterType;
import com.yandex.go.places.models.data.entities.network.ImageDto;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$RevealingState;
import defpackage.cav;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.hbc0;
import defpackage.i3y;
import defpackage.ibc0;
import defpackage.jbc0;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.scc;
import defpackage.t1b0;
import defpackage.t9b0;
import defpackage.w511;
import defpackage.wac0;
import defpackage.xac0;
import defpackage.yac0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class j {
    public final rqo a;
    public final k7x0 b;
    public final i3y c = kotlin.a.b(LazyThreadSafetyMode.NONE, new t9b0(20, this));

    public j(rqo rqoVar, k7x0 k7x0Var) {
        this.a = rqoVar;
        this.b = k7x0Var;
    }

    public static final cav f(ImageDto imageDto, j jVar) {
        String str = imageDto.b;
        return new cav(str != null ? ((m7x0) jVar.b).a(str) : null, imageDto.b);
    }

    public static PlacesMapConfig$PlacesMapScreenName g(PlacesMapScreenExperiment.Screen screen) {
        int i = i.b[screen.ordinal()];
        if (i == 1) {
            return PlacesMapConfig$PlacesMapScreenName.PLACES_MAIN;
        }
        if (i == 2) {
            return PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATIONS_LIST;
        }
        if (i == 3) {
            return PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATION_CARD;
        }
        if (i == 4) {
            return PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATIONS_LIST_V2;
        }
        if (i == 5) {
            return null;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName, ContinuationImpl continuationImpl) {
        PlacesMapScreenExperimentRepository$getCardOptionForScreen$1 placesMapScreenExperimentRepository$getCardOptionForScreen$1;
        int i;
        List list;
        if (continuationImpl instanceof PlacesMapScreenExperimentRepository$getCardOptionForScreen$1) {
            placesMapScreenExperimentRepository$getCardOptionForScreen$1 = (PlacesMapScreenExperimentRepository$getCardOptionForScreen$1) continuationImpl;
            int i2 = placesMapScreenExperimentRepository$getCardOptionForScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapScreenExperimentRepository$getCardOptionForScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapScreenExperimentRepository$getCardOptionForScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapScreenExperimentRepository$getCardOptionForScreen$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 t1b0Var = (t1b0) this.c.getValue();
                    placesMapScreenExperimentRepository$getCardOptionForScreen$1.L$0 = placesMapConfig$PlacesMapScreenName;
                    placesMapScreenExperimentRepository$getCardOptionForScreen$1.label = 1;
                    obj = t1b0Var.b(placesMapScreenExperimentRepository$getCardOptionForScreen$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    placesMapConfig$PlacesMapScreenName = (PlacesMapConfig$PlacesMapScreenName) placesMapScreenExperimentRepository$getCardOptionForScreen$1.L$0;
                    kotlin.b.b(obj);
                }
                list = ((PlacesMapScreenExperiment) obj).k;
                if (list != null) {
                    return null;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (g(((PlacesMapScreenExperiment.CardOption) next).a) == placesMapConfig$PlacesMapScreenName) {
                        obj2 = next;
                        break;
                    }
                }
                return (PlacesMapScreenExperiment.CardOption) obj2;
            }
        }
        placesMapScreenExperimentRepository$getCardOptionForScreen$1 = new PlacesMapScreenExperimentRepository$getCardOptionForScreen$1(this, continuationImpl);
        Object obj3 = placesMapScreenExperimentRepository$getCardOptionForScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapScreenExperimentRepository$getCardOptionForScreen$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        list = ((PlacesMapScreenExperiment) obj3).k;
        if (list != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.yandex.go.places.models.data.entities.network.CategoryFilterType] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.yandex.go.places.models.data.entities.network.CategoryFilterType] */
    /* JADX WARN: Type inference failed for: r15v2, types: [ibc0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4, types: [m7x0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName, ContinuationImpl continuationImpl) {
        PlacesMapScreenExperimentRepository$getCategoryFilters$1 placesMapScreenExperimentRepository$getCategoryFilters$1;
        int i;
        PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName2;
        List list;
        PlacesMapScreenExperiment.CardOption cardOption;
        ArrayList arrayList;
        List list2;
        Throwable th;
        Throwable th2;
        Object obj;
        if (continuationImpl instanceof PlacesMapScreenExperimentRepository$getCategoryFilters$1) {
            placesMapScreenExperimentRepository$getCategoryFilters$1 = (PlacesMapScreenExperimentRepository$getCategoryFilters$1) continuationImpl;
            int i2 = placesMapScreenExperimentRepository$getCategoryFilters$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapScreenExperimentRepository$getCategoryFilters$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = placesMapScreenExperimentRepository$getCategoryFilters$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapScreenExperimentRepository$getCategoryFilters$1.label;
                boolean z = true;
                Throwable th3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    t1b0 t1b0Var = (t1b0) this.c.getValue();
                    placesMapScreenExperimentRepository$getCategoryFilters$1.L$0 = placesMapConfig$PlacesMapScreenName;
                    placesMapScreenExperimentRepository$getCategoryFilters$1.label = 1;
                    obj2 = t1b0Var.b(placesMapScreenExperimentRepository$getCategoryFilters$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    placesMapConfig$PlacesMapScreenName2 = placesMapConfig$PlacesMapScreenName;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    placesMapConfig$PlacesMapScreenName2 = (PlacesMapConfig$PlacesMapScreenName) placesMapScreenExperimentRepository$getCategoryFilters$1.L$0;
                    kotlin.b.b(obj2);
                }
                PlacesMapScreenExperiment placesMapScreenExperiment = (PlacesMapScreenExperiment) obj2;
                list = placesMapScreenExperiment.k;
                if (list == null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (g(((PlacesMapScreenExperiment.CardOption) obj).a) == placesMapConfig$PlacesMapScreenName2) {
                            break;
                        }
                    }
                    cardOption = (PlacesMapScreenExperiment.CardOption) obj;
                } else {
                    cardOption = null;
                }
                if (cardOption != null || (list2 = cardOption.i) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int i3 = 0;
                    for (Object obj3 : list2) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            Throwable th4 = th3;
                            scc.m();
                            throw th4;
                        }
                        PlacesMapScreenExperiment.CategoryFilter categoryFilter = (PlacesMapScreenExperiment.CategoryFilter) obj3;
                        Map map = placesMapScreenExperiment.b;
                        CategoryFilterType categoryFilterType = categoryFilter.e;
                        String str = categoryFilter.b;
                        PlacesMapScreenExperiment.CategoryFilterAction categoryFilterAction = categoryFilter.d;
                        boolean z2 = (categoryFilterType == 0 || categoryFilterType == CategoryFilterType.UNKNOWN) ? false : z;
                        Object obj4 = CategoryFilterType.CATEGORY;
                        Object obj5 = !z2 ? obj4 : th3;
                        if (obj5 != null) {
                            categoryFilterType = obj5;
                        } else if (categoryFilterType == 0) {
                            categoryFilterType = CategoryFilterType.UNKNOWN;
                        }
                        if (categoryFilterType == obj4 && evu0.J(categoryFilterAction.b)) {
                            Throwable th5 = th3;
                            th = th5;
                            th2 = th5;
                        } else {
                            String str2 = str == null ? "" : str;
                            th = th3;
                            String str3 = str2 + "_" + categoryFilterType.name() + "_" + i3;
                            String str4 = categoryFilter.f;
                            String str5 = str4 == null ? "" : str4;
                            ImageDto imageDto = categoryFilter.a;
                            ?? r4 = imageDto != null ? imageDto.b : th;
                            if (r4 == 0) {
                                r4 = "";
                            }
                            String a = ((m7x0) this.b).a(r4);
                            String str6 = (String) map.get(str);
                            th2 = new ibc0(str3, str5, a, str6 == null ? "" : str6, (String) map.get(categoryFilter.c), new jbc0(categoryFilterAction.a, categoryFilterAction.c, categoryFilterAction.b), categoryFilterType, z2, false);
                        }
                        if (th2 != null) {
                            arrayList2.add(th2);
                        }
                        i3 = i4;
                        th3 = th;
                        z = true;
                    }
                    arrayList = arrayList2;
                }
                return arrayList != null ? EmptyList.a : arrayList;
            }
        }
        placesMapScreenExperimentRepository$getCategoryFilters$1 = new PlacesMapScreenExperimentRepository$getCategoryFilters$1(this, continuationImpl);
        Object obj22 = placesMapScreenExperimentRepository$getCategoryFilters$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapScreenExperimentRepository$getCategoryFilters$1.label;
        boolean z3 = true;
        Throwable th32 = null;
        if (i != 0) {
        }
        PlacesMapScreenExperiment placesMapScreenExperiment2 = (PlacesMapScreenExperiment) obj22;
        list = placesMapScreenExperiment2.k;
        if (list == null) {
        }
        if (cardOption != null) {
        }
        arrayList = null;
        if (arrayList != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r19v0, types: [wac0] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$RevealingState] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [xac0] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        PlacesMapScreenExperimentRepository$getMapConfig$1 placesMapScreenExperimentRepository$getMapConfig$1;
        int i;
        double d;
        List<PlacesMapScreenExperiment.CardOption> list;
        boolean z;
        List list2;
        ArrayList arrayList;
        boolean z2;
        ?? r23;
        Double d2;
        ?? r24;
        Double d3;
        ?? r25;
        PlacesMapScreenExperiment.RevealingState revealingState;
        ?? r26;
        Double wac0Var;
        PlacesMapConfig$RevealingState placesMapConfig$RevealingState;
        if (continuationImpl instanceof PlacesMapScreenExperimentRepository$getMapConfig$1) {
            placesMapScreenExperimentRepository$getMapConfig$1 = (PlacesMapScreenExperimentRepository$getMapConfig$1) continuationImpl;
            int i2 = placesMapScreenExperimentRepository$getMapConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapScreenExperimentRepository$getMapConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapScreenExperimentRepository$getMapConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapScreenExperimentRepository$getMapConfig$1.label;
                Double d4 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 t1b0Var = (t1b0) this.c.getValue();
                    placesMapScreenExperimentRepository$getMapConfig$1.label = 1;
                    obj = t1b0Var.b(placesMapScreenExperimentRepository$getMapConfig$1);
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
                PlacesMapScreenExperiment placesMapScreenExperiment = (PlacesMapScreenExperiment) obj;
                boolean z3 = placesMapScreenExperiment.c;
                String str = placesMapScreenExperiment.g;
                float f = (float) placesMapScreenExperiment.d;
                int i3 = placesMapScreenExperiment.e;
                d = placesMapScreenExperiment.f;
                double d5 = 0.0d;
                if (d <= 0.0d) {
                    d = 1.0d;
                }
                long j = (long) (d * 1000.0d);
                double d6 = 1.0d;
                boolean z4 = placesMapScreenExperiment.h;
                String Y = d6z.Y(placesMapScreenExperiment, placesMapScreenExperiment.i);
                String Y2 = d6z.Y(placesMapScreenExperiment, placesMapScreenExperiment.j);
                list = placesMapScreenExperiment.k;
                if (list == null) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = arrayList2;
                    for (PlacesMapScreenExperiment.CardOption cardOption : list) {
                        Double d7 = d4;
                        double d8 = d5;
                        PlacesMapConfig$PlacesMapScreenName g = g(cardOption.a);
                        if (g == null) {
                            wac0Var = d7;
                            arrayList = arrayList3;
                            z2 = z4;
                        } else {
                            String str2 = cardOption.b;
                            arrayList = arrayList3;
                            float f2 = (float) cardOption.c;
                            Double d9 = cardOption.d;
                            if (d9 != null) {
                                if (d9.doubleValue() <= d8) {
                                    d9 = d7;
                                }
                                if (d9 != null) {
                                    z2 = z4;
                                    r23 = Float.valueOf((float) d9.doubleValue());
                                    d2 = cardOption.e;
                                    if (d2 != null) {
                                        double doubleValue = d2.doubleValue();
                                        if (doubleValue <= d8 || doubleValue > d6) {
                                            d2 = d7;
                                        }
                                        if (d2 != null) {
                                            r24 = Float.valueOf((float) d2.doubleValue());
                                            d3 = cardOption.f;
                                            if (d3 != null) {
                                                double doubleValue2 = d3.doubleValue();
                                                if (doubleValue2 <= d8 || doubleValue2 > d6) {
                                                    d3 = d7;
                                                }
                                                if (d3 != null) {
                                                    r25 = Float.valueOf((float) d3.doubleValue());
                                                    revealingState = cardOption.g;
                                                    if (revealingState == null) {
                                                        int i4 = i.a[revealingState.ordinal()];
                                                        if (i4 == 1) {
                                                            placesMapConfig$RevealingState = PlacesMapConfig$RevealingState.ANCHORED;
                                                        } else if (i4 == 2) {
                                                            placesMapConfig$RevealingState = PlacesMapConfig$RevealingState.EXPANDED;
                                                        } else {
                                                            if (i4 != 3) {
                                                                w511.b();
                                                                return d7;
                                                            }
                                                            placesMapConfig$RevealingState = PlacesMapConfig$RevealingState.COLLAPSED;
                                                        }
                                                        r26 = placesMapConfig$RevealingState;
                                                    } else {
                                                        r26 = d7;
                                                    }
                                                    String str3 = cardOption.h;
                                                    PlacesMapScreenExperiment.SliderMapUpdatesConfig sliderMapUpdatesConfig = cardOption.l;
                                                    wac0Var = new wac0(g, str2, f2, r23, r24, r25, r26, str3, sliderMapUpdatesConfig == null ? new xac0(sliderMapUpdatesConfig.a, sliderMapUpdatesConfig.b, sliderMapUpdatesConfig.c) : d7);
                                                }
                                            }
                                            r25 = d7;
                                            revealingState = cardOption.g;
                                            if (revealingState == null) {
                                            }
                                            String str32 = cardOption.h;
                                            PlacesMapScreenExperiment.SliderMapUpdatesConfig sliderMapUpdatesConfig2 = cardOption.l;
                                            wac0Var = new wac0(g, str2, f2, r23, r24, r25, r26, str32, sliderMapUpdatesConfig2 == null ? new xac0(sliderMapUpdatesConfig2.a, sliderMapUpdatesConfig2.b, sliderMapUpdatesConfig2.c) : d7);
                                        }
                                    }
                                    r24 = d7;
                                    d3 = cardOption.f;
                                    if (d3 != null) {
                                    }
                                    r25 = d7;
                                    revealingState = cardOption.g;
                                    if (revealingState == null) {
                                    }
                                    String str322 = cardOption.h;
                                    PlacesMapScreenExperiment.SliderMapUpdatesConfig sliderMapUpdatesConfig22 = cardOption.l;
                                    wac0Var = new wac0(g, str2, f2, r23, r24, r25, r26, str322, sliderMapUpdatesConfig22 == null ? new xac0(sliderMapUpdatesConfig22.a, sliderMapUpdatesConfig22.b, sliderMapUpdatesConfig22.c) : d7);
                                }
                            }
                            z2 = z4;
                            r23 = d7;
                            d2 = cardOption.e;
                            if (d2 != null) {
                            }
                            r24 = d7;
                            d3 = cardOption.f;
                            if (d3 != null) {
                            }
                            r25 = d7;
                            revealingState = cardOption.g;
                            if (revealingState == null) {
                            }
                            String str3222 = cardOption.h;
                            PlacesMapScreenExperiment.SliderMapUpdatesConfig sliderMapUpdatesConfig222 = cardOption.l;
                            wac0Var = new wac0(g, str2, f2, r23, r24, r25, r26, str3222, sliderMapUpdatesConfig222 == null ? new xac0(sliderMapUpdatesConfig222.a, sliderMapUpdatesConfig222.b, sliderMapUpdatesConfig222.c) : d7);
                        }
                        ArrayList arrayList4 = arrayList;
                        if (wac0Var != null) {
                            arrayList4.add(wac0Var);
                        }
                        d4 = d7;
                        arrayList3 = arrayList4;
                        d5 = d8;
                        z4 = z2;
                        d6 = 1.0d;
                    }
                    z = z4;
                    list2 = arrayList3;
                } else {
                    z = z4;
                    list2 = EmptyList.a;
                }
                return new yac0(z3, str, f, i3, j, z, Y, Y2, list2);
            }
        }
        placesMapScreenExperimentRepository$getMapConfig$1 = new PlacesMapScreenExperimentRepository$getMapConfig$1(this, continuationImpl);
        Object obj2 = placesMapScreenExperimentRepository$getMapConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapScreenExperimentRepository$getMapConfig$1.label;
        Double d42 = null;
        if (i != 0) {
        }
        PlacesMapScreenExperiment placesMapScreenExperiment2 = (PlacesMapScreenExperiment) obj2;
        boolean z32 = placesMapScreenExperiment2.c;
        String str4 = placesMapScreenExperiment2.g;
        float f3 = (float) placesMapScreenExperiment2.d;
        int i32 = placesMapScreenExperiment2.e;
        d = placesMapScreenExperiment2.f;
        double d52 = 0.0d;
        if (d <= 0.0d) {
        }
        long j2 = (long) (d * 1000.0d);
        double d62 = 1.0d;
        boolean z42 = placesMapScreenExperiment2.h;
        String Y3 = d6z.Y(placesMapScreenExperiment2, placesMapScreenExperiment2.i);
        String Y22 = d6z.Y(placesMapScreenExperiment2, placesMapScreenExperiment2.j);
        list = placesMapScreenExperiment2.k;
        if (list == null) {
        }
        return new yac0(z32, str4, f3, i32, j2, z, Y3, Y22, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName, ContinuationImpl continuationImpl) {
        PlacesMapScreenExperimentRepository$getNearbyDistance$1 placesMapScreenExperimentRepository$getNearbyDistance$1;
        int i;
        PlacesMapScreenExperiment.CardOption cardOption;
        if (continuationImpl instanceof PlacesMapScreenExperimentRepository$getNearbyDistance$1) {
            placesMapScreenExperimentRepository$getNearbyDistance$1 = (PlacesMapScreenExperimentRepository$getNearbyDistance$1) continuationImpl;
            int i2 = placesMapScreenExperimentRepository$getNearbyDistance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapScreenExperimentRepository$getNearbyDistance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapScreenExperimentRepository$getNearbyDistance$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapScreenExperimentRepository$getNearbyDistance$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    placesMapScreenExperimentRepository$getNearbyDistance$1.L$0 = null;
                    placesMapScreenExperimentRepository$getNearbyDistance$1.label = 1;
                    obj = a(placesMapConfig$PlacesMapScreenName, placesMapScreenExperimentRepository$getNearbyDistance$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                cardOption = (PlacesMapScreenExperiment.CardOption) obj;
                if (cardOption == null) {
                    return cardOption.j;
                }
                return null;
            }
        }
        placesMapScreenExperimentRepository$getNearbyDistance$1 = new PlacesMapScreenExperimentRepository$getNearbyDistance$1(this, continuationImpl);
        Object obj3 = placesMapScreenExperimentRepository$getNearbyDistance$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapScreenExperimentRepository$getNearbyDistance$1.label;
        if (i != 0) {
        }
        cardOption = (PlacesMapScreenExperiment.CardOption) obj3;
        if (cardOption == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName, ContinuationImpl continuationImpl) {
        PlacesMapScreenExperimentRepository$getPinImages$1 placesMapScreenExperimentRepository$getPinImages$1;
        int i;
        PlacesMapScreenExperiment.CardOption cardOption;
        PlacesMapScreenExperiment.PinTags pinTags;
        if (continuationImpl instanceof PlacesMapScreenExperimentRepository$getPinImages$1) {
            placesMapScreenExperimentRepository$getPinImages$1 = (PlacesMapScreenExperimentRepository$getPinImages$1) continuationImpl;
            int i2 = placesMapScreenExperimentRepository$getPinImages$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesMapScreenExperimentRepository$getPinImages$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesMapScreenExperimentRepository$getPinImages$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesMapScreenExperimentRepository$getPinImages$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    placesMapScreenExperimentRepository$getPinImages$1.L$0 = null;
                    placesMapScreenExperimentRepository$getPinImages$1.label = 1;
                    obj = a(placesMapConfig$PlacesMapScreenName, placesMapScreenExperimentRepository$getPinImages$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                cardOption = (PlacesMapScreenExperiment.CardOption) obj;
                if (cardOption != null || (pinTags = cardOption.k) == null) {
                    return null;
                }
                ImageDto imageDto = pinTags.a;
                cav f = imageDto != null ? f(imageDto, this) : null;
                ImageDto imageDto2 = pinTags.b;
                cav f2 = imageDto2 != null ? f(imageDto2, this) : null;
                ImageDto imageDto3 = pinTags.c;
                cav f3 = imageDto3 != null ? f(imageDto3, this) : null;
                ImageDto imageDto4 = pinTags.d;
                cav f4 = imageDto4 != null ? f(imageDto4, this) : null;
                ImageDto imageDto5 = pinTags.e;
                cav f5 = imageDto5 != null ? f(imageDto5, this) : null;
                ImageDto imageDto6 = pinTags.f;
                cav f6 = imageDto6 != null ? f(imageDto6, this) : null;
                ImageDto imageDto7 = pinTags.g;
                cav f7 = imageDto7 != null ? f(imageDto7, this) : null;
                ImageDto imageDto8 = pinTags.h;
                return new hbc0(f, f2, f3, f4, f5, f6, f7, imageDto8 != null ? f(imageDto8, this) : null);
            }
        }
        placesMapScreenExperimentRepository$getPinImages$1 = new PlacesMapScreenExperimentRepository$getPinImages$1(this, continuationImpl);
        Object obj3 = placesMapScreenExperimentRepository$getPinImages$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesMapScreenExperimentRepository$getPinImages$1.label;
        if (i != 0) {
        }
        cardOption = (PlacesMapScreenExperiment.CardOption) obj3;
        if (cardOption != null) {
        }
        return null;
    }
}
