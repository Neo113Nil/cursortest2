package ru.mail.libverify.api;

import java.util.List;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.verify.core.utils.Gsonable;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class a implements Gsonable {
    private final List<ru.mail.libverify.n.k> items;
    private final VerificationApi.AccountCheckResult status;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<ru.mail.libverify.n.k> list) {
        this(list, null, 2, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.items, aVar.items) && this.status == aVar.status;
    }

    public final int hashCode() {
        List<ru.mail.libverify.n.k> list = this.items;
        return this.status.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "";
    }

    public a(List<ru.mail.libverify.n.k> list, VerificationApi.AccountCheckResult accountCheckResult) {
        this.items = list;
        this.status = accountCheckResult;
    }

    public /* synthetic */ a(List list, VerificationApi.AccountCheckResult accountCheckResult, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? VerificationApi.AccountCheckResult.OK : accountCheckResult);
    }

    public a(VerificationApi.AccountCheckResult accountCheckResult) {
        this(null, accountCheckResult);
    }

    public a() {
        this(null, VerificationApi.AccountCheckResult.OK);
    }
}
