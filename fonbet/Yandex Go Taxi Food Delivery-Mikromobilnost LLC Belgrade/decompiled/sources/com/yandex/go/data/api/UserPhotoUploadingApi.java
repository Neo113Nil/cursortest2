package com.yandex.go.data.api;

import com.yandex.go.data.entities.network.UserPhotoStateResponse;
import com.yandex.go.data.entities.network.UserUploadPhotoResponse;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.ipf;
import defpackage.mg90;
import defpackage.s490;
import defpackage.wqs;
import defpackage.xw40;
import defpackage.zw40;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000e0\u0002j\u0002`\u000fH'¢\u0006\u0004\b\u0010\u0010\u0005¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/yandex/go/data/api/UserPhotoUploadingApi;", "", "Lcmt;", "Lcom/yandex/go/data/entities/network/UserPhotoStateResponse;", "b", "()Lcmt;", "Lzw40;", "image", "", "dontSaveRejected", "returnBduiStatus", "Lcom/yandex/go/data/entities/network/UserUploadPhotoResponse;", "a", "(Lzw40;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcmt;", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface UserPhotoUploadingApi {
    @s490("passenger-profile/v1/upload-photo")
    @xw40
    cmt<UserUploadPhotoResponse> a(@mg90 zw40 image, @djg0("dont_save_rejected") Boolean dontSaveRejected, @djg0("return_bdui_status") Boolean returnBduiStatus);

    @wqs("passenger-profile/v1/photo-card-info")
    cmt<UserPhotoStateResponse> b();

    @ipf("passenger-profile/v1/delete-photo")
    cmt<zy11> c();
}
