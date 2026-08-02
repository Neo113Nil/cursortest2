package com.ybsdk.feature.passport.api;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/passport/api/PassportAuthorizationUrlError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "needsRelogin", "Z", "a", "()Z", "feature-passport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassportAuthorizationUrlError extends Exception {
    private final boolean needsRelogin;

    public PassportAuthorizationUrlError(Throwable th, boolean z) {
        super(th);
        this.needsRelogin = z;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getNeedsRelogin() {
        return this.needsRelogin;
    }
}
