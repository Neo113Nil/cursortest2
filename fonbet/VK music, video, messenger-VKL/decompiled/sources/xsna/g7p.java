package xsna;

import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.b7p;

/* compiled from: EduScheduleStorageImpl.kt */
/* loaded from: classes2.dex */
public final class g7p implements f7p {
    public final b7p a;

    public g7p(tgl0 tgl0Var) {
        b7p b7pVar = new b7p(tgl0Var);
        this.a = b7pVar;
        int i = tgl0Var.a().getInt("edu_schedule_storage_version", 0);
        while (i < b7pVar.b) {
            i++;
            tgl0Var.a().putInt("edu_schedule_storage_version", i);
        }
    }

    @Override // xsna.f7p
    public final void a(final long j) {
        final b7p b7pVar = this.a;
        b7pVar.a.b().h(new izs() { // from class: xsna.a7p
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                long j2 = j;
                SQLiteStatement compileStatement = b7p.this.a.b().compileStatement("UPDATE edu_schedule SET " + b7p.a.PHASE.getKey() + " = ? WHERE " + b7p.a.USER_ID.getKey() + " = ?");
                try {
                    compileStatement.bindLong(1, 0L);
                    compileStatement.bindLong(2, j2);
                    int executeUpdateDelete = compileStatement.executeUpdateDelete();
                    compileStatement.close();
                    return Integer.valueOf(executeUpdateDelete);
                } finally {
                }
            }
        });
    }
}
