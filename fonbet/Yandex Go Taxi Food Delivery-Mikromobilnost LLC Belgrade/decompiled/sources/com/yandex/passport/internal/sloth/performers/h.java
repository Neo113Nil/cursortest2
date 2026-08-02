package com.yandex.passport.internal.sloth.performers;

import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.sloth.command.data.u;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.iqn;
import kotlin.coroutines.Continuation;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h implements s {
    public final com.yandex.passport.internal.properties.p a;

    public h(com.yandex.passport.internal.properties.p pVar) {
        this.a = pVar;
    }

    @Override // com.yandex.passport.sloth.command.s
    public final Object a(SlothParams slothParams, Object obj, Continuation continuation) {
        u uVar = (u) obj;
        com.yandex.passport.internal.properties.p pVar = this.a;
        if (pVar == null) {
            return new iqn(com.yandex.passport.sloth.command.u.b);
        }
        PassportEnvironmentImpl fromAccountName = PassportEnvironmentImpl.fromAccountName(uVar.a);
        com.yandex.passport.common.core.a aVar = Environment.Companion;
        int integer = fromAccountName.getInteger();
        aVar.getClass();
        String decryptedId = com.yandex.passport.internal.util.p.g(pVar, com.yandex.passport.common.core.a.a(integer)).getDecryptedId();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x_token_client_id", decryptedId);
        return new iqn(new com.yandex.passport.sloth.command.b(jSONObject));
    }
}
