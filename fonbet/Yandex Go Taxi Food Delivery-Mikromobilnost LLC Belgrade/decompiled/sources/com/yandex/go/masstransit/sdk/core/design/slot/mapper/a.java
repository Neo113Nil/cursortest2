package com.yandex.go.masstransit.sdk.core.design.slot.mapper;

import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemBodyDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemBodyPropertiesDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemLineDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemTrailDto$ButtonDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemTrailDto$IconSpotDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.s;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.t;
import com.yandex.go.masstransit.sdk.core.design.slot.ui.MasstransitSlotItemUiState$Body$Alignment;
import com.yandex.go.masstransit.sdk.core.design.slot.ui.MasstransitSlotItemUiState$Body$Ellipsize;
import com.yandex.go.masstransit.sdk.core.dto.CurrencyRulesDto;
import com.yandex.go.masstransit.sdk.core.image.MtSdkImage;
import com.yandex.go.masstransit.sdk.core.image.MtSdkUrlParts;
import defpackage.c510;
import defpackage.cot;
import defpackage.d510;
import defpackage.d9s;
import defpackage.e510;
import defpackage.f510;
import defpackage.fef;
import defpackage.g510;
import defpackage.gwk0;
import defpackage.l510;
import defpackage.lub1;
import defpackage.m510;
import defpackage.mja1;
import defpackage.n510;
import defpackage.nvi0;
import defpackage.ny61;
import defpackage.o510;
import defpackage.oyr;
import defpackage.p510;
import defpackage.q510;
import defpackage.r510;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tp2;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wp2;
import defpackage.x410;
import defpackage.xby;
import defpackage.xdf;
import defpackage.y410;
import defpackage.yp2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.o;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class a {
    public final cot a;
    public final c b;
    public final yp2 c;

    public a(cot cotVar, c cVar, yp2 yp2Var, tt2 tt2Var) {
        this.a = cotVar;
        this.b = cVar;
        this.c = yp2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e4 -> B:23:0x01c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x013c -> B:10:0x0147). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00bb -> B:26:0x00d3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, List list, CurrencyRulesDto currencyRulesDto, ContinuationImpl continuationImpl) {
        MasstransitSlotItemMapper$mapBody$1 masstransitSlotItemMapper$mapBody$1;
        int i;
        Iterator it;
        MasstransitSlotItemMapper$mapBody$1 masstransitSlotItemMapper$mapBody$12;
        ArrayList arrayList;
        CurrencyRulesDto currencyRulesDto2;
        Integer num;
        aVar.getClass();
        if (continuationImpl instanceof MasstransitSlotItemMapper$mapBody$1) {
            masstransitSlotItemMapper$mapBody$1 = (MasstransitSlotItemMapper$mapBody$1) continuationImpl;
            int i2 = masstransitSlotItemMapper$mapBody$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitSlotItemMapper$mapBody$1.label = i2 - Integer.MIN_VALUE;
                Object obj = masstransitSlotItemMapper$mapBody$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitSlotItemMapper$mapBody$1.label;
                fef fefVar = null;
                if (i != 0) {
                    b.b(obj);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (!((MasstransitSlotItemBodyDto) obj2).a.isEmpty()) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                    it = arrayList2.iterator();
                    masstransitSlotItemMapper$mapBody$12 = masstransitSlotItemMapper$mapBody$1;
                    arrayList = arrayList3;
                    currencyRulesDto2 = currencyRulesDto;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Collection collection = (Collection) masstransitSlotItemMapper$mapBody$1.L$18;
                    FormattedText formattedText = (FormattedText) masstransitSlotItemMapper$mapBody$1.L$16;
                    MasstransitSlotItemLineDto masstransitSlotItemLineDto = (MasstransitSlotItemLineDto) masstransitSlotItemMapper$mapBody$1.L$15;
                    Iterator it2 = (Iterator) masstransitSlotItemMapper$mapBody$1.L$12;
                    Collection arrayList4 = (Collection) masstransitSlotItemMapper$mapBody$1.L$10;
                    MasstransitSlotItemBodyDto masstransitSlotItemBodyDto = (MasstransitSlotItemBodyDto) masstransitSlotItemMapper$mapBody$1.L$7;
                    Iterator it3 = (Iterator) masstransitSlotItemMapper$mapBody$1.L$5;
                    ?? r13 = (Collection) masstransitSlotItemMapper$mapBody$1.L$4;
                    CurrencyRulesDto currencyRulesDto3 = (CurrencyRulesDto) masstransitSlotItemMapper$mapBody$1.L$1;
                    b.b(obj);
                    ArrayList arrayList5 = r13;
                    CharSequence charSequence = (CharSequence) obj;
                    String b = formattedText.b();
                    if (b.length() <= 0) {
                        b = null;
                    }
                    wp2 a = b == null ? aVar.c.a(b, tp2.a) : null;
                    Iterator it4 = formattedText.a.iterator();
                    if (it4.hasNext()) {
                        num = null;
                    } else {
                        num = new Integer(c((o) it4.next()));
                        while (it4.hasNext()) {
                            Integer num2 = new Integer(c((o) it4.next()));
                            if (num.compareTo(num2) < 0) {
                                num = num2;
                            }
                        }
                    }
                    Object obj3 = new x410(charSequence, a, (num != null || num.intValue() <= 0) ? null : num, masstransitSlotItemLineDto.b, masstransitSlotItemLineDto.a);
                    MasstransitSlotItemBodyDto masstransitSlotItemBodyDto2 = masstransitSlotItemBodyDto;
                    currencyRulesDto2 = currencyRulesDto3;
                    MasstransitSlotItemMapper$mapBody$1 masstransitSlotItemMapper$mapBody$13 = masstransitSlotItemMapper$mapBody$1;
                    Iterator it5 = it2;
                    arrayList = arrayList5;
                    Iterator it6 = it3;
                    if (obj3 != null) {
                        arrayList4.add(obj3);
                    }
                    fefVar = null;
                    Collection collection2 = arrayList4;
                    if (it5.hasNext()) {
                        collection.add(new Pair(masstransitSlotItemBodyDto2.b, (List) collection2));
                        masstransitSlotItemMapper$mapBody$12 = masstransitSlotItemMapper$mapBody$13;
                        it = it6;
                        fefVar = null;
                        if (it.hasNext()) {
                            ArrayList arrayList6 = arrayList;
                            int size = arrayList6.size();
                            if (size == 0) {
                                return d510.a;
                            }
                            if (size == 1) {
                                Pair pair = (Pair) kotlin.collections.a.P(arrayList6);
                                return new e510(h((List) pair.getSecond(), (MasstransitSlotItemBodyPropertiesDto) pair.getFirst()));
                            }
                            if (size == 2) {
                                return e((Pair) arrayList6.get(0), (Pair) arrayList6.get(1));
                            }
                            xby.t(xby.d, "MasstransitSlotItemMapper", null, oyr.j(arrayList6.size(), "Unexpected body size received, got ", ", max: 2"), 6);
                            return e((Pair) arrayList6.get(0), (Pair) arrayList6.get(1));
                        }
                        MasstransitSlotItemBodyDto masstransitSlotItemBodyDto3 = (MasstransitSlotItemBodyDto) it.next();
                        List list2 = masstransitSlotItemBodyDto3.a;
                        arrayList4 = new ArrayList();
                        masstransitSlotItemMapper$mapBody$13 = masstransitSlotItemMapper$mapBody$12;
                        it6 = it;
                        masstransitSlotItemBodyDto2 = masstransitSlotItemBodyDto3;
                        it5 = list2.iterator();
                        collection = arrayList;
                        Collection collection22 = arrayList4;
                        if (it5.hasNext()) {
                            MasstransitSlotItemLineDto masstransitSlotItemLineDto2 = (MasstransitSlotItemLineDto) it5.next();
                            FormattedText formattedText2 = masstransitSlotItemLineDto2.c;
                            if (formattedText2 == null) {
                                arrayList4 = collection22;
                                obj3 = fefVar;
                                if (obj3 != null) {
                                }
                                fefVar = null;
                                Collection collection222 = arrayList4;
                                if (it5.hasNext()) {
                                }
                            } else {
                                FormattedText c = d9s.c(formattedText2, (xdf) aVar.a.b, currencyRulesDto2 != null ? gwk0.h(lub1.h(currencyRulesDto2)) : fefVar, true);
                                c cVar = aVar.b;
                                masstransitSlotItemMapper$mapBody$13.L$0 = fefVar;
                                masstransitSlotItemMapper$mapBody$13.L$1 = currencyRulesDto2;
                                masstransitSlotItemMapper$mapBody$13.L$2 = fefVar;
                                masstransitSlotItemMapper$mapBody$13.L$3 = fefVar;
                                masstransitSlotItemMapper$mapBody$13.L$4 = arrayList;
                                masstransitSlotItemMapper$mapBody$13.L$5 = it6;
                                masstransitSlotItemMapper$mapBody$13.L$6 = fefVar;
                                masstransitSlotItemMapper$mapBody$13.L$7 = masstransitSlotItemBodyDto2;
                                masstransitSlotItemMapper$mapBody$13.L$8 = fefVar;
                                masstransitSlotItemMapper$mapBody$13.L$9 = fefVar;
                                masstransitSlotItemMapper$mapBody$13.L$10 = collection222;
                                masstransitSlotItemMapper$mapBody$13.L$11 = fefVar;
                                masstransitSlotItemMapper$mapBody$13.L$12 = it5;
                                masstransitSlotItemMapper$mapBody$13.L$13 = fefVar;
                                masstransitSlotItemMapper$mapBody$13.L$14 = fefVar;
                                masstransitSlotItemMapper$mapBody$13.L$15 = masstransitSlotItemLineDto2;
                                masstransitSlotItemMapper$mapBody$13.L$16 = c;
                                masstransitSlotItemMapper$mapBody$13.L$17 = fefVar;
                                masstransitSlotItemMapper$mapBody$13.L$18 = collection;
                                masstransitSlotItemMapper$mapBody$13.label = 1;
                                MasstransitSlotItemBodyDto masstransitSlotItemBodyDto4 = masstransitSlotItemBodyDto2;
                                Object e = c.e(cVar, c, null, false, masstransitSlotItemMapper$mapBody$13, 30);
                                if (e == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                it3 = it6;
                                it2 = it5;
                                arrayList4 = collection222;
                                currencyRulesDto3 = currencyRulesDto2;
                                arrayList5 = arrayList;
                                obj = e;
                                formattedText = c;
                                masstransitSlotItemMapper$mapBody$1 = masstransitSlotItemMapper$mapBody$13;
                                masstransitSlotItemLineDto = masstransitSlotItemLineDto2;
                                masstransitSlotItemBodyDto = masstransitSlotItemBodyDto4;
                                CharSequence charSequence2 = (CharSequence) obj;
                                String b2 = formattedText.b();
                                if (b2.length() <= 0) {
                                }
                                if (b2 == null) {
                                }
                                Iterator it42 = formattedText.a.iterator();
                                if (it42.hasNext()) {
                                }
                                Object obj32 = new x410(charSequence2, a, (num != null || num.intValue() <= 0) ? null : num, masstransitSlotItemLineDto.b, masstransitSlotItemLineDto.a);
                                MasstransitSlotItemBodyDto masstransitSlotItemBodyDto22 = masstransitSlotItemBodyDto;
                                currencyRulesDto2 = currencyRulesDto3;
                                MasstransitSlotItemMapper$mapBody$1 masstransitSlotItemMapper$mapBody$132 = masstransitSlotItemMapper$mapBody$1;
                                Iterator it52 = it2;
                                arrayList = arrayList5;
                                Iterator it62 = it3;
                                if (obj32 != null) {
                                }
                                fefVar = null;
                                Collection collection2222 = arrayList4;
                                if (it52.hasNext()) {
                                }
                            }
                        }
                    }
                }
            }
        }
        masstransitSlotItemMapper$mapBody$1 = new MasstransitSlotItemMapper$mapBody$1(aVar, continuationImpl);
        Object obj4 = masstransitSlotItemMapper$mapBody$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitSlotItemMapper$mapBody$1.label;
        fef fefVar2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, List list, ContinuationImpl continuationImpl) {
        MasstransitSlotItemMapper$mapTrail$1 masstransitSlotItemMapper$mapTrail$1;
        int i;
        t tVar;
        o510 o510Var;
        o510 o510Var2;
        aVar.getClass();
        if (continuationImpl instanceof MasstransitSlotItemMapper$mapTrail$1) {
            masstransitSlotItemMapper$mapTrail$1 = (MasstransitSlotItemMapper$mapTrail$1) continuationImpl;
            int i2 = masstransitSlotItemMapper$mapTrail$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitSlotItemMapper$mapTrail$1.label = i2 - Integer.MIN_VALUE;
                MasstransitSlotItemMapper$mapTrail$1 masstransitSlotItemMapper$mapTrail$12 = masstransitSlotItemMapper$mapTrail$1;
                Object obj = masstransitSlotItemMapper$mapTrail$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitSlotItemMapper$mapTrail$12.label;
                if (i != 0) {
                    b.b(obj);
                    if (!list.isEmpty()) {
                        tVar = (t) kotlin.collections.a.P(list);
                        if (!(tVar instanceof s)) {
                            if (tVar instanceof MasstransitSlotItemTrailDto$ButtonDto) {
                                MasstransitSlotItemTrailDto$ButtonDto masstransitSlotItemTrailDto$ButtonDto = (MasstransitSlotItemTrailDto$ButtonDto) tVar;
                                int i3 = y410.a[masstransitSlotItemTrailDto$ButtonDto.b.ordinal()];
                                if (i3 == 1) {
                                    o510Var = m510.a;
                                } else if (i3 == 2) {
                                    o510Var = n510.a;
                                } else {
                                    if (i3 != 3) {
                                        w511.b();
                                        return null;
                                    }
                                    o510Var = l510.a;
                                }
                                o510 o510Var3 = o510Var;
                                c cVar = aVar.b;
                                FormattedText formattedText = masstransitSlotItemTrailDto$ButtonDto.a;
                                masstransitSlotItemMapper$mapTrail$12.L$0 = null;
                                masstransitSlotItemMapper$mapTrail$12.L$1 = tVar;
                                masstransitSlotItemMapper$mapTrail$12.L$2 = o510Var3;
                                masstransitSlotItemMapper$mapTrail$12.label = 1;
                                obj = c.e(cVar, formattedText, null, false, masstransitSlotItemMapper$mapTrail$12, 30);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                o510Var2 = o510Var3;
                            } else {
                                if (!(tVar instanceof MasstransitSlotItemTrailDto$IconSpotDto)) {
                                    w511.b();
                                    return null;
                                }
                                nvi0 g = g(((MasstransitSlotItemTrailDto$IconSpotDto) tVar).a);
                                if (g != null) {
                                    return new q510(g);
                                }
                            }
                        }
                    }
                    return r510.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o510Var2 = (o510) masstransitSlotItemMapper$mapTrail$12.L$2;
                tVar = (t) masstransitSlotItemMapper$mapTrail$12.L$1;
                b.b(obj);
                return new p510((CharSequence) obj, o510Var2, ((MasstransitSlotItemTrailDto$ButtonDto) tVar).c);
            }
        }
        masstransitSlotItemMapper$mapTrail$1 = new MasstransitSlotItemMapper$mapTrail$1(aVar, continuationImpl);
        MasstransitSlotItemMapper$mapTrail$1 masstransitSlotItemMapper$mapTrail$122 = masstransitSlotItemMapper$mapTrail$1;
        Object obj2 = masstransitSlotItemMapper$mapTrail$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitSlotItemMapper$mapTrail$122.label;
        if (i != 0) {
        }
        return new p510((CharSequence) obj2, o510Var2, ((MasstransitSlotItemTrailDto$ButtonDto) tVar).c);
    }

    public static int c(o oVar) {
        Integer num;
        if (oVar instanceof FormattedText.h) {
            num = ((FormattedText.h) oVar).d;
        } else if (oVar instanceof FormattedText.g) {
            num = ((FormattedText.g) oVar).b.d;
        } else if (oVar instanceof FormattedText.a) {
            Iterator it = ((FormattedText.a) oVar).b.iterator();
            if (it.hasNext()) {
                Integer valueOf = Integer.valueOf(c((o) it.next()));
                while (it.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(c((o) it.next()));
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
                num = valueOf;
            } else {
                num = null;
            }
        } else {
            num = 0;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static c510 e(Pair pair, Pair pair2) {
        return new c510(h((List) pair.f(), (MasstransitSlotItemBodyPropertiesDto) pair.c()), h((List) pair2.f(), (MasstransitSlotItemBodyPropertiesDto) pair2.c()));
    }

    public static MasstransitSlotItemUiState$Body$Ellipsize f(x410 x410Var) {
        MasstransitSlotItemLineDto.Ellipsis ellipsis = x410Var != null ? x410Var.e : null;
        int i = ellipsis == null ? -1 : y410.d[ellipsis.ordinal()];
        if (i == -1) {
            return MasstransitSlotItemUiState$Body$Ellipsize.NONE;
        }
        if (i == 1) {
            return MasstransitSlotItemUiState$Body$Ellipsize.MIDDLE;
        }
        if (i == 2) {
            return MasstransitSlotItemUiState$Body$Ellipsize.END;
        }
        w511.b();
        return null;
    }

    public static nvi0 g(MtSdkImage mtSdkImage) {
        String str = mtSdkImage.c;
        if (str == null && (str = mtSdkImage.b) == null) {
            MtSdkUrlParts mtSdkUrlParts = mtSdkImage.e;
            str = mtSdkUrlParts != null ? mtSdkUrlParts.b : null;
        }
        String str2 = mtSdkImage.a;
        if (str != null && str.length() != 0) {
            return mja1.a(str, null, 6);
        }
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        return mja1.b(str2, null, 6);
    }

    public static g510 h(List list, MasstransitSlotItemBodyPropertiesDto masstransitSlotItemBodyPropertiesDto) {
        Pair pair;
        MasstransitSlotItemUiState$Body$Alignment masstransitSlotItemUiState$Body$Alignment;
        x410 x410Var = (x410) kotlin.collections.a.P(list);
        CharSequence charSequence = x410Var.a;
        MasstransitSlotItemUiState$Body$Ellipsize f = f(x410Var);
        x410 x410Var2 = (x410) kotlin.collections.a.S(1, list);
        CharSequence charSequence2 = x410Var2 != null ? x410Var2.a : null;
        MasstransitSlotItemUiState$Body$Ellipsize f2 = f(x410Var2);
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((x410) it.next()).d;
        }
        if (i > 3) {
            pair = new Pair(1, 2);
        } else {
            int i2 = x410Var.d;
            pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i - i2));
        }
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        wp2 wp2Var = x410Var.b;
        Integer num = x410Var.c;
        wp2 wp2Var2 = x410Var2 != null ? x410Var2.b : null;
        Integer num2 = x410Var2 != null ? x410Var2.c : null;
        int i3 = y410.c[masstransitSlotItemBodyPropertiesDto.a.ordinal()];
        if (i3 == 1) {
            masstransitSlotItemUiState$Body$Alignment = MasstransitSlotItemUiState$Body$Alignment.START;
        } else if (i3 == 2) {
            masstransitSlotItemUiState$Body$Alignment = MasstransitSlotItemUiState$Body$Alignment.CENTER;
        } else {
            if (i3 != 3) {
                w511.b();
                return null;
            }
            masstransitSlotItemUiState$Body$Alignment = MasstransitSlotItemUiState$Body$Alignment.END;
        }
        return new g510(charSequence, wp2Var, num, charSequence2, wp2Var2, num2, new f510(masstransitSlotItemUiState$Body$Alignment, intValue, intValue2, f, f2));
    }

    public final Object d(MasstransitSlotItemDto masstransitSlotItemDto, CurrencyRulesDto currencyRulesDto, ContinuationImpl continuationImpl) {
        return tje.k0(uyj.a, new MasstransitSlotItemMapper$map$2(this, masstransitSlotItemDto, currencyRulesDto, null), continuationImpl);
    }
}
