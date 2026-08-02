package defpackage;

import com.ybsdk.feature.transfer.version2.api.TransferSkeletonType;
import java.util.Locale;
import kotlin.Result;

/* loaded from: classes3.dex */
public final class bt01 {
    public static TransferSkeletonType a(String str) {
        Object failure;
        try {
            failure = TransferSkeletonType.valueOf(str.toUpperCase(Locale.ROOT));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (TransferSkeletonType) failure;
    }
}
