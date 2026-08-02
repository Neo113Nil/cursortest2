package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.js51;
import defpackage.nnm;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 \u001d:\u0001\u001eB\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbMobileCommonAnimationsImpl;", "", "", "", "jsonValues", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/ybsdk/rconfig/configs/YbMobileCommonAnimationsImpl;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getJsonValues", "lostIncomeBarDurationMs", CA20Status.STATUS_USER_I, "getLostIncomeBarDurationMs", "lostIncomePenaltyBalanceDurationMs", "getLostIncomePenaltyBalanceDurationMs", "lostIncomePenaltyBalanceStepMs", "getLostIncomePenaltyBalanceStepMs", "Companion", "js51", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class YbMobileCommonAnimationsImpl {
    private static final js51 Companion = new js51();

    @Deprecated
    public static final String LOST_INCOME_BAR_DURATION_MS = "lost_income_bar_duration_ms";

    @Deprecated
    public static final String LOST_INCOME_PENALTY_BALANCE_DURATION_MS = "lost_income_penalty_balance_duration_ms";

    @Deprecated
    public static final String LOST_INCOME_PENALTY_BALANCE_STEP_MS = "lost_income_penalty_balance_step_ms";
    private final Map<String, Integer> jsonValues;

    @Json(name = LOST_INCOME_BAR_DURATION_MS)
    private final int lostIncomeBarDurationMs;

    @Json(name = LOST_INCOME_PENALTY_BALANCE_DURATION_MS)
    private final int lostIncomePenaltyBalanceDurationMs;

    @Json(name = LOST_INCOME_PENALTY_BALANCE_STEP_MS)
    private final int lostIncomePenaltyBalanceStepMs;

    public YbMobileCommonAnimationsImpl(Map<String, Integer> map) {
        this.jsonValues = map;
        Integer num = map.get(LOST_INCOME_BAR_DURATION_MS);
        int i = MSException.ERROR_NOT_ALL_ASSIGNED;
        this.lostIncomeBarDurationMs = num != null ? num.intValue() : 1300;
        Integer num2 = map.get(LOST_INCOME_PENALTY_BALANCE_DURATION_MS);
        this.lostIncomePenaltyBalanceDurationMs = num2 != null ? num2.intValue() : i;
        Integer num3 = map.get(LOST_INCOME_PENALTY_BALANCE_STEP_MS);
        this.lostIncomePenaltyBalanceStepMs = num3 != null ? num3.intValue() : 40;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ YbMobileCommonAnimationsImpl copy$default(YbMobileCommonAnimationsImpl ybMobileCommonAnimationsImpl, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = ybMobileCommonAnimationsImpl.jsonValues;
        }
        return ybMobileCommonAnimationsImpl.copy(map);
    }

    public final Map<String, Integer> component1() {
        return this.jsonValues;
    }

    public final YbMobileCommonAnimationsImpl copy(Map<String, Integer> jsonValues) {
        return new YbMobileCommonAnimationsImpl(jsonValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof YbMobileCommonAnimationsImpl) && jl40.l(this.jsonValues, ((YbMobileCommonAnimationsImpl) other).jsonValues);
    }

    public final Map<String, Integer> getJsonValues() {
        return this.jsonValues;
    }

    public int getLostIncomeBarDurationMs() {
        return this.lostIncomeBarDurationMs;
    }

    public int getLostIncomePenaltyBalanceDurationMs() {
        return this.lostIncomePenaltyBalanceDurationMs;
    }

    public int getLostIncomePenaltyBalanceStepMs() {
        return this.lostIncomePenaltyBalanceStepMs;
    }

    public int hashCode() {
        return this.jsonValues.hashCode();
    }

    public String toString() {
        return nnm.j("YbMobileCommonAnimationsImpl(jsonValues=", Extension.C_BRAKE, this.jsonValues);
    }
}
