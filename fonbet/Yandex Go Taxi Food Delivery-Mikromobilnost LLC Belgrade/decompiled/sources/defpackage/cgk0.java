package defpackage;

import com.yandex.go.slot.dto.SlotDividerDto$Card;
import com.yandex.go.slot.dto.SlotDividerDto$CardBottom;
import com.yandex.go.slot.dto.SlotDividerDto$CardTop;
import com.yandex.go.slot.dto.SlotDividerDto$GroupTitle;
import com.yandex.go.slot.dto.SlotDividerDto$Line;
import com.yandex.go.slot.dto.SlotDividerDto$LineSlot;
import com.yandex.go.slot.dto.SlotDividerDto$SpacerVertical;
import com.yandex.go.slot.dto.SlotDividerDto$Unknown;
import com.yandex.go.slot.dto.d0;

/* loaded from: classes14.dex */
public final class cgk0 {
    public final pdc a;

    public cgk0(pdc pdcVar) {
        this.a = pdcVar;
    }

    public final kdc a(int i, d0 d0Var) {
        String b = d0Var.getB();
        return ((ufu) this.a).a(new bdc(i), b);
    }

    public final zjk0 b(d0 d0Var) {
        String a = d0Var.getA();
        if (a.length() <= 0) {
            a = null;
        }
        if (a != null) {
            if (d0Var instanceof SlotDividerDto$Line) {
                return new fkk0(a(xng0.line, d0Var), a);
            }
            if (d0Var instanceof SlotDividerDto$LineSlot) {
                return new gkk0(a(xng0.line, d0Var), a);
            }
            if (d0Var instanceof SlotDividerDto$Card) {
                return new fdk0(a(xng0.cardDivider, d0Var), a);
            }
            if (d0Var instanceof SlotDividerDto$CardTop) {
                return new hdk0(a(xng0.cardDivider, d0Var), a);
            }
            if (d0Var instanceof SlotDividerDto$CardBottom) {
                return new gdk0(a(xng0.cardDivider, d0Var), a);
            }
            if (d0Var instanceof SlotDividerDto$GroupTitle) {
                return new fjk0(a(xng0.bgMinor, d0Var), a, ((SlotDividerDto$GroupTitle) d0Var).c);
            }
            if (d0Var instanceof SlotDividerDto$SpacerVertical) {
                return new onk0(a, ((SlotDividerDto$SpacerVertical) d0Var).c);
            }
            if (!(d0Var instanceof SlotDividerDto$Unknown)) {
                w511.b();
                return null;
            }
        }
        return null;
    }
}
