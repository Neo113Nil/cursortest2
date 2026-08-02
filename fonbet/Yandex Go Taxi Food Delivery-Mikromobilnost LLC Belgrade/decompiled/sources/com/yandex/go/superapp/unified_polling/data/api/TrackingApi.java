package com.yandex.go.superapp.unified_polling.data.api;

import com.yandex.go.superapp.unified_polling.data.dto.EatsOrdersParamDto;
import com.yandex.go.superapp.unified_polling.data.dto.EatsOrdersResponseDto;
import defpackage.q76;
import defpackage.qg21;
import defpackage.s490;
import defpackage.uau;
import java.util.Map;
import kotlin.Metadata;
import retrofit2.Call;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J?\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/superapp/unified_polling/data/api/TrackingApi;", "", "", "url", "", "headers", "Lcom/yandex/go/superapp/unified_polling/data/dto/EatsOrdersParamDto;", "param", "Lretrofit2/Call;", "Lcom/yandex/go/superapp/unified_polling/data/dto/EatsOrdersResponseDto;", "a", "(Ljava/lang/String;Ljava/util/Map;Lcom/yandex/go/superapp/unified_polling/data/dto/EatsOrdersParamDto;)Lretrofit2/Call;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface TrackingApi {
    @s490
    Call<EatsOrdersResponseDto> a(@qg21 String url, @uau Map<String, String> headers, @q76 EatsOrdersParamDto param);
}
