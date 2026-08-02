package com.yandex.go.superapp.unified_polling.data.api;

import com.yandex.go.superapp.unified_polling.data.dto.SuperAppOrdersBodyDto;
import com.yandex.go.superapp.unified_polling.data.dto.SuperAppOrdersResponseDto;
import defpackage.cmt;
import defpackage.q76;
import defpackage.qg21;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J=\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/superapp/unified_polling/data/api/SuperAppTrackingApi;", "", "", "url", "timeZoneOffsetHeader", "timeZoneHeader", "Lcom/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersBodyDto;", "param", "Lcmt;", "Lcom/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersResponseDto;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersBodyDto;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface SuperAppTrackingApi {
    @s490
    cmt<SuperAppOrdersResponseDto> a(@qg21 String url, @z8u("Timezone-Offset") String timeZoneOffsetHeader, @z8u("Timezone") String timeZoneHeader, @q76 SuperAppOrdersBodyDto param);
}
