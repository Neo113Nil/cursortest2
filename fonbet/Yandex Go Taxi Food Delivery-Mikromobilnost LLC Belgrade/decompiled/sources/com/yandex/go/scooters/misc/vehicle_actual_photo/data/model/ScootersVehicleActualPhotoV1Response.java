package com.yandex.go.scooters.misc.vehicle_actual_photo.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/misc/vehicle_actual_photo/data/model/ScootersVehicleActualPhotoV1Response;", "", "Companion", "PhotoFromLastOrder", "$serializer", "com/yandex/go/scooters/misc/vehicle_actual_photo/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersVehicleActualPhotoV1Response {
    public static final b Companion = new b();
    public final PhotoFromLastOrder a;

    public /* synthetic */ ScootersVehicleActualPhotoV1Response(int i, PhotoFromLastOrder photoFromLastOrder) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = photoFromLastOrder;
        }
    }

    public ScootersVehicleActualPhotoV1Response() {
        this.a = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/misc/vehicle_actual_photo/data/model/ScootersVehicleActualPhotoV1Response$PhotoFromLastOrder;", "", "Companion", "$serializer", "com/yandex/go/scooters/misc/vehicle_actual_photo/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PhotoFromLastOrder {
        public static final c Companion = new c();
        public final String a;
        public final FormattedText b;
        public final FormattedText c;
        public final FormattedText d;
        public final String e;

        public /* synthetic */ PhotoFromLastOrder(int i, String str, String str2, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = formattedText3;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str2;
            }
        }

        public PhotoFromLastOrder() {
            FormattedText formattedText = FormattedText.c;
            this.a = "";
            this.b = formattedText;
            this.c = formattedText;
            this.d = null;
            this.e = "";
        }
    }
}
