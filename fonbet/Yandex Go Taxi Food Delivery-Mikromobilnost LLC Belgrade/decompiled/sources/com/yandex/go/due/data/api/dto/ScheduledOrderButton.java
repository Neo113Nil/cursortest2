package com.yandex.go.due.data.api.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.v4m0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/due/data/api/dto/ScheduledOrderButton;", "", "Companion", "ButtonStyle", "ButtonType", "com/yandex/go/due/data/api/dto/r", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScheduledOrderButton {
    public static final r Companion = new r();
    public static final i3y[] e;
    public static final ScheduledOrderButton f;
    public final ButtonType a;
    public final String b;
    public final String c;
    public final ButtonStyle d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/due/data/api/dto/ScheduledOrderButton$ButtonStyle;", "", "Companion", "com/yandex/go/due/data/api/dto/p", "MINOR", "MAIN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ButtonStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonStyle[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final p Companion;
        public static final ButtonStyle MAIN;
        public static final ButtonStyle MINOR;

        static {
            ButtonStyle buttonStyle = new ButtonStyle("MINOR", 0);
            MINOR = buttonStyle;
            ButtonStyle buttonStyle2 = new ButtonStyle("MAIN", 1);
            MAIN = buttonStyle2;
            ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2};
            $VALUES = buttonStyleArr;
            $ENTRIES = kotlin.enums.a.a(buttonStyleArr);
            Companion = new p();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v4m0(23));
        }

        public static ButtonStyle valueOf(String str) {
            return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        }

        public static ButtonStyle[] values() {
            return (ButtonStyle[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/due/data/api/dto/ScheduledOrderButton$ButtonType;", "", "Companion", "com/yandex/go/due/data/api/dto/q", "RIDE_NOW", "CONFIRM_PREORDER", "PREORDER_UNAVAILABLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes5.dex */
    public static final class ButtonType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ButtonType CONFIRM_PREORDER;
        public static final q Companion;
        public static final ButtonType PREORDER_UNAVAILABLE;
        public static final ButtonType RIDE_NOW;

        static {
            ButtonType buttonType = new ButtonType("RIDE_NOW", 0);
            RIDE_NOW = buttonType;
            ButtonType buttonType2 = new ButtonType("CONFIRM_PREORDER", 1);
            CONFIRM_PREORDER = buttonType2;
            ButtonType buttonType3 = new ButtonType("PREORDER_UNAVAILABLE", 2);
            PREORDER_UNAVAILABLE = buttonType3;
            ButtonType[] buttonTypeArr = {buttonType, buttonType2, buttonType3};
            $VALUES = buttonTypeArr;
            $ENTRIES = kotlin.enums.a.a(buttonTypeArr);
            Companion = new q();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v4m0(24));
        }

        public static ButtonType valueOf(String str) {
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }

        public static ButtonType[] values() {
            return (ButtonType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new v4m0(21)), null, null, kotlin.a.b(lazyThreadSafetyMode, new v4m0(22))};
        f = new ScheduledOrderButton(null, null, null, null);
    }

    public /* synthetic */ ScheduledOrderButton(int i, ButtonType buttonType, String str, String str2, ButtonStyle buttonStyle) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = buttonType;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = buttonStyle;
        }
    }

    public ScheduledOrderButton(ButtonType buttonType, String str, String str2, ButtonStyle buttonStyle) {
        this.a = buttonType;
        this.b = str;
        this.c = str2;
        this.d = buttonStyle;
    }

    public ScheduledOrderButton() {
        this(null, null, null, null);
    }
}
