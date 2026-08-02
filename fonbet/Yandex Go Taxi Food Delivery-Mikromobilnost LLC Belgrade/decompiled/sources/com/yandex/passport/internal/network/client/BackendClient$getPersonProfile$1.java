package com.yandex.passport.internal.network.client;

import com.yandex.passport.api.PassportPersonProfile$PassportGender;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.internal.entities.PersonProfile;
import com.yandex.passport.internal.network.m;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.kvj0;
import defpackage.tls;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class BackendClient$getPersonProfile$1 extends FunctionReferenceImpl implements tls {
    public static final BackendClient$getPersonProfile$1 b = new BackendClient$getPersonProfile$1(1, 0, com.yandex.passport.internal.network.a.class, "parseGetPersonProfileResponse", "parseGetPersonProfileResponse(Lokhttp3/Response;)Lcom/yandex/passport/internal/entities/PersonProfile;");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        PassportPersonProfile$PassportGender passportPersonProfile$PassportGender;
        PassportPersonProfile$PassportGender passportPersonProfile$PassportGender2;
        JSONObject b2 = com.yandex.passport.internal.network.a.b((kvj0) obj);
        String d = com.yandex.passport.internal.network.a.d(b2);
        if (d != null) {
            com.yandex.passport.internal.network.a.i(d);
            throw new FailedResponseException(d);
        }
        String string = b2.getString(ACSPConstants.STATUS);
        if (!string.equals(WriteBlocks.OK)) {
            throw new FailedResponseException(string);
        }
        JSONObject jSONObject = b2.getJSONObject("account");
        String e = m.e("name", jSONObject.getJSONObject("display_name"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("person");
        String e2 = m.e("firstname", jSONObject2);
        String e3 = m.e("lastname", jSONObject2);
        String e4 = m.e("birthday", jSONObject2);
        String e5 = m.e("gender", jSONObject2);
        JSONObject optJSONObject = jSONObject.optJSONObject("display_names");
        if (optJSONObject == null) {
            arrayList = null;
        } else {
            Iterator<String> keys = optJSONObject.keys();
            ArrayList arrayList2 = new ArrayList();
            while (keys.hasNext()) {
                arrayList2.add(keys.next());
            }
            arrayList = arrayList2;
        }
        if (e5 == null) {
            passportPersonProfile$PassportGender2 = null;
        } else {
            PassportPersonProfile$PassportGender.Factory.getClass();
            PassportPersonProfile$PassportGender[] values = PassportPersonProfile$PassportGender.values();
            int length = values.length;
            int i = 0;
            loop0: while (true) {
                if (i >= length) {
                    passportPersonProfile$PassportGender = null;
                    break;
                }
                PassportPersonProfile$PassportGender passportPersonProfile$PassportGender3 = values[i];
                for (String str : passportPersonProfile$PassportGender3.getVariants()) {
                    if (e5.equals(str)) {
                        passportPersonProfile$PassportGender = passportPersonProfile$PassportGender3;
                        break loop0;
                    }
                }
                i++;
            }
            passportPersonProfile$PassportGender2 = passportPersonProfile$PassportGender;
        }
        return new PersonProfile(e, e2, e3, e4, passportPersonProfile$PassportGender2, arrayList);
    }
}
