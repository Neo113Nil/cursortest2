package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/rconfig/configs/SavingsAccountLengthMax;", "", "", "length", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/ybsdk/rconfig/configs/SavingsAccountLengthMax;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getLength", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SavingsAccountLengthMax {

    @Json(name = "length")
    private final int length;

    public SavingsAccountLengthMax(int i) {
        this.length = i;
    }

    public static /* synthetic */ SavingsAccountLengthMax copy$default(SavingsAccountLengthMax savingsAccountLengthMax, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = savingsAccountLengthMax.length;
        }
        return savingsAccountLengthMax.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    public final SavingsAccountLengthMax copy(int length) {
        return new SavingsAccountLengthMax(length);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SavingsAccountLengthMax) && this.length == ((SavingsAccountLengthMax) other).length;
    }

    public final int getLength() {
        return this.length;
    }

    public int hashCode() {
        return Integer.hashCode(this.length);
    }

    public String toString() {
        return oyr.j(this.length, "SavingsAccountLengthMax(length=", Extension.C_BRAKE);
    }
}
