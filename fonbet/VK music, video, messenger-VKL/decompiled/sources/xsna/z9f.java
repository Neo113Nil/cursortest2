package xsna;

import com.vk.core.tips.Tooltip;
import xsna.j40;

/* compiled from: ClipsTooltipsController.kt */
/* loaded from: classes16.dex */
public final class z9f implements Tooltip.c {
    public final /* synthetic */ baf b;

    public z9f(baf bafVar) {
        this.b = bafVar;
    }

    @Override // com.vk.core.tips.Tooltip.c
    public final void c(int i) {
        baf bafVar = this.b;
        j40 j40Var = bafVar.a;
        j40Var.a = null;
        j40.a poll = j40Var.b.poll();
        if (poll != null) {
            j40Var.a = poll;
            poll.c.invoke();
        }
        bafVar.c = null;
    }
}
