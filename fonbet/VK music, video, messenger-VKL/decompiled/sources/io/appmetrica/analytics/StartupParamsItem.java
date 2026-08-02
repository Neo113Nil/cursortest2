package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import xsna.i5s;

/* loaded from: classes8.dex */
public final class StartupParamsItem {
    private final String a;
    private final StartupParamsItemStatus b;
    private final String c;

    public StartupParamsItem(@Nullable String str, @NonNull StartupParamsItemStatus startupParamsItemStatus, @Nullable String str2) {
        this.a = str;
        this.b = startupParamsItemStatus;
        this.c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StartupParamsItem.class == obj.getClass()) {
            StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
            if (Objects.equals(this.a, startupParamsItem.a) && this.b == startupParamsItem.b && Objects.equals(this.c, startupParamsItem.c)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String getErrorDetails() {
        return this.c;
    }

    @Nullable
    public String getId() {
        return this.a;
    }

    @NonNull
    public StartupParamsItemStatus getStatus() {
        return this.b;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("StartupParamsItem{id='");
        sb.append(this.a);
        sb.append("', status=");
        sb.append(this.b);
        sb.append(", errorDetails='");
        return i5s.a(sb, this.c, "'}");
    }
}
