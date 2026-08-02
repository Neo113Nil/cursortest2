package com.yandex.go.masstransit.sdk.order.impl.orders;

import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemBodyDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemLineDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemTrailDto$ButtonDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemTrailDto$IconSpotDto;
import com.yandex.go.masstransit.sdk.core.image.MtSdkImage;
import com.yandex.go.masstransit.sdk.core.image.MtSdkUrlParts;
import defpackage.bvf0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.gci0;
import defpackage.hit;
import defpackage.j310;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qc20;
import defpackage.s00;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.xby;
import defpackage.z110;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.api.dto.RetryPolicy;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.masstransit.orders.MasstransitOrdersActivityListener$onLargestContentfulPaint$1$invokeSuspend$$inlined$safeCollect$2$1;

/* loaded from: classes8.dex */
public final class k implements z110 {
    public final h a;
    public final ru.yandex.taxi.stories.domain.b b;
    public final ru.yandex.taxi.widget.d c;
    public final pav d;
    public final k7x0 e;
    public final tt2 f;
    public final j310 g;
    public final s00 h;
    public final qc20 i;
    public final r0 j;
    public final r0 k;
    public final r0 l;
    public final gci0 m;

    public k(h hVar, ru.yandex.taxi.stories.domain.b bVar, ru.yandex.taxi.widget.d dVar, pav pavVar, k7x0 k7x0Var, tt2 tt2Var, j310 j310Var, s00 s00Var, qc20 qc20Var) {
        this.a = hVar;
        this.b = bVar;
        this.c = dVar;
        this.d = pavVar;
        this.e = k7x0Var;
        this.f = tt2Var;
        this.g = j310Var;
        this.h = s00Var;
        this.i = qc20Var;
        r0 c = bvf0.c(kotlin.collections.b.f());
        this.j = c;
        this.k = bvf0.c(EmptyList.a);
        this.l = bvf0.c(null);
        this.m = kotlinx.coroutines.flow.e.d(c);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0085 -> B:13:0x00da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00ab -> B:12:0x00ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(k kVar, List list, ContinuationImpl continuationImpl) {
        MasstransitOrdersRepository$fixOnboardings$1 masstransitOrdersRepository$fixOnboardings$1;
        int i;
        List arrayList;
        Map map;
        List list2;
        Iterator it;
        kVar.getClass();
        if (continuationImpl instanceof MasstransitOrdersRepository$fixOnboardings$1) {
            masstransitOrdersRepository$fixOnboardings$1 = (MasstransitOrdersRepository$fixOnboardings$1) continuationImpl;
            int i2 = masstransitOrdersRepository$fixOnboardings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitOrdersRepository$fixOnboardings$1.label = i2 - Integer.MIN_VALUE;
                Object obj = masstransitOrdersRepository$fixOnboardings$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitOrdersRepository$fixOnboardings$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList = new ArrayList();
                    map = linkedHashMap;
                    list2 = arrayList2;
                    it = list.iterator();
                    if (it.hasNext()) {
                    }
                    return serializable;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                MasstransitOrderDto masstransitOrderDto = (MasstransitOrderDto) masstransitOrdersRepository$fixOnboardings$1.L$7;
                it = (Iterator) masstransitOrdersRepository$fixOnboardings$1.L$5;
                arrayList = (List) masstransitOrdersRepository$fixOnboardings$1.L$3;
                list2 = (List) masstransitOrdersRepository$fixOnboardings$1.L$2;
                map = (Map) masstransitOrdersRepository$fixOnboardings$1.L$1;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th) {
                    xby.d.k(th, "Cannot load story with id=" + masstransitOrderDto.getE());
                }
                Story story = (Story) obj;
                arrayList.add(story);
                map.put(masstransitOrderDto.getE(), story.b);
                masstransitOrderDto = MasstransitOrderDto.b(masstransitOrderDto, story.b);
                list2.add(masstransitOrderDto);
                if (it.hasNext()) {
                    masstransitOrderDto = (MasstransitOrderDto) it.next();
                    if (((String) map.get(masstransitOrderDto.getE())) == null) {
                        ru.yandex.taxi.stories.domain.b bVar = kVar.b;
                        String e = masstransitOrderDto.getE();
                        masstransitOrdersRepository$fixOnboardings$1.L$0 = null;
                        masstransitOrdersRepository$fixOnboardings$1.L$1 = map;
                        masstransitOrdersRepository$fixOnboardings$1.L$2 = list2;
                        masstransitOrdersRepository$fixOnboardings$1.L$3 = arrayList;
                        masstransitOrdersRepository$fixOnboardings$1.L$4 = null;
                        masstransitOrdersRepository$fixOnboardings$1.L$5 = it;
                        masstransitOrdersRepository$fixOnboardings$1.L$6 = null;
                        masstransitOrdersRepository$fixOnboardings$1.L$7 = masstransitOrderDto;
                        masstransitOrdersRepository$fixOnboardings$1.L$8 = null;
                        masstransitOrdersRepository$fixOnboardings$1.label = 1;
                        obj = bVar.d.c(e, bVar.a, RetryPolicy.DEFAULT, masstransitOrdersRepository$fixOnboardings$1);
                        if (obj == serializable) {
                        }
                        Story story2 = (Story) obj;
                        arrayList.add(story2);
                        map.put(masstransitOrderDto.getE(), story2.b);
                        masstransitOrderDto = MasstransitOrderDto.b(masstransitOrderDto, story2.b);
                    }
                    list2.add(masstransitOrderDto);
                    if (it.hasNext()) {
                        serializable = new Pair(list2, arrayList);
                    }
                }
                return serializable;
            }
        }
        masstransitOrdersRepository$fixOnboardings$1 = new MasstransitOrdersRepository$fixOnboardings$1(kVar, continuationImpl);
        Object obj2 = masstransitOrdersRepository$fixOnboardings$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitOrdersRepository$fixOnboardings$1.label;
        if (i != 0) {
        }
    }

    public static final void b(k kVar, MasstransitSlotItemDto masstransitSlotItemDto) {
        MtSdkImage a;
        kVar.getClass();
        com.yandex.go.masstransit.sdk.core.design.slot.dto.k c = masstransitSlotItemDto.getC();
        if (c != null && (a = c.a()) != null) {
            kVar.h(a);
        }
        Iterator it = masstransitSlotItemDto.getD().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((MasstransitSlotItemBodyDto) it.next()).getA().iterator();
            while (it2.hasNext()) {
                FormattedText c2 = ((MasstransitSlotItemLineDto) it2.next()).getC();
                if (c2 != null) {
                    kVar.l(c2);
                }
            }
        }
        for (com.yandex.go.masstransit.sdk.core.design.slot.dto.t tVar : masstransitSlotItemDto.getE()) {
            if (tVar instanceof MasstransitSlotItemTrailDto$ButtonDto) {
                kVar.l(((MasstransitSlotItemTrailDto$ButtonDto) tVar).getA());
            } else if (tVar instanceof MasstransitSlotItemTrailDto$IconSpotDto) {
                kVar.h(((MasstransitSlotItemTrailDto$IconSpotDto) tVar).getA());
            } else if (!jl40.l(tVar, com.yandex.go.masstransit.sdk.core.design.slot.dto.s.INSTANCE)) {
                w511.b();
                return;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(2:18|19))(3:36|37|(2:39|32))|20|(2:21|(2:23|(2:26|27)(1:25))(2:34|35))|(1:29)(1:33)|30))|42|6|7|(0)(0)|20|(3:21|(0)(0)|25)|(0)(0)|30) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        if (r10.o(r12, r5, r0) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0040, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cb, code lost:
    
        defpackage.xby.d.k(r10, "Error while update active order with id " + r11.getA());
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x003b, B:19:0x0052, B:20:0x0073, B:21:0x0087, B:23:0x008e, B:29:0x00a9, B:30:0x00b8, B:33:0x00b1, B:25:0x00a3, B:37:0x0059), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x003b, B:19:0x0052, B:20:0x0073, B:21:0x0087, B:23:0x008e, B:29:0x00a9, B:30:0x00b8, B:33:0x00b1, B:25:0x00a3, B:37:0x0059), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x003b, B:19:0x0052, B:20:0x0073, B:21:0x0087, B:23:0x008e, B:29:0x00a9, B:30:0x00b8, B:33:0x00b1, B:25:0x00a3, B:37:0x0059), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(k kVar, MasstransitOrderDto masstransitOrderDto, String str, ContinuationImpl continuationImpl) {
        MasstransitOrdersRepository$updateCachedOrder$1 masstransitOrdersRepository$updateCachedOrder$1;
        int i;
        Iterator it;
        int i2;
        kVar.getClass();
        if (continuationImpl instanceof MasstransitOrdersRepository$updateCachedOrder$1) {
            masstransitOrdersRepository$updateCachedOrder$1 = (MasstransitOrdersRepository$updateCachedOrder$1) continuationImpl;
            int i3 = masstransitOrdersRepository$updateCachedOrder$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                masstransitOrdersRepository$updateCachedOrder$1.label = i3 - Integer.MIN_VALUE;
                Object obj = masstransitOrdersRepository$updateCachedOrder$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitOrdersRepository$updateCachedOrder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List singletonList = Collections.singletonList(masstransitOrderDto);
                    masstransitOrdersRepository$updateCachedOrder$1.L$0 = masstransitOrderDto;
                    masstransitOrdersRepository$updateCachedOrder$1.L$1 = str;
                    masstransitOrdersRepository$updateCachedOrder$1.label = 1;
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new MasstransitOrdersRepository$preloadAllMedia$2(kVar, singletonList, null), masstransitOrdersRepository$updateCachedOrder$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    str = (String) masstransitOrdersRepository$updateCachedOrder$1.L$1;
                    masstransitOrderDto = (MasstransitOrderDto) masstransitOrdersRepository$updateCachedOrder$1.L$0;
                    kotlin.b.b(obj);
                }
                List list = (List) obj;
                ArrayList arrayList = new ArrayList((Collection) kVar.k.getValue());
                it = arrayList.iterator();
                i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (jl40.l(((MasstransitOrderDto) it.next()).getA(), masstransitOrderDto.getA())) {
                        break;
                    }
                    i2++;
                }
                if (i2 == -1) {
                    arrayList.set(i2, kotlin.collections.a.P(list));
                } else {
                    arrayList.add(kotlin.collections.a.P(list));
                }
                masstransitOrdersRepository$updateCachedOrder$1.L$0 = masstransitOrderDto;
                masstransitOrdersRepository$updateCachedOrder$1.L$1 = null;
                masstransitOrdersRepository$updateCachedOrder$1.L$2 = null;
                masstransitOrdersRepository$updateCachedOrder$1.L$3 = null;
                masstransitOrdersRepository$updateCachedOrder$1.I$0 = i2;
                masstransitOrdersRepository$updateCachedOrder$1.label = 2;
            }
        }
        masstransitOrdersRepository$updateCachedOrder$1 = new MasstransitOrdersRepository$updateCachedOrder$1(kVar, continuationImpl);
        Object obj3 = masstransitOrdersRepository$updateCachedOrder$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitOrdersRepository$updateCachedOrder$1.label;
        if (i != 0) {
        }
        List list2 = (List) obj3;
        ArrayList arrayList2 = new ArrayList((Collection) kVar.k.getValue());
        it = arrayList2.iterator();
        i2 = 0;
        while (true) {
            if (it.hasNext()) {
            }
            i2++;
        }
        if (i2 == -1) {
        }
        masstransitOrdersRepository$updateCachedOrder$1.L$0 = masstransitOrderDto;
        masstransitOrdersRepository$updateCachedOrder$1.L$1 = null;
        masstransitOrdersRepository$updateCachedOrder$1.L$2 = null;
        masstransitOrdersRepository$updateCachedOrder$1.L$3 = null;
        masstransitOrdersRepository$updateCachedOrder$1.I$0 = i2;
        masstransitOrdersRepository$updateCachedOrder$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0050, code lost:
    
        if (r13 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, ContinuationImpl continuationImpl) {
        MasstransitOrdersRepository$cleanupActivationCodes$1 masstransitOrdersRepository$cleanupActivationCodes$1;
        int i;
        r0 r0Var;
        LinkedHashMap linkedHashMap;
        Object value;
        if (continuationImpl instanceof MasstransitOrdersRepository$cleanupActivationCodes$1) {
            masstransitOrdersRepository$cleanupActivationCodes$1 = (MasstransitOrdersRepository$cleanupActivationCodes$1) continuationImpl;
            int i2 = masstransitOrdersRepository$cleanupActivationCodes$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitOrdersRepository$cleanupActivationCodes$1.label = i2 - Integer.MIN_VALUE;
                Object obj = masstransitOrdersRepository$cleanupActivationCodes$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitOrdersRepository$cleanupActivationCodes$1.label;
                s00 s00Var = this.h;
                if (i != 0) {
                    kotlin.b.b(obj);
                    masstransitOrdersRepository$cleanupActivationCodes$1.L$0 = list;
                    masstransitOrdersRepository$cleanupActivationCodes$1.label = 1;
                    obj = s00Var.a.a(masstransitOrdersRepository$cleanupActivationCodes$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    list = (List) masstransitOrdersRepository$cleanupActivationCodes$1.L$0;
                    kotlin.b.b(obj);
                }
                r0Var = this.j;
                linkedHashMap = new LinkedHashMap(kotlin.collections.b.n((Map) obj, (Map) r0Var.getValue()));
                for (MasstransitOrderDto masstransitOrderDto : list) {
                    for (MasstransitTicketDto masstransitTicketDto : masstransitOrderDto.getB()) {
                        x c = masstransitTicketDto.getC();
                        if (c instanceof TransportPassDto$CppkSuburbanActivationDto) {
                            String p = g8e.p(masstransitOrderDto.getA(), "_", masstransitTicketDto.getA());
                            String b = ((TransportPassDto$CppkSuburbanActivationDto) c).getB();
                            if (b != null && b.equals(linkedHashMap.get(p))) {
                                linkedHashMap.remove(p);
                            }
                        }
                    }
                }
                masstransitOrdersRepository$cleanupActivationCodes$1.L$0 = null;
                masstransitOrdersRepository$cleanupActivationCodes$1.L$1 = null;
                masstransitOrdersRepository$cleanupActivationCodes$1.label = 2;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, linkedHashMap));
                Object d = s00Var.a.d(linkedHashMap, masstransitOrdersRepository$cleanupActivationCodes$1);
                return d != coroutineSingletons ? coroutineSingletons : d;
            }
        }
        masstransitOrdersRepository$cleanupActivationCodes$1 = new MasstransitOrdersRepository$cleanupActivationCodes$1(this, continuationImpl);
        Object obj2 = masstransitOrdersRepository$cleanupActivationCodes$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitOrdersRepository$cleanupActivationCodes$1.label;
        s00 s00Var2 = this.h;
        if (i != 0) {
        }
        r0Var = this.j;
        linkedHashMap = new LinkedHashMap(kotlin.collections.b.n((Map) obj2, (Map) r0Var.getValue()));
        while (r12.hasNext()) {
        }
        masstransitOrdersRepository$cleanupActivationCodes$1.L$0 = null;
        masstransitOrdersRepository$cleanupActivationCodes$1.L$1 = null;
        masstransitOrdersRepository$cleanupActivationCodes$1.label = 2;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, linkedHashMap));
        Object d2 = s00Var2.a.d(linkedHashMap, masstransitOrdersRepository$cleanupActivationCodes$1);
        if (d2 != coroutineSingletons2) {
        }
    }

    public final Object e(MasstransitOrdersActivityListener$onLargestContentfulPaint$1$invokeSuspend$$inlined$safeCollect$2$1 masstransitOrdersActivityListener$onLargestContentfulPaint$1$invokeSuspend$$inlined$safeCollect$2$1) {
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new MasstransitOrdersRepository$clearOrdersCache$2(this, null), masstransitOrdersActivityListener$onLargestContentfulPaint$1$invokeSuspend$$inlined$safeCollect$2$1);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object f(String str, Continuation continuation) {
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new MasstransitOrdersRepository$fetchOrder$2(this, str, null), continuation);
    }

    public final Object g(MasstransitOrdersActivityListener$onLargestContentfulPaint$1$invokeSuspend$$inlined$safeCollect$2$1 masstransitOrdersActivityListener$onLargestContentfulPaint$1$invokeSuspend$$inlined$safeCollect$2$1) {
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new MasstransitOrdersRepository$loadFromCache$2(this, null), masstransitOrdersActivityListener$onLargestContentfulPaint$1$invokeSuspend$$inlined$safeCollect$2$1);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final void h(MtSdkImage mtSdkImage) {
        String c = mtSdkImage.getC();
        if (c == null && (c = mtSdkImage.getB()) == null) {
            MtSdkUrlParts e = mtSdkImage.getE();
            c = e != null ? e.getB() : null;
        }
        String a = mtSdkImage.getA();
        if (c != null && c.length() != 0) {
            j(c);
        } else {
            if (a == null || a.length() == 0) {
                return;
            }
            k(a);
        }
    }

    public final void i(String str) {
        if (evu0.J(str)) {
            return;
        }
        tje.N(((hit) this.i.a).a, null, null, new MasstransitOrdersRepository$preloadAnimation$1(this, str, null), 3);
    }

    public final void j(String str) {
        String a = ((m7x0) this.e).a(str);
        if (evu0.J(a)) {
            return;
        }
        k(a);
    }

    public final void k(String str) {
        if (evu0.J(str)) {
            return;
        }
        tje.N(((hit) this.i.a).a, null, null, new MasstransitOrdersRepository$preloadImage$1(this, str, null), 3);
    }

    public final void l(FormattedText formattedText) {
        for (ru.yandex.taxi.common_models.net.o oVar : formattedText.a) {
            if (oVar instanceof FormattedText.d) {
                j(((FormattedText.d) oVar).a);
            } else if (oVar instanceof FormattedText.e) {
                k(((FormattedText.e) oVar).a);
            }
        }
    }

    public final Object m(MasstransitOrdersActivityListener$onLargestContentfulPaint$1$invokeSuspend$$inlined$safeCollect$2$1 masstransitOrdersActivityListener$onLargestContentfulPaint$1$invokeSuspend$$inlined$safeCollect$2$1) {
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new MasstransitOrdersRepository$requestActiveOrders$2(this, null), masstransitOrdersActivityListener$onLargestContentfulPaint$1$invokeSuspend$$inlined$safeCollect$2$1);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(ContinuationImpl continuationImpl) {
        MasstransitOrdersRepository$requestSingleActiveOrders$1 masstransitOrdersRepository$requestSingleActiveOrders$1;
        int i;
        if (continuationImpl instanceof MasstransitOrdersRepository$requestSingleActiveOrders$1) {
            masstransitOrdersRepository$requestSingleActiveOrders$1 = (MasstransitOrdersRepository$requestSingleActiveOrders$1) continuationImpl;
            int i2 = masstransitOrdersRepository$requestSingleActiveOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitOrdersRepository$requestSingleActiveOrders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = masstransitOrdersRepository$requestSingleActiveOrders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitOrdersRepository$requestSingleActiveOrders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    masstransitOrdersRepository$requestSingleActiveOrders$1.label = 1;
                    sjh sjhVar = uyj.a;
                    if (tje.k0(mdh.b, new MasstransitOrdersRepository$requestOrders$2(this, null), masstransitOrdersRepository$requestSingleActiveOrders$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        masstransitOrdersRepository$requestSingleActiveOrders$1 = new MasstransitOrdersRepository$requestSingleActiveOrders$1(this, continuationImpl);
        Object obj2 = masstransitOrdersRepository$requestSingleActiveOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitOrdersRepository$requestSingleActiveOrders$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (d(r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(String str, List list, ContinuationImpl continuationImpl) {
        MasstransitOrdersRepository$updateActiveOrders$1 masstransitOrdersRepository$updateActiveOrders$1;
        int i;
        if (continuationImpl instanceof MasstransitOrdersRepository$updateActiveOrders$1) {
            masstransitOrdersRepository$updateActiveOrders$1 = (MasstransitOrdersRepository$updateActiveOrders$1) continuationImpl;
            int i2 = masstransitOrdersRepository$updateActiveOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitOrdersRepository$updateActiveOrders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = masstransitOrdersRepository$updateActiveOrders$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitOrdersRepository$updateActiveOrders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    masstransitOrdersRepository$updateActiveOrders$1.L$0 = list;
                    masstransitOrdersRepository$updateActiveOrders$1.L$1 = str;
                    masstransitOrdersRepository$updateActiveOrders$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    str = (String) masstransitOrdersRepository$updateActiveOrders$1.L$1;
                    list = (List) masstransitOrdersRepository$updateActiveOrders$1.L$0;
                    kotlin.b.b(obj);
                }
                this.k.l(list);
                masstransitOrdersRepository$updateActiveOrders$1.L$0 = null;
                masstransitOrdersRepository$updateActiveOrders$1.L$1 = null;
                masstransitOrdersRepository$updateActiveOrders$1.label = 2;
                this.g.a.b(new StorageData(list, str));
                Object obj3 = zy11.a;
                return obj3 != obj2 ? obj2 : obj3;
            }
        }
        masstransitOrdersRepository$updateActiveOrders$1 = new MasstransitOrdersRepository$updateActiveOrders$1(this, continuationImpl);
        Object obj4 = masstransitOrdersRepository$updateActiveOrders$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitOrdersRepository$updateActiveOrders$1.label;
        if (i != 0) {
        }
        this.k.l(list);
        masstransitOrdersRepository$updateActiveOrders$1.L$0 = null;
        masstransitOrdersRepository$updateActiveOrders$1.L$1 = null;
        masstransitOrdersRepository$updateActiveOrders$1.label = 2;
        this.g.a.b(new StorageData(list, str));
        Object obj32 = zy11.a;
        if (obj32 != obj22) {
        }
    }
}
