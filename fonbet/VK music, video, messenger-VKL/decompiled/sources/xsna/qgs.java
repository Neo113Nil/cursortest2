package xsna;

import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import xsna.tin0;

/* compiled from: FrameworkSQLiteOpenHelperFactory.android.kt */
/* loaded from: classes.dex */
public final class qgs implements tin0.c {
    @Override // xsna.tin0.c
    public final tin0 create(tin0.b bVar) {
        return new FrameworkSQLiteOpenHelper(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e);
    }
}
