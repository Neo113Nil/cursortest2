package com.yandex.go.scooters.mosru.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.w96;
import defpackage.zqn0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/mosru/data/model/ScootersMosRuIntegrationExperiment;", "Lw96;", "Companion", "RemainingRidesTriggersDto", "ReauthorizationModalScreen", "com/yandex/go/scooters/mosru/data/model/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScootersMosRuIntegrationExperiment extends w96 {
    public static final a Companion = new a();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(4))};
    public static final ScootersMosRuIntegrationExperiment f = new ScootersMosRuIntegrationExperiment(0);
    public final boolean b;
    public final RemainingRidesTriggersDto c;
    public final jsq0 d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/mosru/data/model/ScootersMosRuIntegrationExperiment$ReauthorizationModalScreen;", "", "Companion", "com/yandex/go/scooters/mosru/data/model/b", "ON_DISCOVERY", "ON_OFFER", "ON_FINISH", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ReauthorizationModalScreen {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ReauthorizationModalScreen[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final ReauthorizationModalScreen ON_DISCOVERY;
        public static final ReauthorizationModalScreen ON_FINISH;
        public static final ReauthorizationModalScreen ON_OFFER;

        static {
            ReauthorizationModalScreen reauthorizationModalScreen = new ReauthorizationModalScreen("ON_DISCOVERY", 0);
            ON_DISCOVERY = reauthorizationModalScreen;
            ReauthorizationModalScreen reauthorizationModalScreen2 = new ReauthorizationModalScreen("ON_OFFER", 1);
            ON_OFFER = reauthorizationModalScreen2;
            ReauthorizationModalScreen reauthorizationModalScreen3 = new ReauthorizationModalScreen("ON_FINISH", 2);
            ON_FINISH = reauthorizationModalScreen3;
            ReauthorizationModalScreen[] reauthorizationModalScreenArr = {reauthorizationModalScreen, reauthorizationModalScreen2, reauthorizationModalScreen3};
            $VALUES = reauthorizationModalScreenArr;
            $ENTRIES = kotlin.enums.a.a(reauthorizationModalScreenArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(5));
        }

        public static ReauthorizationModalScreen valueOf(String str) {
            return (ReauthorizationModalScreen) Enum.valueOf(ReauthorizationModalScreen.class, str);
        }

        public static ReauthorizationModalScreen[] values() {
            return (ReauthorizationModalScreen[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ScootersMosRuIntegrationExperiment(int i, boolean z, RemainingRidesTriggersDto remainingRidesTriggersDto, jsq0 jsq0Var) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = remainingRidesTriggersDto;
        }
        if ((i & 4) == 0) {
            this.d = ksq0.a;
        } else {
            this.d = jsq0Var;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/mosru/data/model/ScootersMosRuIntegrationExperiment$RemainingRidesTriggersDto;", "", "Companion", "ShowModal", "$serializer", "com/yandex/go/scooters/mosru/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class RemainingRidesTriggersDto {
        public static final c Companion = new c();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(6))};
        public final ShowModal a;
        public final List b;

        public /* synthetic */ RemainingRidesTriggersDto(int i, ShowModal showModal, List list) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = showModal;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = list;
            }
        }

        public RemainingRidesTriggersDto() {
            this.a = null;
            this.b = null;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/mosru/data/model/ScootersMosRuIntegrationExperiment$RemainingRidesTriggersDto$ShowModal;", "", "Companion", "$serializer", "com/yandex/go/scooters/mosru/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ShowModal {
            public static final d Companion = new d();
            public static final i3y[] d;
            public final List a;
            public final List b;
            public final List c;

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new zqn0(7)), kotlin.a.b(lazyThreadSafetyMode, new zqn0(8)), kotlin.a.b(lazyThreadSafetyMode, new zqn0(9))};
            }

            public /* synthetic */ ShowModal(int i, List list, List list2, List list3) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = list;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = list2;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = list3;
                }
            }

            public ShowModal() {
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public ScootersMosRuIntegrationExperiment() {
        this(0);
    }

    public ScootersMosRuIntegrationExperiment(int i) {
        jsq0 jsq0Var = ksq0.a;
        this.b = false;
        this.c = null;
        this.d = jsq0Var;
    }
}
