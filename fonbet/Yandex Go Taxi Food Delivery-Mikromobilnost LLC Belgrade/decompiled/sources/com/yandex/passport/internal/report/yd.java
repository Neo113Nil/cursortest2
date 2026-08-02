package com.yandex.passport.internal.report;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.report.reporters.WebCardReporter$Source2Fa;
import com.yandex.passport.internal.upgrader.UpgradeStatusRequestSource;
import com.yandex.passport.internal.upgrader.UpgradeStatusRequestType;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.ljo;
import defpackage.tcc;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Iterator;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public final class yd implements pd {
    public final /* synthetic */ int a;
    public final String b;

    public yd(ArrayList arrayList) {
        this.a = 16;
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
                return "source_2fa";
            case 1:
                return "speed";
            case 2:
                return "sso_announcing_required";
            case 3:
                return ACSPConstants.STATUS;
            case 4:
                return "storage_name";
            case 5:
                return "subtype";
            case 6:
                return "success";
            case 7:
                return "support_webauthn";
            case 8:
                return "throwable";
            case 9:
                return "tib_host";
            case 10:
                return ClidProvider.STATE;
            case 11:
                return "track_id_hash";
            case 12:
                return "track_id";
            case 13:
                return "trigger";
            case 14:
                return "type_crypt";
            case 15:
                return "type";
            case 16:
                return "uid_list";
            case 17:
                return "uid";
            case 18:
                return "source";
            case 19:
                return "type";
            case 20:
                return "backend_url_path";
            case 21:
                return "url";
            case 22:
                return "user_id_logged_in";
            case 23:
                return "was_transferred_token";
            default:
                return TarifficatorScenarioActivity.RESULT_KEY;
        }
    }

    @Override // com.yandex.passport.internal.report.pd
    public final String getValue() {
        int i = this.a;
        return this.b;
    }

    public /* synthetic */ yd(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
    }

    public yd(Uid uid) {
        this.a = 17;
        StringBuilder sb = new StringBuilder();
        sb.append(uid.getEnvironment().getInteger());
        sb.append(':');
        sb.append(uid.getValue());
        this.b = sb.toString();
    }

    public yd(UpgradeStatusRequestType upgradeStatusRequestType) {
        String str;
        this.a = 19;
        int i = be.a[upgradeStatusRequestType.ordinal()];
        if (i == 1) {
            str = "cached";
        } else if (i == 2) {
            str = "actual";
        } else if (i == 3) {
            str = "relevance_check";
        } else {
            w511.b();
            throw null;
        }
        this.b = str;
    }

    public yd(UpgradeStatusRequestSource upgradeStatusRequestSource) {
        String str;
        this.a = 18;
        int i = ae.a[upgradeStatusRequestSource.ordinal()];
        if (i == 1) {
            str = "regular";
        } else if (i == 2) {
            str = "relevance";
        } else if (i == 3) {
            str = "request";
        } else {
            w511.b();
            throw null;
        }
        this.b = str;
    }

    public yd(Throwable th) {
        this.a = 8;
        this.b = ljo.b(th);
    }

    public yd(com.yandex.passport.internal.ui.sloth.webcard.q0 q0Var) {
        this.a = 24;
        this.b = q0Var.toString();
    }

    public yd(long j) {
        this.a = 1;
        this.b = String.valueOf(j);
    }

    public yd(WebCardReporter$Source2Fa webCardReporter$Source2Fa) {
        String str;
        this.a = 0;
        int i = xd.a[webCardReporter$Source2Fa.ordinal()];
        if (i == 1) {
            str = "data push";
        } else if (i == 2) {
            str = "notification push";
        } else {
            w511.b();
            throw null;
        }
        this.b = str;
    }

    public yd(boolean z, int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = String.valueOf(z);
                break;
            case 7:
                this.b = String.valueOf(z);
                break;
            case 22:
                this.b = String.valueOf(z);
                break;
            case 23:
                this.b = String.valueOf(z);
                break;
            default:
                this.b = String.valueOf(z);
                break;
        }
    }

    public yd(String str, int i) {
        this.a = i;
        switch (i) {
            case 11:
                this.b = str != null ? qd.b(str) : "null";
                break;
            case 12:
                this.b = str != null ? qd.b(str) : "null";
                break;
            case 21:
                this.b = str.toString();
                break;
            default:
                this.b = String.valueOf(str);
                break;
        }
    }
}
