package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.keyboard.StickersView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WriteBarStickersHolder.kt */
/* loaded from: classes7.dex */
public final class x1y0 extends StickersView.c {
    public final /* synthetic */ y1y0 c;

    public x1y0(y1y0 y1y0Var) {
        this.c = y1y0Var;
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final ContextUser e() {
        return this.c.n;
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final k6n0 g() {
        return this.c.p;
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final List<UserId> h() {
        return new ArrayList(this.c.o);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final boolean i() {
        return his0.s(this.c.b.getInput());
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void n(int i) {
        StickersView.c cVar = this.c.j;
        if (cVar != null) {
            cVar.n(i);
        }
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void o(int i, String str, ContextUser contextUser) {
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new cqt(i), null, null, 3);
        y1y0 y1y0Var = this.c;
        io.reactivex.rxjava3.core.q m = hg1.m(y0, y1y0Var.a.getContext(), 0L, false, 62);
        epq0 epq0Var = new epq0(new u1y0(y1y0Var, contextUser, i), 11);
        int i2 = kwg0.a;
        y1y0Var.e.b(m.subscribe(epq0Var, new hwg0()));
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void p(StickerItem stickerItem, int i, String str) {
        y1y0 y1y0Var = this.c;
        if (y1y0Var.j != null) {
            y1y0Var.b.getInput().setText("");
            StickersView.c cVar = y1y0Var.j;
            if (cVar != null) {
                cVar.p(stickerItem, i, str);
            }
        }
    }
}
