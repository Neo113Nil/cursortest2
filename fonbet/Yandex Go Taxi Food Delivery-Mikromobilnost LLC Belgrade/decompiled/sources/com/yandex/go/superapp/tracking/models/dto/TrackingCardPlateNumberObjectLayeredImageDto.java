package com.yandex.go.superapp.tracking.models.dto;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardPlateNumberObjectLayeredImageDto;", "", "Companion", "Layers", "$serializer", "com/yandex/go/superapp/tracking/models/dto/l", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrackingCardPlateNumberObjectLayeredImageDto {
    public static final l Companion = new l();
    public final String a;
    public final Layers b;

    public /* synthetic */ TrackingCardPlateNumberObjectLayeredImageDto(int i, String str, Layers layers) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = layers;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final Layers getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingCardPlateNumberObjectLayeredImageDto)) {
            return false;
        }
        TrackingCardPlateNumberObjectLayeredImageDto trackingCardPlateNumberObjectLayeredImageDto = (TrackingCardPlateNumberObjectLayeredImageDto) obj;
        return jl40.l(this.a, trackingCardPlateNumberObjectLayeredImageDto.a) && jl40.l(this.b, trackingCardPlateNumberObjectLayeredImageDto.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Layers layers = this.b;
        return hashCode + (layers != null ? layers.hashCode() : 0);
    }

    public final String toString() {
        return "TrackingCardPlateNumberObjectLayeredImageDto(color=" + this.a + ", layers=" + this.b + Extension.C_BRAKE;
    }

    public TrackingCardPlateNumberObjectLayeredImageDto() {
        this.a = null;
        this.b = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardPlateNumberObjectLayeredImageDto$Layers;", "", "Companion", "$serializer", "com/yandex/go/superapp/tracking/models/dto/m", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Layers {
        public static final m Companion = new m();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;

        public /* synthetic */ Layers(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str5;
            }
            if ((i & 32) == 0) {
                this.f = "";
            } else {
                this.f = str6;
            }
            if ((i & 64) == 0) {
                this.g = "";
            } else {
                this.g = str7;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getG() {
            return this.g;
        }

        /* renamed from: b, reason: from getter */
        public final String getF() {
            return this.f;
        }

        /* renamed from: c, reason: from getter */
        public final String getE() {
            return this.e;
        }

        /* renamed from: d, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: e, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Layers)) {
                return false;
            }
            Layers layers = (Layers) obj;
            return jl40.l(this.a, layers.a) && jl40.l(this.b, layers.b) && jl40.l(this.c, layers.c) && jl40.l(this.d, layers.d) && jl40.l(this.e, layers.e) && jl40.l(this.f, layers.f) && jl40.l(this.g, layers.g);
        }

        /* renamed from: f, reason: from getter */
        public final String getD() {
            return this.d;
        }

        /* renamed from: g, reason: from getter */
        public final String getC() {
            return this.c;
        }

        public final int hashCode() {
            return this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder v = b64.v("Layers(mask=", this.a, ", shadow=", this.b, ", warmLight=");
            g8e.D(v, this.c, ", softLight=", this.d, ", hardLight=");
            g8e.D(v, this.e, ", glossy=", this.f, ", details=");
            return oyr.t(v, this.g, Extension.C_BRAKE);
        }

        public Layers() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
            this.f = "";
            this.g = "";
        }
    }
}
