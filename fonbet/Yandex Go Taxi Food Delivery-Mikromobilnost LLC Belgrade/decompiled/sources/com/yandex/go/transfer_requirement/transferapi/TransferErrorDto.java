package com.yandex.go.transfer_requirement.transferapi;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.tc01;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/transfer_requirement/transferapi/TransferErrorDto;", "", "Companion", "TransferDraftErrorCode", "$serializer", "com/yandex/go/transfer_requirement/transferapi/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TransferErrorDto {
    public static final b Companion = new b();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tc01(6)), null};
    public final TransferDraftErrorCode a;
    public final String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/transfer_requirement/transferapi/TransferErrorDto$TransferDraftErrorCode;", "", "Companion", "com/yandex/go/transfer_requirement/transferapi/c", "UNKNOWN", "BAD_REQUEST", "TRANSFER_NOT_FOUND", "TRIP_NOT_FOUND", "EXPLICIT_GREETING", "NOT_RETRYABLE_ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TransferDraftErrorCode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TransferDraftErrorCode[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final TransferDraftErrorCode BAD_REQUEST;
        public static final c Companion;
        public static final TransferDraftErrorCode EXPLICIT_GREETING;
        public static final TransferDraftErrorCode NOT_RETRYABLE_ERROR;
        public static final TransferDraftErrorCode TRANSFER_NOT_FOUND;
        public static final TransferDraftErrorCode TRIP_NOT_FOUND;
        public static final TransferDraftErrorCode UNKNOWN;

        static {
            TransferDraftErrorCode transferDraftErrorCode = new TransferDraftErrorCode("UNKNOWN", 0);
            UNKNOWN = transferDraftErrorCode;
            TransferDraftErrorCode transferDraftErrorCode2 = new TransferDraftErrorCode("BAD_REQUEST", 1);
            BAD_REQUEST = transferDraftErrorCode2;
            TransferDraftErrorCode transferDraftErrorCode3 = new TransferDraftErrorCode("TRANSFER_NOT_FOUND", 2);
            TRANSFER_NOT_FOUND = transferDraftErrorCode3;
            TransferDraftErrorCode transferDraftErrorCode4 = new TransferDraftErrorCode("TRIP_NOT_FOUND", 3);
            TRIP_NOT_FOUND = transferDraftErrorCode4;
            TransferDraftErrorCode transferDraftErrorCode5 = new TransferDraftErrorCode("EXPLICIT_GREETING", 4);
            EXPLICIT_GREETING = transferDraftErrorCode5;
            TransferDraftErrorCode transferDraftErrorCode6 = new TransferDraftErrorCode("NOT_RETRYABLE_ERROR", 5);
            NOT_RETRYABLE_ERROR = transferDraftErrorCode6;
            TransferDraftErrorCode[] transferDraftErrorCodeArr = {transferDraftErrorCode, transferDraftErrorCode2, transferDraftErrorCode3, transferDraftErrorCode4, transferDraftErrorCode5, transferDraftErrorCode6};
            $VALUES = transferDraftErrorCodeArr;
            $ENTRIES = kotlin.enums.a.a(transferDraftErrorCodeArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tc01(7));
        }

        public static TransferDraftErrorCode valueOf(String str) {
            return (TransferDraftErrorCode) Enum.valueOf(TransferDraftErrorCode.class, str);
        }

        public static TransferDraftErrorCode[] values() {
            return (TransferDraftErrorCode[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TransferErrorDto(int i, TransferDraftErrorCode transferDraftErrorCode, String str) {
        this.a = (i & 1) == 0 ? TransferDraftErrorCode.UNKNOWN : transferDraftErrorCode;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferErrorDto)) {
            return false;
        }
        TransferErrorDto transferErrorDto = (TransferErrorDto) obj;
        return this.a == transferErrorDto.a && jl40.l(this.b, transferErrorDto.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransferErrorDto(code=" + this.a + ", message=" + this.b + Extension.C_BRAKE;
    }

    public TransferErrorDto() {
        this.a = TransferDraftErrorCode.UNKNOWN;
        this.b = "";
    }
}
