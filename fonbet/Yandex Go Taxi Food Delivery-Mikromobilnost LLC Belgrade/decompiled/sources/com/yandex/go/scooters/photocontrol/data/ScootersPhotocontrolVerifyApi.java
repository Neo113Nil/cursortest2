package com.yandex.go.scooters.photocontrol.data;

import defpackage.cmt;
import defpackage.djg0;
import defpackage.m5j0;
import defpackage.neu;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JC\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/scooters/photocontrol/data/ScootersPhotocontrolVerifyApi;", "", "", "", "headers", "documentType", "Lm5j0;", "image", "Lcmt;", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "a", "(Ljava/util/Map;Ljava/lang/String;Lm5j0;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ScootersPhotocontrolVerifyApi {
    @s490("scooters/v1/photo-verification/verify")
    @neu({"Content-Type: image/jpeg"})
    cmt<zy11> a(@uau Map<String, String> headers, @djg0("document_type") String documentType, @q76 m5j0 image);
}
