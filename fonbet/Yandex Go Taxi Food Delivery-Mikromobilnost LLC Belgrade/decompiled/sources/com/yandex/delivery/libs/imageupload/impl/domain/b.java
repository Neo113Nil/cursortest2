package com.yandex.delivery.libs.imageupload.impl.domain;

import com.yandex.delivery.libs.imageupload.api.UploadImageType;
import defpackage.rol0;
import java.io.InputStream;

/* loaded from: classes11.dex */
public final class b {
    public final com.yandex.delivery.libs.imageupload.impl.data.a a;

    public b(com.yandex.delivery.libs.imageupload.impl.data.a aVar) {
        this.a = aVar;
    }

    public final rol0 a(InputStream inputStream, UploadImageType uploadImageType) {
        return new rol0(new UploadImageTaskImpl$invokeWithProgress$1(this, uploadImageType, "image/jpeg", inputStream, null));
    }
}
