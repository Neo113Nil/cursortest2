package defpackage;

import core.flex.ui.OrientationAwareRecyclerView;
import flex.theme.ThemedColor;
import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes9.dex */
public final /* synthetic */ class b6q0 implements gvy0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b6q0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gvy0
    public final void onThemeChanged(String str) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((OrientationAwareRecyclerView) ((nfh) obj).b).invalidate();
                break;
            default:
                exy0 exy0Var = (exy0) obj;
                Iterator it = exy0Var.d.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    ((bxy0) pair.getSecond()).a(exy0Var.a((ThemedColor) pair.getFirst()));
                }
                break;
        }
    }
}
