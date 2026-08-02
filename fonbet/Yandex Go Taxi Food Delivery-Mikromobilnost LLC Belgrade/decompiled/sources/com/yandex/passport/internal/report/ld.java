package com.yandex.passport.internal.report;

import com.yandex.passport.common.core.Uid;
import defpackage.evu0;

/* loaded from: classes15.dex */
public final class ld implements pd {
    public final /* synthetic */ int a;
    public final String b;
    public final boolean c;

    public ld(Uid uid) {
        String valueOf;
        this.a = 1;
        if (uid != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(uid.getEnvironment().getInteger());
            sb.append(':');
            sb.append(uid.getValue());
            valueOf = sb.toString();
        } else {
            valueOf = String.valueOf(uid);
        }
        this.b = valueOf;
        this.c = uid != null;
    }

    @Override // com.yandex.passport.internal.report.pd
    public final boolean a() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // com.yandex.passport.internal.report.pd
    public final String getName() {
        switch (this.a) {
            case 0:
                return "location_id";
            case 1:
                return "muid";
            case 2:
                return "member_uid";
            default:
                return "throwable-message";
        }
    }

    @Override // com.yandex.passport.internal.report.pd
    public final String getValue() {
        int i = this.a;
        return this.b;
    }

    public ld(Throwable th) {
        String message;
        String message2;
        this.a = 3;
        this.b = (th == null || (message2 = th.getMessage()) == null) ? "" : message2;
        this.c = (th == null || (message = th.getMessage()) == null) ? false : !evu0.J(message);
    }

    public ld(Long l, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = String.valueOf(l);
                this.c = true;
                break;
            default:
                this.b = String.valueOf(l);
                this.c = l != null;
                break;
        }
    }
}
