package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import java.io.IOException;

/* loaded from: classes8.dex */
public class SendingDataTaskHelper {
    private final RequestBodyEncrypter a;
    private final Compressor b;
    private final TimeProvider c;
    private final RequestDataHolder d;
    private final ResponseDataHolder e;
    private final NetworkResponseHandler f;

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f.handle(this.e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.d.applySendTime(this.c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(@NonNull byte[] bArr) {
        byte[] encrypt;
        try {
            byte[] compress = this.b.compress(bArr);
            if (compress != null && (encrypt = this.a.encrypt(compress)) != null) {
                this.d.setPostData(encrypt);
                return true;
            }
        } catch (IOException unused) {
        }
        return false;
    }

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull TimeProvider timeProvider, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.a = requestBodyEncrypter;
        this.b = compressor;
        this.c = timeProvider;
        this.d = requestDataHolder;
        this.e = responseDataHolder;
        this.f = networkResponseHandler;
    }
}
