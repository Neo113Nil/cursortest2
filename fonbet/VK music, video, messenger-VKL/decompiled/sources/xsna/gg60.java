package xsna;

import xsna.ds60;
import xsna.ln50;

/* compiled from: NewsfeedCustomMviTask.kt */
/* loaded from: classes4.dex */
public final class gg60 implements lg60, sn50<ds60.e> {
    public final ds60.e b;

    public gg60(ds60.e eVar) {
        this.b = eVar;
    }

    @Override // xsna.hn50
    public final ln50<on50> d() {
        return ln50.a.a;
    }

    @Override // xsna.sn50
    public final ds60.e e() {
        return this.b;
    }

    @Override // xsna.hn50
    public final on50 getId() {
        return this.b.getId();
    }
}
