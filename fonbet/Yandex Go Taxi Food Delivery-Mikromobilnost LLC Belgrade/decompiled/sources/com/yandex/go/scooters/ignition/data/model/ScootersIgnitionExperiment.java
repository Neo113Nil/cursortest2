package com.yandex.go.scooters.ignition.data.model;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jrl0;
import defpackage.k4o;
import defpackage.w96;
import defpackage.zqn0;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment;", "Lw96;", "Lc6z;", "Companion", "RestartStrategy", "Ui", "TechnicalLoggingLevel", "com/yandex/go/scooters/ignition/data/model/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScootersIgnitionExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] s;
    public static final ScootersIgnitionExperiment t;
    public final boolean b;
    public final Map c;
    public final List d;
    public final int e;
    public final long f;
    public final long g;
    public final long h;
    public final RestartStrategy i;
    public final long j;
    public final long k;
    public final int l;
    public final boolean m;
    public final TechnicalLoggingLevel n;
    public final String o;
    public final String p;
    public final String q;
    public final Ui r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$RestartStrategy;", "", "Companion", "com/yandex/go/scooters/ignition/data/model/b", "APP_CREATE", "ACTIVITY_CREATE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class RestartStrategy {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ RestartStrategy[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final RestartStrategy ACTIVITY_CREATE;
        public static final RestartStrategy APP_CREATE;
        public static final b Companion;

        static {
            RestartStrategy restartStrategy = new RestartStrategy("APP_CREATE", 0);
            APP_CREATE = restartStrategy;
            RestartStrategy restartStrategy2 = new RestartStrategy("ACTIVITY_CREATE", 1);
            ACTIVITY_CREATE = restartStrategy2;
            RestartStrategy[] restartStrategyArr = {restartStrategy, restartStrategy2};
            $VALUES = restartStrategyArr;
            $ENTRIES = kotlin.enums.a.a(restartStrategyArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(22));
        }

        public static RestartStrategy valueOf(String str) {
            return (RestartStrategy) Enum.valueOf(RestartStrategy.class, str);
        }

        public static RestartStrategy[] values() {
            return (RestartStrategy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$TechnicalLoggingLevel;", "", "Companion", "com/yandex/go/scooters/ignition/data/model/c", "FULL", "FULL_WITHOUT_EMPTY_SCAN", "FULL_WITHOUT_SCAN", "FULL_WITHOUT_EMPTY_SCAN_REQUEST_RESPONSE", "FULL_WITHOUT_SCAN_REQUEST_RESPONSE", "NOTHING", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TechnicalLoggingLevel {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TechnicalLoggingLevel[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c Companion;
        public static final TechnicalLoggingLevel FULL;
        public static final TechnicalLoggingLevel FULL_WITHOUT_EMPTY_SCAN;
        public static final TechnicalLoggingLevel FULL_WITHOUT_EMPTY_SCAN_REQUEST_RESPONSE;
        public static final TechnicalLoggingLevel FULL_WITHOUT_SCAN;
        public static final TechnicalLoggingLevel FULL_WITHOUT_SCAN_REQUEST_RESPONSE;
        public static final TechnicalLoggingLevel NOTHING;

        static {
            TechnicalLoggingLevel technicalLoggingLevel = new TechnicalLoggingLevel("FULL", 0);
            FULL = technicalLoggingLevel;
            TechnicalLoggingLevel technicalLoggingLevel2 = new TechnicalLoggingLevel("FULL_WITHOUT_EMPTY_SCAN", 1);
            FULL_WITHOUT_EMPTY_SCAN = technicalLoggingLevel2;
            TechnicalLoggingLevel technicalLoggingLevel3 = new TechnicalLoggingLevel("FULL_WITHOUT_SCAN", 2);
            FULL_WITHOUT_SCAN = technicalLoggingLevel3;
            TechnicalLoggingLevel technicalLoggingLevel4 = new TechnicalLoggingLevel("FULL_WITHOUT_EMPTY_SCAN_REQUEST_RESPONSE", 3);
            FULL_WITHOUT_EMPTY_SCAN_REQUEST_RESPONSE = technicalLoggingLevel4;
            TechnicalLoggingLevel technicalLoggingLevel5 = new TechnicalLoggingLevel("FULL_WITHOUT_SCAN_REQUEST_RESPONSE", 4);
            FULL_WITHOUT_SCAN_REQUEST_RESPONSE = technicalLoggingLevel5;
            TechnicalLoggingLevel technicalLoggingLevel6 = new TechnicalLoggingLevel("NOTHING", 5);
            NOTHING = technicalLoggingLevel6;
            TechnicalLoggingLevel[] technicalLoggingLevelArr = {technicalLoggingLevel, technicalLoggingLevel2, technicalLoggingLevel3, technicalLoggingLevel4, technicalLoggingLevel5, technicalLoggingLevel6};
            $VALUES = technicalLoggingLevelArr;
            $ENTRIES = kotlin.enums.a.a(technicalLoggingLevelArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(23));
        }

        public static TechnicalLoggingLevel valueOf(String str) {
            return (TechnicalLoggingLevel) Enum.valueOf(TechnicalLoggingLevel.class, str);
        }

        public static TechnicalLoggingLevel[] values() {
            return (TechnicalLoggingLevel[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        s = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new jrl0(18)), kotlin.a.b(lazyThreadSafetyMode, new jrl0(19)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new jrl0(20)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new jrl0(21)), null, null, null, null};
        t = new ScootersIgnitionExperiment(0);
    }

    public ScootersIgnitionExperiment(int i, boolean z, Map map, List list, int i2, long j, long j2, long j3, RestartStrategy restartStrategy, long j4, long j5, int i3, boolean z2, TechnicalLoggingLevel technicalLoggingLevel, String str, String str2, String str3, Ui ui) {
        Ui ui2;
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
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
        if ((i & 8) == 0) {
            this.e = -100;
        } else {
            this.e = i2;
        }
        if ((i & 16) == 0) {
            this.f = 2000L;
        } else {
            this.f = j;
        }
        if ((i & 32) == 0) {
            this.g = 2000L;
        } else {
            this.g = j2;
        }
        if ((i & 64) == 0) {
            this.h = 2000L;
        } else {
            this.h = j3;
        }
        if ((i & 128) == 0) {
            this.i = RestartStrategy.APP_CREATE;
        } else {
            this.i = restartStrategy;
        }
        this.j = (i & 256) == 0 ? 1100L : j4;
        this.k = (i & 512) == 0 ? 0L : j5;
        this.l = (i & 1024) == 0 ? -70 : i3;
        if ((i & 2048) == 0) {
            this.m = false;
        } else {
            this.m = z2;
        }
        this.n = (i & 4096) == 0 ? TechnicalLoggingLevel.NOTHING : technicalLoggingLevel;
        if ((i & 8192) == 0) {
            this.o = null;
        } else {
            this.o = str;
        }
        if ((i & 16384) == 0) {
            this.p = null;
        } else {
            this.p = str2;
        }
        if ((32768 & i) == 0) {
            this.q = null;
        } else {
            this.q = str3;
        }
        if ((i & 65536) == 0) {
            Ui.Companion.getClass();
            ui2 = Ui.i;
        } else {
            ui2 = ui;
        }
        this.r = ui2;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui;", "", "Companion", "ControlPanel", "EnabledNotification", "SystemEnabledNotification", "InfoItem", "OnboardingScreen", "RegularScreen", "PermissionsInfoContainer", "PermissionsInfo", "PermissionsInfoItem", "com/yandex/go/scooters/ignition/data/model/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Ui {
        public static final d Companion = new d();
        public static final i3y[] h = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(24)), null, null};
        public static final Ui i = new Ui(0);
        public final OnboardingScreen a;
        public final RegularScreen b;
        public final EnabledNotification c;
        public final SystemEnabledNotification d;
        public final List e;
        public final PermissionsInfoContainer f;
        public final ControlPanel g;

        public Ui(int i2, OnboardingScreen onboardingScreen, RegularScreen regularScreen, EnabledNotification enabledNotification, SystemEnabledNotification systemEnabledNotification, List list, PermissionsInfoContainer permissionsInfoContainer, ControlPanel controlPanel) {
            if ((i2 & 1) == 0) {
                OnboardingScreen.Companion.getClass();
                onboardingScreen = OnboardingScreen.f;
            }
            this.a = onboardingScreen;
            if ((i2 & 2) == 0) {
                RegularScreen.Companion.getClass();
                this.b = RegularScreen.f;
            } else {
                this.b = regularScreen;
            }
            if ((i2 & 4) == 0) {
                EnabledNotification.Companion.getClass();
                this.c = EnabledNotification.d;
            } else {
                this.c = enabledNotification;
            }
            if ((i2 & 8) == 0) {
                SystemEnabledNotification.Companion.getClass();
                this.d = SystemEnabledNotification.c;
            } else {
                this.d = systemEnabledNotification;
            }
            if ((i2 & 16) == 0) {
                this.e = EmptyList.a;
            } else {
                this.e = list;
            }
            if ((i2 & 32) == 0) {
                this.f = null;
            } else {
                this.f = permissionsInfoContainer;
            }
            if ((i2 & 64) == 0) {
                this.g = null;
            } else {
                this.g = controlPanel;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$PermissionsInfoContainer;", "", "Companion", "$serializer", "com/yandex/go/scooters/ignition/data/model/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class PermissionsInfoContainer {
            public static final o Companion = new o();
            public final PermissionsInfo a;

            public /* synthetic */ PermissionsInfoContainer(int i, PermissionsInfo permissionsInfo) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = permissionsInfo;
                }
            }

            public PermissionsInfoContainer() {
                this.a = null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$ControlPanel;", "", "Companion", "Banner", "Badge", "ActionType", "StartEntryPoint", "com/yandex/go/scooters/ignition/data/model/h", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ControlPanel {
            public static final h Companion = new h();
            public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(25)), null};
            public static final ControlPanel f = new ControlPanel(0);
            public final FormattedText a;
            public final FormattedText b;
            public final List c;
            public final StartEntryPoint d;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$ControlPanel$ActionType;", "", "Companion", "com/yandex/go/scooters/ignition/data/model/e", "PROMOTION", "START_RIDE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class ActionType {
                private static final /* synthetic */ k4o $ENTRIES;
                private static final /* synthetic */ ActionType[] $VALUES;
                private static final i3y $cachedSerializer$delegate;
                public static final e Companion;
                public static final ActionType PROMOTION;
                public static final ActionType START_RIDE;

                static {
                    ActionType actionType = new ActionType("PROMOTION", 0);
                    PROMOTION = actionType;
                    ActionType actionType2 = new ActionType("START_RIDE", 1);
                    START_RIDE = actionType2;
                    ActionType[] actionTypeArr = {actionType, actionType2};
                    $VALUES = actionTypeArr;
                    $ENTRIES = kotlin.enums.a.a(actionTypeArr);
                    Companion = new e();
                    $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(26));
                }

                public static ActionType valueOf(String str) {
                    return (ActionType) Enum.valueOf(ActionType.class, str);
                }

                public static ActionType[] values() {
                    return (ActionType[]) $VALUES.clone();
                }
            }

            public /* synthetic */ ControlPanel(int i, FormattedText formattedText, FormattedText formattedText2, List list, StartEntryPoint startEntryPoint) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = FormattedText.c;
                } else {
                    this.b = formattedText2;
                }
                if ((i & 4) == 0) {
                    this.c = EmptyList.a;
                } else {
                    this.c = list;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = startEntryPoint;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$ControlPanel$Badge;", "", "Companion", "com/yandex/go/scooters/ignition/data/model/f", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class Badge {
                public static final f Companion = new f();
                public final FormattedText a;
                public final String b;

                static {
                    new Badge(0);
                }

                public /* synthetic */ Badge(int i, String str, FormattedText formattedText) {
                    this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                    if ((i & 2) == 0) {
                        this.b = "";
                    } else {
                        this.b = str;
                    }
                }

                public Badge() {
                    this(0);
                }

                public Badge(int i) {
                    this.a = FormattedText.c;
                    this.b = "";
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$ControlPanel$StartEntryPoint;", "", "Companion", "com/yandex/go/scooters/ignition/data/model/i", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class StartEntryPoint {
                public static final i Companion = new i();
                public final FormattedText a;
                public final FormattedText b;
                public final String c;

                static {
                    new StartEntryPoint(0);
                }

                public /* synthetic */ StartEntryPoint(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
                    this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                    if ((i & 2) == 0) {
                        this.b = FormattedText.c;
                    } else {
                        this.b = formattedText2;
                    }
                    if ((i & 4) == 0) {
                        this.c = "";
                    } else {
                        this.c = str;
                    }
                }

                public StartEntryPoint() {
                    this(0);
                }

                public StartEntryPoint(int i) {
                    FormattedText formattedText = FormattedText.c;
                    this.a = formattedText;
                    this.b = formattedText;
                    this.c = "";
                }
            }

            public ControlPanel() {
                this(0);
            }

            public ControlPanel(int i) {
                FormattedText formattedText = FormattedText.c;
                this.a = formattedText;
                this.b = formattedText;
                this.c = EmptyList.a;
                this.d = null;
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$ControlPanel$Banner;", "", "Companion", "com/yandex/go/scooters/ignition/data/model/g", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class Banner {
                public static final g Companion = new g();
                public static final i3y[] g = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(27))};
                public final String a;
                public final FormattedText b;
                public final String c;
                public final Badge d;
                public final String e;
                public final ActionType f;

                static {
                    new Banner(0);
                }

                public /* synthetic */ Banner(int i, String str, FormattedText formattedText, String str2, Badge badge, String str3, ActionType actionType) {
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
                        this.c = "";
                    } else {
                        this.c = str2;
                    }
                    if ((i & 8) == 0) {
                        this.d = null;
                    } else {
                        this.d = badge;
                    }
                    if ((i & 16) == 0) {
                        this.e = "";
                    } else {
                        this.e = str3;
                    }
                    if ((i & 32) == 0) {
                        this.f = ActionType.PROMOTION;
                    } else {
                        this.f = actionType;
                    }
                }

                public Banner() {
                    this(0);
                }

                public Banner(int i) {
                    FormattedText formattedText = FormattedText.c;
                    ActionType actionType = ActionType.PROMOTION;
                    this.a = "";
                    this.b = formattedText;
                    this.c = "";
                    this.d = null;
                    this.e = "";
                    this.f = actionType;
                }
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$RegularScreen;", "", "Companion", PlusPayUiKitInflaterFactory.NAME_BUTTON, "DisablingConfirmation", "com/yandex/go/scooters/ignition/data/model/r", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class RegularScreen {
            public static final r Companion = new r();
            public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(1)), null, null};
            public static final RegularScreen f = new RegularScreen(0);
            public final FormattedText a;
            public final List b;
            public final Button c;
            public final DisablingConfirmation d;

            public RegularScreen(int i, FormattedText formattedText, List list, Button button, DisablingConfirmation disablingConfirmation) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = EmptyList.a;
                } else {
                    this.b = list;
                }
                if ((i & 4) == 0) {
                    Button.Companion.getClass();
                    this.c = Button.c;
                } else {
                    this.c = button;
                }
                if ((i & 8) != 0) {
                    this.d = disablingConfirmation;
                } else {
                    DisablingConfirmation.Companion.getClass();
                    this.d = DisablingConfirmation.d;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$RegularScreen$Button;", "", "Companion", "com/yandex/go/scooters/ignition/data/model/q", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class Button {
                public static final q Companion = new q();
                public static final Button c = new Button(0);
                public final FormattedText a;
                public final FormattedText b;

                public /* synthetic */ Button(int i, FormattedText formattedText, FormattedText formattedText2) {
                    this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                    if ((i & 2) == 0) {
                        this.b = FormattedText.c;
                    } else {
                        this.b = formattedText2;
                    }
                }

                public Button() {
                    this(0);
                }

                public Button(int i) {
                    FormattedText formattedText = FormattedText.c;
                    this.a = formattedText;
                    this.b = formattedText;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$RegularScreen$DisablingConfirmation;", "", "Companion", "com/yandex/go/scooters/ignition/data/model/s", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class DisablingConfirmation {
                public static final s Companion = new s();
                public static final DisablingConfirmation d = new DisablingConfirmation(0);
                public final FormattedText a;
                public final FormattedText b;
                public final FormattedText c;

                public /* synthetic */ DisablingConfirmation(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
                    this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                    if ((i & 2) == 0) {
                        this.b = FormattedText.c;
                    } else {
                        this.b = formattedText2;
                    }
                    if ((i & 4) == 0) {
                        this.c = FormattedText.c;
                    } else {
                        this.c = formattedText3;
                    }
                }

                public DisablingConfirmation() {
                    this(0);
                }

                public DisablingConfirmation(int i) {
                    FormattedText formattedText = FormattedText.c;
                    this.a = formattedText;
                    this.b = formattedText;
                    this.c = formattedText;
                }
            }

            public RegularScreen() {
                this(0);
            }

            public RegularScreen(int i) {
                FormattedText formattedText = FormattedText.c;
                Button.Companion.getClass();
                Button button = Button.c;
                DisablingConfirmation.Companion.getClass();
                DisablingConfirmation disablingConfirmation = DisablingConfirmation.d;
                this.a = formattedText;
                this.b = EmptyList.a;
                this.c = button;
                this.d = disablingConfirmation;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$SystemEnabledNotification;", "", "Companion", "com/yandex/go/scooters/ignition/data/model/t", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class SystemEnabledNotification {
            public static final t Companion = new t();
            public static final SystemEnabledNotification c = new SystemEnabledNotification(0);
            public final FormattedText a;
            public final FormattedText b;

            public /* synthetic */ SystemEnabledNotification(int i, FormattedText formattedText, FormattedText formattedText2) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = FormattedText.c;
                } else {
                    this.b = formattedText2;
                }
            }

            public SystemEnabledNotification() {
                this(0);
            }

            public SystemEnabledNotification(int i) {
                FormattedText formattedText = FormattedText.c;
                this.a = formattedText;
                this.b = formattedText;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$PermissionsInfo;", "", "Companion", "$serializer", "com/yandex/go/scooters/ignition/data/model/n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class PermissionsInfo {
            public static final n Companion = new n();
            public final PermissionsInfoItem a;
            public final PermissionsInfoItem b;
            public final PermissionsInfoItem c;

            public /* synthetic */ PermissionsInfo(int i, PermissionsInfoItem permissionsInfoItem, PermissionsInfoItem permissionsInfoItem2, PermissionsInfoItem permissionsInfoItem3) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = permissionsInfoItem;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = permissionsInfoItem2;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = permissionsInfoItem3;
                }
            }

            public PermissionsInfo() {
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$EnabledNotification;", "", "Companion", "com/yandex/go/scooters/ignition/data/model/j", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class EnabledNotification {
            public static final j Companion = new j();
            public static final EnabledNotification d = new EnabledNotification(0);
            public final String a;
            public final FormattedText b;
            public final FormattedText c;

            public /* synthetic */ EnabledNotification(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
                this.a = (i & 1) == 0 ? "" : str;
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
            }

            public EnabledNotification() {
                this(0);
            }

            public EnabledNotification(int i) {
                FormattedText formattedText = FormattedText.c;
                this.a = "";
                this.b = formattedText;
                this.c = formattedText;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$PermissionsInfoItem;", "", "Companion", "$serializer", "com/yandex/go/scooters/ignition/data/model/p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class PermissionsInfoItem {
            public static final p Companion = new p();
            public final FormattedText a;
            public final FormattedText b;
            public final FormattedText c;

            public /* synthetic */ PermissionsInfoItem(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = FormattedText.c;
                } else {
                    this.b = formattedText2;
                }
                if ((i & 4) == 0) {
                    this.c = FormattedText.c;
                } else {
                    this.c = formattedText3;
                }
            }

            public PermissionsInfoItem() {
                FormattedText formattedText = FormattedText.c;
                this.a = formattedText;
                this.b = formattedText;
                this.c = formattedText;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$OnboardingScreen;", "", "Companion", "com/yandex/go/scooters/ignition/data/model/m", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class OnboardingScreen {
            public static final m Companion = new m();
            public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(0)), null, null};
            public static final OnboardingScreen f = new OnboardingScreen(0);
            public final FormattedText a;
            public final List b;
            public final FormattedText c;
            public final FormattedText d;

            public /* synthetic */ OnboardingScreen(int i, List list, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                this.b = (i & 2) == 0 ? EmptyList.a : list;
                if ((i & 4) == 0) {
                    this.c = FormattedText.c;
                } else {
                    this.c = formattedText2;
                }
                if ((i & 8) == 0) {
                    this.d = FormattedText.c;
                } else {
                    this.d = formattedText3;
                }
            }

            public OnboardingScreen() {
                this(0);
            }

            public OnboardingScreen(int i) {
                FormattedText formattedText = FormattedText.c;
                this.a = formattedText;
                this.b = EmptyList.a;
                this.c = formattedText;
                this.d = formattedText;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$InfoItem;", "", "Companion", "ActionType", "$serializer", "com/yandex/go/scooters/ignition/data/model/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class InfoItem {
            public static final l Companion = new l();
            public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(28))};
            public final String a;
            public final String b;
            public final FormattedText c;
            public final FormattedText d;
            public final ActionType e;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$InfoItem$ActionType;", "", "Companion", "com/yandex/go/scooters/ignition/data/model/k", "NO_ACTION", "PROMOTION", "LEGAL_TERMS", "BETA", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class ActionType {
                private static final /* synthetic */ k4o $ENTRIES;
                private static final /* synthetic */ ActionType[] $VALUES;
                private static final i3y $cachedSerializer$delegate;
                public static final ActionType BETA;
                public static final k Companion;
                public static final ActionType LEGAL_TERMS;
                public static final ActionType NO_ACTION;
                public static final ActionType PROMOTION;

                static {
                    ActionType actionType = new ActionType("NO_ACTION", 0);
                    NO_ACTION = actionType;
                    ActionType actionType2 = new ActionType("PROMOTION", 1);
                    PROMOTION = actionType2;
                    ActionType actionType3 = new ActionType("LEGAL_TERMS", 2);
                    LEGAL_TERMS = actionType3;
                    ActionType actionType4 = new ActionType("BETA", 3);
                    BETA = actionType4;
                    ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4};
                    $VALUES = actionTypeArr;
                    $ENTRIES = kotlin.enums.a.a(actionTypeArr);
                    Companion = new k();
                    $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(29));
                }

                public static ActionType valueOf(String str) {
                    return (ActionType) Enum.valueOf(ActionType.class, str);
                }

                public static ActionType[] values() {
                    return (ActionType[]) $VALUES.clone();
                }
            }

            public /* synthetic */ InfoItem(int i, String str, String str2, FormattedText formattedText, FormattedText formattedText2, ActionType actionType) {
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
                    this.c = FormattedText.c;
                } else {
                    this.c = formattedText;
                }
                if ((i & 8) == 0) {
                    this.d = FormattedText.c;
                } else {
                    this.d = formattedText2;
                }
                if ((i & 16) == 0) {
                    this.e = ActionType.NO_ACTION;
                } else {
                    this.e = actionType;
                }
            }

            public InfoItem() {
                FormattedText formattedText = FormattedText.c;
                ActionType actionType = ActionType.NO_ACTION;
                this.a = "";
                this.b = "";
                this.c = formattedText;
                this.d = formattedText;
                this.e = actionType;
            }
        }

        public Ui() {
            this(0);
        }

        public Ui(int i2) {
            OnboardingScreen.Companion.getClass();
            OnboardingScreen onboardingScreen = OnboardingScreen.f;
            RegularScreen.Companion.getClass();
            RegularScreen regularScreen = RegularScreen.f;
            EnabledNotification.Companion.getClass();
            EnabledNotification enabledNotification = EnabledNotification.d;
            SystemEnabledNotification.Companion.getClass();
            SystemEnabledNotification systemEnabledNotification = SystemEnabledNotification.c;
            this.a = onboardingScreen;
            this.b = regularScreen;
            this.c = enabledNotification;
            this.d = systemEnabledNotification;
            this.e = EmptyList.a;
            this.f = null;
            this.g = null;
        }
    }

    public ScootersIgnitionExperiment() {
        this(0);
    }

    public ScootersIgnitionExperiment(int i) {
        Map f = kotlin.collections.b.f();
        RestartStrategy restartStrategy = RestartStrategy.APP_CREATE;
        TechnicalLoggingLevel technicalLoggingLevel = TechnicalLoggingLevel.NOTHING;
        Ui.Companion.getClass();
        Ui ui = Ui.i;
        this.b = false;
        this.c = f;
        this.d = EmptyList.a;
        this.e = -100;
        this.f = 2000L;
        this.g = 2000L;
        this.h = 2000L;
        this.i = restartStrategy;
        this.j = 1100L;
        this.k = 0L;
        this.l = -70;
        this.m = false;
        this.n = technicalLoggingLevel;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = ui;
    }
}
