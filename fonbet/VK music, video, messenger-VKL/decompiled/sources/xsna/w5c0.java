package xsna;

import xsna.ds60;
import xsna.ln50;

/* compiled from: PostMviTask.kt */
/* loaded from: classes4.dex */
public final class w5c0 implements t5c0, sn50<ds60.d> {
    public final ds60.d b;

    public w5c0(ds60.d dVar) {
        this.b = dVar;
    }

    @Override // xsna.hn50
    public final ln50<on50> d() {
        return ln50.a.a;
    }

    @Override // xsna.sn50
    public final ds60.d e() {
        return this.b;
    }

    @Override // xsna.hn50
    public final on50 getId() {
        return this.b.getId();
    }
}
