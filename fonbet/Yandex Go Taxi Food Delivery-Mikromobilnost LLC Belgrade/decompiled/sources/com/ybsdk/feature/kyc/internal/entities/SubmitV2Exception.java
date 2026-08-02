package com.ybsdk.feature.kyc.internal.entities;

import defpackage.jl40;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/entities/SubmitV2Exception;", "", "", Constants.KEY_MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "originalException", "Ljava/lang/Throwable;", "a", "()Ljava/lang/Throwable;", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubmitV2Exception extends Throwable {
    private final String message;
    private final Throwable originalException;

    public SubmitV2Exception(String str, Throwable th) {
        super(str);
        this.message = str;
        this.originalException = th;
    }

    /* renamed from: a, reason: from getter */
    public final Throwable getOriginalException() {
        return this.originalException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitV2Exception)) {
            return false;
        }
        SubmitV2Exception submitV2Exception = (SubmitV2Exception) obj;
        return jl40.l(this.message, submitV2Exception.message) && jl40.l(this.originalException, submitV2Exception.originalException);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        String str = this.message;
        return this.originalException.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "SubmitV2Exception(message=" + this.message + ", originalException=" + this.originalException + Extension.C_BRAKE;
    }
}
