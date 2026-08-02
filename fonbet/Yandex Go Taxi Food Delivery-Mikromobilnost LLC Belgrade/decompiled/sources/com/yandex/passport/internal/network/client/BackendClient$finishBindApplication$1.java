package com.yandex.passport.internal.network.client;

import android.text.TextUtils;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.kvj0;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class BackendClient$finishBindApplication$1 extends FunctionReferenceImpl implements tls {
    public BackendClient$finishBindApplication$1(Object obj) {
        super(1, obj, com.yandex.passport.internal.network.a.class, "parseBindApplicationFinishResponse", "parseBindApplicationFinishResponse(Lokhttp3/Response;)Z", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((com.yandex.passport.internal.network.a) this.receiver).getClass();
        JSONObject b = com.yandex.passport.internal.network.a.b((kvj0) obj);
        com.yandex.passport.internal.network.a.h(b);
        String optString = b.optString(AuthSdkActivity.RESPONSE_TYPE_CODE);
        if (!TextUtils.isEmpty(optString)) {
            if (TextUtils.equals(optString, "AuthorizationRequiredError")) {
                throw new InvalidTokenException();
            }
            throw new FailedResponseException(optString);
        }
        String string = b.getString(ACSPConstants.STATUS);
        if (TextUtils.equals(string, WriteBlocks.OK)) {
            return Boolean.TRUE;
        }
        throw new FailedResponseException(string);
    }
}
