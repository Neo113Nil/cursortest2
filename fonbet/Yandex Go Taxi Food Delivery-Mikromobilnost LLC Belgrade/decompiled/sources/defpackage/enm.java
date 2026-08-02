package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class enm implements qrq0 {
    public final /* synthetic */ int a;
    public final qrq0 b;
    public final cms c;

    public /* synthetic */ enm(qrq0 qrq0Var, cms cmsVar, int i) {
        this.a = i;
        this.b = qrq0Var;
        this.c = cmsVar;
    }

    @Override // defpackage.qrq0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new dnm(this);
            case 1:
                return new dnm(this, (byte) 0);
            default:
                return new q2b0(this);
        }
    }
}
