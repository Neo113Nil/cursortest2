package ru.mail.libverify.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import ru.mail.libverify.InternalApi;

@InternalApi
/* loaded from: classes9.dex */
public interface j {

    @InternalApi
    public enum a {
        PACKAGE_UPDATED,
        PACKAGE_REMOVED,
        RESTART,
        TIMER,
        SMS_TEMPLATES_CHECK,
        NOTIFICATION_SETTINGS_CHANGE,
        UNKNOWN
    }

    @InternalApi
    public static class b {

        @NonNull
        public final String a;

        @NonNull
        public final String b;
        public final String c;
        public final Boolean d;

        @NonNull
        public final String e;

        @NonNull
        public final String f;
        public final String g;
        public final String h;
        public final boolean i;
        public final boolean j;

        public b(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, String str6, Boolean bool, String str7, String str8, boolean z, boolean z2) {
            this.a = str2;
            this.b = str4;
            this.c = str6;
            this.d = bool;
            this.e = str3;
            this.f = str;
            this.g = str7;
            this.h = str8;
            this.i = z;
            this.j = z2;
        }
    }

    @InternalApi
    public interface c {
        void a(@Nullable b bVar);
    }

    @NonNull
    ArrayList b();

    void throwUncaughtException(@Nullable String str);
}
