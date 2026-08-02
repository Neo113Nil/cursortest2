package com.yandex.passport.internal.methods.performer.error;

import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportAutoLoginImpossibleException;
import com.yandex.passport.api.exception.PassportDeviceValidationException;
import com.yandex.passport.api.exception.PassportException;
import com.yandex.passport.api.exception.PassportIOException;
import com.yandex.passport.api.exception.PassportInvalidTrackIdException;
import com.yandex.passport.api.exception.PassportPollingException;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.data.exceptions.BackendErrorException;
import com.yandex.passport.data.exceptions.DeviceValidationException;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.data.exceptions.InvalidTrackException;
import com.yandex.passport.data.exceptions.TokenResponseException;
import com.yandex.passport.internal.core.accounts.FailedToAddAccountException;
import com.yandex.passport.internal.link_auth.PollingException;
import java.io.IOException;
import kotlinx.serialization.SerializationException;
import org.json.JSONException;

/* loaded from: classes8.dex */
public final class a {
    public static Throwable a(a aVar, Throwable th, String str, Exception exc, PassportException passportException, PassportIOException passportIOException, PassportException passportException2, int i) {
        if ((i & 2) != 0) {
            str = "-1";
        }
        if ((i & 4) != 0) {
            exc = new PassportIOException(th);
        }
        if ((i & 8) != 0) {
            passportException = new PassportRuntimeUnknownException(th);
        }
        Throwable th2 = passportIOException;
        if ((i & 16) != 0) {
            th2 = new PassportAccountNotAuthorizedException();
        }
        Throwable th3 = passportException2;
        if ((i & 32) != 0) {
            th3 = new PassportIOException(th);
        }
        aVar.getClass();
        return th instanceof InvalidTrackException ? new PassportInvalidTrackIdException(str) : th instanceof FailedToAddAccountException ? new PassportRuntimeUnknownException(th) : th instanceof PassportAutoLoginImpossibleException ? new PassportAutoLoginImpossibleException(String.valueOf(th.getMessage())) : th instanceof PollingException ? new PassportPollingException(((PollingException) th).getType()) : ((th instanceof IOException) || (th instanceof JSONException) || (th instanceof SerializationException)) ? new PassportIOException(th) : th instanceof BackendErrorException ? exc : th instanceof TokenResponseException ? passportException : th instanceof InvalidTokenException ? th2 : th instanceof FailedResponseException ? th3 : th instanceof DeviceValidationException ? new PassportDeviceValidationException() : th;
    }
}
