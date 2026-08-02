package com.yandex.go.pickup_from_photo.data.api;

import com.yandex.go.pickup_from_photo.data.model.PickupFromPhotoGetResultResponse;
import com.yandex.go.pickup_from_photo.data.model.PickupFromPhotoUploadResponse;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.mg90;
import defpackage.s490;
import defpackage.wqs;
import defpackage.xw40;
import defpackage.zw40;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/pickup_from_photo/data/api/PickupPhotoRecognitionApi;", "", "", "Lzw40;", "files", "Lcmt;", "Lcom/yandex/go/pickup_from_photo/data/model/PickupFromPhotoUploadResponse;", "b", "(Ljava/util/List;)Lcmt;", "", "taskId", "Lcom/yandex/go/pickup_from_photo/data/model/PickupFromPhotoGetResultResponse;", "a", "(Ljava/lang/String;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PickupPhotoRecognitionApi {
    @wqs("pickup-photo-processor/pickup-point/get-result")
    cmt<PickupFromPhotoGetResultResponse> a(@djg0("task_id") String taskId);

    @s490("pickup-photo-processor/pickup-point/upload")
    @xw40
    cmt<PickupFromPhotoUploadResponse> b(@mg90 List<zw40> files);
}
