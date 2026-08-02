package com.yandex.go.lootbox.impl.data.api;

import com.yandex.go.lootbox.impl.data.entities.network.activation.LootBoxActivationRequestDto;
import com.yandex.go.lootbox.impl.data.entities.network.activation.LootBoxActivationResponseDto;
import defpackage.cmt;
import defpackage.m6x0;
import defpackage.neu;
import defpackage.q76;
import defpackage.qg21;
import defpackage.rru0;
import defpackage.rvj0;
import defpackage.s490;
import defpackage.wqs;
import defpackage.x6v;
import defpackage.z8u;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/yandex/go/lootbox/impl/data/api/LootBoxApi;", "", "", "idempotencyToken", "Lcom/yandex/go/lootbox/impl/data/entities/network/activation/LootBoxActivationRequestDto;", "requestDto", "Lcmt;", "Lcom/yandex/go/lootbox/impl/data/entities/network/activation/LootBoxActivationResponseDto;", "b", "(Ljava/lang/String;Lcom/yandex/go/lootbox/impl/data/entities/network/activation/LootBoxActivationRequestDto;)Lcmt;", "url", "Lx6v;", "ignoring", "Lrvj0;", "a", "(Ljava/lang/String;Lx6v;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface LootBoxApi {
    @rru0
    @wqs
    cmt<rvj0> a(@qg21 String url, @m6x0 x6v ignoring);

    @s490("lootbox/v1/activate")
    @neu({"themeable: 2"})
    cmt<LootBoxActivationResponseDto> b(@z8u("X-Idempotency-Token") String idempotencyToken, @q76 LootBoxActivationRequestDto requestDto);
}
