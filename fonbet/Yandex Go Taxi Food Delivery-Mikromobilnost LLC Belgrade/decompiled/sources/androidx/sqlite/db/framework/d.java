package androidx.sqlite.db.framework;

import android.content.Context;
import defpackage.hkw0;
import defpackage.i3y;
import defpackage.jkw0;
import defpackage.lkw0;
import defpackage.sls;
import defpackage.vfs;
import java.io.File;

/* loaded from: classes.dex */
public final class d implements lkw0 {
    public final Context a;
    public final String b;
    public final jkw0 c;
    public final boolean w;
    public final boolean x;
    public final i3y y = kotlin.a.a(new sls() { // from class: androidx.sqlite.db.framework.a
        @Override // defpackage.sls
        public final Object invoke() {
            FrameworkSQLiteOpenHelper$OpenHelper frameworkSQLiteOpenHelper$OpenHelper;
            d dVar = d.this;
            jkw0 jkw0Var = dVar.c;
            String str = dVar.b;
            if (str == null || !dVar.w) {
                frameworkSQLiteOpenHelper$OpenHelper = new FrameworkSQLiteOpenHelper$OpenHelper(dVar.a, dVar.b, new vfs(), jkw0Var, dVar.x);
            } else {
                frameworkSQLiteOpenHelper$OpenHelper = new FrameworkSQLiteOpenHelper$OpenHelper(dVar.a, new File(dVar.a.getNoBackupFilesDir(), str).getAbsolutePath(), new vfs(), jkw0Var, dVar.x);
            }
            frameworkSQLiteOpenHelper$OpenHelper.setWriteAheadLoggingEnabled(dVar.z);
            return frameworkSQLiteOpenHelper$OpenHelper;
        }
    });
    public boolean z;

    public d(Context context, String str, jkw0 jkw0Var, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = jkw0Var;
        this.w = z;
        this.x = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        i3y i3yVar = this.y;
        if (i3yVar.isInitialized()) {
            ((FrameworkSQLiteOpenHelper$OpenHelper) i3yVar.getValue()).close();
        }
    }

    @Override // defpackage.lkw0
    public final String getDatabaseName() {
        return this.b;
    }

    @Override // defpackage.lkw0
    public final hkw0 getReadableDatabase() {
        return ((FrameworkSQLiteOpenHelper$OpenHelper) this.y.getValue()).getSupportDatabase(false);
    }

    @Override // defpackage.lkw0
    public final hkw0 getWritableDatabase() {
        return ((FrameworkSQLiteOpenHelper$OpenHelper) this.y.getValue()).getSupportDatabase(true);
    }

    @Override // defpackage.lkw0
    public final void setWriteAheadLoggingEnabled(boolean z) {
        i3y i3yVar = this.y;
        if (i3yVar.isInitialized()) {
            ((FrameworkSQLiteOpenHelper$OpenHelper) i3yVar.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.z = z;
    }
}
