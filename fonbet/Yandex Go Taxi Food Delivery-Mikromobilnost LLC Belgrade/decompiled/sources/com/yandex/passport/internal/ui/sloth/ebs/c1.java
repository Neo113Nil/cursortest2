package com.yandex.passport.internal.ui.sloth.ebs;

import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.data.exceptions.BackendErrorException;
import com.yandex.passport.data.exceptions.FailedResponseException;
import java.io.IOException;
import kotlinx.serialization.SerializationException;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class c1 {
    public static EbsReasonFailed a(Throwable th) {
        return th instanceof IOException ? EbsReasonFailed.IOEXCEPTION : th instanceof JSONException ? EbsReasonFailed.JSON_EXCEPTION : th instanceof SerializationException ? EbsReasonFailed.SERIALIZATION_EXCEPTION : th instanceof InvalidTokenException ? EbsReasonFailed.INVALID_TOKEN : th instanceof BackendErrorException ? EbsReasonFailed.BACKEND_ERROR_EXCEPTION : th instanceof FailedResponseException ? EbsReasonFailed.FAILED_RESPONSE_EXCEPTION : EbsReasonFailed.UNKNOWN;
    }
}
