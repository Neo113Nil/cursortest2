package com.yandex.passport.internal.network.client;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.data.exceptions.FailedResponseException;
import defpackage.kvj0;
import defpackage.oyr;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.HexString;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class BackendClient$getMasterTokenByMailishSocialToken$1 extends FunctionReferenceImpl implements tls {
    public static final BackendClient$getMasterTokenByMailishSocialToken$1 b = new BackendClient$getMasterTokenByMailishSocialToken$1(1, 0, com.yandex.passport.internal.network.a.class, "parseMasterTokenByMailishAuthResponse", "parseMasterTokenByMailishAuthResponse(Lokhttp3/Response;)Lcom/yandex/passport/common/account/MasterToken;");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        JSONObject b2 = com.yandex.passport.internal.network.a.b((kvj0) obj);
        JSONObject jSONObject = b2.getJSONObject(ACSPConstants.STATUS);
        if (jSONObject.getInt(ACSPConstants.STATUS) == 1) {
            return MasterToken.from(b2.getString("xtoken"));
        }
        throw new FailedResponseException(oyr.f(HexString.CHAR_SPACE, jSONObject.getString("phrase"), jSONObject.getString("trace")));
    }
}
