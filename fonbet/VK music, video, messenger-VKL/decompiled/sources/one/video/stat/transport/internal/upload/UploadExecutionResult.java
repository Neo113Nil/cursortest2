package one.video.stat.transport.internal.upload;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UploadExecutionResult.kt */
/* loaded from: classes8.dex */
public final class UploadExecutionResult {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UploadExecutionResult[] $VALUES;
    public static final UploadExecutionResult INVOCATION_ERROR;
    public static final UploadExecutionResult NETWORK_CONNECTION_ERROR;
    public static final UploadExecutionResult REQUEST_ERROR;
    public static final UploadExecutionResult SKIPPED;
    public static final UploadExecutionResult SUCCESS;
    public static final UploadExecutionResult UNKNOWN_ERROR;
    public static final UploadExecutionResult UPLOAD_FILE_IO_ERROR;
    public static final UploadExecutionResult UPLOAD_FILE_TOO_BIG;

    static {
        UploadExecutionResult uploadExecutionResult = new UploadExecutionResult("SUCCESS", 0);
        SUCCESS = uploadExecutionResult;
        UploadExecutionResult uploadExecutionResult2 = new UploadExecutionResult("UPLOAD_FILE_TOO_BIG", 1);
        UPLOAD_FILE_TOO_BIG = uploadExecutionResult2;
        UploadExecutionResult uploadExecutionResult3 = new UploadExecutionResult("UPLOAD_FILE_IO_ERROR", 2);
        UPLOAD_FILE_IO_ERROR = uploadExecutionResult3;
        UploadExecutionResult uploadExecutionResult4 = new UploadExecutionResult("REQUEST_ERROR", 3);
        REQUEST_ERROR = uploadExecutionResult4;
        UploadExecutionResult uploadExecutionResult5 = new UploadExecutionResult("INVOCATION_ERROR", 4);
        INVOCATION_ERROR = uploadExecutionResult5;
        UploadExecutionResult uploadExecutionResult6 = new UploadExecutionResult("NETWORK_CONNECTION_ERROR", 5);
        NETWORK_CONNECTION_ERROR = uploadExecutionResult6;
        UploadExecutionResult uploadExecutionResult7 = new UploadExecutionResult("UNKNOWN_ERROR", 6);
        UNKNOWN_ERROR = uploadExecutionResult7;
        UploadExecutionResult uploadExecutionResult8 = new UploadExecutionResult("SKIPPED", 7);
        SKIPPED = uploadExecutionResult8;
        UploadExecutionResult[] uploadExecutionResultArr = {uploadExecutionResult, uploadExecutionResult2, uploadExecutionResult3, uploadExecutionResult4, uploadExecutionResult5, uploadExecutionResult6, uploadExecutionResult7, uploadExecutionResult8};
        $VALUES = uploadExecutionResultArr;
        $ENTRIES = new asp(uploadExecutionResultArr);
    }

    public UploadExecutionResult() {
        throw null;
    }

    public static UploadExecutionResult valueOf(String str) {
        return (UploadExecutionResult) Enum.valueOf(UploadExecutionResult.class, str);
    }

    public static UploadExecutionResult[] values() {
        return (UploadExecutionResult[]) $VALUES.clone();
    }
}
