package com.yandex.go.copter.city_tour;

import com.yandex.go.copter.city_tour.api.CityToursResponse;
import com.yandex.go.copter.experiment.CopterOrderFlowExperiment;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.bvf0;
import defpackage.d6z;
import defpackage.dxb;
import defpackage.exb;
import defpackage.fxb;
import defpackage.gxb;
import defpackage.mth;
import defpackage.ny61;
import defpackage.owb;
import defpackage.pwb;
import defpackage.roe;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.uwb;
import defpackage.voe;
import defpackage.vqb;
import defpackage.wiq0;
import defpackage.wp2;
import defpackage.yp2;
import defpackage.yt11;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class d implements yt11 {
    public final voe a;
    public final yp2 b;
    public final wiq0 c;
    public final ru.yandex.taxi.widget.c d;
    public final pwb e;
    public final c f;
    public final CopterOrderFlowExperiment g;
    public final String h;
    public final r0 i;
    public final mth j;
    public Map k;
    public boolean l;

    public d(voe voeVar, yp2 yp2Var, wiq0 wiq0Var, ru.yandex.taxi.widget.c cVar, pwb pwbVar, c cVar2, roe roeVar) {
        this.a = voeVar;
        this.b = yp2Var;
        this.c = wiq0Var;
        this.d = cVar;
        this.e = pwbVar;
        this.f = cVar2;
        CopterOrderFlowExperiment a = roeVar.a();
        this.g = a;
        CopterOrderFlowExperiment.CityTourSettings cityTourSettings = a.f;
        String str = cityTourSettings != null ? cityTourSettings.b : null;
        this.h = str == null ? "" : str;
        r0 c = bvf0.c(null);
        this.i = c;
        this.j = new mth(e.d(c), 6);
        this.k = kotlin.collections.b.f();
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (h(r2) == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005b, code lost:
    
        if (r1 == r3) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        CityTourSelectorInteractor$loadCityTours$1 cityTourSelectorInteractor$loadCityTours$1;
        int i;
        CityToursResponse cityToursResponse;
        int i2;
        owb owbVar;
        if (continuationImpl instanceof CityTourSelectorInteractor$loadCityTours$1) {
            cityTourSelectorInteractor$loadCityTours$1 = (CityTourSelectorInteractor$loadCityTours$1) continuationImpl;
            int i3 = cityTourSelectorInteractor$loadCityTours$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cityTourSelectorInteractor$loadCityTours$1.label = i3 - Integer.MIN_VALUE;
                Object obj = cityTourSelectorInteractor$loadCityTours$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cityTourSelectorInteractor$loadCityTours$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    vqb vqbVar = new vqb(5, this);
                    cityTourSelectorInteractor$loadCityTours$1.label = 1;
                    obj = this.f.a(this.h, vqbVar, cityTourSelectorInteractor$loadCityTours$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                cityToursResponse = (CityToursResponse) obj;
                if (cityToursResponse != null) {
                    cityTourSelectorInteractor$loadCityTours$1.L$0 = null;
                    cityTourSelectorInteractor$loadCityTours$1.label = 2;
                } else {
                    List<CityToursResponse.Choice> list = cityToursResponse.d;
                    MapBuilder mapBuilder = new MapBuilder();
                    for (CityToursResponse.Choice choice : list) {
                        Integer num = choice.a;
                        if (num != null) {
                            int intValue = num.intValue();
                            List<CityToursResponse.Choice.TourPoint> list2 = choice.e;
                            ArrayList arrayList = new ArrayList();
                            for (CityToursResponse.Choice.TourPoint tourPoint : list2) {
                                Double d = tourPoint.a;
                                Double d2 = tourPoint.b;
                                if (d == null || d2 == null) {
                                    i2 = intValue;
                                    owbVar = null;
                                } else {
                                    i2 = intValue;
                                    owbVar = new owb(d.doubleValue(), d2.doubleValue());
                                }
                                if (owbVar != null) {
                                    arrayList.add(owbVar);
                                }
                                intValue = i2;
                            }
                            mapBuilder.put(Integer.valueOf(intValue), new uwb(arrayList, choice.f));
                        }
                    }
                    this.k = mapBuilder.j();
                    cityTourSelectorInteractor$loadCityTours$1.L$0 = null;
                    cityTourSelectorInteractor$loadCityTours$1.label = 3;
                    Object f = f(cityToursResponse, cityTourSelectorInteractor$loadCityTours$1);
                    if (f != obj2) {
                        return f;
                    }
                }
                return obj2;
            }
        }
        cityTourSelectorInteractor$loadCityTours$1 = new CityTourSelectorInteractor$loadCityTours$1(this, continuationImpl);
        Object obj3 = cityTourSelectorInteractor$loadCityTours$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cityTourSelectorInteractor$loadCityTours$1.label;
        if (i != 0) {
        }
        cityToursResponse = (CityToursResponse) obj3;
        if (cityToursResponse != null) {
        }
        return obj22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (g(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Continuation continuation) {
        CityTourSelectorInteractor$onModalViewOpen$1 cityTourSelectorInteractor$onModalViewOpen$1;
        int i;
        if (continuation instanceof CityTourSelectorInteractor$onModalViewOpen$1) {
            cityTourSelectorInteractor$onModalViewOpen$1 = (CityTourSelectorInteractor$onModalViewOpen$1) continuation;
            int i2 = cityTourSelectorInteractor$onModalViewOpen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cityTourSelectorInteractor$onModalViewOpen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cityTourSelectorInteractor$onModalViewOpen$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cityTourSelectorInteractor$onModalViewOpen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.l = false;
                    voe voeVar = this.a;
                    voeVar.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("requirement", this.h);
                    voeVar.a.a("Copters.CityTourCard.Shown", hashMap, 1, new HashMap());
                    cityTourSelectorInteractor$onModalViewOpen$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                cityTourSelectorInteractor$onModalViewOpen$1.label = 2;
                Object b = b(cityTourSelectorInteractor$onModalViewOpen$1);
                return b != obj2 ? obj2 : b;
            }
        }
        cityTourSelectorInteractor$onModalViewOpen$1 = new CityTourSelectorInteractor$onModalViewOpen$1(this, (ContinuationImpl) continuation);
        Object obj3 = cityTourSelectorInteractor$onModalViewOpen$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cityTourSelectorInteractor$onModalViewOpen$1.label;
        if (i != 0) {
        }
        cityTourSelectorInteractor$onModalViewOpen$1.label = 2;
        Object b2 = b(cityTourSelectorInteractor$onModalViewOpen$1);
        if (b2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (g(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        CityTourSelectorInteractor$onReloadClicked$1 cityTourSelectorInteractor$onReloadClicked$1;
        int i;
        if (continuationImpl instanceof CityTourSelectorInteractor$onReloadClicked$1) {
            cityTourSelectorInteractor$onReloadClicked$1 = (CityTourSelectorInteractor$onReloadClicked$1) continuationImpl;
            int i2 = cityTourSelectorInteractor$onReloadClicked$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cityTourSelectorInteractor$onReloadClicked$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cityTourSelectorInteractor$onReloadClicked$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cityTourSelectorInteractor$onReloadClicked$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cityTourSelectorInteractor$onReloadClicked$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                cityTourSelectorInteractor$onReloadClicked$1.label = 2;
                Object b = b(cityTourSelectorInteractor$onReloadClicked$1);
                return b != obj2 ? obj2 : b;
            }
        }
        cityTourSelectorInteractor$onReloadClicked$1 = new CityTourSelectorInteractor$onReloadClicked$1(this, continuationImpl);
        Object obj3 = cityTourSelectorInteractor$onReloadClicked$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cityTourSelectorInteractor$onReloadClicked$1.label;
        if (i != 0) {
        }
        cityTourSelectorInteractor$onReloadClicked$1.label = 2;
        Object b2 = b(cityTourSelectorInteractor$onReloadClicked$1);
        if (b2 != obj22) {
        }
    }

    public final Object e(FormattedText formattedText, ContinuationImpl continuationImpl) {
        if (formattedText == null) {
            return null;
        }
        CityTourSelectorInteractor$prepare$2 cityTourSelectorInteractor$prepare$2 = new CityTourSelectorInteractor$prepare$2(1, this.g, d6z.class, "textByKey", "textByKey(Lru/yandex/taxi/common_models/net/LocalizedExperiment;Ljava/lang/String;)Ljava/lang/String;", 1);
        List<Object> list = formattedText.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (Object obj : list) {
            if (obj instanceof FormattedText.d) {
                obj = (FormattedText.d) obj;
            } else if (obj instanceof FormattedText.h) {
                FormattedText.h hVar = (FormattedText.h) obj;
                CharSequence charSequence = hVar.a;
                CharSequence charSequence2 = (CharSequence) cityTourSelectorInteractor$prepare$2.invoke(charSequence);
                if (charSequence2.length() != 0) {
                    charSequence = charSequence2;
                }
                obj = FormattedText.h.e(hVar, (String) charSequence, null, null, 2046);
            }
            arrayList.add(obj);
        }
        Object i = ru.yandex.taxi.widget.c.i(this.d, new FormattedText(arrayList), null, continuationImpl, 30);
        return i == CoroutineSingletons.COROUTINE_SUSPENDED ? i : (CharSequence) i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0160, code lost:
    
        if (r1 == r3) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0199, code lost:
    
        if (r1 == r3) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e4, code lost:
    
        if (r1 == r3) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0199 -> B:19:0x019c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01a4 -> B:20:0x01a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x01b4 -> B:21:0x01b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(CityToursResponse cityToursResponse, ContinuationImpl continuationImpl) {
        CityTourSelectorInteractor$showContentState$1 cityTourSelectorInteractor$showContentState$1;
        int i;
        CityToursResponse cityToursResponse2;
        CharSequence charSequence;
        CopterOrderFlowExperiment.CityTourSettings.Modal modal;
        FormattedText formattedText;
        CopterOrderFlowExperiment.CityTourSettings cityTourSettings;
        CityToursResponse cityToursResponse3;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CopterOrderFlowExperiment.CityTourSettings.Modal modal2;
        FormattedText formattedText2;
        CharSequence charSequence4;
        CharSequence charSequence5;
        Collection arrayList;
        Iterator it;
        CharSequence charSequence6;
        CityToursResponse.Choice choice;
        CharSequence charSequence7;
        int i2;
        Iterator it2;
        CharSequence charSequence8;
        Collection collection;
        FormattedText formattedText3;
        CityToursResponse.Choice choice2;
        if (continuationImpl instanceof CityTourSelectorInteractor$showContentState$1) {
            cityTourSelectorInteractor$showContentState$1 = (CityTourSelectorInteractor$showContentState$1) continuationImpl;
            int i3 = cityTourSelectorInteractor$showContentState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cityTourSelectorInteractor$showContentState$1.label = i3 - Integer.MIN_VALUE;
                Object obj = cityTourSelectorInteractor$showContentState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cityTourSelectorInteractor$showContentState$1.label;
                int i4 = 30;
                ru.yandex.taxi.widget.c cVar = this.d;
                CopterOrderFlowExperiment copterOrderFlowExperiment = this.g;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CopterOrderFlowExperiment.CityTourSettings cityTourSettings2 = copterOrderFlowExperiment.f;
                    if (cityTourSettings2 == null || (modal = cityTourSettings2.d) == null || (formattedText = modal.a) == null) {
                        cityToursResponse2 = cityToursResponse;
                        charSequence = null;
                        cityTourSettings = copterOrderFlowExperiment.f;
                        if (cityTourSettings != null || (modal2 = cityTourSettings.d) == null || (formattedText2 = modal2.b) == null) {
                            cityToursResponse3 = cityToursResponse2;
                            charSequence2 = charSequence;
                            charSequence3 = null;
                            List list = cityToursResponse3.d;
                            charSequence4 = charSequence3;
                            charSequence5 = charSequence2;
                            arrayList = new ArrayList();
                            it = list.iterator();
                            if (it.hasNext()) {
                            }
                            return obj2;
                        }
                        cityTourSelectorInteractor$showContentState$1.L$0 = cityToursResponse2;
                        cityTourSelectorInteractor$showContentState$1.L$1 = charSequence;
                        cityTourSelectorInteractor$showContentState$1.label = 2;
                        Object e = e(formattedText2, cityTourSelectorInteractor$showContentState$1);
                        if (e != obj2) {
                            CityToursResponse cityToursResponse4 = cityToursResponse2;
                            charSequence2 = charSequence;
                            obj = e;
                            cityToursResponse3 = cityToursResponse4;
                            charSequence3 = (CharSequence) obj;
                            List list2 = cityToursResponse3.d;
                            charSequence4 = charSequence3;
                            charSequence5 = charSequence2;
                            arrayList = new ArrayList();
                            it = list2.iterator();
                            if (it.hasNext()) {
                            }
                        }
                        return obj2;
                    }
                    cityToursResponse2 = cityToursResponse;
                    cityTourSelectorInteractor$showContentState$1.L$0 = cityToursResponse2;
                    cityTourSelectorInteractor$showContentState$1.label = 1;
                    obj = e(formattedText, cityTourSelectorInteractor$showContentState$1);
                } else if (i == 1) {
                    cityToursResponse2 = (CityToursResponse) cityTourSelectorInteractor$showContentState$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i == 2) {
                        charSequence2 = (CharSequence) cityTourSelectorInteractor$showContentState$1.L$1;
                        cityToursResponse3 = (CityToursResponse) cityTourSelectorInteractor$showContentState$1.L$0;
                        kotlin.b.b(obj);
                        charSequence3 = (CharSequence) obj;
                        List list22 = cityToursResponse3.d;
                        charSequence4 = charSequence3;
                        charSequence5 = charSequence2;
                        arrayList = new ArrayList();
                        it = list22.iterator();
                        if (it.hasNext()) {
                        }
                        return obj2;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        i2 = cityTourSelectorInteractor$showContentState$1.I$0;
                        charSequence7 = (CharSequence) cityTourSelectorInteractor$showContentState$1.L$11;
                        choice = (CityToursResponse.Choice) cityTourSelectorInteractor$showContentState$1.L$10;
                        it2 = (Iterator) cityTourSelectorInteractor$showContentState$1.L$7;
                        collection = (Collection) cityTourSelectorInteractor$showContentState$1.L$5;
                        charSequence6 = (CharSequence) cityTourSelectorInteractor$showContentState$1.L$2;
                        charSequence8 = (CharSequence) cityTourSelectorInteractor$showContentState$1.L$1;
                        kotlin.b.b(obj);
                        char c = 4;
                        CharSequence charSequence9 = (CharSequence) obj;
                        Iterator it3 = it2;
                        charSequence5 = charSequence8;
                        it = it3;
                        dxb dxbVar = new dxb(i2, charSequence7, charSequence9, choice.b);
                        arrayList = collection;
                        charSequence4 = charSequence6;
                        if (dxbVar != null) {
                            arrayList.add(dxbVar);
                        }
                        i4 = 30;
                        if (it.hasNext()) {
                            choice2 = (CityToursResponse.Choice) it.next();
                            Integer num = choice2.a;
                            if (num != null) {
                                i2 = num.intValue();
                                FormattedText formattedText4 = choice2.c;
                                if (formattedText4 != null) {
                                    cityTourSelectorInteractor$showContentState$1.L$0 = null;
                                    cityTourSelectorInteractor$showContentState$1.L$1 = charSequence5;
                                    cityTourSelectorInteractor$showContentState$1.L$2 = charSequence4;
                                    cityTourSelectorInteractor$showContentState$1.L$3 = null;
                                    cityTourSelectorInteractor$showContentState$1.L$4 = null;
                                    cityTourSelectorInteractor$showContentState$1.L$5 = arrayList;
                                    cityTourSelectorInteractor$showContentState$1.L$6 = null;
                                    cityTourSelectorInteractor$showContentState$1.L$7 = it;
                                    cityTourSelectorInteractor$showContentState$1.L$8 = null;
                                    cityTourSelectorInteractor$showContentState$1.L$9 = null;
                                    cityTourSelectorInteractor$showContentState$1.L$10 = choice2;
                                    cityTourSelectorInteractor$showContentState$1.L$11 = null;
                                    cityTourSelectorInteractor$showContentState$1.L$12 = null;
                                    cityTourSelectorInteractor$showContentState$1.I$0 = i2;
                                    cityTourSelectorInteractor$showContentState$1.label = 3;
                                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText4, null, cityTourSelectorInteractor$showContentState$1, i4);
                                } else {
                                    charSequence6 = charSequence4;
                                    choice = choice2;
                                    charSequence7 = null;
                                    CharSequence charSequence10 = charSequence5;
                                    it2 = it;
                                    charSequence8 = charSequence10;
                                    collection = arrayList;
                                    formattedText3 = choice.d;
                                    if (formattedText3 == null) {
                                        cityTourSelectorInteractor$showContentState$1.L$0 = null;
                                        cityTourSelectorInteractor$showContentState$1.L$1 = charSequence8;
                                        cityTourSelectorInteractor$showContentState$1.L$2 = charSequence6;
                                        cityTourSelectorInteractor$showContentState$1.L$3 = null;
                                        cityTourSelectorInteractor$showContentState$1.L$4 = null;
                                        cityTourSelectorInteractor$showContentState$1.L$5 = collection;
                                        cityTourSelectorInteractor$showContentState$1.L$6 = null;
                                        cityTourSelectorInteractor$showContentState$1.L$7 = it2;
                                        cityTourSelectorInteractor$showContentState$1.L$8 = null;
                                        cityTourSelectorInteractor$showContentState$1.L$9 = null;
                                        cityTourSelectorInteractor$showContentState$1.L$10 = choice;
                                        cityTourSelectorInteractor$showContentState$1.L$11 = charSequence7;
                                        cityTourSelectorInteractor$showContentState$1.L$12 = null;
                                        cityTourSelectorInteractor$showContentState$1.I$0 = i2;
                                        c = 4;
                                        cityTourSelectorInteractor$showContentState$1.label = 4;
                                        obj = ru.yandex.taxi.widget.c.i(cVar, formattedText3, null, cityTourSelectorInteractor$showContentState$1, i4);
                                    } else {
                                        c = 4;
                                        charSequence5 = charSequence8;
                                        it = it2;
                                        charSequence9 = null;
                                        dxb dxbVar2 = new dxb(i2, charSequence7, charSequence9, choice.b);
                                        arrayList = collection;
                                        charSequence4 = charSequence6;
                                        if (dxbVar2 != null) {
                                        }
                                        i4 = 30;
                                        if (it.hasNext()) {
                                        }
                                    }
                                }
                            } else {
                                dxbVar2 = null;
                                if (dxbVar2 != null) {
                                }
                                i4 = 30;
                                if (it.hasNext()) {
                                }
                            }
                        } else {
                            exb exbVar = new exb(charSequence5, charSequence4, (List) arrayList);
                            cityTourSelectorInteractor$showContentState$1.L$0 = null;
                            cityTourSelectorInteractor$showContentState$1.L$1 = null;
                            cityTourSelectorInteractor$showContentState$1.L$2 = null;
                            cityTourSelectorInteractor$showContentState$1.L$3 = null;
                            cityTourSelectorInteractor$showContentState$1.L$4 = null;
                            cityTourSelectorInteractor$showContentState$1.L$5 = null;
                            cityTourSelectorInteractor$showContentState$1.L$6 = null;
                            cityTourSelectorInteractor$showContentState$1.L$7 = null;
                            cityTourSelectorInteractor$showContentState$1.L$8 = null;
                            cityTourSelectorInteractor$showContentState$1.L$9 = null;
                            cityTourSelectorInteractor$showContentState$1.L$10 = null;
                            cityTourSelectorInteractor$showContentState$1.L$11 = null;
                            cityTourSelectorInteractor$showContentState$1.L$12 = null;
                            cityTourSelectorInteractor$showContentState$1.label = 5;
                            this.i.emit(exbVar, cityTourSelectorInteractor$showContentState$1);
                            Object obj3 = zy11.a;
                            if (obj3 != obj2) {
                                return obj3;
                            }
                        }
                        return obj2;
                    }
                    i2 = cityTourSelectorInteractor$showContentState$1.I$0;
                    choice2 = (CityToursResponse.Choice) cityTourSelectorInteractor$showContentState$1.L$10;
                    it = (Iterator) cityTourSelectorInteractor$showContentState$1.L$7;
                    arrayList = (Collection) cityTourSelectorInteractor$showContentState$1.L$5;
                    charSequence4 = (CharSequence) cityTourSelectorInteractor$showContentState$1.L$2;
                    charSequence5 = (CharSequence) cityTourSelectorInteractor$showContentState$1.L$1;
                    kotlin.b.b(obj);
                    charSequence6 = charSequence4;
                    choice = choice2;
                    charSequence7 = (CharSequence) obj;
                    CharSequence charSequence102 = charSequence5;
                    it2 = it;
                    charSequence8 = charSequence102;
                    collection = arrayList;
                    formattedText3 = choice.d;
                    if (formattedText3 == null) {
                    }
                }
                charSequence = (CharSequence) obj;
                cityTourSettings = copterOrderFlowExperiment.f;
                if (cityTourSettings != null) {
                }
                cityToursResponse3 = cityToursResponse2;
                charSequence2 = charSequence;
                charSequence3 = null;
                List list222 = cityToursResponse3.d;
                charSequence4 = charSequence3;
                charSequence5 = charSequence2;
                arrayList = new ArrayList();
                it = list222.iterator();
                if (it.hasNext()) {
                }
                return obj2;
            }
        }
        cityTourSelectorInteractor$showContentState$1 = new CityTourSelectorInteractor$showContentState$1(this, continuationImpl);
        Object obj4 = cityTourSelectorInteractor$showContentState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cityTourSelectorInteractor$showContentState$1.label;
        int i42 = 30;
        ru.yandex.taxi.widget.c cVar2 = this.d;
        CopterOrderFlowExperiment copterOrderFlowExperiment2 = this.g;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj4;
        cityTourSettings = copterOrderFlowExperiment2.f;
        if (cityTourSettings != null) {
        }
        cityToursResponse3 = cityToursResponse2;
        charSequence2 = charSequence;
        charSequence3 = null;
        List list2222 = cityToursResponse3.d;
        charSequence4 = charSequence3;
        charSequence5 = charSequence2;
        arrayList = new ArrayList();
        it = list2222.iterator();
        if (it.hasNext()) {
        }
        return obj22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r9 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
    
        if (r9 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        CityTourSelectorInteractor$showLoadingState$1 cityTourSelectorInteractor$showLoadingState$1;
        Object obj;
        int i;
        CharSequence charSequence;
        CopterOrderFlowExperiment.CityTourSettings.Modal modal;
        FormattedText formattedText;
        CopterOrderFlowExperiment.CityTourSettings cityTourSettings;
        CharSequence charSequence2;
        CopterOrderFlowExperiment.CityTourSettings.Modal modal2;
        FormattedText formattedText2;
        if (continuationImpl instanceof CityTourSelectorInteractor$showLoadingState$1) {
            cityTourSelectorInteractor$showLoadingState$1 = (CityTourSelectorInteractor$showLoadingState$1) continuationImpl;
            int i2 = cityTourSelectorInteractor$showLoadingState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cityTourSelectorInteractor$showLoadingState$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cityTourSelectorInteractor$showLoadingState$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cityTourSelectorInteractor$showLoadingState$1.label;
                CopterOrderFlowExperiment copterOrderFlowExperiment = this.g;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    CopterOrderFlowExperiment.CityTourSettings cityTourSettings2 = copterOrderFlowExperiment.f;
                    if (cityTourSettings2 == null || (modal = cityTourSettings2.d) == null || (formattedText = modal.a) == null) {
                        charSequence = null;
                        cityTourSettings = copterOrderFlowExperiment.f;
                        if (cityTourSettings != null || (modal2 = cityTourSettings.d) == null || (formattedText2 = modal2.b) == null) {
                            charSequence2 = null;
                            gxb gxbVar = new gxb(charSequence, charSequence2, null);
                            cityTourSelectorInteractor$showLoadingState$1.L$0 = null;
                            cityTourSelectorInteractor$showLoadingState$1.L$1 = null;
                            cityTourSelectorInteractor$showLoadingState$1.label = 3;
                            this.i.emit(gxbVar, cityTourSelectorInteractor$showLoadingState$1);
                            Object obj3 = zy11.a;
                            if (obj3 != obj) {
                            }
                        } else {
                            cityTourSelectorInteractor$showLoadingState$1.L$0 = charSequence;
                            cityTourSelectorInteractor$showLoadingState$1.label = 2;
                            obj2 = e(formattedText2, cityTourSelectorInteractor$showLoadingState$1);
                        }
                    } else {
                        cityTourSelectorInteractor$showLoadingState$1.label = 1;
                        obj2 = e(formattedText, cityTourSelectorInteractor$showLoadingState$1);
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj2);
                            return obj2;
                        }
                        charSequence = (CharSequence) cityTourSelectorInteractor$showLoadingState$1.L$0;
                        kotlin.b.b(obj2);
                        charSequence2 = (CharSequence) obj2;
                        gxb gxbVar2 = new gxb(charSequence, charSequence2, null);
                        cityTourSelectorInteractor$showLoadingState$1.L$0 = null;
                        cityTourSelectorInteractor$showLoadingState$1.L$1 = null;
                        cityTourSelectorInteractor$showLoadingState$1.label = 3;
                        this.i.emit(gxbVar2, cityTourSelectorInteractor$showLoadingState$1);
                        Object obj32 = zy11.a;
                        return obj32 != obj ? obj : obj32;
                    }
                    kotlin.b.b(obj2);
                }
                charSequence = (CharSequence) obj2;
                cityTourSettings = copterOrderFlowExperiment.f;
                if (cityTourSettings != null) {
                }
                charSequence2 = null;
                gxb gxbVar22 = new gxb(charSequence, charSequence2, null);
                cityTourSelectorInteractor$showLoadingState$1.L$0 = null;
                cityTourSelectorInteractor$showLoadingState$1.L$1 = null;
                cityTourSelectorInteractor$showLoadingState$1.label = 3;
                this.i.emit(gxbVar22, cityTourSelectorInteractor$showLoadingState$1);
                Object obj322 = zy11.a;
                if (obj322 != obj) {
                }
            }
        }
        cityTourSelectorInteractor$showLoadingState$1 = new CityTourSelectorInteractor$showLoadingState$1(this, continuationImpl);
        Object obj22 = cityTourSelectorInteractor$showLoadingState$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cityTourSelectorInteractor$showLoadingState$1.label;
        CopterOrderFlowExperiment copterOrderFlowExperiment2 = this.g;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj22;
        cityTourSettings = copterOrderFlowExperiment2.f;
        if (cityTourSettings != null) {
        }
        charSequence2 = null;
        gxb gxbVar222 = new gxb(charSequence, charSequence2, null);
        cityTourSelectorInteractor$showLoadingState$1.L$0 = null;
        cityTourSelectorInteractor$showLoadingState$1.L$1 = null;
        cityTourSelectorInteractor$showLoadingState$1.label = 3;
        this.i.emit(gxbVar222, cityTourSelectorInteractor$showLoadingState$1);
        Object obj3222 = zy11.a;
        if (obj3222 != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x008c, code lost:
    
        if (r12 == r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x006f, code lost:
    
        if (r12 == r1) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        CityTourSelectorInteractor$showReloadState$1 cityTourSelectorInteractor$showReloadState$1;
        Object obj;
        int i;
        CopterOrderFlowExperiment copterOrderFlowExperiment;
        CharSequence charSequence;
        CopterOrderFlowExperiment.CityTourSettings.Modal modal;
        FormattedText formattedText;
        CopterOrderFlowExperiment.CityTourSettings cityTourSettings;
        CharSequence charSequence2;
        CopterOrderFlowExperiment.CityTourSettings.Modal modal2;
        FormattedText formattedText2;
        String Y;
        CopterOrderFlowExperiment.CityTourSettings.Modal modal3;
        CopterOrderFlowExperiment.CityTourSettings.Modal.ReloadButton reloadButton;
        String str;
        CopterOrderFlowExperiment.CityTourSettings.Modal modal4;
        CopterOrderFlowExperiment.CityTourSettings.Modal.ReloadButton reloadButton2;
        String str2;
        CopterOrderFlowExperiment.CityTourSettings.Modal modal5;
        CopterOrderFlowExperiment.CityTourSettings.Modal.ReloadButton reloadButton3;
        CopterOrderFlowExperiment.CityTourSettings.Modal modal6;
        CopterOrderFlowExperiment.CityTourSettings.Modal.ReloadButton reloadButton4;
        if (continuationImpl instanceof CityTourSelectorInteractor$showReloadState$1) {
            cityTourSelectorInteractor$showReloadState$1 = (CityTourSelectorInteractor$showReloadState$1) continuationImpl;
            int i2 = cityTourSelectorInteractor$showReloadState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cityTourSelectorInteractor$showReloadState$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cityTourSelectorInteractor$showReloadState$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cityTourSelectorInteractor$showReloadState$1.label;
                copterOrderFlowExperiment = this.g;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    CopterOrderFlowExperiment.CityTourSettings cityTourSettings2 = copterOrderFlowExperiment.f;
                    if (cityTourSettings2 == null || (modal = cityTourSettings2.d) == null || (formattedText = modal.a) == null) {
                        charSequence = null;
                        cityTourSettings = copterOrderFlowExperiment.f;
                        if (cityTourSettings != null || (modal2 = cityTourSettings.d) == null || (formattedText2 = modal2.b) == null) {
                            charSequence2 = null;
                            CopterOrderFlowExperiment.CityTourSettings cityTourSettings3 = copterOrderFlowExperiment.f;
                            CopterOrderFlowExperiment.CityTourSettings cityTourSettings4 = copterOrderFlowExperiment.f;
                            if (cityTourSettings3 != null) {
                            }
                            AppColor$Palette appColor$Palette = AppColor$Palette.TextOnControl;
                            yp2 yp2Var = this.b;
                            wp2 a = yp2Var.a(r4, appColor$Palette);
                            wp2 a2 = yp2Var.a((cityTourSettings4 != null || (modal5 = cityTourSettings4.d) == null || (reloadButton3 = modal5.c) == null) ? null : reloadButton3.d, AppColor$Palette.Control);
                            if (cityTourSettings4 != null) {
                            }
                            if (cityTourSettings4 != null) {
                            }
                            if (Y == null) {
                            }
                            gxb gxbVar = new gxb(charSequence, charSequence2, new fxb(r9, Y, a, a2));
                            cityTourSelectorInteractor$showReloadState$1.L$0 = null;
                            cityTourSelectorInteractor$showReloadState$1.L$1 = null;
                            cityTourSelectorInteractor$showReloadState$1.L$2 = null;
                            cityTourSelectorInteractor$showReloadState$1.L$3 = null;
                            cityTourSelectorInteractor$showReloadState$1.L$4 = null;
                            cityTourSelectorInteractor$showReloadState$1.L$5 = null;
                            cityTourSelectorInteractor$showReloadState$1.label = 3;
                            this.i.emit(gxbVar, cityTourSelectorInteractor$showReloadState$1);
                            Object obj3 = zy11.a;
                            if (obj3 != obj) {
                            }
                        } else {
                            cityTourSelectorInteractor$showReloadState$1.L$0 = charSequence;
                            cityTourSelectorInteractor$showReloadState$1.label = 2;
                            obj2 = e(formattedText2, cityTourSelectorInteractor$showReloadState$1);
                        }
                    } else {
                        cityTourSelectorInteractor$showReloadState$1.label = 1;
                        obj2 = e(formattedText, cityTourSelectorInteractor$showReloadState$1);
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj2);
                            return obj2;
                        }
                        charSequence = (CharSequence) cityTourSelectorInteractor$showReloadState$1.L$0;
                        kotlin.b.b(obj2);
                        charSequence2 = (CharSequence) obj2;
                        CopterOrderFlowExperiment.CityTourSettings cityTourSettings32 = copterOrderFlowExperiment.f;
                        CopterOrderFlowExperiment.CityTourSettings cityTourSettings42 = copterOrderFlowExperiment.f;
                        String str3 = (cityTourSettings32 != null || (modal6 = cityTourSettings32.d) == null || (reloadButton4 = modal6.c) == null) ? null : reloadButton4.c;
                        AppColor$Palette appColor$Palette2 = AppColor$Palette.TextOnControl;
                        yp2 yp2Var2 = this.b;
                        wp2 a3 = yp2Var2.a(str3, appColor$Palette2);
                        wp2 a22 = yp2Var2.a((cityTourSettings42 != null || (modal5 = cityTourSettings42.d) == null || (reloadButton3 = modal5.c) == null) ? null : reloadButton3.d, AppColor$Palette.Control);
                        String Y2 = (cityTourSettings42 != null || (modal4 = cityTourSettings42.d) == null || (reloadButton2 = modal4.c) == null || (str2 = reloadButton2.a) == null) ? null : d6z.Y(copterOrderFlowExperiment, str2);
                        Y = (cityTourSettings42 != null || (modal3 = cityTourSettings42.d) == null || (reloadButton = modal3.c) == null || (str = reloadButton.b) == null) ? null : d6z.Y(copterOrderFlowExperiment, str);
                        if (Y == null) {
                            Y = "";
                        }
                        gxb gxbVar2 = new gxb(charSequence, charSequence2, new fxb(Y2, Y, a3, a22));
                        cityTourSelectorInteractor$showReloadState$1.L$0 = null;
                        cityTourSelectorInteractor$showReloadState$1.L$1 = null;
                        cityTourSelectorInteractor$showReloadState$1.L$2 = null;
                        cityTourSelectorInteractor$showReloadState$1.L$3 = null;
                        cityTourSelectorInteractor$showReloadState$1.L$4 = null;
                        cityTourSelectorInteractor$showReloadState$1.L$5 = null;
                        cityTourSelectorInteractor$showReloadState$1.label = 3;
                        this.i.emit(gxbVar2, cityTourSelectorInteractor$showReloadState$1);
                        Object obj32 = zy11.a;
                        return obj32 != obj ? obj : obj32;
                    }
                    kotlin.b.b(obj2);
                }
                charSequence = (CharSequence) obj2;
                cityTourSettings = copterOrderFlowExperiment.f;
                if (cityTourSettings != null) {
                }
                charSequence2 = null;
                CopterOrderFlowExperiment.CityTourSettings cityTourSettings322 = copterOrderFlowExperiment.f;
                CopterOrderFlowExperiment.CityTourSettings cityTourSettings422 = copterOrderFlowExperiment.f;
                if (cityTourSettings322 != null) {
                }
                AppColor$Palette appColor$Palette22 = AppColor$Palette.TextOnControl;
                yp2 yp2Var22 = this.b;
                wp2 a32 = yp2Var22.a(str3, appColor$Palette22);
                wp2 a222 = yp2Var22.a((cityTourSettings422 != null || (modal5 = cityTourSettings422.d) == null || (reloadButton3 = modal5.c) == null) ? null : reloadButton3.d, AppColor$Palette.Control);
                if (cityTourSettings422 != null) {
                }
                if (cityTourSettings422 != null) {
                }
                if (Y == null) {
                }
                gxb gxbVar22 = new gxb(charSequence, charSequence2, new fxb(Y2, Y, a32, a222));
                cityTourSelectorInteractor$showReloadState$1.L$0 = null;
                cityTourSelectorInteractor$showReloadState$1.L$1 = null;
                cityTourSelectorInteractor$showReloadState$1.L$2 = null;
                cityTourSelectorInteractor$showReloadState$1.L$3 = null;
                cityTourSelectorInteractor$showReloadState$1.L$4 = null;
                cityTourSelectorInteractor$showReloadState$1.L$5 = null;
                cityTourSelectorInteractor$showReloadState$1.label = 3;
                this.i.emit(gxbVar22, cityTourSelectorInteractor$showReloadState$1);
                Object obj322 = zy11.a;
                if (obj322 != obj) {
                }
            }
        }
        cityTourSelectorInteractor$showReloadState$1 = new CityTourSelectorInteractor$showReloadState$1(this, continuationImpl);
        Object obj22 = cityTourSelectorInteractor$showReloadState$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cityTourSelectorInteractor$showReloadState$1.label;
        copterOrderFlowExperiment = this.g;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj22;
        cityTourSettings = copterOrderFlowExperiment.f;
        if (cityTourSettings != null) {
        }
        charSequence2 = null;
        CopterOrderFlowExperiment.CityTourSettings cityTourSettings3222 = copterOrderFlowExperiment.f;
        CopterOrderFlowExperiment.CityTourSettings cityTourSettings4222 = copterOrderFlowExperiment.f;
        if (cityTourSettings3222 != null) {
        }
        AppColor$Palette appColor$Palette222 = AppColor$Palette.TextOnControl;
        yp2 yp2Var222 = this.b;
        wp2 a322 = yp2Var222.a(str3, appColor$Palette222);
        wp2 a2222 = yp2Var222.a((cityTourSettings4222 != null || (modal5 = cityTourSettings4222.d) == null || (reloadButton3 = modal5.c) == null) ? null : reloadButton3.d, AppColor$Palette.Control);
        if (cityTourSettings4222 != null) {
        }
        if (cityTourSettings4222 != null) {
        }
        if (Y == null) {
        }
        gxb gxbVar222 = new gxb(charSequence, charSequence2, new fxb(Y2, Y, a322, a2222));
        cityTourSelectorInteractor$showReloadState$1.L$0 = null;
        cityTourSelectorInteractor$showReloadState$1.L$1 = null;
        cityTourSelectorInteractor$showReloadState$1.L$2 = null;
        cityTourSelectorInteractor$showReloadState$1.L$3 = null;
        cityTourSelectorInteractor$showReloadState$1.L$4 = null;
        cityTourSelectorInteractor$showReloadState$1.L$5 = null;
        cityTourSelectorInteractor$showReloadState$1.label = 3;
        this.i.emit(gxbVar222, cityTourSelectorInteractor$showReloadState$1);
        Object obj3222 = zy11.a;
        if (obj3222 != obj) {
        }
    }
}
