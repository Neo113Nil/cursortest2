package com.yandex.passport.internal.network.client;

import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.kvj0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class BackendClient$updatePersonProfile$1 extends FunctionReferenceImpl implements tls {
    public static final BackendClient$updatePersonProfile$1 b = new BackendClient$updatePersonProfile$1(1, 0, com.yandex.passport.internal.network.a.class, "parseUpdatePersonProfileResponse", "parseUpdatePersonProfileResponse(Lokhttp3/Response;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        JSONObject b2 = com.yandex.passport.internal.network.a.b((kvj0) obj);
        String d = com.yandex.passport.internal.network.a.d(b2);
        if (d != null) {
            com.yandex.passport.internal.network.a.i(d);
            throw new FailedResponseException(d);
        }
        String string = b2.getString(ACSPConstants.STATUS);
        if (string.equals(WriteBlocks.OK)) {
            return zy11.a;
        }
        throw new FailedResponseException(string);
    }
}
