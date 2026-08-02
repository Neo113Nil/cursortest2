package defpackage;

import java.util.List;

/* loaded from: classes11.dex */
public final class g3b1 extends s591 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3b1(String str, int i) {
        super(str);
        this.c = i;
    }

    @Override // defpackage.s591
    public final r691 c(cr71 cr71Var, List list) {
        switch (this.c) {
            case 0:
                return r691.z5;
            case 1:
            case 2:
                return this;
            default:
                return new n591(Double.valueOf(0.0d));
        }
    }
}
