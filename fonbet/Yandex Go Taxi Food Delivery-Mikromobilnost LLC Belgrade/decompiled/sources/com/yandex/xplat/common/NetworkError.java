package com.yandex.xplat.common;

import java.io.IOException;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/xplat/common/NetworkError;", "Lcom/yandex/xplat/common/YSError;", "NetworkErrorTransportFailure", "Lcom/yandex/xplat/common/NetworkError$NetworkErrorTransportFailure;", "xplat-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class NetworkError extends YSError {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/xplat/common/NetworkError$NetworkErrorTransportFailure;", "Lcom/yandex/xplat/common/NetworkError;", "Ljava/io/IOException;", CRLReasonCodeExtension.REASON, "Ljava/io/IOException;", "getReason", "()Ljava/io/IOException;", "xplat-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NetworkErrorTransportFailure extends NetworkError {
        private final IOException reason;

        public NetworkErrorTransportFailure(String str, IOException iOException) {
            super(str, null);
            this.reason = iOException;
        }
    }
}
