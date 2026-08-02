package com.yandex.passport.internal.report;

import com.yandex.passport.common.browser.BrowserUtil$SupportedBrowser;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.bouncer.model.ChallengeState;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.b64;
import defpackage.w511;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public final class a implements pd {
    public final /* synthetic */ int a;
    public final String b;

    public a(com.yandex.passport.internal.ui.bouncer.model.r1 r1Var) {
        String str;
        this.a = 9;
        if (r1Var instanceof com.yandex.passport.internal.ui.bouncer.model.k1) {
            str = "Cancelled";
        } else if (r1Var instanceof com.yandex.passport.internal.ui.bouncer.model.n1) {
            str = "Forbidden";
        } else if (r1Var instanceof com.yandex.passport.internal.ui.bouncer.model.p1) {
            str = CA20Status.STATUS_REQUEST_DESCRIPTION_P;
        } else if (r1Var instanceof com.yandex.passport.internal.ui.bouncer.model.l1) {
            StringBuilder sb = new StringBuilder("Error(");
            com.yandex.passport.internal.ui.bouncer.model.l1 l1Var = (com.yandex.passport.internal.ui.bouncer.model.l1) r1Var;
            sb.append(l1Var.a);
            sb.append(Extension.FIX_SPACE);
            str = b64.p(sb, l1Var.b, ')');
        } else if (r1Var instanceof com.yandex.passport.internal.ui.bouncer.model.m1) {
            str = "Exception";
        } else if (r1Var instanceof com.yandex.passport.internal.ui.bouncer.model.q1) {
            str = "Success";
        } else {
            if (!(r1Var instanceof com.yandex.passport.internal.ui.bouncer.model.o1)) {
                w511.b();
                throw null;
            }
            str = "OpenUrl";
        }
        this.b = str;
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
                return "action";
            case 1:
                return CommonUrlParts.APP_ID;
            case 2:
                return ClidProvider.APPLICATION;
            case 3:
                return "attempt_number";
            case 4:
                return "badges";
            case 5:
                return "backend_base_url";
            case 6:
                return "biometric_session_id";
            case 7:
                return "challenge_state";
            case 8:
                return "bouncer_parameters";
            case 9:
                return TarifficatorScenarioActivity.RESULT_KEY;
            case 10:
                return ClidProvider.STATE;
            case 11:
                return "brand";
            case 12:
                return "browser";
            case 13:
                return "cache_install_id";
            case 14:
                return "can_go_back";
            case 15:
                return ClidProvider.STATE;
            case 16:
                return AuthSdkActivity.RESPONSE_TYPE_CODE;
            case 17:
                return "consumer";
            case 18:
                return "count";
            case 19:
                return "current_install_id";
            case 20:
                return MetaDataField.DEVICE_ID_FIELD;
            case 21:
                return "count";
            case 22:
                return "method";
            case 23:
                return "param";
            case 24:
                return "param_value";
            case 25:
                return "error_message";
            case 26:
                return "error";
            case 27:
                return "binding_result";
            case 28:
                return "esia_error";
            default:
                return "esia_session_id";
        }
    }

    @Override // com.yandex.passport.internal.report.pd
    public final String getValue() {
        int i = this.a;
        return this.b;
    }

    public a(com.yandex.passport.internal.usecase.c0 c0Var) {
        String str;
        this.a = 15;
        if (c0Var instanceof com.yandex.passport.internal.usecase.z) {
            str = "denied";
        } else if (c0Var instanceof com.yandex.passport.internal.usecase.a0) {
            str = "needed:" + ((Object) com.yandex.passport.common.url.b.l(((com.yandex.passport.internal.usecase.a0) c0Var).a));
        } else {
            if (!c0Var.equals(com.yandex.passport.internal.usecase.b0.a)) {
                w511.b();
                throw null;
            }
            str = "passed";
        }
        this.b = str;
    }

    public a(com.yandex.passport.internal.ui.bouncer.model.c2 c2Var) {
        this.a = 10;
        this.b = com.yandex.passport.internal.properties.u.u(c2Var);
    }

    public /* synthetic */ a(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
    }

    public a(com.yandex.passport.internal.ui.bouncer.model.g1 g1Var) {
        String s;
        this.a = 8;
        this.b = (g1Var == null || (s = com.yandex.passport.internal.properties.u.s(g1Var)) == null) ? "null" : s;
    }

    public a(ChallengeState challengeState) {
        String str;
        this.a = 7;
        int i = e.a[challengeState.ordinal()];
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i == 2) {
            str = "REQUIRED";
        } else if (i == 3) {
            str = "PASSED";
        } else if (i == 4) {
            str = "DENIED";
        } else if (i == 5) {
            str = "NOT_NEEDED";
        } else {
            w511.b();
            throw null;
        }
        this.b = str;
    }

    public a(boolean z) {
        this.a = 14;
        this.b = String.valueOf(z);
    }

    public a(BrowserUtil$SupportedBrowser browserUtil$SupportedBrowser) {
        this.a = 12;
        this.b = browserUtil$SupportedBrowser.getPackageName();
    }

    public a(ArrayList arrayList) {
        this.a = 4;
        this.b = qd.a(arrayList);
    }

    public a(String str, int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = String.valueOf(str);
                break;
            case 25:
                this.b = String.valueOf(str);
                break;
            default:
                this.b = String.valueOf(str);
                break;
        }
    }

    public a(int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 16:
                this.b = String.valueOf(i);
                break;
            case 18:
                this.b = String.valueOf(i);
                break;
            case 21:
                this.b = String.valueOf(i);
                break;
            default:
                this.b = String.valueOf(i);
                break;
        }
    }
}
