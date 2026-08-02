package com.yandex.passport.internal.report;

import com.yandex.passport.api.PassportAutoLoginMode;
import defpackage.w511;
import java.util.List;

/* loaded from: classes8.dex */
public final class c implements pd {
    public final /* synthetic */ int a;
    public final String b;

    public c(PassportAutoLoginMode passportAutoLoginMode) {
        String str;
        this.a = 1;
        int i = d.a[passportAutoLoginMode.ordinal()];
        if (i == 1) {
            str = "OneAccount";
        } else {
            if (i != 2) {
                w511.b();
                throw null;
            }
            str = "OneOrMoreAccounts";
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
                return "app_signature";
            case 1:
                return "passport_auto_login_mode";
            case 2:
                return "exit_reason_description";
            case 3:
                return "exit_reason";
            case 4:
                return "exit_timestamp_epoch_ms";
            case 5:
                return "push_permission";
            default:
                return "uids_disabled_autologin";
        }
    }

    @Override // com.yandex.passport.internal.report.pd
    public final String getValue() {
        int i = this.a;
        return this.b;
    }

    public c(boolean z) {
        this.a = 5;
        this.b = String.valueOf(z);
    }

    public /* synthetic */ c(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public c(List list) {
        this.a = 6;
        this.b = list.toString();
    }

    public c(long j) {
        this.a = 4;
        this.b = String.valueOf(j);
    }
}
