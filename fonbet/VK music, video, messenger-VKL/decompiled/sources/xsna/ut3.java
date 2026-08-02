package xsna;

import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ut3 implements ua0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ dvv0 c;

    public /* synthetic */ ut3(dvv0 dvv0Var, int i) {
        this.b = i;
        this.c = dvv0Var;
    }

    @Override // xsna.ua0
    public final void onActivityResult(Object obj) {
        switch (this.b) {
            case 0:
                ((yt3) this.c).f((Set) obj);
                break;
            default:
                ((bst) this.c).f((Set) obj);
                break;
        }
    }
}
