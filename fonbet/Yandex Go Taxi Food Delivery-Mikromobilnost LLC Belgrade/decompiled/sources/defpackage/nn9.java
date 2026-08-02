package defpackage;

import com.yandex.go.chargers.attention.presentation.ChargersAttentionView;
import com.yandex.go.chargers.attention.presentation.b;

/* loaded from: classes12.dex */
public final class nn9 implements cn9 {
    public final /* synthetic */ b a;

    public nn9(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        in9 in9Var = (in9) obj;
        boolean z = in9Var instanceof gn9;
        b bVar = this.a;
        if (z) {
            gn9 gn9Var = (gn9) in9Var;
            ChargersAttentionView chargersAttentionView = bVar.b;
            if (chargersAttentionView == null) {
                return;
            }
            chargersAttentionView.render(new kn9(gn9Var.a, gn9Var.c, gn9Var.f, gn9Var.b), new u08(14, bVar, gn9Var));
            return;
        }
        if (!(in9Var instanceof hn9)) {
            w511.b();
            return;
        }
        ChargersAttentionView chargersAttentionView2 = bVar.b;
        if (chargersAttentionView2 != null) {
            chargersAttentionView2.hideAttention();
        }
    }
}
