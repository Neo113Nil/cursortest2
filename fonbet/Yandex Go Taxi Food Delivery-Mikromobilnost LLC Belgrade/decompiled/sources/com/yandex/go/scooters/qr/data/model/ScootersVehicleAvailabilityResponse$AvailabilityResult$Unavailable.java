package com.yandex.go.scooters.qr.data.model;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/scooters/qr/data/model/ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable", "Lcom/yandex/go/scooters/qr/data/model/g;", "Companion", "NearestScooter", "Content", "$serializer", "com/yandex/go/scooters/qr/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable extends g {
    public static final c Companion = new c();
    public final String a;
    public final NearestScooter b;
    public final Content c;

    public ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable(int i, String str, NearestScooter nearestScooter, Content content) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = nearestScooter;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = content;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/qr/data/model/ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable$Content;", "", "Companion", "$serializer", "com/yandex/go/scooters/qr/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Content {
        public static final d Companion = new d();
        public final FormattedText a;
        public final FormattedText b;

        public /* synthetic */ Content(int i, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return jl40.l(this.a, content.a) && jl40.l(this.b, content.b);
        }

        public final int hashCode() {
            return this.b.a.hashCode() + (this.a.a.hashCode() * 31);
        }

        public final String toString() {
            return "Content(title=" + this.a + ", description=" + this.b + Extension.C_BRAKE;
        }

        public Content() {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
        }
    }

    public ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/qr/data/model/ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable$NearestScooter;", "", "Companion", "$serializer", "com/yandex/go/scooters/qr/data/model/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class NearestScooter {
        public static final e Companion = new e();
        public final String a;
        public final String b;
        public final String c;
        public final int d;

        public /* synthetic */ NearestScooter(int i, int i2, String str, String str2, String str3) {
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
                this.d = 0;
            } else {
                this.d = i2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearestScooter)) {
                return false;
            }
            NearestScooter nearestScooter = (NearestScooter) obj;
            return jl40.l(this.a, nearestScooter.a) && jl40.l(this.b, nearestScooter.b) && jl40.l(this.c, nearestScooter.c) && this.d == nearestScooter.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder v = b64.v("NearestScooter(icon=", this.a, ", number=", this.b, ", vendor=");
            v.append(this.c);
            v.append(", distanceTo=");
            v.append(this.d);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public NearestScooter() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = 0;
        }
    }
}
