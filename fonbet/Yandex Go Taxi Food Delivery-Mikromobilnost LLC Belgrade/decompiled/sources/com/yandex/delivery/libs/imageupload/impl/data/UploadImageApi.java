package com.yandex.delivery.libs.imageupload.impl.data;

import defpackage.an2;
import defpackage.m5j0;
import defpackage.pq90;
import defpackage.q76;
import defpackage.qg21;
import defpackage.s490;
import defpackage.t490;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryimagegenerateuploadlink.GenerateUploadLinkRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryimagegenerateuploadlink.Responses$GenerateUploadLinkResponseDto;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/yandex/delivery/libs/imageupload/impl/data/UploadImageApi;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryimagegenerateuploadlink/GenerateUploadLinkRequestDto;", "body", "Lcom/yandex/delivery/libs/imageupload/impl/data/UploadImageTypeDto;", "type", "Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryimagegenerateuploadlink/Responses$GenerateUploadLinkResponseDto;", "b", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryimagegenerateuploadlink/GenerateUploadLinkRequestDto;Lcom/yandex/delivery/libs/imageupload/impl/data/UploadImageTypeDto;)Lan2;", "", "url", "Lm5j0;", "image", "Lzy11;", "a", "(Ljava/lang/String;Lm5j0;)Lan2;", "imageupload"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface UploadImageApi {
    @t490
    an2<zy11> a(@qg21 String url, @q76 m5j0 image);

    @s490("/4.0/cargo-c2c/v1/delivery/{type}/generate-upload-link")
    an2<Responses$GenerateUploadLinkResponseDto> b(@q76 GenerateUploadLinkRequestDto body, @pq90("type") UploadImageTypeDto type);
}
