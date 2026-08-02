package com.yandex.go.scooters.promotions.data.model;

import defpackage.gsq0;
import defpackage.h5o0;
import defpackage.i3y;
import defpackage.k4o;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/scooters/promotions/data/model/ScootersPromoblockResponse;", "", "Companion", "ScootersPromo", "PromotionsCommunication", "ScootersTopBanner", "$serializer", "com/yandex/go/scooters/promotions/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPromoblockResponse {
    public static final b Companion = new b();
    public final ScootersPromo a;
    public final ScootersTopBanner b;

    public /* synthetic */ ScootersPromoblockResponse(int i, ScootersPromo scootersPromo, ScootersTopBanner scootersTopBanner) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = scootersPromo;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = scootersTopBanner;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/promotions/data/model/ScootersPromoblockResponse$ScootersTopBanner;", "", "Companion", "TopBannerCommunication", "$serializer", "com/yandex/go/scooters/promotions/data/model/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ScootersTopBanner {
        public static final f Companion = new f();
        public final String a;
        public final TopBannerCommunication b;

        public /* synthetic */ ScootersTopBanner(int i, String str, TopBannerCommunication topBannerCommunication) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = new TopBannerCommunication(0);
            } else {
                this.b = topBannerCommunication;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/scooters/promotions/data/model/ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication;", "", "Companion", "TopBannerCommunicationIcon", "TopBannerCommunicationStyle", "TopBannerCommunicationPriority", "$serializer", "com/yandex/go/scooters/promotions/data/model/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class TopBannerCommunication {
            public static final g Companion = new g();
            public static final i3y[] i;
            public final FormattedText a;
            public final FormattedText b;
            public final String c;
            public final TopBannerCommunicationIcon d;
            public final TopBannerCommunicationStyle e;
            public final Boolean f;
            public final Integer g;
            public final TopBannerCommunicationPriority h;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/promotions/data/model/ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication$TopBannerCommunicationPriority;", "", "Companion", "com/yandex/go/scooters/promotions/data/model/i", "LOW", "DEFAULT", "HIGH", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class TopBannerCommunicationPriority {
                private static final /* synthetic */ k4o $ENTRIES;
                private static final /* synthetic */ TopBannerCommunicationPriority[] $VALUES;
                private static final i3y $cachedSerializer$delegate;
                public static final i Companion;
                public static final TopBannerCommunicationPriority DEFAULT;
                public static final TopBannerCommunicationPriority HIGH;
                public static final TopBannerCommunicationPriority LOW;

                static {
                    TopBannerCommunicationPriority topBannerCommunicationPriority = new TopBannerCommunicationPriority("LOW", 0);
                    LOW = topBannerCommunicationPriority;
                    TopBannerCommunicationPriority topBannerCommunicationPriority2 = new TopBannerCommunicationPriority("DEFAULT", 1);
                    DEFAULT = topBannerCommunicationPriority2;
                    TopBannerCommunicationPriority topBannerCommunicationPriority3 = new TopBannerCommunicationPriority("HIGH", 2);
                    HIGH = topBannerCommunicationPriority3;
                    TopBannerCommunicationPriority[] topBannerCommunicationPriorityArr = {topBannerCommunicationPriority, topBannerCommunicationPriority2, topBannerCommunicationPriority3};
                    $VALUES = topBannerCommunicationPriorityArr;
                    $ENTRIES = kotlin.enums.a.a(topBannerCommunicationPriorityArr);
                    Companion = new i();
                    $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(19));
                }

                public static TopBannerCommunicationPriority valueOf(String str) {
                    return (TopBannerCommunicationPriority) Enum.valueOf(TopBannerCommunicationPriority.class, str);
                }

                public static TopBannerCommunicationPriority[] values() {
                    return (TopBannerCommunicationPriority[]) $VALUES.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/promotions/data/model/ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication$TopBannerCommunicationStyle;", "", "Companion", "com/yandex/go/scooters/promotions/data/model/j", "INFO", "WARNING", "ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class TopBannerCommunicationStyle {
                private static final /* synthetic */ k4o $ENTRIES;
                private static final /* synthetic */ TopBannerCommunicationStyle[] $VALUES;
                private static final i3y $cachedSerializer$delegate;
                public static final j Companion;
                public static final TopBannerCommunicationStyle ERROR;
                public static final TopBannerCommunicationStyle INFO;
                public static final TopBannerCommunicationStyle WARNING;

                static {
                    TopBannerCommunicationStyle topBannerCommunicationStyle = new TopBannerCommunicationStyle("INFO", 0);
                    INFO = topBannerCommunicationStyle;
                    TopBannerCommunicationStyle topBannerCommunicationStyle2 = new TopBannerCommunicationStyle("WARNING", 1);
                    WARNING = topBannerCommunicationStyle2;
                    TopBannerCommunicationStyle topBannerCommunicationStyle3 = new TopBannerCommunicationStyle("ERROR", 2);
                    ERROR = topBannerCommunicationStyle3;
                    TopBannerCommunicationStyle[] topBannerCommunicationStyleArr = {topBannerCommunicationStyle, topBannerCommunicationStyle2, topBannerCommunicationStyle3};
                    $VALUES = topBannerCommunicationStyleArr;
                    $ENTRIES = kotlin.enums.a.a(topBannerCommunicationStyleArr);
                    Companion = new j();
                    $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(20));
                }

                public static TopBannerCommunicationStyle valueOf(String str) {
                    return (TopBannerCommunicationStyle) Enum.valueOf(TopBannerCommunicationStyle.class, str);
                }

                public static TopBannerCommunicationStyle[] values() {
                    return (TopBannerCommunicationStyle[]) $VALUES.clone();
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                i = new i3y[]{null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new h5o0(17)), null, null, kotlin.a.b(lazyThreadSafetyMode, new h5o0(18))};
            }

            public /* synthetic */ TopBannerCommunication(int i2, FormattedText formattedText, FormattedText formattedText2, String str, TopBannerCommunicationIcon topBannerCommunicationIcon, TopBannerCommunicationStyle topBannerCommunicationStyle, Boolean bool, Integer num, TopBannerCommunicationPriority topBannerCommunicationPriority) {
                this.a = (i2 & 1) == 0 ? FormattedText.c : formattedText;
                if ((i2 & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = formattedText2;
                }
                if ((i2 & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = str;
                }
                if ((i2 & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = topBannerCommunicationIcon;
                }
                if ((i2 & 16) == 0) {
                    this.e = TopBannerCommunicationStyle.INFO;
                } else {
                    this.e = topBannerCommunicationStyle;
                }
                if ((i2 & 32) == 0) {
                    this.f = null;
                } else {
                    this.f = bool;
                }
                if ((i2 & 64) == 0) {
                    this.g = null;
                } else {
                    this.g = num;
                }
                if ((i2 & 128) == 0) {
                    this.h = null;
                } else {
                    this.h = topBannerCommunicationPriority;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/promotions/data/model/ScootersPromoblockResponse$ScootersTopBanner$TopBannerCommunication$TopBannerCommunicationIcon;", "", "Companion", "$serializer", "com/yandex/go/scooters/promotions/data/model/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class TopBannerCommunicationIcon {
                public static final h Companion = new h();
                public final String a;

                public /* synthetic */ TopBannerCommunicationIcon(int i, String str) {
                    if ((i & 1) == 0) {
                        this.a = "";
                    } else {
                        this.a = str;
                    }
                }

                public TopBannerCommunicationIcon() {
                    this.a = "";
                }
            }

            public TopBannerCommunication() {
                this(0);
            }

            public TopBannerCommunication(int i2) {
                FormattedText formattedText = FormattedText.c;
                TopBannerCommunicationStyle topBannerCommunicationStyle = TopBannerCommunicationStyle.INFO;
                this.a = formattedText;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = topBannerCommunicationStyle;
                this.f = null;
                this.g = null;
                this.h = null;
            }
        }

        public ScootersTopBanner() {
            TopBannerCommunication topBannerCommunication = new TopBannerCommunication(0);
            this.a = "";
            this.b = topBannerCommunication;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/promotions/data/model/ScootersPromoblockResponse$PromotionsCommunication;", "", "Companion", "PromotionsCommunicationIcon", "$serializer", "com/yandex/go/scooters/promotions/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PromotionsCommunication {
        public static final c Companion = new c();
        public final String a;
        public final FormattedText b;
        public final FormattedText c;
        public final PromotionsCommunicationIcon d;

        public /* synthetic */ PromotionsCommunication(int i, String str, FormattedText formattedText, FormattedText formattedText2, PromotionsCommunicationIcon promotionsCommunicationIcon) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = formattedText2;
            }
            if ((i & 8) == 0) {
                this.d = new PromotionsCommunicationIcon(0);
            } else {
                this.d = promotionsCommunicationIcon;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/promotions/data/model/ScootersPromoblockResponse$PromotionsCommunication$PromotionsCommunicationIcon;", "", "Companion", "$serializer", "com/yandex/go/scooters/promotions/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class PromotionsCommunicationIcon {
            public static final d Companion = new d();
            public final String a;

            public /* synthetic */ PromotionsCommunicationIcon(int i, String str) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
            }

            public PromotionsCommunicationIcon(int i) {
                this.a = "";
            }

            public PromotionsCommunicationIcon() {
                this(0);
            }
        }

        public PromotionsCommunication() {
            this(0);
        }

        public PromotionsCommunication(int i) {
            FormattedText formattedText = FormattedText.c;
            PromotionsCommunicationIcon promotionsCommunicationIcon = new PromotionsCommunicationIcon(0);
            this.a = "";
            this.b = formattedText;
            this.c = null;
            this.d = promotionsCommunicationIcon;
        }
    }

    public ScootersPromoblockResponse() {
        this.a = null;
        this.b = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/promotions/data/model/ScootersPromoblockResponse$ScootersPromo;", "", "Companion", "$serializer", "com/yandex/go/scooters/promotions/data/model/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ScootersPromo {
        public static final e Companion = new e();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(16))};
        public final PromotionsCommunication a;
        public final Map b;

        public /* synthetic */ ScootersPromo(int i, PromotionsCommunication promotionsCommunication, Map map) {
            this.a = (i & 1) == 0 ? new PromotionsCommunication(0) : promotionsCommunication;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = map;
            }
        }

        public ScootersPromo() {
            this.a = new PromotionsCommunication(0);
            this.b = null;
        }
    }
}
