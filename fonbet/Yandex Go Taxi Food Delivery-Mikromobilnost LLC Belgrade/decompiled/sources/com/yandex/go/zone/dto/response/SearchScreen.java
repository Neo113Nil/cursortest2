package com.yandex.go.zone.dto.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import defpackage.wpp0;
import defpackage.wrp0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/response/SearchScreen;", "", "Companion", "DisplaySettings", "com/yandex/go/zone/dto/response/d", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SearchScreen {
    public static final d Companion = new d();
    public static final SearchScreen d = new SearchScreen(0);
    public final String a;
    public final String b;
    public final DisplaySettings c;

    public /* synthetic */ SearchScreen(int i, String str, String str2, DisplaySettings displaySettings) {
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
            this.c = displaySettings;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchScreen)) {
            return false;
        }
        SearchScreen searchScreen = (SearchScreen) obj;
        return jl40.l(this.a, searchScreen.a) && jl40.l(this.b, searchScreen.b) && jl40.l(this.c, searchScreen.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        DisplaySettings displaySettings = this.c;
        return b + (displaySettings == null ? 0 : displaySettings.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("SearchScreen(title=", this.a, ", subtitle=", this.b, ", displaySettings=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/response/SearchScreen$DisplaySettings;", "", "Companion", "PreferredOrderDetailsType", "$serializer", "com/yandex/go/zone/dto/response/e", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class DisplaySettings {
        public static final e Companion = new e();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wpp0(15))};
        public final PreferredOrderDetailsType a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/zone/dto/response/SearchScreen$DisplaySettings$PreferredOrderDetailsType;", "", "Companion", "com/yandex/go/zone/dto/response/f", "DETAILS", "FEED", "GAME", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class PreferredOrderDetailsType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ PreferredOrderDetailsType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final f Companion;
            public static final PreferredOrderDetailsType DETAILS;
            public static final PreferredOrderDetailsType FEED;
            public static final PreferredOrderDetailsType GAME;

            static {
                PreferredOrderDetailsType preferredOrderDetailsType = new PreferredOrderDetailsType("DETAILS", 0);
                DETAILS = preferredOrderDetailsType;
                PreferredOrderDetailsType preferredOrderDetailsType2 = new PreferredOrderDetailsType("FEED", 1);
                FEED = preferredOrderDetailsType2;
                PreferredOrderDetailsType preferredOrderDetailsType3 = new PreferredOrderDetailsType("GAME", 2);
                GAME = preferredOrderDetailsType3;
                PreferredOrderDetailsType[] preferredOrderDetailsTypeArr = {preferredOrderDetailsType, preferredOrderDetailsType2, preferredOrderDetailsType3};
                $VALUES = preferredOrderDetailsTypeArr;
                $ENTRIES = kotlin.enums.a.a(preferredOrderDetailsTypeArr);
                Companion = new f();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wrp0(3));
            }

            public static PreferredOrderDetailsType valueOf(String str) {
                return (PreferredOrderDetailsType) Enum.valueOf(PreferredOrderDetailsType.class, str);
            }

            public static PreferredOrderDetailsType[] values() {
                return (PreferredOrderDetailsType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ DisplaySettings(int i, PreferredOrderDetailsType preferredOrderDetailsType) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = preferredOrderDetailsType;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplaySettings) && this.a == ((DisplaySettings) obj).a;
        }

        public final int hashCode() {
            PreferredOrderDetailsType preferredOrderDetailsType = this.a;
            if (preferredOrderDetailsType == null) {
                return 0;
            }
            return preferredOrderDetailsType.hashCode();
        }

        public final String toString() {
            return "DisplaySettings(preferredOrderDetailsType=" + this.a + Extension.C_BRAKE;
        }

        public DisplaySettings() {
            this.a = null;
        }
    }

    public SearchScreen(int i) {
        this.a = "";
        this.b = "";
        this.c = null;
    }

    public SearchScreen() {
        this(0);
    }
}
