package com.yandex.go.lootbox.impl.data.repository.activation;

import com.yandex.go.lootbox.api.domain.entities.lootbox.content.LootBoxContentTypeEntity;
import com.yandex.go.lootbox.impl.data.api.LootBoxApi;
import com.yandex.go.lootbox.impl.data.entities.network.activation.LootBoxActivationRequestDto;
import com.yandex.go.lootbox.impl.data.entities.network.activation.LootBoxActivationResponseDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.content.LootBoxContentDirectOfferDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.content.LootBoxContentLootBoxDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.content.LootBoxContentTypeDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.content.d;
import com.yandex.go.lootbox.impl.data.entities.network.common.user_info.LootBoxUserInfoDto;
import defpackage.cmt;
import defpackage.ny61;
import defpackage.opz;
import defpackage.tpz;
import defpackage.upz;
import defpackage.w511;
import defpackage.xpz;
import java.util.UUID;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final LootBoxApi a;
    public final upz b;
    public final com.yandex.go.lootbox.impl.data.mapper.content.a c;

    public a(LootBoxApi lootBoxApi, upz upzVar, com.yandex.go.lootbox.impl.data.mapper.content.a aVar) {
        this.a = lootBoxApi;
        this.b = upzVar;
        this.c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        if (r12 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
    
        if (r12 == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, LootBoxContentTypeEntity lootBoxContentTypeEntity, String str2, String str3, ContinuationImpl continuationImpl) {
        LootBoxActivationRepositoryImpl$activateLootBox$1 lootBoxActivationRepositoryImpl$activateLootBox$1;
        int i;
        LootBoxContentTypeDto lootBoxContentTypeDto;
        Object a;
        if (continuationImpl instanceof LootBoxActivationRepositoryImpl$activateLootBox$1) {
            lootBoxActivationRepositoryImpl$activateLootBox$1 = (LootBoxActivationRepositoryImpl$activateLootBox$1) continuationImpl;
            int i2 = lootBoxActivationRepositoryImpl$activateLootBox$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lootBoxActivationRepositoryImpl$activateLootBox$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lootBoxActivationRepositoryImpl$activateLootBox$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lootBoxActivationRepositoryImpl$activateLootBox$1.label;
                if (i != 0) {
                    b.b(obj);
                    lootBoxActivationRepositoryImpl$activateLootBox$1.L$0 = null;
                    lootBoxActivationRepositoryImpl$activateLootBox$1.L$1 = null;
                    lootBoxActivationRepositoryImpl$activateLootBox$1.L$2 = str2;
                    lootBoxActivationRepositoryImpl$activateLootBox$1.L$3 = str3;
                    lootBoxActivationRepositoryImpl$activateLootBox$1.L$4 = str;
                    lootBoxActivationRepositoryImpl$activateLootBox$1.label = 1;
                    this.b.getClass();
                    int i3 = tpz.a[lootBoxContentTypeEntity.ordinal()];
                    if (i3 == 1) {
                        lootBoxContentTypeDto = LootBoxContentTypeDto.UNKNOWN;
                    } else if (i3 == 2) {
                        lootBoxContentTypeDto = LootBoxContentTypeDto.LOOTBOX;
                    } else {
                        if (i3 != 3) {
                            w511.b();
                            return null;
                        }
                        lootBoxContentTypeDto = LootBoxContentTypeDto.DIRECT_OFFER;
                    }
                    obj = lootBoxContentTypeDto;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            return obj;
                        }
                        b.b(obj);
                        com.yandex.go.lootbox.impl.data.entities.network.common.content.b bVar = ((LootBoxActivationResponseDto) obj).a;
                        lootBoxActivationRepositoryImpl$activateLootBox$1.L$0 = null;
                        lootBoxActivationRepositoryImpl$activateLootBox$1.L$1 = null;
                        lootBoxActivationRepositoryImpl$activateLootBox$1.L$2 = null;
                        lootBoxActivationRepositoryImpl$activateLootBox$1.L$3 = null;
                        lootBoxActivationRepositoryImpl$activateLootBox$1.L$4 = null;
                        lootBoxActivationRepositoryImpl$activateLootBox$1.L$5 = null;
                        lootBoxActivationRepositoryImpl$activateLootBox$1.label = 3;
                        com.yandex.go.lootbox.impl.data.mapper.content.a aVar = this.c;
                        aVar.getClass();
                        if (bVar instanceof d) {
                            a = xpz.a;
                        } else if (bVar instanceof LootBoxContentLootBoxDto) {
                            a = aVar.b((LootBoxContentLootBoxDto) bVar, lootBoxActivationRepositoryImpl$activateLootBox$1);
                            if (a != coroutineSingletons) {
                                a = (opz) a;
                            }
                        } else {
                            if (!(bVar instanceof LootBoxContentDirectOfferDto)) {
                                w511.b();
                                return null;
                            }
                            a = aVar.a((LootBoxContentDirectOfferDto) bVar, lootBoxActivationRepositoryImpl$activateLootBox$1);
                            if (a != coroutineSingletons) {
                                a = (opz) a;
                            }
                        }
                        return a == coroutineSingletons ? coroutineSingletons : a;
                    }
                    str = (String) lootBoxActivationRepositoryImpl$activateLootBox$1.L$4;
                    str3 = (String) lootBoxActivationRepositoryImpl$activateLootBox$1.L$3;
                    str2 = (String) lootBoxActivationRepositoryImpl$activateLootBox$1.L$2;
                    b.b(obj);
                }
                cmt<LootBoxActivationResponseDto> b = this.a.b(UUID.randomUUID().toString(), new LootBoxActivationRequestDto(str, (LootBoxContentTypeDto) obj, new LootBoxUserInfoDto(str2, str3)));
                lootBoxActivationRepositoryImpl$activateLootBox$1.L$0 = null;
                lootBoxActivationRepositoryImpl$activateLootBox$1.L$1 = null;
                lootBoxActivationRepositoryImpl$activateLootBox$1.L$2 = null;
                lootBoxActivationRepositoryImpl$activateLootBox$1.L$3 = null;
                lootBoxActivationRepositoryImpl$activateLootBox$1.L$4 = null;
                lootBoxActivationRepositoryImpl$activateLootBox$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.a(b, null, lootBoxActivationRepositoryImpl$activateLootBox$1);
            }
        }
        lootBoxActivationRepositoryImpl$activateLootBox$1 = new LootBoxActivationRepositoryImpl$activateLootBox$1(this, continuationImpl);
        Object obj2 = lootBoxActivationRepositoryImpl$activateLootBox$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lootBoxActivationRepositoryImpl$activateLootBox$1.label;
        if (i != 0) {
        }
        cmt<LootBoxActivationResponseDto> b2 = this.a.b(UUID.randomUUID().toString(), new LootBoxActivationRequestDto(str, (LootBoxContentTypeDto) obj2, new LootBoxUserInfoDto(str2, str3)));
        lootBoxActivationRepositoryImpl$activateLootBox$1.L$0 = null;
        lootBoxActivationRepositoryImpl$activateLootBox$1.L$1 = null;
        lootBoxActivationRepositoryImpl$activateLootBox$1.L$2 = null;
        lootBoxActivationRepositoryImpl$activateLootBox$1.L$3 = null;
        lootBoxActivationRepositoryImpl$activateLootBox$1.L$4 = null;
        lootBoxActivationRepositoryImpl$activateLootBox$1.label = 2;
        obj2 = ru.yandex.taxi.network.api.a.a(b2, null, lootBoxActivationRepositoryImpl$activateLootBox$1);
    }
}
