package com.yandex.go.lootbox.impl.data.mapper.content;

import com.yandex.go.lootbox.impl.data.entities.network.common.button.LootBoxButtonDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.content.LootBoxContentDirectOfferDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.content.LootBoxContentLootBoxDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.gift.LootBoxGiftDto;
import defpackage.eqz;
import defpackage.fpz;
import defpackage.lpz;
import defpackage.ny61;
import defpackage.ppz;
import defpackage.tcc;
import defpackage.toz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.go.lootbox.impl.data.mapper.action.a a;
    public final com.yandex.go.lootbox.impl.data.mapper.gift.a b;
    public final com.yandex.go.lootbox.impl.data.mapper.button.a c;
    public final c d;

    public a(com.yandex.go.lootbox.impl.data.mapper.action.a aVar, com.yandex.go.lootbox.impl.data.mapper.gift.a aVar2, com.yandex.go.lootbox.impl.data.mapper.button.a aVar3, c cVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(LootBoxContentDirectOfferDto lootBoxContentDirectOfferDto, ContinuationImpl continuationImpl) {
        LootBoxContentDtoToEntityMapperImpl$map$4 lootBoxContentDtoToEntityMapperImpl$map$4;
        int i;
        if (continuationImpl instanceof LootBoxContentDtoToEntityMapperImpl$map$4) {
            lootBoxContentDtoToEntityMapperImpl$map$4 = (LootBoxContentDtoToEntityMapperImpl$map$4) continuationImpl;
            int i2 = lootBoxContentDtoToEntityMapperImpl$map$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lootBoxContentDtoToEntityMapperImpl$map$4.label = i2 - Integer.MIN_VALUE;
                Object obj = lootBoxContentDtoToEntityMapperImpl$map$4.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lootBoxContentDtoToEntityMapperImpl$map$4.label;
                if (i != 0) {
                    b.b(obj);
                    com.yandex.go.lootbox.impl.data.entities.network.common.action.b bVar = lootBoxContentDirectOfferDto.a;
                    lootBoxContentDtoToEntityMapperImpl$map$4.L$0 = null;
                    lootBoxContentDtoToEntityMapperImpl$map$4.label = 1;
                    obj = this.a.a(bVar, lootBoxContentDtoToEntityMapperImpl$map$4);
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
                return new lpz((toz) obj);
            }
        }
        lootBoxContentDtoToEntityMapperImpl$map$4 = new LootBoxContentDtoToEntityMapperImpl$map$4(this, continuationImpl);
        Object obj2 = lootBoxContentDtoToEntityMapperImpl$map$4.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lootBoxContentDtoToEntityMapperImpl$map$4.label;
        if (i != 0) {
        }
        return new lpz((toz) obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        if (r14 == r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0103 -> B:20:0x0108). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(LootBoxContentLootBoxDto lootBoxContentLootBoxDto, ContinuationImpl continuationImpl) {
        LootBoxContentDtoToEntityMapperImpl$map$2 lootBoxContentDtoToEntityMapperImpl$map$2;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object e;
        LootBoxContentLootBoxDto lootBoxContentLootBoxDto2;
        String str;
        String obj;
        LootBoxContentLootBoxDto lootBoxContentLootBoxDto3;
        String str2;
        Collection arrayList;
        Iterator it;
        List list;
        String str3;
        String str4;
        if (continuationImpl instanceof LootBoxContentDtoToEntityMapperImpl$map$2) {
            lootBoxContentDtoToEntityMapperImpl$map$2 = (LootBoxContentDtoToEntityMapperImpl$map$2) continuationImpl;
            int i2 = lootBoxContentDtoToEntityMapperImpl$map$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lootBoxContentDtoToEntityMapperImpl$map$2.label = i2 - Integer.MIN_VALUE;
                LootBoxContentDtoToEntityMapperImpl$map$2 lootBoxContentDtoToEntityMapperImpl$map$22 = lootBoxContentDtoToEntityMapperImpl$map$2;
                Object obj2 = lootBoxContentDtoToEntityMapperImpl$map$22.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lootBoxContentDtoToEntityMapperImpl$map$22.label;
                if (i != 0) {
                    b.b(obj2);
                    FormattedText formattedText = lootBoxContentLootBoxDto.a;
                    lootBoxContentDtoToEntityMapperImpl$map$22.L$0 = lootBoxContentLootBoxDto;
                    lootBoxContentDtoToEntityMapperImpl$map$22.label = 1;
                    obj2 = c.e(this.d, formattedText, null, false, lootBoxContentDtoToEntityMapperImpl$map$22, 30);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            str = (String) lootBoxContentDtoToEntityMapperImpl$map$22.L$1;
                            lootBoxContentLootBoxDto2 = (LootBoxContentLootBoxDto) lootBoxContentDtoToEntityMapperImpl$map$22.L$0;
                            b.b(obj2);
                            obj = obj2.toString();
                            List list2 = lootBoxContentLootBoxDto2.c;
                            lootBoxContentLootBoxDto3 = lootBoxContentLootBoxDto2;
                            str2 = str;
                            arrayList = new ArrayList(tcc.n(list2, 10));
                            it = list2.iterator();
                            if (!it.hasNext()) {
                            }
                            return coroutineSingletons;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            list = (List) lootBoxContentDtoToEntityMapperImpl$map$22.L$3;
                            str3 = (String) lootBoxContentDtoToEntityMapperImpl$map$22.L$2;
                            str4 = (String) lootBoxContentDtoToEntityMapperImpl$map$22.L$1;
                            b.b(obj2);
                            return new ppz(str4, str3, list, (fpz) obj2);
                        }
                        arrayList = (Collection) lootBoxContentDtoToEntityMapperImpl$map$22.L$9;
                        String str5 = (String) lootBoxContentDtoToEntityMapperImpl$map$22.L$8;
                        String str6 = (String) lootBoxContentDtoToEntityMapperImpl$map$22.L$7;
                        it = (Iterator) lootBoxContentDtoToEntityMapperImpl$map$22.L$4;
                        Collection collection = (Collection) lootBoxContentDtoToEntityMapperImpl$map$22.L$3;
                        lootBoxContentLootBoxDto3 = (LootBoxContentLootBoxDto) lootBoxContentDtoToEntityMapperImpl$map$22.L$0;
                        b.b(obj2);
                        arrayList.add((eqz) obj2);
                        obj = str5;
                        str2 = str6;
                        arrayList = collection;
                        if (!it.hasNext()) {
                            LootBoxGiftDto lootBoxGiftDto = (LootBoxGiftDto) it.next();
                            lootBoxContentDtoToEntityMapperImpl$map$22.L$0 = lootBoxContentLootBoxDto3;
                            lootBoxContentDtoToEntityMapperImpl$map$22.L$1 = null;
                            lootBoxContentDtoToEntityMapperImpl$map$22.L$2 = null;
                            lootBoxContentDtoToEntityMapperImpl$map$22.L$3 = arrayList;
                            lootBoxContentDtoToEntityMapperImpl$map$22.L$4 = it;
                            lootBoxContentDtoToEntityMapperImpl$map$22.L$5 = null;
                            lootBoxContentDtoToEntityMapperImpl$map$22.L$6 = null;
                            lootBoxContentDtoToEntityMapperImpl$map$22.L$7 = str2;
                            lootBoxContentDtoToEntityMapperImpl$map$22.L$8 = obj;
                            lootBoxContentDtoToEntityMapperImpl$map$22.L$9 = arrayList;
                            lootBoxContentDtoToEntityMapperImpl$map$22.label = 3;
                            Object a = this.b.a(lootBoxGiftDto, lootBoxContentDtoToEntityMapperImpl$map$22);
                            if (a != coroutineSingletons) {
                                String str7 = str2;
                                str5 = obj;
                                obj2 = a;
                                str6 = str7;
                                collection = arrayList;
                                arrayList.add((eqz) obj2);
                                obj = str5;
                                str2 = str6;
                                arrayList = collection;
                                if (!it.hasNext()) {
                                    List list3 = (List) arrayList;
                                    LootBoxButtonDto lootBoxButtonDto = lootBoxContentLootBoxDto3.d;
                                    lootBoxContentDtoToEntityMapperImpl$map$22.L$0 = null;
                                    lootBoxContentDtoToEntityMapperImpl$map$22.L$1 = str2;
                                    lootBoxContentDtoToEntityMapperImpl$map$22.L$2 = obj;
                                    lootBoxContentDtoToEntityMapperImpl$map$22.L$3 = list3;
                                    lootBoxContentDtoToEntityMapperImpl$map$22.L$4 = null;
                                    lootBoxContentDtoToEntityMapperImpl$map$22.L$5 = null;
                                    lootBoxContentDtoToEntityMapperImpl$map$22.L$6 = null;
                                    lootBoxContentDtoToEntityMapperImpl$map$22.L$7 = null;
                                    lootBoxContentDtoToEntityMapperImpl$map$22.L$8 = null;
                                    lootBoxContentDtoToEntityMapperImpl$map$22.L$9 = null;
                                    lootBoxContentDtoToEntityMapperImpl$map$22.label = 4;
                                    Object a2 = this.c.a(lootBoxButtonDto, lootBoxContentDtoToEntityMapperImpl$map$22);
                                    if (a2 != coroutineSingletons) {
                                        String str8 = obj;
                                        obj2 = a2;
                                        list = list3;
                                        str3 = str8;
                                        str4 = str2;
                                        return new ppz(str4, str3, list, (fpz) obj2);
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    lootBoxContentLootBoxDto = (LootBoxContentLootBoxDto) lootBoxContentDtoToEntityMapperImpl$map$22.L$0;
                    b.b(obj2);
                }
                String obj3 = obj2.toString();
                FormattedText formattedText2 = lootBoxContentLootBoxDto.b;
                lootBoxContentDtoToEntityMapperImpl$map$22.L$0 = lootBoxContentLootBoxDto;
                lootBoxContentDtoToEntityMapperImpl$map$22.L$1 = obj3;
                lootBoxContentDtoToEntityMapperImpl$map$22.label = 2;
                e = c.e(this.d, formattedText2, null, false, lootBoxContentDtoToEntityMapperImpl$map$22, 30);
                if (e != coroutineSingletons) {
                    lootBoxContentLootBoxDto2 = lootBoxContentLootBoxDto;
                    str = obj3;
                    obj2 = e;
                    obj = obj2.toString();
                    List list22 = lootBoxContentLootBoxDto2.c;
                    lootBoxContentLootBoxDto3 = lootBoxContentLootBoxDto2;
                    str2 = str;
                    arrayList = new ArrayList(tcc.n(list22, 10));
                    it = list22.iterator();
                    if (!it.hasNext()) {
                    }
                }
                return coroutineSingletons;
            }
        }
        lootBoxContentDtoToEntityMapperImpl$map$2 = new LootBoxContentDtoToEntityMapperImpl$map$2(this, continuationImpl);
        LootBoxContentDtoToEntityMapperImpl$map$2 lootBoxContentDtoToEntityMapperImpl$map$222 = lootBoxContentDtoToEntityMapperImpl$map$2;
        Object obj22 = lootBoxContentDtoToEntityMapperImpl$map$222.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lootBoxContentDtoToEntityMapperImpl$map$222.label;
        if (i != 0) {
        }
        String obj32 = obj22.toString();
        FormattedText formattedText22 = lootBoxContentLootBoxDto.b;
        lootBoxContentDtoToEntityMapperImpl$map$222.L$0 = lootBoxContentLootBoxDto;
        lootBoxContentDtoToEntityMapperImpl$map$222.L$1 = obj32;
        lootBoxContentDtoToEntityMapperImpl$map$222.label = 2;
        e = c.e(this.d, formattedText22, null, false, lootBoxContentDtoToEntityMapperImpl$map$222, 30);
        if (e != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
