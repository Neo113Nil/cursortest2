package defpackage;

import ru.yandex.taxi.communications.stories.domain.a;

/* loaded from: classes6.dex */
public final class npc extends h55 {
    public final /* synthetic */ int D;
    public final a E;
    public final sls F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ npc(a aVar, sls slsVar, int i) {
        super(null);
        this.D = i;
        this.E = aVar;
        this.F = slsVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        switch (this.D) {
            case 0:
                bb0 bb0Var = new bb0(this, 22);
                A(this.E, (npu0) obj, bb0Var);
                break;
            default:
                mo30 mo30Var = new mo30(2, this);
                A(this.E, (npu0) obj, mo30Var);
                break;
        }
    }
}
