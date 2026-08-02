package io.requery.android.database;

import java.util.ArrayList;
import xsna.j5g;
import xsna.t33;

/* compiled from: ConnectionPoolBusyException.kt */
/* loaded from: classes8.dex */
public final class ConnectionPoolBusyException extends IllegalStateException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ConnectionPoolBusyException(String str, Thread thread, PrimaryConnectionPoolBusyHolder primaryConnectionPoolBusyHolder, ArrayList<String> arrayList) {
        super(r9.toString(), primaryConnectionPoolBusyHolder != null ? primaryConnectionPoolBusyHolder.initCause$libsqlite_requery_release() : null);
        String str2;
        StringBuilder a = t33.a("DB pool: ", str, ", unable to grant a connection to ");
        a.append(thread.getName());
        if (arrayList.isEmpty()) {
            str2 = "";
        } else {
            str2 = "\nIn progress:\n" + j5g.g0(arrayList, "\n", null, null, 0, null, 62);
        }
        a.append(str2);
    }
}
