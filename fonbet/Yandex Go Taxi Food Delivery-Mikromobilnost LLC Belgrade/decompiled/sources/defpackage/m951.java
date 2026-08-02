package defpackage;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class m951 implements u2s {
    public final t951 a;
    public final t2s b;
    public final ia51 c;

    static {
        hgz.o("WMFgUpdater");
    }

    public m951(WorkDatabase workDatabase, t2s t2sVar, t951 t951Var) {
        this.b = t2sVar;
        this.a = t951Var;
        this.c = workDatabase.X0();
    }
}
