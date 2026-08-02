package ru.mail.libverify.m;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import ru.mail.verify.core.utils.Gsonable;

/* loaded from: classes9.dex */
public final class f implements Gsonable {
    private a detail_status;
    private String eTag;
    private long lastModified;
    private b status;
    private long timeout;
    private long timestamp;
    private String url;

    public enum a {
        CALL_TEMPLATE_SENT,
        ERROR,
        UNKNOWN
    }

    public enum b {
        ENABLED,
        DISABLED,
        UNKNOWN
    }

    public final void a(long j) {
        this.lastModified = j;
    }

    public final void b(long j) {
        this.timestamp = j;
    }

    @NonNull
    public final b c() {
        if (this.status == null) {
            this.status = b.UNKNOWN;
        }
        return this.status;
    }

    public final long d() {
        return this.timeout;
    }

    public final long e() {
        return this.timestamp;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.timeout == fVar.timeout && Objects.equals(this.url, fVar.url) && this.status == fVar.status && this.detail_status == fVar.detail_status) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final String f() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.timeout) * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        b bVar = this.status;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        a aVar = this.detail_status;
        return hashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Nullable
    public final String a() {
        return this.eTag;
    }

    public final long b() {
        return this.lastModified;
    }

    public final void a(@Nullable String str) {
        if (str == null) {
            return;
        }
        this.eTag = str;
    }
}
