package com.yandex.go.pickup_from_photo.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.z4b0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickup_from_photo/data/model/PickupFromPhotoGetResultResponse;", "", "Companion", "$serializer", "com/yandex/go/pickup_from_photo/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PickupFromPhotoGetResultResponse {
    public static final b Companion = new b();
    public static final i3y[] c;
    public final PhotoRecognitionStatus a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new z4b0(17)), kotlin.a.b(lazyThreadSafetyMode, new z4b0(18))};
    }

    public /* synthetic */ PickupFromPhotoGetResultResponse(int i, PhotoRecognitionStatus photoRecognitionStatus, List list) {
        this.a = (i & 1) == 0 ? PhotoRecognitionStatus.UNKNOWN : photoRecognitionStatus;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public PickupFromPhotoGetResultResponse() {
        this.a = PhotoRecognitionStatus.UNKNOWN;
        this.b = null;
    }
}
