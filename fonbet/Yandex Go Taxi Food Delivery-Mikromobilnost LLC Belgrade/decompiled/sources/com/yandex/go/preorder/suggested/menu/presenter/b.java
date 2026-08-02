package com.yandex.go.preorder.suggested.menu.presenter;

import android.content.Context;
import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.coroutines.h;
import com.yandex.go.preorder.suggested.menu.analytics.SuggestMenuLegacyAnalytics$Prefix;
import com.yandex.go.preorder.suggested.menu.experiment.SuggestMenuExperiment;
import com.yandex.go.preorder.suggested.menu.experiment.g;
import com.yandex.go.preorder.suggested.menu.ui.SuggestMenuModalView;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import defpackage.a6v0;
import defpackage.a7v0;
import defpackage.ad5;
import defpackage.b64;
import defpackage.b7v0;
import defpackage.c4h0;
import defpackage.c7v0;
import defpackage.d6z;
import defpackage.d7v0;
import defpackage.evu0;
import defpackage.g16;
import defpackage.gyt0;
import defpackage.hwo0;
import defpackage.i6v0;
import defpackage.j6v0;
import defpackage.l6v0;
import defpackage.lx4;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.ogu0;
import defpackage.p9t0;
import defpackage.pav;
import defpackage.qmp;
import defpackage.qu;
import defpackage.r6v0;
import defpackage.s6u0;
import defpackage.sb2;
import defpackage.scc;
import defpackage.sho;
import defpackage.sjh;
import defpackage.t6v0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v6v0;
import defpackage.w040;
import defpackage.w511;
import defpackage.x9v0;
import defpackage.y6v0;
import defpackage.z5v0;
import defpackage.zxs0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.l;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.analytics.Events$SuggestMenu$ActionType;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes13.dex */
public final class b extends ad5 {
    public final Context A;
    public final ru.yandex.taxi.map_common.image.a B;
    public final pav C;
    public final g D;
    public final tt2 E;
    public final com.yandex.go.mainscreen.superapp.impl.foundation.domain.g F;
    public final qmp G;
    public d7v0 H;
    public Address I;
    public final h J;
    public final zxs0 x;
    public final v6v0 y;
    public final hwo0 z;

    public b(zxs0 zxs0Var, v6v0 v6v0Var, hwo0 hwo0Var, Context context, ru.yandex.taxi.map_common.image.a aVar, pav pavVar, g gVar, tt2 tt2Var, com.yandex.go.mainscreen.superapp.impl.foundation.domain.g gVar2, qmp qmpVar) {
        super(r6v0.class);
        this.x = zxs0Var;
        this.y = v6v0Var;
        this.z = hwo0Var;
        this.A = context;
        this.B = aVar;
        this.C = pavVar;
        this.D = gVar;
        this.E = tt2Var;
        this.F = gVar2;
        this.G = qmpVar;
        this.I = PlainAddress.a;
        this.J = new h(new SuggestMenuPresenter$experiment$1(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(b bVar, Address address, ContinuationImpl continuationImpl) {
        SuggestMenuPresenter$createContentState$1 suggestMenuPresenter$createContentState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ?? r2;
        String str;
        String str2;
        CharSequence charSequence;
        CharSequence charSequence2;
        b bVar2;
        Object Rg;
        List list;
        String str3;
        String str4;
        CharSequence charSequence3;
        v6v0 v6v0Var = bVar.y;
        if (continuationImpl instanceof SuggestMenuPresenter$createContentState$1) {
            suggestMenuPresenter$createContentState$1 = (SuggestMenuPresenter$createContentState$1) continuationImpl;
            int i2 = suggestMenuPresenter$createContentState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestMenuPresenter$createContentState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suggestMenuPresenter$createContentState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestMenuPresenter$createContentState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AddressDTO address2 = address.getAddress();
                    x9v0 x9v0Var = v6v0Var.a;
                    String str5 = x9v0Var.G;
                    String str6 = address2.f;
                    CharSequence charSequence4 = address2.g;
                    if (evu0.J(str6)) {
                        str6 = x9v0Var.b;
                    }
                    if (charSequence4 == null || evu0.J(charSequence4)) {
                        charSequence4 = x9v0Var.f;
                    }
                    String str7 = x9v0Var.h;
                    if (str7 == null) {
                        str7 = "";
                    }
                    suggestMenuPresenter$createContentState$1.L$0 = null;
                    suggestMenuPresenter$createContentState$1.L$1 = null;
                    suggestMenuPresenter$createContentState$1.L$2 = bVar;
                    suggestMenuPresenter$createContentState$1.L$3 = str5;
                    suggestMenuPresenter$createContentState$1.L$4 = str6;
                    suggestMenuPresenter$createContentState$1.L$5 = charSequence4;
                    suggestMenuPresenter$createContentState$1.L$6 = str7;
                    suggestMenuPresenter$createContentState$1.label = 1;
                    List list2 = x9v0Var.H;
                    if (list2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list2) {
                            z5v0 z5v0Var = (z5v0) obj2;
                            Events$SuggestMenu$ActionType events$SuggestMenu$ActionType = z5v0Var.a;
                            String str8 = z5v0Var.b;
                            int i3 = y6v0.a[events$SuggestMenu$ActionType.ordinal()];
                            if (i3 == 1) {
                                bVar.G.getClass();
                                if (!bVar.I.getIsFavorite() && !evu0.J(str8)) {
                                    arrayList.add(obj2);
                                }
                            } else {
                                if (i3 != 2 && i3 != 3 && i3 != 4 && i3 != 5) {
                                    w511.b();
                                    return null;
                                }
                                if (!evu0.J(str8)) {
                                    arrayList.add(obj2);
                                }
                            }
                        }
                        r2 = new ArrayList(tcc.n(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        int i4 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                scc.m();
                                throw null;
                            }
                            z5v0 z5v0Var2 = (z5v0) next;
                            r2.add(new a6v0(z5v0Var2.c, new gyt0(7, bVar, z5v0Var2), z5v0Var2.b, true, i4 != scc.f(arrayList)));
                            i4 = i5;
                        }
                    } else {
                        r2 = 0;
                    }
                    if (r2 == 0) {
                        r2 = bVar.Qg(suggestMenuPresenter$createContentState$1);
                    }
                    if (r2 != coroutineSingletons) {
                        str = str5;
                        str2 = str6;
                        charSequence = charSequence4;
                        obj = r2;
                        charSequence2 = str7;
                        bVar2 = bVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list3 = (List) suggestMenuPresenter$createContentState$1.L$7;
                    CharSequence charSequence5 = (CharSequence) suggestMenuPresenter$createContentState$1.L$6;
                    charSequence = (CharSequence) suggestMenuPresenter$createContentState$1.L$5;
                    ?? r6 = (CharSequence) suggestMenuPresenter$createContentState$1.L$4;
                    ?? r7 = (CharSequence) suggestMenuPresenter$createContentState$1.L$3;
                    b bVar3 = (b) suggestMenuPresenter$createContentState$1.L$2;
                    kotlin.b.b(obj);
                    charSequence3 = charSequence5;
                    str4 = r6;
                    str3 = r7;
                    bVar2 = bVar3;
                    list = list3;
                    bVar2.H = new a7v0(str3, str4, charSequence, charSequence3, list, (l6v0) obj);
                    bVar.Xg();
                    return zy11.a;
                }
                charSequence2 = (CharSequence) suggestMenuPresenter$createContentState$1.L$6;
                charSequence = (CharSequence) suggestMenuPresenter$createContentState$1.L$5;
                ?? r72 = (CharSequence) suggestMenuPresenter$createContentState$1.L$4;
                ?? r9 = (CharSequence) suggestMenuPresenter$createContentState$1.L$3;
                bVar2 = (b) suggestMenuPresenter$createContentState$1.L$2;
                kotlin.b.b(obj);
                str2 = r72;
                str = r9;
                List list4 = (List) obj;
                suggestMenuPresenter$createContentState$1.L$0 = null;
                suggestMenuPresenter$createContentState$1.L$1 = null;
                suggestMenuPresenter$createContentState$1.L$2 = bVar2;
                suggestMenuPresenter$createContentState$1.L$3 = str;
                suggestMenuPresenter$createContentState$1.L$4 = str2;
                suggestMenuPresenter$createContentState$1.L$5 = charSequence;
                suggestMenuPresenter$createContentState$1.L$6 = charSequence2;
                suggestMenuPresenter$createContentState$1.L$7 = list4;
                suggestMenuPresenter$createContentState$1.label = 2;
                Rg = bVar.Rg(suggestMenuPresenter$createContentState$1);
                if (Rg != coroutineSingletons) {
                    String str9 = str;
                    list = list4;
                    obj = Rg;
                    str3 = str9;
                    str4 = str2;
                    charSequence3 = charSequence2;
                    bVar2.H = new a7v0(str3, str4, charSequence, charSequence3, list, (l6v0) obj);
                    bVar.Xg();
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        suggestMenuPresenter$createContentState$1 = new SuggestMenuPresenter$createContentState$1(bVar, continuationImpl);
        Object obj3 = suggestMenuPresenter$createContentState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestMenuPresenter$createContentState$1.label;
        if (i != 0) {
        }
        List list42 = (List) obj3;
        suggestMenuPresenter$createContentState$1.L$0 = null;
        suggestMenuPresenter$createContentState$1.L$1 = null;
        suggestMenuPresenter$createContentState$1.L$2 = bVar2;
        suggestMenuPresenter$createContentState$1.L$3 = str;
        suggestMenuPresenter$createContentState$1.L$4 = str2;
        suggestMenuPresenter$createContentState$1.L$5 = charSequence;
        suggestMenuPresenter$createContentState$1.L$6 = charSequence2;
        suggestMenuPresenter$createContentState$1.L$7 = list42;
        suggestMenuPresenter$createContentState$1.label = 2;
        Rg = bVar.Rg(suggestMenuPresenter$createContentState$1);
        if (Rg != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Lg(b bVar, ContinuationImpl continuationImpl) {
        SuggestMenuPresenter$createErrorState$1 suggestMenuPresenter$createErrorState$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof SuggestMenuPresenter$createErrorState$1) {
            suggestMenuPresenter$createErrorState$1 = (SuggestMenuPresenter$createErrorState$1) continuationImpl;
            int i2 = suggestMenuPresenter$createErrorState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestMenuPresenter$createErrorState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suggestMenuPresenter$createErrorState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestMenuPresenter$createErrorState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = bVar.J;
                    suggestMenuPresenter$createErrorState$1.label = 1;
                    obj = hVar.a(suggestMenuPresenter$createErrorState$1);
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
                SuggestMenuExperiment suggestMenuExperiment = (SuggestMenuExperiment) obj;
                String str = bVar.y.a.G;
                SuggestMenuExperiment.ErrorScreen errorScreen = suggestMenuExperiment.h;
                return new b7v0(str, d6z.Y(suggestMenuExperiment, errorScreen.a), d6z.Y(suggestMenuExperiment, errorScreen.b), d6z.Y(suggestMenuExperiment, errorScreen.c));
            }
        }
        suggestMenuPresenter$createErrorState$1 = new SuggestMenuPresenter$createErrorState$1(bVar, continuationImpl);
        Object obj2 = suggestMenuPresenter$createErrorState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestMenuPresenter$createErrorState$1.label;
        if (i != 0) {
        }
        SuggestMenuExperiment suggestMenuExperiment2 = (SuggestMenuExperiment) obj2;
        String str2 = bVar.y.a.G;
        SuggestMenuExperiment.ErrorScreen errorScreen2 = suggestMenuExperiment2.h;
        return new b7v0(str2, d6z.Y(suggestMenuExperiment2, errorScreen2.a), d6z.Y(suggestMenuExperiment2, errorScreen2.b), d6z.Y(suggestMenuExperiment2, errorScreen2.c));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Mg(b bVar, ContinuationImpl continuationImpl) {
        SuggestMenuPresenter$requestFinalSuggest$1 suggestMenuPresenter$requestFinalSuggest$1;
        int i;
        b bVar2;
        bVar.getClass();
        if (continuationImpl instanceof SuggestMenuPresenter$requestFinalSuggest$1) {
            suggestMenuPresenter$requestFinalSuggest$1 = (SuggestMenuPresenter$requestFinalSuggest$1) continuationImpl;
            int i2 = suggestMenuPresenter$requestFinalSuggest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestMenuPresenter$requestFinalSuggest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suggestMenuPresenter$requestFinalSuggest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestMenuPresenter$requestFinalSuggest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    suggestMenuPresenter$requestFinalSuggest$1.L$0 = bVar;
                    suggestMenuPresenter$requestFinalSuggest$1.label = 1;
                    obj = bVar.Pg(suggestMenuPresenter$requestFinalSuggest$1);
                    if (obj != coroutineSingletons) {
                        bVar2 = bVar;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar2 = (b) suggestMenuPresenter$requestFinalSuggest$1.L$0;
                kotlin.b.b(obj);
                bVar2.H = (d7v0) obj;
                bVar.Xg();
                o oVar = new o(e.T(new l((tpr) bVar.y.d.invoke(), new SuggestMenuPresenter$requestFinalSuggest$2(bVar, null)), 1), new SuggestMenuPresenter$requestFinalSuggest$3(bVar, null));
                bVar.E.getClass();
                sjh sjhVar = uyj.a;
                tpr F = e.F(oVar, mdh.b);
                a aVar = new a(bVar);
                suggestMenuPresenter$requestFinalSuggest$1.L$0 = null;
                suggestMenuPresenter$requestFinalSuggest$1.label = 2;
                Object collect = F.collect(aVar, suggestMenuPresenter$requestFinalSuggest$1);
                return collect != coroutineSingletons ? coroutineSingletons : collect;
            }
        }
        suggestMenuPresenter$requestFinalSuggest$1 = new SuggestMenuPresenter$requestFinalSuggest$1(bVar, continuationImpl);
        Object obj2 = suggestMenuPresenter$requestFinalSuggest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestMenuPresenter$requestFinalSuggest$1.label;
        if (i != 0) {
        }
        bVar2.H = (d7v0) obj2;
        bVar.Xg();
        o oVar2 = new o(e.T(new l((tpr) bVar.y.d.invoke(), new SuggestMenuPresenter$requestFinalSuggest$2(bVar, null)), 1), new SuggestMenuPresenter$requestFinalSuggest$3(bVar, null));
        bVar.E.getClass();
        sjh sjhVar2 = uyj.a;
        tpr F2 = e.F(oVar2, mdh.b);
        a aVar2 = new a(bVar);
        suggestMenuPresenter$requestFinalSuggest$1.L$0 = null;
        suggestMenuPresenter$requestFinalSuggest$1.label = 2;
        Object collect2 = F2.collect(aVar2, suggestMenuPresenter$requestFinalSuggest$1);
        if (collect2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Ng(b bVar, zzs zzsVar, ContinuationImpl continuationImpl) {
        SuggestMenuPresenter$requestMap$1 suggestMenuPresenter$requestMap$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        s6u0 s6u0Var;
        g16 g16Var;
        bVar.getClass();
        if (continuationImpl instanceof SuggestMenuPresenter$requestMap$1) {
            suggestMenuPresenter$requestMap$1 = (SuggestMenuPresenter$requestMap$1) continuationImpl;
            int i2 = suggestMenuPresenter$requestMap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestMenuPresenter$requestMap$1.label = i2 - Integer.MIN_VALUE;
                obj = suggestMenuPresenter$requestMap$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestMenuPresenter$requestMap$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    s6u0Var = bVar.y.a.I;
                    if (s6u0Var == null) {
                        h hVar = bVar.J;
                        suggestMenuPresenter$requestMap$1.L$0 = zzsVar;
                        suggestMenuPresenter$requestMap$1.label = 1;
                        obj = hVar.a(suggestMenuPresenter$requestMap$1);
                    }
                    g16 b = bVar.C.b();
                    ru.yandex.taxi.map_common.image.a aVar = bVar.B;
                    suggestMenuPresenter$requestMap$1.L$0 = null;
                    suggestMenuPresenter$requestMap$1.L$1 = null;
                    suggestMenuPresenter$requestMap$1.L$2 = b;
                    suggestMenuPresenter$requestMap$1.label = 2;
                    obj = aVar.c(zzsVar, s6u0Var, suggestMenuPresenter$requestMap$1);
                    if (obj != coroutineSingletons) {
                        g16Var = b;
                        ru.yandex.taxi.utils.a.c(g16Var.b((String) obj), new p9t0(18, bVar), new ogu0(6, bVar), bVar.Jg());
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g16Var = (g16) suggestMenuPresenter$requestMap$1.L$2;
                    kotlin.b.b(obj);
                    ru.yandex.taxi.utils.a.c(g16Var.b((String) obj), new p9t0(18, bVar), new ogu0(6, bVar), bVar.Jg());
                    return zy11.a;
                }
                zzsVar = (zzs) suggestMenuPresenter$requestMap$1.L$0;
                kotlin.b.b(obj);
                s6u0Var = ((SuggestMenuExperiment) obj).n;
                g16 b2 = bVar.C.b();
                ru.yandex.taxi.map_common.image.a aVar2 = bVar.B;
                suggestMenuPresenter$requestMap$1.L$0 = null;
                suggestMenuPresenter$requestMap$1.L$1 = null;
                suggestMenuPresenter$requestMap$1.L$2 = b2;
                suggestMenuPresenter$requestMap$1.label = 2;
                obj = aVar2.c(zzsVar, s6u0Var, suggestMenuPresenter$requestMap$1);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        suggestMenuPresenter$requestMap$1 = new SuggestMenuPresenter$requestMap$1(bVar, continuationImpl);
        obj = suggestMenuPresenter$requestMap$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestMenuPresenter$requestMap$1.label;
        if (i != 0) {
        }
        s6u0Var = ((SuggestMenuExperiment) obj).n;
        g16 b22 = bVar.C.b();
        ru.yandex.taxi.map_common.image.a aVar22 = bVar.B;
        suggestMenuPresenter$requestMap$1.L$0 = null;
        suggestMenuPresenter$requestMap$1.L$1 = null;
        suggestMenuPresenter$requestMap$1.L$2 = b22;
        suggestMenuPresenter$requestMap$1.label = 2;
        obj = aVar22.c(zzsVar, s6u0Var, suggestMenuPresenter$requestMap$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final void Og(SuggestMenuModalView suggestMenuModalView) {
        Bg(suggestMenuModalView);
        tje.N(Jg(), null, null, new SuggestMenuPresenter$attachView$1(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Pg(ContinuationImpl continuationImpl) {
        SuggestMenuPresenter$createLoadingState$1 suggestMenuPresenter$createLoadingState$1;
        Object obj;
        int i;
        Object Rg;
        SuggestMenuExperiment suggestMenuExperiment;
        CharSequence charSequence;
        if (continuationImpl instanceof SuggestMenuPresenter$createLoadingState$1) {
            suggestMenuPresenter$createLoadingState$1 = (SuggestMenuPresenter$createLoadingState$1) continuationImpl;
            int i2 = suggestMenuPresenter$createLoadingState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestMenuPresenter$createLoadingState$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = suggestMenuPresenter$createLoadingState$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestMenuPresenter$createLoadingState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    suggestMenuPresenter$createLoadingState$1.label = 1;
                    obj2 = this.J.a(suggestMenuPresenter$createLoadingState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence = (CharSequence) suggestMenuPresenter$createLoadingState$1.L$1;
                        suggestMenuExperiment = (SuggestMenuExperiment) suggestMenuPresenter$createLoadingState$1.L$0;
                        kotlin.b.b(obj2);
                        return new c7v0(charSequence, (l6v0) obj2, d6z.Y(suggestMenuExperiment, suggestMenuExperiment.i.b));
                    }
                    kotlin.b.b(obj2);
                }
                SuggestMenuExperiment suggestMenuExperiment2 = (SuggestMenuExperiment) obj2;
                String str = this.y.a.G;
                suggestMenuPresenter$createLoadingState$1.L$0 = suggestMenuExperiment2;
                suggestMenuPresenter$createLoadingState$1.L$1 = str;
                suggestMenuPresenter$createLoadingState$1.label = 2;
                Rg = Rg(suggestMenuPresenter$createLoadingState$1);
                if (Rg != obj) {
                    suggestMenuExperiment = suggestMenuExperiment2;
                    obj2 = Rg;
                    charSequence = str;
                    return new c7v0(charSequence, (l6v0) obj2, d6z.Y(suggestMenuExperiment, suggestMenuExperiment.i.b));
                }
                return obj;
            }
        }
        suggestMenuPresenter$createLoadingState$1 = new SuggestMenuPresenter$createLoadingState$1(this, continuationImpl);
        Object obj22 = suggestMenuPresenter$createLoadingState$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestMenuPresenter$createLoadingState$1.label;
        if (i != 0) {
        }
        SuggestMenuExperiment suggestMenuExperiment22 = (SuggestMenuExperiment) obj22;
        String str2 = this.y.a.G;
        suggestMenuPresenter$createLoadingState$1.L$0 = suggestMenuExperiment22;
        suggestMenuPresenter$createLoadingState$1.L$1 = str2;
        suggestMenuPresenter$createLoadingState$1.label = 2;
        Rg = Rg(suggestMenuPresenter$createLoadingState$1);
        if (Rg != obj) {
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [T] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v5, types: [T] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [T] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Qg(ContinuationImpl continuationImpl) {
        SuggestMenuPresenter$getDefaultActionsList$1 suggestMenuPresenter$getDefaultActionsList$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        PointType pointType;
        PointType pointType2;
        String Y;
        ?? Y2;
        if (continuationImpl instanceof SuggestMenuPresenter$getDefaultActionsList$1) {
            suggestMenuPresenter$getDefaultActionsList$1 = (SuggestMenuPresenter$getDefaultActionsList$1) continuationImpl;
            int i2 = suggestMenuPresenter$getDefaultActionsList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestMenuPresenter$getDefaultActionsList$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suggestMenuPresenter$getDefaultActionsList$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestMenuPresenter$getDefaultActionsList$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PointType pointType3 = this.y.b;
                    ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef3 = new Ref$ObjectRef();
                    suggestMenuPresenter$getDefaultActionsList$1.L$0 = pointType3;
                    suggestMenuPresenter$getDefaultActionsList$1.L$1 = ref$ObjectRef;
                    suggestMenuPresenter$getDefaultActionsList$1.L$2 = ref$ObjectRef2;
                    suggestMenuPresenter$getDefaultActionsList$1.L$3 = ref$ObjectRef3;
                    suggestMenuPresenter$getDefaultActionsList$1.label = 1;
                    Object a = this.J.a(suggestMenuPresenter$getDefaultActionsList$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    pointType = pointType3;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) suggestMenuPresenter$getDefaultActionsList$1.L$3;
                    ref$ObjectRef2 = (Ref$ObjectRef) suggestMenuPresenter$getDefaultActionsList$1.L$2;
                    ref$ObjectRef = (Ref$ObjectRef) suggestMenuPresenter$getDefaultActionsList$1.L$1;
                    pointType = (PointType) suggestMenuPresenter$getDefaultActionsList$1.L$0;
                    kotlin.b.b(obj);
                    ref$ObjectRef3 = ref$ObjectRef4;
                }
                Ref$ObjectRef ref$ObjectRef5 = ref$ObjectRef;
                Ref$ObjectRef ref$ObjectRef6 = ref$ObjectRef2;
                SuggestMenuExperiment suggestMenuExperiment = (SuggestMenuExperiment) obj;
                suggestMenuExperiment.getClass();
                SuggestMenuExperiment.SuggestTypeKeys suggestTypeKeys = suggestMenuExperiment.f;
                SuggestMenuExperiment.SuggestTypeKeys suggestTypeKeys2 = suggestMenuExperiment.g;
                pointType2 = PointType.DESTINATION;
                String str = (pointType != pointType2 ? suggestTypeKeys2 : suggestTypeKeys).a;
                Y = str == null ? d6z.Y(suggestMenuExperiment, str) : null;
                ?? r11 = Y;
                if (Y == null) {
                    r11 = "";
                }
                ref$ObjectRef5.element = r11;
                String str2 = (pointType != pointType2 ? suggestTypeKeys2 : suggestTypeKeys).b;
                Y2 = str2 == null ? d6z.Y(suggestMenuExperiment, str2) : 0;
                if (Y2 == 0) {
                    Y2 = "";
                }
                ref$ObjectRef6.element = Y2;
                if (pointType == pointType2) {
                    suggestTypeKeys = suggestTypeKeys2;
                }
                String str3 = suggestTypeKeys.c;
                String Y3 = str3 != null ? d6z.Y(suggestMenuExperiment, str3) : null;
                ref$ObjectRef3.element = Y3 != null ? Y3 : "";
                boolean z = !evu0.J((CharSequence) ref$ObjectRef5.element);
                this.G.getClass();
                boolean z2 = this.I.getIsFavorite() && !evu0.J((CharSequence) ref$ObjectRef6.element);
                boolean J = evu0.J((CharSequence) ref$ObjectRef3.element);
                boolean z3 = !J;
                return scc.g(new a6v0(pointType != pointType2 ? c4h0.ic_destination : c4h0.ic_pickup, new SuggestMenuPresenter$getDefaultActionsList$3(0, this, b.class, "onSelectTap", "onSelectTap()V", 0), (CharSequence) ref$ObjectRef5.element, z, (z2 && J) ? false : true), new a6v0(c4h0.ic_bookmarkoutline, new SuggestMenuPresenter$getDefaultActionsList$4(0, this, b.class, "onFavoritesTap", "onFavoritesTap()V", 0), (CharSequence) ref$ObjectRef6.element, z2, z3), new a6v0(c4h0.ic_mapoutline, new SuggestMenuPresenter$getDefaultActionsList$5(0, this, b.class, "onSelectOnMapTap", "onSelectOnMapTap()V", 0), (CharSequence) ref$ObjectRef3.element, z3, false));
            }
        }
        suggestMenuPresenter$getDefaultActionsList$1 = new SuggestMenuPresenter$getDefaultActionsList$1(this, continuationImpl);
        Object obj2 = suggestMenuPresenter$getDefaultActionsList$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestMenuPresenter$getDefaultActionsList$1.label;
        if (i != 0) {
        }
        Ref$ObjectRef ref$ObjectRef52 = ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef62 = ref$ObjectRef2;
        SuggestMenuExperiment suggestMenuExperiment2 = (SuggestMenuExperiment) obj2;
        suggestMenuExperiment2.getClass();
        SuggestMenuExperiment.SuggestTypeKeys suggestTypeKeys3 = suggestMenuExperiment2.f;
        SuggestMenuExperiment.SuggestTypeKeys suggestTypeKeys22 = suggestMenuExperiment2.g;
        pointType2 = PointType.DESTINATION;
        String str4 = (pointType != pointType2 ? suggestTypeKeys22 : suggestTypeKeys3).a;
        if (str4 == null) {
        }
        ?? r112 = Y;
        if (Y == null) {
        }
        ref$ObjectRef52.element = r112;
        String str22 = (pointType != pointType2 ? suggestTypeKeys22 : suggestTypeKeys3).b;
        if (str22 == null) {
        }
        if (Y2 == 0) {
        }
        ref$ObjectRef62.element = Y2;
        if (pointType == pointType2) {
        }
        String str32 = suggestTypeKeys3.c;
        if (str32 != null) {
        }
        ref$ObjectRef3.element = Y3 != null ? Y3 : "";
        boolean z4 = !evu0.J((CharSequence) ref$ObjectRef52.element);
        this.G.getClass();
        if (this.I.getIsFavorite()) {
        }
        boolean J2 = evu0.J((CharSequence) ref$ObjectRef3.element);
        boolean z32 = !J2;
        return scc.g(new a6v0(pointType != pointType2 ? c4h0.ic_destination : c4h0.ic_pickup, new SuggestMenuPresenter$getDefaultActionsList$3(0, this, b.class, "onSelectTap", "onSelectTap()V", 0), (CharSequence) ref$ObjectRef52.element, z4, (z2 && J2) ? false : true), new a6v0(c4h0.ic_bookmarkoutline, new SuggestMenuPresenter$getDefaultActionsList$4(0, this, b.class, "onFavoritesTap", "onFavoritesTap()V", 0), (CharSequence) ref$ObjectRef62.element, z2, z32), new a6v0(c4h0.ic_mapoutline, new SuggestMenuPresenter$getDefaultActionsList$5(0, this, b.class, "onSelectOnMapTap", "onSelectOnMapTap()V", 0), (CharSequence) ref$ObjectRef3.element, z32, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Rg(ContinuationImpl continuationImpl) {
        SuggestMenuPresenter$getEmptyMapState$1 suggestMenuPresenter$getEmptyMapState$1;
        int i;
        if (continuationImpl instanceof SuggestMenuPresenter$getEmptyMapState$1) {
            suggestMenuPresenter$getEmptyMapState$1 = (SuggestMenuPresenter$getEmptyMapState$1) continuationImpl;
            int i2 = suggestMenuPresenter$getEmptyMapState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestMenuPresenter$getEmptyMapState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suggestMenuPresenter$getEmptyMapState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestMenuPresenter$getEmptyMapState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    suggestMenuPresenter$getEmptyMapState$1.label = 1;
                    obj = Sg(suggestMenuPresenter$getEmptyMapState$1);
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
                return !((Boolean) obj).booleanValue() ? j6v0.a : i6v0.a;
            }
        }
        suggestMenuPresenter$getEmptyMapState$1 = new SuggestMenuPresenter$getEmptyMapState$1(this, continuationImpl);
        Object obj3 = suggestMenuPresenter$getEmptyMapState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestMenuPresenter$getEmptyMapState$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj3).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Sg(ContinuationImpl continuationImpl) {
        SuggestMenuPresenter$isNeedShowMap$1 suggestMenuPresenter$isNeedShowMap$1;
        Object obj;
        int i;
        boolean z;
        if (continuationImpl instanceof SuggestMenuPresenter$isNeedShowMap$1) {
            suggestMenuPresenter$isNeedShowMap$1 = (SuggestMenuPresenter$isNeedShowMap$1) continuationImpl;
            int i2 = suggestMenuPresenter$isNeedShowMap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestMenuPresenter$isNeedShowMap$1.label = i2 - Integer.MIN_VALUE;
                obj = suggestMenuPresenter$isNeedShowMap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestMenuPresenter$isNeedShowMap$1.label;
                z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    suggestMenuPresenter$isNeedShowMap$1.label = 1;
                    obj = this.J.a(suggestMenuPresenter$isNeedShowMap$1);
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
                if (!((SuggestMenuExperiment) obj).d && this.y.a.I == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        suggestMenuPresenter$isNeedShowMap$1 = new SuggestMenuPresenter$isNeedShowMap$1(this, continuationImpl);
        obj = suggestMenuPresenter$isNeedShowMap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestMenuPresenter$isNeedShowMap$1.label;
        z = true;
        if (i != 0) {
        }
        if (!((SuggestMenuExperiment) obj).d) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void Tg(Events$SuggestMenu$ActionType events$SuggestMenu$ActionType) {
        t6v0 t6v0Var;
        w040 w040Var = this.y.c;
        int i = y6v0.a[events$SuggestMenu$ActionType.ordinal()];
        if (i == 1) {
            t6v0Var = (t6v0) w040Var.d;
        } else if (i == 2) {
            t6v0Var = (t6v0) w040Var.b;
        } else if (i == 3) {
            t6v0Var = (t6v0) w040Var.c;
        } else if (i == 4) {
            t6v0Var = (t6v0) w040Var.f;
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            t6v0Var = (t6v0) w040Var.e;
        }
        ((com.yandex.go.preorder.suggested.menu.router.a) this.x.b).r(new qu(9));
        t6v0Var.a(this.I);
        hwo0 hwo0Var = this.z;
        String j = b64.j(((SuggestMenuLegacyAnalytics$Prefix) hwo0Var.x).getEventValue(), ".ActionTapped");
        Pair[] pairArr = {new Pair("action", events$SuggestMenu$ActionType.getValue())};
        i d = ((j) ((lx4) hwo0Var.c)).d(j);
        d.h(kotlin.collections.b.u(pairArr));
        d.m();
    }

    public final void Ug() {
        zxs0 zxs0Var = this.x;
        ((com.yandex.go.preorder.suggested.menu.router.a) zxs0Var.b).r(new p9t0(19, zxs0Var));
        hwo0 hwo0Var = this.z;
        o7r0 o7r0Var = (o7r0) hwo0Var.w;
        SuggestMenuLegacyAnalytics$Prefix suggestMenuLegacyAnalytics$Prefix = (SuggestMenuLegacyAnalytics$Prefix) hwo0Var.x;
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(AppSettingsContract$Setting.COLUMN_PREFIX, suggestMenuLegacyAnalytics$Prefix.getEventValue());
        HashMap hashMap2 = new HashMap();
        Regex regex = sho.a;
        o7r0Var.a.a(sb2.q("${prefix}.Closed", hashMap), hashMap, 1, hashMap2);
    }

    public final void Vg() {
        tje.N(Jg(), null, null, new SuggestMenuPresenter$onReloadTap$1(this, null), 3);
    }

    public final void Wg(l6v0 l6v0Var) {
        d7v0 d7v0Var = this.H;
        if (d7v0Var instanceof a7v0) {
            a7v0 a7v0Var = (a7v0) d7v0Var;
            this.H = new a7v0(a7v0Var.a, a7v0Var.b, a7v0Var.c, a7v0Var.d, a7v0Var.e, l6v0Var);
            Xg();
        }
    }

    public final void Xg() {
        d7v0 d7v0Var = this.H;
        if (d7v0Var != null) {
            ((r6v0) Dg()).render(d7v0Var);
        }
    }
}
