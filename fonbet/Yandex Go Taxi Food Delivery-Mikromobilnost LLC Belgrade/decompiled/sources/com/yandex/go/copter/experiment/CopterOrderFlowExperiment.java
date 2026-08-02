package com.yandex.go.copter.experiment;

import defpackage.b64;
import defpackage.c6z;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.m3e;
import defpackage.n;
import defpackage.n96;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/copter/experiment/CopterOrderFlowExperiment;", "Ln96;", "Lc6z;", "Companion", "RoutePointSettings", "CityTourSettings", "com/yandex/go/copter/experiment/e", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CopterOrderFlowExperiment extends n96 implements c6z {
    public static final e Companion = new e();
    public static final i3y[] h;
    public static final CopterOrderFlowExperiment i;
    public final boolean b;
    public final Map c;
    public final String d;
    public final List e;
    public final CityTourSettings f;
    public final Integer g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new m3e(20)), null, kotlin.a.b(lazyThreadSafetyMode, new m3e(21)), null, null};
        i = new CopterOrderFlowExperiment(0);
    }

    public /* synthetic */ CopterOrderFlowExperiment(int i2, boolean z, Map map, String str, List list, CityTourSettings cityTourSettings, Integer num) {
        this.b = (i2 & 1) == 0 ? false : z;
        if ((i2 & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i2 & 8) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
        if ((i2 & 16) == 0) {
            this.f = null;
        } else {
            this.f = cityTourSettings;
        }
        if ((i2 & 32) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopterOrderFlowExperiment)) {
            return false;
        }
        CopterOrderFlowExperiment copterOrderFlowExperiment = (CopterOrderFlowExperiment) obj;
        return this.b == copterOrderFlowExperiment.b && jl40.l(this.c, copterOrderFlowExperiment.c) && jl40.l(this.d, copterOrderFlowExperiment.d) && jl40.l(this.e, copterOrderFlowExperiment.e) && jl40.l(this.f, copterOrderFlowExperiment.f) && jl40.l(this.g, copterOrderFlowExperiment.g);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.b(unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
        CityTourSettings cityTourSettings = this.f;
        int hashCode = (c + (cityTourSettings == null ? 0 : cityTourSettings.hashCode())) * 31;
        Integer num = this.g;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = nnm.l("CopterOrderFlowExperiment(enabled=", ", l10n=", ", mode=", this.c, this.b);
        tse0.x(this.d, ", routePointsSettings=", ", cityTourSettings=", l, this.e);
        l.append(this.f);
        l.append(", zoomOffsetInMeters=");
        l.append(this.g);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/copter/experiment/CopterOrderFlowExperiment$RoutePointSettings;", "", "Companion", "PointSelection", "RoutePoint", "ReturnButton", "$serializer", "com/yandex/go/copter/experiment/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class RoutePointSettings {
        public static final f Companion = new f();
        public final String a;
        public final PointSelection b;
        public final PointSelection c;
        public final RoutePoint d;
        public final ReturnButton e;
        public final String f;

        public /* synthetic */ RoutePointSettings(int i, String str, PointSelection pointSelection, PointSelection pointSelection2, RoutePoint routePoint, ReturnButton returnButton, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = pointSelection;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = pointSelection2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = routePoint;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = returnButton;
            }
            if ((i & 32) == 0) {
                this.f = "";
            } else {
                this.f = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoutePointSettings)) {
                return false;
            }
            RoutePointSettings routePointSettings = (RoutePointSettings) obj;
            return jl40.l(this.a, routePointSettings.a) && jl40.l(this.b, routePointSettings.b) && jl40.l(this.c, routePointSettings.c) && jl40.l(this.d, routePointSettings.d) && jl40.l(this.e, routePointSettings.e) && jl40.l(this.f, routePointSettings.f);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            PointSelection pointSelection = this.b;
            int hashCode2 = (hashCode + (pointSelection == null ? 0 : pointSelection.hashCode())) * 31;
            PointSelection pointSelection2 = this.c;
            int hashCode3 = (hashCode2 + (pointSelection2 == null ? 0 : pointSelection2.hashCode())) * 31;
            RoutePoint routePoint = this.d;
            int hashCode4 = (hashCode3 + (routePoint == null ? 0 : routePoint.hashCode())) * 31;
            ReturnButton returnButton = this.e;
            return this.f.hashCode() + ((hashCode4 + (returnButton != null ? returnButton.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "RoutePointSettings(tariff=" + this.a + ", sourceSelection=" + this.b + ", destinationSelection=" + this.c + ", routePoint=" + this.d + ", returnButton=" + this.e + ", orderButtonText=" + this.f + Extension.C_BRAKE;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/copter/experiment/CopterOrderFlowExperiment$RoutePointSettings$ReturnButton;", "", "Companion", "$serializer", "com/yandex/go/copter/experiment/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class ReturnButton {
            public static final h Companion = new h();
            public final String a;
            public final String b;

            public /* synthetic */ ReturnButton(int i, String str, String str2) {
                this.a = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = str2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ReturnButton)) {
                    return false;
                }
                ReturnButton returnButton = (ReturnButton) obj;
                return jl40.l(this.a, returnButton.a) && jl40.l(this.b, returnButton.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return unr0.p("ReturnButton(text=", this.a, ", action=", this.b, Extension.C_BRAKE);
            }

            public ReturnButton() {
                this.a = "";
                this.b = null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/copter/experiment/CopterOrderFlowExperiment$RoutePointSettings$RoutePoint;", "", "Companion", "Pin", "$serializer", "com/yandex/go/copter/experiment/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class RoutePoint {
            public static final i Companion = new i();
            public final Pin a;
            public final Pin b;

            public /* synthetic */ RoutePoint(int i, Pin pin, Pin pin2) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = pin;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = pin2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RoutePoint)) {
                    return false;
                }
                RoutePoint routePoint = (RoutePoint) obj;
                return jl40.l(this.a, routePoint.a) && jl40.l(this.b, routePoint.b);
            }

            public final int hashCode() {
                Pin pin = this.a;
                int hashCode = (pin == null ? 0 : pin.hashCode()) * 31;
                Pin pin2 = this.b;
                return hashCode + (pin2 != null ? pin2.hashCode() : 0);
            }

            public final String toString() {
                return "RoutePoint(pin=" + this.a + ", pinStop=" + this.b + Extension.C_BRAKE;
            }

            public RoutePoint() {
                this.a = null;
                this.b = null;
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/copter/experiment/CopterOrderFlowExperiment$RoutePointSettings$RoutePoint$Pin;", "", "Companion", "$serializer", "com/yandex/go/copter/experiment/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final /* data */ class Pin {
                public static final j Companion = new j();
                public final String a;
                public final String b;
                public final String c;

                public /* synthetic */ Pin(int i, String str, String str2, String str3) {
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
                        this.c = null;
                    } else {
                        this.c = str3;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Pin)) {
                        return false;
                    }
                    Pin pin = (Pin) obj;
                    return jl40.l(this.a, pin.a) && jl40.l(this.b, pin.b) && jl40.l(this.c, pin.c);
                }

                public final int hashCode() {
                    int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
                    String str = this.c;
                    return b + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    return oyr.t(b64.v("Pin(title=", this.a, ", hint=", this.b, ", iconTag="), this.c, Extension.C_BRAKE);
                }

                public Pin() {
                    this.a = "";
                    this.b = "";
                    this.c = null;
                }
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/copter/experiment/CopterOrderFlowExperiment$RoutePointSettings$PointSelection;", "", "Companion", "$serializer", "com/yandex/go/copter/experiment/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class PointSelection {
            public static final g Companion = new g();
            public final String a;
            public final String b;

            public /* synthetic */ PointSelection(int i, String str, String str2) {
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
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PointSelection)) {
                    return false;
                }
                PointSelection pointSelection = (PointSelection) obj;
                return jl40.l(this.a, pointSelection.a) && jl40.l(this.b, pointSelection.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return unr0.p("PointSelection(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
            }

            public PointSelection() {
                this.a = "";
                this.b = "";
            }
        }

        public RoutePointSettings() {
            this.a = "";
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/copter/experiment/CopterOrderFlowExperiment$CityTourSettings;", "", "Companion", "Modal", "$serializer", "com/yandex/go/copter/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class CityTourSettings {
        public static final b Companion = new b();
        public final String a;
        public final String b;
        public final String c;
        public final Modal d;

        public /* synthetic */ CityTourSettings(int i, String str, String str2, String str3, Modal modal) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = modal;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CityTourSettings)) {
                return false;
            }
            CityTourSettings cityTourSettings = (CityTourSettings) obj;
            return jl40.l(this.a, cityTourSettings.a) && jl40.l(this.b, cityTourSettings.b) && jl40.l(this.c, cityTourSettings.c) && jl40.l(this.d, cityTourSettings.d);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Modal modal = this.d;
            return hashCode3 + (modal != null ? modal.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("CityTourSettings(tariff=", this.a, ", requirement=", this.b, ", defaultRouteDescription=");
            v.append(this.c);
            v.append(", modal=");
            v.append(this.d);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/copter/experiment/CopterOrderFlowExperiment$CityTourSettings$Modal;", "", "Companion", "ReloadButton", "$serializer", "com/yandex/go/copter/experiment/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Modal {
            public static final c Companion = new c();
            public final FormattedText a;
            public final FormattedText b;
            public final ReloadButton c;

            public /* synthetic */ Modal(int i, FormattedText formattedText, FormattedText formattedText2, ReloadButton reloadButton) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = formattedText;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = formattedText2;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = reloadButton;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Modal)) {
                    return false;
                }
                Modal modal = (Modal) obj;
                return jl40.l(this.a, modal.a) && jl40.l(this.b, modal.b) && jl40.l(this.c, modal.c);
            }

            public final int hashCode() {
                FormattedText formattedText = this.a;
                int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
                FormattedText formattedText2 = this.b;
                int hashCode2 = (hashCode + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
                ReloadButton reloadButton = this.c;
                return hashCode2 + (reloadButton != null ? reloadButton.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder r = n.r("Modal(title=", this.a, ", subtitle=", this.b, ", reloadButton=");
                r.append(this.c);
                r.append(Extension.C_BRAKE);
                return r.toString();
            }

            public Modal() {
                this.a = null;
                this.b = null;
                this.c = null;
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/copter/experiment/CopterOrderFlowExperiment$CityTourSettings$Modal$ReloadButton;", "", "Companion", "$serializer", "com/yandex/go/copter/experiment/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final /* data */ class ReloadButton {
                public static final d Companion = new d();
                public final String a;
                public final String b;
                public final String c;
                public final String d;

                public /* synthetic */ ReloadButton(int i, String str, String str2, String str3, String str4) {
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
                        this.c = null;
                    } else {
                        this.c = str3;
                    }
                    if ((i & 8) == 0) {
                        this.d = null;
                    } else {
                        this.d = str4;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ReloadButton)) {
                        return false;
                    }
                    ReloadButton reloadButton = (ReloadButton) obj;
                    return jl40.l(this.a, reloadButton.a) && jl40.l(this.b, reloadButton.b) && jl40.l(this.c, reloadButton.c) && jl40.l(this.d, reloadButton.d);
                }

                public final int hashCode() {
                    int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
                    String str = this.c;
                    int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.d;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    return g8e.r(b64.v("ReloadButton(errorMessage=", this.a, ", text=", this.b, ", textColor="), this.c, ", buttonColor=", this.d, Extension.C_BRAKE);
                }

                public ReloadButton() {
                    this.a = "";
                    this.b = "";
                    this.c = null;
                    this.d = null;
                }
            }
        }

        public CityTourSettings() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    public CopterOrderFlowExperiment() {
        this(0);
    }

    public CopterOrderFlowExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = EmptyList.a;
        this.f = null;
        this.g = null;
    }
}
