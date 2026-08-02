package xsna;

import xsna.ds60;
import xsna.ln50;

/* compiled from: UserProfileWallMviTask.kt */
/* loaded from: classes4.dex */
public final class nwq0 implements lwq0, sn50<ds60.c> {
    public final ds60.c b;

    public nwq0(ds60.c cVar) {
        this.b = cVar;
    }

    @Override // xsna.hn50
    public final ln50<on50> d() {
        return ln50.a.a;
    }

    @Override // xsna.sn50
    public final ds60.c e() {
        return this.b;
    }

    @Override // xsna.hn50
    public final on50 getId() {
        return this.b.getId();
    }
}
