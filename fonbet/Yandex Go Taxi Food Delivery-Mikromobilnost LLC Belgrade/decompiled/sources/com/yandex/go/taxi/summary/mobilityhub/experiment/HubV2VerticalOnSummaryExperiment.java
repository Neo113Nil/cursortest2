package com.yandex.go.taxi.summary.mobilityhub.experiment;

import defpackage.c6z;
import defpackage.gmt;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/experiment/HubV2VerticalOnSummaryExperiment;", "Ln96;", "Lc6z;", "Companion", "ScootersBattery", "com/yandex/go/taxi/summary/mobilityhub/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HubV2VerticalOnSummaryExperiment extends n96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gmt(29)), null, null};
    public static final HubV2VerticalOnSummaryExperiment g = new HubV2VerticalOnSummaryExperiment(0);
    public final boolean b;
    public final Map c;
    public final VerticalMode d;
    public final ScootersBattery e;

    public /* synthetic */ HubV2VerticalOnSummaryExperiment(int i, boolean z, Map map, VerticalMode verticalMode, ScootersBattery scootersBattery) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = verticalMode;
        }
        if ((i & 8) == 0) {
            this.e = new ScootersBattery(0);
        } else {
            this.e = scootersBattery;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getD() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/experiment/HubV2VerticalOnSummaryExperiment$ScootersBattery;", "", "Companion", "BatteryChargePercents", "ChargeConfig", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/experiment/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ScootersBattery {
        public static final e Companion = new e();
        public final BatteryChargePercents a;
        public final ChargeConfig b;

        public /* synthetic */ ScootersBattery(int i, BatteryChargePercents batteryChargePercents, ChargeConfig chargeConfig) {
            this.a = (i & 1) == 0 ? new BatteryChargePercents(0) : batteryChargePercents;
            if ((i & 2) == 0) {
                this.b = new ChargeConfig(0);
            } else {
                this.b = chargeConfig;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/experiment/HubV2VerticalOnSummaryExperiment$ScootersBattery$ChargeConfig;", "", "Companion", "Battery", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/experiment/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ChargeConfig {
            public static final d Companion = new d();
            public final Battery a;

            public /* synthetic */ ChargeConfig(int i, Battery battery) {
                if ((i & 1) == 0) {
                    this.a = new Battery(0);
                } else {
                    this.a = battery;
                }
            }

            public ChargeConfig() {
                this(0);
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/experiment/HubV2VerticalOnSummaryExperiment$ScootersBattery$ChargeConfig$Battery;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/experiment/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class Battery {
                public static final c Companion = new c();
                public final boolean a;
                public final boolean b;

                public /* synthetic */ Battery(int i, boolean z, boolean z2) {
                    this.a = (i & 1) == 0 ? true : z;
                    if ((i & 2) == 0) {
                        this.b = false;
                    } else {
                        this.b = z2;
                    }
                }

                public Battery(int i) {
                    this.a = true;
                    this.b = false;
                }

                public Battery() {
                    this(0);
                }
            }

            public ChargeConfig(int i) {
                this.a = new Battery(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/experiment/HubV2VerticalOnSummaryExperiment$ScootersBattery$BatteryChargePercents;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class BatteryChargePercents {
            public static final b Companion = new b();
            public final int a;
            public final int b;

            public /* synthetic */ BatteryChargePercents(int i, int i2, int i3) {
                this.a = (i & 1) == 0 ? 5 : i2;
                if ((i & 2) == 0) {
                    this.b = 30;
                } else {
                    this.b = i3;
                }
            }

            public BatteryChargePercents(int i) {
                this.a = 5;
                this.b = 30;
            }

            public BatteryChargePercents() {
                this(0);
            }
        }

        public ScootersBattery() {
            this(0);
        }

        public ScootersBattery(int i) {
            BatteryChargePercents batteryChargePercents = new BatteryChargePercents(0);
            ChargeConfig chargeConfig = new ChargeConfig(0);
            this.a = batteryChargePercents;
            this.b = chargeConfig;
        }
    }

    public HubV2VerticalOnSummaryExperiment() {
        this(0);
    }

    public HubV2VerticalOnSummaryExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        ScootersBattery scootersBattery = new ScootersBattery(0);
        this.b = false;
        this.c = f2;
        this.d = null;
        this.e = scootersBattery;
    }
}
