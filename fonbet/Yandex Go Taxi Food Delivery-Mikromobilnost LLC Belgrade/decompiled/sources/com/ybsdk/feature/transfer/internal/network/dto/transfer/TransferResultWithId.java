package com.ybsdk.feature.transfer.internal.network.dto.transfer;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupWidgetDto;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001!BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResultWithId;", "", "transferId", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResultWithId$Status;", Constants.KEY_MESSAGE, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "widgets", "", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResultWithId$Status;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTransferId", "()Ljava/lang/String;", "getStatus", "()Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResultWithId$Status;", "getMessage", "getDescription", "getWidgets", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferResultWithId {
    private final String description;
    private final String message;
    private final Status status;
    private final String transferId;
    private final List<AutoTopupWidgetDto> widgets;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResultWithId$Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "PROCESSING", "FAILED", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status SUCCESS = new Status("SUCCESS", 0);
        public static final Status PROCESSING = new Status("PROCESSING", 1);
        public static final Status FAILED = new Status("FAILED", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, PROCESSING, FAILED};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Status(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public TransferResultWithId(@Json(name = "transfer_id") String str, @Json(name = "status") Status status, @Json(name = "message") String str2, @Json(name = "description") String str3, @Json(name = "widgets") List<AutoTopupWidgetDto> list) {
        this.transferId = str;
        this.status = status;
        this.message = str2;
        this.description = str3;
        this.widgets = list;
    }

    public static /* synthetic */ TransferResultWithId copy$default(TransferResultWithId transferResultWithId, String str, Status status, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferResultWithId.transferId;
        }
        if ((i & 2) != 0) {
            status = transferResultWithId.status;
        }
        if ((i & 4) != 0) {
            str2 = transferResultWithId.message;
        }
        if ((i & 8) != 0) {
            str3 = transferResultWithId.description;
        }
        if ((i & 16) != 0) {
            list = transferResultWithId.widgets;
        }
        List list2 = list;
        String str4 = str2;
        return transferResultWithId.copy(str, status, str4, str3, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component2, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<AutoTopupWidgetDto> component5() {
        return this.widgets;
    }

    public final TransferResultWithId copy(@Json(name = "transfer_id") String transferId, @Json(name = "status") Status status, @Json(name = "message") String message, @Json(name = "description") String description, @Json(name = "widgets") List<AutoTopupWidgetDto> widgets) {
        return new TransferResultWithId(transferId, status, message, description, widgets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferResultWithId)) {
            return false;
        }
        TransferResultWithId transferResultWithId = (TransferResultWithId) other;
        return jl40.l(this.transferId, transferResultWithId.transferId) && this.status == transferResultWithId.status && jl40.l(this.message, transferResultWithId.message) && jl40.l(this.description, transferResultWithId.description) && jl40.l(this.widgets, transferResultWithId.widgets);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public final List<AutoTopupWidgetDto> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b((this.status.hashCode() + (this.transferId.hashCode() * 31)) * 31, 31, this.message), 31, this.description);
        List<AutoTopupWidgetDto> list = this.widgets;
        return b + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        String str = this.transferId;
        Status status = this.status;
        String str2 = this.message;
        String str3 = this.description;
        List<AutoTopupWidgetDto> list = this.widgets;
        StringBuilder sb = new StringBuilder("TransferResultWithId(transferId=");
        sb.append(str);
        sb.append(", status=");
        sb.append(status);
        sb.append(", message=");
        g8e.D(sb, str2, ", description=", str3, ", widgets=");
        return ly3.s(sb, list, Extension.C_BRAKE);
    }
}
