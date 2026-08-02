package com.yandex.go.scooters.data.model;

import defpackage.c6z;
import defpackage.czo0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersSurgeExperiment;", "Lw96;", "Lc6z;", "Companion", "Settings", "SurgeSettingsByBalance", "SurgeSettings", "com/yandex/go/scooters/data/model/c0", "$serializer", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScootersSurgeExperiment extends w96 implements c6z {
    public static final c0 Companion = new c0();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new czo0(3)), null};
    public static final ScootersSurgeExperiment f = new ScootersSurgeExperiment(0);
    public final boolean b;
    public final Map c;
    public final Settings d;

    public ScootersSurgeExperiment(int i, boolean z, Map map, Settings settings) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) != 0) {
            this.d = settings;
        } else {
            Settings.Companion.getClass();
            this.d = Settings.d;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getC() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersSurgeExperiment$SurgeSettings;", "", "Companion", "IndicatorSettings", "Details", "Content", "com/yandex/go/scooters/data/model/e0", "$serializer", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SurgeSettings {
        public static final e0 Companion = new e0();
        public static final SurgeSettings i = new SurgeSettings(0);
        public final String a;
        public final String b;
        public final IndicatorSettings c;
        public final String d;
        public final String e;
        public final String f;
        public final Details g;
        public final Content h;

        public SurgeSettings(int i2, String str, String str2, IndicatorSettings indicatorSettings, String str3, String str4, String str5, Details details, Content content) {
            if ((i2 & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i2 & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i2 & 4) == 0) {
                IndicatorSettings.Companion.getClass();
                this.c = IndicatorSettings.c;
            } else {
                this.c = indicatorSettings;
            }
            if ((i2 & 8) == 0) {
                this.d = "";
            } else {
                this.d = str3;
            }
            if ((i2 & 16) == 0) {
                this.e = "";
            } else {
                this.e = str4;
            }
            if ((i2 & 32) == 0) {
                this.f = "";
            } else {
                this.f = str5;
            }
            if ((i2 & 64) == 0) {
                this.g = null;
            } else {
                this.g = details;
            }
            if ((i2 & 128) != 0) {
                this.h = content;
            } else {
                Content.Companion.getClass();
                this.h = Content.g;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersSurgeExperiment$SurgeSettings$Details;", "", "Companion", "$serializer", "com/yandex/go/scooters/data/model/g0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Details {
            public static final g0 Companion = new g0();
            public final String a;
            public final String b;

            public /* synthetic */ Details(int i, String str, String str2) {
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

            public Details() {
                this.a = "";
                this.b = "";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersSurgeExperiment$SurgeSettings$IndicatorSettings;", "", "Companion", "com/yandex/go/scooters/data/model/h0", "$serializer", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class IndicatorSettings {
            public static final h0 Companion = new h0();
            public static final IndicatorSettings c = new IndicatorSettings(0);
            public final String a;
            public final String b;

            public /* synthetic */ IndicatorSettings(int i, String str, String str2) {
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

            public IndicatorSettings(int i) {
                this.a = "";
                this.b = "";
            }

            public IndicatorSettings() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersSurgeExperiment$SurgeSettings$Content;", "", "Companion", "com/yandex/go/scooters/data/model/f0", "$serializer", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Content {
            public static final f0 Companion = new f0();
            public static final i3y[] f;
            public static final Content g;
            public final FormattedText a;
            public final FormattedText b;
            public final String c;
            public final List d;
            public final List e;

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                f = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new czo0(5)), kotlin.a.b(lazyThreadSafetyMode, new czo0(6))};
                g = new Content(0);
            }

            public /* synthetic */ Content(int i, String str, List list, List list2, FormattedText formattedText, FormattedText formattedText2) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = FormattedText.c;
                } else {
                    this.b = formattedText2;
                }
                this.c = (i & 4) == 0 ? "" : str;
                int i2 = i & 8;
                EmptyList emptyList = EmptyList.a;
                if (i2 == 0) {
                    this.d = emptyList;
                } else {
                    this.d = list;
                }
                if ((i & 16) == 0) {
                    this.e = emptyList;
                } else {
                    this.e = list2;
                }
            }

            public Content() {
                this(0);
            }

            public Content(int i) {
                FormattedText formattedText = FormattedText.c;
                this.a = formattedText;
                this.b = formattedText;
                this.c = "";
                EmptyList emptyList = EmptyList.a;
                this.d = emptyList;
                this.e = emptyList;
            }
        }

        public SurgeSettings() {
            this(0);
        }

        public SurgeSettings(int i2) {
            IndicatorSettings.Companion.getClass();
            Content.Companion.getClass();
            Content content = Content.g;
            this.a = "";
            this.b = "";
            this.c = IndicatorSettings.c;
            this.d = "";
            this.e = "";
            this.f = "";
            this.g = null;
            this.h = content;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersSurgeExperiment$Settings;", "", "Companion", "com/yandex/go/scooters/data/model/d0", "$serializer", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Settings {
        public static final d0 Companion = new d0();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new czo0(4)), null};
        public static final Settings d = new Settings(0);
        public final List a;
        public final SurgeSettings b;

        public Settings(int i, List list, SurgeSettings surgeSettings) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) != 0) {
                this.b = surgeSettings;
            } else {
                SurgeSettings.Companion.getClass();
                this.b = SurgeSettings.i;
            }
        }

        public Settings() {
            this(0);
        }

        public Settings(int i) {
            SurgeSettings.Companion.getClass();
            SurgeSettings surgeSettings = SurgeSettings.i;
            this.a = EmptyList.a;
            this.b = surgeSettings;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersSurgeExperiment$SurgeSettingsByBalance;", "", "Companion", "$serializer", "com/yandex/go/scooters/data/model/i0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SurgeSettingsByBalance {
        public static final i0 Companion = new i0();
        public final double a;
        public final double b;
        public final SurgeSettings c;

        public SurgeSettingsByBalance(int i, double d, double d2, SurgeSettings surgeSettings) {
            if ((i & 1) == 0) {
                this.a = 0.0d;
            } else {
                this.a = d;
            }
            if ((i & 2) == 0) {
                this.b = 0.0d;
            } else {
                this.b = d2;
            }
            if ((i & 4) != 0) {
                this.c = surgeSettings;
            } else {
                SurgeSettings.Companion.getClass();
                this.c = SurgeSettings.i;
            }
        }

        public SurgeSettingsByBalance() {
            SurgeSettings.Companion.getClass();
            SurgeSettings surgeSettings = SurgeSettings.i;
            this.a = 0.0d;
            this.b = 0.0d;
            this.c = surgeSettings;
        }
    }

    public ScootersSurgeExperiment() {
        this(0);
    }

    public ScootersSurgeExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        Settings.Companion.getClass();
        Settings settings = Settings.d;
        this.b = false;
        this.c = f2;
        this.d = settings;
    }
}
