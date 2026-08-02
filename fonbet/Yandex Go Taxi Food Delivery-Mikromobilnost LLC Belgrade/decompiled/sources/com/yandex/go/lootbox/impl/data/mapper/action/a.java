package com.yandex.go.lootbox.impl.data.mapper.action;

import com.yandex.go.lootbox.impl.data.entities.network.common.action.LootBoxActionDeeplinkDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.action.LootBoxActionModalViewDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.action.LootBoxActionWebViewDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.action.b;
import com.yandex.go.lootbox.impl.data.entities.network.common.action.d;
import com.yandex.go.lootbox.impl.data.entities.network.common.button.LootBoxButtonDto;
import defpackage.fpz;
import defpackage.ny61;
import defpackage.qoz;
import defpackage.toz;
import defpackage.uoz;
import defpackage.voz;
import defpackage.w511;
import defpackage.woz;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class a {
    public final c a;
    public final com.yandex.go.lootbox.impl.data.mapper.button.a b;

    public a(c cVar, com.yandex.go.lootbox.impl.data.mapper.button.a aVar) {
        this.a = cVar;
        this.b = aVar;
    }

    public final Object a(b bVar, ContinuationImpl continuationImpl) {
        if (bVar instanceof d) {
            return voz.a;
        }
        if (bVar instanceof LootBoxActionModalViewDto) {
            Object b = b((LootBoxActionModalViewDto) bVar, continuationImpl);
            return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : (toz) b;
        }
        if (bVar instanceof LootBoxActionDeeplinkDto) {
            return new qoz(((LootBoxActionDeeplinkDto) bVar).a);
        }
        if (bVar instanceof LootBoxActionWebViewDto) {
            LootBoxActionWebViewDto lootBoxActionWebViewDto = (LootBoxActionWebViewDto) bVar;
            return new woz(lootBoxActionWebViewDto.a, lootBoxActionWebViewDto.b);
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(LootBoxActionModalViewDto lootBoxActionModalViewDto, ContinuationImpl continuationImpl) {
        LootBoxActionDtoToEntityMapperImpl$map$2 lootBoxActionDtoToEntityMapperImpl$map$2;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str;
        Object a;
        String str2;
        String str3;
        String str4;
        if (continuationImpl instanceof LootBoxActionDtoToEntityMapperImpl$map$2) {
            lootBoxActionDtoToEntityMapperImpl$map$2 = (LootBoxActionDtoToEntityMapperImpl$map$2) continuationImpl;
            int i2 = lootBoxActionDtoToEntityMapperImpl$map$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lootBoxActionDtoToEntityMapperImpl$map$2.label = i2 - Integer.MIN_VALUE;
                LootBoxActionDtoToEntityMapperImpl$map$2 lootBoxActionDtoToEntityMapperImpl$map$22 = lootBoxActionDtoToEntityMapperImpl$map$2;
                Object obj = lootBoxActionDtoToEntityMapperImpl$map$22.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lootBoxActionDtoToEntityMapperImpl$map$22.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str5 = lootBoxActionModalViewDto.a;
                    FormattedText formattedText = lootBoxActionModalViewDto.b;
                    lootBoxActionDtoToEntityMapperImpl$map$22.L$0 = lootBoxActionModalViewDto;
                    lootBoxActionDtoToEntityMapperImpl$map$22.L$1 = str5;
                    lootBoxActionDtoToEntityMapperImpl$map$22.label = 1;
                    Object e = c.e(this.a, formattedText, null, false, lootBoxActionDtoToEntityMapperImpl$map$22, 30);
                    if (e != coroutineSingletons) {
                        str = str5;
                        obj = e;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str4 = (String) lootBoxActionDtoToEntityMapperImpl$map$22.L$3;
                    str2 = (String) lootBoxActionDtoToEntityMapperImpl$map$22.L$2;
                    str3 = (String) lootBoxActionDtoToEntityMapperImpl$map$22.L$1;
                    kotlin.b.b(obj);
                    return new uoz(str3, str2, str4, (fpz) obj);
                }
                String str6 = (String) lootBoxActionDtoToEntityMapperImpl$map$22.L$1;
                LootBoxActionModalViewDto lootBoxActionModalViewDto2 = (LootBoxActionModalViewDto) lootBoxActionDtoToEntityMapperImpl$map$22.L$0;
                kotlin.b.b(obj);
                str = str6;
                lootBoxActionModalViewDto = lootBoxActionModalViewDto2;
                String obj2 = obj.toString();
                String str7 = lootBoxActionModalViewDto.c;
                LootBoxButtonDto lootBoxButtonDto = lootBoxActionModalViewDto.d;
                lootBoxActionDtoToEntityMapperImpl$map$22.L$0 = null;
                lootBoxActionDtoToEntityMapperImpl$map$22.L$1 = str;
                lootBoxActionDtoToEntityMapperImpl$map$22.L$2 = obj2;
                lootBoxActionDtoToEntityMapperImpl$map$22.L$3 = str7;
                lootBoxActionDtoToEntityMapperImpl$map$22.label = 2;
                a = this.b.a(lootBoxButtonDto, lootBoxActionDtoToEntityMapperImpl$map$22);
                if (a != coroutineSingletons) {
                    str2 = obj2;
                    str3 = str;
                    obj = a;
                    str4 = str7;
                    return new uoz(str3, str2, str4, (fpz) obj);
                }
                return coroutineSingletons;
            }
        }
        lootBoxActionDtoToEntityMapperImpl$map$2 = new LootBoxActionDtoToEntityMapperImpl$map$2(this, continuationImpl);
        LootBoxActionDtoToEntityMapperImpl$map$2 lootBoxActionDtoToEntityMapperImpl$map$222 = lootBoxActionDtoToEntityMapperImpl$map$2;
        Object obj3 = lootBoxActionDtoToEntityMapperImpl$map$222.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lootBoxActionDtoToEntityMapperImpl$map$222.label;
        if (i != 0) {
        }
        String obj22 = obj3.toString();
        String str72 = lootBoxActionModalViewDto.c;
        LootBoxButtonDto lootBoxButtonDto2 = lootBoxActionModalViewDto.d;
        lootBoxActionDtoToEntityMapperImpl$map$222.L$0 = null;
        lootBoxActionDtoToEntityMapperImpl$map$222.L$1 = str;
        lootBoxActionDtoToEntityMapperImpl$map$222.L$2 = obj22;
        lootBoxActionDtoToEntityMapperImpl$map$222.L$3 = str72;
        lootBoxActionDtoToEntityMapperImpl$map$222.label = 2;
        a = this.b.a(lootBoxButtonDto2, lootBoxActionDtoToEntityMapperImpl$map$222);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
