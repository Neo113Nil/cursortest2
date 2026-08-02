package com.ybsdk.network.dto.changephone;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/network/dto/changephone/ChangePhoneSubmitCodeResponse;", "", ACSPConstants.STATUS, "Lcom/ybsdk/network/dto/changephone/ChangePhoneSubmitCodeResponse$SubmitStatus;", "attemptsLeft", "", "<init>", "(Lcom/ybsdk/network/dto/changephone/ChangePhoneSubmitCodeResponse$SubmitStatus;Ljava/lang/Integer;)V", "getStatus", "()Lcom/ybsdk/network/dto/changephone/ChangePhoneSubmitCodeResponse$SubmitStatus;", "getAttemptsLeft", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lcom/ybsdk/network/dto/changephone/ChangePhoneSubmitCodeResponse$SubmitStatus;Ljava/lang/Integer;)Lcom/ybsdk/network/dto/changephone/ChangePhoneSubmitCodeResponse;", "equals", "", "other", "hashCode", "toString", "", "SubmitStatus", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChangePhoneSubmitCodeResponse {
    private final Integer attemptsLeft;
    private final SubmitStatus status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/network/dto/changephone/ChangePhoneSubmitCodeResponse$SubmitStatus;", "", "<init>", "(Ljava/lang/String;I)V", "CODE_MATCHED", "CODE_MISMATCH", "STATUS_CONFLICT", "UNKNOWN", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class SubmitStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SubmitStatus[] $VALUES;
        public static final SubmitStatus CODE_MATCHED = new SubmitStatus("CODE_MATCHED", 0);
        public static final SubmitStatus CODE_MISMATCH = new SubmitStatus("CODE_MISMATCH", 1);
        public static final SubmitStatus STATUS_CONFLICT = new SubmitStatus("STATUS_CONFLICT", 2);
        public static final SubmitStatus UNKNOWN = new SubmitStatus("UNKNOWN", 3);

        private static final /* synthetic */ SubmitStatus[] $values() {
            return new SubmitStatus[]{CODE_MATCHED, CODE_MISMATCH, STATUS_CONFLICT, UNKNOWN};
        }

        static {
            SubmitStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private SubmitStatus(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static SubmitStatus valueOf(String str) {
            return (SubmitStatus) Enum.valueOf(SubmitStatus.class, str);
        }

        public static SubmitStatus[] values() {
            return (SubmitStatus[]) $VALUES.clone();
        }
    }

    public ChangePhoneSubmitCodeResponse(@Json(name = "submit_status") SubmitStatus submitStatus, @Json(name = "attempts_left") Integer num) {
        this.status = submitStatus;
        this.attemptsLeft = num;
    }

    public static /* synthetic */ ChangePhoneSubmitCodeResponse copy$default(ChangePhoneSubmitCodeResponse changePhoneSubmitCodeResponse, SubmitStatus submitStatus, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            submitStatus = changePhoneSubmitCodeResponse.status;
        }
        if ((i & 2) != 0) {
            num = changePhoneSubmitCodeResponse.attemptsLeft;
        }
        return changePhoneSubmitCodeResponse.copy(submitStatus, num);
    }

    /* renamed from: component1, reason: from getter */
    public final SubmitStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getAttemptsLeft() {
        return this.attemptsLeft;
    }

    public final ChangePhoneSubmitCodeResponse copy(@Json(name = "submit_status") SubmitStatus status, @Json(name = "attempts_left") Integer attemptsLeft) {
        return new ChangePhoneSubmitCodeResponse(status, attemptsLeft);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePhoneSubmitCodeResponse)) {
            return false;
        }
        ChangePhoneSubmitCodeResponse changePhoneSubmitCodeResponse = (ChangePhoneSubmitCodeResponse) other;
        return this.status == changePhoneSubmitCodeResponse.status && jl40.l(this.attemptsLeft, changePhoneSubmitCodeResponse.attemptsLeft);
    }

    public final Integer getAttemptsLeft() {
        return this.attemptsLeft;
    }

    public final SubmitStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        Integer num = this.attemptsLeft;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ChangePhoneSubmitCodeResponse(status=" + this.status + ", attemptsLeft=" + this.attemptsLeft + Extension.C_BRAKE;
    }
}
