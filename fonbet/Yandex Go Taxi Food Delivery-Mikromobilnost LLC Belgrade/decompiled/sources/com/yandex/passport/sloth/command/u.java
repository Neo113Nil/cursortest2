package com.yandex.passport.sloth.command;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final class u implements r {
    public static final u b = new u(0);
    public static final u c = new u(1);
    public final /* synthetic */ int a;

    public /* synthetic */ u(int i) {
        this.a = i;
    }

    @Override // com.yandex.passport.sloth.command.r
    public final String a() {
        switch (this.a) {
            case 0:
                return null;
            default:
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ACSPConstants.STATUS, WriteBlocks.OK);
                return jSONObject.toString();
        }
    }
}
