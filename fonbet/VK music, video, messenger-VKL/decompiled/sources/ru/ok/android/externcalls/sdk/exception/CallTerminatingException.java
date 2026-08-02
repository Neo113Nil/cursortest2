package ru.ok.android.externcalls.sdk.exception;

import java.util.Locale;
import ru.ok.android.annotation.CallInternalApi;
import xsna.zcl;

/* compiled from: CallTerminatingException.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class CallTerminatingException extends Throwable {
    private final Throwable cause;
    private final Integer code;
    private final Domain domain;
    private final String message;
    private final SubDomain subDomain;

    /* compiled from: CallTerminatingException.kt */
    public static final class Builder {
        private final Throwable cause;
        private Integer code;
        private final Domain domain;
        private final String message;
        private SubDomain subDomain;

        public Builder(Domain domain, Throwable th, String str) {
            this.domain = domain;
            this.cause = th;
            this.message = str;
        }

        public final CallTerminatingException build() {
            return new CallTerminatingException(this.domain, this.message, this.subDomain, this.code, this.cause, null);
        }

        public final Throwable getCause() {
            return this.cause;
        }

        public final Domain getDomain() {
            return this.domain;
        }

        public final String getMessage() {
            return this.message;
        }

        public final Builder setCode(int i) {
            this.code = Integer.valueOf(i);
            return this;
        }

        public final Builder setSubDomain(SubDomain subDomain) {
            this.subDomain = subDomain;
            return this;
        }

        public Builder(Domain domain, Throwable th) {
            this(domain, th, th.getMessage());
        }

        public Builder(Domain domain, String str) {
            this(domain, null, str);
        }
    }

    public /* synthetic */ CallTerminatingException(Domain domain, String str, SubDomain subDomain, Integer num, Throwable th, zcl zclVar) {
        this(domain, str, subDomain, num, th);
    }

    private final StringBuilder appendSection(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(':');
        return sb;
    }

    public final String asString() {
        StringBuilder sb = new StringBuilder();
        appendSection(sb, this.domain.name().toLowerCase(Locale.ROOT));
        SubDomain subDomain = this.subDomain;
        if (subDomain != null) {
            appendSection(sb, subDomain.asString());
        }
        Integer num = this.code;
        if (num != null) {
            appendSection(sb, Integer.valueOf(num.intValue()));
        }
        String message = getMessage();
        if (message == null) {
            message = String.valueOf(getCause());
        }
        sb.append(message);
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private CallTerminatingException(Domain domain, String str, SubDomain subDomain, Integer num, Throwable th) {
        super(str, th);
        this.domain = domain;
        this.message = str;
        this.subDomain = subDomain;
        this.code = num;
        this.cause = th;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CallTerminatingException(Domain domain, String str, SubDomain subDomain, Integer num, Throwable th, int i, zcl zclVar) {
        this(domain, str, subDomain, r6, r7);
        Throwable th2;
        Integer num2;
        subDomain = (i & 4) != 0 ? null : subDomain;
        if ((i & 8) != 0) {
            th2 = th;
            num2 = null;
        } else {
            th2 = th;
            num2 = num;
        }
    }
}
