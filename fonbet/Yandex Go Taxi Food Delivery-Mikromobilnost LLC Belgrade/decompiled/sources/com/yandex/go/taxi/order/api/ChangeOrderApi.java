package com.yandex.go.taxi.order.api;

import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.cmt;
import defpackage.ef9;
import defpackage.j99;
import defpackage.k1t;
import defpackage.loq0;
import defpackage.n851;
import defpackage.ooq0;
import defpackage.q76;
import defpackage.s490;
import defpackage.u99;
import defpackage.ua9;
import defpackage.x99;
import defpackage.zd9;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000eH'¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001bH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001eH'¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020!H'¢\u0006\u0004\b\"\u0010#¨\u0006$À\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/order/api/ChangeOrderApi;", "", "Lzd9;", "p", "Lcmt;", "Lcom/yandex/go/taxi/order/models/api/response/OrderChangesDto$PendingChangeDto;", "b", "(Lzd9;)Lcmt;", "Lef9;", "f", "(Lef9;)Lcmt;", "Lu99;", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "(Lu99;)Lcmt;", "Lua9;", "c", "(Lua9;)Lcmt;", "Lx99;", "e", "(Lx99;)Lcmt;", "Lj99;", CoreConstants.PushMessage.SERVICE_TYPE, "(Lj99;)Lcmt;", "Lcom/yandex/go/taxi/order/models/api/response/OrderChangesDto;", "orderChangesDto", "a", "(Lcom/yandex/go/taxi/order/models/api/response/OrderChangesDto;)Lcmt;", "Lloq0;", "d", "(Lloq0;)Lcmt;", "Looq0;", "h", "(Looq0;)Lcmt;", "Lk1t;", "g", "(Lk1t;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ChangeOrderApi {
    @n851
    @s490("changes")
    cmt<OrderChangesDto> a(@q76 OrderChangesDto orderChangesDto);

    @n851
    @s490("changepayment")
    cmt<OrderChangesDto.PendingChangeDto> b(@q76 zd9 p);

    @s490("changedestinations")
    cmt<OrderChangesDto.PendingChangeDto> c(@q76 ua9 p);

    @s490("setdontcall")
    cmt<OrderChangesDto.PendingChangeDto> d(@q76 loq0 p);

    @s490("changecorpcostcenter")
    cmt<OrderChangesDto.PendingChangeDto> e(@q76 x99 p);

    @s490("changeporchnumber")
    cmt<OrderChangesDto.PendingChangeDto> f(@q76 ef9 p);

    @s490("changeclientgeosharing")
    cmt<OrderChangesDto.PendingChangeDto> g(@q76 k1t p);

    @s490("setdontsms")
    cmt<OrderChangesDto.PendingChangeDto> h(@q76 ooq0 p);

    @s490("changeaction")
    cmt<OrderChangesDto.PendingChangeDto> i(@q76 j99 p);

    @s490("changecomment")
    cmt<OrderChangesDto.PendingChangeDto> j(@q76 u99 p);
}
