package com.yandex.go.scooters.misc.attention.data.model;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.vnm0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/misc/attention/data/model/ScootersAttentionDto;", "", "Companion", "Style", "Action", "$serializer", "com/yandex/go/scooters/misc/attention/data/model/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersAttentionDto {
    public static final e Companion = new e();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(21)), null, null, null};
    public final String a;
    public final Style b;
    public final FormattedText c;
    public final String d;
    public final Action e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/misc/attention/data/model/ScootersAttentionDto$Style;", "", "Companion", "com/yandex/go/scooters/misc/attention/data/model/f", "INFO", "PROMO", "ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Style {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final f Companion;
        public static final Style ERROR;
        public static final Style INFO;
        public static final Style PROMO;

        static {
            Style style = new Style("INFO", 0);
            INFO = style;
            Style style2 = new Style("PROMO", 1);
            PROMO = style2;
            Style style3 = new Style("ERROR", 2);
            ERROR = style3;
            Style[] styleArr = {style, style2, style3};
            $VALUES = styleArr;
            $ENTRIES = kotlin.enums.a.a(styleArr);
            Companion = new f();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(24));
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ScootersAttentionDto(int i, String str, Style style, FormattedText formattedText, String str2, Action action) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = Style.INFO;
        } else {
            this.b = style;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = action;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/misc/attention/data/model/ScootersAttentionDto$Action;", "", "Companion", "Type", "InfoScreenData", "$serializer", "com/yandex/go/scooters/misc/attention/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Action {
        public static final a Companion = new a();
        public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(22)), null, null};
        public final Type a;
        public final InfoScreenData b;
        public final String c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/misc/attention/data/model/ScootersAttentionDto$Action$Type;", "", "Companion", "com/yandex/go/scooters/misc/attention/data/model/d", "INFO", "FULLSCREEN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes12.dex */
        public static final class Type {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final d Companion;
            public static final Type FULLSCREEN;
            public static final Type INFO;

            static {
                Type type = new Type("INFO", 0);
                INFO = type;
                Type type2 = new Type("FULLSCREEN", 1);
                FULLSCREEN = type2;
                Type[] typeArr = {type, type2};
                $VALUES = typeArr;
                $ENTRIES = kotlin.enums.a.a(typeArr);
                Companion = new d();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(23));
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Action(int i, Type type, InfoScreenData infoScreenData, String str) {
            this.a = (i & 1) == 0 ? Type.INFO : type;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = infoScreenData;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/misc/attention/data/model/ScootersAttentionDto$Action$InfoScreenData;", "", "Companion", PlusPayUiKitInflaterFactory.NAME_BUTTON, "$serializer", "com/yandex/go/scooters/misc/attention/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class InfoScreenData {
            public static final c Companion = new c();
            public final FormattedText a;
            public final Button b;
            public final String c;

            public /* synthetic */ InfoScreenData(int i, FormattedText formattedText, Button button, String str) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = new Button(0);
                } else {
                    this.b = button;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = str;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/misc/attention/data/model/ScootersAttentionDto$Action$InfoScreenData$Button;", "", "Companion", "$serializer", "com/yandex/go/scooters/misc/attention/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class Button {
                public static final b Companion = new b();
                public final FormattedText a;

                public /* synthetic */ Button(int i, FormattedText formattedText) {
                    if ((i & 1) == 0) {
                        this.a = FormattedText.c;
                    } else {
                        this.a = formattedText;
                    }
                }

                public Button() {
                    this(0);
                }

                public Button(int i) {
                    this.a = FormattedText.c;
                }
            }

            public InfoScreenData() {
                FormattedText formattedText = FormattedText.c;
                Button button = new Button(0);
                this.a = formattedText;
                this.b = button;
                this.c = null;
            }
        }

        public Action() {
            this.a = Type.INFO;
            this.b = null;
            this.c = null;
        }
    }

    public ScootersAttentionDto() {
        Style style = Style.INFO;
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = style;
        this.c = formattedText;
        this.d = "";
        this.e = null;
    }
}
