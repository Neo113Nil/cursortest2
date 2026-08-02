package xsna;

import com.vk.api.sdk.utils.log.Logger;

/* compiled from: LogLevelRequestTag.kt */
/* loaded from: classes.dex */
public final class k000 {
    public final Logger.LogLevel a;

    public k000(Logger.LogLevel logLevel) {
        this.a = logLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k000) && this.a == ((k000) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LogLevelRequestTag(level=" + this.a + ")";
    }
}
