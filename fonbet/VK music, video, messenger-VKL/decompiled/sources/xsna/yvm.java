package xsna;

import com.vk.im.engine.internal.storage.delegates.dialogs.DialogTagsStorageManagerImpl;
import com.vk.im.engine.internal.storage.delegates.dialogs.DialogWeightDb;

/* compiled from: DialogsStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class yvm implements xvm, mtx0 {
    public final DialogTagsStorageManagerImpl b;
    public final com.vk.im.engine.internal.storage.delegates.dialogs.b c;
    public final hpm d;
    public final dnm e;
    public final pdm f;

    public yvm(tgl0 tgl0Var, kb0 kb0Var) {
        DialogWeightDb dialogWeightDb = new DialogWeightDb(tgl0Var);
        this.b = new DialogTagsStorageManagerImpl(tgl0Var);
        this.c = new com.vk.im.engine.internal.storage.delegates.dialogs.b(tgl0Var, dialogWeightDb, kb0Var);
        hpm hpmVar = new hpm(tgl0Var);
        this.d = hpmVar;
        this.e = new dnm(tgl0Var, dialogWeightDb);
        this.f = new pdm(tgl0Var, hpmVar, dialogWeightDb, new upj());
    }

    @Override // xsna.mtx0
    public final void Q() {
        this.c.Q();
        this.d.Q();
        this.f.Q();
    }

    @Override // xsna.xvm
    public final com.vk.im.engine.internal.storage.delegates.dialogs.b a() {
        return this.c;
    }

    @Override // xsna.xvm
    public final DialogTagsStorageManagerImpl b() {
        return this.b;
    }

    @Override // xsna.xvm
    public final pdm c() {
        return this.f;
    }

    @Override // xsna.xvm
    public final dnm d() {
        return this.e;
    }

    @Override // xsna.xvm
    public final hpm e() {
        return this.d;
    }
}
