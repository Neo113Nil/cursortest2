package com.yandex.go.scooters.promocodes.domain.model;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/yandex/go/scooters/promocodes/domain/model/ScootersPromocodesException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "title", "Ljava/lang/String;", "a", "()Ljava/lang/String;", Constants.KEY_MESSAGE, "getMessage", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPromocodesException extends RuntimeException {
    private final String message;
    private final String title;

    public ScootersPromocodesException(String str, String str2) {
        this.title = str;
        this.message = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
