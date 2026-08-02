package com.yandex.messaging.views.bottomsheet;

import defpackage.k4o;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class NavConfiguration {
    public final int a;
    public final OpenMode b;
    public final boolean c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/messaging/views/bottomsheet/NavConfiguration$OpenMode;", "", "Default", "PreviousScreen", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ OpenMode[] $VALUES;
        public static final OpenMode Default;
        public static final OpenMode PreviousScreen;

        static {
            OpenMode openMode = new OpenMode("Default", 0);
            Default = openMode;
            OpenMode openMode2 = new OpenMode("PreviousScreen", 1);
            PreviousScreen = openMode2;
            OpenMode[] openModeArr = {openMode, openMode2};
            $VALUES = openModeArr;
            $ENTRIES = kotlin.enums.a.a(openModeArr);
        }

        public static OpenMode valueOf(String str) {
            return (OpenMode) Enum.valueOf(OpenMode.class, str);
        }

        public static OpenMode[] values() {
            return (OpenMode[]) $VALUES.clone();
        }
    }

    public NavConfiguration(int i, OpenMode openMode, boolean z) {
        this.a = i;
        this.b = openMode;
        this.c = z;
    }

    public static NavConfiguration a(NavConfiguration navConfiguration, int i, OpenMode openMode, int i2) {
        if ((i2 & 1) != 0) {
            i = navConfiguration.a;
        }
        if ((i2 & 2) != 0) {
            openMode = navConfiguration.b;
        }
        return new NavConfiguration(i, openMode, (i2 & 4) != 0 ? navConfiguration.c : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavConfiguration)) {
            return false;
        }
        NavConfiguration navConfiguration = (NavConfiguration) obj;
        return this.a == navConfiguration.a && this.b == navConfiguration.b && this.c == navConfiguration.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavConfiguration(bgOffset=");
        sb.append(this.a);
        sb.append(", openMode=");
        sb.append(this.b);
        sb.append(", isExpandable=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }

    public NavConfiguration() {
        this(0);
    }

    public /* synthetic */ NavConfiguration(int i) {
        this(0, OpenMode.Default, false);
    }
}
