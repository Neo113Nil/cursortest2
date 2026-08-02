package com.yandex.delivery.mapper.maper;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/yandex/delivery/mapper/maper/OperationIdResponseDto;", "", "operationId", "", "<init>", "(Ljava/lang/String;)V", "getOperationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "mapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OperationIdResponseDto {
    private final String operationId;

    public OperationIdResponseDto(@Json(name = "operation_id") String str) {
        this.operationId = str;
    }

    public static /* synthetic */ OperationIdResponseDto copy$default(OperationIdResponseDto operationIdResponseDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = operationIdResponseDto.operationId;
        }
        return operationIdResponseDto.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOperationId() {
        return this.operationId;
    }

    public final OperationIdResponseDto copy(@Json(name = "operation_id") String operationId) {
        return new OperationIdResponseDto(operationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OperationIdResponseDto) && jl40.l(this.operationId, ((OperationIdResponseDto) other).operationId);
    }

    public final String getOperationId() {
        return this.operationId;
    }

    public int hashCode() {
        return this.operationId.hashCode();
    }

    public String toString() {
        return oyr.p("OperationIdResponseDto(operationId=", this.operationId, Extension.C_BRAKE);
    }
}
