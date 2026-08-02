package com.yandex.go.scooters.qr.data;

import com.yandex.go.scooters.qr.data.model.ScootersVehicleAvailabilityResponse;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.uau;
import defpackage.wqs;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JY\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/scooters/qr/data/ScootersScooterAvailabilityApi;", "", "", "", "headers", "number", DRMInfoProvider.MediaDRMKeys.VENDOR, "openReason", "", "isPreview", "Lcmt;", "Lcom/yandex/go/scooters/qr/data/model/ScootersVehicleAvailabilityResponse;", "a", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ScootersScooterAvailabilityApi {
    @wqs("scooters/v1/scooter-availability")
    cmt<ScootersVehicleAvailabilityResponse> a(@uau Map<String, String> headers, @djg0("number") String number, @djg0("vendor") String vendor, @djg0("open_reason") String openReason, @djg0("scooter_preview") int isPreview);
}
