package com.yandex.go.scooters.data.model;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.gsq0;
import defpackage.ief;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferResponse;", "", "Companion", "AlternativeOffer", "$serializer", "com/yandex/go/scooters/data/model/q", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersAlternativeOfferResponse {
    public static final q Companion = new q();
    public final AlternativeOffer a;

    public /* synthetic */ ScootersAlternativeOfferResponse(int i, AlternativeOffer alternativeOffer) {
        if ((i & 1) == 0) {
            this.a = new AlternativeOffer(0);
        } else {
            this.a = alternativeOffer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferResponse$AlternativeOffer;", "", "Companion", "Vehicle", "Prices", PlusPayUiKitInflaterFactory.NAME_BUTTON, "$serializer", "com/yandex/go/scooters/data/model/m", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AlternativeOffer {
        public static final m Companion = new m();
        public final Vehicle a;
        public final Prices b;
        public final ief c;
        public final String d;
        public final Button e;

        public /* synthetic */ AlternativeOffer(int i, Vehicle vehicle, Prices prices, ief iefVar, String str, Button button) {
            this.a = (i & 1) == 0 ? new Vehicle(0) : vehicle;
            if ((i & 2) == 0) {
                this.b = new Prices(0);
            } else {
                this.b = prices;
            }
            if ((i & 4) == 0) {
                this.c = ief.e;
            } else {
                this.c = iefVar;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str;
            }
            if ((i & 16) == 0) {
                this.e = new Button(0);
            } else {
                this.e = button;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferResponse$AlternativeOffer$Prices;", "", "Companion", "$serializer", "com/yandex/go/scooters/data/model/n", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Prices {
            public static final n Companion = new n();
            public final FormattedText a;

            public /* synthetic */ Prices(int i, FormattedText formattedText) {
                if ((i & 1) == 0) {
                    this.a = FormattedText.c;
                } else {
                    this.a = formattedText;
                }
            }

            public Prices() {
                this(0);
            }

            public Prices(int i) {
                this.a = FormattedText.c;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferResponse$AlternativeOffer$Vehicle;", "", "Companion", "VehicleStatus", "$serializer", "com/yandex/go/scooters/data/model/o", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Vehicle {
            public static final o Companion = new o();
            public final String a;
            public final String b;
            public final VehicleStatus c;

            public /* synthetic */ Vehicle(int i, String str, String str2, VehicleStatus vehicleStatus) {
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
                    this.c = new VehicleStatus(0);
                } else {
                    this.c = vehicleStatus;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferResponse$AlternativeOffer$Vehicle$VehicleStatus;", "", "Companion", "$serializer", "com/yandex/go/scooters/data/model/p", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class VehicleStatus {
                public static final p Companion = new p();
                public final int a;
                public final float b;
                public final long c;

                public /* synthetic */ VehicleStatus(int i, int i2, float f, long j) {
                    this.a = (i & 1) == 0 ? 0 : i2;
                    if ((i & 2) == 0) {
                        this.b = 0.0f;
                    } else {
                        this.b = f;
                    }
                    if ((i & 4) == 0) {
                        this.c = 0L;
                    } else {
                        this.c = j;
                    }
                }

                public VehicleStatus(int i) {
                    this.a = 0;
                    this.b = 0.0f;
                    this.c = 0L;
                }

                public VehicleStatus() {
                    this(0);
                }
            }

            public Vehicle() {
                this(0);
            }

            public Vehicle(int i) {
                VehicleStatus vehicleStatus = new VehicleStatus(0);
                this.a = "";
                this.b = "";
                this.c = vehicleStatus;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersAlternativeOfferResponse$AlternativeOffer$Button;", "", "Companion", "$serializer", "com/yandex/go/scooters/data/model/l", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Button {
            public static final l Companion = new l();
            public final FormattedText a;
            public final FormattedText b;
            public final String c;

            public /* synthetic */ Button(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = formattedText2;
                }
                if ((i & 4) == 0) {
                    this.c = "";
                } else {
                    this.c = str;
                }
            }

            public Button() {
                this(0);
            }

            public Button(int i) {
                this.a = FormattedText.c;
                this.b = null;
                this.c = "";
            }
        }

        public AlternativeOffer() {
            this(0);
        }

        public AlternativeOffer(int i) {
            Vehicle vehicle = new Vehicle(0);
            Prices prices = new Prices(0);
            Button button = new Button(0);
            this.a = vehicle;
            this.b = prices;
            this.c = ief.e;
            this.d = "";
            this.e = button;
        }
    }

    public ScootersAlternativeOfferResponse() {
        this.a = new AlternativeOffer(0);
    }
}
