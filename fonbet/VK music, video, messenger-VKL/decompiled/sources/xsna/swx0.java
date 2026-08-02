package xsna;

import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase_Impl;

/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: classes.dex */
public final class swx0 implements owx0 {
    public final WorkDatabase_Impl a;
    public final pwx0 b;
    public final qwx0 c;
    public final rwx0 d;

    public swx0(@NonNull WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new pwx0(workDatabase_Impl);
        this.c = new qwx0(workDatabase_Impl);
        this.d = new rwx0(workDatabase_Impl);
    }

    @Override // xsna.owx0
    public final void a(nwx0 nwx0Var) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.j(nwx0Var);
            workDatabase_Impl.w();
        } finally {
            workDatabase_Impl.q();
        }
    }

    @Override // xsna.owx0
    public final void b() {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        rwx0 rwx0Var = this.d;
        zin0 a = rwx0Var.a();
        try {
            workDatabase_Impl.c();
            try {
                a.executeUpdateDelete();
                workDatabase_Impl.w();
            } finally {
                workDatabase_Impl.q();
            }
        } finally {
            rwx0Var.d(a);
        }
    }

    @Override // xsna.owx0
    public final void delete(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        qwx0 qwx0Var = this.c;
        zin0 a = qwx0Var.a();
        a.bindString(1, str);
        try {
            workDatabase_Impl.c();
            try {
                a.executeUpdateDelete();
                workDatabase_Impl.w();
            } finally {
                workDatabase_Impl.q();
            }
        } finally {
            qwx0Var.d(a);
        }
    }
}
