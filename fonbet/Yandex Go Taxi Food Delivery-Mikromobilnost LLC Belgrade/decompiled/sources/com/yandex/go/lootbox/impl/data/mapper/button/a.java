package com.yandex.go.lootbox.impl.data.mapper.button;

import com.yandex.go.lootbox.impl.data.entities.network.common.action.LootBoxActionDeeplinkDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.button.LootBoxButtonDto;
import defpackage.fpz;
import defpackage.kdc;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.qoz;
import defpackage.ufu;
import defpackage.voz;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class a {
    public final pdc a;
    public final c b;

    public a(pdc pdcVar, c cVar) {
        this.a = pdcVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(LootBoxButtonDto lootBoxButtonDto, ContinuationImpl continuationImpl) {
        LootBoxButtonDtoToEntityMapperImpl$map$1 lootBoxButtonDtoToEntityMapperImpl$map$1;
        int i;
        kdc kdcVar;
        if (continuationImpl instanceof LootBoxButtonDtoToEntityMapperImpl$map$1) {
            lootBoxButtonDtoToEntityMapperImpl$map$1 = (LootBoxButtonDtoToEntityMapperImpl$map$1) continuationImpl;
            int i2 = lootBoxButtonDtoToEntityMapperImpl$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lootBoxButtonDtoToEntityMapperImpl$map$1.label = i2 - Integer.MIN_VALUE;
                LootBoxButtonDtoToEntityMapperImpl$map$1 lootBoxButtonDtoToEntityMapperImpl$map$12 = lootBoxButtonDtoToEntityMapperImpl$map$1;
                Object obj = lootBoxButtonDtoToEntityMapperImpl$map$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lootBoxButtonDtoToEntityMapperImpl$map$12.label;
                if (i != 0) {
                    b.b(obj);
                    kdc b = ((ufu) this.a).b(lootBoxButtonDto.a);
                    FormattedText formattedText = lootBoxButtonDto.b;
                    lootBoxButtonDtoToEntityMapperImpl$map$12.L$0 = lootBoxButtonDto;
                    lootBoxButtonDtoToEntityMapperImpl$map$12.L$1 = b;
                    lootBoxButtonDtoToEntityMapperImpl$map$12.label = 1;
                    Object e = c.e(this.b, formattedText, null, false, lootBoxButtonDtoToEntityMapperImpl$map$12, 30);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = e;
                    kdcVar = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kdcVar = (kdc) lootBoxButtonDtoToEntityMapperImpl$map$12.L$1;
                    lootBoxButtonDto = (LootBoxButtonDto) lootBoxButtonDtoToEntityMapperImpl$map$12.L$0;
                    b.b(obj);
                }
                String obj2 = obj.toString();
                com.yandex.go.lootbox.impl.data.entities.network.common.action.b bVar = lootBoxButtonDto.c;
                return new fpz(kdcVar, obj2, !(bVar instanceof LootBoxActionDeeplinkDto) ? new qoz(((LootBoxActionDeeplinkDto) bVar).a) : voz.a);
            }
        }
        lootBoxButtonDtoToEntityMapperImpl$map$1 = new LootBoxButtonDtoToEntityMapperImpl$map$1(this, continuationImpl);
        LootBoxButtonDtoToEntityMapperImpl$map$1 lootBoxButtonDtoToEntityMapperImpl$map$122 = lootBoxButtonDtoToEntityMapperImpl$map$1;
        Object obj3 = lootBoxButtonDtoToEntityMapperImpl$map$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lootBoxButtonDtoToEntityMapperImpl$map$122.label;
        if (i != 0) {
        }
        String obj22 = obj3.toString();
        com.yandex.go.lootbox.impl.data.entities.network.common.action.b bVar2 = lootBoxButtonDto.c;
        return new fpz(kdcVar, obj22, !(bVar2 instanceof LootBoxActionDeeplinkDto) ? new qoz(((LootBoxActionDeeplinkDto) bVar2).a) : voz.a);
    }
}
