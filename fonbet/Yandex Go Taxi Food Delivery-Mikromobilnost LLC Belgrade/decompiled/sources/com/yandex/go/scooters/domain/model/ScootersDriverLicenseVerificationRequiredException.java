package com.yandex.go.scooters.domain.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/yandex/go/scooters/domain/model/ScootersDriverLicenseVerificationRequiredException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "storyId", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "flow", "a", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDriverLicenseVerificationRequiredException extends RuntimeException {
    private final String flow;
    private final String storyId;

    public ScootersDriverLicenseVerificationRequiredException(String str, String str2) {
        this.storyId = str;
        this.flow = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getFlow() {
        return this.flow;
    }

    /* renamed from: b, reason: from getter */
    public final String getStoryId() {
        return this.storyId;
    }
}
