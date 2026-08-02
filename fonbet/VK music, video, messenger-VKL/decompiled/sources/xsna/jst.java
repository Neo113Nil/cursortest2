package xsna;

import android.database.Cursor;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: GetLocalOutgoingMessageRequestsIdsCmd.kt */
/* loaded from: classes2.dex */
public final class jst extends le6<Set<? extends Long>> {
    @Override // xsna.le6
    public final Set<? extends Long> e(w2w w2wVar) {
        Cursor d = sn.c(w2wVar).b.b().d("SELECT dialog_id FROM messages WHERE dialog_id > 1900000000 AND dialog_id < 2000000000", null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(Long.valueOf(d.getLong(0)));
                        d.moveToNext();
                    }
                }
                Trace.endSection();
                return j5g.S0(arrayList);
            } finally {
                d.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        return jst.class.equals(obj != null ? obj.getClass() : null);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return -1102135219;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "GetLocalOutgoingMessageRequestsIdsCmd()";
    }
}
