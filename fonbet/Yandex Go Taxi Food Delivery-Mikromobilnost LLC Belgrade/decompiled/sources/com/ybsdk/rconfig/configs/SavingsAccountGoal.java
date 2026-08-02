package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/rconfig/configs/SavingsAccountGoal;", "", "", "amountMax", "yearFromNowMax", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/ybsdk/rconfig/configs/SavingsAccountGoal;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getAmountMax", "getYearFromNowMax", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SavingsAccountGoal {

    @Json(name = "amount_max")
    private final int amountMax;

    @Json(name = "year_from_now_max")
    private final int yearFromNowMax;

    public SavingsAccountGoal(int i, int i2) {
        this.amountMax = i;
        this.yearFromNowMax = i2;
    }

    public static /* synthetic */ SavingsAccountGoal copy$default(SavingsAccountGoal savingsAccountGoal, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = savingsAccountGoal.amountMax;
        }
        if ((i3 & 2) != 0) {
            i2 = savingsAccountGoal.yearFromNowMax;
        }
        return savingsAccountGoal.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAmountMax() {
        return this.amountMax;
    }

    /* renamed from: component2, reason: from getter */
    public final int getYearFromNowMax() {
        return this.yearFromNowMax;
    }

    public final SavingsAccountGoal copy(int amountMax, int yearFromNowMax) {
        return new SavingsAccountGoal(amountMax, yearFromNowMax);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsAccountGoal)) {
            return false;
        }
        SavingsAccountGoal savingsAccountGoal = (SavingsAccountGoal) other;
        return this.amountMax == savingsAccountGoal.amountMax && this.yearFromNowMax == savingsAccountGoal.yearFromNowMax;
    }

    public final int getAmountMax() {
        return this.amountMax;
    }

    public final int getYearFromNowMax() {
        return this.yearFromNowMax;
    }

    public int hashCode() {
        return Integer.hashCode(this.yearFromNowMax) + (Integer.hashCode(this.amountMax) * 31);
    }

    public String toString() {
        return b64.d(this.amountMax, this.yearFromNowMax, "SavingsAccountGoal(amountMax=", ", yearFromNowMax=", Extension.C_BRAKE);
    }
}
