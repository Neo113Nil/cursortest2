package xsna;

import xsna.ds60;
import xsna.ln50;

/* compiled from: PostsFromNotificationsMviTask.kt */
/* loaded from: classes4.dex */
public final class fwc0 implements hwc0, sn50<ds60.e> {
    public final ds60.e b;

    public fwc0(ds60.e eVar) {
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
