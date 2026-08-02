package xsna;

import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: DevNullEventBuilder.kt */
/* loaded from: classes11.dex */
public class l5m extends cd6<qrk0> {
    public final gzs<Boolean> f;
    public SchemeStat$TypeDevNullItem g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l5m(irk0 irk0Var, mb3 mb3Var, int i) {
        super(false, irk0Var, 7);
        irk0Var = (i & 1) != 0 ? qsk0.a : irk0Var;
        mb3Var = (i & 2) != 0 ? null : mb3Var;
        this.f = mb3Var;
    }

    @Override // xsna.cd6
    public final boolean s() {
        gzs<Boolean> gzsVar = this.f;
        if (gzsVar != null) {
            return gzsVar.invoke().booleanValue();
        }
        return true;
    }

    @Override // xsna.cd6
    /* renamed from: u */
    public qrk0 p() {
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = (SchemeStat$TypeDevNullItem) r(this.g);
        if (schemeStat$TypeDevNullItem == null) {
            return null;
        }
        return new qrk0(schemeStat$TypeDevNullItem, this.d);
    }
}
