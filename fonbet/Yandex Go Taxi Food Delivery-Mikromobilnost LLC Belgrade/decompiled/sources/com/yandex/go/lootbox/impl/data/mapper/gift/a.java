package com.yandex.go.lootbox.impl.data.mapper.gift;

import com.yandex.go.lootbox.impl.data.entities.network.common.gift.LootBoxGiftDto;
import defpackage.eqz;
import defpackage.ny61;
import defpackage.toz;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.go.lootbox.impl.data.mapper.action.a a;

    public a(com.yandex.go.lootbox.impl.data.mapper.action.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(LootBoxGiftDto lootBoxGiftDto, ContinuationImpl continuationImpl) {
        LootBoxGiftDtoToEntityMapperImpl$map$1 lootBoxGiftDtoToEntityMapperImpl$map$1;
        int i;
        FormattedText formattedText;
        FormattedText formattedText2;
        String str;
        String str2;
        if (continuationImpl instanceof LootBoxGiftDtoToEntityMapperImpl$map$1) {
            lootBoxGiftDtoToEntityMapperImpl$map$1 = (LootBoxGiftDtoToEntityMapperImpl$map$1) continuationImpl;
            int i2 = lootBoxGiftDtoToEntityMapperImpl$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lootBoxGiftDtoToEntityMapperImpl$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lootBoxGiftDtoToEntityMapperImpl$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lootBoxGiftDtoToEntityMapperImpl$map$1.label;
                if (i != 0) {
                    b.b(obj);
                    formattedText = lootBoxGiftDto.a;
                    FormattedText formattedText3 = lootBoxGiftDto.b;
                    String str3 = lootBoxGiftDto.c;
                    String str4 = lootBoxGiftDto.d;
                    com.yandex.go.lootbox.impl.data.entities.network.common.action.b bVar = lootBoxGiftDto.e;
                    lootBoxGiftDtoToEntityMapperImpl$map$1.L$0 = null;
                    lootBoxGiftDtoToEntityMapperImpl$map$1.L$1 = formattedText;
                    lootBoxGiftDtoToEntityMapperImpl$map$1.L$2 = formattedText3;
                    lootBoxGiftDtoToEntityMapperImpl$map$1.L$3 = str3;
                    lootBoxGiftDtoToEntityMapperImpl$map$1.L$4 = str4;
                    lootBoxGiftDtoToEntityMapperImpl$map$1.label = 1;
                    Object a = this.a.a(bVar, lootBoxGiftDtoToEntityMapperImpl$map$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    formattedText2 = formattedText3;
                    str = str3;
                    str2 = str4;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str5 = (String) lootBoxGiftDtoToEntityMapperImpl$map$1.L$4;
                    String str6 = (String) lootBoxGiftDtoToEntityMapperImpl$map$1.L$3;
                    FormattedText formattedText4 = (FormattedText) lootBoxGiftDtoToEntityMapperImpl$map$1.L$2;
                    formattedText = (FormattedText) lootBoxGiftDtoToEntityMapperImpl$map$1.L$1;
                    b.b(obj);
                    str2 = str5;
                    str = str6;
                    formattedText2 = formattedText4;
                }
                return new eqz(formattedText, formattedText2, str, str2, (toz) obj);
            }
        }
        lootBoxGiftDtoToEntityMapperImpl$map$1 = new LootBoxGiftDtoToEntityMapperImpl$map$1(this, continuationImpl);
        Object obj2 = lootBoxGiftDtoToEntityMapperImpl$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lootBoxGiftDtoToEntityMapperImpl$map$1.label;
        if (i != 0) {
        }
        return new eqz(formattedText, formattedText2, str, str2, (toz) obj2);
    }
}
