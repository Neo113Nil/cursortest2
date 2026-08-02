package com.yandex.messaging.internal.net.onboarding;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/yandex/messaging/internal/net/onboarding/OnboardingPassedParams;", "", "", "value", "", "type", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/yandex/messaging/internal/net/onboarding/OnboardingPassedParams;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getValue", "Ljava/lang/String;", "getType", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OnboardingPassedParams {
    public static final int $stable = 0;
    private final String type;
    private final boolean value;

    public OnboardingPassedParams(@Json(name = "value") boolean z, @Json(name = "type") String str) {
        this.value = z;
        this.type = str;
    }

    public static /* synthetic */ OnboardingPassedParams copy$default(OnboardingPassedParams onboardingPassedParams, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = onboardingPassedParams.value;
        }
        if ((i & 2) != 0) {
            str = onboardingPassedParams.type;
        }
        return onboardingPassedParams.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final OnboardingPassedParams copy(@Json(name = "value") boolean value, @Json(name = "type") String type) {
        return new OnboardingPassedParams(value, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingPassedParams)) {
            return false;
        }
        OnboardingPassedParams onboardingPassedParams = (OnboardingPassedParams) other;
        return this.value == onboardingPassedParams.value && jl40.l(this.type, onboardingPassedParams.type);
    }

    public final String getType() {
        return this.type;
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.type.hashCode() + (Boolean.hashCode(this.value) * 31);
    }

    public String toString() {
        return xvz.m("OnboardingPassedParams(value=", this.value, ", type=", this.type, Extension.C_BRAKE);
    }
}
