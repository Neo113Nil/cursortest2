package com.ybsdk.feature.divkit.api.domain;

import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.divkit.api.dto.DivKitDataV2Dto;
import defpackage.c231;
import defpackage.cvu0;
import defpackage.ggy0;
import defpackage.gtq0;
import defpackage.gw00;
import defpackage.kvo;
import defpackage.ni91;
import defpackage.ny61;
import defpackage.omk;
import defpackage.rr51;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u2l;
import defpackage.ur51;
import defpackage.uyj;
import defpackage.v4r0;
import defpackage.w53;
import defpackage.x4c;
import defpackage.ya90;
import defpackage.yvj0;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {
    public final ya90 a;
    public final Map b;
    public final LinkedHashMap c;

    public a(DivDataDto divDataDto) {
        w53 w53Var;
        String palette;
        String templates;
        this.a = new ya90();
        ggy0 ggy0Var = new ggy0();
        LinkedHashMap linkedHashMap = null;
        if (divDataDto != null && (templates = divDataDto.getTemplates()) != null) {
            try {
                w53Var = ggy0Var.a.f(new JSONObject(templates)).a;
            } catch (Exception e) {
                x4c.g("Failed to parse divkit templates", e, templates, null, 8);
            }
            this.b = w53Var;
            if (divDataDto != null && (palette = divDataDto.getPalette()) != null) {
                this.a.getClass();
                linkedHashMap = ya90.a(palette);
            }
            this.c = linkedHashMap;
        }
        w53Var = null;
        this.b = w53Var;
        if (divDataDto != null) {
            this.a.getClass();
            linkedHashMap = ya90.a(palette);
        }
        this.c = linkedHashMap;
    }

    public final rr51 a(DivDataDto divDataDto) {
        LinkedHashMap linkedHashMap;
        Set set;
        List<c231> list;
        List<c231> list2;
        Set keySet;
        u2l u2lVar = new u2l(ur51.c);
        Map map = this.b;
        if (map != null) {
            u2lVar.w.c(map);
        }
        String templates = divDataDto.getTemplates();
        if (templates != null) {
            u2lVar.e(new JSONObject(templates));
        }
        String palette = divDataDto.getPalette();
        if (palette != null) {
            this.a.getClass();
            linkedHashMap = ya90.a(palette);
        } else {
            linkedHashMap = null;
        }
        LinkedHashMap linkedHashMap2 = this.c;
        Set set2 = EmptySet.a;
        if (linkedHashMap2 == null || (set = linkedHashMap2.keySet()) == null) {
            set = set2;
        }
        if (linkedHashMap != null && (keySet = linkedHashMap.keySet()) != null) {
            set2 = keySet;
        }
        LinkedHashSet h = v4r0.h(set, set2);
        int d = gw00.d(tcc.n(h, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(d);
        for (Object obj : h) {
            String str = (String) obj;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            if (linkedHashMap2 != null && (list2 = (List) linkedHashMap2.get(str)) != null) {
                for (c231 c231Var : list2) {
                    linkedHashMap4.put(c231Var.c(), c231Var);
                }
            }
            if (linkedHashMap != null && (list = (List) linkedHashMap.get(str)) != null) {
                for (c231 c231Var2 : list) {
                    linkedHashMap4.put(c231Var2.c(), c231Var2);
                }
            }
            linkedHashMap3.put(obj, kotlin.collections.a.J0(linkedHashMap4.values()));
        }
        String card = divDataDto.getCard();
        if (card == null) {
            ny61.r("Missed \"card\" field in DivDataDto");
            return null;
        }
        JSONObject jSONObject = new JSONObject(card);
        String hash = divDataDto.getHash();
        if (hash == null || hash.length() == 0) {
            hash = cvu0.q(MessageDigest.getInstance("MD5").digest(divDataDto.getCard().getBytes(StandardCharsets.UTF_8)));
            x4c.g("Missed \"hash\" field in DivDataDto", null, String.valueOf(divDataDto), null, 10);
        }
        String str2 = hash;
        kvo kvoVar = omk.i;
        omk n = gtq0.n(u2lVar, jSONObject);
        return new rr51(n, str2, linkedHashMap3, EmptyList.a, n.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(DivDataDto divDataDto, ContinuationImpl continuationImpl) {
        YbDivParser$parseData$1 ybDivParser$parseData$1;
        int i;
        if (continuationImpl instanceof YbDivParser$parseData$1) {
            ybDivParser$parseData$1 = (YbDivParser$parseData$1) continuationImpl;
            int i2 = ybDivParser$parseData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybDivParser$parseData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybDivParser$parseData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybDivParser$parseData$1.label;
                if (i != 0) {
                    b.b(obj);
                    sjh sjhVar = uyj.a;
                    YbDivParser$parseData$2 ybDivParser$parseData$2 = new YbDivParser$parseData$2(this, divDataDto, null);
                    ybDivParser$parseData$1.label = 1;
                    obj = tje.k0(sjhVar, ybDivParser$parseData$2, ybDivParser$parseData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        ybDivParser$parseData$1 = new YbDivParser$parseData$1(this, continuationImpl);
        Object obj2 = ybDivParser$parseData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybDivParser$parseData$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public final Object c(DivKitDataV2Dto divKitDataV2Dto, yvj0 yvj0Var) {
        try {
            rr51 a = a(divKitDataV2Dto.getData());
            return new rr51(a.a, a.b, a.c, ni91.c(divKitDataV2Dto, yvj0Var), a.e);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public a() {
        this(null);
    }
}
