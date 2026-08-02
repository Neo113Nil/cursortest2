package defpackage;

import java.util.List;

/* loaded from: classes7.dex */
public final /* synthetic */ class odl implements j05, ov71 {
    public final /* synthetic */ List a;

    public /* synthetic */ odl(List list) {
        this.a = list;
    }

    @Override // defpackage.j05
    public List c() {
        return this.a;
    }

    @Override // defpackage.ov71
    public void invoke(Object obj) {
        ((ub81) obj).onCues(this.a);
    }
}
