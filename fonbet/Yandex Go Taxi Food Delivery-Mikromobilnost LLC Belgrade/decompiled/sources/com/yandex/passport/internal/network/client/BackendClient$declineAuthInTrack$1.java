package com.yandex.passport.internal.network.client;

import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.kvj0;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class BackendClient$declineAuthInTrack$1 extends FunctionReferenceImpl implements tls {
    public BackendClient$declineAuthInTrack$1(Object obj) {
        super(1, obj, com.yandex.passport.internal.network.a.class, "parseMultistepMagicLinkInvalidateResponse", "parseMultistepMagicLinkInvalidateResponse(Lokhttp3/Response;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((com.yandex.passport.internal.network.a) this.receiver).getClass();
        JSONObject jSONObject = new JSONObject(com.yandex.passport.internal.network.a.c((kvj0) obj));
        String string = jSONObject.getString(ACSPConstants.STATUS);
        if (WriteBlocks.OK.equals(string)) {
            return zy11.a;
        }
        String d = com.yandex.passport.internal.network.a.d(jSONObject);
        if (d != null) {
            com.yandex.passport.internal.network.a.i(d);
        }
        ArrayList e = com.yandex.passport.internal.network.a.e(jSONObject);
        if (e == null || e.size() <= 0) {
            throw new FailedResponseException(string);
        }
        throw new FailedResponseException((String) e.get(0));
    }
}
