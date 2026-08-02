package xsna;

import xsna.r6p;

/* compiled from: EduRolesStorageImpl.kt */
/* loaded from: classes2.dex */
public final class w6p implements v6p {
    public final r6p a;

    public w6p(tgl0 tgl0Var) {
        r6p r6pVar = new r6p(tgl0Var);
        this.a = r6pVar;
        int i = tgl0Var.a().getInt("edu_roles_storage_version", 0);
        while (i < r6pVar.c) {
            i++;
            tgl0Var.a().putInt("edu_roles_storage_version", i);
        }
    }

    @Override // xsna.v6p
    public final boolean a(long j) {
        r6p r6pVar = this.a;
        e0w b = r6pVar.b.b();
        String str = r6pVar.a.a;
        StringBuilder sb = new StringBuilder();
        sb.append(r6p.a.USER_ID.getKey());
        sb.append(" = ?");
        return b.f(str, sb.toString(), new Long[]{Long.valueOf(j)}) > 0;
    }
}
