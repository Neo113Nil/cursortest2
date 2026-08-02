package com.yandex.passport.internal.report;

import androidx.core.provider.FontsContractCompat$Columns;
import com.yandex.passport.api.PushPlatform;
import com.yandex.passport.common.core.Uid;
import defpackage.tcc;
import defpackage.w511;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class md implements pd {
    public final /* synthetic */ int a;
    public final String b;

    public md(String str, int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = String.valueOf(str);
                break;
            case 6:
                this.b = String.valueOf(str);
                break;
            case 7:
                this.b = str == null ? "" : str;
                break;
            case 9:
                this.b = str == null ? "" : str;
                break;
            case 10:
                this.b = String.valueOf(str);
                break;
            case 19:
                this.b = str.toString();
                break;
            case 20:
                this.b = String.valueOf(str);
                break;
            case 21:
                this.b = str == null ? "null" : str;
                break;
            default:
                this.b = str == null ? "" : str;
                break;
        }
    }

    @Override // com.yandex.passport.internal.report.pd
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // com.yandex.passport.internal.report.pd
    public final String getName() {
        switch (this.a) {
            case 0:
                return "members_to_logout";
            case 1:
                return "method";
            case 2:
                return "minutes";
            case 3:
                return "new_state";
            case 4:
                return "notification_message";
            case 5:
                return "old_state";
            case 6:
                return "place";
            case 7:
                return "push_id";
            case 8:
                return "push_platform";
            case 9:
                return "push_platform";
            case 10:
                return "push_service";
            case 11:
                return "pushes_enabled_on_device";
            case 12:
                return CRLReasonCodeExtension.REASON;
            case 13:
                return "recipient_package_names";
            case 14:
                return "request_code";
            case 15:
                return "request_id";
            case 16:
                return FontsContractCompat$Columns.RESULT_CODE;
            case 17:
                return "scope";
            case 18:
                return "sender";
            case 19:
                return "service_id";
            case 20:
                return Constants.KEY_SERVICE;
            case 21:
                return "session_hash";
            case 22:
                return "should_revoke_token";
            case 23:
                return "sid";
            case 24:
                return "size";
            case 25:
                return "flow";
            case 26:
                return "social_application_value";
            case 27:
                return "social_consumer";
            case 28:
                return "provider";
            default:
                return "social_scopes";
        }
    }

    @Override // com.yandex.passport.internal.report.pd
    public final String getValue() {
        int i = this.a;
        return this.b;
    }

    public md(ArrayList arrayList) {
        this.a = 0;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Uid uid = (Uid) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(uid.getEnvironment().getInteger());
            sb.append(':');
            sb.append(uid.getValue());
            arrayList2.add(sb.toString());
        }
        this.b = qd.a(arrayList2);
    }

    public md(int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 14:
                this.b = String.valueOf(i);
                break;
            case 16:
                this.b = String.valueOf(i);
                break;
            case 24:
                this.b = String.valueOf(i);
                break;
            default:
                this.b = String.valueOf(i);
                break;
        }
    }

    public /* synthetic */ md(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
    }

    public md(boolean z, int i) {
        this.a = i;
        switch (i) {
            case 22:
                this.b = String.valueOf(z);
                break;
            default:
                this.b = String.valueOf(z);
                break;
        }
    }

    public md(PushPlatform pushPlatform) {
        String str;
        this.a = 8;
        int i = rd.a[pushPlatform.ordinal()];
        if (i == 1) {
            str = "fcm";
        } else if (i == 2) {
            str = CoreConstants.Transport.HMS;
        } else if (i == 3) {
            str = CoreConstants.Transport.RUSTORE;
        } else {
            w511.b();
            throw null;
        }
        this.b = str;
    }

    public md(List list) {
        this.a = 13;
        this.b = list.toString();
    }
}
