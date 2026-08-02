package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ae2 extends r8 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae2(List list, int i) {
        super(2, list);
        this.c = i;
    }

    @Override // defpackage.ie2
    public final i35 I() {
        switch (this.c) {
            case 0:
                return new lfc((List) this.b, 0);
            case 1:
                return new lfc((List) this.b, 1);
            case 2:
                return new qud0((List) this.b, 0);
            case 3:
                return new qud0((List) this.b, 1);
            case 4:
                return new thr0((List) this.b);
            default:
                return new hqy0((List) this.b);
        }
    }
}
